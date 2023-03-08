
package br.com.hdnit.lotus.domain.entity.access.dao.impl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.NoResultException;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.access.BlockedUser;
import br.com.hdnit.lotus.domain.entity.access.LoggedStatus;
import br.com.hdnit.lotus.domain.entity.access.LoginCount;
import br.com.hdnit.lotus.domain.entity.access.UserValidationException;
import br.com.hdnit.lotus.domain.entity.access.Usuario;
import br.com.hdnit.lotus.domain.entity.corporativo.Empresa;
import br.com.hdnit.lotus.foundation.util.BundleUtils;
import br.com.hdnit.lotus.foundation.util.MD5Utils;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class UsuarioDAOImpl extends AbstractGenericJPADAO<Usuario> {

    public UsuarioDAOImpl() {
        super();
    }

    public void createUser(Usuario Usuario) throws DataViolationException {

        try {
            super.saveOrUpdate(Usuario);
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

    public void deleteUser(Usuario Usuario) throws DataViolationException {
        try {
            super.delete(Usuario, Usuario.getId());
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> listAllUsers() throws DataViolationException {
        List<Usuario> ret = null;
        try {
            Query query = getSession().createQuery("SELECT Usuario FROM Usuario Usuario WHERE 1=1");
            ret = query.list();
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        return ret;
    }

    public void updateUser(Usuario Usuario) throws DataViolationException {
        try {

            super.saveOrUpdate(Usuario);
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

  

    public boolean existsEmail(String email) throws DataViolationException {
        boolean ret = false;

        try {
            startTransaction();
            Query query = getSession().createQuery("FROM Usuario Usuario WHERE Usuario.email = :email");
            query.setParameter("email", email);

            Usuario usuario = (Usuario) query.uniqueResult();
            if (usuario != null)
                ret = true;
            finishTransacton();

        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        return ret;
    }

    public boolean existsUserCPF(String cpf) throws DataViolationException {
        boolean ret = false;

        try {
            startTransaction();
            Query query = getSession().createQuery("FROM Usuario Usuario WHERE Usuario.cpf = :cpf");
            query.setParameter("cpf", cpf);

            query.uniqueResult();
            Usuario usuario = (Usuario) query.uniqueResult();
            if (usuario != null)
                ret = true;
            finishTransacton();

        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        return ret;
    }

    public Usuario existsUserValidatePassword(String login, String senha) throws UserValidationException,
                    DataViolationException {
        Usuario ret = null;
        boolean validate = false;
        try {
            startTransaction();
            Query query = getSession().createQuery(
                            "FROM Usuario Usuario join fetch Usuario.idEmpresa WHERE Usuario.email = :email");
            query.setParameter("email", login);
            ret = (Usuario) query.uniqueResult();

            if (ret == null) {
                throw new UserValidationException(BundleUtils.getMessage("login.usuario.nao.existe"));
            }
            validate = MD5Utils.validatePasswordHash(ret.getPasswordHash(), senha);

            if (!validate) {
                this.incrementTryNumber(ret);
                ret = null;
                throw new UserValidationException(BundleUtils.getMessage("login.authenticate.5"));
            } else if (ret.getAtivo() == 0) {
                throw new UserValidationException("Erro ao logar com o usuário! Usuário desativado");
            } else {
                this.clearTryNumber(ret);
                this.setLogged(ret, true);
            }

            finishTransacton();
        } catch (NoResultException e) {

            transactionFailed();
            ret = null;
        }

        return ret;
    }

    public Usuario existsUserValidateSessionKey(String login, String sessionKey) throws UserValidationException,
                    DataViolationException {
        Usuario ret = null;
        boolean validate = false;
        try {
            startTransaction();
            Query query = getSession().createQuery(
                            "FROM Usuario Usuario join fetch Usuario.idEmpresa WHERE Usuario.login = :login and Usuario.insertKey = :sessionKey");
            query.setParameter("login", login);
            query.setParameter("sessionKey", sessionKey);
            ret = (Usuario) query.uniqueResult();

            if (ret == null) {
                throw new UserValidationException(BundleUtils.getMessage("login.usuario.nao.existe"));
            }

            finishTransacton();
        } catch (NoResultException e) {

            transactionFailed();
            ret = null;
        }

        return ret;
    }

    public Usuario findById(Integer id) {
        Usuario ret = null;

        if (id != null) {
            try {
                startTransaction();
                Query query = getSession().createQuery("FROM Usuario Usuario WHERE Usuario.id = ?");
                query.setParameter(0, id);
                try {
                    ret = (Usuario) query.uniqueResult();
                    finishTransacton();
                } catch (NoResultException e) {
                    ret = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return ret;
    }

    @SuppressWarnings("unchecked")
    public Set<Usuario> findByName(String name) throws DataViolationException {
        Set<Usuario> ret = new HashSet<Usuario>();

        try {
            Query query = getSession().createQuery("SELECT Usuario FROM Usuario Usuario WHERE Usuario.name = ?");
            query.setParameter(0, name);
            ret.addAll(query.list());
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        return ret;
    }

    public Usuario findByEmail(String email) throws DataViolationException {
        Usuario ret = null;

        try {
            startTransaction();
            Criteria crit = getSession().createCriteria(Usuario.class);
            crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        
            crit.add(Restrictions.eq("email", email));

            ret = (Usuario) crit.uniqueResult();
            finishTransacton();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataViolationException(e);
        }
        finally {

        }
        return ret;
    }

    public Usuario findByEmail(String email, Integer idEmpresa) throws DataViolationException {
        Usuario ret = null;

        try {
            startTransaction();
            Criteria crit = getSession().createCriteria(Usuario.class);
            crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

            crit.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            crit.add(Restrictions.eq("idEmpresa.id", idEmpresa));

            crit.add(Restrictions.eq("email", email));

            ret = (Usuario) crit.uniqueResult();
            finishTransacton();
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataViolationException(e);
        }
        finally {

        }
        return ret;
    }

    public List<Usuario> findUsersByStatus(Integer idEmpresa, Integer status) {
        startTransaction();
        Criteria criteria = getSession().createCriteria(Usuario.class);

        criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
        criteria.add(Restrictions.eq("idEmpresa.id", idEmpresa));

        criteria.add(Restrictions.eq("ativo", status));
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<Usuario> result = criteria.list();
        finishTransacton();

        return result;
    }

    public List<Usuario> findByIdEmpresa(Integer id) {
        startTransaction();
        Criteria criteria = getSession().createCriteria(Usuario.class);

        criteria.createCriteria("departamento", "departamento", CriteriaSpecification.LEFT_JOIN);

        criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
        criteria.add(Restrictions.eq("idEmpresa.id", id));

        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<Usuario> result = criteria.list();
        finishTransacton();

        return result;
    }

    public void clearTryNumber(Usuario user) throws DataViolationException {
        try {
            LoginCount loginCount = getLoginCount(user);
            if (loginCount != null) {
                loginCount.setCount(0);
                getSession().merge(loginCount);
            }
        } catch (Exception e) {
            throw new DataViolationException(e);
        }

    }

    public Integer getTryNumber(Usuario user) throws DataViolationException {
        Integer ret = Integer.valueOf(0);
        try {
            LoginCount loginCount = getLoginCount(user);
            if (loginCount != null) {
                ret = loginCount.getCount();
            }
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        return ret;
    }

    private LoginCount getLoginCount(Usuario user) {
        Query query = getSession().createQuery("SELECT loginCount FROM LoginCount loginCount WHERE loginCount.user = :user");
        query.setParameter("user", user);
        LoginCount loginCount = null;
        try {
            loginCount = (LoginCount) query.uniqueResult();
        } catch (NoResultException e) {

        }
        return loginCount;
    }

    public void incrementTryNumber(Usuario user) throws DataViolationException {
        try {
            LoginCount loginCount = getLoginCount(user);
            if (loginCount == null) {
                loginCount = new LoginCount();
                loginCount.setUser(user);
                loginCount.setCount(0);
                getSession().persist(loginCount);
            }
            loginCount.setCount(loginCount.getCount() + 1);
            getSession().merge(loginCount);
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> listBlockedUsers() {

        Query query = getSession().createQuery("SELECT user FROM LoginCount loginCount WHERE loginCount.count >= 3 ");
        return query.list();
    }

    public void unblock(Usuario user) throws DataViolationException {
        this.clearTryNumber(user);
    }

    public void setLogged(Usuario user, boolean status) {
        try {

            LoggedStatus loggedStatus = getLoggedStatus(user);
            if (loggedStatus == null) {
                loggedStatus = new LoggedStatus();
                loggedStatus.setUser(user);
                loggedStatus.setLogged(Boolean.FALSE);

                MessageDigest md;
                try {
                    md = MessageDigest.getInstance("MD5");
                    Long time = System.currentTimeMillis();
                    String generatedHash = new BigInteger(1, md.digest(user.toString().getBytes())).add(
                                    new BigInteger(1, md.digest(time.toString().getBytes()))).toString(28);
                    loggedStatus.setSessionKey(generatedHash);
                    user.setSessionKey(loggedStatus.getSessionKey());
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }

                getSession().persist(loggedStatus);
            }
            loggedStatus.setLogged(status);
            // LoginCount loginCount = getLoginCount(user);
            getSession().merge(loggedStatus);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean removeLoginStatus(Usuario user, String sessionKey) {
        Boolean result = Boolean.FALSE;
        try {

            LoggedStatus loggedStatus = getLoggedStatus(user);
            LoginCount loginCount = getLoginCount(user);

            if (loginCount != null) {
                getSession().delete(loginCount);
            }
            if (loggedStatus != null && sessionKey == null) {
                getSession().delete(loggedStatus);
                result = Boolean.TRUE;
            } else {
                if (loggedStatus != null && loggedStatus.getSessionKey().trim().equals(sessionKey.trim())) {
                    getSession().delete(loggedStatus);
                    result = Boolean.TRUE;
                }
            }
            // entityManager.merge(loggedStatus);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public Boolean removeLoginStatus(Usuario user) {
        Boolean result = Boolean.FALSE;
        try {

            LoggedStatus loggedStatus = getLoggedStatus(user);
            LoginCount loginCount = getLoginCount(user);

            if (loginCount != null) {
                getSession().delete(loginCount);
            }
            if (loggedStatus != null) {
                getSession().delete(loggedStatus);
                result = Boolean.TRUE; 
            }
            // entityManager.merge(loggedStatus);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    
    public LoggedStatus getLoggedStatus(Usuario user) {
        Query query = getSession().createQuery(
                        "SELECT loggedStatus FROM LoggedStatus loggedStatus WHERE loggedStatus.user = :user");
        query.setParameter("user", user);
        LoggedStatus loggedStatus = null;
        try {
            loggedStatus = (LoggedStatus) query.uniqueResult();
        } catch (NoResultException e) {

        }
        return loggedStatus;
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> listLoggedUsers() {

        Query query = getSession().createQuery(
                        "SELECT user FROM LoggedStatus loggedStatus WHERE loggedStatus.logged = true ");
        return query.list();
    }

    public List<LoggedStatus> getAllLoggedStatus() {
        Query query = getSession().createQuery("SELECT loggedStatus FROM LoggedStatus loggedStatus");

        List<LoggedStatus> loggedStatus = null;
        try {
            loggedStatus = query.list();
        } catch (NoResultException e) {

        }
        return loggedStatus;
    }

    public Boolean logout(String email, String sessionKey) throws DataViolationException {
        Boolean result = Boolean.FALSE;
      //  Usuario user = this.findByEmail(email, );
       // if (user != null) {
        //    result = this.removeLoginStatus(user, sessionKey);
       // }
        return result;
    }

    public Boolean logout(String email) throws DataViolationException {
        Boolean result = Boolean.FALSE;
        Usuario user = this.findByEmail(email);
        if (user != null) {
            result = this.removeLoginStatus(user);
        }
        return result;
    }

    
   /* public void validateUserTimeOut(long currentTimeMillis, int sessionTimeOut) throws DataViolationException {
        // TODO Auto-generated method stub
        Date dataCorte = new Date(currentTimeMillis);
        List<LoggedStatus> result = this.getAllLoggedStatus();

        for (LoggedStatus item : result) {
            Date teste = item.getLastTime();
            if (teste != null) {
                if (diferencaEmMinutos(teste, dataCorte) >= sessionTimeOut) {
                    logout(item.getUser().getLogin(), item.getSessionKey());
                }
            } else {
                logout(item.getUser().getLogin(), item.getSessionKey());
            }
        }

    }
*/
    private double diferencaEmMinutos(Date dataInicial, Date dataFinal) {
        double result = 0;
        long diferenca = dataFinal.getTime() - dataInicial.getTime();
        double diferencaEmMinutos = (diferenca / 1000) / 60; // resultado ÃƒÂ© diferenÃƒÂ§a entre as datas em minutos
        result = diferencaEmMinutos; // transforma os segundos restantes em minutos

        return result;
    }

    public void incrementBlockedUser(Usuario user, Empresa empresa, Usuario usuarioInclusao) throws DataViolationException {
        try {
            BlockedUser loginCount = getBlockedUser(user);
            loginCount = createBlockedUser(user, empresa, usuarioInclusao, loginCount);
            addCountBlockedUser(loginCount);

        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

    private BlockedUser createBlockedUser(Usuario user, Empresa empresa, Usuario usuarioInclusao, BlockedUser loginCount) {
        if (loginCount == null) {
            loginCount = new BlockedUser();
            loginCount.setUser(user);
            loginCount.setCount(0);

            loginCount.validateEntity(usuarioInclusao, empresa, Boolean.TRUE);
            startTransaction();

            getSession().persist(loginCount);
            finishTransacton();

        }
        return loginCount;
    }

    private void addCountBlockedUser(BlockedUser loginCount) {
        loginCount.setCount(loginCount.getCount() + 1);

        startTransaction();
        getSession().merge(loginCount);
        finishTransacton();
    }

    public BlockedUser getBlockedUser(Usuario user) {
        startTransaction();
        Query query = getSession().createQuery(
                        "SELECT blockedUser FROM BlockedUser blockedUser WHERE blockedUser.user = :user and ativo=1");
        query.setParameter("user", user);
        BlockedUser loginCount = null;
        try {
            loginCount = (BlockedUser) query.uniqueResult();
        } catch (NoResultException e) {

        }
        finishTransacton();

        return loginCount;
    }

    public List<BlockedUser> listBlockedUserByEmpresa(Integer idEmpresa, Integer quantidade) {
        startTransaction();
        Criteria criteria = getSession().createCriteria(BlockedUser.class);

        criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
        criteria.add(Restrictions.eq("idEmpresa.id", idEmpresa));
        criteria.add(Restrictions.eq("ativo", 1));
        criteria.add(Restrictions.ge("count", quantidade));

        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<BlockedUser> result = criteria.list();
        finishTransacton();

        return result;
    }

    public Boolean removeBlockedUser(BlockedUser loggedStatus) throws DataViolationException {
        Boolean result = Boolean.FALSE;
        try {
            startTransaction();

            loggedStatus.setAtivo(0);
            getSession().merge(loggedStatus);
            result = Boolean.TRUE;
            finishTransacton();

        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        return result;
    }

}

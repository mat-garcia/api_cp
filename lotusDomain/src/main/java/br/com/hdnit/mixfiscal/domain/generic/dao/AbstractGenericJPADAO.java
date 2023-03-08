
package br.com.hdnit.mixfiscal.domain.generic.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import net.sf.ehcache.hibernate.HibernateUtil;

public abstract class AbstractGenericJPADAO<T> implements GenericDAO<T>, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected static Logger logger = Logger.getLogger(AbstractGenericJPADAO.class);

    private Class<T> clazz;

    @SuppressWarnings("unchecked")
    public AbstractGenericJPADAO() {
        this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void startTransaction() {
        if (!HibernateUtilIntegrador.getSessionFactory().getCurrentSession().getTransaction().isActive()) {
            getSession().beginTransaction();
        }
        getSession().clear();
    }

    public void finishTransacton() {

        if (HibernateUtilIntegrador.getSessionFactory().getCurrentSession().getTransaction().isActive()) {
        	HibernateUtilIntegrador.getSessionFactory().getCurrentSession().getTransaction().commit();
        }
         //HibernateUtil.getSessionFactory().getCurrentSession().clear();

    }

    public void transactionFailed() {

        if (HibernateUtilIntegrador.getSessionFactory().getCurrentSession().getTransaction().isActive()) {
            getSession().getTransaction().rollback();
        }

    }

    public List<T> saveOrUpdate(List<T> listaObjetos) throws PersistenceException {
        List<T> listaObjetosSalvo = new ArrayList<T>();
        try {
            startTransaction();
            for (T objeto : listaObjetos) {
                objeto = (T) getSession().merge(clazz);

                getSession().saveOrUpdate(objeto);
                // getSession().flush();
                listaObjetosSalvo.add(objeto);
            }
            finishTransacton();
        } catch (Exception e) {
            transactionFailed();
            throw new PersistenceException(e);
        }
        finally {

        }
        return listaObjetosSalvo;
    }

    public void saveOrUpdate(T clazz) throws PersistenceException {
        try {
            startTransaction();

            getSession().saveOrUpdate(clazz);

            finishTransacton();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause().printStackTrace();
            transactionFailed();
            throw new PersistenceException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public void delete(T clazz, Integer id) throws PersistenceException {
        try {
            startTransaction();
            // clazz = (T) em.find(clazz.getClass(), id);
            //clazz = (T) getSession().merge(clazz);
            /*
            getSession().
            PublicSupport.executeUpdate("delete PublicSupport c where c.id = :publicSupportId", [publicSupportId:publicSupport.id])
            */

           String hql = "delete from " +  clazz.getClass().getName() + " where id= :id";
           
           getSession().createQuery(hql).setInteger("id", id).executeUpdate();
            
         //   getSession().d .delete(clazz);
            finishTransacton();
        } catch (Exception e) {
            transactionFailed();
            throw new PersistenceException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public void deleteByEmpresa(T clazz, Integer id) throws PersistenceException {
        try {
            startTransaction();

           String hql = "delete from " +  clazz.getClass().getName() + " where id_empresa= :id";
           
           getSession().createQuery(hql).setInteger("id", id).executeUpdate();
    
            finishTransacton();
        } catch (Exception e) {
            transactionFailed();
            throw new PersistenceException(e);
        }
    }

    
    @SuppressWarnings("unchecked")
    public void deleteObject(T clazz) throws PersistenceException {
        try {
            startTransaction();
            getSession().delete(clazz);
            finishTransacton();
        } catch (Exception e) {
            transactionFailed();
            throw new PersistenceException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public T findByObject(final T objeto) throws PersistenceException {
        T result = null;
        try {
            startTransaction();
            final Criteria c = getSession().createCriteria(objeto.getClass());
            Example ex = Example.create(objeto);
            ex.excludeZeroes();
            c.add(ex);
            result = (T) c.uniqueResult();
            finishTransacton();
        } catch (Exception e) {
            transactionFailed();
            throw new PersistenceException(e);
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<T> findObjectList(T objeto) throws PersistenceException {
        List<T> result = null;
        try {
            startTransaction();
            final Criteria c = getSession().createCriteria(objeto.getClass());
            Example ex = Example.create(objeto);
            ex.enableLike(MatchMode.START).ignoreCase();
            ex.excludeZeroes();
            c.add(Example.create(objeto).enableLike(MatchMode.START).ignoreCase());
            result = c.list();
            finishTransacton();
        } catch (Exception e) {
            transactionFailed();
            throw new PersistenceException(e);
        }
        return result;

    }

    public T findById(Integer id) throws PersistenceException {
        try {
            startTransaction();
            T entity = (T) getSession().get(this.clazz, id);
            finishTransacton();
            return entity;
        } catch (Exception e) {
            transactionFailed();
            throw new PersistenceException(e);
        }
    }

    public T attachClean(T clazz) throws PersistenceException {
        try {
            getSession().lock(clazz, LockMode.NONE);
            return null;
        } catch (Exception e) {
            throw new PersistenceException(e);
        }
    }

    public Session getSession() {
        Session session = HibernateUtilIntegrador.getSessionFactory().getCurrentSession();
    
        return session;
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() throws PersistenceException {
        List<T> result = null;
        try {
            startTransaction();
            Criteria crit = getSession().createCriteria(clazz);
            crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

            result = (List<T>) crit.list();
            finishTransacton();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<T> findByIdEmpresa(Integer id) throws PersistenceException {
        List<T> result = null;
        try {
            startTransaction();
            Criteria crit = getSession().createCriteria(clazz);
            crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

            crit.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            crit.add(Restrictions.eq("idEmpresa.id", id));

            result = (List<T>) crit.list();
            finishTransacton();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<T> findByIdEmpresa(Integer id, List<String> orders) throws PersistenceException {
        List<T> result = null;
        try {
            startTransaction();
            Criteria crit = getSession().createCriteria(clazz);
            crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

            crit.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            crit.add(Restrictions.eq("idEmpresa.id", id));

            if (orders != null) {
                for (String order : orders)
                    crit.addOrder(Order.desc(order));
            }

            result = (List<T>) crit.list();
            finishTransacton();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<T> findByIdCidade(Integer id) throws PersistenceException {
        List<T> result = null;
        try {
            startTransaction();
            Criteria crit = getSession().createCriteria(clazz);
            crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

            crit.createCriteria("idCidade", CriteriaSpecification.LEFT_JOIN);
            crit.add(Restrictions.eq("idCidade.id", id));

            result = (List<T>) crit.list();
            finishTransacton();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<T> findObjectList(T objeto, final List<String> excludeProperty) throws PersistenceException {
        List<T> result = null;
        try {
            startTransaction();
            final Criteria c = getSession().createCriteria(objeto.getClass());
            Example example = Example.create(objeto);

            if (excludeProperty != null) {
                for (String exclude : excludeProperty) {
                    example.excludeProperty(exclude);
                }
            }

            example.enableLike(MatchMode.ANYWHERE).ignoreCase();
            c.add(example);

            c.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            result = (List<T>) c.list();
            finishTransacton();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public T findByObject(final T objeto, final List<String> excludeProperty) throws PersistenceException {
        T entity = null;
        try {
            startTransaction();
            final Criteria c = getSession().createCriteria(objeto.getClass());
            Example example = Example.create(objeto);
            if (excludeProperty != null) {
                for (String exclude : excludeProperty) {
                    example.excludeProperty(exclude);
                }
            }
            // example.enableLike(MatchMode.ANYWHERE).ignoreCase();
            c.add(example);

            entity = (T) c.uniqueResult();
            finishTransacton();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
        return entity;
    }

    @Override
    public T findByObjectItens(T objeto, List<String> itens) {
        T entity = null;

        try {
            startTransaction();

            final Criteria c = getSession().createCriteria(objeto.getClass());
            for (String item : itens) {
                c.setFetchMode(item, FetchMode.JOIN);
            }

            Example ex = Example.create(objeto);
            ex.excludeZeroes();
            c.add(ex);

            entity = (T) c.uniqueResult();
            finishTransacton();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
        return entity;
    }

    @SuppressWarnings("unchecked")
    public T findByObjectEmpresa(final T objeto, final Integer idEmpresa) throws PersistenceException {
        T result = null;
        try {
            startTransaction();
            final Criteria c = getSession().createCriteria(objeto.getClass());
            Example ex = Example.create(objeto);
            ex.excludeZeroes();

            c.add(ex);

            c.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            c.add(Restrictions.eq("idEmpresa.id", idEmpresa));

            result = (T) c.uniqueResult();
            finishTransacton();
        } catch (Exception e) {
            transactionFailed();
            throw new PersistenceException(e);
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<T> findListByObjectEmpresa(final T objeto, final Integer idEmpresa) throws PersistenceException {
        List<T> result = null;
        try {
            startTransaction();
            final Criteria c = getSession().createCriteria(objeto.getClass());
            Example ex = Example.create(objeto);
            ex.excludeZeroes();

            c.add(ex);

            c.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            c.add(Restrictions.eq("idEmpresa.id", idEmpresa));

            result = c.list();
            finishTransacton();
        } catch (Exception e) {
            transactionFailed();
            throw new PersistenceException(e);
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public List<T> findListByLikeObjectEmpresa(final T objeto, final Integer idEmpresa) throws PersistenceException {
        List<T> result = null;
        try {
            startTransaction();
            final Criteria c = getSession().createCriteria(objeto.getClass());
            Example ex = Example.create(objeto);
            ex.excludeZeroes();
            ex.enableLike(MatchMode.ANYWHERE).ignoreCase();

            c.add(ex);

            c.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            c.add(Restrictions.eq("idEmpresa.id", idEmpresa));

            result = c.list();
            finishTransacton();
        } catch (Exception e) {
            transactionFailed();
            throw new PersistenceException(e);
        }
        return result;
    }

}

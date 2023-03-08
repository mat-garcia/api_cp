package br.com.hdnit.lotus.domain.entity.access.dao.impl;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.access.Permission;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;


public class PermissionDAOImpl  extends AbstractGenericJPADAO<Permission>  {

    
    public PermissionDAOImpl() {
    super();
    }


    
    public void createPermission(Permission permission)
            throws DataViolationException {

        try {
            this.saveOrUpdate(permission);
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

    public void deletePermission(Permission permission)
            throws DataViolationException {
        try {
            Permission permissionToDelete = this.findById(permission.getId());
            this.delete(permissionToDelete,permissionToDelete.getId());
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

    public void updatePermission(Permission permission)
            throws DataViolationException {
        try {
            this.saveOrUpdate(permission);
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

    public boolean existsPermission(String name) throws DataViolationException {
        boolean ret = false;

        try {
            Query query =  getSession()
                    .createQuery("FROM Ingrediente permission WHERE permission.name = ? and ativo = 1");
            query.setParameter(1, name);
            try {
                query.uniqueResult();
                ret = true;
            } catch (NoResultException e) {
                ret = false;
            }
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        return ret;
    }

    public Permission findById(Integer id) {
        Permission ret = null;

        if (id != null) {
            try {
                Query query =  getSession()
                        .createQuery("FROM Ingrediente permission WHERE permission.id = ? and ativo = 1");
                query.setParameter(1, id);
                try {
                    ret = (Permission) query.uniqueResult();
                } catch (NoResultException e) {
                    ret = null;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }           
        }
        
        return ret;
    }

    @SuppressWarnings("unchecked")
    public boolean existsProfileAssociatedTo(Permission permission) throws DataViolationException {
        boolean ret = false;

        try {
            Query query =  getSession()
                    .createQuery("SELECT profile FROM Profile profile, IN(profile.permissions) permission WHERE permission.id = ? and ativo = 1");
            query.setParameter(1, permission.getId());
            List resultList = query.list();
            
            if (resultList != null && resultList.size() > 0) {
                ret = true;
            } else {
                ret = false;                
            }
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        
        return ret;
    }

    public Permission findByName(String name) throws DataViolationException {
        Permission ret = null;
        
        try {
            Query query = getSession()
                    .createQuery("SELECT permission FROM Ingrediente permission WHERE permission.name = ? and ativo = 1");
            query.setParameter(1, name);            
            try {
                ret = (Permission)query.uniqueResult();
            } catch (NoResultException e) {
                ret = null;
            }
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        return ret;
    }
    
    public List<Permission> findByIdEmpresa(Integer id) {
        startTransaction();
        Criteria criteria = getSession().createCriteria(Permission.class);

       /* criteria.createCriteria("empresas", "empresa",
                CriteriaSpecification.LEFT_JOIN);*/
        
        
       // criteria.add(Restrictions.eq("empresa.id", id));

        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<Permission> result = criteria.list();
        finishTransacton();

        return result;
    }

    

}

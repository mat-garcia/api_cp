
package br.com.hdnit.lotus.domain.entity.access.dao.impl;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.access.Profile;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class ProfileDAOImpl extends AbstractGenericJPADAO<Profile> {

    public ProfileDAOImpl() {
    }


    public void createProfile(Profile profile) throws DataViolationException {

        try {
            super.saveOrUpdate(profile);
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

    public void deleteProfile(Profile profile) throws DataViolationException {
        try {
            super.delete(profile,profile.getId());
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Profile> listAllProfiles() throws DataViolationException {
        List<Profile> ret = null;
        try {
            Query query = getSession().createQuery("SELECT profile FROM Profile profile WHERE 1=1 and ativo = 1");
            ret = query.list();
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        return ret;
    }

    public Profile findProfileByEmpresa(String nome, Integer idEmpresa){
    	 startTransaction();
         Criteria criteria = getSession().createCriteria(Profile.class);
         
         criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
         criteria.add(Restrictions.eq("idEmpresa.id", idEmpresa));
         
         criteria.add(Restrictions.eq("name", nome));
         Profile result = (Profile) criteria.uniqueResult();
         finishTransacton();
         return result;
    }
    
    
    public void updateProfile(Profile profile) throws DataViolationException {
        try {
            super.saveOrUpdate(profile);
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
    }

    public boolean existsProfile(String name) throws DataViolationException {
        boolean ret = false;

        try {
            Query query = getSession().createQuery("FROM Profile profile WHERE profile.name = ? and ativo = 1");
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

    public Profile findById(Long id) throws DataViolationException {
        Profile ret = null;

        if (id != null) {
            try {
                Query query = getSession().createQuery("FROM Profile profile WHERE profile.id = ? and ativo = 1");
                query.setParameter(1, id);
                try {
                    ret = (Profile) query.uniqueResult();
                } catch (NoResultException e) {
                    ret = null;
                }
            } catch (Exception e) {
                throw new DataViolationException(e);
            }
        }

        return ret;
    }

    public Profile findByName(String name) throws DataViolationException {
        Profile ret = null;

        try {
            Query query = getSession().createQuery("SELECT profile FROM Profile profile WHERE profile.name = ? and ativo = 1");
            query.setParameter(1, name);
            try {
                ret = (Profile) query.uniqueResult();
            } catch (NoResultException e) {
                ret = null;
            }
        } catch (Exception e) {
            throw new DataViolationException(e);
        }
        return ret;
    }

    @SuppressWarnings("unchecked")
    public boolean existsUserAssociatedTo(Profile profile) {
        boolean ret = false;

        try {
            Query query = getSession().createQuery("SELECT user from User user JOIN user.profile profile WHERE profile.id = ? and ativo = 1");

            query.setParameter(1, profile.getId());
            List resultList = query.list();

            if (resultList != null && resultList.size() > 0) {
                ret = true;
            } else {
                ret = false;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return ret;
    }

}


package br.com.hdnit.lotus.domain.entity.config.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.config.DocconfirmahotelConfig;
import br.com.hdnit.lotus.domain.entity.config.FaixaEtariaConfig;
import br.com.hdnit.lotus.domain.entity.config.MeiosComuniConfig;
import br.com.hdnit.lotus.domain.entity.corporativo.Empresa;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class MeiosComuniConfigDAOImpl extends AbstractGenericJPADAO<MeiosComuniConfig> {
    public MeiosComuniConfigDAOImpl() {
        super();
    }

    @Override
    public List<MeiosComuniConfig> findByIdEmpresa(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(MeiosComuniConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<MeiosComuniConfig> result = criteria.list();
        finishTransacton();

        return result;
    }
    
    public MeiosComuniConfig findByIdParent(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(MeiosComuniConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        MeiosComuniConfig result = (MeiosComuniConfig) criteria.uniqueResult();
        finishTransacton();

        return result;
    }

   
}
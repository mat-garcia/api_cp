
package br.com.hdnit.lotus.domain.entity.config.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.config.FaixaEtariaConfig;
import br.com.hdnit.lotus.domain.entity.config.MoedaConfig;
import br.com.hdnit.lotus.domain.entity.config.MotivoFrontConfig;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class MotivosFrontConfigDAOImpl extends AbstractGenericJPADAO<MotivoFrontConfig> {
    public MotivosFrontConfigDAOImpl() {
        super();
    }

    @Override
    public List<MotivoFrontConfig> findByIdEmpresa(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(MotivoFrontConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<MotivoFrontConfig> result = criteria.list();
        finishTransacton();

        return result;
    }
    
    public MotivoFrontConfig findByIdParent(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(MotivoFrontConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        MotivoFrontConfig result = (MotivoFrontConfig) criteria.uniqueResult();
        finishTransacton();

        return result;
    }

   
}

package br.com.hdnit.lotus.domain.entity.config.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.config.FaixaEtariaConfig;
import br.com.hdnit.lotus.domain.entity.config.MoedaConfig;
import br.com.hdnit.lotus.domain.entity.config.MotivoFrontConfig;
import br.com.hdnit.lotus.domain.entity.config.OrigemReservaConfig;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class OrigemReservaConfigDAOImpl extends AbstractGenericJPADAO<OrigemReservaConfig> {
    public OrigemReservaConfigDAOImpl() {
        super();
    }

    @Override
    public List<OrigemReservaConfig> findByIdEmpresa(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(OrigemReservaConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<OrigemReservaConfig> result = criteria.list();
        finishTransacton();

        return result;
    }
    
    public OrigemReservaConfig findByIdParent(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(OrigemReservaConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        OrigemReservaConfig result = (OrigemReservaConfig) criteria.uniqueResult();
        finishTransacton();

        return result;
    }

   
}
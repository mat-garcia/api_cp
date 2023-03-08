
package br.com.hdnit.lotus.domain.entity.config.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.StandardBasicTypes;

import br.com.hdnit.lotus.domain.entity.config.CidadeConfig;
import br.com.hdnit.lotus.domain.entity.config.DocconfirmahotelConfig;
import br.com.hdnit.lotus.domain.entity.config.FaixaEtariaConfig;
import br.com.hdnit.lotus.domain.entity.config.MeiosComuniConfig;
import br.com.hdnit.lotus.domain.entity.config.MoedaConfig;
import br.com.hdnit.lotus.domain.entity.corporativo.Empresa;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class CidadeConfigDAOImpl extends AbstractGenericJPADAO<CidadeConfig> {
    public CidadeConfigDAOImpl() {
        super();
    }

    @Override
    public List<CidadeConfig> findByIdEmpresa(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(CidadeConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<CidadeConfig> result = criteria.list();
        finishTransacton();

        return result;
    }

    public CidadeConfig findByIdParent(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(CidadeConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        CidadeConfig result = (CidadeConfig) criteria.uniqueResult();
        finishTransacton();

        return result;
    }
}
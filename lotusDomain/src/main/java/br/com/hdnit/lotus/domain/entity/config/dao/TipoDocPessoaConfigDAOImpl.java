package br.com.hdnit.lotus.domain.entity.config.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.config.TipoDocPessoaConfig;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class TipoDocPessoaConfigDAOImpl extends AbstractGenericJPADAO<TipoDocPessoaConfig> {
	
	public TipoDocPessoaConfigDAOImpl() {
        super();
    }
	
	@Override
    public List<TipoDocPessoaConfig> findByIdEmpresa(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(TipoDocPessoaConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<TipoDocPessoaConfig> result = criteria.list();
        finishTransacton();

        return result;
    }
	
	public TipoDocPessoaConfig findByIdParent(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(TipoDocPessoaConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        TipoDocPessoaConfig result = (TipoDocPessoaConfig) criteria.uniqueResult();
        finishTransacton();

        return result;
    }

}

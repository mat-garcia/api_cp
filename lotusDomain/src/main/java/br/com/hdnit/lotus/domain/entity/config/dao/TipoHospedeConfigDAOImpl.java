
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
import br.com.hdnit.lotus.domain.entity.config.PensaoConfig;
import br.com.hdnit.lotus.domain.entity.config.PessoaConfig;
import br.com.hdnit.lotus.domain.entity.config.SegmentoConfig;
import br.com.hdnit.lotus.domain.entity.config.TarifaConfig;
import br.com.hdnit.lotus.domain.entity.config.TipoHospedeConfig;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class TipoHospedeConfigDAOImpl extends AbstractGenericJPADAO<TipoHospedeConfig> {
    public TipoHospedeConfigDAOImpl() {
        super();
    }

    @Override
    public List<TipoHospedeConfig> findByIdEmpresa(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(TipoHospedeConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<TipoHospedeConfig> result = criteria.list();
        finishTransacton();

        return result;
    }
    
    public TipoHospedeConfig findByIdParent(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(TipoHospedeConfig.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        TipoHospedeConfig result = (TipoHospedeConfig) criteria.uniqueResult();
        finishTransacton();

        return result;
    }

   
}
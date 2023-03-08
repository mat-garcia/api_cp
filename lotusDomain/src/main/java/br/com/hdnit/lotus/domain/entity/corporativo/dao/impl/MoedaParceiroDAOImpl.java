
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.MoedaParceiro;
import br.com.hdnit.lotus.domain.entity.corporativo.TipoUhParceiro;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class MoedaParceiroDAOImpl extends AbstractGenericJPADAO<MoedaParceiro> {
    public MoedaParceiroDAOImpl() {
        super();
    }

    @Override
    public List<MoedaParceiro> findByIdEmpresa(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(MoedaParceiro.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }

        criteria.addOrder(Order.asc("moeda"));
        
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<MoedaParceiro> result = criteria.list();
        finishTransacton();

        return result;
    }


      
}
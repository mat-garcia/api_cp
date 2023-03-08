
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.CanalHotel;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class CanalHotelDAOImpl extends AbstractGenericJPADAO<CanalHotel> {
    public CanalHotelDAOImpl() {
        super();
    }

    @Override
    public List<CanalHotel> findByIdEmpresa(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(CanalHotel.class);
     
        if (id != null) {
            criteria.createCriteria("empresaPai","empresaPai", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("empresaPai.id", id));

        }
        criteria.addOrder(Order.asc("empresaPai.nomeFantasia"));
        
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<CanalHotel> result = criteria.list();
        finishTransacton();

        return result;
    }

  

    public CanalHotel findByCanalHotel(Integer idCanal, Integer idHotel, Integer idParceiro) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(CanalHotel.class);
        criteria.createCriteria("empresaPai","empresaPai", CriteriaSpecification.LEFT_JOIN);      
        criteria.createCriteria("canal","canal", CriteriaSpecification.LEFT_JOIN);
        criteria.createCriteria("parceiro","parceiro", CriteriaSpecification.LEFT_JOIN);
        
        criteria.add(Restrictions.eq("empresaPai.id", idHotel));
        criteria.add(Restrictions.eq("canal.id", idCanal));
        criteria.add(Restrictions.eq("parceiro.id", idParceiro));
        
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        CanalHotel result = (CanalHotel) criteria.uniqueResult();
        finishTransacton();

        return result;
    }
    
    public List<CanalHotel> findListByCanal(Integer idCanal) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(CanalHotel.class);
     
        criteria.createCriteria("empresaPai","empresaPai", CriteriaSpecification.LEFT_JOIN);      
        criteria.createCriteria("canal", CriteriaSpecification.LEFT_JOIN);
        criteria.createCriteria("parceiro", CriteriaSpecification.LEFT_JOIN);
        
        criteria.add(Restrictions.eq("canal.id", idCanal));
        
        criteria.addOrder(Order.asc("empresaPai.nomeFantasia"));
        
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<CanalHotel> result = criteria.list();
        finishTransacton();

        return result;
    }

    
}
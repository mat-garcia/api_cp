
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.Empresa;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class EmpresaDAOImpl extends AbstractGenericJPADAO<Empresa> {
    public EmpresaDAOImpl() {
        super();
    }

    @Override
    public List<Empresa> findByIdEmpresa(Integer id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(Empresa.class);
     
        if (id != null) {
            criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
            criteria.add(Restrictions.eq("idEmpresa.id", id));

        }
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        List<Empresa> result = criteria.list();
        finishTransacton();

        return result;
    }


    public Empresa findEmpresaId(Integer idEmpresa) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(Empresa.class);

      
        if (idEmpresa != null) {
          
            criteria.add(Restrictions.eq("id", idEmpresa));

        }

        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

       Empresa result = (Empresa) criteria.uniqueResult();
        finishTransacton();

        return result;
    }
    
    
  

    public List<Empresa> findAll() throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(Empresa.class);
      
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        criteria.addOrder(Order.asc("dtSincronia"));
        
        List<Empresa> result = criteria.list();
        finishTransacton();

        return result;
    }
    
}
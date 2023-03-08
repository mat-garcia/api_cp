
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IClientepessDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Clientepess;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Pessoa;

public class ClientepessDAOImpl extends AbstractGenericCMJPADAO<Clientepess>  implements IClientepessDAO{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClientepessDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	 @SuppressWarnings("unchecked")
	    public List<Clientepess> findAll() throws PersistenceException {
	        List<Clientepess> result = null;
	        try {
	            startTransaction();
	            Criteria crit = getSession().createCriteria(Clientepess.class,"cliente");

	            crit.createCriteria("pessoa","pessoa", CriteriaSpecification.LEFT_JOIN);
	            
	            
	            crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

	            crit.addOrder(Order.asc("pessoa.nome"));
	            
	            result = (List<Clientepess>) crit.list();
	            finishTransacton();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        finally {

	        }
	        return result;
	    }
   
	 
	 public List<Clientepess> findByIdPms(Long id) throws PersistenceException {
	        startTransaction();
	        Criteria criteria = getSession().createCriteria(Clientepess.class);
	     
	       
	        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

	        criteria.createCriteria("pessoa","pessoa", CriteriaSpecification.LEFT_JOIN);
           
	     	//criteria.createCriteria("pessoa.hotel","hotel", CriteriaSpecification.LEFT_JOIN);
            
            //criteria.add(Restrictions.eq("hotel.idhotel", id));
            
	        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

	        criteria.addOrder(Order.asc("pessoa.nome"));

	        
	        List<Clientepess> result = criteria.list();
	        finishTransacton();

	        return result;
	    }

	public List<Clientepess> findByIdPms(String retaguardaId, String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
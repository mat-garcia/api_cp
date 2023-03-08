
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IContasfrontDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Contasfront;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipouh;

public class ContasfrontDAOImpl extends AbstractGenericCMJPADAO<Contasfront>  implements IContasfrontDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContasfrontDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	  public List<Contasfront> findByIdPms(Integer id) throws PersistenceException {
	        startTransaction();
	        Criteria criteria = getSession().createCriteria(Contasfront.class);
	     
	        if (id != null) {
	            criteria.add(Restrictions.eq("idhotel", id));

	        }
	        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

	        List<Contasfront> result = criteria.list();
	        finishTransacton();

	        return result;
	    }
	   
   
}
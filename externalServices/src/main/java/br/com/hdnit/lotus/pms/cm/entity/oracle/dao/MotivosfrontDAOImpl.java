
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IMotivosfrontDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Motivosfront;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Pensaofront;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Veiculoscomunica;

public class MotivosfrontDAOImpl extends AbstractGenericCMJPADAO<Motivosfront>  implements IMotivosfrontDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MotivosfrontDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Motivosfront> findAll() throws PersistenceException {
		List<Motivosfront> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Motivosfront.class);
	        
			crit.add(Restrictions.eq("flgativo", 'S'));
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.addOrder(Order.asc("descricao"));
			
			result = (List<Motivosfront>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}
   
}
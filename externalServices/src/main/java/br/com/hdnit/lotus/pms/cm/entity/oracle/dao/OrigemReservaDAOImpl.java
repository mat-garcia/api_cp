
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IOrigemReservaDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Origemreserva;

public class OrigemReservaDAOImpl extends AbstractGenericCMJPADAO<Origemreserva>  implements IOrigemReservaDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrigemReservaDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}
	
	public List<Origemreserva> findAll() throws PersistenceException {
		List<Origemreserva> result = null;
		Character filtro = new Character('S');
		
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Origemreserva.class);
			crit.add(Restrictions.eq("flgativo",filtro));

			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			
			crit.addOrder(Order.asc("descricao"));
			
			result = (List<Origemreserva>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}

   
}
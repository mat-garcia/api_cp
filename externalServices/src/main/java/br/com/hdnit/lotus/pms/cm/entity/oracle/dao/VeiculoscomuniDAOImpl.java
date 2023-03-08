
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IVeiculoscomuniDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Pensaofront;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Veiculoscomunica;

public class VeiculoscomuniDAOImpl extends AbstractGenericCMJPADAO<Veiculoscomunica>  implements IVeiculoscomuniDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VeiculoscomuniDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Veiculoscomunica> findAll() throws PersistenceException {
		List<Veiculoscomunica> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Veiculoscomunica.class);
			
	        crit.add(Restrictions.eq("flgativo", 'S'));
			
	        crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.addOrder(Order.asc("descricao"));
			
			result = (List<Veiculoscomunica>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}
}

package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IPensaofrontDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Origemreserva;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Pensaofront;

public class PensaofrontDAOImpl extends AbstractGenericCMJPADAO<Pensaofront> implements IPensaofrontDAO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PensaofrontDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Pensaofront> findAll() throws PersistenceException {
		List<Pensaofront> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Pensaofront.class);
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.addOrder(Order.asc("codpensao"));

			result = (List<Pensaofront>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}

	public Pensaofront findByCodigoHotel(String codPensao) throws PersistenceException {
		Pensaofront result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Pensaofront.class);
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.add(Restrictions.eq("codpensao", codPensao));

			crit.addOrder(Order.asc("codpensao"));

			result = (Pensaofront) crit.uniqueResult();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}

}

package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.BundleUtils;
import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.foundation.util.DateUtils;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ITarifahotelDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Segmento;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tarifahotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipohospede;

public class TarifahotelDAOImpl extends AbstractGenericCMJPADAO<Tarifahotel> implements ITarifahotelDAO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TarifahotelDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Tarifahotel> findByIdPms(Long id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Tarifahotel.class);

		if (id != null) {
			criteria.createCriteria("hotel", "hotel", CriteriaSpecification.LEFT_JOIN);

			criteria.add(Restrictions.eq("hotel.idhotel", id));

		}
		
		Date date = new Date();
		
		criteria.add(Restrictions.ge("datafinal", date));
		criteria.add(Restrictions.eq("aceitacalrate", 'N'));
		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.asc("descricao"));

		List<Tarifahotel> result = criteria.list();
		finishTransacton();

		return result;
	}

}
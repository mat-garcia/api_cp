
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ITipoUhDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipouh;

public class TipoUhDAOImpl extends AbstractGenericCMJPADAO<Tipouh>  implements ITipoUhDAO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TipoUhDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Tipouh> findByIdPms(Long id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Tipouh.class);

		if (id != null) {
			criteria.createCriteria("hotel", "hotel", CriteriaSpecification.LEFT_JOIN);

			criteria.add(Restrictions.eq("hotel.idhotel", id));

		}

		criteria.add(Restrictions.eq("flgativa", 'S'));
		criteria.add(Restrictions.gt("qtdreal", 0));
		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.asc("descricao"));
		
		List<Tipouh> result = criteria.list();
		finishTransacton();

		return result;
	}

	public Tipouh findById(BigInteger id, BigInteger idHotel) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Tipouh.class);

		criteria.add(Restrictions.eq("tipouhPK.idtipouh", id));
		criteria.add(Restrictions.eq("tipouhPK.idhotel", idHotel));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Tipouh result = (Tipouh) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

}
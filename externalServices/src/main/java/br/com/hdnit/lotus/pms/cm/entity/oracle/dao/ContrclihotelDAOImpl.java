
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IContrclihotelDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Contrclihotel;

public class ContrclihotelDAOImpl extends AbstractGenericCMJPADAO<Contrclihotel>  implements IContrclihotelDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContrclihotelDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}
	
	public List<Contrclihotel> findByIdPms(Long id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Contrclihotel.class);

		if (id != null) {
			criteria.createCriteria("hotel", "hotel", CriteriaSpecification.LEFT_JOIN);

			criteria.add(Restrictions.eq("hotel.idhotel", id));

		}
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Contrclihotel> result = criteria.list();
		finishTransacton();

		return result;
	}

	public Contrclihotel findById(BigInteger codcontrato, BigInteger idHotel) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Contrclihotel.class);

		criteria.add(Restrictions.eq("contrclihotelPK.codcontrato", codcontrato));
		criteria.add(Restrictions.eq("contrclihotelPK.idhotel", idHotel));
		
		
		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Contrclihotel result = (Contrclihotel) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

	public Contrclihotel findContratoTarifa(BigInteger codcontrato, BigInteger idHotel,BigInteger idforcli) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Contrclihotel.class);

		criteria.createCriteria("tarifahotel", "tarifahotel", CriteriaSpecification.LEFT_JOIN);
		
		criteria.add(Restrictions.eq("contrclihotelPK.codcontrato", codcontrato));
		criteria.add(Restrictions.eq("contrclihotelPK.idhotel", idHotel));
		criteria.add(Restrictions.eq("contrclihotelPK.idforcli", idforcli));

		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Contrclihotel result = (Contrclihotel) criteria.uniqueResult();
		finishTransacton();

		return result;
	}
	
	
	public List<Contrclihotel> findByIdPmsClientPess(Long id, Long idClientePessoa) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Contrclihotel.class);

		if (id != null) {
			criteria.createCriteria("hotel", "hotel", CriteriaSpecification.LEFT_JOIN);

			criteria.add(Restrictions.eq("hotel.idhotel", id));

		}

		if (idClientePessoa != null) {
			criteria.createCriteria("clientepess", "clientepess", CriteriaSpecification.LEFT_JOIN);

			criteria.add(Restrictions.eq("clientepess.idpessoa", idClientePessoa));

		}
		
		Date date = new Date();		
		criteria.add(Restrictions.gt("datafimcontrato", date));
		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Contrclihotel> result = criteria.list();
		finishTransacton();

		return result;
	}


   
}
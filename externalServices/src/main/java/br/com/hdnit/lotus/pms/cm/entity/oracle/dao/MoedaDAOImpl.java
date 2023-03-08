
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
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IMoedaDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Cidades;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Moeda;

public class MoedaDAOImpl extends AbstractGenericCMJPADAO<Moeda>  implements IMoedaDAO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MoedaDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public Moeda findById(Long id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Moeda.class);

		criteria.add(Restrictions.eq("moecodigo", id));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Moeda result = (Moeda) criteria.uniqueResult();
		finishTransacton();

		return result;
	}
	
	public List<Moeda> findAll() throws PersistenceException {
		List<Moeda> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Moeda.class);
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.addOrder(Order.asc("moedesc"));
			
			result = (List<Moeda>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}
}
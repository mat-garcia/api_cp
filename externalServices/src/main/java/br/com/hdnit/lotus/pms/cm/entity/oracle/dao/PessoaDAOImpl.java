
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
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IPessoaDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Pessoa;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipouh;

public class PessoaDAOImpl extends AbstractGenericCMJPADAO<Pessoa> implements IPessoaDAO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PessoaDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Pessoa> findByIdPms(Long id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Pessoa.class);

		if (id != null) {
			criteria.createCriteria("hotel", "hotel", CriteriaSpecification.LEFT_JOIN);

			criteria.add(Restrictions.eq("hotel.idhotel", id));

		}
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.asc("nome"));

		List<Pessoa> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<Pessoa> findAll() throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Pessoa.class);

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.asc("nome"));

		List<Pessoa> result = criteria.list();
		finishTransacton();

		return result;
	}

}
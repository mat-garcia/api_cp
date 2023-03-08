
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.Canal;
import br.com.hdnit.lotus.domain.entity.corporativo.ErrorLog;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class ErrorLogDAOImpl extends AbstractGenericJPADAO<ErrorLog> {
	public ErrorLogDAOImpl() {
		super();
	}

	@Override
	public List<ErrorLog> findByIdEmpresa(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Canal.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.addOrder(Order.asc("dataInclusao"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<ErrorLog> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<ErrorLog> findAll() throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Canal.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.addOrder(Order.asc("dataInclusao"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<ErrorLog> result = criteria.list();
		finishTransacton();

		return result;
	}

}
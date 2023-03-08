
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.Parceiro;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class ParceiroDAOImpl extends AbstractGenericJPADAO<Parceiro> {
	public ParceiroDAOImpl() {
		super();
	}

	@Override
	public List<Parceiro> findByIdEmpresa(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Parceiro.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
		criteria.addOrder(Order.asc("dtSincronia"));
		
		List<Parceiro> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<Parceiro> findByIdEmpresa(Integer id, Integer idRobo) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Parceiro.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.add(Restrictions.eq("idRobo", idRobo));
		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
		criteria.addOrder(Order.asc("dtSincronia"));
		
		List<Parceiro> result = criteria.list();
		finishTransacton();

		return result;
	}

	public Parceiro findParceiroId(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Parceiro.class);

		if (id != null) {

			criteria.add(Restrictions.eq("id", id));

		}

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Parceiro result = (Parceiro) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

	public List<Parceiro> findAll() throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Parceiro.class);

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Parceiro> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<Parceiro> findAtivo() throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Parceiro.class);

		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
		criteria.add(Restrictions.eq("integracaoAtiva", true));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Parceiro> result = criteria.list();
		finishTransacton();

		return result;
	}
}
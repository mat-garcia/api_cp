
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.Canal;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class CanalDAOImpl extends AbstractGenericJPADAO<Canal> {
	public CanalDAOImpl() {
		super();
	}

	@Override
	public List<Canal> findByIdEmpresa(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Canal.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.addOrder(Order.asc("nome"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Canal> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<Canal> findAll() throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Canal.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.addOrder(Order.asc("nome"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Canal> result = criteria.list();
		finishTransacton();

		return result;
	}

	public Canal findByIdWeb(Integer idWeb, Integer idEmpresa) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Canal.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("idWeb", idWeb));

		if (idEmpresa != null) {
			criteria.add(Restrictions.eq("idEmpresa.id", idEmpresa));
		}

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Canal result = (Canal) criteria.uniqueResult();
		finishTransacton();
		
		if (result != null) {
			logger.info("Método - findByIdWeb resultado: " + result.toString());
		} else {
			logger.info("Método - findByIdWeb resultado: O Canal (" + idWeb + ") não foi localizado e será cadastrado!");
		}
		
		return result;
	}
	
	public Canal findByIdWebPCC(String idWebPCC, Integer idEmpresa) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Canal.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("idWebPCC", idWebPCC));

		if (idEmpresa != null) {
			criteria.add(Restrictions.eq("idEmpresa.id", idEmpresa));
		}

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Canal result = (Canal) criteria.uniqueResult();
		finishTransacton();
		
		if (result != null) {
			logger.info("Método - findByIdWebPCC resultado: " + result.toString());
		} else {
			logger.info("Método - findByIdWebPCC resultado: O Canal (" + idWebPCC + ") não foi localizado e será cadastrado!");
		}
		
		return result;
	}

	public Canal findByNome(String nome, Integer idEmpresa) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Canal.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("nome", nome));

		if (idEmpresa != null) {
			criteria.add(Restrictions.eq("idEmpresa.id", idEmpresa));
		}

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Canal result = (Canal) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

	public Canal findByIdWebParceiro(Integer idWeb, Integer idEmpresa, Integer idParceiro) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Canal.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("parceiro", "parceiro", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("idWeb", idWeb));

		criteria.add(Restrictions.eq("parceiro", idParceiro));

		if (idEmpresa != null) {
			criteria.add(Restrictions.eq("idEmpresa.id", idEmpresa));
		}

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Canal result = (Canal) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

	public Integer findMaxId(Integer idParceiro) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Canal.class);
		criteria.createCriteria("parceiro", "parceiro", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("parceiro.id", idParceiro));

		criteria.setProjection(Projections.projectionList().add(Projections.max("idWeb")));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Integer result = (Integer)criteria.uniqueResult();
		finishTransacton();

		return result;
	}

}
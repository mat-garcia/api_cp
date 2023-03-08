
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.Reserva;
import br.com.hdnit.lotus.domain.entity.corporativo.ReservaHospede;
import br.com.hdnit.lotus.domain.entity.corporativo.ReservaItem;
import br.com.hdnit.lotus.domain.entity.corporativo.ReservaItemLancamento;
import br.com.hdnit.lotus.domain.entity.corporativo.ReservaItemValor;
import br.com.hdnit.lotus.domain.entity.enums.StatusReservaEnum;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class ReservaItemDAOImpl extends AbstractGenericJPADAO<ReservaItem> {
	public ReservaItemDAOImpl() {
		super();
	}

	public List<ReservaItem> findByStatus(StatusReservaEnum status) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(ReservaItem.class);
		criteria.createCriteria("reserva","reserva", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reserva.idEmpresa","idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("status", status));

		criteria.add(Restrictions.eq("reserva.ativo", 1));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.desc("reserva.dataOperacao"));
		
		List<ReservaItem> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<ReservaItem> findAll() throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(ReservaItem.class);
		criteria.createCriteria("reserva","reserva", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reserva.idEmpresa","idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("reserva.ativo", 1));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.desc("reserva.dataOperacao"));
		
		List<ReservaItem> result = criteria.list();
		finishTransacton();

		return result;
	}


	public List<ReservaItem> findByDate(Date dataInicial, Date dataFinal) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(ReservaItem.class);
		criteria.createCriteria("reserva","reserva", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reserva.idEmpresa","idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("reserva.ativo", 1));

		criteria.add(Restrictions.gt("reserva.dataOperacao", dataInicial));
		criteria.add(Restrictions.lt("reserva.dataOperacao", dataFinal));

		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.desc("reserva.dataOperacao"));
		
		List<ReservaItem> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<ReservaItem> findByReserva(Reserva reserva) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(ReservaItem.class);
		criteria.createCriteria("reserva","reserva", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reserva.idEmpresa","idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("reserva.ativo", 1));

		criteria.add(Restrictions.eq("reserva.id", reserva.getId()));
		
		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.desc("id"));
		
		List<ReservaItem> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<ReservaItem> findByReservaLancamentos(Reserva reserva) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(ReservaItem.class);
		criteria.createCriteria("reserva","reserva", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reservaItensLancamento","reservaItensLancamento", CriteriaSpecification.LEFT_JOIN);
		
		criteria.createCriteria("reserva.idEmpresa","idEmpresa", CriteriaSpecification.LEFT_JOIN);
		
		criteria.add(Restrictions.eq("reserva.ativo", 1));

		criteria.add(Restrictions.eq("reserva.id", reserva.getId()));
		
		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.desc("id"));
		
		List<ReservaItem> result = criteria.list();
		finishTransacton();

		return result;
	}

	
	
	public List<ReservaItemValor> findByReservaItemValor(ReservaItem reserva) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(ReservaItemValor.class);
		criteria.createCriteria("reservaItem","reservaItem", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("reservaItem.id", reserva.getId()));
		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
		
		criteria.addOrder(Order.desc("id"));
		
		List<ReservaItemValor> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<ReservaItemLancamento> findByReservaItemLancamento(ReservaItem reserva) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(ReservaItemLancamento.class);
		criteria.createCriteria("reservaItem","reservaItem", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("reservaItem.id", reserva.getId()));

		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
		criteria.addOrder(Order.desc("id"));
		
		
		List<ReservaItemLancamento> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<ReservaHospede> findByReservaHospedes(Reserva reserva) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(ReservaHospede.class);
		criteria.createCriteria("reserva","reserva", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reserva.idEmpresa","idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("reserva.ativo", 1));

		criteria.add(Restrictions.eq("reserva.id", reserva.getId()));
		
		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.desc("id"));
		
		List<ReservaHospede> result = criteria.list();
		finishTransacton();

		return result;
	}

	
	

	public List<ReservaHospede> findByReservaItemHospedes(ReservaItem reserva) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(ReservaHospede.class);
		criteria.createCriteria("reserva","reserva", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reserva.idEmpresa","idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("reserva.ativo", 1));

		criteria.add(Restrictions.eq("reserva.id", reserva.getId()));
		
		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		criteria.addOrder(Order.desc("id"));
		
		List<ReservaHospede> result = criteria.list();
		finishTransacton();

		return result;
	}

}
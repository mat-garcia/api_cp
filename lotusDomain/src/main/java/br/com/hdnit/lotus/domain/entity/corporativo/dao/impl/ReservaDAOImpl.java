
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.Empresa;
import br.com.hdnit.lotus.domain.entity.corporativo.Reserva;
import br.com.hdnit.lotus.domain.entity.enums.StatusReservaEnum;
import br.com.hdnit.lotus.foundation.util.DateUtils;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class ReservaDAOImpl extends AbstractGenericJPADAO<Reserva> {
	public ReservaDAOImpl() {
		super();
	}

	@Override
	public List<Reserva> findByIdEmpresa(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Reserva> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<Reserva> findAll() throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Reserva> result = criteria.list();
		finishTransacton();

		return result;
	}
	
	public List<Reserva> findAllStatusSolicitada(StatusReservaEnum status) throws PersistenceException {
		startTransaction();
		
		Calendar dataChegada = Calendar.getInstance(); //obtendo a data atual menos dez dias
		dataChegada.add(Calendar.DAY_OF_MONTH, -10);
			
		Criteria criteria = getSession().createCriteria(Reserva.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
		
		criteria.add(Restrictions.eq("ativo", 1));
		criteria.add(Restrictions.eq("status", status));
		criteria.add(Restrictions.gt("dataChegada", dataChegada.getTime()));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Reserva> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<Reserva> findByStatus(StatusReservaEnum status, Integer id, Integer idParceiro)
			throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("parceiro", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reservaItens", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("idEmpresa.id", id));

		criteria.add(Restrictions.eq("parceiro.id", idParceiro));

		criteria.add(Restrictions.eq("ativo", 1));

		criteria.add(Restrictions.eq("status", status));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Reserva> result = criteria.list();
		finishTransacton();

		return result;
	}
	
	public List<Reserva> findByStatus(List<StatusReservaEnum> status, Integer id, Integer idParceiro)
			throws PersistenceException {
		
		logger.info("findByStatus -  Empresa: " + id + ", Parceiro: " + idParceiro + ", status: " + status);
	
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("parceiro", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reservaItens", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("idEmpresa.id", id));

		criteria.add(Restrictions.eq("parceiro.id", idParceiro));

		criteria.add(Restrictions.eq("ativo", 1));

		criteria.add(Restrictions.in("status", status));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Reserva> result = criteria.list();
		finishTransacton();

		return result;
	}

	
	
	public List<Reserva> findByStatus(StatusReservaEnum status) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("parceiro", "parceiro", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reservaItens", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.eq("parceiro.integracaoAtiva", true));

		criteria.add(Restrictions.eq("ativo", 1));

		criteria.add(Restrictions.eq("status", status));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Reserva> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<Reserva> findByStatus(List<StatusReservaEnum> status, Date inicio, Date fim, Empresa empresa)
			throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);
		criteria.createCriteria("idEmpresa", "empresa", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("parceiro", "parceiro", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("reservaItens", CriteriaSpecification.LEFT_JOIN);

		criteria.add(Restrictions.gt("dataOperacao", inicio));
		criteria.add(Restrictions.le("dataOperacao", fim));

		if (empresa != null) {

			criteria.add(Restrictions.eq("empresa.id", empresa.getId()));
		}

		criteria.add(Restrictions.eq("ativo", 1));

		criteria.add(Restrictions.in("status", status));

		//criteria.addOrder(Order.asc("empresa.id"));

		criteria.addOrder(Order.asc("dataOperacao"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Reserva> result = criteria.list();
		finishTransacton();

		return result;
	}

	public Reserva findByReserva(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);
		criteria.createCriteria("reservaItens", "reservaItens", CriteriaSpecification.LEFT_JOIN);
		criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);

		if (id != null) {
			criteria.add(Restrictions.eq("id", id));

		}

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Reserva result = (Reserva) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

	public Reserva findByLocalizadorStatusNot(Integer id, String uniqueParceiro, String uniqueCanal,
			StatusReservaEnum status) throws PersistenceException {
		
		Date data = new Date();
		String dataAlteracao = DateUtils.getInstance().formatarData(data, "yyyy-MM-dd");
				
		startTransaction();
		
		if (status == StatusReservaEnum.MODIFICADA) {
			logger.info("findByLocalizadorStatusNot id: " + id + " uniqueParceiro: " + uniqueParceiro + 
					" uniqueCanal: " + uniqueCanal + " Diferente de StatusReservaEnum: SOLICITADA" + " status = 1 "
					+ "data_alteracao: " + dataAlteracao);
		} else {
			logger.info("findByLocalizadorStatusNot id: " + id + " uniqueParceiro: " + uniqueParceiro + 
					" uniqueCanal: " + uniqueCanal + " Diferente de StatusReservaEnum: SOLICITADA" + " status = 1");
		}
		
		Criteria criteria = getSession().createCriteria(Reserva.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}

		criteria.add(Restrictions.eq("uniqueIDReservaParceiro", uniqueParceiro));
		criteria.add(Restrictions.eq("uniqueIDReservaCanal", uniqueCanal));

		criteria.add(Restrictions.ne("status", status));
		criteria.add(Restrictions.eq("ativo", 1));
		
		if (status == StatusReservaEnum.MODIFICADA) { 
			criteria.add(Restrictions.lt("dataAlteracao", data));
		}

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Reserva result = (Reserva) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

	public List<Reserva> findByLocalizadorStatus(Integer id, String uniqueParceiro, String uniqueCanal,
			StatusReservaEnum status) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}

		criteria.add(Restrictions.eq("uniqueIDReservaParceiro", uniqueParceiro));
		criteria.add(Restrictions.eq("uniqueIDReservaCanal", uniqueCanal));

		criteria.add(Restrictions.eq("status", status));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Reserva> result = criteria.list();
		finishTransacton();

		return result;
	}

	public Reserva findByLocalizadorStatusNot(Integer id, String uniqueParceiro, String uniqueCanal,
			List<StatusReservaEnum> status) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);

		criteria.createCriteria("reservaItens", CriteriaSpecification.LEFT_JOIN);
		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}

		criteria.add(Restrictions.eq("uniqueIDReservaParceiro", uniqueParceiro));
		criteria.add(Restrictions.eq("uniqueIDReservaCanal", uniqueCanal));

		criteria.add(Restrictions.not(Restrictions.in("status", status)));

		criteria.add(Restrictions.eq("ativo", 1));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Reserva result = (Reserva) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

	public Reserva findByIdCliente(Integer id) throws PersistenceException {
		Reserva result = null;
		try {
			startTransaction();
			Criteria criteria = getSession().createCriteria(Reserva.class);

			criteria.createCriteria("reservaItens", CriteriaSpecification.LEFT_JOIN);

			criteria.add(Restrictions.eq("id", id));

			criteria.add(Restrictions.eq("ativo", 1));

			criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

			result = (Reserva) criteria.uniqueResult();
			finishTransacton();
		} catch (Exception e) {
			transactionFailed();
			throw new PersistenceException(e);
		}
		return result;
	}

	public List<Reserva> findListByLocalizadorStatusNot(Integer id, String uniqueParceiro, String uniqueCanal,
			List<StatusReservaEnum> status) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);

		criteria.createCriteria("reservaItens", CriteriaSpecification.LEFT_JOIN);
		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}

		criteria.add(Restrictions.eq("uniqueIDReservaParceiro", uniqueParceiro));
		criteria.add(Restrictions.eq("uniqueIDReservaCanal", uniqueCanal));
		criteria.add(Restrictions.eq("ativo", 1));
		criteria.add(Restrictions.not(Restrictions.in("status", status)));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Reserva> result = criteria.list();
		finishTransacton();

		return result;
	}

	public Reserva findByLocalizadorStatusIn(Integer id, String uniqueParceiro, String uniqueCanal,
			List<StatusReservaEnum> status) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reserva.class);

		criteria.createCriteria("reservaItens", CriteriaSpecification.LEFT_JOIN);
		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		
		criteria.add(Restrictions.eq("uniqueIDReservaParceiro", uniqueParceiro));
		criteria.add(Restrictions.eq("uniqueIDReservaCanal", uniqueCanal));
		criteria.add(Restrictions.eq("ativo", 1));

		criteria.add(Restrictions.in("status", status));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
		
		logger.info("findByLocalizadorStatusIn -> " + "id: " + id + ", uniqueParceiro: " + uniqueParceiro + ", uniqueCanal: " + uniqueCanal + ", status: " + status);

		Reserva result = (Reserva) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

}
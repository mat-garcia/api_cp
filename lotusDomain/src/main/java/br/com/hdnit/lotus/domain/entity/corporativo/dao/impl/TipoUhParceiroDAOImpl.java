
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.Parceiro;
import br.com.hdnit.lotus.domain.entity.corporativo.TipoUhParceiro;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class TipoUhParceiroDAOImpl extends AbstractGenericJPADAO<TipoUhParceiro> {
	public TipoUhParceiroDAOImpl() {
		super();
	}

	@Override
	public List<TipoUhParceiro> findByIdEmpresa(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoUhParceiro.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}

		criteria.addOrder(Order.asc("descricao"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<TipoUhParceiro> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<TipoUhParceiro> findByIdEmpresaCanal(Integer id, Integer idCanal,Integer idCanalHotel) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoUhParceiro.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}

		if (idCanal != null) {
			criteria.createCriteria("canal", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("canal.id", idCanal));

		}

		if (idCanalHotel != null) {
			criteria.createCriteria("canalHotel", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("canalHotel.id", idCanalHotel));

		}
		
		criteria.addOrder(Order.asc("descricao"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<TipoUhParceiro> result = criteria.list();
		finishTransacton();

		return result;
	}

	
	public List<TipoUhParceiro> findByIdEmpresaParceiro(Integer id, Parceiro parceiro) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoUhParceiro.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.add(Restrictions.isNull("canal"));

		if (parceiro != null) {
			criteria.createCriteria("parceiro", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("parceiro.id", parceiro.getId()));

		}
		
		criteria.addOrder(Order.asc("descricao"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<TipoUhParceiro> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<TipoUhParceiro> findByIdEmpresaNoCanal(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoUhParceiro.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.add(Restrictions.isNull("canal"));

		criteria.addOrder(Order.asc("descricao"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<TipoUhParceiro> result = criteria.list();
		finishTransacton();

		return result;
	}
	
	public Integer findByQtdeMinDispCodReduzido(Integer idEmpresa, Integer idParceiro, String codReduzido) {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoUhParceiro.class);
		Integer qtdeMinDisp = 0;
		
		if (idEmpresa != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", idEmpresa));

		}
		
		criteria.createCriteria("parceiro", "parceiro", CriteriaSpecification.LEFT_JOIN);
		criteria.add(Restrictions.eq("parceiro.id", idParceiro));
		criteria.add(Restrictions.eq("codreduzido", codReduzido));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		TipoUhParceiro result = (TipoUhParceiro) criteria.uniqueResult();
		
		if (result != null && result.getQtdeMinDisp() != null) {
			qtdeMinDisp = result.getQtdeMinDisp();
		}

		finishTransacton();
		
		return qtdeMinDisp;
	}
	
}
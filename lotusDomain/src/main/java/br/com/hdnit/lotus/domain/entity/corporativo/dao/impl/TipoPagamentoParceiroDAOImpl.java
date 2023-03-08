
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.Parceiro;
import br.com.hdnit.lotus.domain.entity.corporativo.TipoPagamentoParceiro;
import br.com.hdnit.lotus.domain.entity.corporativo.TipoPensaoParceiro;
import br.com.hdnit.lotus.domain.entity.corporativo.TipoUhParceiro;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class TipoPagamentoParceiroDAOImpl extends AbstractGenericJPADAO<TipoPagamentoParceiro> {
	public TipoPagamentoParceiroDAOImpl() {
		super();
	}

	@Override
	public List<TipoPagamentoParceiro> findByIdEmpresa(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoPagamentoParceiro.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<TipoPagamentoParceiro> result = criteria.list();
		finishTransacton();

		return result;
	}

	public List<TipoPagamentoParceiro> findByIdEmpresaParceiro(Integer id, Parceiro parceiro) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoPagamentoParceiro.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		
		if (parceiro != null) {
			criteria.createCriteria("parceiro", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("parceiro.id", parceiro.getId()));

		}
		
		criteria.addOrder(Order.asc("descricaopgto"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<TipoPagamentoParceiro> result = criteria.list();
		finishTransacton();

		return result;
	}
	
	public TipoPagamentoParceiro findByIdTipoPagamento(Integer id, Parceiro parceiro, String tipoCartao) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoPagamentoParceiro.class);
		TipoPagamentoParceiro result = null;
		
		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		
		if (parceiro != null) {
			criteria.createCriteria("parceiro", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("parceiro.id", parceiro.getId()));

		}
		criteria.add(Restrictions.eq("codigoExterno", tipoCartao));

		criteria.addOrder(Order.asc("descricaopgto"));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		result = (TipoPagamentoParceiro) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

}
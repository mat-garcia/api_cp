
package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.TipoPensaoParceiro;
import br.com.hdnit.lotus.domain.entity.enums.TipoWSEnum;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class TipoPensaoParceiroDAOImpl extends AbstractGenericJPADAO<TipoPensaoParceiro> {
	public TipoPensaoParceiroDAOImpl() {
		super();
	}

	@Override
	public List<TipoPensaoParceiro> findByIdEmpresa(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoPensaoParceiro.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<TipoPensaoParceiro> result = criteria.list();
		finishTransacton();

		return result;
	}

	
	public List<TipoPensaoParceiro> findByIdHotelTipoWs(Integer id, TipoWSEnum tipo) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoPensaoParceiro.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}

		if (tipo != null) {
			criteria.add(Restrictions.eq("tipoWS", tipo));

		}

		
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<TipoPensaoParceiro> result = criteria.list();
		finishTransacton();

		return result;
	}

}
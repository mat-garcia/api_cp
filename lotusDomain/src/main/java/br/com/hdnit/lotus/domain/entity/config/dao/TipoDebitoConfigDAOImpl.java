
package br.com.hdnit.lotus.domain.entity.config.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.config.TipoDebitoConfig;
import br.com.hdnit.lotus.foundation.util.BundleUtils;
import br.com.hdnit.lotus.foundation.util.DateUtils;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class TipoDebitoConfigDAOImpl extends AbstractGenericJPADAO<TipoDebitoConfig> {
	public TipoDebitoConfigDAOImpl() {
		super();
	}

	@Override
	public List<TipoDebitoConfig> findByIdEmpresa(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoDebitoConfig.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<TipoDebitoConfig> result = criteria.list();
		finishTransacton();

		return result;
	}

	public int deleteByCanalHotel(Integer idCanalHotel) throws Exception {
		// TODO Auto-generated method stub
		int updated = 0;
		try {

			Query query = getSession()
					.createSQLQuery("delete from tipo_debito_config where id_canal_hotel = " + idCanalHotel);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha deleteByCanalHotel ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public TipoDebitoConfig findByIdParent(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoDebitoConfig.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		TipoDebitoConfig result = (TipoDebitoConfig) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

}
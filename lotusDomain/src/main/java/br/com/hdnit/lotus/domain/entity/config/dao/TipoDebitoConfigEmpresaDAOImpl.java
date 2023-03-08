
package br.com.hdnit.lotus.domain.entity.config.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.config.TipoDebitoConfigEmpresa;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class TipoDebitoConfigEmpresaDAOImpl extends AbstractGenericJPADAO<TipoDebitoConfigEmpresa> {
	public TipoDebitoConfigEmpresaDAOImpl() {
		super();
	}

	@Override
	public List<TipoDebitoConfigEmpresa> findByIdEmpresa(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoDebitoConfigEmpresa.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<TipoDebitoConfigEmpresa> result = criteria.list();
		finishTransacton();

		return result;
	}

	public int deleteByCanalHotel(Integer idEmpresa) throws Exception {
		// TODO Auto-generated method stub
		int updated = 0;
		try {

			Query query = getSession()
					.createSQLQuery("delete from tipo_debito_empresa where id_empresa = " + idEmpresa);

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

	public TipoDebitoConfigEmpresa findByIdParent(Integer id) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(TipoDebitoConfigEmpresa.class);

		if (id != null) {
			criteria.createCriteria("idEmpresa", CriteriaSpecification.LEFT_JOIN);
			criteria.add(Restrictions.eq("idEmpresa.id", id));

		}
		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		TipoDebitoConfigEmpresa result = (TipoDebitoConfigEmpresa) criteria.uniqueResult();
		finishTransacton();

		return result;
	}

}
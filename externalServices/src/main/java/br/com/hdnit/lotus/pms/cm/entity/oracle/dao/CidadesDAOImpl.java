
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.StandardBasicTypes;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Cidades;

public class CidadesDAOImpl extends AbstractGenericCMJPADAO<Cidades> implements ICidadesDAO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CidadesDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Cidades> findAll() throws PersistenceException {
		List<Cidades> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Cidades.class);
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.addOrder(Order.asc("nome"));

			result = (List<Cidades>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}

	public List<Cidades> findFilter(String query) throws PersistenceException {
		List<Cidades> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Cidades.class);
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			if (query != null) {
				crit.add(Restrictions.ilike("nome", query, MatchMode.START));
			}

			crit.addOrder(Order.asc("nome"));

			result = (List<Cidades>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}
	
    public Integer findByIdCidade(String cidade) throws PersistenceException {
        startTransaction();
		
        Query query = null;
		Integer result = null;
		
		query = getSession()
				.createSQLQuery("select MAX(idcidades) as idcidades from cidades where UPPER(nome) like '%" + cidade.toUpperCase().trim() + "%'")
				.addScalar("idcidades", StandardBasicTypes.INTEGER);

		logger.info("select MAX(idcidades) as idcidades from cidades where UPPER(nome) like '%" + cidade.trim().toUpperCase() + "%'");
		logger.info(query.toString());
		
		try {
			result = (Integer) query.uniqueResult();
		} catch (Exception e) {
			result = null;
		}

		return result;
    }

}
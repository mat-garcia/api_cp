package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ITipoDocPessoa;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipodocpessoa;

public class TipoDocPessoaDAOImpl extends AbstractGenericCMJPADAO<Tipodocpessoa> implements ITipoDocPessoa {

	public TipoDocPessoaDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
		// TODO Auto-generated constructor stub
	}

	public List<Tipodocpessoa> findAll() throws PersistenceException {
		List<Tipodocpessoa> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Tipodocpessoa.class);
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.add(Restrictions.eq("docChave", "S"));
			crit.add(Restrictions.eq("fisicaJuridica", "F"));

			crit.addOrder(Order.asc("nomeDocumento"));

			result = (List<Tipodocpessoa>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return result;
	}

}

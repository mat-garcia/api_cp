
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ITratamentoDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Motivosfront;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tratamento;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Veiculoscomunica;

public class TratamentoDAOImpl extends AbstractGenericCMJPADAO<Tratamento>  implements ITratamentoDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TratamentoDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Tratamento> findAll() throws PersistenceException {
		List<Tratamento> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Tratamento.class);
	        
			crit.add(Restrictions.eq("flgativo", 'S'));
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.addOrder(Order.asc("descricao"));
			
			result = (List<Tratamento>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}
}
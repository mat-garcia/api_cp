
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IFaixaetariaDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Docconfirmahotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Faixaetaria;

public class FaixaetariaDAOImpl extends AbstractGenericCMJPADAO<Faixaetaria>  implements IFaixaetariaDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FaixaetariaDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Faixaetaria> findAll() throws PersistenceException {
		List<Faixaetaria> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Faixaetaria.class);
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.addOrder(Order.asc("descricao"));
			
			result = (List<Faixaetaria>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}
   
}
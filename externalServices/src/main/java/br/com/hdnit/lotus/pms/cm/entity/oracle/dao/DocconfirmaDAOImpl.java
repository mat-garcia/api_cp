
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IDocconfirmaDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Docconfirmahotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Usuariosistema;

public class DocconfirmaDAOImpl extends AbstractGenericCMJPADAO<Docconfirmahotel>  implements IDocconfirmaDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DocconfirmaDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Docconfirmahotel> findAll() throws PersistenceException {
		List<Docconfirmahotel> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Docconfirmahotel.class);
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.addOrder(Order.asc("descricao"));
			
			result = (List<Docconfirmahotel>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}
   
}
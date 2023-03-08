
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IMeioscomunicaDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Docconfirmahotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Meioscomunicacao;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Veiculoscomunica;

public class MeioscomunicaDAOImpl extends AbstractGenericCMJPADAO<Meioscomunicacao>  implements IMeioscomunicaDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MeioscomunicaDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}
   
	public List<Meioscomunicacao> findAll() throws PersistenceException {
		List<Meioscomunicacao> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Meioscomunicacao.class);
			
			crit.add(Restrictions.eq("flgativo", 'S'));
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.addOrder(Order.asc("descricao"));
			
			result = (List<Meioscomunicacao>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}
}
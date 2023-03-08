
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IUsuarioSistemaDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.UsuarioDTO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Usuariosistema;

public class UsuarioSistemaDAOImpl extends AbstractGenericCMJPADAO<Usuariosistema>  implements IUsuarioSistemaDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioSistemaDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	
	public List<Usuariosistema> findAll() throws PersistenceException {
		List<Usuariosistema> result = null;
		try {
			startTransaction();
			Criteria crit = getSession().createCriteria(Usuariosistema.class);
			crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

			crit.addOrder(Order.asc("nomeusuario"));
			
			result = (List<Usuariosistema>) crit.list();
			finishTransacton();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return result;
	}
 
	public List<UsuarioDTO> getAllUsuarios(Long idHotel) {
		Query query = null;
		List<UsuarioDTO> result = null;
		
		query = getSession().createSQLQuery(
				"select u.IDUSUARIO as IDUSUARIO, u.NOMEUSUARIO as NOME from USUARIOSISTEMA u where u.BLOQUEADO = 'N' AND u.DESATIVADO = 'N'  ORDER BY u.NOMEUSUARIO")
				.addScalar("IDUSUARIO", StandardBasicTypes.BIG_INTEGER).addScalar("NOME", StandardBasicTypes.STRING);
		
		/*query = getSession().createSQLQuery(
				"select u.IDUSUARIO as IDUSUARIO, u.NOMEUSUARIO as NOME from USUARIOSISTEMA u where u.IDESPACESSO NOT IN (SELECT IDESPACESSO FROM AUTORIZAHOTEL WHERE IDHOTEL =" + idHotel + ") ORDER BY u.NOMEUSUARIO")
				.addScalar("IDUSUARIO", StandardBasicTypes.BIG_INTEGER).addScalar("NOME", StandardBasicTypes.STRING);
      */
		query.setResultTransformer(Transformers.aliasToBean(UsuarioDTO.class));

		result = query.list();

		
		
		return result;
	}

}
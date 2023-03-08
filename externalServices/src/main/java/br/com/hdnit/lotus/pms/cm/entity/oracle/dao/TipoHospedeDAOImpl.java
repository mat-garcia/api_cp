
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ICidadesDAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ITipoHospedeDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipohospede;

public class TipoHospedeDAOImpl extends AbstractGenericCMJPADAO<Tipohospede>  implements ITipoHospedeDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TipoHospedeDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

    public List<Tipohospede> findByIdPms(Long id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(Tipohospede.class);
     
        if (id != null) {
        	criteria.createCriteria("hotel","hotel", CriteriaSpecification.LEFT_JOIN);
            
            criteria.add(Restrictions.eq("hotel.idhotel", id));
        }
        
        criteria.add(Restrictions.eq("flgativo", 'S'));
        
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        criteria.addOrder(Order.asc("descricao"));
        
        List<Tipohospede> result = criteria.list();
        finishTransacton();

        return result;
    }
   
}
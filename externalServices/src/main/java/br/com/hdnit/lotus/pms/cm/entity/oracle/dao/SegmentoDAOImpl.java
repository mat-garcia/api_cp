
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
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.ISegmentoDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Pessoa;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Segmento;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipohospede;

public class SegmentoDAOImpl extends AbstractGenericCMJPADAO<Segmento>  implements ISegmentoDAO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SegmentoDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Segmento> findByIdPms(Long id) throws PersistenceException {
        startTransaction();
        Criteria criteria = getSession().createCriteria(Segmento.class);
     
        if (id != null) {
        	criteria.createCriteria("hotel","hotel", CriteriaSpecification.LEFT_JOIN);
            
            criteria.add(Restrictions.eq("hotel.idhotel", id));

        }

        char filtro = 'A';
        
        criteria.add(Restrictions.eq("analiticasintetic", filtro));
        criteria.add(Restrictions.eq("flgativo", 'S'));
        
        criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

        criteria.addOrder(Order.asc("descricao"));
        
        
        List<Segmento> result = criteria.list();
        finishTransacton();

        return result;
    }

   
}
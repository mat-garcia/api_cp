
package br.com.hdnit.lotus.pms.cm.entity.dao._interface;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Segmento;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tarifahotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipohospede;

public interface ITarifahotelDAO {
    /**
	 * 
	 */
	

	public List<Tarifahotel> findByIdPms(Long id) throws PersistenceException;
   
}
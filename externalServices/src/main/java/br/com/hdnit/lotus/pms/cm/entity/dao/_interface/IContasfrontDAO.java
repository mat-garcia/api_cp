
package br.com.hdnit.lotus.pms.cm.entity.dao._interface;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Contasfront;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipouh;

public interface IContasfrontDAO {
    /**
	 * 
	 */
	
	  public List<Contasfront> findByIdPms(Integer id) throws PersistenceException ;
	   
   
}
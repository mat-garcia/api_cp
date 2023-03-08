
package br.com.hdnit.lotus.pms.cm.entity.dao._interface;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Origemreserva;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Pensaofront;

public interface IPensaofrontDAO  {
    /**
	 * 
	 */
	
	public List<Pensaofront> findAll() throws PersistenceException;
   
}
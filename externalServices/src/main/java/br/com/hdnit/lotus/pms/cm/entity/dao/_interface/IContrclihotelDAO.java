
package br.com.hdnit.lotus.pms.cm.entity.dao._interface;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Cidades;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Contrclihotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipouh;

public interface IContrclihotelDAO  {
    /**
	 * 
	 */
	

	public List<Contrclihotel> findByIdPms(Long id) throws PersistenceException ;
	public Contrclihotel findById(BigInteger codcontrato, BigInteger idHotel) throws PersistenceException;

	public List<Contrclihotel> findByIdPmsClientPess(Long id, Long idClientePessoa) throws PersistenceException;
	
   
}
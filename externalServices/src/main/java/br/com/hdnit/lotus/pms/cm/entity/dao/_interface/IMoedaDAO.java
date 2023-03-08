
package br.com.hdnit.lotus.pms.cm.entity.dao._interface;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Cidades;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Moeda;

public interface IMoedaDAO {
	/**
	 * 
	 */


	public Moeda findById(Long id) throws PersistenceException ;
	
	public List<Moeda> findAll() throws PersistenceException;
}
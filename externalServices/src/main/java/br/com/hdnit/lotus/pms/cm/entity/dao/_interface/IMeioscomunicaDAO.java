
package br.com.hdnit.lotus.pms.cm.entity.dao._interface;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Docconfirmahotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Meioscomunicacao;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Veiculoscomunica;

public interface IMeioscomunicaDAO  {
    /**
	 * 
	 */
	
   
	public List<Meioscomunicacao> findAll() throws PersistenceException;
}

package br.com.hdnit.lotus.domain.entity.corporativo.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.hdnit.lotus.domain.entity.corporativo.Reserva;
import br.com.hdnit.lotus.domain.entity.corporativo.ReservaHospede;
import br.com.hdnit.lotus.domain.entity.corporativo.ReservaItem;
import br.com.hdnit.lotus.domain.entity.corporativo.ReservaItemLancamento;
import br.com.hdnit.lotus.domain.entity.corporativo.ReservaItemValor;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;

public class ReservaItemLancamentoDAOImpl extends AbstractGenericJPADAO<ReservaItemLancamento> {
	public ReservaItemLancamentoDAOImpl() {
		super();
	}


	
}
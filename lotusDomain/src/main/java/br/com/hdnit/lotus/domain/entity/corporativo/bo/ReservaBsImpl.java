package br.com.hdnit.lotus.domain.entity.corporativo.bo;

import java.util.List;

import br.com.hdnit.lotus.domain.bo.generic.AbstractBussinesObject;
import br.com.hdnit.lotus.domain.entity.corporativo.Reserva;
import br.com.hdnit.lotus.domain.entity.corporativo.bo.exception.GenericBussinessException;
import br.com.hdnit.lotus.domain.entity.corporativo.dao.impl.ReservaDAOImpl;

public class ReservaBsImpl extends
		AbstractBussinesObject<Reserva, ReservaDAOImpl> {

	public ReservaBsImpl() {
		super();
	}

	

	@Override
	public List<Reserva> findByIdEmpresa(Integer id) throws GenericBussinessException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}

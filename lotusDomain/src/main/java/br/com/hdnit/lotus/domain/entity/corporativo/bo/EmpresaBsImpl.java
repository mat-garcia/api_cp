package br.com.hdnit.lotus.domain.entity.corporativo.bo;

import java.util.List;

import br.com.hdnit.lotus.domain.bo.generic.AbstractBussinesObject;
import br.com.hdnit.lotus.domain.dto.UsuarioSession;
import br.com.hdnit.lotus.domain.entity.corporativo.Empresa;
import br.com.hdnit.lotus.domain.entity.corporativo.bo.exception.GenericBussinessException;
import br.com.hdnit.lotus.domain.entity.corporativo.dao.impl.EmpresaDAOImpl;

public class EmpresaBsImpl extends
		AbstractBussinesObject<Empresa, EmpresaDAOImpl> {

	public EmpresaBsImpl() {
		super();
	}

	public Empresa findEmpresaById(Integer idEmpresa) {
		return dao.findEmpresaId(idEmpresa);
	}

	@Override
	public List<Empresa> findByIdEmpresa(Integer id) throws GenericBussinessException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}

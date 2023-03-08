package br.com.hdnit.lotus.domain.entity.corporativo.bo;

import java.util.List;

import br.com.hdnit.lotus.domain.bo.generic.AbstractBussinesObject;
import br.com.hdnit.lotus.domain.entity.corporativo.Canal;
import br.com.hdnit.lotus.domain.entity.corporativo.bo.exception.GenericBussinessException;
import br.com.hdnit.lotus.domain.entity.corporativo.dao.impl.CanalDAOImpl;

public class CanalBsImpl extends
		AbstractBussinesObject<Canal, CanalDAOImpl> {

	public CanalBsImpl() {
		super();
	}

	

	@Override
	public List<Canal> findByIdEmpresa(Integer id) throws GenericBussinessException {
		// TODO Auto-generated method stub
		return dao.findByIdEmpresa(id);
	}
	
	public List<Canal> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}

package br.com.hdnit.lotus.pms.cm.entity.dao._interface;

import java.util.List;

import javax.persistence.PersistenceException;

import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipodocpessoa;

public interface ITipoDocPessoa {
	
	public List<Tipodocpessoa> findAll() throws PersistenceException;
}

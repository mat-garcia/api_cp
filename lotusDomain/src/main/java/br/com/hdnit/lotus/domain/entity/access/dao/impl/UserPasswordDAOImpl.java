package br.com.hdnit.lotus.domain.entity.access.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.hdnit.lotus.domain.entity.access.UserPassword;
import br.com.hdnit.lotus.domain.entity.access.Usuario;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractGenericJPADAO;


public class UserPasswordDAOImpl extends AbstractGenericJPADAO<UserPassword>  {

	@PersistenceContext(unitName="AccessManagementPersistenceUnit")
	private EntityManager entityManager; 

	public UserPasswordDAOImpl() {
	}

	public void setPasswordHash(Usuario Usuario, String hash) {
		UserPassword userPassword = findByUserId(Usuario.getId());
		
		if (userPassword == null) {
			userPassword = createUserPassword(Usuario);			
		}
		
		userPassword.setPasswordHash(hash);
		entityManager.merge(userPassword);
	}

	public boolean validatePasswordHash(Usuario Usuario, String hash) {
		boolean ret = false;
		UserPassword userPassword = findByUserId(Usuario.getId());
		
		if (userPassword != null && userPassword.getPasswordHash() != null) {
			ret = userPassword.getPasswordHash().equals(hash);
		}
		return ret;
	}

	public void deleteUserPassword(Usuario Usuario) {
		UserPassword userPassword = findByUserId(Usuario.getId());
		
		if (userPassword != null) {
			entityManager.remove(userPassword);
		}		
	}	

	public UserPassword findByUserId(Integer id) {
		UserPassword ret = null;

		if (id != null) {
			try {
				Query query = entityManager
						.createQuery("SELECT userPassword from UserPassword userPassword JOIN userPassword.Usuario Usuario WHERE Usuario.id = ? and ativo = 1");
				query.setParameter(1, id);
				try {
					ret = (UserPassword) query.getSingleResult();
				} catch (NoResultException e) {
					ret = null;
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}			
		}
		
		return ret;
	}

	private UserPassword createUserPassword(Usuario Usuario) {
		UserPassword userPassword = new UserPassword();
		userPassword.setPasswordHash("");
		userPassword.setUser(Usuario);
		entityManager.persist(userPassword);
		return userPassword;
	}

}

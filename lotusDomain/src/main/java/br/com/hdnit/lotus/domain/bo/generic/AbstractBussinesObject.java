package br.com.hdnit.lotus.domain.bo.generic;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.exception.ConstraintViolationException;

import br.com.hdnit.lotus.domain.dto.UsuarioSession;
import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.domain.entity.corporativo.bo.exception.GenericBussinessException;
import br.com.hdnit.lotus.foundation.util.BundleUtils;
import br.com.hdnit.mixfiscal.domain.generic.dao.AbstractComparator;
import br.com.hdnit.mixfiscal.domain.generic.dao.GenericDAO;

public abstract class AbstractBussinesObject<T extends AuditTrail, E extends GenericDAO<T>>
		implements GenericBussinessObject<T, E>, Serializable {
	protected String FILE_PREFIX = "";

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	protected UsuarioSession usuarioSession = new UsuarioSession();

	public static AbstractComparator COMPARATOR_DEFAULT;

	protected T entity;

	public Logger logger;

	protected Boolean isEmpresaCorrente = Boolean.TRUE;

	protected List<T> lstEntity;

	protected E dao;

	public AbstractBussinesObject() {
		// TODO Auto-generated constructor stub
		try {
			logger = Logger.getLogger(this.getClass());
			logger.debug("Objeto T - entidade :"
					+ getTypeParameterClass().getSimpleName());
			logger.debug("Objeto E - dao :"
					+ getTypeParameterDAOClass().getSimpleName());

			dao = getTypeParameterDAOClass().newInstance();
			entity = getTypeParameterClass().newInstance();
			COMPARATOR_DEFAULT = createComparator();

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
		      logger.error("ERRO:  " + e.getMessage().toString(),e);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
		      logger.error("ERRO:  " + e.getMessage().toString(),e);
		}
	}

	public Class<T> getTypeParameterClass() {
		Type type = getClass().getGenericSuperclass();
		ParameterizedType paramType = (ParameterizedType) type;
		return (Class<T>) paramType.getActualTypeArguments()[0];
	}

	public Class<E> getTypeParameterDAOClass() {
		Type type = getClass().getGenericSuperclass();
		ParameterizedType paramType = (ParameterizedType) type;
		return (Class<E>) paramType.getActualTypeArguments()[1];
	}

	public AbstractComparator<T> createComparator() {
		return new AbstractComparator<T>();
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	public void setLstEntity(List<T> lstEntity) {
		this.lstEntity = lstEntity;
	}

	public Boolean delete(T entity, Integer id)
			throws GenericBussinessException {
		this.entity = entity;
		return delete();
	}

	public Boolean delete() throws GenericBussinessException {
		// TODO Auto-generated method stub
		Boolean result = Boolean.FALSE;
		try {
			if (entity.getId() != null) {
				dao.delete(entity, entity.getId());
			}
			result = Boolean.TRUE;

		} catch (Exception e) {
			String msg = e.getMessage();
			if (msg != null && msg.contains("ORA-02292")) {
				msg = BundleUtils
						.getMessage("dao.abstractGeneric.delete.constraint");
			}
			if (e.getCause() instanceof ConstraintViolationException) {
				msg = BundleUtils
						.getMessage("dao.abstractGeneric.delete.constraint");
			} else {
				msg = BundleUtils
						.getMessage("dao.abstractGeneric.delete.generic");

			}
			logger.error(e);
			e.printStackTrace();
			throw new GenericBussinessException(msg, e);

		}
		return result;
	}

	public void save(T entity) throws GenericBussinessException {
		this.entity = entity;
		this.save();
	}

	public void save() throws GenericBussinessException {

		try {

			this.entity.validateEntity(getUsuarioSession().getUsuario(),
					getUsuarioSession().getEmpresaCorrente(),
					getIsEmpresaCorrente());

			dao.saveOrUpdate(this.entity);

		} catch (Exception e) {
			String msg = e.getMessage();
			if (msg != null && msg.contains("ORA-00001")) {
				msg = BundleUtils
						.getMessage("dao.abstractGeneric.save.constraint");

			}
			if (e.getCause() instanceof ConstraintViolationException) {
				msg = BundleUtils
						.getMessage("dao.abstractGeneric.save.constraint");
			} else {
				msg = BundleUtils
						.getMessage("dao.abstractGeneric.save.generic");

			}
			logger.error(e);
			e.printStackTrace();
			throw new GenericBussinessException(msg, e);

		}

	}

	public List<T> getLstEntity() {
		// TODO Auto-generated method stub
		if (lstEntity == null) {
			lstEntity = new ArrayList<T>();
		}

		return lstEntity;

	}

	public void loadEntityList() {
		try {

			lstEntity = dao.findByIdEmpresa(getUsuarioSession()
					.getEmpresaCorrente().getId());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	public E getDao() {

		return dao;
	}

	public void setDao(E dao) {
		this.dao = dao;
	}

	public void newEntityInstance() {
		try {
			this.entity = getTypeParameterClass().newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Boolean getIsEmpresaCorrente() {
		return isEmpresaCorrente;
	}

	public void setIsEmpresaCorrente(Boolean isEmpresaCorrente) {
		this.isEmpresaCorrente = isEmpresaCorrente;
	}

	@Override
	public void selectEntity(T entity) {
		// TODO Auto-generated method stub
		this.entity = entity;
	}

	public void setUsuarioSession(UsuarioSession usuarioSession) {
		this.usuarioSession = usuarioSession;
	}

	public UsuarioSession getUsuarioSession() {
		return usuarioSession;
	}

	@Override
	public List<T> findByIdEmpresa(Integer id) throws GenericBussinessException {
		// TODO Auto-generated method stub
		return dao.findByIdEmpresa(id);
	}

	
	
	/** GET E SETTER **/ 
	public static AbstractComparator<?> getCOMPARATOR_DEFAULT() {
		return COMPARATOR_DEFAULT;
	}

	public static void setCOMPARATOR_DEFAULT(
			AbstractComparator<?> cOMPARATOR_DEFAULT) {
		COMPARATOR_DEFAULT = cOMPARATOR_DEFAULT;
	}


	
	

}


package br.com.hdnit.lotus.domain.bo.generic;

import java.util.List;

import javax.persistence.PersistenceException;

import br.com.hdnit.lotus.domain.dto.UsuarioSession;
import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.domain.entity.corporativo.bo.exception.GenericBussinessException;
import br.com.hdnit.mixfiscal.domain.generic.dao.GenericDAO;

public interface GenericBussinessObject<T extends AuditTrail , E extends GenericDAO<T>> {

   
    public Boolean delete() throws GenericBussinessException;
    
    public void setUsuarioSession(UsuarioSession usuarioSession);
    
    public void save(T clazz) throws GenericBussinessException;

    public List<T> findByIdEmpresa(Integer id) throws GenericBussinessException;
    
    public List<T> getLstEntity();

    public T getEntity();

    public void setEntity(T clazz);
  
    public void selectEntity(T entity);

    public Class<T> getTypeParameterClass();

    public Class<E> getTypeParameterDAOClass();
    
    public Boolean delete(T entity, Integer id) throws GenericBussinessException;
    
 


}


package br.com.hdnit.lotus.pms.cm.dao;

import java.util.List;

import javax.persistence.PersistenceException;

/**
 * <P><B>Description :</B><BR>
 * General GenericDAO
 * </P>
 * <P>
 * <B>
 * SAs : <BR>
 * 8148
 * </B>
 * @author <a href="mailto:contato@hdntecnologia.com.br">Jessé Freitas</a>
 * @since 14/01/2009
 * @version $Revision: 1.1 $
 * @param <T>
 */
public interface GenericDAO<T> {

  
    /**o
     * findObjectList
     * @author <a href="mailto:contato@hdntecnologia.com.br">Jessé Freitas</a>
     * @since 14/01/2009
     * @see
     * @param objeto
     * @param excludeProperty
     * @return
     * @throws PersistenceException
     * @return Returns the List<T>.
     */
    public List<T> findObjectList(final T objeto, final List<String> excludeProperty) throws PersistenceException;

    /**
     * findByObject
     * @author <a href="mailto:contato@hdntecnologia.com.br">Jessé Freitas</a>
     * @since 14/01/2009
     * @see
     * @param objeto
     * @param excludeProperty
     * @return
     * @throws PersistenceException
     * @return Returns the T.
     */
    public T findByObject(final T objeto, final List<String> excludeProperty) throws PersistenceException;

   
    /**
    * findById
    * @author <a href="mailto:contato@hdntecnologia.com.br">Jessé Freitas</a>
    * @since 14/01/2009
    * @see
    * @param clazz
    * @param id
    * @return
    * @throws PersistenceException
    * @return Returns the T.
    */
    public T findById(Integer id) throws PersistenceException;

    /**
    * attachClean
    * @author <a href="mailto:contato@hdntecnologia.com.br">Jessé Freitas</a>
    * @since 14/01/2009
    * @see
    * @param clazz
    * @throws PersistenceException
    * @return Returns the void.
    */
    public T attachClean(T clazz) throws PersistenceException;

    /**
    * delete
    * @author <a href="mailto:contato@hdntecnologia.com.br">Jessé Freitas</a>
    * @since 14/01/2009
    * @see
    * @param clazz
    * @param id
    * @throws PersistenceException
    * @return Returns the void.
    */
    public void delete(final T clazz, final Integer id) throws PersistenceException;


    /**
    * saveOrUpdate
    * @author <a href="mailto:contato@hdntecnologia.com.br">Jessé Freitas</a>
    * @since 14/01/2009
    * @see
    * @param clazz
    * @throws PersistenceException
    * @return Returns the void.
    */
    public void saveOrUpdate(T clazz) throws PersistenceException;

    /**
    * findAll
    * @author <a href="mailto:contato@hdntecnologia.com.br">Jessé Freitas</a>
    * @since 14/01/2009
    * @see
    * @param clazz
    * @return
    * @throws PersistenceException
    * @return Returns the List<T>.
    */
    public List<T> findAll() throws PersistenceException;

    public T findByObjectItens(T objeto, List<String> itens);
    
    public List<T> findByIdEmpresa(Integer id,List<String> orders) throws PersistenceException;
    
    public List<T> findByIdEmpresa(Integer id) throws PersistenceException;
   
    public List<T> findListByObjectEmpresa(final T objeto, final Integer idEmpresa) throws PersistenceException;
    
    public List<T> findListByLikeObjectEmpresa(final T objeto, final Integer idEmpresa) throws PersistenceException;
    
    //Delete Object with cascade
    public void deleteObject(final T clazz) throws PersistenceException;
}

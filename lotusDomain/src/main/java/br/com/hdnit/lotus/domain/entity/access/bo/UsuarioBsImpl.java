
package br.com.hdnit.lotus.domain.entity.access.bo;

import java.util.List;
import java.util.Random;

import br.com.hdnit.lotus.domain.bo.generic.AbstractBussinesObject;
import br.com.hdnit.lotus.domain.entity.access.Profile;
import br.com.hdnit.lotus.domain.entity.access.UserValidationException;
import br.com.hdnit.lotus.domain.entity.access.Usuario;
import br.com.hdnit.lotus.domain.entity.access.dao.impl.UsuarioDAOImpl;
import br.com.hdnit.lotus.domain.entity.enums.UsuarioStatusEnum;
import br.com.hdnit.lotus.foundation.util.BundleUtils;
import br.com.hdnit.lotus.foundation.util.MD5Utils;

public class UsuarioBsImpl extends AbstractBussinesObject<Usuario, UsuarioDAOImpl> {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;
  
    private ProfileBsImpl profileBs;
    
    public UsuarioBsImpl() {
        super();
        profileBs = new ProfileBsImpl();
        profileBs.setUsuarioSession(getUsuarioSession());
    }

    public void createUser(Usuario usuario) throws Exception {
        this.entity = usuario;
        Boolean existUser = dao.existsEmail(usuario.getEmail());

        if (existUser) {
            throw new UserValidationException(BundleUtils.getMessage("usuarios.existe.email"));
        }

        existUser = dao.existsUserCPF(usuario.getCpf());

        if (existUser) {
            throw new UserValidationException(BundleUtils.getMessage("usuarios.existe.cpf"));
        }

        Profile profile = profileBs.getDao()
                        .findById(Integer.valueOf(BundleUtils.getMessage("profilePadrao")));

        this.entity.setProfile(profile);
        Random rad = new Random(System.currentTimeMillis());
        this.entity.setInsertKey(MD5Utils.createHashForUserPassword(rad.toString()));       
        this.entity.setStatusUsuario(UsuarioStatusEnum.PENDENTE);
        validatePassword();

        this.save();
        

    }

    private void validatePassword() throws UserValidationException {
        if ((this.entity.getPassword().equals("") || this.entity.getReTypedPassword().equals(""))
                        && (this.entity.getPasswordHash() != null && this.entity.getPasswordHash().isEmpty())) {

            throw new UserValidationException(BundleUtils.getMessage("usuarios.view.senha.vazia"));

        } else if (!this.entity.getPassword().equals(this.entity.getReTypedPassword())) {

            throw new UserValidationException(BundleUtils.getMessage("usuarios.view.senha.diferente"));
        } else if (!this.entity.getPassword().isEmpty() && !this.entity.getPassword().isEmpty()) {

            String hash = MD5Utils.createHashForUserPassword(this.entity.getPassword());
            this.entity.setPasswordHash(hash);
        }
    }



  
    public void updateUser(Usuario usuario) throws Exception {
        this.entity = usuario;
       
        this.save();
        

    }

	public List<Usuario> findUsersByStatus(Integer id, Integer status) {
		// TODO Auto-generated method stub
		return dao.findUsersByStatus(id, status);
	}

  
    
}

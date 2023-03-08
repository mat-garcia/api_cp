package br.com.hdnit.lotus.domain.entity.access;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * <P><B>Description :</B><BR>
 * The UserPassword class includes the id of a user and password maintained through an encryption algorithm
 * </P>
 * <P>
 * @author <a href="mailto:hdn.lourenco@cflex.com.br">Lourenco</a>
 * @since 28/04/2009
 * @version $Revision: 1.1 $
 */
/**
 * <P><B>Description :</B><BR>
 * UserPassword class associate a user with password 
 * </P>
 * <P>
 * @author <a href="mailto:contato@hdntecnologia.com.brrce 28/04/2009
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "ac_userPassword")
public class UserPassword implements Serializable {

	private static final long serialVersionUID = 7316920008639604373L;

	@Id
	@GeneratedValue
	@Column(name="ID_userPassword")
	private Long id;

	@OneToOne
	@JoinColumn(name="ID_userPassword_user")
	private Usuario user;

	@Column(name = "NM_userPassword_passhash")
	private String passwordHash;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

}

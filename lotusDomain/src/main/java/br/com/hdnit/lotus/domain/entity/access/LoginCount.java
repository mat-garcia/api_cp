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
 * Class to hold the number of failed login tries 
 * </P>
 * <P>
 * @author <a href="mailto:contato@hdntecnologia.com.brrce 01/07/2009
 * @version $Revision: 1.0 $
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ac_loginCount")
public class LoginCount implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "ID_loginCount")
	private Long id;

	@Column(name = "NUM_count")
	private Integer count;

	@OneToOne
	@JoinColumn(name = "ID_user")
	private Usuario user;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

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

}

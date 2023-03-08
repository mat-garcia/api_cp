package br.com.hdnit.lotus.domain.entity.access;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * <P>
 * <B>Description :</B><BR>
 * Class to hold user logged status
 * </P>
 * <P>
 * 
 * @author <a href="mailto:contato@hdntecnologia.com.brrce 01/07/2009
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "ac_loggedStatus")
public class LoggedStatus {

	@Id
	@GeneratedValue
	@Column(name = "ID_loginCount")
	private Long id;

	@Column(name = "BOOL_logged", nullable=false)
	private Boolean logged = Boolean.FALSE;

	@OneToOne
	@JoinColumn(name = "ID_user")
	private Usuario user;

	@Column(name = "DT_LastTime",updatable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastTime;
	
	@Column(name = "NM_sessionKey")	
	private String sessionKey;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getLogged() {
		return logged;
	}

	public void setLogged(Boolean logged) {
		this.logged = logged;
	}
	
	public Usuario getUser() {
		return user;
	}
	
	public void setUser(Usuario user) {
		this.user = user;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

}


package br.com.hdnit.lotus.domain.entity.access;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.domain.entity.enums.UsuarioStatusEnum;

/**
 * <P>
 * <B>Description :</B><BR>
 * The user class has data from a person who can access a system and how it can
 * access through the definition of your profile
 * </P>
 * <P>
 * 
 * @author <a href="mailto:contato@hdntecnologia.com.br</a>
 * @since 28/04/2009
 * @version $Revision: 1.0 $
 */

@Entity
@Table(name = "ac_user", uniqueConstraints = @UniqueConstraint(columnNames = {
                "NM_user_email"}))
@XmlType(name = "user", propOrder = {
                "email", "id", "login", "name", "nickname", "insertKey", "idEmpresa"})
@XmlRootElement
public class Usuario extends AuditTrail {

    private static final long serialVersionUID = -3928789719858753281L;

    public static final UserComparator COMPARATOR_USER = new UserComparator();

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NM_user", length = 50)
    private String name;

    @Column(name = "NM_user_nick", length = 50)
    private String nickname;

    @Column(name = "NM_user_email", length = 50)
    private String email;

    @Column(name = "NM_insert_key", length = 50, updatable = true, insertable = true)
    private String insertKey;

    @OneToOne
    @JoinColumn(name = "ID_user_profile", nullable = true)
    @Fetch(FetchMode.SELECT)
    private Profile profile;

    @Transient
    private String sessionKey;

    @XmlTransient
    @Transient
    private String password;

    @XmlTransient
    @Transient
    private String reTypedPassword;

    @Column(name = "BL_SUPER_ADMIN", nullable = false, columnDefinition = "BOOLEAN")
    private Boolean superAdmin = Boolean.FALSE;

    @Column(name = "NR_cpf", length = 14)
    private String cpf;

    @Column(name = "NR_numero_celular", length = 15)
    private String numeroCelular;

    @Column(name = "NM_userPassword_passhash", length = 50, updatable = true, insertable = true)
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS_USUARIO", nullable = true)
    private UsuarioStatusEnum statusUsuario;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name.trim();
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname != null) {
            this.nickname = nickname.trim();
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email.trim();
        }
    }

   

    @XmlTransient
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Usuario() {
        super();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
     
        return true;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getReTypedPassword() {
        return reTypedPassword;
    }

    public void setReTypedPassword(String reTypedPassword) {
        this.reTypedPassword = reTypedPassword;
    }

    @Override
    public String getLabel() {
        return this.getName();
    }

    @Override
    public void setLabel(String nome) {
        this.setName(nome);
    }

    public Boolean getSuperAdmin() {
        if (superAdmin == null) {
            superAdmin = Boolean.FALSE;
        }
        return superAdmin;
    }

    public void setSuperAdmin(Boolean superAdmin) {
        this.superAdmin = superAdmin;
    }

    public String getInsertKey() {
        return insertKey;
    }

    public void setInsertKey(String insertKey) {
        this.insertKey = insertKey;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public UsuarioStatusEnum getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(UsuarioStatusEnum statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

}

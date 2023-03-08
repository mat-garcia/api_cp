
package br.com.hdnit.lotus.domain.entity.config;

import java.math.BigDecimal;

import javax.persistence.Basic;
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
import org.hibernate.envers.Audited;

import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.domain.entity.Configuracao;
import br.com.hdnit.lotus.domain.entity.enums.UsuarioStatusEnum;



@Entity
@Table(name = "lt_usuariosistema")
@XmlRootElement
public class UsuariosistemaConfig extends Configuracao {

    private static final long serialVersionUID = -3928789719858753281L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "IDUSUARIO", nullable = false, precision = 22)
    private Long idusuario;
    @Basic(optional = false)
    @Column(name = "NOMEUSUARIO", nullable = false, length = 20)
    private String nomeusuario;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}
	public String getNomeusuario() {
		return nomeusuario;
	}
	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}
  
	public String getLabel() {
		return this.getId() + " - " + this.getNomeusuario();
	}

}

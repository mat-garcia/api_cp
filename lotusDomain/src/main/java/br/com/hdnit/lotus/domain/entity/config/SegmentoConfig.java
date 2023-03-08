
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
@Table(name = "lt_segmento")
@XmlRootElement
public class SegmentoConfig extends Configuracao {

    private static final long serialVersionUID = -3928789719858753281L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

  
    @Basic(optional = false)
    @Column(name = "CODSEGMENTO", nullable = false, length = 10)
    private String codsegmento;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCodsegmento() {
		return codsegmento;
	}


	public void setCodsegmento(String codsegmento) {
		this.codsegmento = codsegmento;
	}

	public String getLabel() {
		return this.getCodsegmento() + " - " + this.getDescricao();
	}

}

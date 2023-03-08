
package br.com.hdnit.lotus.domain.entity.config;

import java.math.BigInteger;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.hdnit.lotus.domain.entity.Configuracao;



@Entity
@Table(name = "lt_tarifa")
@XmlRootElement
public class TarifaConfig extends Configuracao {

    private static final long serialVersionUID = -3928789719858753281L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Basic(optional = false)
    @Column(name = "IDTARIFA", nullable = false)
    private BigInteger idtarifa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigInteger getIdtarifa() {
		return idtarifa;
	}

	public void setIdtarifa(BigInteger idtarifa) {
		this.idtarifa = idtarifa;
	}
  
	public String getLabel() {
		return this.getCodigoReduzido() + " - " + this.getDescricao();
	}
    
}

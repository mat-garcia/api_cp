
package br.com.hdnit.lotus.domain.entity.config;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.hdnit.lotus.domain.entity.Configuracao;



@Entity
@Table(name = "lt_tratamento")
@XmlRootElement
public class TratamentoConfig extends Configuracao {

    private static final long serialVersionUID = -3928789719858753281L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Basic(optional = false)
    @Column(name = "CODTRATAMENTO", nullable = false, length = 20)
    private String codtratamento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodtratamento() {
		return codtratamento;
	}

	public void setCodtratamento(String codtratamento) {
		this.codtratamento = codtratamento;
	}
    
	public String getLabel() {
		return this.getCodtratamento() + " - " + this.getDescricao();
	}
}

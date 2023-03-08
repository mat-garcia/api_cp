
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
@Table(name = "lt_faixaetaria")
@XmlRootElement
public class FaixaEtariaConfig extends Configuracao {

    private static final long serialVersionUID = -3928789719858753281L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;
   
    @Column(name = "IDFAIXAETARIA", nullable = true, precision = 22)
    private Long idfaixaetaria;

    @Column(name = "IDFAIXAETARIA_MENOR", nullable = true, precision = 22)
    private Long idfaixaetariamenor;

    @Column(name = "DESCRICAO_MENOR", nullable = true)
    @Audited
    protected String descricaoMenor;
 
    @Column(name = "COD_REDUZIDO_MENOR", nullable = true)
    @Audited
    protected String codigoReduzidoMenor;

    @Column(name = "IDFAIXAETARIA_MENOR_2", nullable = true, precision = 22)
    private Long idfaixaetariamenorChd2;

    @Column(name = "DESCRICAO_MENOR_2", nullable = true)
    @Audited
    protected String descricaoMenorChd2;
 
    @Column(name = "COD_REDUZIDO_MENOR_2", nullable = true)
    @Audited
    protected String codigoReduzidoMenorChd2;

    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getIdfaixaetaria() {
		return idfaixaetaria;
	}

	public void setIdfaixaetaria(Long idfaixaetaria) {
		this.idfaixaetaria = idfaixaetaria;
	}
   
	public String getLabel() {
		return this.getCodigoReduzido() + " - " + this.getDescricao();
	}

	public String getLabelMenor() {
		return this.getCodigoReduzidoMenor() + " - " + this.getDescricaoMenor();
	}

	public String getLabelMenor2() {
		return this.getCodigoReduzidoMenorChd2() + " - " + this.getDescricaoMenorChd2();
	}
	public Long getIdfaixaetariamenor() {
		return idfaixaetariamenor;
	}

	public void setIdfaixaetariamenor(Long idfaixaetariamenor) {
		this.idfaixaetariamenor = idfaixaetariamenor;
	}

	public String getDescricaoMenor() {
		return descricaoMenor;
	}

	public void setDescricaoMenor(String descricaoMenor) {
		this.descricaoMenor = descricaoMenor;
	}

	public String getCodigoReduzidoMenor() {
		return codigoReduzidoMenor;
	}

	public void setCodigoReduzidoMenor(String codigoReduzidoMenor) {
		this.codigoReduzidoMenor = codigoReduzidoMenor;
	}

	public Long getIdfaixaetariamenorChd2() {
		return idfaixaetariamenorChd2;
	}

	public void setIdfaixaetariamenorChd2(Long idfaixaetariamenorChd2) {
		this.idfaixaetariamenorChd2 = idfaixaetariamenorChd2;
	}

	public String getDescricaoMenorChd2() {
		return descricaoMenorChd2;
	}

	public void setDescricaoMenorChd2(String descricaoMenorChd2) {
		this.descricaoMenorChd2 = descricaoMenorChd2;
	}

	public String getCodigoReduzidoMenorChd2() {
		return codigoReduzidoMenorChd2;
	}

	public void setCodigoReduzidoMenorChd2(String codigoReduzidoMenorChd2) {
		this.codigoReduzidoMenorChd2 = codigoReduzidoMenorChd2;
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.domain.entity.corporativo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Moeda;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "MOEDA_PARCEIRO")
@XmlRootElement
public class MoedaParceiro extends AuditTrail {
   
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	
	@Column(name = "MOEDA", nullable = false)
	private String moeda;

	@Column(name = "DESCRICAO", length = 255)
    private String descricao;
    
	
	@Column(name = "ID_PMS", nullable = true)
	private Integer idPms;
	
	
    @Column(name = "DESCRICAO_PMS", length = 255)
    private String descricaoPms;
    
    
    @Transient
    private Moeda moedaSelecionada = null;
	
    
    public MoedaParceiro() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Integer getIdPms() {
		return idPms;
	}

	public void setIdPms(Integer idPms) {
		this.idPms = idPms;
	}

	public String getDescricaoPms() {
		return descricaoPms;
	}

	public void setDescricaoPms(String descricaoPms) {
		this.descricaoPms = descricaoPms;
	}


	public void setMoedaSelecionada(Moeda moedaSelecionada) {
		this.moedaSelecionada = moedaSelecionada;
	    this.setIdPms(this.moedaSelecionada.getMoecodigo().intValue());
	    this.setDescricaoPms(this.moedaSelecionada.getMoedesc());	    
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public Moeda getMoedaSelecionada() {
		return moedaSelecionada;
	}

	


}

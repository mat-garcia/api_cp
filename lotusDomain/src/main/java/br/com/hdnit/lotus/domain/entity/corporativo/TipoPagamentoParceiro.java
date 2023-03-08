/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.domain.entity.corporativo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.hdnit.lotus.domain.entity.Configuracao;
import br.com.hdnit.lotus.domain.entity.enums.TipoWSEnum;
import br.com.hdnit.lotus.pms.lpp.dto.LphDebitos;
import br.com.hdnit.lotus.pms.lpp.dto.LphPensao;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "tipopgto_parceiro")
@XmlRootElement
public class TipoPagamentoParceiro extends Configuracao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	public TipoWSEnum getTipoWS() {
		return tipoWS;
	}

	public void setTipoWS(TipoWSEnum tipoWS) {
		this.tipoWS = tipoWS;
	}

	@Column(name = "COD_EXTERNO", nullable = true)
	private String codigoExterno;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_WS", nullable = true)
	private TipoWSEnum tipoWS;

	@Column(name = "CODPGTO", nullable = false, length = 20)
	private String codpgto;

	@Column(name = "DESCRICAOPGTO", nullable = false, length = 50)
	private String descricaopgto;
	
	@OneToOne
	@JoinColumn(name = "ID_PARCEIRO", nullable = true)
	@Fetch(FetchMode.SELECT)
	private Parceiro parceiro;

	@Column(name = "BL_DEFAULT", nullable = false, columnDefinition = "BOOLEAN")
	private Boolean padrao = Boolean.FALSE;


	@Transient
	private LphDebitos debitoLph = null;

	public TipoPagamentoParceiro() {
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

	public LphDebitos getDebitoLph() {
		return debitoLph;
	}

	public String getCodpgto() {
		return codpgto;
	}

	public void setCodpgto(String codpgto) {
		this.codpgto = codpgto;
	}

	public String getDescricaopgto() {
		return descricaopgto;
	}

	public void setDescricaopgto(String descricaopgto) {
		this.descricaopgto = descricaopgto;
	}

	public void setDebitoLph(LphDebitos debitoLph) {
		this.debitoLph = debitoLph;
		if (this.debitoLph != null) {
			this.setCodpgto(this.debitoLph.getCODIGO());
			this.setDescricaopgto(this.debitoLph.getDESCRI());
			this.setDescricao(this.debitoLph.getDESCRI());
		}
	}

	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	@Transient
	public Boolean getOmnibees() {
		return this.getTipoWS() != null && this.getTipoWS().equals(TipoWSEnum.OMINIBEES);
	}

	public Parceiro getParceiro() {
		return parceiro;
	}

	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	public Boolean getPadrao() {
		return padrao;
	}

	public void setPadrao(Boolean padrao) {
		this.padrao = padrao;
	}

}

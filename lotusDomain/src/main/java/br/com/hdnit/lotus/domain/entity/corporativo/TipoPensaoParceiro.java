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
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.hdnit.lotus.domain.entity.Configuracao;
import br.com.hdnit.lotus.domain.entity.enums.TipoPensaoEnum;
import br.com.hdnit.lotus.domain.entity.enums.TipoWSEnum;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Pensaofront;
import br.com.hdnit.lotus.pms.lpp.dto.LphPensao;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "tipopensao_parceiro")
@XmlRootElement
public class TipoPensaoParceiro extends Configuracao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(name = "COD_EXTERNO", nullable = false)
	private TipoPensaoEnum tipoPensao;

	public TipoWSEnum getTipoWS() {
		return tipoWS;
	}

	public void setTipoWS(TipoWSEnum tipoWS) {
		this.tipoWS = tipoWS;
	}

	@Column(name = "COD_EXTERNO_STR", nullable = true)
	private String codigoExterno;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_WS", nullable = true)
	private TipoWSEnum tipoWS;

	@Column(name = "CODPENSAO", nullable = false, length = 5)
	private String codpensao;
	@Basic(optional = false)
	@Column(name = "CODPENSAOCM", nullable = false)
	private Character codpensaocm;

	@Transient
	private Pensaofront tipoPensaoSelecionado = null;

	@Transient
	private LphPensao tipoPensaoSelecionadoLph = null;

	public TipoPensaoParceiro() {
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

	public TipoPensaoEnum getTipoPensao() {
		return tipoPensao;
	}

	public void setTipoPensao(TipoPensaoEnum tipoPensao) {
		this.tipoPensao = tipoPensao;
	}

	public String getCodpensao() {
		return codpensao;
	}

	public void setCodpensao(String codpensao) {
		this.codpensao = codpensao;
	}

	public Character getCodpensaocm() {
		return codpensaocm;
	}

	public void setCodpensaocm(Character codpensaocm) {
		this.codpensaocm = codpensaocm;
	}

	public Pensaofront getTipoPensaoSelecionado() {
		return tipoPensaoSelecionado;
	}

	public void setTipoPensaoSelecionado(Pensaofront tipoPensaoSelecionado) {
		this.tipoPensaoSelecionado = tipoPensaoSelecionado;
		this.setCodpensao(this.tipoPensaoSelecionado.getCodpensao());
		this.setCodpensaocm(this.tipoPensaoSelecionado.getCodpensaocm());

		this.setDescricao(this.tipoPensaoSelecionado.getDescricao());

	}

	public String getLabel() {
		return this.getCodpensao() + " - " + this.getDescricao();
	}

	public LphPensao getTipoPensaoSelecionadoLph() {
		return tipoPensaoSelecionadoLph;
	}

	public void setTipoPensaoSelecionadoLph(LphPensao tipoPensaoSelecionadoLph) {
		this.tipoPensaoSelecionadoLph = tipoPensaoSelecionadoLph;
		this.setCodpensao(this.tipoPensaoSelecionadoLph.getCODIGO());
		this.setCodpensaocm('c');

		this.setDescricao(this.tipoPensaoSelecionadoLph.getDESCRICAO());

	}

	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	@Transient
	public Boolean getOmnibees() {
		return this.getTipoWS() != null
				&& this.getTipoWS().equals(TipoWSEnum.OMINIBEES);
	}
	@Transient
	public Boolean getHsLatam() {
		return this.getTipoWS() != null
				&& this.getTipoWS().equals(TipoWSEnum.HSLATAM);
	}

}

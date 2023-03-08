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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipouh;
import br.com.hdnit.lotus.pms.lpp.dto.LphTipoUH;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "tipouh_parceiro")
@XmlRootElement
public class TipoUhParceiro extends AuditTrail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "COD_TIPO_APTO", nullable = false)
	private String codTipoAptoExterno;

	@Column(name = "ID_PMS", nullable = true)
	private Integer idPms;

	@Column(name = "DESCRICAO", length = 60)
	private String descricao;

	@Column(name = "DESCRICAO_PMS", length = 60)
	private String descricaoPms;

	@Column(name = "CODREDUZIDO", length = 4)
	private String codreduzido;

	@Transient
	private Tipouh tipoUhSelecionado = null;

	@Transient
	private LphTipoUH tipoUhSelecionadoLph = null;

	@OneToOne
	@JoinColumn(name = "ID_PARCEIRO", nullable = true)
	@Fetch(FetchMode.SELECT)
	private Parceiro parceiro;

	@OneToOne
	@JoinColumn(name = "ID_CANAL", nullable = true)
	@Fetch(FetchMode.SELECT)
	private Canal canal;

	@OneToOne
	@JoinColumn(name = "ID_CANAL_HOTEL", nullable = true)
	@Fetch(FetchMode.SELECT)
	private CanalHotel canalHotel;
	
	@Column(name = "QTDE_MIN_DISP", nullable = true)
	private Integer qtdeMinDisp;

	public TipoUhParceiro() {
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

	public String getCodreduzido() {
		return codreduzido;
	}

	public void setCodreduzido(String codreduzido) {
		this.codreduzido = codreduzido;
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

	@Transient
	public Tipouh getTipoUhSelecionado() {
		return tipoUhSelecionado;
	}

	public void setTipoUhSelecionado(Tipouh tipoUhSelecionado) {
		this.tipoUhSelecionado = tipoUhSelecionado;
		this.setIdPms(this.tipoUhSelecionado.getTipouhPK().getIdtipouh().intValue());
		this.setDescricaoPms(this.tipoUhSelecionado.getDescricao());
		this.setCodreduzido(this.tipoUhSelecionado.getCodreduzido());
	}

	public String getCodTipoAptoExterno() {
		return codTipoAptoExterno;
	}

	public void setCodTipoAptoExterno(String codTipoAptoExterno) {
		this.codTipoAptoExterno = codTipoAptoExterno;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	public Parceiro getParceiro() {
		return parceiro;
	}

	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	public CanalHotel getCanalHotel() {
		return canalHotel;
	}

	public void setCanalHotel(CanalHotel canalHotel) {
		this.canalHotel = canalHotel;
	}

	public LphTipoUH getTipoUhSelecionadoLph() {
		return tipoUhSelecionadoLph;
	}

	public void setTipoUhSelecionadoLph(LphTipoUH tipoUhSelecionadoLph) {
		this.tipoUhSelecionadoLph = tipoUhSelecionadoLph;
		this.setIdPms(this.tipoUhSelecionadoLph.getSEQUENCIA());
		this.setDescricaoPms(this.tipoUhSelecionadoLph.getDESCRICAO());
		this.setCodreduzido(this.tipoUhSelecionadoLph.getCODIGO());
	}

	public Integer getQtdeMinDisp() {
		return qtdeMinDisp;
	}

	public void setQtdeMinDisp(Integer qtdeMinDisp) {
		this.qtdeMinDisp = qtdeMinDisp;
	}

}

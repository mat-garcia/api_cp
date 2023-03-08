/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hdnit.lotus.domain.entity.corporativo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;

import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.domain.entity.config.TipoDebitoConfigEmpresa;
import br.com.hdnit.lotus.domain.entity.enums.TipoPMSEnum;
import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.foundation.util.StatusReservaPMSEnum;

/**
 * 
 * @author hdn
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
public class Empresa extends AuditTrail {
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", idEmpresaPai=" + idEmpresaPai + ", cnpj=" + cnpj + ", nomeFantasia="
				+ nomeFantasia + ", tipoDataSource=" + tipoDataSource + ", horaCheckIn=" + horaCheckIn
				+ ", horaCheckOut=" + horaCheckOut + ", bl_habilita_bee2pay=" + habilitarBee2Pay + "]";
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@JoinColumn(name = "ID_EMPRESA_PAI", referencedColumnName = "ID")
	@OneToOne
	private Empresa idEmpresaPai;

	@Column(name = "CNPJ")
	@JsonIgnore
	private String cnpj;
	
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;

	@Column(name = "REPRESENTANTE_LEGAL")
	@JsonIgnore
	private String representanteLegal;

	@Enumerated(EnumType.STRING)
	@Column(name = "RETAGUARDA_DATASOURCE", nullable = true)
	private DataSourceEnum tipoDataSource;

	@Column(name = "RETAGUARDA_ESQUEMA", nullable = true)
	private String retaguardaEsquema;

	
	@Column(name = "RETAGUARDA_JDBC", nullable = true)
	private String retaguardaJdbc;

	@Column(name = "RETAGUARDA_USER", nullable = true)
	private String retaguardaUser;

	@Column(name = "RETAGUARDA_PWD", nullable = true)
	private String retaguardaPwd;

	@Column(name = "RETAGUARDA_ID", nullable = true)
	private String retaguardaId;

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS_RESERVA", nullable = true)
	private StatusReservaPMSEnum statusReserva;

	public TipoPMSEnum getTipoPms() {
		return tipoPms;
	}

	public void setTipoPms(TipoPMSEnum tipoPms) {
		this.tipoPms = tipoPms;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_PMS", nullable = true)
	private TipoPMSEnum tipoPms;

	
	@Temporal(TemporalType.TIME)
	@Column(name = "HORA_CHECKIN", nullable = false)
	private Date horaCheckIn;

	@Temporal(TemporalType.TIME)
	@Column(name = "HORA_CHECKOUT", nullable = false)
	private Date horaCheckOut;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULT_SINCRONIA", nullable = true)
	private Date dtSincronia;

	@Column(name = "BL_ATIVO", nullable = false, columnDefinition = "BOOLEAN")
	private Boolean integracaoAtiva = Boolean.FALSE;
	
	@Column(name = "BL_CARTAO", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean integraDadosCartao = Boolean.FALSE;
	
	@Column(name = "BL_OBS", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean integraDadosObs = Boolean.FALSE;
	
	@Column(name = "BL_COD_PROMOCIONAL", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean integraCodPromocional = Boolean.FALSE;
	
	@Column(name = "BL_SERVICO", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean integraServico = Boolean.FALSE;
	
	@Column(name = "BL_ATL_PRG", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean integraAltProgramada = Boolean.FALSE;

	@Column(name = "BL_ALT_RES", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean integraAltReserva = Boolean.FALSE;
	
	@Column(name = "BL_FORM_PGTO", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean integraFormaPgto = Boolean.FALSE;
	
	@Column(name = "BL_HABILITA_BEE2PAY", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean habilitarBee2Pay = Boolean.FALSE;
		
	public Boolean getIntegraFormaPgto() {
		return integraFormaPgto;
	}

	public void setIntegraFormaPgto(Boolean integraFormaPgto) {
		this.integraFormaPgto = integraFormaPgto;
	}

	public Boolean getIntegraAltReserva() {
		return integraAltReserva;
	}

	public void setIntegraAltReserva(Boolean integraAltReserva) {
		this.integraAltReserva = integraAltReserva;
	}

	public Boolean getIntegracaoAtiva() {
		return integracaoAtiva;
	}

	public void setIntegracaoAtiva(Boolean integracaoAtiva) {
		this.integracaoAtiva = integracaoAtiva;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Empresa getIdEmpresaPai() {
		return idEmpresaPai;
	}

	public void setIdEmpresaPai(Empresa idEmpresaPai) {
		this.idEmpresaPai = idEmpresaPai;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRepresentanteLegal() {
		return representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	public DataSourceEnum getTipoDataSource() {
		return tipoDataSource;
	}

	public void setTipoDataSource(DataSourceEnum tipoDataSource) {
		this.tipoDataSource = tipoDataSource;
	}

	public String getRetaguardaJdbc() {
		return retaguardaJdbc;
	}

	public void setRetaguardaJdbc(String retaguardaJdbc) {
		this.retaguardaJdbc = retaguardaJdbc;
	}

	public String getRetaguardaUser() {
		return retaguardaUser;
	}

	public void setRetaguardaUser(String retaguardaUser) {
		this.retaguardaUser = retaguardaUser;
	}

	public String getRetaguardaPwd() {
		return retaguardaPwd;
	}

	public void setRetaguardaPwd(String retaguardaPwd) {
		this.retaguardaPwd = retaguardaPwd;
	}

	public String getRetaguardaId() {
		return retaguardaId;
	}

	public void setRetaguardaId(String retaguardaId) {
		this.retaguardaId = retaguardaId;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRetaguardaEsquema() {
		return retaguardaEsquema;
	}

	public void setRetaguardaEsquema(String retaguardaEsquema) {
		this.retaguardaEsquema = retaguardaEsquema;
	}

	public Date getHoraCheckIn() {
		return horaCheckIn;
	}

	public void setHoraCheckIn(Date horaCheckIn) {
		this.horaCheckIn = horaCheckIn;
	}

	public Date getHoraCheckOut() {
		return horaCheckOut;
	}

	public void setHoraCheckOut(Date horaCheckOut) {
		this.horaCheckOut = horaCheckOut;
	}

	
	public Date getDtSincronia() {
		return dtSincronia;
	}

	public void setDtSincronia(Date dtSincronia) {
		this.dtSincronia = dtSincronia;
	}

	public StatusReservaPMSEnum getStatusReserva() {
		return statusReserva;
	}

	public void setStatusReserva(StatusReservaPMSEnum statusReserva) {
		this.statusReserva = statusReserva;
	}
	
	public Boolean getHabilitarBee2Pay() {
		return habilitarBee2Pay;
	}

	public void setHabilitarBee2Pay(Boolean habilitarBee2Pay) {
		this.habilitarBee2Pay = habilitarBee2Pay;
	}

	public String getLabel(){
		return this.getNomeFantasia();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Empresa other = (Empresa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Boolean getIntegraDadosCartao() {
		return integraDadosCartao;
	}

	public void setIntegraDadosCartao(Boolean integraDadosCartao) {
		this.integraDadosCartao = integraDadosCartao;
	}

	public Boolean getIntegraDadosObs() {
		return integraDadosObs;
	}

	public void setIntegraDadosObs(Boolean integraDadosObs) {
		this.integraDadosObs = integraDadosObs;
	}
	
	public Boolean getIntegraCodPromocional() {
		return integraCodPromocional;
	}

	public void setIntegraCodPromocional(Boolean integraCodPromocional) {
		this.integraCodPromocional = integraCodPromocional;
	}

	public Boolean getIntegraServico() {
		return integraServico;
	}

	public void setIntegraServico(Boolean integraServico) {
		this.integraServico = integraServico;
	}

	public Boolean getIntegraAltProgramada() {
		return integraAltProgramada;
	}

	public void setIntegraAltProgramada(Boolean integraAltProgramada) {
		this.integraAltProgramada = integraAltProgramada;
	}
	
	@Transient
	public Boolean getLpp() {
		return this.getTipoPms() != null && this.getTipoPms().equals(TipoPMSEnum.LPH);
	}

	
}

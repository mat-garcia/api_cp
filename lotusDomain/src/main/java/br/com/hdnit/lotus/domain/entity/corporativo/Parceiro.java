/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hdnit.lotus.domain.entity.corporativo;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.envers.NotAudited;

import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.domain.entity.enums.TipoWSEnum;

/**
 * 
 * @author hdn
 */
@Entity
@Table(name = "parceiro")
@XmlRootElement 
public class Parceiro extends AuditTrail {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "COD_PARCEIRO")
	private String codParceiro;

	@Column(name = "NOME_PARCEIRO")
	private String nomeParceiro;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_WS", nullable = false)
	private TipoWSEnum tipoWS;

	@Column(name = "WS_ENDPOINT", nullable = false)
	private String wsEndPoint;

	@Column(name = "WS_USER_CODE", nullable = false)
	private String wsUserCode;

	@Column(name = "WS_USER", nullable = false)
	private String wsUser;

	@Column(name = "WS_PWD", nullable = false)
	private String wsPwd;
	
	@Column(name = "CODIGO_HOTEL", nullable = false)
	private String codigoHotel;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULT_SINCRONIA", nullable = true)
	private Date dtSincronia;

	@Column(name = "BL_ATIVO", nullable = false, columnDefinition = "BOOLEAN")
	private Boolean integracaoAtiva = Boolean.FALSE;
	
	@Column(name = "QTDE_DIAS_DISP")
	private Integer qtdeDiasDisp;

	@Column(name = "TOT_DIAS_DISP")
	private Integer totDiasDisp;
	
	@Column(name = "ID_ROBO")
	private Integer idRobo;
	
	@Column(name = "ENVIA_DISPONIBILIDADE", nullable = false, columnDefinition = "BOOLEAN")
	private Boolean enviaDisponibilidade = Boolean.FALSE;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodParceiro() {
		return codParceiro;
	}

	public void setCodParceiro(String codParceiro) {
		this.codParceiro = codParceiro;
	}

	public String getNomeParceiro() {
		return nomeParceiro;
	}

	public void setNomeParceiro(String nomeParceiro) {
		this.nomeParceiro = nomeParceiro;
	}

	public TipoWSEnum getTipoWS() {
		return tipoWS;
	}

	public void setTipoWS(TipoWSEnum tipoWS) {
		this.tipoWS = tipoWS;
	}

	public String getWsEndPoint() {
		return wsEndPoint;
	}

	public void setWsEndPoint(String wsEndPoint) {
		this.wsEndPoint = wsEndPoint;
	}

	public String getWsUserCode() {
		return wsUserCode;
	}

	public void setWsUserCode(String wsUserCode) {
		this.wsUserCode = wsUserCode;
	}

	public String getWsUser() {
		return wsUser;
	}

	public void setWsUser(String wsUser) {
		this.wsUser = wsUser;
	}

	public String getWsPwd() {
		return wsPwd;
	}

	public void setWsPwd(String wsPwd) {
		this.wsPwd = wsPwd;
	}

	public Date getDtSincronia() {
		return dtSincronia;
	}

	public void setDtSincronia(Date dtSincronia) {
		this.dtSincronia = dtSincronia;
	}

	public Boolean getIntegracaoAtiva() {
		return integracaoAtiva;
	}

	public void setIntegracaoAtiva(Boolean integracaoAtiva) {
		this.integracaoAtiva = integracaoAtiva;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getLabel() {
		return this.getNomeParceiro();
	}

	public String getCodigoHotel() {
		return codigoHotel;
	}

	public void setCodigoHotel(String codigoHotel) {
		this.codigoHotel = codigoHotel;
	}

	public Integer getQtdeDiasDisp() {
		return qtdeDiasDisp;
	}

	public void setQtdeDiasDisp(Integer qtdeDiasDisp) {
		this.qtdeDiasDisp = qtdeDiasDisp;
		
		if (qtdeDiasDisp == null) {
			this.qtdeDiasDisp = 30;
		}
	}
	
	public Integer getTotDiasDisp() {
		return totDiasDisp;
	}

	public void setTotDiasDisp(Integer totDiasDisp) {
		this.totDiasDisp = totDiasDisp;
		
		if (totDiasDisp == null) {
			this.totDiasDisp = 365;
		}
	}

	public Boolean getEnviaDisponibilidade() {
		return enviaDisponibilidade;
	}

	public void setEnviaDisponibilidade(Boolean enviaDisponibilidade) {
		this.enviaDisponibilidade = enviaDisponibilidade;
	}
	
	public Integer getIdRobo() {
		return idRobo;
	}

	public void setIdRobo(Integer idRobo) {
		this.idRobo = idRobo;
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
		Parceiro other = (Parceiro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Parceiro [id=" + id + ", codParceiro=" + codParceiro + ", nomeParceiro=" + nomeParceiro + ", tipoWS="
				+ tipoWS + ", wsEndPoint=" + wsEndPoint + ", wsUserCode=" + wsUserCode + ", wsUser=" + wsUser
				+ ", wsPwd=" + wsPwd + ", codigoHotel=" + codigoHotel + ", dtSincronia=" + dtSincronia + 
				", qtdeDiasDisp=" + qtdeDiasDisp + ", totDiasDisp=" + totDiasDisp + 
				", enviaDisponibilidade=" + enviaDisponibilidade +"]";
	}

}

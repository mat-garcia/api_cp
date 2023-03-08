/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hdnit.lotus.domain.entity.corporativo;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.hdnit.lotus.domain.entity.AuditTrail;

/**
 * 
 * @author hdn
 */
@Entity
@Table(name = "error_log")
@XmlRootElement
public class ErrorLog extends AuditTrail {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "ACAO", nullable = false)
	private String acao;

	@Column(name = "ERROR", nullable = true, length = 2000)
	private String error;

	@Column(name = "LOCALIZADOR", nullable = false)
	private String localizador;

	@Column(name = "LOCALIZADOR_EXTRAS", nullable = false)
	private String localizadorExtras;

	@Column(name = "NOME_PARCEIRO", nullable = false)
	private String nomeParceiro;
	
	@Column(name = "NOME_CANAL", nullable = false)
	private String nomeCanal;
	
	@Column(name = "HOSPEDE", nullable = false)
	private String hospede;
	
	@Column(name = "NUMERO_RESERVA_PMS", nullable = true)
	private String numeroReservaPms;

	@Column(name = "DT_OPERACAO", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataOperacao;
	
	@Column(name = "DT_CHEGADA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataChegada;

	@Column(name = "DT_SAIDA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataSaida;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

/*
 * To change this template, choose Tools | Templates
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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.hdnit.lotus.domain.entity.AuditTrail;

/**
 * 
 * @author hdn
 */
@Entity
@Table(name = "canal")
@XmlRootElement
public class Canal extends AuditTrail {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Canal [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", idWeb=");
		builder.append(idWeb);
		builder.append(", idWebPCC=");
		builder.append(idWebPCC);
		builder.append("]");
		return builder.toString();
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "ID_WEB", nullable = true)
	private Integer idWeb;

	@ManyToOne
	@JoinColumn(name = "ID_PARCEIRO", nullable = true)
	@Fetch(FetchMode.SELECT)
	private Parceiro parceiro;

	
	@Column(name = "OBSERVACAO", nullable = true)
	private String observacao;
	
	@Column(name = "ID_WEB_PCC", nullable = true)
	private String idWebPCC;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdWeb() {
		return idWeb;
	}

	public void setIdWeb(Integer idWeb) {
		this.idWeb = idWeb;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Parceiro getParceiro() {
		return parceiro;
	}

	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	public String getIdWebPCC() {
		return idWebPCC;
	}

	public void setIdWebPCC(String idWebPCC) {
		this.idWebPCC = idWebPCC;
	}
	
}

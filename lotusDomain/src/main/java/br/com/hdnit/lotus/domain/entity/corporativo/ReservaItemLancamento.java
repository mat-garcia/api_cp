/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hdnit.lotus.domain.entity.corporativo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.envers.Audited;



/**
 * 
 * @author hdn
 */
@Entity
@Table(name = "reserva_item_lancamento")
@XmlRootElement
//@Audited
public class ReservaItemLancamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "ID_RESERVA_ITEM")
	@JsonIgnore
	private ReservaItem reservaItem;

	@Column(name = "VALOR_LANCAMENTO", nullable = true)
	private String valorLancamento;
	
	@Column(name = "DT_LANCAMENTO", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataLancamento;

	@Column(name = "CODIGO_EXTERNO_LANCAMENTO", nullable = false)
	private String codigoExternoLancamento;

	@Column(name = "NSU", nullable = false)
	private String codigoNsu;

	@Column(name = "DOCUMENT")
	private String documento;

	@Column(name = "TRANSACAO")
	private String transacao;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ReservaItem getReservaItem() {
		return reservaItem;
	}

	public void setReservaItem(ReservaItem reservaItem) {
		this.reservaItem = reservaItem;
	}

	public String getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(String valorLancamento) {
		this.valorLancamento = valorLancamento;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getCodigoExternoLancamento() {
		return codigoExternoLancamento;
	}

	public void setCodigoExternoLancamento(String codigoExternoLancamento) {
		this.codigoExternoLancamento = codigoExternoLancamento;
	}

	public String getCodigoNsu() {
		return codigoNsu;
	}

	public void setCodigoNsu(String codigoNsu) {
		this.codigoNsu = codigoNsu;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTransacao() {
		return transacao;
	}

	public void setTransacao(String transacao) {
		this.transacao = transacao;
	}


	
}

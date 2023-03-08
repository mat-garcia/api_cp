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
@Table(name = "reserva_item_valor")
@XmlRootElement
//@Audited
public class ReservaItemValor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReservaItemValor [id=");
		builder.append(id);
		builder.append(", reservaItem=");
		builder.append(reservaItem);
		builder.append(", valorDiaria=");
		builder.append(valorDiaria);
		builder.append(", dataDiaria=");
		builder.append(dataDiaria);
		builder.append("]");
		return builder.toString();
	}

	@ManyToOne
	@JoinColumn(name = "ID_RESERVA_ITEM")
	@JsonIgnore
	private ReservaItem reservaItem;

	@Column(name = "VALOR_DIARIA", nullable = true)
	private String valorDiaria;
	
	@Column(name = "DT_DIARIA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDiaria;

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

	public String getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(String valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Date getDataDiaria() {
		return dataDiaria;
	}

	public void setDataDiaria(Date dataDiaria) {
		this.dataDiaria = dataDiaria;
	}

	
}

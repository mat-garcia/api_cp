/*
 * 
 */

package br.com.hdnit.lotus.domain.entity.config;

import java.math.BigInteger;

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
import br.com.hdnit.lotus.domain.entity.corporativo.CanalHotel;

// TODO: Auto-generated Javadoc
/**
 * The Class MensagemDTO.
 */
@Entity
@Table(name = "tipo_debito_config")
@XmlRootElement
public class TipoDebitoConfig extends  AuditTrail {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "ID_CANAL_HOTEL", nullable = false)
	@Fetch(FetchMode.SELECT)
	private CanalHotel canalHotel;
	
    /** The titulo. */
	@Column(name = "IDTIPODEBCRED", nullable = false)
    private Integer IDTIPODEBCRED;
    
   
    	/** The mensagem. */
	@Column(name = "DESCRICAO", nullable = true)
    private String DESCRICAO;
 
    
    public String getLabel() {
		return DESCRICAO;
	}


	public Integer getIDTIPODEBCRED() {
		return IDTIPODEBCRED;
	}


	public void setIDTIPODEBCRED(Integer iDTIPODEBCRED) {
		IDTIPODEBCRED = iDTIPODEBCRED;
	}


	public String getDESCRICAO() {
		return DESCRICAO;
	}


	public void setDESCRICAO(String dESCRICAO) {
		DESCRICAO = dESCRICAO;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public CanalHotel getCanalHotel() {
		return canalHotel;
	}


	public void setCanalHotel(CanalHotel canalHotel) {
		this.canalHotel = canalHotel;
	}

   


    
}

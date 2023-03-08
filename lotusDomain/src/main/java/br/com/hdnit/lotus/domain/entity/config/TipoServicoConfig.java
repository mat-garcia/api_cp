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
@Table(name = "tipo_servico_config")
@XmlRootElement
public class TipoServicoConfig extends  AuditTrail {

	

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
	@Column(name = "IDSERVICOHOTEL", nullable = false)
    private Integer IDSERVICOHOTEL;

    /** The titulo. */
	@Column(name = "IDTIPODEBCRED", nullable = true)
    private Integer IDTIPODEBCRED;

	
    /** The titulo. */
	@Column(name = "VALOROUTRAMOEDA", nullable = true)
    private Integer VALOROUTRAMOEDA;
    
   
    	/** The mensagem. */
	@Column(name = "DESCRICAO", nullable = true)
    private String DESCRICAO;
 
	
 	/** The mensagem. */
	@Column(name = "CODIGO", nullable = true)
    private String CODIGO;
 
    
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


	public Integer getIDSERVICOHOTEL() {
		return IDSERVICOHOTEL;
	}


	public void setIDSERVICOHOTEL(Integer iDSERVICOHOTEL) {
		IDSERVICOHOTEL = iDSERVICOHOTEL;
	}


	public Integer getVALOROUTRAMOEDA() {
		return VALOROUTRAMOEDA;
	}


	public void setVALOROUTRAMOEDA(Integer vALOROUTRAMOEDA) {
		VALOROUTRAMOEDA = vALOROUTRAMOEDA;
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
		TipoServicoConfig other = (TipoServicoConfig) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	public String getCODIGO() {
		return CODIGO;
	}


	public void setCODIGO(String cODIGO) {
		CODIGO = cODIGO;
	}

   


    
}

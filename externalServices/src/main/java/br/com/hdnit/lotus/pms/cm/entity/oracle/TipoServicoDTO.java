/*
 * 
 */

package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

// TODO: Auto-generated Javadoc
/**
 * The Class MensagemDTO.
 */
public class TipoServicoDTO implements Serializable {

	private Integer IDSERVICOHOTEL;
    
	private Integer IDTIPODEBCRED;
    
	private Integer VALOROUTRAMOEDA;
    
    private String DESCRICAO;
 
    
    public Integer getIDSERVICOHOTEL() {
		return IDSERVICOHOTEL;
	}


	public void setIDSERVICOHOTEL(Integer iDSERVICOHOTEL) {
		IDSERVICOHOTEL = iDSERVICOHOTEL;
	}


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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IDSERVICOHOTEL == null) ? 0 : IDSERVICOHOTEL.hashCode());
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
		TipoServicoDTO other = (TipoServicoDTO) obj;
		if (IDSERVICOHOTEL == null) {
			if (other.IDSERVICOHOTEL != null)
				return false;
		} else if (!IDSERVICOHOTEL.equals(other.IDSERVICOHOTEL))
			return false;
		return true;
	}


	public Integer getVALOROUTRAMOEDA() {
		return VALOROUTRAMOEDA;
	}


	public void setVALOROUTRAMOEDA(Integer vALOROUTRAMOEDA) {
		VALOROUTRAMOEDA = vALOROUTRAMOEDA;
	}

   


    
}

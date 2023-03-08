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
public class TipoDebitoDTO implements Serializable {

	

	private Integer IDTIPODEBCRED;
    
   
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IDTIPODEBCRED == null) ? 0 : IDTIPODEBCRED.hashCode());
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
		TipoDebitoDTO other = (TipoDebitoDTO) obj;
		if (IDTIPODEBCRED == null) {
			if (other.IDTIPODEBCRED != null)
				return false;
		} else if (!IDTIPODEBCRED.equals(other.IDTIPODEBCRED))
			return false;
		return true;
	}

   


    
}

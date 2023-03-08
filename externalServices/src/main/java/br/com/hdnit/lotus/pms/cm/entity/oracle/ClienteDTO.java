/*
 * 
 */

package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.math.BigInteger;

// TODO: Auto-generated Javadoc
/**
 * The Class MensagemDTO.
 */
public class ClienteDTO implements Serializable {

    /** The titulo. */
    private BigInteger IDPESSOA;
    
   
    	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IDPESSOA == null) ? 0 : IDPESSOA.hashCode());
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
		ClienteDTO other = (ClienteDTO) obj;
		if (IDPESSOA == null) {
			if (other.IDPESSOA != null)
				return false;
		} else if (!IDPESSOA.equals(other.IDPESSOA))
			return false;
		return true;
	}

		/** The mensagem. */
    private String NOME;
 
    
    public String getLabel() {
		return NOME;
	}

    public BigInteger getIDPESSOA() {
		return IDPESSOA;
	}

	public void setIDPESSOA(BigInteger iDPESSOA) {
		IDPESSOA = iDPESSOA;
	}
	public String getNOME() {
		return NOME;
	}

	public void setNOME(String nOME) {
		NOME = nOME;
	}


    
}

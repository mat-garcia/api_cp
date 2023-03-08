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
public class UsuarioDTO implements Serializable {

    /** The titulo. */
    private BigInteger IDUSUARIO;
    
   
    	/** The mensagem. */
    private String NOME;
 
    
    public String getLabel() {
		return NOME;
	}

   
	public String getNOME() {
		return NOME;
	}

	public void setNOME(String nOME) {
		NOME = nOME;
	}


	public BigInteger getIDUSUARIO() {
		return IDUSUARIO;
	}


	public void setIDUSUARIO(BigInteger iDUSUARIO) {
		IDUSUARIO = iDUSUARIO;
	}


    
}

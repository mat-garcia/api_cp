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
public class FaixaDTO implements Serializable {

    /** The titulo. */
    private BigInteger IDHOTEL;
    
    private BigInteger IDADEMAXCRI1;
    
    private BigInteger IDADEMAXCRI2;

	public BigInteger getIDHOTEL() {
		return IDHOTEL;
	}

	public void setIDHOTEL(BigInteger iDHOTEL) {
		IDHOTEL = iDHOTEL;
	}

	public BigInteger getIDADEMAXCRI1() {
		return IDADEMAXCRI1;
	}

	public void setIDADEMAXCRI1(BigInteger iDADEMAXCRI1) {
		IDADEMAXCRI1 = iDADEMAXCRI1;
	}

	public BigInteger getIDADEMAXCRI2() {
		return IDADEMAXCRI2;
	}

	public void setIDADEMAXCRI2(BigInteger iDADEMAXCRI2) {
		IDADEMAXCRI2 = iDADEMAXCRI2;
	}
    
   
    
}

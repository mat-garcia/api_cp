/*
 * 
 */

package br.com.hdnit.lotus.pms.lpp.dto;

import java.io.Serializable;
import java.math.BigInteger;

// TODO: Auto-generated Javadoc
/**
 * The Class MensagemDTO.
 */
public class LphGenericDTO implements Serializable {

	private Integer SEQUENCIA;
	
	private String CODIGO;
	private String DESCRICAO;

	public String getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(String cODIGO) {
		CODIGO = cODIGO;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public void setDESCRICAO(String dESCRICAO) {
		DESCRICAO = dESCRICAO;
	}
	
	public String getLabel() {
		return this.DESCRICAO;
	}

	public Integer getSEQUENCIA() {
		return SEQUENCIA;
	}

	public void setSEQUENCIA(Integer sEQUENCIA) {
		SEQUENCIA = sEQUENCIA;
	}
}

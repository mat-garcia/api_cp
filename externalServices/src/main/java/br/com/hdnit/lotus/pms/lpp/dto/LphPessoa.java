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
public class LphPessoa extends LphGenericDTO {

	private Integer ID_EMPRESA;

	private String RAZAO;
	private String FANTASIA;
	private String CNPJ;
	
	public Integer getID_EMPRESA() {
		return ID_EMPRESA;
	}

	public void setID_EMPRESA(Integer iD_EMPRESA) {
		ID_EMPRESA = iD_EMPRESA;
	}

	public String getRAZAO() {
		return RAZAO;
	}

	public void setRAZAO(String rAZAO) {
		RAZAO = rAZAO;
	}

	public String getFANTASIA() {
		return FANTASIA;
	}

	public void setFANTASIA(String fANTASIA) {
		FANTASIA = fANTASIA;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getLabel() {
		return RAZAO;
	}
	
	
	}

/*
 * 
 */

package br.com.hdnit.lotus.pms.lpp.dto;

// TODO: Auto-generated Javadoc
/**
 * The Class MensagemDTO.
 */
public class LphTarifa extends LphGenericDTO {

	private Integer ID_EMPRESA;

	private String NOME;
	
	private String INICVAL;
	private String FIMVAL;
	public Integer getID_EMPRESA() {
		return ID_EMPRESA;
	}
	public void setID_EMPRESA(Integer iD_EMPRESA) {
		ID_EMPRESA = iD_EMPRESA;
	}
	public String getNOME() {
		return NOME;
	}
	public void setNOME(String nOME) {
		NOME = nOME;
	}
	public String getINICVAL() {
		return INICVAL;
	}
	public void setINICVAL(String iNICVAL) {
		INICVAL = iNICVAL;
	}
	public String getFIMVAL() {
		return FIMVAL;
	}
	public void setFIMVAL(String fIMVAL) {
		FIMVAL = fIMVAL;
	}
	
	public String getLabel() {
		return NOME;
	}
	
	
		}

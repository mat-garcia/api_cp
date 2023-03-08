package br.com.hdnit.lotus.pms.lpp.dto;

public class LphCidade {
	private Integer IDCIDADE;
	private String CODMUNICIPIOIBGE;
	private String NOMECIDADE;
	public Integer getIDCIDADE() {
		return IDCIDADE;
	}
	public void setIDCIDADE(Integer iDCIDADE) {
		IDCIDADE = iDCIDADE;
	}
	public String getCODMUNICIPIOIBGE() {
		return CODMUNICIPIOIBGE;
	}
	public void setCODMUNICIPIOIBGE(String cODMUNICIPIOIBGE) {
		CODMUNICIPIOIBGE = cODMUNICIPIOIBGE;
	}
	public String getNOMECIDADE() {
		return NOMECIDADE;
	}
	public void setNOMECIDADE(String nOMECIDADE) {
		NOMECIDADE = nOMECIDADE;
	}
	
	public String getLabel() {
		return NOMECIDADE;
	}
	
	
}

package br.com.hdnit.lotus.pms.lpp.dto;

public class LphServicos {

	private Integer SEQUENCIA;
	private Integer ID_EMPRESA;
	private String CODIGO;
	private String DESCRI;
	public Integer getSEQUENCIA() {
		return SEQUENCIA;
	}
	public void setSEQUENCIA(Integer sEQUENCIA) {
		SEQUENCIA = sEQUENCIA;
	}
	public Integer getID_EMPRESA() {
		return ID_EMPRESA;
	}
	public void setID_EMPRESA(Integer iD_EMPRESA) {
		ID_EMPRESA = iD_EMPRESA;
	}
	public String getCODIGO() {
		return CODIGO;
	}
	public void setCODIGO(String cODIGO) {
		CODIGO = cODIGO;
	}
	public String getDESCRI() {
		return DESCRI;
	}
	public void setDESCRI(String dESCRI) {
		DESCRI = dESCRI;
	}
	


	public String getLabel() {
		return DESCRI;
	}

	
}

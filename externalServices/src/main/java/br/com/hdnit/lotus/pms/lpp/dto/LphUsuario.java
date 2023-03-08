package br.com.hdnit.lotus.pms.lpp.dto;

public class LphUsuario {
	private Integer SEQUENCIA;
	private String LOGON;
	public Integer getSEQUENCIA() {
		return SEQUENCIA;
	}
	public void setSEQUENCIA(Integer sEQUENCIA) {
		SEQUENCIA = sEQUENCIA;
	}
	public String getLOGON() {
		return LOGON;
	}
	public void setLOGON(String lOGON) {
		LOGON = lOGON;
	}
	
	public String getLabel() {
		return LOGON;
	}
	
}

package br.com.hdnit.lotus.pms.lpp.dto;

import java.util.Date;

public class LphContrato {
	private Integer SEQUENCIA;
	private Integer ID_EMPRESA;
	private Integer TARIFA;
	private Date INICIO;
	private Date TERMINO;

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

	public Integer getTARIFA() {
		return TARIFA;
	}

	public void setTARIFA(Integer tARIFA) {
		TARIFA = tARIFA;
	}

	public Date getINICIO() {
		return INICIO;
	}

	public void setINICIO(Date iNICIO) {
		INICIO = iNICIO;
	}

	public Date getTERMINO() {
		return TERMINO;
	}

	public void setTERMINO(Date tERMINO) {
		TERMINO = tERMINO;
	}
	
	public String getLabel() {
		String ret = "Tarifa:"+ this.getTARIFA() + "  Início:"+this.getINICIO() + " - Término:" + this.getTERMINO();
		
		return ret;
	}

}

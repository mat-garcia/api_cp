package br.com.hdnit.lotus.domain.dto;

import java.io.Serializable;

public class EnvioDisponibilidadeDTO implements Serializable {
	
	public Integer idParceiro;
	public int horaProxEnvioDisp = 0;

	public Integer getIdParceiro() {
		return idParceiro;
	}

	public void setIdParceiro(Integer idParceiro) {
		this.idParceiro = idParceiro;
	}

	public int getHoraProxEnvioDisp() {
		return horaProxEnvioDisp;
	}

	public void setHoraProxEnvioDisp(int horaProxEnvioDisp) {
		this.horaProxEnvioDisp = horaProxEnvioDisp;
	}
}

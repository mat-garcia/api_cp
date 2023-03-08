
package br.com.hdnit.lotus.domain.entity.enums;

public enum StatusReservaEnum {
	SOLICITADA("SOLICITADA"),MODIFICADA("MODIFICADA"), ENVIADA("ENVIADA"), CONFIRMADA_PMS("CONFIRMADA PMS"), CONFIRMADA_SUCESSO(
			"CONFIRMADA COM SUCESSO"), ERRO_CONFIRMAR("ERRO CONFIRMAR"),CANCELADA("CANCELADA"), CANCELADA_SUCESSO("CANCELADA COM SUCESSO");

	private String label;

	StatusReservaEnum(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}

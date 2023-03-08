
package br.com.hdnit.lotus.foundation.util;

public enum StatusReservaPMSEnum {
	CONFIRMADA("CONFIRMADA", 1), A_CONFIRMAR("A CONFIRMAR", 0);

	private String label;

	private Integer id;

	StatusReservaPMSEnum(String label, Integer id) {
		this.label = label;
		this.id = id;

	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}

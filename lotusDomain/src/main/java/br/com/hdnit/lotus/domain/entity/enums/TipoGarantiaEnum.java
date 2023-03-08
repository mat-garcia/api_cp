
package br.com.hdnit.lotus.domain.entity.enums;

public enum TipoGarantiaEnum {
	TRANSFERENCIA("PGTO DIRETO"),
	DEPOSITO("PGTO DIRETO"),
	PRE_PAGO("PGTO DIRETO"),
	CARTAO("PGTO CARTÃO CRÉDITO"),
	MOTOR_RESERVA("PGTO DIRETO"),
	FATURADA("PGTO DIRETO"),
	VOUCHER("PGTO FATURADO"), 
	VIRTUAL_CARD("VIRTUAL CARD"),
	NAO_DEFINIDA("VERIFICAR FORMA PGTO NO VOUCHER");

	
	private String label;

	TipoGarantiaEnum(String label) {
		this.label = label;
		
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}

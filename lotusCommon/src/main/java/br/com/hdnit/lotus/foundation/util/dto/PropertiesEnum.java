
package br.com.hdnit.lotus.foundation.util.dto;

public enum PropertiesEnum {
	VW_ICMS, VW_PIS, EXTERNAL_DB_OWNER, MIXFISCAL_OWNER, TMP_PIS, TMP_ICMS_ENTRADA, TMP_ICMS_SAIDA;

	public String getBaseString() {
		return this.toString();
	}
}

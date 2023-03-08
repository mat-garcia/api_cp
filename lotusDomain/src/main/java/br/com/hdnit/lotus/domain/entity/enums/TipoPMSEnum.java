
package br.com.hdnit.lotus.domain.entity.enums;

public enum TipoPMSEnum {
	CM("CM"),
	LPH("LPH");
    
    private String label;
    
    TipoPMSEnum(String label) {
        this.label = label;
        
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}


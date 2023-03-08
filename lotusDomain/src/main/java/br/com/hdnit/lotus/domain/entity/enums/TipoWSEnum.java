
package br.com.hdnit.lotus.domain.entity.enums;

public enum TipoWSEnum {
	BELAVIAGEM("BELA VIAGEM"),
	OMINIBEES("OMINIBEES"),
    NOVAXS("NOVA XS"),
	HSLATAM("HS LATAM"),
	CONCEPTPRIME("CONCEPT PRIME");
    
    private String label;
    
    TipoWSEnum(String label) {
        this.label = label;        
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}


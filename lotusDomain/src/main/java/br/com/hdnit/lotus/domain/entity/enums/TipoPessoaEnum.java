
package br.com.hdnit.lotus.domain.entity.enums;

public enum TipoPessoaEnum {
    PESSOA_JURIDICA("Pessoa Jurídica"), PESSOA_FISICA("Pessoa Física");

    private String label;

    TipoPessoaEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toBaseString() {
        return super.toString();
    }

}

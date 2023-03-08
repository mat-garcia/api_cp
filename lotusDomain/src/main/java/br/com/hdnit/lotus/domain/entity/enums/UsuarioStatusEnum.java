
package br.com.hdnit.lotus.domain.entity.enums;

import br.com.hdnit.lotus.foundation.util.BundleUtils;

public enum UsuarioStatusEnum {

    PENDENTE(BundleUtils.getMessage("user.status.pendente")), CADASTRADO(BundleUtils.getMessage("user.status.cadastrado")), BLOQUEADO(
                    BundleUtils.getMessage("user.status.bloqueado"));

    private String label;

    private UsuarioStatusEnum(String label) {

        this.setLabel(label);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}

package br.com.hdnit.lotus.domain.entity.enums;

import java.util.Comparator;

public class GrupoPermissaoComparator implements Comparator<GrupoPermissaoEnum> {

    @Override
    public int compare(GrupoPermissaoEnum o1, GrupoPermissaoEnum o2) {
        return o1.getLabel().compareTo(o2.getLabel());
    }
}
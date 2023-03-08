
package br.com.hdnit.lotus.domain.entity.access;

import java.util.Comparator;

public class UserComparator implements Comparator<Usuario> {

    @Override
    public int compare(Usuario o1, Usuario o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
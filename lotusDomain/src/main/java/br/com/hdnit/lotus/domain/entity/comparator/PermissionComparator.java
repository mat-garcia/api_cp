
package br.com.hdnit.lotus.domain.entity.comparator;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

import br.com.hdnit.lotus.domain.entity.access.Permission;

public class PermissionComparator implements Comparator<Permission> {

    @Override
    public int compare(Permission o1, Permission o2) {
        Collator cot = Collator.getInstance(new Locale("pt", "BR"));

        return cot.compare(o1.getName(), o2.getName());

    }
}
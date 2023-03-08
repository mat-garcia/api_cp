package br.com.hdnit.mixfiscal.domain.generic.dao;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

import br.com.hdnit.lotus.domain.entity.AuditTrail;

public class AbstractComparator<T extends AuditTrail> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        Collator cot = Collator.getInstance(new Locale("pt", "BR"));

        return cot.compare(o1.getLabel(), o2.getLabel());

    }
}

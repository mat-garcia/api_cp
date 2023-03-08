
package br.com.hdnit.lotus.domain.entity.corporativo;

import java.util.Comparator;

public class ReservaHospedeComparator implements Comparator<ReservaHospede> {

    @Override
    public int compare(ReservaHospede o1, ReservaHospede o2) {
       
    	 return o1.getAdulto().compareTo(o2.getAdulto());


    }
}
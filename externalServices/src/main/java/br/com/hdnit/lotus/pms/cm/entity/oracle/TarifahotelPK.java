/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author renanhdn
 */
@Embeddable
public class TarifahotelPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDTARIFA", nullable = false)
    private BigInteger idtarifa;
    @Basic(optional = false)
    @Column(name = "IDHOTEL", nullable = false)
    private BigInteger idhotel;

    public TarifahotelPK() {
    }

    public TarifahotelPK(BigInteger idtarifa, BigInteger idhotel) {
        this.idtarifa = idtarifa;
        this.idhotel = idhotel;
    }

    public BigInteger getIdtarifa() {
        return idtarifa;
    }

    public void setIdtarifa(BigInteger idtarifa) {
        this.idtarifa = idtarifa;
    }

    public BigInteger getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(BigInteger idhotel) {
        this.idhotel = idhotel;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idhotel == null) ? 0 : idhotel.hashCode());
		result = prime * result + ((idtarifa == null) ? 0 : idtarifa.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarifahotelPK other = (TarifahotelPK) obj;
		if (idhotel == null) {
			if (other.idhotel != null)
				return false;
		} else if (!idhotel.equals(other.idhotel))
			return false;
		if (idtarifa == null) {
			if (other.idtarifa != null)
				return false;
		} else if (!idtarifa.equals(other.idtarifa))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.TarifahotelPK[ idtarifa=" + idtarifa + ", idhotel=" + idhotel + " ]";
    }
    
}

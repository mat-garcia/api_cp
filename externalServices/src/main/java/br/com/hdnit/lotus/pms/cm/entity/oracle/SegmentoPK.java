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
public class SegmentoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDHOTEL", nullable = false)
    private BigInteger idhotel;
    @Basic(optional = false)
    @Column(name = "CODSEGMENTO", nullable = false, length = 10)
    private String codsegmento;

    public SegmentoPK() {
    }

    public SegmentoPK(BigInteger idhotel, String codsegmento) {
        this.idhotel = idhotel;
        this.codsegmento = codsegmento;
    }

    public BigInteger getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(BigInteger idhotel) {
        this.idhotel = idhotel;
    }

    public String getCodsegmento() {
        return codsegmento;
    }

    public void setCodsegmento(String codsegmento) {
        this.codsegmento = codsegmento;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codsegmento == null) ? 0 : codsegmento.hashCode());
		result = prime * result + ((idhotel == null) ? 0 : idhotel.hashCode());
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
		SegmentoPK other = (SegmentoPK) obj;
		if (codsegmento == null) {
			if (other.codsegmento != null)
				return false;
		} else if (!codsegmento.equals(other.codsegmento))
			return false;
		if (idhotel == null) {
			if (other.idhotel != null)
				return false;
		} else if (!idhotel.equals(other.idhotel))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.SegmentoPK[ idhotel=" + idhotel + ", codsegmento=" + codsegmento + " ]";
    }
    
}

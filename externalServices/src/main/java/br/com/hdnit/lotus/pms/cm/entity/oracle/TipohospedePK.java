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
public class TipohospedePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDHOTEL", nullable = false)
    private BigInteger idhotel;
    @Basic(optional = false)
    @Column(name = "IDTIPOHOSPEDE", nullable = false)
    private BigInteger idtipohospede;

    public TipohospedePK() {
    }

    public TipohospedePK(BigInteger idhotel, BigInteger idtipohospede) {
        this.idhotel = idhotel;
        this.idtipohospede = idtipohospede;
    }

    public BigInteger getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(BigInteger idhotel) {
        this.idhotel = idhotel;
    }

    public BigInteger getIdtipohospede() {
        return idtipohospede;
    }

    public void setIdtipohospede(BigInteger idtipohospede) {
        this.idtipohospede = idtipohospede;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idhotel == null) ? 0 : idhotel.hashCode());
		result = prime * result + ((idtipohospede == null) ? 0 : idtipohospede.hashCode());
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
		TipohospedePK other = (TipohospedePK) obj;
		if (idhotel == null) {
			if (other.idhotel != null)
				return false;
		} else if (!idhotel.equals(other.idhotel))
			return false;
		if (idtipohospede == null) {
			if (other.idtipohospede != null)
				return false;
		} else if (!idtipohospede.equals(other.idtipohospede))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.TipohospedePK[ idhotel=" + idhotel + ", idtipohospede=" + idtipohospede + " ]";
    }
    
}

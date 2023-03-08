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
public class TipouhPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDTIPOUH", nullable = false)
    private BigInteger idtipouh;
    @Basic(optional = false)
    @Column(name = "IDHOTEL", nullable = false)
    private BigInteger idhotel;

    public TipouhPK() {
    }

    public TipouhPK(BigInteger idtipouh, BigInteger idhotel) {
        this.idtipouh = idtipouh;
        this.idhotel = idhotel;
    }

    public BigInteger getIdtipouh() {
        return idtipouh;
    }

    public void setIdtipouh(BigInteger idtipouh) {
        this.idtipouh = idtipouh;
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
		result = prime * result + ((idtipouh == null) ? 0 : idtipouh.hashCode());
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
		TipouhPK other = (TipouhPK) obj;
		if (idhotel == null) {
			if (other.idhotel != null)
				return false;
		} else if (!idhotel.equals(other.idhotel))
			return false;
		if (idtipouh == null) {
			if (other.idtipouh != null)
				return false;
		} else if (!idtipouh.equals(other.idtipouh))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.TipouhPK[ idtipouh=" + idtipouh + ", idhotel=" + idhotel + " ]";
    }
    
}

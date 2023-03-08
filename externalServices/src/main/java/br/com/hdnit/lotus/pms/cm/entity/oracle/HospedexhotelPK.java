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
public class HospedexhotelPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDHOSPEDE", nullable = false)
    private BigInteger idhospede;
    @Basic(optional = false)
    @Column(name = "IDHOTEL", nullable = false)
    private BigInteger idhotel;

    public HospedexhotelPK() {
    }

    public HospedexhotelPK(BigInteger idhospede, BigInteger idhotel) {
        this.idhospede = idhospede;
        this.idhotel = idhotel;
    }

    public BigInteger getIdhospede() {
        return idhospede;
    }

    public void setIdhospede(BigInteger idhospede) {
        this.idhospede = idhospede;
    }

    public BigInteger getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(BigInteger idhotel) {
        this.idhotel = idhotel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhospede != null ? idhospede.hashCode() : 0);
        hash += (idhotel != null ? idhotel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HospedexhotelPK)) {
            return false;
        }
        HospedexhotelPK other = (HospedexhotelPK) object;
        if ((this.idhospede == null && other.idhospede != null) || (this.idhospede != null && !this.idhospede.equals(other.idhospede))) {
            return false;
        }
        if ((this.idhotel == null && other.idhotel != null) || (this.idhotel != null && !this.idhotel.equals(other.idhotel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.HospedexhotelPK[ idhospede=" + idhospede + ", idhotel=" + idhotel + " ]";
    }
    
}

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
public class MovimentohospedesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDRESERVASFRONT", nullable = false)
    private BigInteger idreservasfront;
    @Basic(optional = false)
    @Column(name = "IDHOSPEDE", nullable = false)
    private BigInteger idhospede;

    public MovimentohospedesPK() {
    }

    public MovimentohospedesPK(BigInteger idreservasfront, BigInteger idhospede) {
        this.idreservasfront = idreservasfront;
        this.idhospede = idhospede;
    }

    public BigInteger getIdreservasfront() {
        return idreservasfront;
    }

    public void setIdreservasfront(BigInteger idreservasfront) {
        this.idreservasfront = idreservasfront;
    }

    public BigInteger getIdhospede() {
        return idhospede;
    }

    public void setIdhospede(BigInteger idhospede) {
        this.idhospede = idhospede;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservasfront != null ? idreservasfront.hashCode() : 0);
        hash += (idhospede != null ? idhospede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentohospedesPK)) {
            return false;
        }
        MovimentohospedesPK other = (MovimentohospedesPK) object;
        if ((this.idreservasfront == null && other.idreservasfront != null) || (this.idreservasfront != null && !this.idreservasfront.equals(other.idreservasfront))) {
            return false;
        }
        if ((this.idhospede == null && other.idhospede != null) || (this.idhospede != null && !this.idhospede.equals(other.idhospede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.MovimentohospedesPK[ idreservasfront=" + idreservasfront + ", idhospede=" + idhospede + " ]";
    }
    
}

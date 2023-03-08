/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author renanhdn
 */
@Embeddable
public class OrcamentoreservaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDRESERVASFRONT", nullable = false)
    private BigInteger idreservasfront;
    @Basic(optional = false)
    @Column(name = "DATA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    public OrcamentoreservaPK() {
    }

    public OrcamentoreservaPK(BigInteger idreservasfront, Date data) {
        this.idreservasfront = idreservasfront;
        this.data = data;
    }

    public BigInteger getIdreservasfront() {
        return idreservasfront;
    }

    public void setIdreservasfront(BigInteger idreservasfront) {
        this.idreservasfront = idreservasfront;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservasfront != null ? idreservasfront.hashCode() : 0);
        hash += (data != null ? data.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrcamentoreservaPK)) {
            return false;
        }
        OrcamentoreservaPK other = (OrcamentoreservaPK) object;
        if ((this.idreservasfront == null && other.idreservasfront != null) || (this.idreservasfront != null && !this.idreservasfront.equals(other.idreservasfront))) {
            return false;
        }
        if ((this.data == null && other.data != null) || (this.data != null && !this.data.equals(other.data))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.OrcamentoreservaPK[ idreservasfront=" + idreservasfront + ", data=" + data + " ]";
    }
    
}

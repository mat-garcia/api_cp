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
public class ContrclihotelPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDFORCLI", nullable = false)
    private BigInteger idforcli;
    @Basic(optional = false)
    @Column(name = "CODCONTRATO", nullable = false)
    private BigInteger codcontrato;
    @Basic(optional = false)
    @Column(name = "IDHOTEL", nullable = false)
    private BigInteger idhotel;

    public ContrclihotelPK() {
    }

    public ContrclihotelPK(BigInteger idforcli, BigInteger codcontrato, BigInteger idhotel) {
        this.idforcli = idforcli;
        this.codcontrato = codcontrato;
        this.idhotel = idhotel;
    }

    public BigInteger getIdforcli() {
        return idforcli;
    }

    public void setIdforcli(BigInteger idforcli) {
        this.idforcli = idforcli;
    }

    public BigInteger getCodcontrato() {
        return codcontrato;
    }

    public void setCodcontrato(BigInteger codcontrato) {
        this.codcontrato = codcontrato;
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
        hash += (idforcli != null ? idforcli.hashCode() : 0);
        hash += (codcontrato != null ? codcontrato.hashCode() : 0);
        hash += (idhotel != null ? idhotel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContrclihotelPK)) {
            return false;
        }
        ContrclihotelPK other = (ContrclihotelPK) object;
        if ((this.idforcli == null && other.idforcli != null) || (this.idforcli != null && !this.idforcli.equals(other.idforcli))) {
            return false;
        }
        if ((this.codcontrato == null && other.codcontrato != null) || (this.codcontrato != null && !this.codcontrato.equals(other.codcontrato))) {
            return false;
        }
        if ((this.idhotel == null && other.idhotel != null) || (this.idhotel != null && !this.idhotel.equals(other.idhotel))) {
            return false;
        }
        return true;
    }

    @Override
	public String toString() {
		return "ContrclihotelPK [codcontrato=" + codcontrato + "]";
	}
    
}

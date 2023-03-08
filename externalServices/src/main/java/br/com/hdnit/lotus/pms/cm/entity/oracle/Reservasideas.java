/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "RESERVASIDEAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservasideas.findAll", query = "SELECT r FROM Reservasideas r"),
    @NamedQuery(name = "Reservasideas.findByIdreservasfront", query = "SELECT r FROM Reservasideas r WHERE r.idreservasfront = :idreservasfront"),
    @NamedQuery(name = "Reservasideas.findByTrgdtinclusao", query = "SELECT r FROM Reservasideas r WHERE r.trgdtinclusao = :trgdtinclusao"),
    @NamedQuery(name = "Reservasideas.findByTrguserinclusao", query = "SELECT r FROM Reservasideas r WHERE r.trguserinclusao = :trguserinclusao")})
public class Reservasideas implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDRESERVASFRONT", nullable = false, precision = 22)
    private Long idreservasfront;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @JoinColumn(name = "IDRESERVASFRONT", referencedColumnName = "IDRESERVASFRONT", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Reservasfront reservasfront;

    public Reservasideas() {
    }

    public Reservasideas(Long idreservasfront) {
        this.idreservasfront = idreservasfront;
    }

    public Long getIdreservasfront() {
        return idreservasfront;
    }

    public void setIdreservasfront(Long idreservasfront) {
        this.idreservasfront = idreservasfront;
    }

    public Date getTrgdtinclusao() {
        return trgdtinclusao;
    }

    public void setTrgdtinclusao(Date trgdtinclusao) {
        this.trgdtinclusao = trgdtinclusao;
    }

    public String getTrguserinclusao() {
        return trguserinclusao;
    }

    public void setTrguserinclusao(String trguserinclusao) {
        this.trguserinclusao = trguserinclusao;
    }

    public Reservasfront getReservasfront() {
        return reservasfront;
    }

    public void setReservasfront(Reservasfront reservasfront) {
        this.reservasfront = reservasfront;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservasfront != null ? idreservasfront.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservasideas)) {
            return false;
        }
        Reservasideas other = (Reservasideas) object;
        if ((this.idreservasfront == null && other.idreservasfront != null) || (this.idreservasfront != null && !this.idreservasfront.equals(other.idreservasfront))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Reservasideas[ idreservasfront=" + idreservasfront + " ]";
    }
    
}

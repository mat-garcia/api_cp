/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "STATUSRESERVA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statusreserva.findAll", query = "SELECT s FROM Statusreserva s"),
    @NamedQuery(name = "Statusreserva.findByStatusreserva", query = "SELECT s FROM Statusreserva s WHERE s.statusreserva = :statusreserva"),
    @NamedQuery(name = "Statusreserva.findByDescricao", query = "SELECT s FROM Statusreserva s WHERE s.descricao = :descricao"),
    @NamedQuery(name = "Statusreserva.findByCorstatusreserva", query = "SELECT s FROM Statusreserva s WHERE s.corstatusreserva = :corstatusreserva"),
    @NamedQuery(name = "Statusreserva.findByTrgdtinclusao", query = "SELECT s FROM Statusreserva s WHERE s.trgdtinclusao = :trgdtinclusao"),
    @NamedQuery(name = "Statusreserva.findByTrguserinclusao", query = "SELECT s FROM Statusreserva s WHERE s.trguserinclusao = :trguserinclusao")})
public class Statusreserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STATUSRESERVA", nullable = false)
    private Short statusreserva;
    @Column(name = "DESCRICAO", length = 60)
    private String descricao;
    @Column(name = "CORSTATUSRESERVA", length = 15)
    private String corstatusreserva;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @OneToMany(mappedBy = "statusreserva")
    private List<Reservasfront> reservasfrontList;
   
    public Statusreserva() {
    }

    public Statusreserva(Short statusreserva) {
        this.statusreserva = statusreserva;
    }

    public Short getStatusreserva() {
        return statusreserva;
    }

    public void setStatusreserva(Short statusreserva) {
        this.statusreserva = statusreserva;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCorstatusreserva() {
        return corstatusreserva;
    }

    public void setCorstatusreserva(String corstatusreserva) {
        this.corstatusreserva = corstatusreserva;
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

    @XmlTransient
    public List<Reservasfront> getReservasfrontList() {
        return reservasfrontList;
    }

    public void setReservasfrontList(List<Reservasfront> reservasfrontList) {
        this.reservasfrontList = reservasfrontList;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusreserva != null ? statusreserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statusreserva)) {
            return false;
        }
        Statusreserva other = (Statusreserva) object;
        if ((this.statusreserva == null && other.statusreserva != null) || (this.statusreserva != null && !this.statusreserva.equals(other.statusreserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Statusreserva[ statusreserva=" + statusreserva + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "RESERVAREDUZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservareduz.findAll", query = "SELECT r FROM Reservareduz r"),
    @NamedQuery(name = "Reservareduz.findByIdreservasfront", query = "SELECT r FROM Reservareduz r WHERE r.idreservasfront = :idreservasfront"),
    @NamedQuery(name = "Reservareduz.findByDatachegada", query = "SELECT r FROM Reservareduz r WHERE r.datachegada = :datachegada"),
    @NamedQuery(name = "Reservareduz.findByDatapartida", query = "SELECT r FROM Reservareduz r WHERE r.datapartida = :datapartida"),
    @NamedQuery(name = "Reservareduz.findByStatusreserva", query = "SELECT r FROM Reservareduz r WHERE r.statusreserva = :statusreserva"),
    @NamedQuery(name = "Reservareduz.findByIdforcli", query = "SELECT r FROM Reservareduz r WHERE r.idforcli = :idforcli"),
    @NamedQuery(name = "Reservareduz.findByCodcontrato", query = "SELECT r FROM Reservareduz r WHERE r.codcontrato = :codcontrato"),
    @NamedQuery(name = "Reservareduz.findByIdtipouh", query = "SELECT r FROM Reservareduz r WHERE r.idtipouh = :idtipouh"),
    @NamedQuery(name = "Reservareduz.findByTrgdtinclusao", query = "SELECT r FROM Reservareduz r WHERE r.trgdtinclusao = :trgdtinclusao"),
    @NamedQuery(name = "Reservareduz.findByTrguserinclusao", query = "SELECT r FROM Reservareduz r WHERE r.trguserinclusao = :trguserinclusao")})
public class Reservareduz implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDRESERVASFRONT", nullable = false, precision = 22)
    private Long idreservasfront;
    @Basic(optional = false)
    @Column(name = "DATACHEGADA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datachegada;
    @Basic(optional = false)
    @Column(name = "DATAPARTIDA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datapartida;
    @Column(name = "STATUSRESERVA")
    private Short statusreserva;
    @Column(name = "IDFORCLI")
    private BigInteger idforcli;
    @Column(name = "CODCONTRATO")
    private BigInteger codcontrato;
    @Column(name = "IDTIPOUH")
    private BigInteger idtipouh;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL")
    @ManyToOne
    private Hotel idhotel;
    @JoinColumn(name = "IDRESERVASFRONT", referencedColumnName = "IDRESERVASFRONT", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Reservasfront reservasfront;

    public Reservareduz() {
    }

    public Reservareduz(Long idreservasfront) {
        this.idreservasfront = idreservasfront;
    }

    public Reservareduz(Long idreservasfront, Date datachegada, Date datapartida) {
        this.idreservasfront = idreservasfront;
        this.datachegada = datachegada;
        this.datapartida = datapartida;
    }

    public Long getIdreservasfront() {
        return idreservasfront;
    }

    public void setIdreservasfront(Long idreservasfront) {
        this.idreservasfront = idreservasfront;
    }

    public Date getDatachegada() {
        return datachegada;
    }

    public void setDatachegada(Date datachegada) {
        this.datachegada = datachegada;
    }

    public Date getDatapartida() {
        return datapartida;
    }

    public void setDatapartida(Date datapartida) {
        this.datapartida = datapartida;
    }

    public Short getStatusreserva() {
        return statusreserva;
    }

    public void setStatusreserva(Short statusreserva) {
        this.statusreserva = statusreserva;
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

    public BigInteger getIdtipouh() {
        return idtipouh;
    }

    public void setIdtipouh(BigInteger idtipouh) {
        this.idtipouh = idtipouh;
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

    public Hotel getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(Hotel idhotel) {
        this.idhotel = idhotel;
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
        if (!(object instanceof Reservareduz)) {
            return false;
        }
        Reservareduz other = (Reservareduz) object;
        if ((this.idreservasfront == null && other.idreservasfront != null) || (this.idreservasfront != null && !this.idreservasfront.equals(other.idreservasfront))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Reservareduz[ idreservasfront=" + idreservasfront + " ]";
    }
    
}

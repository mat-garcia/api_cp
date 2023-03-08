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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "TELENDPESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telendpess.findAll", query = "SELECT t FROM Telendpess t"),
    @NamedQuery(name = "Telendpess.findByIdtelefone", query = "SELECT t FROM Telendpess t WHERE t.idtelefone = :idtelefone"),
    @NamedQuery(name = "Telendpess.findByDdi", query = "SELECT t FROM Telendpess t WHERE t.ddi = :ddi"),
    @NamedQuery(name = "Telendpess.findByDdd", query = "SELECT t FROM Telendpess t WHERE t.ddd = :ddd"),
    @NamedQuery(name = "Telendpess.findByTipo", query = "SELECT t FROM Telendpess t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "Telendpess.findByNumero", query = "SELECT t FROM Telendpess t WHERE t.numero = :numero"),
    @NamedQuery(name = "Telendpess.findByTrgdtinclusao", query = "SELECT t FROM Telendpess t WHERE t.trgdtinclusao = :trgdtinclusao"),
    @NamedQuery(name = "Telendpess.findByTrguserinclusao", query = "SELECT t FROM Telendpess t WHERE t.trguserinclusao = :trguserinclusao")})
public class Telendpess implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDTELEFONE", nullable = false, precision = 22)
    private Long idtelefone;
    @Column(name = "DDI", length = 4)
    private String ddi;
    @Column(name = "DDD", length = 5)
    private String ddd;
    @Column(name = "TIPO", length = 5)
    private String tipo;
    @Column(name = "NUMERO", length = 20)
    private String numero;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @JoinColumn(name = "IDENDERECO", referencedColumnName = "IDENDERECO")
    @ManyToOne
    private Endpess idendereco;

    public Telendpess() {
    }

    public Telendpess(Long idtelefone) {
        this.idtelefone = idtelefone;
    }

    public Long getIdtelefone() {
        return idtelefone;
    }

    public void setIdtelefone(Long idtelefone) {
        this.idtelefone = idtelefone;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public Endpess getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Endpess idendereco) {
        this.idendereco = idendereco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtelefone != null ? idtelefone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telendpess)) {
            return false;
        }
        Telendpess other = (Telendpess) object;
        if ((this.idtelefone == null && other.idtelefone != null) || (this.idtelefone != null && !this.idtelefone.equals(other.idtelefone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Telendpess[ idtelefone=" + idtelefone + " ]";
    }
    
}

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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "HOSPEDEXHOTEL")
@XmlRootElement
public class Hospedexhotel implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HospedexhotelPK hospedexhotelPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LIMITECREDITO", precision = 17, scale = 2)
    private BigDecimal limitecredito;
    @Column(name = "QTDENOSHOW")
    private Integer qtdenoshow;
    @Column(name = "QTDECANCELAMENTO")
    private Integer qtdecancelamento;
    @Column(name = "QTDECHEGADAANT")
    private Integer qtdechegadaant;
    @Column(name = "QTDEVISITAS")
    private Integer qtdevisitas;
    @Column(name = "QTDESAIDAANT")
    private Integer qtdesaidaant;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @JoinColumn(name = "IDHOSPEDE", referencedColumnName = "IDHOSPEDE", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hospede hospede;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hotel hotel;
    @JoinColumns({
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDTIPOHOSPEDE", referencedColumnName = "IDTIPOHOSPEDE", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Tipohospede tipohospede;
  
    public Hospedexhotel() {
    }

    public Hospedexhotel(HospedexhotelPK hospedexhotelPK) {
        this.hospedexhotelPK = hospedexhotelPK;
    }

    public Hospedexhotel(BigInteger idhospede, BigInteger idhotel) {
        this.hospedexhotelPK = new HospedexhotelPK(idhospede, idhotel);
    }

    public HospedexhotelPK getHospedexhotelPK() {
        return hospedexhotelPK;
    }

    public void setHospedexhotelPK(HospedexhotelPK hospedexhotelPK) {
        this.hospedexhotelPK = hospedexhotelPK;
    }

    public BigDecimal getLimitecredito() {
        return limitecredito;
    }

    public void setLimitecredito(BigDecimal limitecredito) {
        this.limitecredito = limitecredito;
    }

    public Integer getQtdenoshow() {
        return qtdenoshow;
    }

    public void setQtdenoshow(Integer qtdenoshow) {
        this.qtdenoshow = qtdenoshow;
    }

    public Integer getQtdecancelamento() {
        return qtdecancelamento;
    }

    public void setQtdecancelamento(Integer qtdecancelamento) {
        this.qtdecancelamento = qtdecancelamento;
    }

    public Integer getQtdechegadaant() {
        return qtdechegadaant;
    }

    public void setQtdechegadaant(Integer qtdechegadaant) {
        this.qtdechegadaant = qtdechegadaant;
    }

    public Integer getQtdevisitas() {
        return qtdevisitas;
    }

    public void setQtdevisitas(Integer qtdevisitas) {
        this.qtdevisitas = qtdevisitas;
    }

    public Integer getQtdesaidaant() {
        return qtdesaidaant;
    }

    public void setQtdesaidaant(Integer qtdesaidaant) {
        this.qtdesaidaant = qtdesaidaant;
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

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Tipohospede getTipohospede() {
        return tipohospede;
    }

    public void setTipohospede(Tipohospede tipohospede) {
        this.tipohospede = tipohospede;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hospedexhotelPK != null ? hospedexhotelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospedexhotel)) {
            return false;
        }
        Hospedexhotel other = (Hospedexhotel) object;
        if ((this.hospedexhotelPK == null && other.hospedexhotelPK != null) || (this.hospedexhotelPK != null && !this.hospedexhotelPK.equals(other.hospedexhotelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Hospedexhotel[ hospedexhotelPK=" + hospedexhotelPK + " ]";
    }
    
}

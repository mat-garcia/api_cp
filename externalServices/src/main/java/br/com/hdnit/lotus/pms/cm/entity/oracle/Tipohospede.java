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
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "TIPOHOSPEDE")
@XmlRootElement
public class Tipohospede implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TipohospedePK tipohospedePK;
    @Column(name = "DESCRICAO", length = 60)
    private String descricao;
    @Column(name = "NUMDIASHISTORICO")
    private Short numdiashistorico;
    @Basic(optional = false)
    @Column(name = "HOSPEDEVIP", nullable = false)
    private Character hospedevip;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PERCLIMCREDITO", precision = 6, scale = 2)
    private BigDecimal perclimcredito;
    @Column(name = "TIPOGRATUIDADE")
    private Character tipogratuidade;
    @Column(name = "CODREDUZIDO", length = 4)
    private String codreduzido;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "FLGATIVO")
    private Character flgativo;
//    @Column(name = "VLRLIMCREDITO")
//    private Double vlrlimcredito;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipohospede",fetch=FetchType.LAZY)
    private List<Hospedexhotel> hospedexhotelList;
    @OneToMany(mappedBy = "tipohospede")
    private List<Hospede> hospedeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipohospede",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipohospede1",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipohospede2",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList2;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hotel hotel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipohospede",fetch=FetchType.LAZY)
    private List<Movimentohospedes> movimentohospedesList;

    public Tipohospede() {
    }

    public Tipohospede(TipohospedePK tipohospedePK) {
        this.tipohospedePK = tipohospedePK;
    }

    public Tipohospede(TipohospedePK tipohospedePK, Character hospedevip) {
        this.tipohospedePK = tipohospedePK;
        this.hospedevip = hospedevip;
    }

    public Tipohospede(BigInteger idhotel, BigInteger idtipohospede) {
        this.tipohospedePK = new TipohospedePK(idhotel, idtipohospede);
    }

    public TipohospedePK getTipohospedePK() {
        return tipohospedePK;
    }

    public void setTipohospedePK(TipohospedePK tipohospedePK) {
        this.tipohospedePK = tipohospedePK;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Short getNumdiashistorico() {
        return numdiashistorico;
    }

    public void setNumdiashistorico(Short numdiashistorico) {
        this.numdiashistorico = numdiashistorico;
    }

    public Character getHospedevip() {
        return hospedevip;
    }

    public void setHospedevip(Character hospedevip) {
        this.hospedevip = hospedevip;
    }

    public BigDecimal getPerclimcredito() {
        return perclimcredito;
    }

    public void setPerclimcredito(BigDecimal perclimcredito) {
        this.perclimcredito = perclimcredito;
    }

    public Character getTipogratuidade() {
        return tipogratuidade;
    }

    public void setTipogratuidade(Character tipogratuidade) {
        this.tipogratuidade = tipogratuidade;
    }

    public String getCodreduzido() {
        return codreduzido;
    }

    public void setCodreduzido(String codreduzido) {
        this.codreduzido = codreduzido;
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

    public Character getFlgativo() {
        return flgativo;
    }

    public void setFlgativo(Character flgativo) {
        this.flgativo = flgativo;
    }

//    public Double getVlrlimcredito() {
//        return vlrlimcredito;
//    }

//    public void setVlrlimcredito(Double vlrlimcredito) {
//        this.vlrlimcredito = vlrlimcredito;
//    }

    @XmlTransient
    public List<Hospedexhotel> getHospedexhotelList() {
        return hospedexhotelList;
    }

    public void setHospedexhotelList(List<Hospedexhotel> hospedexhotelList) {
        this.hospedexhotelList = hospedexhotelList;
    }

   

    @XmlTransient
    public List<Hospede> getHospedeList() {
        return hospedeList;
    }

    public void setHospedeList(List<Hospede> hospedeList) {
        this.hospedeList = hospedeList;
    }

    @XmlTransient
    public List<Paramhotel> getParamhotelList() {
        return paramhotelList;
    }

    public void setParamhotelList(List<Paramhotel> paramhotelList) {
        this.paramhotelList = paramhotelList;
    }

    @XmlTransient
    public List<Paramhotel> getParamhotelList1() {
        return paramhotelList1;
    }

    public void setParamhotelList1(List<Paramhotel> paramhotelList1) {
        this.paramhotelList1 = paramhotelList1;
    }

    @XmlTransient
    public List<Paramhotel> getParamhotelList2() {
        return paramhotelList2;
    }

    public void setParamhotelList2(List<Paramhotel> paramhotelList2) {
        this.paramhotelList2 = paramhotelList2;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @XmlTransient
    public List<Movimentohospedes> getMovimentohospedesList() {
        return movimentohospedesList;
    }

    public void setMovimentohospedesList(List<Movimentohospedes> movimentohospedesList) {
        this.movimentohospedesList = movimentohospedesList;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipohospedePK == null) ? 0 : tipohospedePK.hashCode());
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
		Tipohospede other = (Tipohospede) obj;
		if (tipohospedePK == null) {
			if (other.tipohospedePK != null)
				return false;
		} else if (!tipohospedePK.equals(other.tipohospedePK))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Tipohospede[ tipohospedePK=" + tipohospedePK + " ]";
    }
    

    @Transient
    public String getLabel() {
        return this.getDescricao();
    }
}

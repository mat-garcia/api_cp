/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
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
@Table(name = "SEGMENTO")
@XmlRootElement
public class Segmento implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SegmentoPK segmentoPK;
    @Basic(optional = false)
    @Column(name = "DESCRICAO", nullable = false, length = 60)
    private String descricao;
    @Column(name = "ANALITICASINTETIC")
    private Character analiticasintetic;
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
    @Column(name = "FLGDIRECPORRES")
    private Character flgdirecporres;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch=FetchType.LAZY)
    private Hotel hotel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segmento",fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList;
    @OneToMany(mappedBy = "segmento",fetch=FetchType.LAZY)
    private List<Orcamentoreserva> orcamentoreservaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segmento",fetch=FetchType.LAZY)
    private List<Contasfront> contasfrontList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segmento",fetch=FetchType.LAZY)
    private List<Tarifahotel> tarifahotelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segmento",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segmento1",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segmento2",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList2;

    public Segmento() {
    }

    public Segmento(SegmentoPK segmentoPK) {
        this.segmentoPK = segmentoPK;
    }

    public Segmento(SegmentoPK segmentoPK, String descricao) {
        this.segmentoPK = segmentoPK;
        this.descricao = descricao;
    }

    public Segmento(BigInteger idhotel, String codsegmento) {
        this.segmentoPK = new SegmentoPK(idhotel, codsegmento);
    }

    public SegmentoPK getSegmentoPK() {
        return segmentoPK;
    }

    public void setSegmentoPK(SegmentoPK segmentoPK) {
        this.segmentoPK = segmentoPK;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Character getAnaliticasintetic() {
        return analiticasintetic;
    }

    public void setAnaliticasintetic(Character analiticasintetic) {
        this.analiticasintetic = analiticasintetic;
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

    public Character getFlgdirecporres() {
        return flgdirecporres;
    }

    public void setFlgdirecporres(Character flgdirecporres) {
        this.flgdirecporres = flgdirecporres;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @XmlTransient
    public List<Reservasfront> getReservasfrontList() {
        return reservasfrontList;
    }

    public void setReservasfrontList(List<Reservasfront> reservasfrontList) {
        this.reservasfrontList = reservasfrontList;
    }

    @XmlTransient
    public List<Orcamentoreserva> getOrcamentoreservaList() {
        return orcamentoreservaList;
    }

    public void setOrcamentoreservaList(List<Orcamentoreserva> orcamentoreservaList) {
        this.orcamentoreservaList = orcamentoreservaList;
    }

    @XmlTransient
    public List<Contasfront> getContasfrontList() {
        return contasfrontList;
    }

    public void setContasfrontList(List<Contasfront> contasfrontList) {
        this.contasfrontList = contasfrontList;
    }

    @XmlTransient
    public List<Tarifahotel> getTarifahotelList() {
        return tarifahotelList;
    }

    public void setTarifahotelList(List<Tarifahotel> tarifahotelList) {
        this.tarifahotelList = tarifahotelList;
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

   
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((segmentoPK == null) ? 0 : segmentoPK.hashCode());
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
		Segmento other = (Segmento) obj;
		if (segmentoPK == null) {
			if (other.segmentoPK != null)
				return false;
		} else if (!segmentoPK.equals(other.segmentoPK))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Segmento[ segmentoPK=" + segmentoPK + " ]";
    }


    @Transient
    public String getLabel() {
        return  this.getDescricao();
    }
}

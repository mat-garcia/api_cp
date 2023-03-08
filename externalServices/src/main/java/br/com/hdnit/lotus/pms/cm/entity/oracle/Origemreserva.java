/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "ORIGEMRESERVA")
@XmlRootElement
public class Origemreserva implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDORIGEM", nullable = false, precision = 22)
    private Long idorigem;
    @Column(name = "DESCRICAO", length = 60)
    private String descricao;
    @Column(name = "CODREDUZIDO", length = 2)
    private String codreduzido;
    @Column(name = "PERCCOMISSAO", precision = 7, scale = 3)
    private BigDecimal perccomissao;
    @Column(name = "FLGALTERA")
    private Character flgaltera;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "FLGATIVO")
    private Character flgativo;
    @Column(name = "VALORCOMISSAO", precision = 17, scale = 2)
    private BigDecimal valorcomissao;
    @OneToMany(mappedBy = "idorigem",fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList;
    @OneToMany(mappedBy = "idorigem",fetch=FetchType.LAZY)
    private List<Orcamentoreserva> orcamentoreservaList;
    @OneToMany(mappedBy = "idorigem",fetch=FetchType.LAZY)
    private List<Contasfront> contasfrontList;
    @OneToMany(mappedBy = "idorigem",fetch=FetchType.LAZY)
    private List<Tarifahotel> tarifahotelList;
    @OneToMany(mappedBy = "idorigem",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList;
    @OneToMany(mappedBy = "idorigemcentres",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList1;
    @OneToMany(mappedBy = "idorigempadraogrp",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList2;
    @JoinColumn(name = "IDPESSOA", referencedColumnName = "IDPESSOA")
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Clientepess idpessoa;
    
    public Origemreserva() {
    }

    public Origemreserva(Long idorigem) {
        this.idorigem = idorigem;
    }

    public Long getIdorigem() {
        return idorigem;
    }

    public void setIdorigem(Long idorigem) {
        this.idorigem = idorigem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodreduzido() {
        return codreduzido;
    }

    public void setCodreduzido(String codreduzido) {
        this.codreduzido = codreduzido;
    }

    public BigDecimal getPerccomissao() {
        return perccomissao;
    }

    public void setPerccomissao(BigDecimal perccomissao) {
        this.perccomissao = perccomissao;
    }

    public Character getFlgaltera() {
        return flgaltera;
    }

    public void setFlgaltera(Character flgaltera) {
        this.flgaltera = flgaltera;
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

    public BigDecimal getValorcomissao() {
        return valorcomissao;
    }

    public void setValorcomissao(BigDecimal valorcomissao) {
        this.valorcomissao = valorcomissao;
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

    public Clientepess getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Clientepess idpessoa) {
        this.idpessoa = idpessoa;
    }

    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idorigem == null) ? 0 : idorigem.hashCode());
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
		Origemreserva other = (Origemreserva) obj;
		if (idorigem == null) {
			if (other.idorigem != null)
				return false;
		} else if (!idorigem.equals(other.idorigem))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Origemreserva[ idorigem=" + idorigem + " ]";
    }

    

    @Transient
    public String getLabel() {
        return this.getDescricao();
    }
}

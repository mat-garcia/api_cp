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
@Table(name = "VEICULOSCOMUNICA")
@XmlRootElement
public class Veiculoscomunica implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDVEICULOS", nullable = false, precision = 22)
    private Long idveiculos;
    @Column(name = "DESCRICAO", length = 60)
    private String descricao;
    @Column(name = "GRATUITO")
    private Character gratuito;
    @Column(name = "CODREDUZIDO", length = 3)
    private String codreduzido;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "FLGATIVO")
    private Character flgativo;
    @OneToMany(mappedBy = "idveiculos",fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList;
    @OneToMany(mappedBy = "idveiculoscentres",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList;
    @OneToMany(mappedBy = "idveicpadraogrp",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList1;
    @OneToMany(mappedBy = "idveiculos",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList2;
   
    public Veiculoscomunica() {
    }

    public Veiculoscomunica(Long idveiculos) {
        this.idveiculos = idveiculos;
    }

    public Long getIdveiculos() {
        return idveiculos;
    }

    public void setIdveiculos(Long idveiculos) {
        this.idveiculos = idveiculos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Character getGratuito() {
        return gratuito;
    }

    public void setGratuito(Character gratuito) {
        this.gratuito = gratuito;
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

    @XmlTransient
    public List<Reservasfront> getReservasfrontList() {
        return reservasfrontList;
    }

    public void setReservasfrontList(List<Reservasfront> reservasfrontList) {
        this.reservasfrontList = reservasfrontList;
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
		result = prime * result + ((idveiculos == null) ? 0 : idveiculos.hashCode());
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
		Veiculoscomunica other = (Veiculoscomunica) obj;
		if (idveiculos == null) {
			if (other.idveiculos != null)
				return false;
		} else if (!idveiculos.equals(other.idveiculos))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Veiculoscomunica[ idveiculos=" + idveiculos + " ]";
    }
    
    @Transient
    public String getLabel() {
        return  this.getDescricao();
    }
    
}

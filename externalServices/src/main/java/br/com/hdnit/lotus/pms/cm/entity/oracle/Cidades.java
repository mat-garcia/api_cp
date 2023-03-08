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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "CIDADES")
@XmlRootElement
public class Cidades implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDCIDADES", nullable = false, precision = 22)
    private Long idcidades;
    @Column(name = "CODIGO_SABRE", length = 4)
    private String codigoSabre;
    @Column(name = "UF", length = 3)
    private String uf;
    @Column(name = "DDD", length = 5)
    private String ddd;
    @Column(name = "IDICONE")
    private Integer idicone;
    @Column(name = "NOME", length = 50)
    private String nome;
    @Column(name = "PAIS", length = 50)
    private String pais;
    @Column(name = "CODMUNICIPIO", length = 10)
    private String codmunicipio;
    @Basic(optional = false)
    @Column(name = "IDESTADO", nullable = false)
    private BigInteger idestado;
    @Column(name = "NUMSEED", length = 30)
    private String numseed;
    @Column(name = "CODMUNICIPIOIBGE", length = 7)
    private String codmunicipioibge;
    @Column(name = "CODDIPAM")
    private Integer coddipam;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "CODSIAFI", length = 10)
    private String codsiafi;
    @Column(name = "CODMUNICIPIOGOIANIA", length = 6)
    private String codmunicipiogoiania;
    @Column(name = "CODDIMOB")
    private BigInteger coddimob;
    @OneToMany(mappedBy = "idcidades")
    private List<Hospede> hospedeList;
    @OneToMany(mappedBy = "idcidades")
    private List<Endpess> endpessList;
    @OneToMany(mappedBy = "idcidades")
    private List<Hotel> hotelList;

    public Cidades() {
    }

    public Cidades(Long idcidades) {
        this.idcidades = idcidades;
    }

    public Cidades(Long idcidades, BigInteger idestado) {
        this.idcidades = idcidades;
        this.idestado = idestado;
    }

    public Long getIdcidades() {
        return idcidades;
    }

    public void setIdcidades(Long idcidades) {
        this.idcidades = idcidades;
    }

    public String getCodigoSabre() {
        return codigoSabre;
    }

    public void setCodigoSabre(String codigoSabre) {
        this.codigoSabre = codigoSabre;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Integer getIdicone() {
        return idicone;
    }

    public void setIdicone(Integer idicone) {
        this.idicone = idicone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodmunicipio() {
        return codmunicipio;
    }

    public void setCodmunicipio(String codmunicipio) {
        this.codmunicipio = codmunicipio;
    }

    public BigInteger getIdestado() {
        return idestado;
    }

    public void setIdestado(BigInteger idestado) {
        this.idestado = idestado;
    }

    public String getNumseed() {
        return numseed;
    }

    public void setNumseed(String numseed) {
        this.numseed = numseed;
    }

    public String getCodmunicipioibge() {
        return codmunicipioibge;
    }

    public void setCodmunicipioibge(String codmunicipioibge) {
        this.codmunicipioibge = codmunicipioibge;
    }

    public Integer getCoddipam() {
        return coddipam;
    }

    public void setCoddipam(Integer coddipam) {
        this.coddipam = coddipam;
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

    public String getCodsiafi() {
        return codsiafi;
    }

    public void setCodsiafi(String codsiafi) {
        this.codsiafi = codsiafi;
    }

    public String getCodmunicipiogoiania() {
        return codmunicipiogoiania;
    }

    public void setCodmunicipiogoiania(String codmunicipiogoiania) {
        this.codmunicipiogoiania = codmunicipiogoiania;
    }

    public BigInteger getCoddimob() {
        return coddimob;
    }

    public void setCoddimob(BigInteger coddimob) {
        this.coddimob = coddimob;
    }

  
    @XmlTransient
    public List<Hospede> getHospedeList() {
        return hospedeList;
    }

    public void setHospedeList(List<Hospede> hospedeList) {
        this.hospedeList = hospedeList;
    }

    @XmlTransient
    public List<Endpess> getEndpessList() {
        return endpessList;
    }

    public void setEndpessList(List<Endpess> endpessList) {
        this.endpessList = endpessList;
    }

    @XmlTransient
    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idcidades == null) ? 0 : idcidades.hashCode());
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
		Cidades other = (Cidades) obj;
		if (idcidades == null) {
			if (other.idcidades != null)
				return false;
		} else if (!idcidades.equals(other.idcidades))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Cidades[ idcidades=" + idcidades + " ]";
    }
    

    @Transient
    public String getLabel() {
        return this.getNome();
    }
}

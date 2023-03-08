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
@Table(name = "FAIXAETARIA")
@XmlRootElement
public class Faixaetaria implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDFAIXAETARIA", nullable = false, precision = 22)
    private Long idfaixaetaria;
    @Column(name = "DESCRICAO", length = 60)
    private String descricao;
    @Column(name = "CODREDUZIDO", length = 3)
    private String codreduzido;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "TIPOETARIO")
    private Short tipoetario;
    @OneToMany(mappedBy = "idfaixaetaria",fetch=FetchType.LAZY)
    private List<Hospede> hospedeList;

    public Faixaetaria() {
    }

    public Faixaetaria(Long idfaixaetaria) {
        this.idfaixaetaria = idfaixaetaria;
    }

    public Long getIdfaixaetaria() {
        return idfaixaetaria;
    }

    public void setIdfaixaetaria(Long idfaixaetaria) {
        this.idfaixaetaria = idfaixaetaria;
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

    public Short getTipoetario() {
        return tipoetario;
    }

    public void setTipoetario(Short tipoetario) {
        this.tipoetario = tipoetario;
    }

    @XmlTransient
    public List<Hospede> getHospedeList() {
        return hospedeList;
    }

    public void setHospedeList(List<Hospede> hospedeList) {
        this.hospedeList = hospedeList;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idfaixaetaria == null) ? 0 : idfaixaetaria.hashCode());
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
		Faixaetaria other = (Faixaetaria) obj;
		if (idfaixaetaria == null) {
			if (other.idfaixaetaria != null)
				return false;
		} else if (!idfaixaetaria.equals(other.idfaixaetaria))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Faixaetaria[ idfaixaetaria=" + idfaixaetaria + " ]";
    }
    
    @Transient
    public String getLabel() {
        return  this.getDescricao();
    }
}

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
@Table(name = "DOCCONFIRMAHOTEL")
@XmlRootElement
public class Docconfirmahotel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDDOCUMENTO", nullable = false, precision = 22)
    private Long iddocumento;
    @Column(name = "DESCRICAO", length = 60)
    private String descricao;
    @Column(name = "OBRIGANUMERO")
    private Character obriganumero;
    @Column(name = "CODREDUZIDO", length = 2)
    private String codreduzido;
    @Column(name = "OBRIGADATAVAL")
    private Character obrigadataval;
    @Column(name = "TIPOVALIDACARTAO", length = 20)
    private String tipovalidacartao;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "FLGIMPRIMENOSLIP")
    private Character flgimprimenoslip;
    @OneToMany(mappedBy = "iddocumento",fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList;
    @OneToMany(mappedBy = "iddoccentres",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList;
    
    public Docconfirmahotel() {
    }

    public Docconfirmahotel(Long iddocumento) {
        this.iddocumento = iddocumento;
    }

    public Long getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Long iddocumento) {
        this.iddocumento = iddocumento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Character getObriganumero() {
        return obriganumero;
    }

    public void setObriganumero(Character obriganumero) {
        this.obriganumero = obriganumero;
    }

    public String getCodreduzido() {
        return codreduzido;
    }

    public void setCodreduzido(String codreduzido) {
        this.codreduzido = codreduzido;
    }

    public Character getObrigadataval() {
        return obrigadataval;
    }

    public void setObrigadataval(Character obrigadataval) {
        this.obrigadataval = obrigadataval;
    }

    public String getTipovalidacartao() {
        return tipovalidacartao;
    }

    public void setTipovalidacartao(String tipovalidacartao) {
        this.tipovalidacartao = tipovalidacartao;
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

    public Character getFlgimprimenoslip() {
        return flgimprimenoslip;
    }

    public void setFlgimprimenoslip(Character flgimprimenoslip) {
        this.flgimprimenoslip = flgimprimenoslip;
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

  
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((iddocumento == null) ? 0 : iddocumento.hashCode());
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
		Docconfirmahotel other = (Docconfirmahotel) obj;
		if (iddocumento == null) {
			if (other.iddocumento != null)
				return false;
		} else if (!iddocumento.equals(other.iddocumento))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Docconfirmahotel[ iddocumento=" + iddocumento + " ]";
    }

    @Transient
    public String getLabel() {
        return this.getDescricao();
    }
}

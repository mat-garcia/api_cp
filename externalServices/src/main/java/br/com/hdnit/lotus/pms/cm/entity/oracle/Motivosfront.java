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
@Table(name = "MOTIVOSFRONT")
@XmlRootElement
public class Motivosfront implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDMOTIVO", nullable = false, precision = 22)
    private Long idmotivo;
    @Column(name = "DESCRICAO", length = 60)
    private String descricao;
    @Column(name = "TIRAINVENTARIO")
    private Character tirainventario;
    @Column(name = "APLICACAO")
    private Character aplicacao;
    @Column(name = "CODREDUZIDO", length = 3)
    private String codreduzido;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Basic(optional = false)
    @Column(name = "FLGATIVO", nullable = false)
    private Character flgativo;
    @Column(name = "FLGTEXTOLIVRE")
    private Character flgtextolivre;
    @Column(name = "FLGDEVOLUCAOPERDA")
    private Character flgdevolucaoperda;
    @Column(name = "IDREGISTROORIGEM")
    private BigInteger idregistroorigem;
    @OneToMany(mappedBy = "idmotivo",fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList;
    @OneToMany(mappedBy = "idmotivoestimp",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList;
    @OneToMany(mappedBy = "idmotivoestcort",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList1;
    @OneToMany(mappedBy = "idmotivocentres",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList2;
    @OneToMany(mappedBy = "idmotpdrdescctr",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList3;
   
    public Motivosfront() {
    }

    public Motivosfront(Long idmotivo) {
        this.idmotivo = idmotivo;
    }

    public Motivosfront(Long idmotivo, Character flgativo) {
        this.idmotivo = idmotivo;
        this.flgativo = flgativo;
    }

    public Long getIdmotivo() {
        return idmotivo;
    }

    public void setIdmotivo(Long idmotivo) {
        this.idmotivo = idmotivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Character getTirainventario() {
        return tirainventario;
    }

    public void setTirainventario(Character tirainventario) {
        this.tirainventario = tirainventario;
    }

    public Character getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(Character aplicacao) {
        this.aplicacao = aplicacao;
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

    public Character getFlgtextolivre() {
        return flgtextolivre;
    }

    public void setFlgtextolivre(Character flgtextolivre) {
        this.flgtextolivre = flgtextolivre;
    }

    public Character getFlgdevolucaoperda() {
        return flgdevolucaoperda;
    }

    public void setFlgdevolucaoperda(Character flgdevolucaoperda) {
        this.flgdevolucaoperda = flgdevolucaoperda;
    }

    public BigInteger getIdregistroorigem() {
        return idregistroorigem;
    }

    public void setIdregistroorigem(BigInteger idregistroorigem) {
        this.idregistroorigem = idregistroorigem;
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

    @XmlTransient
    public List<Paramhotel> getParamhotelList3() {
        return paramhotelList3;
    }

    public void setParamhotelList3(List<Paramhotel> paramhotelList3) {
        this.paramhotelList3 = paramhotelList3;
    }

   
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idmotivo == null) ? 0 : idmotivo.hashCode());
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
		Motivosfront other = (Motivosfront) obj;
		if (idmotivo == null) {
			if (other.idmotivo != null)
				return false;
		} else if (!idmotivo.equals(other.idmotivo))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Motivosfront[ idmotivo=" + idmotivo + " ]";
    }
    
    @Transient
    public String getLabel() {
        return  this.getDescricao();
    }
    
}

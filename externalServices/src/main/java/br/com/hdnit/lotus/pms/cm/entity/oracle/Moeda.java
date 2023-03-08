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
@Table(name = "MOEDA")
@XmlRootElement
public class Moeda implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "MOECODIGO", nullable = false, precision = 22)
    private Long moecodigo;
    @Basic(optional = false)
    @Column(name = "MOEDESC", nullable = false, length = 20)
    private String moedesc;
    @Basic(optional = false)
    @Column(name = "MOESIGLA", nullable = false, length = 10)
    private String moesigla;
    @Column(name = "MOEPERIODICIDADE")
    private Character moeperiodicidade;
    @Column(name = "MOEINATIVO")
    private Character moeinativo;
    @Column(name = "FLGPERCVALOR")
    private Character flgpercvalor;
    @Column(name = "FATORCONVERSAO", precision = 21, scale = 12)
    private BigDecimal fatorconversao;
    @Column(name = "DATAINICIO")
    @Temporal(TemporalType.DATE)
    private Date datainicio;
    @Column(name = "DATAFIM")
    @Temporal(TemporalType.DATE)
    private Date datafim;
    @Column(name = "FLGTIPOPRAZO")
    private Character flgtipoprazo;
    @Column(name = "FLGPERIODO")
    private Character flgperiodo;
    @Column(name = "DESCUNIDADETAXA", length = 30)
    private String descunidadetaxa;
    @Column(name = "FLGTESTADATASCOT")
    private Character flgtestadatascot;
    @Column(name = "DESCMOEPLURAL", length = 60)
    private String descmoeplural;
    @Column(name = "DESCMOESINGULAR", length = 60)
    private String descmoesingular;
    @Column(name = "DESCCENTSINGULAR", length = 60)
    private String desccentsingular;
    @Column(name = "DESCCENTPLURAL", length = 60)
    private String desccentplural;
    @Column(name = "NUMDECIMAIS")
    private Short numdecimais;
    @Column(name = "FLGARREDONDA")
    private Character flgarredonda;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "CODIGOISO", length = 5)
    private String codigoiso;
    @Column(name = "CODMOEDASISCOSERV", length = 4)
    private String codmoedasiscoserv;
    @OneToMany(mappedBy = "moecodigomanual")
    private List<Reservasfront> reservasfrontList;
    @OneToMany(mappedBy = "moedeposito",fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList1;
    @OneToMany(mappedBy = "moedareferencia",fetch=FetchType.LAZY)
    private List<Moeda> moedaList;
    @JoinColumn(name = "MOEDAREFERENCIA", referencedColumnName = "MOECODIGO")
    @ManyToOne
    private Moeda moedareferencia;
    @JoinColumn(name = "IDUSUARIOINCLUSAO", referencedColumnName = "IDPESSOA", nullable = false)
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Pessoa idusuarioinclusao;
    @OneToMany(mappedBy = "moecodigo",fetch=FetchType.LAZY)
    private List<Tarifahotel> tarifahotelList;
    @OneToMany(mappedBy = "moedanacional",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList;
    @OneToMany(mappedBy = "moedadolar",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList1;
    @OneToMany(mappedBy = "moedacafe",fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList2;
    @OneToMany(mappedBy = "moecodigo",fetch=FetchType.LAZY)
    private List<Contrclihotel> contrclihotelList;
  
    public Moeda() {
    }

    public Moeda(Long moecodigo) {
        this.moecodigo = moecodigo;
    }

    public Moeda(Long moecodigo, String moedesc, String moesigla) {
        this.moecodigo = moecodigo;
        this.moedesc = moedesc;
        this.moesigla = moesigla;
    }

    public Long getMoecodigo() {
        return moecodigo;
    }

    public void setMoecodigo(Long moecodigo) {
        this.moecodigo = moecodigo;
    }

    public String getMoedesc() {
        return moedesc;
    }

    public void setMoedesc(String moedesc) {
        this.moedesc = moedesc;
    }

    public String getMoesigla() {
        return moesigla;
    }

    public void setMoesigla(String moesigla) {
        this.moesigla = moesigla;
    }

    public Character getMoeperiodicidade() {
        return moeperiodicidade;
    }

    public void setMoeperiodicidade(Character moeperiodicidade) {
        this.moeperiodicidade = moeperiodicidade;
    }

    public Character getMoeinativo() {
        return moeinativo;
    }

    public void setMoeinativo(Character moeinativo) {
        this.moeinativo = moeinativo;
    }

    public Character getFlgpercvalor() {
        return flgpercvalor;
    }

    public void setFlgpercvalor(Character flgpercvalor) {
        this.flgpercvalor = flgpercvalor;
    }

    public BigDecimal getFatorconversao() {
        return fatorconversao;
    }

    public void setFatorconversao(BigDecimal fatorconversao) {
        this.fatorconversao = fatorconversao;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatafim() {
        return datafim;
    }

    public void setDatafim(Date datafim) {
        this.datafim = datafim;
    }

    public Character getFlgtipoprazo() {
        return flgtipoprazo;
    }

    public void setFlgtipoprazo(Character flgtipoprazo) {
        this.flgtipoprazo = flgtipoprazo;
    }

    public Character getFlgperiodo() {
        return flgperiodo;
    }

    public void setFlgperiodo(Character flgperiodo) {
        this.flgperiodo = flgperiodo;
    }

    public String getDescunidadetaxa() {
        return descunidadetaxa;
    }

    public void setDescunidadetaxa(String descunidadetaxa) {
        this.descunidadetaxa = descunidadetaxa;
    }

    public Character getFlgtestadatascot() {
        return flgtestadatascot;
    }

    public void setFlgtestadatascot(Character flgtestadatascot) {
        this.flgtestadatascot = flgtestadatascot;
    }

    public String getDescmoeplural() {
        return descmoeplural;
    }

    public void setDescmoeplural(String descmoeplural) {
        this.descmoeplural = descmoeplural;
    }

    public String getDescmoesingular() {
        return descmoesingular;
    }

    public void setDescmoesingular(String descmoesingular) {
        this.descmoesingular = descmoesingular;
    }

    public String getDesccentsingular() {
        return desccentsingular;
    }

    public void setDesccentsingular(String desccentsingular) {
        this.desccentsingular = desccentsingular;
    }

    public String getDesccentplural() {
        return desccentplural;
    }

    public void setDesccentplural(String desccentplural) {
        this.desccentplural = desccentplural;
    }

    public Short getNumdecimais() {
        return numdecimais;
    }

    public void setNumdecimais(Short numdecimais) {
        this.numdecimais = numdecimais;
    }

    public Character getFlgarredonda() {
        return flgarredonda;
    }

    public void setFlgarredonda(Character flgarredonda) {
        this.flgarredonda = flgarredonda;
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

    public String getCodigoiso() {
        return codigoiso;
    }

    public void setCodigoiso(String codigoiso) {
        this.codigoiso = codigoiso;
    }

    public String getCodmoedasiscoserv() {
        return codmoedasiscoserv;
    }

    public void setCodmoedasiscoserv(String codmoedasiscoserv) {
        this.codmoedasiscoserv = codmoedasiscoserv;
    }

    
    @XmlTransient
    public List<Reservasfront> getReservasfrontList() {
        return reservasfrontList;
    }

    public void setReservasfrontList(List<Reservasfront> reservasfrontList) {
        this.reservasfrontList = reservasfrontList;
    }

    @XmlTransient
    public List<Reservasfront> getReservasfrontList1() {
        return reservasfrontList1;
    }

    public void setReservasfrontList1(List<Reservasfront> reservasfrontList1) {
        this.reservasfrontList1 = reservasfrontList1;
    }

    
    @XmlTransient
    public List<Moeda> getMoedaList() {
        return moedaList;
    }

    public void setMoedaList(List<Moeda> moedaList) {
        this.moedaList = moedaList;
    }

    public Moeda getMoedareferencia() {
        return moedareferencia;
    }

    public void setMoedareferencia(Moeda moedareferencia) {
        this.moedareferencia = moedareferencia;
    }

    public Pessoa getIdusuarioinclusao() {
        return idusuarioinclusao;
    }

    public void setIdusuarioinclusao(Pessoa idusuarioinclusao) {
        this.idusuarioinclusao = idusuarioinclusao;
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

    @XmlTransient
    public List<Contrclihotel> getContrclihotelList() {
        return contrclihotelList;
    }

    public void setContrclihotelList(List<Contrclihotel> contrclihotelList) {
        this.contrclihotelList = contrclihotelList;
    }

  
  
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((moecodigo == null) ? 0 : moecodigo.hashCode());
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
		Moeda other = (Moeda) obj;
		if (moecodigo == null) {
			if (other.moecodigo != null)
				return false;
		} else if (!moecodigo.equals(other.moecodigo))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Moeda[ moecodigo=" + moecodigo + " ]";
    }
    

    @Transient
    public String getLabel() {
        return this.getMoedesc();
    }
}

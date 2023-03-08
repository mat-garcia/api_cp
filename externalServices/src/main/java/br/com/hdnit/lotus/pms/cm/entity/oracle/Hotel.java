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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "HOTEL")
@XmlRootElement
public class Hotel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDHOTEL", nullable = false, precision = 22)
    private Long idhotel;
    @Column(name = "CODCHAVE", length = 15)
    private String codchave;
    @Column(name = "AGPROPERTYID", length = 35)
    private String agpropertyid;
    @Column(name = "REGEMBRATUR", length = 15)
    private String regembratur;
    @Column(name = "CAIXAPOSTAL", length = 8)
    private String caixapostal;
    @Column(name = "URL", length = 50)
    private String url;
    @Column(name = "CODCMNET", length = 4)
    private String codcmnet;
    @Column(name = "CODVEHS", length = 2)
    private String codvehs;
    @Column(name = "CODCONTRATO")
    private Short codcontrato;
    @Column(name = "ATIVO")
    private Character ativo;
    @Column(name = "BLOQUEIA")
    private Character bloqueia;
    @Column(name = "CLASSE", length = 20)
    private String classe;
    @Column(name = "CODFATURAMENTO", length = 7)
    private String codfaturamento;
    @Column(name = "CODSABRE", length = 20)
    private String codsabre;
    @Column(name = "CONTATO", length = 60)
    private String contato;
    @Column(name = "LIMITEPERNOITE")
    private Short limitepernoite;
    @Column(name = "LIMITEGRUPO")
    private Short limitegrupo;
    @Column(name = "QTDESTRELAS")
    private Short qtdestrelas;
    @Column(name = "LIMITEMULTROOM")
    private Short limitemultroom;
    @Column(name = "LOCALIZACAOPOR", length = 63)
    private String localizacaopor;
    @Column(name = "LOCALIZACAOING", length = 63)
    private String localizacaoing;
    @Column(name = "TRANSPORTEPOR", length = 63)
    private String transportepor;
    @Column(name = "TRANSPORTEING", length = 63)
    private String transporteing;
    @Column(name = "FACILIDADESPOR", length = 63)
    private String facilidadespor;
    @Column(name = "FACILIDADESING", length = 63)
    private String facilidadesing;
    @Column(name = "SERVICOSPOR", length = 63)
    private String servicospor;
    @Column(name = "SERVICOSING", length = 63)
    private String servicosing;
    @Column(name = "OUTROSSERVPOR", length = 63)
    private String outrosservpor;
    @Column(name = "OUTROSSERVING", length = 63)
    private String outrosserving;
    @Column(name = "TEXTOCOMERCPOR", length = 63)
    private String textocomercpor;
    @Column(name = "TEXTOCOMERCING", length = 63)
    private String textocomercing;
    @Column(name = "VLRASSINATURA", precision = 17, scale = 2)
    private BigDecimal vlrassinatura;
    @Column(name = "DATAINCCMNET")
    @Temporal(TemporalType.DATE)
    private Date datainccmnet;
    @Column(name = "OBSERVACAO", length = 1000)
    private String observacao;
    @Column(name = "CODCANCELAMENTO")
    private Character codcancelamento;
    @Column(name = "NUMCANCELAMENTO")
    private Short numcancelamento;
    @Column(name = "MAXASSCOBRANCA")
    private Short maxasscobranca;
    @Column(name = "MINASSCOBRANCA")
    private Short minasscobranca;
    @Column(name = "MESINICORTESIA", length = 7)
    private String mesinicortesia;
    @Column(name = "MESFIMCORTESIA", length = 7)
    private String mesfimcortesia;
    @Column(name = "FLGUSANOSISTEMA")
    private Character flgusanosistema;
    @Column(name = "FLGOUTROSHOTEIS")
    private Character flgoutroshoteis;
    @Column(name = "NUMEROHOTEL")
    private BigInteger numerohotel;
    @Column(name = "CODOUTROSISTEMA", length = 20)
    private String codoutrosistema;
    @Column(name = "NOMEEMPREENDIMENTO", length = 100)
    private String nomeempreendimento;
    @Column(name = "DATAENCERRAOBRA")
    @Temporal(TemporalType.DATE)
    private Date dataencerraobra;
    @Column(name = "FLGUSAPOLGERAL")
    private Character flgusapolgeral;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "USUOUTROSISTEMA", length = 20)
    private String usuoutrosistema;
    @Column(name = "SENHAOUTROSISTEMA", length = 20)
    private String senhaoutrosistema;
    @Column(name = "FLGTIMESHARING")
    private Character flgtimesharing;
    @Column(name = "FLGSPA")
    private Character flgspa;
    @Column(name = "IDRESPRFB")
    private BigInteger idresprfb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel",fetch=FetchType.LAZY)
    private List<Segmento> segmentoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel",fetch=FetchType.LAZY)
    private List<Hospedexhotel> hospedexhotelList;
    @OneToMany(mappedBy = "idhotelori",fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList;
    @OneToMany(mappedBy = "idhotel",fetch=FetchType.LAZY)
    private List<Reservareduz> reservareduzList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhotel",fetch=FetchType.LAZY)
    private List<Contasfront> contasfrontList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel",fetch=FetchType.LAZY)
    private List<Tarifahotel> tarifahotelList;
    @OneToOne(optional=false, cascade = CascadeType.ALL, mappedBy = "hotel",fetch=FetchType.LAZY)
    private Paramhotel paramhotel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel",fetch=FetchType.LAZY)
    private List<Contrclihotel> contrclihotelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel",fetch=FetchType.LAZY)
    private List<Tipouh> tipouhList;
    @JoinColumn(name = "IDCIDADES", referencedColumnName = "IDCIDADES")
    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    private Cidades idcidades;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDPESSOA", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false,fetch=FetchType.LAZY)
    private Pessoa pessoa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel",fetch=FetchType.LAZY)
    private List<Tipohospede> tipohospedeList;

    public Hotel() {
    }

    public Hotel(Long idhotel) {
        this.idhotel = idhotel;
    }

    public Long getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(Long idhotel) {
        this.idhotel = idhotel;
    }

    public String getCodchave() {
        return codchave;
    }

    public void setCodchave(String codchave) {
        this.codchave = codchave;
    }

    public String getAgpropertyid() {
        return agpropertyid;
    }

    public void setAgpropertyid(String agpropertyid) {
        this.agpropertyid = agpropertyid;
    }

    public String getRegembratur() {
        return regembratur;
    }

    public void setRegembratur(String regembratur) {
        this.regembratur = regembratur;
    }

    public String getCaixapostal() {
        return caixapostal;
    }

    public void setCaixapostal(String caixapostal) {
        this.caixapostal = caixapostal;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCodcmnet() {
        return codcmnet;
    }

    public void setCodcmnet(String codcmnet) {
        this.codcmnet = codcmnet;
    }

    public String getCodvehs() {
        return codvehs;
    }

    public void setCodvehs(String codvehs) {
        this.codvehs = codvehs;
    }

    public Short getCodcontrato() {
        return codcontrato;
    }

    public void setCodcontrato(Short codcontrato) {
        this.codcontrato = codcontrato;
    }

    public Character getAtivo() {
        return ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

    public Character getBloqueia() {
        return bloqueia;
    }

    public void setBloqueia(Character bloqueia) {
        this.bloqueia = bloqueia;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getCodfaturamento() {
        return codfaturamento;
    }

    public void setCodfaturamento(String codfaturamento) {
        this.codfaturamento = codfaturamento;
    }

    public String getCodsabre() {
        return codsabre;
    }

    public void setCodsabre(String codsabre) {
        this.codsabre = codsabre;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Short getLimitepernoite() {
        return limitepernoite;
    }

    public void setLimitepernoite(Short limitepernoite) {
        this.limitepernoite = limitepernoite;
    }

    public Short getLimitegrupo() {
        return limitegrupo;
    }

    public void setLimitegrupo(Short limitegrupo) {
        this.limitegrupo = limitegrupo;
    }

    public Short getQtdestrelas() {
        return qtdestrelas;
    }

    public void setQtdestrelas(Short qtdestrelas) {
        this.qtdestrelas = qtdestrelas;
    }

    public Short getLimitemultroom() {
        return limitemultroom;
    }

    public void setLimitemultroom(Short limitemultroom) {
        this.limitemultroom = limitemultroom;
    }

    public String getLocalizacaopor() {
        return localizacaopor;
    }

    public void setLocalizacaopor(String localizacaopor) {
        this.localizacaopor = localizacaopor;
    }

    public String getLocalizacaoing() {
        return localizacaoing;
    }

    public void setLocalizacaoing(String localizacaoing) {
        this.localizacaoing = localizacaoing;
    }

    public String getTransportepor() {
        return transportepor;
    }

    public void setTransportepor(String transportepor) {
        this.transportepor = transportepor;
    }

    public String getTransporteing() {
        return transporteing;
    }

    public void setTransporteing(String transporteing) {
        this.transporteing = transporteing;
    }

    public String getFacilidadespor() {
        return facilidadespor;
    }

    public void setFacilidadespor(String facilidadespor) {
        this.facilidadespor = facilidadespor;
    }

    public String getFacilidadesing() {
        return facilidadesing;
    }

    public void setFacilidadesing(String facilidadesing) {
        this.facilidadesing = facilidadesing;
    }

    public String getServicospor() {
        return servicospor;
    }

    public void setServicospor(String servicospor) {
        this.servicospor = servicospor;
    }

    public String getServicosing() {
        return servicosing;
    }

    public void setServicosing(String servicosing) {
        this.servicosing = servicosing;
    }

    public String getOutrosservpor() {
        return outrosservpor;
    }

    public void setOutrosservpor(String outrosservpor) {
        this.outrosservpor = outrosservpor;
    }

    public String getOutrosserving() {
        return outrosserving;
    }

    public void setOutrosserving(String outrosserving) {
        this.outrosserving = outrosserving;
    }

    public String getTextocomercpor() {
        return textocomercpor;
    }

    public void setTextocomercpor(String textocomercpor) {
        this.textocomercpor = textocomercpor;
    }

    public String getTextocomercing() {
        return textocomercing;
    }

    public void setTextocomercing(String textocomercing) {
        this.textocomercing = textocomercing;
    }

    public BigDecimal getVlrassinatura() {
        return vlrassinatura;
    }

    public void setVlrassinatura(BigDecimal vlrassinatura) {
        this.vlrassinatura = vlrassinatura;
    }

    public Date getDatainccmnet() {
        return datainccmnet;
    }

    public void setDatainccmnet(Date datainccmnet) {
        this.datainccmnet = datainccmnet;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Character getCodcancelamento() {
        return codcancelamento;
    }

    public void setCodcancelamento(Character codcancelamento) {
        this.codcancelamento = codcancelamento;
    }

    public Short getNumcancelamento() {
        return numcancelamento;
    }

    public void setNumcancelamento(Short numcancelamento) {
        this.numcancelamento = numcancelamento;
    }

    public Short getMaxasscobranca() {
        return maxasscobranca;
    }

    public void setMaxasscobranca(Short maxasscobranca) {
        this.maxasscobranca = maxasscobranca;
    }

    public Short getMinasscobranca() {
        return minasscobranca;
    }

    public void setMinasscobranca(Short minasscobranca) {
        this.minasscobranca = minasscobranca;
    }

    public String getMesinicortesia() {
        return mesinicortesia;
    }

    public void setMesinicortesia(String mesinicortesia) {
        this.mesinicortesia = mesinicortesia;
    }

    public String getMesfimcortesia() {
        return mesfimcortesia;
    }

    public void setMesfimcortesia(String mesfimcortesia) {
        this.mesfimcortesia = mesfimcortesia;
    }

    public Character getFlgusanosistema() {
        return flgusanosistema;
    }

    public void setFlgusanosistema(Character flgusanosistema) {
        this.flgusanosistema = flgusanosistema;
    }

    public Character getFlgoutroshoteis() {
        return flgoutroshoteis;
    }

    public void setFlgoutroshoteis(Character flgoutroshoteis) {
        this.flgoutroshoteis = flgoutroshoteis;
    }

    public BigInteger getNumerohotel() {
        return numerohotel;
    }

    public void setNumerohotel(BigInteger numerohotel) {
        this.numerohotel = numerohotel;
    }

    public String getCodoutrosistema() {
        return codoutrosistema;
    }

    public void setCodoutrosistema(String codoutrosistema) {
        this.codoutrosistema = codoutrosistema;
    }

    public String getNomeempreendimento() {
        return nomeempreendimento;
    }

    public void setNomeempreendimento(String nomeempreendimento) {
        this.nomeempreendimento = nomeempreendimento;
    }

    public Date getDataencerraobra() {
        return dataencerraobra;
    }

    public void setDataencerraobra(Date dataencerraobra) {
        this.dataencerraobra = dataencerraobra;
    }

    public Character getFlgusapolgeral() {
        return flgusapolgeral;
    }

    public void setFlgusapolgeral(Character flgusapolgeral) {
        this.flgusapolgeral = flgusapolgeral;
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

    public String getUsuoutrosistema() {
        return usuoutrosistema;
    }

    public void setUsuoutrosistema(String usuoutrosistema) {
        this.usuoutrosistema = usuoutrosistema;
    }

    public String getSenhaoutrosistema() {
        return senhaoutrosistema;
    }

    public void setSenhaoutrosistema(String senhaoutrosistema) {
        this.senhaoutrosistema = senhaoutrosistema;
    }

    public Character getFlgtimesharing() {
        return flgtimesharing;
    }

    public void setFlgtimesharing(Character flgtimesharing) {
        this.flgtimesharing = flgtimesharing;
    }

    public Character getFlgspa() {
        return flgspa;
    }

    public void setFlgspa(Character flgspa) {
        this.flgspa = flgspa;
    }

    public BigInteger getIdresprfb() {
        return idresprfb;
    }

    public void setIdresprfb(BigInteger idresprfb) {
        this.idresprfb = idresprfb;
    }

    @XmlTransient
    public List<Segmento> getSegmentoList() {
        return segmentoList;
    }

    public void setSegmentoList(List<Segmento> segmentoList) {
        this.segmentoList = segmentoList;
    }

    @XmlTransient
    public List<Hospedexhotel> getHospedexhotelList() {
        return hospedexhotelList;
    }

    public void setHospedexhotelList(List<Hospedexhotel> hospedexhotelList) {
        this.hospedexhotelList = hospedexhotelList;
    }

  
    @XmlTransient
    public List<Reservasfront> getReservasfrontList() {
        return reservasfrontList;
    }

    public void setReservasfrontList(List<Reservasfront> reservasfrontList) {
        this.reservasfrontList = reservasfrontList;
    }

  
    @XmlTransient
    public List<Reservareduz> getReservareduzList() {
        return reservareduzList;
    }

    public void setReservareduzList(List<Reservareduz> reservareduzList) {
        this.reservareduzList = reservareduzList;
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

    
    public Paramhotel getParamhotel() {
        return paramhotel;
    }

    public void setParamhotel(Paramhotel paramhotel) {
        this.paramhotel = paramhotel;
    }

    @XmlTransient
    public List<Contrclihotel> getContrclihotelList() {
        return contrclihotelList;
    }

    public void setContrclihotelList(List<Contrclihotel> contrclihotelList) {
        this.contrclihotelList = contrclihotelList;
    }

    @XmlTransient
    public List<Tipouh> getTipouhList() {
        return tipouhList;
    }

    public void setTipouhList(List<Tipouh> tipouhList) {
        this.tipouhList = tipouhList;
    }

   
    public Cidades getIdcidades() {
        return idcidades;
    }

    public void setIdcidades(Cidades idcidades) {
        this.idcidades = idcidades;
    }

   
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

   
    @XmlTransient
    public List<Tipohospede> getTipohospedeList() {
        return tipohospedeList;
    }

    public void setTipohospedeList(List<Tipohospede> tipohospedeList) {
        this.tipohospedeList = tipohospedeList;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idhotel == null) ? 0 : idhotel.hashCode());
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
		Hotel other = (Hotel) obj;
		if (idhotel == null) {
			if (other.idhotel != null)
				return false;
		} else if (!idhotel.equals(other.idhotel))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Hotel[ idhotel=" + idhotel + " ]";
    }
    
}

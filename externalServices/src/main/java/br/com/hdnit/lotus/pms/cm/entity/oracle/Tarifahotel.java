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
@Table(name = "TARIFAHOTEL")
@XmlRootElement
public class Tarifahotel implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TarifahotelPK tarifahotelPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLRPENSAOINTADT", precision = 17, scale = 2)
    private BigDecimal vlrpensaointadt;
    @Column(name = "VLRPENSAOINTCR1", precision = 17, scale = 2)
    private BigDecimal vlrpensaointcr1;
    @Column(name = "VLRPENSAOINTCR2", precision = 17, scale = 2)
    private BigDecimal vlrpensaointcr2;
    @Basic(optional = false)
    @Column(name = "DESCRICAO", nullable = false, length = 60)
    private String descricao;
    @Column(name = "VLRPENSAOMEIAADT", precision = 17, scale = 2)
    private BigDecimal vlrpensaomeiaadt;
    @Column(name = "TXSERVICOINCL")
    private Character txservicoincl;
    @Column(name = "VLRPENSAOMEIACR1", precision = 17, scale = 2)
    private BigDecimal vlrpensaomeiacr1;
    @Column(name = "IMPOSTOINCL")
    private Character impostoincl;
    @Column(name = "CRIANCASFREE1")
    private Short criancasfree1;
    @Column(name = "CRIANCASFREE2")
    private Short criancasfree2;
    @Column(name = "VLRPENSAOMEIACR2", precision = 17, scale = 2)
    private BigDecimal vlrpensaomeiacr2;
    @Column(name = "FREQUENCIA")
    private Short frequencia;
    @Column(name = "PERCDESCCR1", precision = 6, scale = 2)
    private BigDecimal percdesccr1;
    @Column(name = "PERCDESCCR2", precision = 6, scale = 2)
    private BigDecimal percdesccr2;
    @Column(name = "DATAINICIO")
    @Temporal(TemporalType.DATE)
    private Date datainicio;
    @Column(name = "VLRCAFEMANHAADT", precision = 17, scale = 2)
    private BigDecimal vlrcafemanhaadt;
    @Column(name = "VLRCAFEMANHACR1", precision = 17, scale = 2)
    private BigDecimal vlrcafemanhacr1;
    @Column(name = "DATAFINAL")
    @Temporal(TemporalType.DATE)
    private Date datafinal;
    @Column(name = "ACEITACALRATE")
    private Character aceitacalrate;
    @Column(name = "COMISSAOPADRAO", precision = 17, scale = 2)
    private BigDecimal comissaopadrao;
    @Column(name = "DIASANTACRES")
    private BigInteger diasantacres;
    @Column(name = "VLRCAFEMANHACR2", precision = 17, scale = 2)
    private BigDecimal vlrcafemanhacr2;
    @Column(name = "ESTADAMINIMA")
    private BigInteger estadaminima;
    @Column(name = "ESTADAMAXIMA")
    private BigInteger estadamaxima;
    @Column(name = "DIASWEEKEND", length = 7)
    private String diasweekend;
    @Column(name = "CLOSETOARRIVAL", length = 7)
    private String closetoarrival;
    @Column(name = "VLRPAXSAIDAANTE", precision = 17, scale = 2)
    private BigDecimal vlrpaxsaidaante;
    @Column(name = "TIPOAJUSTE")
    private Character tipoajuste;
    @Column(name = "CODPENSAO")
    private Character codpensao;
    @Column(name = "PERCBALCAO", precision = 7, scale = 3)
    private BigDecimal percbalcao;
    @Column(name = "IDTARIFACMNET")
    private Short idtarifacmnet;
    @Column(name = "FLGSEPARACAFE")
    private Character flgseparacafe;
    @Column(name = "FLGSEPARAPENSAO")
    private Character flgseparapensao;
    @Column(name = "ORDEMPRIORIDADE")
    private Short ordemprioridade;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "OBSERVACAO", length = 400)
    private String observacao;
   /* @Column(name = "USAFIDELIDADE")
    private Character usafidelidade;
    @Column(name = "FLGCONFIDENCIAL")
    private Character flgconfidencial;
    @Column(name = "FLGTARPROMBAR")
    private Character flgtarprombar;
    @Column(name = "ACRECOPIADE")
    private BigInteger acrecopiade;
    @Column(name = "DECRCOPIADE")
    private BigInteger decrcopiade;*/
   /* @Column(name = "TPARREDCOPIADE")
    private Character tparredcopiade;
    @Column(name = "DTCOPIADE")
    @Temporal(TemporalType.DATE)
    private Date dtcopiade;*/
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarifahotel",fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList;
    @OneToMany(mappedBy = "tarifahotel")
    private List<Orcamentoreserva> orcamentoreservaList;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hotel hotel;
    @JoinColumn(name = "MOECODIGO", referencedColumnName = "MOECODIGO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Moeda moecodigo;
    @JoinColumn(name = "IDORIGEM", referencedColumnName = "IDORIGEM")
    @ManyToOne(fetch=FetchType.LAZY)
    private Origemreserva idorigem;
    @JoinColumns({
        @JoinColumn(name = "CODSEGMENTO", referencedColumnName = "CODSEGMENTO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Segmento segmento;
   
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "tarifahotel",fetch=FetchType.LAZY)
    private List<Tarifahotel> tarifahotelList;
   */
    /*@JoinColumns({
        @JoinColumn(name = "IDTARIFAPAI", referencedColumnName = "IDTARIFA", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Tarifahotel tarifahotel;
   */
    public Tarifahotel() {
    }

    public Tarifahotel(TarifahotelPK tarifahotelPK) {
        this.tarifahotelPK = tarifahotelPK;
    }

    public Tarifahotel(TarifahotelPK tarifahotelPK, String descricao) {
        this.tarifahotelPK = tarifahotelPK;
        this.descricao = descricao;
    }

    public Tarifahotel(BigInteger idtarifa, BigInteger idhotel) {
        this.tarifahotelPK = new TarifahotelPK(idtarifa, idhotel);
    }

    public TarifahotelPK getTarifahotelPK() {
        return tarifahotelPK;
    }

    public void setTarifahotelPK(TarifahotelPK tarifahotelPK) {
        this.tarifahotelPK = tarifahotelPK;
    }

    public BigDecimal getVlrpensaointadt() {
        return vlrpensaointadt;
    }

    public void setVlrpensaointadt(BigDecimal vlrpensaointadt) {
        this.vlrpensaointadt = vlrpensaointadt;
    }

    public BigDecimal getVlrpensaointcr1() {
        return vlrpensaointcr1;
    }

    public void setVlrpensaointcr1(BigDecimal vlrpensaointcr1) {
        this.vlrpensaointcr1 = vlrpensaointcr1;
    }

    public BigDecimal getVlrpensaointcr2() {
        return vlrpensaointcr2;
    }

    public void setVlrpensaointcr2(BigDecimal vlrpensaointcr2) {
        this.vlrpensaointcr2 = vlrpensaointcr2;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getVlrpensaomeiaadt() {
        return vlrpensaomeiaadt;
    }

    public void setVlrpensaomeiaadt(BigDecimal vlrpensaomeiaadt) {
        this.vlrpensaomeiaadt = vlrpensaomeiaadt;
    }

    public Character getTxservicoincl() {
        return txservicoincl;
    }

    public void setTxservicoincl(Character txservicoincl) {
        this.txservicoincl = txservicoincl;
    }

    public BigDecimal getVlrpensaomeiacr1() {
        return vlrpensaomeiacr1;
    }

    public void setVlrpensaomeiacr1(BigDecimal vlrpensaomeiacr1) {
        this.vlrpensaomeiacr1 = vlrpensaomeiacr1;
    }

    public Character getImpostoincl() {
        return impostoincl;
    }

    public void setImpostoincl(Character impostoincl) {
        this.impostoincl = impostoincl;
    }

    public Short getCriancasfree1() {
        return criancasfree1;
    }

    public void setCriancasfree1(Short criancasfree1) {
        this.criancasfree1 = criancasfree1;
    }

    public Short getCriancasfree2() {
        return criancasfree2;
    }

    public void setCriancasfree2(Short criancasfree2) {
        this.criancasfree2 = criancasfree2;
    }

    public BigDecimal getVlrpensaomeiacr2() {
        return vlrpensaomeiacr2;
    }

    public void setVlrpensaomeiacr2(BigDecimal vlrpensaomeiacr2) {
        this.vlrpensaomeiacr2 = vlrpensaomeiacr2;
    }

    public Short getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Short frequencia) {
        this.frequencia = frequencia;
    }

    public BigDecimal getPercdesccr1() {
        return percdesccr1;
    }

    public void setPercdesccr1(BigDecimal percdesccr1) {
        this.percdesccr1 = percdesccr1;
    }

    public BigDecimal getPercdesccr2() {
        return percdesccr2;
    }

    public void setPercdesccr2(BigDecimal percdesccr2) {
        this.percdesccr2 = percdesccr2;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public BigDecimal getVlrcafemanhaadt() {
        return vlrcafemanhaadt;
    }

    public void setVlrcafemanhaadt(BigDecimal vlrcafemanhaadt) {
        this.vlrcafemanhaadt = vlrcafemanhaadt;
    }

    public BigDecimal getVlrcafemanhacr1() {
        return vlrcafemanhacr1;
    }

    public void setVlrcafemanhacr1(BigDecimal vlrcafemanhacr1) {
        this.vlrcafemanhacr1 = vlrcafemanhacr1;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public Character getAceitacalrate() {
        return aceitacalrate;
    }

    public void setAceitacalrate(Character aceitacalrate) {
        this.aceitacalrate = aceitacalrate;
    }

    public BigDecimal getComissaopadrao() {
        return comissaopadrao;
    }

    public void setComissaopadrao(BigDecimal comissaopadrao) {
        this.comissaopadrao = comissaopadrao;
    }

    public BigInteger getDiasantacres() {
        return diasantacres;
    }

    public void setDiasantacres(BigInteger diasantacres) {
        this.diasantacres = diasantacres;
    }

    public BigDecimal getVlrcafemanhacr2() {
        return vlrcafemanhacr2;
    }

    public void setVlrcafemanhacr2(BigDecimal vlrcafemanhacr2) {
        this.vlrcafemanhacr2 = vlrcafemanhacr2;
    }

    public BigInteger getEstadaminima() {
        return estadaminima;
    }

    public void setEstadaminima(BigInteger estadaminima) {
        this.estadaminima = estadaminima;
    }

    public BigInteger getEstadamaxima() {
        return estadamaxima;
    }

    public void setEstadamaxima(BigInteger estadamaxima) {
        this.estadamaxima = estadamaxima;
    }

    public String getDiasweekend() {
        return diasweekend;
    }

    public void setDiasweekend(String diasweekend) {
        this.diasweekend = diasweekend;
    }

    public String getClosetoarrival() {
        return closetoarrival;
    }

    public void setClosetoarrival(String closetoarrival) {
        this.closetoarrival = closetoarrival;
    }

    public BigDecimal getVlrpaxsaidaante() {
        return vlrpaxsaidaante;
    }

    public void setVlrpaxsaidaante(BigDecimal vlrpaxsaidaante) {
        this.vlrpaxsaidaante = vlrpaxsaidaante;
    }

    public Character getTipoajuste() {
        return tipoajuste;
    }

    public void setTipoajuste(Character tipoajuste) {
        this.tipoajuste = tipoajuste;
    }

    public Character getCodpensao() {
        return codpensao;
    }

    public void setCodpensao(Character codpensao) {
        this.codpensao = codpensao;
    }

    public BigDecimal getPercbalcao() {
        return percbalcao;
    }

    public void setPercbalcao(BigDecimal percbalcao) {
        this.percbalcao = percbalcao;
    }

    public Short getIdtarifacmnet() {
        return idtarifacmnet;
    }

    public void setIdtarifacmnet(Short idtarifacmnet) {
        this.idtarifacmnet = idtarifacmnet;
    }

    public Character getFlgseparacafe() {
        return flgseparacafe;
    }

    public void setFlgseparacafe(Character flgseparacafe) {
        this.flgseparacafe = flgseparacafe;
    }

    public Character getFlgseparapensao() {
        return flgseparapensao;
    }

    public void setFlgseparapensao(Character flgseparapensao) {
        this.flgseparapensao = flgseparapensao;
    }

    public Short getOrdemprioridade() {
        return ordemprioridade;
    }

    public void setOrdemprioridade(Short ordemprioridade) {
        this.ordemprioridade = ordemprioridade;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

   /* public Character getUsafidelidade() {
        return usafidelidade;
    }

    public void setUsafidelidade(Character usafidelidade) {
        this.usafidelidade = usafidelidade;
    }

    public Character getFlgconfidencial() {
        return flgconfidencial;
    }

    public void setFlgconfidencial(Character flgconfidencial) {
        this.flgconfidencial = flgconfidencial;
    }

    public Character getFlgtarprombar() {
        return flgtarprombar;
    }

    public void setFlgtarprombar(Character flgtarprombar) {
        this.flgtarprombar = flgtarprombar;
    }

    public BigInteger getAcrecopiade() {
        return acrecopiade;
    }

    public void setAcrecopiade(BigInteger acrecopiade) {
        this.acrecopiade = acrecopiade;
    }

    public BigInteger getDecrcopiade() {
        return decrcopiade;
    }

    public void setDecrcopiade(BigInteger decrcopiade) {
        this.decrcopiade = decrcopiade;
    }
*/
   /* public Character getTparredcopiade() {
        return tparredcopiade;
    }

    public void setTparredcopiade(Character tparredcopiade) {
        this.tparredcopiade = tparredcopiade;
    }*/

   /* public Date getDtcopiade() {
        return dtcopiade;
    }

    public void setDtcopiade(Date dtcopiade) {
        this.dtcopiade = dtcopiade;
    }*/

   
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

   
   
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Moeda getMoecodigo() {
        return moecodigo;
    }

    public void setMoecodigo(Moeda moecodigo) {
        this.moecodigo = moecodigo;
    }

    public Origemreserva getIdorigem() {
        return idorigem;
    }

    public void setIdorigem(Origemreserva idorigem) {
        this.idorigem = idorigem;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }

  /*  @XmlTransient
    public List<Tarifahotel> getTarifahotelList() {
        return tarifahotelList;
    }

    public void setTarifahotelList(List<Tarifahotel> tarifahotelList) {
        this.tarifahotelList = tarifahotelList;
    }*/

   /* public Tarifahotel getTarifahotel() {
        return tarifahotel;
    }

    public void setTarifahotel(Tarifahotel tarifahotel) {
        this.tarifahotel = tarifahotel;
    }*/

   
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tarifahotelPK == null) ? 0 : tarifahotelPK.hashCode());
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
		Tarifahotel other = (Tarifahotel) obj;
		if (tarifahotelPK == null) {
			if (other.tarifahotelPK != null)
				return false;
		} else if (!tarifahotelPK.equals(other.tarifahotelPK))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Tarifahotel[ tarifahotelPK=" + tarifahotelPK + " ]";
    }


    @Transient
    public String getLabel() {
        return  this.getDescricao();
    }
}

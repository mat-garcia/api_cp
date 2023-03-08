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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author renanhdn
 */
@Entity
@Table(name = "CONTRCLIHOTEL")
@XmlRootElement
public class Contrclihotel implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected ContrclihotelPK contrclihotelPK;
	@Column(name = "DATAINICONTRATO")
	@Temporal(TemporalType.DATE)
	private Date datainicontrato;
	@Column(name = "DATAFIMCONTRATO")
	@Temporal(TemporalType.DATE)
	private Date datafimcontrato;
	@Column(name = "NOMETARIFA", length = 40)
	private String nometarifa;
	@Column(name = "PARCELAS")
	private Short parcelas;
	@Column(name = "INVOICEFATURA")
	private Character invoicefatura;
	@Column(name = "DIADE1")
	private BigInteger diade1;
	@Column(name = "DIAATE1")
	private Short diaate1;
	@Column(name = "FATURARDIA1")
	private Short faturardia1;
	@Column(name = "DIADE2")
	private Short diade2;
	@Column(name = "DIAATE2")
	private Short diaate2;
	@Column(name = "FATURARDIA2")
	private Short faturardia2;
	@Column(name = "DIADE3")
	private Short diade3;
	@Column(name = "DIAATE3")
	private Short diaate3;
	@Column(name = "FATURARDIA3")
	private Short faturardia3;
	@Column(name = "DIADE4")
	private Short diade4;
	@Column(name = "DIAATE4")
	private Short diaate4;
	@Column(name = "FATURARDIA4")
	private Short faturardia4;
	@Column(name = "DIADE5")
	private Short diade5;
	@Column(name = "DIAATE5")
	private Short diaate5;
	@Column(name = "FATURARDIA5")
	private Short faturardia5;
	@Column(name = "DIADE6")
	private Short diade6;
	@Column(name = "DIAATE6")
	private Short diaate6;
	@Column(name = "FATURARDIA6")
	private Short faturardia6;
	@Column(name = "JUNTANOTA")
	private Character juntanota;
	@Column(name = "CREDITO")
	private Character credito;
	@Column(name = "DEDUZCOMISS")
	private Character deduzcomiss;
	@Column(name = "DESTACADESC")
	private Character destacadesc;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "DESCDE", precision = 6, scale = 2)
	private BigDecimal descde;
	@Column(name = "ATEDATA")
	private Short atedata;
	@Column(name = "TXTURISMO")
	private Character txturismo;
	@Column(name = "TIPOCONTRATO")
	private Character tipocontrato;
	@Column(name = "OBSERVACAO", length = 1000)
	private String observacao;
	@Column(name = "FLGVENCERDIA")
	private Character flgvencerdia;
	@Column(name = "CODPENSAO")
	private Character codpensao;
	@Column(name = "DIASEMANAVENC")
	private Short diasemanavenc;
	@Column(name = "FLGCONTRCENTRAL")
	private Character flgcontrcentral;
	@Column(name = "CODCONTRATOCMNET")
	private Short codcontratocmnet;
	@Column(name = "OBRIGATORIOCMNET")
	private Character obrigatoriocmnet;
	@Basic(optional = false)
	@Column(name = "FLGENCAUTOCONTAS", nullable = false)
	private Character flgencautocontas;
	@Column(name = "TRGDTINCLUSAO")
	@Temporal(TemporalType.DATE)
	private Date trgdtinclusao;
	@Column(name = "TRGUSERINCLUSAO", length = 30)
	private String trguserinclusao;
	@Basic(optional = false)
	@Column(name = "FLGENCPOST", nullable = false)
	private Character flgencpost;
	@Column(name = "OBRIGADEPOSITO")
	private Character obrigadeposito;
	@Column(name = "NUMDIASCONFRES")
	private Short numdiasconfres;
	@Column(name = "ORDEMPRIORICMNET")
	private Short ordemprioricmnet;
	@Column(name = "FLGIMPPROFORMA")
	private Character flgimpproforma;
	@Column(name = "NUMDIASMUDAROUPA")
	private Short numdiasmudaroupa;
	@Column(name = "FLGAGRUPACHECKIN")
	private Character flgagrupacheckin;
	@Column(name = "CODTIPODISTRIB")
	private Character codtipodistrib;
	@Column(name = "FLGABATEALTFAT")
	private Character flgabatealtfat;
	@Column(name = "FLGPRECADASTRO")
	private Character flgprecadastro;
	@Column(name = "FLGCOMSECAUTO")
	private Character flgcomsecauto;
	@Column(name = "FLGMESSEG1")
	private Character flgmesseg1;
	@Column(name = "FLGMESSEG2")
	private Character flgmesseg2;
	@Column(name = "FLGMESSEG3")
	private Character flgmesseg3;
	@Column(name = "FLGMESSEG4")
	private Character flgmesseg4;
	@Column(name = "FLGMESSEG5")
	private Character flgmesseg5;
	@Column(name = "DESCDIARIA", precision = 6, scale = 2)
	private BigDecimal descdiaria;
	@Column(name = "FLGMESSEG6")
	private Character flgmesseg6;
	@Column(name = "NUMMAXPAX")
	private Short nummaxpax;
	@Column(name = "CODCONTRCENTRAL")
	private BigInteger codcontrcentral;
	@Column(name = "CODCONTRATOAFAT")
	private BigInteger codcontratoafat;
	/*
	 * @Column(name = "FLGUTILIZAPOSTOCLIRESERVANOTA") private Character
	 * flgutilizapostoclireservanota;
	 */ @OneToMany(cascade = CascadeType.ALL, mappedBy = "contrclihotel", fetch = FetchType.LAZY)
	private List<Reservasfront> reservasfrontList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "contrclihotel1", fetch = FetchType.LAZY)
	private List<Reservasfront> reservasfrontList1;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "contrclihotel", fetch = FetchType.LAZY)
	private List<Contasfront> contasfrontList;
	@JoinColumn(name = "IDFORCLIAFATURAR", referencedColumnName = "IDPESSOA")
	@ManyToOne(fetch = FetchType.LAZY)
	private Clientepess idforcliafaturar;
	@JoinColumn(name = "IDFORCLI", referencedColumnName = "IDPESSOA", nullable = false, insertable = false, updatable = false)
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Clientepess clientepess;
	@JoinColumn(name = "IDPOSTO", referencedColumnName = "IDPESSOA")
	@ManyToOne(fetch = FetchType.LAZY)
	private Clientepess idposto;
	@JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Hotel hotel;
	@JoinColumn(name = "MOECODIGO", referencedColumnName = "MOECODIGO")
	@ManyToOne(fetch = FetchType.LAZY)
	private Moeda moecodigo;
	@JoinColumns({
			@JoinColumn(name = "IDTARIFA", referencedColumnName = "IDTARIFA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false) })
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Tarifahotel tarifahotel;

	public Contrclihotel() {
	}

	public Contrclihotel(ContrclihotelPK contrclihotelPK) {
		this.contrclihotelPK = contrclihotelPK;
	}

	public Contrclihotel(ContrclihotelPK contrclihotelPK, Character flgencautocontas, Character flgencpost) {
		this.contrclihotelPK = contrclihotelPK;
		this.flgencautocontas = flgencautocontas;
		this.flgencpost = flgencpost;
	}

	public Contrclihotel(BigInteger idforcli, BigInteger codcontrato, BigInteger idhotel) {
		this.contrclihotelPK = new ContrclihotelPK(idforcli, codcontrato, idhotel);
	}

	public ContrclihotelPK getContrclihotelPK() {
		return contrclihotelPK;
	}

	public void setContrclihotelPK(ContrclihotelPK contrclihotelPK) {
		this.contrclihotelPK = contrclihotelPK;
	}

	public Date getDatainicontrato() {
		return datainicontrato;
	}

	public void setDatainicontrato(Date datainicontrato) {
		this.datainicontrato = datainicontrato;
	}

	public Date getDatafimcontrato() {
		return datafimcontrato;
	}

	public void setDatafimcontrato(Date datafimcontrato) {
		this.datafimcontrato = datafimcontrato;
	}

	public String getNometarifa() {
		return nometarifa;
	}

	public void setNometarifa(String nometarifa) {
		this.nometarifa = nometarifa;
	}

	public Short getParcelas() {
		return parcelas;
	}

	public void setParcelas(Short parcelas) {
		this.parcelas = parcelas;
	}

	public Character getInvoicefatura() {
		return invoicefatura;
	}

	public void setInvoicefatura(Character invoicefatura) {
		this.invoicefatura = invoicefatura;
	}

	public BigInteger getDiade1() {
		return diade1;
	}

	public void setDiade1(BigInteger diade1) {
		this.diade1 = diade1;
	}

	public Short getDiaate1() {
		return diaate1;
	}

	public void setDiaate1(Short diaate1) {
		this.diaate1 = diaate1;
	}

	public Short getFaturardia1() {
		return faturardia1;
	}

	public void setFaturardia1(Short faturardia1) {
		this.faturardia1 = faturardia1;
	}

	public Short getDiade2() {
		return diade2;
	}

	public void setDiade2(Short diade2) {
		this.diade2 = diade2;
	}

	public Short getDiaate2() {
		return diaate2;
	}

	public void setDiaate2(Short diaate2) {
		this.diaate2 = diaate2;
	}

	public Short getFaturardia2() {
		return faturardia2;
	}

	public void setFaturardia2(Short faturardia2) {
		this.faturardia2 = faturardia2;
	}

	public Short getDiade3() {
		return diade3;
	}

	public void setDiade3(Short diade3) {
		this.diade3 = diade3;
	}

	public Short getDiaate3() {
		return diaate3;
	}

	public void setDiaate3(Short diaate3) {
		this.diaate3 = diaate3;
	}

	public Short getFaturardia3() {
		return faturardia3;
	}

	public void setFaturardia3(Short faturardia3) {
		this.faturardia3 = faturardia3;
	}

	public Short getDiade4() {
		return diade4;
	}

	public void setDiade4(Short diade4) {
		this.diade4 = diade4;
	}

	public Short getDiaate4() {
		return diaate4;
	}

	public void setDiaate4(Short diaate4) {
		this.diaate4 = diaate4;
	}

	public Short getFaturardia4() {
		return faturardia4;
	}

	public void setFaturardia4(Short faturardia4) {
		this.faturardia4 = faturardia4;
	}

	public Short getDiade5() {
		return diade5;
	}

	public void setDiade5(Short diade5) {
		this.diade5 = diade5;
	}

	public Short getDiaate5() {
		return diaate5;
	}

	public void setDiaate5(Short diaate5) {
		this.diaate5 = diaate5;
	}

	public Short getFaturardia5() {
		return faturardia5;
	}

	public void setFaturardia5(Short faturardia5) {
		this.faturardia5 = faturardia5;
	}

	public Short getDiade6() {
		return diade6;
	}

	public void setDiade6(Short diade6) {
		this.diade6 = diade6;
	}

	public Short getDiaate6() {
		return diaate6;
	}

	public void setDiaate6(Short diaate6) {
		this.diaate6 = diaate6;
	}

	public Short getFaturardia6() {
		return faturardia6;
	}

	public void setFaturardia6(Short faturardia6) {
		this.faturardia6 = faturardia6;
	}

	public Character getJuntanota() {
		return juntanota;
	}

	public void setJuntanota(Character juntanota) {
		this.juntanota = juntanota;
	}

	public Character getCredito() {
		return credito;
	}

	public void setCredito(Character credito) {
		this.credito = credito;
	}

	public Character getDeduzcomiss() {
		return deduzcomiss;
	}

	public void setDeduzcomiss(Character deduzcomiss) {
		this.deduzcomiss = deduzcomiss;
	}

	public Character getDestacadesc() {
		return destacadesc;
	}

	public void setDestacadesc(Character destacadesc) {
		this.destacadesc = destacadesc;
	}

	public BigDecimal getDescde() {
		return descde;
	}

	public void setDescde(BigDecimal descde) {
		this.descde = descde;
	}

	public Short getAtedata() {
		return atedata;
	}

	public void setAtedata(Short atedata) {
		this.atedata = atedata;
	}

	public Character getTxturismo() {
		return txturismo;
	}

	public void setTxturismo(Character txturismo) {
		this.txturismo = txturismo;
	}

	public Character getTipocontrato() {
		return tipocontrato;
	}

	public void setTipocontrato(Character tipocontrato) {
		this.tipocontrato = tipocontrato;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Character getFlgvencerdia() {
		return flgvencerdia;
	}

	public void setFlgvencerdia(Character flgvencerdia) {
		this.flgvencerdia = flgvencerdia;
	}

	public Character getCodpensao() {
		return codpensao;
	}

	public void setCodpensao(Character codpensao) {
		this.codpensao = codpensao;
	}

	public Short getDiasemanavenc() {
		return diasemanavenc;
	}

	public void setDiasemanavenc(Short diasemanavenc) {
		this.diasemanavenc = diasemanavenc;
	}

	public Character getFlgcontrcentral() {
		return flgcontrcentral;
	}

	public void setFlgcontrcentral(Character flgcontrcentral) {
		this.flgcontrcentral = flgcontrcentral;
	}

	public Short getCodcontratocmnet() {
		return codcontratocmnet;
	}

	public void setCodcontratocmnet(Short codcontratocmnet) {
		this.codcontratocmnet = codcontratocmnet;
	}

	public Character getObrigatoriocmnet() {
		return obrigatoriocmnet;
	}

	public void setObrigatoriocmnet(Character obrigatoriocmnet) {
		this.obrigatoriocmnet = obrigatoriocmnet;
	}

	public Character getFlgencautocontas() {
		return flgencautocontas;
	}

	public void setFlgencautocontas(Character flgencautocontas) {
		this.flgencautocontas = flgencautocontas;
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

	public Character getFlgencpost() {
		return flgencpost;
	}

	public void setFlgencpost(Character flgencpost) {
		this.flgencpost = flgencpost;
	}

	public Character getObrigadeposito() {
		return obrigadeposito;
	}

	public void setObrigadeposito(Character obrigadeposito) {
		this.obrigadeposito = obrigadeposito;
	}

	public Short getNumdiasconfres() {
		return numdiasconfres;
	}

	public void setNumdiasconfres(Short numdiasconfres) {
		this.numdiasconfres = numdiasconfres;
	}

	public Short getOrdemprioricmnet() {
		return ordemprioricmnet;
	}

	public void setOrdemprioricmnet(Short ordemprioricmnet) {
		this.ordemprioricmnet = ordemprioricmnet;
	}

	public Character getFlgimpproforma() {
		return flgimpproforma;
	}

	public void setFlgimpproforma(Character flgimpproforma) {
		this.flgimpproforma = flgimpproforma;
	}

	public Short getNumdiasmudaroupa() {
		return numdiasmudaroupa;
	}

	public void setNumdiasmudaroupa(Short numdiasmudaroupa) {
		this.numdiasmudaroupa = numdiasmudaroupa;
	}

	public Character getFlgagrupacheckin() {
		return flgagrupacheckin;
	}

	public void setFlgagrupacheckin(Character flgagrupacheckin) {
		this.flgagrupacheckin = flgagrupacheckin;
	}

	public Character getCodtipodistrib() {
		return codtipodistrib;
	}

	public void setCodtipodistrib(Character codtipodistrib) {
		this.codtipodistrib = codtipodistrib;
	}

	public Character getFlgabatealtfat() {
		return flgabatealtfat;
	}

	public void setFlgabatealtfat(Character flgabatealtfat) {
		this.flgabatealtfat = flgabatealtfat;
	}

	public Character getFlgprecadastro() {
		return flgprecadastro;
	}

	public void setFlgprecadastro(Character flgprecadastro) {
		this.flgprecadastro = flgprecadastro;
	}

	public Character getFlgcomsecauto() {
		return flgcomsecauto;
	}

	public void setFlgcomsecauto(Character flgcomsecauto) {
		this.flgcomsecauto = flgcomsecauto;
	}

	public Character getFlgmesseg1() {
		return flgmesseg1;
	}

	public void setFlgmesseg1(Character flgmesseg1) {
		this.flgmesseg1 = flgmesseg1;
	}

	public Character getFlgmesseg2() {
		return flgmesseg2;
	}

	public void setFlgmesseg2(Character flgmesseg2) {
		this.flgmesseg2 = flgmesseg2;
	}

	public Character getFlgmesseg3() {
		return flgmesseg3;
	}

	public void setFlgmesseg3(Character flgmesseg3) {
		this.flgmesseg3 = flgmesseg3;
	}

	public Character getFlgmesseg4() {
		return flgmesseg4;
	}

	public void setFlgmesseg4(Character flgmesseg4) {
		this.flgmesseg4 = flgmesseg4;
	}

	public Character getFlgmesseg5() {
		return flgmesseg5;
	}

	public void setFlgmesseg5(Character flgmesseg5) {
		this.flgmesseg5 = flgmesseg5;
	}

	public BigDecimal getDescdiaria() {
		return descdiaria;
	}

	public void setDescdiaria(BigDecimal descdiaria) {
		this.descdiaria = descdiaria;
	}

	public Character getFlgmesseg6() {
		return flgmesseg6;
	}

	public void setFlgmesseg6(Character flgmesseg6) {
		this.flgmesseg6 = flgmesseg6;
	}

	public Short getNummaxpax() {
		return nummaxpax;
	}

	public void setNummaxpax(Short nummaxpax) {
		this.nummaxpax = nummaxpax;
	}

	public BigInteger getCodcontrcentral() {
		return codcontrcentral;
	}

	public void setCodcontrcentral(BigInteger codcontrcentral) {
		this.codcontrcentral = codcontrcentral;
	}

	public BigInteger getCodcontratoafat() {
		return codcontratoafat;
	}

	public void setCodcontratoafat(BigInteger codcontratoafat) {
		this.codcontratoafat = codcontratoafat;
	}

	/*
	 * public Character getFlgutilizapostoclireservanota() { return
	 * flgutilizapostoclireservanota; }
	 * 
	 * public void setFlgutilizapostoclireservanota(Character
	 * flgutilizapostoclireservanota) { this.flgutilizapostoclireservanota =
	 * flgutilizapostoclireservanota; }
	 */

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
	public List<Contasfront> getContasfrontList() {
		return contasfrontList;
	}

	public void setContasfrontList(List<Contasfront> contasfrontList) {
		this.contasfrontList = contasfrontList;
	}

	public Clientepess getIdforcliafaturar() {
		return idforcliafaturar;
	}

	public void setIdforcliafaturar(Clientepess idforcliafaturar) {
		this.idforcliafaturar = idforcliafaturar;
	}

	public Clientepess getClientepess() {
		return clientepess;
	}

	public void setClientepess(Clientepess clientepess) {
		this.clientepess = clientepess;
	}

	public Clientepess getIdposto() {
		return idposto;
	}

	public void setIdposto(Clientepess idposto) {
		this.idposto = idposto;
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

	public Tarifahotel getTarifahotel() {
		return tarifahotel;
	}

	public void setTarifahotel(Tarifahotel tarifahotel) {
		this.tarifahotel = tarifahotel;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (contrclihotelPK != null ? contrclihotelPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Contrclihotel)) {
			return false;
		}
		Contrclihotel other = (Contrclihotel) object;
		if ((this.contrclihotelPK == null && other.contrclihotelPK != null)
				|| (this.contrclihotelPK != null && !this.contrclihotelPK.equals(other.contrclihotelPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Contrclihotel [contrclihotelPK=" + contrclihotelPK + ", datainicontrato=" + datainicontrato
				+ ", datafimcontrato=" + datafimcontrato + "]";
	}

	@Transient
	public String getLabel() {
		if (this.getContrclihotelPK() != null) {
			return this.getContrclihotelPK().getCodcontrato() + " - " + this.getNometarifa();
		} else {
		   return "Nenhum";
		}
	}

}

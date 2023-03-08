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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
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
@Table(name = "RESERVASFRONT")
@XmlRootElement
public class Reservasfront implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "TIPOUHALLOT")
    private BigInteger tipouhallot;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "SEQRESERVASFRONT", sequenceName = "SEQRESERVASFRONT", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQRESERVASFRONT")  
    @Column(name = "IDRESERVASFRONT", nullable = false, precision = 22)
    private Long idreservasfront;
    @Column(name = "RESERVANTE", length = 30)
    private String reservante;
    @Column(name = "TELRESERVANTE", length = 20)
    private String telreservante;
    @Column(name = "DATACHEGPREVISTA")
    @Temporal(TemporalType.DATE)
    private Date datachegprevista;
    @Column(name = "HORACHEGPREVISTA")
    @Temporal(TemporalType.DATE)
    private Date horachegprevista;
    @Column(name = "DATAPARTPREVISTA")
    @Temporal(TemporalType.DATE)
    private Date datapartprevista;
    @Column(name = "HORAPARTPREVISTA")
    @Temporal(TemporalType.DATE)
    private Date horapartprevista;
    
    @Basic(optional = false)
    @Column(name = "ADULTOS", nullable = false)
    private short adultos;
    @Basic(optional = false)
    @Column(name = "CRIANCAS1", nullable = false)
    private short criancas1;
    @Basic(optional = false)
    @Column(name = "CRIANCAS2", nullable = false)
    private short criancas2;
    @Basic(optional = false)
    @Column(name = "CODPENSAO", nullable = false)
    private Character codpensao;
    @Basic(optional = false)
    @Column(name = "VLRDIARIA", nullable = false, precision = 17, scale = 2)
    private BigDecimal vlrdiaria;
    @Column(name = "PERCDESCONTODIARIA", precision = 10, scale = 6)
    private BigDecimal percdescontodiaria;
    @Basic(optional = false)
    @Column(name = "GARANTENOSHOW", nullable = false)
    private Character garantenoshow;
    @Column(name = "DATACONFIRMACAO")
    @Temporal(TemporalType.DATE)
    private Date dataconfirmacao;
    @Column(name = "DATARESERVA")
    @Temporal(TemporalType.DATE)
    private Date datareserva;
    @Column(name = "HORARESERVA")
    @Temporal(TemporalType.DATE)
    private Date horareserva;
    @Column(name = "AJUSTE")
    private Character ajuste;
    @Basic(optional = false)
    @Column(name = "POOLLISTA", nullable = false)
    private Character poollista;
    @Column(name = "VLRUPSAILING", precision = 17, scale = 2)
    private BigDecimal vlrupsailing;
    @Basic(optional = false)
    @Column(name = "AUTOCHECKOUT", nullable = false)
    private Character autocheckout;
    @Column(name = "DATAINIDEPOSITO")
    @Temporal(TemporalType.DATE)
    private Date datainideposito;
    @Column(name = "DATAFIMDEPOSITO")
    @Temporal(TemporalType.DATE)
    private Date datafimdeposito;
    @Column(name = "DATADEPOSITO")
    @Temporal(TemporalType.DATE)
    private Date datadeposito;
    @Column(name = "VLRDIARIASDEPOSITO", precision = 17, scale = 2)
    private BigDecimal vlrdiariasdeposito;
    @Column(name = "VLREXTRASDEPOSITO", precision = 17, scale = 2)
    private BigDecimal vlrextrasdeposito;
    @Column(name = "PERCPREPAGDEPOSITO", precision = 6, scale = 2)
    private BigDecimal percprepagdeposito;
    @Column(name = "WALKIN")
    private Character walkin;
    @Column(name = "OBSERVACOES", length = 1400)
    private String observacoes;
    @Column(name = "DOCUMENTO", length = 100)
    private String documento;
    @Column(name = "NUMRESERVA")
    private Long numreserva;
    @Column(name = "FLAGCOMPARTILHADA")
    private Character flagcompartilhada;
    @Column(name = "DATACHEGADAREAL")
    @Temporal(TemporalType.DATE)
    private Date datachegadareal;
    @Column(name = "HORACHEGADAREAL")
    @Temporal(TemporalType.DATE)
    private Date horachegadareal;
    @Column(name = "DATAPARTIDAREAL")
    @Temporal(TemporalType.DATE)
    private Date datapartidareal;
    @Column(name = "HORAPARTIDAREAL")
    @Temporal(TemporalType.DATE)
    private Date horapartidareal;
    @Column(name = "VLRDIFDIARIA", precision = 17, scale = 2)
    private BigDecimal vlrdifdiaria;
    @Column(name = "VLRDIARIAPADRAO", precision = 17, scale = 2)
    private BigDecimal vlrdiariapadrao;
    @Column(name = "NUMCANCELAMENTO")
    private BigInteger numcancelamento;
    @Column(name = "DATAPRORROGRES")
    @Temporal(TemporalType.DATE)
    private Date dataprorrogres;
    @Column(name = "DATAULTALTERACAO")
    @Temporal(TemporalType.DATE)
    private Date dataultalteracao;
    @Column(name = "DATAVALCARTAO", length = 10)
    private String datavalcartao;
    @Column(name = "DATAREATIVACAO")
    @Temporal(TemporalType.DATE)
    private Date datareativacao;
    @Column(name = "DATAREATIVACAONS")
    @Temporal(TemporalType.DATE)
    private Date datareativacaons;
    @Column(name = "DATACANCELAMENTO")
    @Temporal(TemporalType.DATE)
    private Date datacancelamento;
    @Column(name = "FLGDIARIAFIXA")
    private Character flgdiariafixa;
    @Column(name = "NUMRESERVAGDS")
    private BigInteger numreservagds;
    @Column(name = "LOCRESERVA")
    private BigInteger locreserva;
    @Column(name = "NUMVOO", length = 20)
    private String numvoo;
    @Column(name = "VLRPENSAO", precision = 17, scale = 2)
    private BigDecimal vlrpensao;
    @Column(name = "REQVIAGEM", length = 20)
    private String reqviagem;
    @Column(name = "MATRICFUNC", length = 10)
    private String matricfunc;
    @Column(name = "CENTROCUSTO", length = 20)
    private String centrocusto;
    @Column(name = "NOMEDEPTO", length = 10)
    private String nomedepto;
    @Column(name = "NUMCARTVIRTUAL", length = 64)
    private String numcartvirtual;
    @Column(name = "ESTABELEC", length = 10)
    private String estabelec;
    @Column(name = "VLRDIARIAMANUAL", precision = 17, scale = 2)
    private BigDecimal vlrdiariamanual;
    @Column(name = "VLRCAFE", precision = 17, scale = 2)
    private BigDecimal vlrcafe;
    @Column(name = "CODREFERENCIA", length = 30)
    private String codreferencia;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "LANCAUPSELL")
    private Character lancaupsell;
    @Column(name = "OBSCANCELAMENTO", length = 1000)
    private String obscancelamento;
    @Column(name = "FAXRESERVANTE", length = 20)
    private String faxreservante;
    @Column(name = "EMAILRESERVANTE", length = 100)
    private String emailreservante;
    @Column(name = "NUMCARTAOFID", length = 20)
    private String numcartaofid;
    @Column(name = "CODSEGURCARTAO", length = 5)
    private String codsegurcartao;
    @Column(name = "NUMRESERVAVALENET", precision = 18, scale = 2)
    private BigDecimal numreservavalenet;
    @Column(name = "NUMRESPRODVALENET", precision = 18, scale = 2)
    private BigDecimal numresprodvalenet;
    @Column(name = "FLGALLOTFIXO")
    private Short flgallotfixo;
    @Column(name = "VERSAO")
    private BigInteger versao;
    @Column(name = "FLGMENSALISTA")
    private Character flgmensalista;
    @Column(name = "HISTNEGOCIACAO", length = 1000)
    private String histnegociacao;
    @Column(name = "RLOC", length = 20)
    private String rloc;
    @Column(name = "CONTROLEAGENCIA", length = 12)
    private String controleagencia;
    @Column(name = "ORDEMSERVICO", length = 10)
    private String ordemservico;
    @Column(name = "VALORDESCONTO", length = 14)
    private String valordesconto;
    @Column(name = "AUTORIZAEMPRESA", length = 10)
    private String autorizaempresa;
    @Column(name = "TEXTOLIVRE", length = 20)
    private String textolivre;
    @Column(name = "NUMPARCDEPOS")
    private BigInteger numparcdepos;
    @Column(name = "NUMRESERVAPRINC")
    private Long numreservaprinc;
    @Column(name = "FLGORDENA")
    private Short flgordena;
    @Column(name = "FLGREQCHECKIN")
    private Character flgreqcheckin;
    @Column(name = "DATANOSHOW")
    @Temporal(TemporalType.DATE)
    private Date datanoshow;
    @Column(name = "VLRDIARIASEMIMPOSTO", precision = 17, scale = 2)
    private BigDecimal vlrdiariasemimposto;
    @Column(name = "NUMEROCELULAR", length = 20)
    private String numerocelular;
    @Column(name = "OBSCMNET", length = 2000)
    private String obscmnet;
    @Column(name = "NUMRESERVAORI")
    private BigInteger numreservaori;
    @Column(name = "NUMCARTAOMAS", length = 15)
    private String numcartaomas;
    /*
    @Column(name = "CKNATEND")
    private Character cknatend;
    @Column(name = "CKOATEND")
    private Character ckoatend;*/
   /* @Column(name = "HASH", length = 100)
    private String hash;*/
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "reservasfront",fetch=FetchType.LAZY)
    private Fidelidaderesvhf fidelidaderesvhf;
    @JoinColumn(name = "CLIENTERESERVANTE", referencedColumnName = "IDPESSOA")
    @ManyToOne(fetch=FetchType.LAZY)
    private Clientepess clientereservante;
    @JoinColumn(name = "CLIENTEHOSPEDE", referencedColumnName = "IDPESSOA")
    @ManyToOne(fetch=FetchType.LAZY)
    private Clientepess clientehospede;
    @JoinColumns({
        @JoinColumn(name = "IDTARIFA", referencedColumnName = "IDTARIFA", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL",  nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Tarifahotel tarifahotel;
    @JoinColumn(name = "MOECODIGOMANUAL", referencedColumnName = "MOECODIGO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Moeda moecodigomanual;
    @JoinColumn(name = "MOEDEPOSITO", referencedColumnName = "MOECODIGO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Moeda moedeposito;
    @JoinColumns({
        @JoinColumn(name = "CLIENTERESERVANTE", referencedColumnName = "IDFORCLI", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "CONTRATOINICIAL", referencedColumnName = "CODCONTRATO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Contrclihotel contrclihotel;
    @JoinColumn(name = "IDHOTELORI", referencedColumnName = "IDHOTEL")
    @ManyToOne
    private Hotel idhotelori;
    @JoinColumns({
        @JoinColumn(name = "CLIENTEHOSPEDE", referencedColumnName = "IDFORCLI", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "CONTRATOFINAL", referencedColumnName = "CODCONTRATO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Contrclihotel contrclihotel1;
    @JoinColumn(name = "IDVEICULOS", referencedColumnName = "IDVEICULOS")
    @ManyToOne(fetch=FetchType.LAZY)
    private Veiculoscomunica idveiculos;
    @JoinColumn(name = "IDUSUALTERACAO", referencedColumnName = "IDUSUARIO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Usuariosistema idusualteracao;
    @JoinColumn(name = "IDMEIOCOMUNICACAO", referencedColumnName = "IDMEIOCOMUNICACAO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Meioscomunicacao idmeiocomunicacao;
    @JoinColumn(name = "IDDOCUMENTO", referencedColumnName = "IDDOCUMENTO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Docconfirmahotel iddocumento;

    private Usuariosistema usuario;
    @JoinColumn(name = "IDORIGEM", referencedColumnName = "IDORIGEM")
    @ManyToOne(fetch=FetchType.LAZY)
    private Origemreserva idorigem;
    @OneToMany(mappedBy = "idreservamultroom",fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList;
    @JoinColumn(name = "IDRESERVAMULTROOM", referencedColumnName = "IDRESERVASFRONT")
    @ManyToOne(fetch=FetchType.LAZY)
    private Reservasfront idreservamultroom;
    @JoinColumns({
        @JoinColumn(name = "TIPOUHTARIFA", referencedColumnName = "IDTIPOUH", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Tipouh tipouh;
    @JoinColumns({
        @JoinColumn(name = "CODSEGMENTO", referencedColumnName = "CODSEGMENTO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Segmento segmento;
    @JoinColumns({
        @JoinColumn(name = "TIPOUHESTADIA", referencedColumnName = "IDTIPOUH", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Tipouh tipouh1;
    @JoinColumn(name = "IDMOTIVO", referencedColumnName = "IDMOTIVO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Motivosfront idmotivo;
    @JoinColumn(name = "STATUSRESERVA", referencedColumnName = "STATUSRESERVA")
    @ManyToOne(fetch=FetchType.LAZY)
    private Statusreserva statusreserva;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "reservasfront",fetch=FetchType.LAZY)
    private Reservareduz reservareduz;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "reservasfront",fetch=FetchType.LAZY)
    private Reservasideas reservasideas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reservasfront",fetch=FetchType.LAZY)
    private List<Orcamentoreserva> orcamentoreservaList;
    @OneToMany(mappedBy = "idreservasfront",fetch=FetchType.LAZY)
    private List<Contasfront> contasfrontList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reservasfront",fetch=FetchType.LAZY)
    private List<Movimentohospedes> movimentohospedesList;

    public Reservasfront() {
    }

    public Reservasfront(Long idreservasfront) {
        this.idreservasfront = idreservasfront;
    }

    public Reservasfront(Long idreservasfront, short adultos, short criancas1, short criancas2, Character codpensao, BigDecimal vlrdiaria, Character garantenoshow, Character poollista, Character autocheckout) {
        this.idreservasfront = idreservasfront;
        this.adultos = adultos;
        this.criancas1 = criancas1;
        this.criancas2 = criancas2;
        this.codpensao = codpensao;
        this.vlrdiaria = vlrdiaria;
        this.garantenoshow = garantenoshow;
        this.poollista = poollista;
        this.autocheckout = autocheckout;
    }

    public BigInteger getTipouhallot() {
        return tipouhallot;
    }

    public void setTipouhallot(BigInteger tipouhallot) {
        this.tipouhallot = tipouhallot;
    }

    public Long getIdreservasfront() {
        return idreservasfront;
    }

    public void setIdreservasfront(Long idreservasfront) {
        this.idreservasfront = idreservasfront;
    }

    public String getReservante() {
        return reservante;
    }

    public void setReservante(String reservante) {
        this.reservante = reservante;
    }

    public String getTelreservante() {
        return telreservante;
    }

    public void setTelreservante(String telreservante) {
        this.telreservante = telreservante;
    }

    public Date getDatachegprevista() {
        return datachegprevista;
    }

    public void setDatachegprevista(Date datachegprevista) {
        this.datachegprevista = datachegprevista;
    }

    public Date getHorachegprevista() {
        return horachegprevista;
    }

    public void setHorachegprevista(Date horachegprevista) {
        this.horachegprevista = horachegprevista;
    }

    public Date getDatapartprevista() {
        return datapartprevista;
    }

    public void setDatapartprevista(Date datapartprevista) {
        this.datapartprevista = datapartprevista;
    }

    public Date getHorapartprevista() {
        return horapartprevista;
    }

    public void setHorapartprevista(Date horapartprevista) {
        this.horapartprevista = horapartprevista;
    }

    public short getAdultos() {
        return adultos;
    }

    public void setAdultos(short adultos) {
        this.adultos = adultos;
    }

    public short getCriancas1() {
        return criancas1;
    }

    public void setCriancas1(short criancas1) {
        this.criancas1 = criancas1;
    }

    public short getCriancas2() {
        return criancas2;
    }

    public void setCriancas2(short criancas2) {
        this.criancas2 = criancas2;
    }

    public Character getCodpensao() {
        return codpensao;
    }

    public void setCodpensao(Character codpensao) {
        this.codpensao = codpensao;
    }

    public BigDecimal getVlrdiaria() {
        return vlrdiaria;
    }

    public void setVlrdiaria(BigDecimal vlrdiaria) {
        this.vlrdiaria = vlrdiaria;
    }

    public BigDecimal getPercdescontodiaria() {
        return percdescontodiaria;
    }

    public void setPercdescontodiaria(BigDecimal percdescontodiaria) {
        this.percdescontodiaria = percdescontodiaria;
    }

    public Character getGarantenoshow() {
        return garantenoshow;
    }

    public void setGarantenoshow(Character garantenoshow) {
        this.garantenoshow = garantenoshow;
    }

    public Date getDataconfirmacao() {
        return dataconfirmacao;
    }

    public void setDataconfirmacao(Date dataconfirmacao) {
        this.dataconfirmacao = dataconfirmacao;
    }

    public Date getDatareserva() {
        return datareserva;
    }

    public void setDatareserva(Date datareserva) {
        this.datareserva = datareserva;
    }

    public Date getHorareserva() {
        return horareserva;
    }

    public void setHorareserva(Date horareserva) {
        this.horareserva = horareserva;
    }

    public Character getAjuste() {
        return ajuste;
    }

    public void setAjuste(Character ajuste) {
        this.ajuste = ajuste;
    }

    public Character getPoollista() {
        return poollista;
    }

    public void setPoollista(Character poollista) {
        this.poollista = poollista;
    }

    public BigDecimal getVlrupsailing() {
        return vlrupsailing;
    }

    public void setVlrupsailing(BigDecimal vlrupsailing) {
        this.vlrupsailing = vlrupsailing;
    }

    public Character getAutocheckout() {
        return autocheckout;
    }

    public void setAutocheckout(Character autocheckout) {
        this.autocheckout = autocheckout;
    }

    public Date getDatainideposito() {
        return datainideposito;
    }

    public void setDatainideposito(Date datainideposito) {
        this.datainideposito = datainideposito;
    }

    public Date getDatafimdeposito() {
        return datafimdeposito;
    }

    public void setDatafimdeposito(Date datafimdeposito) {
        this.datafimdeposito = datafimdeposito;
    }

    public Date getDatadeposito() {
        return datadeposito;
    }

    public void setDatadeposito(Date datadeposito) {
        this.datadeposito = datadeposito;
    }

    public BigDecimal getVlrdiariasdeposito() {
        return vlrdiariasdeposito;
    }

    public void setVlrdiariasdeposito(BigDecimal vlrdiariasdeposito) {
        this.vlrdiariasdeposito = vlrdiariasdeposito;
    }

    public BigDecimal getVlrextrasdeposito() {
        return vlrextrasdeposito;
    }

    public void setVlrextrasdeposito(BigDecimal vlrextrasdeposito) {
        this.vlrextrasdeposito = vlrextrasdeposito;
    }

    public BigDecimal getPercprepagdeposito() {
        return percprepagdeposito;
    }

    public void setPercprepagdeposito(BigDecimal percprepagdeposito) {
        this.percprepagdeposito = percprepagdeposito;
    }

    public Character getWalkin() {
        return walkin;
    }

    public void setWalkin(Character walkin) {
        this.walkin = walkin;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Long getNumreserva() {
        return numreserva;
    }

    public void setNumreserva(Long numreserva) {
        this.numreserva = numreserva;
    }

    public Character getFlagcompartilhada() {
        return flagcompartilhada;
    }

    public void setFlagcompartilhada(Character flagcompartilhada) {
        this.flagcompartilhada = flagcompartilhada;
    }

    public Date getDatachegadareal() {
        return datachegadareal;
    }

    public void setDatachegadareal(Date datachegadareal) {
        this.datachegadareal = datachegadareal;
    }

    public Date getHorachegadareal() {
        return horachegadareal;
    }

    public void setHorachegadareal(Date horachegadareal) {
        this.horachegadareal = horachegadareal;
    }

    public Date getDatapartidareal() {
        return datapartidareal;
    }

    public void setDatapartidareal(Date datapartidareal) {
        this.datapartidareal = datapartidareal;
    }

    public Date getHorapartidareal() {
        return horapartidareal;
    }

    public void setHorapartidareal(Date horapartidareal) {
        this.horapartidareal = horapartidareal;
    }

    public BigDecimal getVlrdifdiaria() {
        return vlrdifdiaria;
    }

    public void setVlrdifdiaria(BigDecimal vlrdifdiaria) {
        this.vlrdifdiaria = vlrdifdiaria;
    }

    public BigDecimal getVlrdiariapadrao() {
        return vlrdiariapadrao;
    }

    public void setVlrdiariapadrao(BigDecimal vlrdiariapadrao) {
        this.vlrdiariapadrao = vlrdiariapadrao;
    }

    public BigInteger getNumcancelamento() {
        return numcancelamento;
    }

    public void setNumcancelamento(BigInteger numcancelamento) {
        this.numcancelamento = numcancelamento;
    }

    public Date getDataprorrogres() {
        return dataprorrogres;
    }

    public void setDataprorrogres(Date dataprorrogres) {
        this.dataprorrogres = dataprorrogres;
    }

    public Date getDataultalteracao() {
        return dataultalteracao;
    }

    public void setDataultalteracao(Date dataultalteracao) {
        this.dataultalteracao = dataultalteracao;
    }

    public String getDatavalcartao() {
        return datavalcartao;
    }

    public void setDatavalcartao(String datavalcartao) {
        this.datavalcartao = datavalcartao;
    }

    public Date getDatareativacao() {
        return datareativacao;
    }

    public void setDatareativacao(Date datareativacao) {
        this.datareativacao = datareativacao;
    }

    public Date getDatareativacaons() {
        return datareativacaons;
    }

    public void setDatareativacaons(Date datareativacaons) {
        this.datareativacaons = datareativacaons;
    }

    public Date getDatacancelamento() {
        return datacancelamento;
    }

    public void setDatacancelamento(Date datacancelamento) {
        this.datacancelamento = datacancelamento;
    }

    public Character getFlgdiariafixa() {
        return flgdiariafixa;
    }

    public void setFlgdiariafixa(Character flgdiariafixa) {
        this.flgdiariafixa = flgdiariafixa;
    }

    public BigInteger getNumreservagds() {
        return numreservagds;
    }

    public void setNumreservagds(BigInteger numreservagds) {
        this.numreservagds = numreservagds;
    }

    public BigInteger getLocreserva() {
        return locreserva;
    }

    public void setLocreserva(BigInteger locreserva) {
        this.locreserva = locreserva;
    }

    public String getNumvoo() {
        return numvoo;
    }

    public void setNumvoo(String numvoo) {
        this.numvoo = numvoo;
    }

    public BigDecimal getVlrpensao() {
        return vlrpensao;
    }

    public void setVlrpensao(BigDecimal vlrpensao) {
        this.vlrpensao = vlrpensao;
    }

    public String getReqviagem() {
        return reqviagem;
    }

    public void setReqviagem(String reqviagem) {
        this.reqviagem = reqviagem;
    }

    public String getMatricfunc() {
        return matricfunc;
    }

    public void setMatricfunc(String matricfunc) {
        this.matricfunc = matricfunc;
    }

    public String getCentrocusto() {
        return centrocusto;
    }

    public void setCentrocusto(String centrocusto) {
        this.centrocusto = centrocusto;
    }

    public String getNomedepto() {
        return nomedepto;
    }

    public void setNomedepto(String nomedepto) {
        this.nomedepto = nomedepto;
    }

    public String getNumcartvirtual() {
        return numcartvirtual;
    }

    public void setNumcartvirtual(String numcartvirtual) {
        this.numcartvirtual = numcartvirtual;
    }

    public String getEstabelec() {
        return estabelec;
    }

    public void setEstabelec(String estabelec) {
        this.estabelec = estabelec;
    }

    public BigDecimal getVlrdiariamanual() {
        return vlrdiariamanual;
    }

    public void setVlrdiariamanual(BigDecimal vlrdiariamanual) {
        this.vlrdiariamanual = vlrdiariamanual;
    }

    public BigDecimal getVlrcafe() {
        return vlrcafe;
    }

    public void setVlrcafe(BigDecimal vlrcafe) {
        this.vlrcafe = vlrcafe;
    }

    public String getCodreferencia() {
        return codreferencia;
    }

    public void setCodreferencia(String codreferencia) {
        this.codreferencia = codreferencia;
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

    public Character getLancaupsell() {
        return lancaupsell;
    }

    public void setLancaupsell(Character lancaupsell) {
        this.lancaupsell = lancaupsell;
    }

    public String getObscancelamento() {
        return obscancelamento;
    }

    public void setObscancelamento(String obscancelamento) {
        this.obscancelamento = obscancelamento;
    }

    public String getFaxreservante() {
        return faxreservante;
    }

    public void setFaxreservante(String faxreservante) {
        this.faxreservante = faxreservante;
    }

    public String getEmailreservante() {
        return emailreservante;
    }

    public void setEmailreservante(String emailreservante) {
        this.emailreservante = emailreservante;
    }

    public String getNumcartaofid() {
        return numcartaofid;
    }

    public void setNumcartaofid(String numcartaofid) {
        this.numcartaofid = numcartaofid;
    }

    public String getCodsegurcartao() {
        return codsegurcartao;
    }

    public void setCodsegurcartao(String codsegurcartao) {
        this.codsegurcartao = codsegurcartao;
    }

    public BigDecimal getNumreservavalenet() {
        return numreservavalenet;
    }

    public void setNumreservavalenet(BigDecimal numreservavalenet) {
        this.numreservavalenet = numreservavalenet;
    }

    public BigDecimal getNumresprodvalenet() {
        return numresprodvalenet;
    }

    public void setNumresprodvalenet(BigDecimal numresprodvalenet) {
        this.numresprodvalenet = numresprodvalenet;
    }

    public Short getFlgallotfixo() {
        return flgallotfixo;
    }

    public void setFlgallotfixo(Short flgallotfixo) {
        this.flgallotfixo = flgallotfixo;
    }

    public BigInteger getVersao() {
        return versao;
    }

    public void setVersao(BigInteger versao) {
        this.versao = versao;
    }

    public Character getFlgmensalista() {
        return flgmensalista;
    }

    public void setFlgmensalista(Character flgmensalista) {
        this.flgmensalista = flgmensalista;
    }

    public String getHistnegociacao() {
        return histnegociacao;
    }

    public void setHistnegociacao(String histnegociacao) {
        this.histnegociacao = histnegociacao;
    }

    public String getRloc() {
        return rloc;
    }

    public void setRloc(String rloc) {
        this.rloc = rloc;
    }

    public String getControleagencia() {
        return controleagencia;
    }

    public void setControleagencia(String controleagencia) {
        this.controleagencia = controleagencia;
    }

    public String getOrdemservico() {
        return ordemservico;
    }

    public void setOrdemservico(String ordemservico) {
        this.ordemservico = ordemservico;
    }

    public String getValordesconto() {
        return valordesconto;
    }

    public void setValordesconto(String valordesconto) {
        this.valordesconto = valordesconto;
    }

    public String getAutorizaempresa() {
        return autorizaempresa;
    }

    public void setAutorizaempresa(String autorizaempresa) {
        this.autorizaempresa = autorizaempresa;
    }

    public String getTextolivre() {
        return textolivre;
    }

    public void setTextolivre(String textolivre) {
        this.textolivre = textolivre;
    }

    public BigInteger getNumparcdepos() {
        return numparcdepos;
    }

    public void setNumparcdepos(BigInteger numparcdepos) {
        this.numparcdepos = numparcdepos;
    }

    public Long getNumreservaprinc() {
        return numreservaprinc;
    }

    public void setNumreservaprinc(Long numreservaprinc) {
        this.numreservaprinc = numreservaprinc;
    }

    public Short getFlgordena() {
        return flgordena;
    }

    public void setFlgordena(Short flgordena) {
        this.flgordena = flgordena;
    }

    public Character getFlgreqcheckin() {
        return flgreqcheckin;
    }

    public void setFlgreqcheckin(Character flgreqcheckin) {
        this.flgreqcheckin = flgreqcheckin;
    }

    public Date getDatanoshow() {
        return datanoshow;
    }

    public void setDatanoshow(Date datanoshow) {
        this.datanoshow = datanoshow;
    }

    public BigDecimal getVlrdiariasemimposto() {
        return vlrdiariasemimposto;
    }

    public void setVlrdiariasemimposto(BigDecimal vlrdiariasemimposto) {
        this.vlrdiariasemimposto = vlrdiariasemimposto;
    }

    public String getNumerocelular() {
        return numerocelular;
    }

    public void setNumerocelular(String numerocelular) {
        this.numerocelular = numerocelular;
    }

    public String getObscmnet() {
        return obscmnet;
    }

    public void setObscmnet(String obscmnet) {
        this.obscmnet = obscmnet;
    }

    public BigInteger getNumreservaori() {
        return numreservaori;
    }

    public void setNumreservaori(BigInteger numreservaori) {
        this.numreservaori = numreservaori;
    }

    public String getNumcartaomas() {
        return numcartaomas;
    }

    public void setNumcartaomas(String numcartaomas) {
        this.numcartaomas = numcartaomas;
    }

   /* public Character getCknatend() {
        return cknatend;
    }

    public void setCknatend(Character cknatend) {
        this.cknatend = cknatend;
    }*/

  /*  public Character getCkoatend() {
        return ckoatend;
    }

    public void setCkoatend(Character ckoatend) {
        this.ckoatend = ckoatend;
    }*/

   /* public String getHash() {
        return hash;
    }*/

   /* public void setHash(String hash) {
        this.hash = hash;
    }*/

    public Fidelidaderesvhf getFidelidaderesvhf() {
        return fidelidaderesvhf;
    }

    public void setFidelidaderesvhf(Fidelidaderesvhf fidelidaderesvhf) {
        this.fidelidaderesvhf = fidelidaderesvhf;
    }

    
    public Clientepess getClientereservante() {
        return clientereservante;
    }

    public void setClientereservante(Clientepess clientereservante) {
        this.clientereservante = clientereservante;
    }

    
    public Clientepess getClientehospede() {
        return clientehospede;
    }

    public void setClientehospede(Clientepess clientehospede) {
        this.clientehospede = clientehospede;
    }

    public Tarifahotel getTarifahotel() {
        return tarifahotel;
    }

    public void setTarifahotel(Tarifahotel tarifahotel) {
        this.tarifahotel = tarifahotel;
    }

   

    public Moeda getMoecodigomanual() {
        return moecodigomanual;
    }

    public void setMoecodigomanual(Moeda moecodigomanual) {
        this.moecodigomanual = moecodigomanual;
    }

    public Moeda getMoedeposito() {
        return moedeposito;
    }

    public void setMoedeposito(Moeda moedeposito) {
        this.moedeposito = moedeposito;
    }

   

    public Contrclihotel getContrclihotel() {
        return contrclihotel;
    }

    public void setContrclihotel(Contrclihotel contrclihotel) {
        this.contrclihotel = contrclihotel;
    }

    public Hotel getIdhotelori() {
        return idhotelori;
    }

    public void setIdhotelori(Hotel idhotelori) {
        this.idhotelori = idhotelori;
    }

   

    public Contrclihotel getContrclihotel1() {
        return contrclihotel1;
    }

    public void setContrclihotel1(Contrclihotel contrclihotel1) {
        this.contrclihotel1 = contrclihotel1;
    }

   

    public Veiculoscomunica getIdveiculos() {
        return idveiculos;
    }

    public void setIdveiculos(Veiculoscomunica idveiculos) {
        this.idveiculos = idveiculos;
    }

    public Usuariosistema getIdusualteracao() {
        return idusualteracao;
    }

    public void setIdusualteracao(Usuariosistema idusualteracao) {
        this.idusualteracao = idusualteracao;
    }

    public Meioscomunicacao getIdmeiocomunicacao() {
        return idmeiocomunicacao;
    }

    public void setIdmeiocomunicacao(Meioscomunicacao idmeiocomunicacao) {
        this.idmeiocomunicacao = idmeiocomunicacao;
    }

  

    public Docconfirmahotel getIddocumento() {
        return iddocumento;
    }

    public void setIddocumento(Docconfirmahotel iddocumento) {
        this.iddocumento = iddocumento;
    }

 
    public Usuariosistema getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuariosistema usuario) {
        this.usuario = usuario;
    }

   
    public Origemreserva getIdorigem() {
        return idorigem;
    }

    public void setIdorigem(Origemreserva idorigem) {
        this.idorigem = idorigem;
    }

    @XmlTransient
    public List<Reservasfront> getReservasfrontList() {
        return reservasfrontList;
    }

    public void setReservasfrontList(List<Reservasfront> reservasfrontList) {
        this.reservasfrontList = reservasfrontList;
    }

    public Reservasfront getIdreservamultroom() {
        return idreservamultroom;
    }

    public void setIdreservamultroom(Reservasfront idreservamultroom) {
        this.idreservamultroom = idreservamultroom;
    }

    public Tipouh getTipouh() {
        return tipouh;
    }

    public void setTipouh(Tipouh tipouh) {
        this.tipouh = tipouh;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }

   

    public Tipouh getTipouh1() {
        return tipouh1;
    }

    public void setTipouh1(Tipouh tipouh1) {
        this.tipouh1 = tipouh1;
    }

    public Motivosfront getIdmotivo() {
        return idmotivo;
    }

    public void setIdmotivo(Motivosfront idmotivo) {
        this.idmotivo = idmotivo;
    }

    public Statusreserva getStatusreserva() {
        return statusreserva;
    }

    public void setStatusreserva(Statusreserva statusreserva) {
        this.statusreserva = statusreserva;
    }

    public Reservareduz getReservareduz() {
        return reservareduz;
    }

    public void setReservareduz(Reservareduz reservareduz) {
        this.reservareduz = reservareduz;
    }

    public Reservasideas getReservasideas() {
        return reservasideas;
    }

    public void setReservasideas(Reservasideas reservasideas) {
        this.reservasideas = reservasideas;
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
    public List<Movimentohospedes> getMovimentohospedesList() {
        return movimentohospedesList;
    }

    public void setMovimentohospedesList(List<Movimentohospedes> movimentohospedesList) {
        this.movimentohospedesList = movimentohospedesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservasfront != null ? idreservasfront.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservasfront)) {
            return false;
        }
        Reservasfront other = (Reservasfront) object;
        if ((this.idreservasfront == null && other.idreservasfront != null) || (this.idreservasfront != null && !this.idreservasfront.equals(other.idreservasfront))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Reservasfront[ idreservasfront=" + idreservasfront + " ]";
    }
    
}

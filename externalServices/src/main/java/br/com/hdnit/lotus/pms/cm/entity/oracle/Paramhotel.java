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
import javax.persistence.Basic;
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

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "PARAMHOTEL")
@XmlRootElement
public class Paramhotel implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDHOTEL", nullable = false, precision = 22)
    private Long idhotel;
    @Column(name = "MASCSEGMENTO", length = 20)
    private String mascsegmento;
    @Column(name = "TXSERVICO", precision = 5, scale = 2)
    private BigDecimal txservico;
    @Column(name = "PERCIMPDIARIAS", precision = 6, scale = 2)
    private BigDecimal percimpdiarias;
    @Column(name = "MASCTIPOENXOV", length = 10)
    private String masctipoenxov;
    @Column(name = "CRI1_COMO_ADT")
    private Character cri1ComoAdt;
    @Column(name = "CRI2_COMO_ADT")
    private Character cri2ComoAdt;
    @Column(name = "POSSUE_CRI1")
    private Character possueCri1;
    @Column(name = "POSSUE_CRI2")
    private Character possueCri2;
    @Column(name = "HOTELFLAT")
    private Character hotelflat;
    @Column(name = "DATASISTEMA")
    @Temporal(TemporalType.DATE)
    private Date datasistema;
    @Column(name = "IDADEMAXCRI1")
    private Short idademaxcri1;
    @Column(name = "IDADEMAXCRI2")
    private Short idademaxcri2;
    @Column(name = "HORACHECKIN")
    @Temporal(TemporalType.DATE)
    private Date horacheckin;
    @Column(name = "HORACHECKOUT")
    @Temporal(TemporalType.DATE)
    private Date horacheckout;
    @Column(name = "TAXAPORLANC")
    private Character taxaporlanc;
    @Column(name = "IMPOSTOPORLANC")
    private Character impostoporlanc;
    @Column(name = "PERCISS", precision = 6, scale = 2)
    private BigDecimal perciss;
    @Column(name = "TIPOPENSPADRAO")
    private Character tipopenspadrao;
    @Column(name = "NUMMAXDIASRSV")
    private Short nummaxdiasrsv;
    @Column(name = "PASSOAUDITORIA")
    private Short passoauditoria;
    @Column(name = "IMPNOTASALDIFZERO")
    private Character impnotasaldifzero;
    @Column(name = "LANCARDICHECKIN")
    private Character lancardicheckin;
    @Basic(optional = false)
    @Column(name = "CONTABINTEGRADO", nullable = false)
    private Character contabintegrado;
    @Basic(optional = false)
    @Column(name = "USAYIELDMANAG", nullable = false)
    private Character usayieldmanag;
    @Basic(optional = false)
    @Column(name = "ABRECONTAACOMP", nullable = false)
    private Character abrecontaacomp;
    @Basic(optional = false)
    @Column(name = "INTEGRATELEFONIA", nullable = false)
    private Character integratelefonia;
    @Basic(optional = false)
    @Column(name = "CARTAOIDENTIFICA", nullable = false)
    private Character cartaoidentifica;
    @Column(name = "TXEXPRLAVANDERIA", precision = 17, scale = 2)
    private BigDecimal txexprlavanderia;
    @Column(name = "NUMDIASDELPOSCO")
    private Short numdiasdelposco;
    @Basic(optional = false)
    @Column(name = "CAFEEMDIMEDIA", nullable = false)
    private Character cafeemdimedia;
    @Basic(optional = false)
    @Column(name = "COEMDIMEDIATXOC", nullable = false)
    private Character coemdimediatxoc;
    @Column(name = "ARREDONDAMENTODI")
    private Short arredondamentodi;
    @Basic(optional = false)
    @Column(name = "PDVINTEGRADO", nullable = false)
    private Character pdvintegrado;
    @Column(name = "NUMDIASCONFRES")
    private Short numdiasconfres;
    @Column(name = "NUMDIASDELRELAT")
    private Short numdiasdelrelat;
    @Basic(optional = false)
    @Column(name = "INCNUMNOTAFOLHA", nullable = false)
    private Character incnumnotafolha;
    @Column(name = "VALMINCONSCHTEF", precision = 17, scale = 2)
    private BigDecimal valminconschtef;
    @Column(name = "NUMMAXDIASREABCTA")
    private Short nummaxdiasreabcta;
    @Column(name = "NUMMAXCONTASPEND")
    private Short nummaxcontaspend;
    @Column(name = "LANCARDILIQUIDA")
    private Character lancardiliquida;
    @Column(name = "DIRIMAGENS", length = 255)
    private String dirimagens;
    @Column(name = "RELSUMARIODEBCRED")
    private Character relsumariodebcred;
    @Column(name = "RELCHECKIN")
    private Character relcheckin;
    @Column(name = "RELPREVOCUPACAO")
    private Character relprevocupacao;
    @Column(name = "RELDEMONSTOCUP")
    private Character reldemonstocup;
    @Column(name = "RELSITUACAOUH")
    private Character relsituacaouh;
    @Column(name = "RELHOSPEDENACASA")
    private Character relhospedenacasa;
    @Column(name = "RELCHECKOUT")
    private Character relcheckout;
    @Column(name = "RELEXTENSOES")
    private Character relextensoes;
    @Column(name = "RELSALDOHOSPEDE")
    private Character relsaldohospede;
    @Column(name = "RELBORDERODEBCRED")
    private Character relborderodebcred;
    @Column(name = "RELRECEBPAG")
    private Character relrecebpag;
    @Column(name = "RELNOTAEMITANALIT")
    private Character relnotaemitanalit;
    @Column(name = "RELNOTAEMITSINTET")
    private Character relnotaemitsintet;
    @Column(name = "RELESTORNOEDESC")
    private Character relestornoedesc;
    @Column(name = "RELLANCTRANSF")
    private Character rellanctransf;
    @Column(name = "RELSALDOCONTAS")
    private Character relsaldocontas;
    @Column(name = "RELHOSPEDEEMCURSO")
    private Character relhospedeemcurso;
    @Column(name = "RELRDS")
    private Character relrds;
    @Column(name = "RELESTPERNOITE")
    private Character relestpernoite;
    @Column(name = "RELESTHOTEL")
    private Character relesthotel;
    @Column(name = "RELESTPROCEDENC")
    private Character relestprocedenc;
    @Column(name = "RELESTCLIENTE")
    private Character relestcliente;
    @Column(name = "RELRESUMGERALATIV")
    private Character relresumgeralativ;
    @Column(name = "NUMMAXANTRSV")
    private Short nummaxantrsv;
    @Column(name = "CABECALHOSLIP", length = 400)
    private String cabecalhoslip;
    @Column(name = "RODAPESLIP", length = 2000)
    private String rodapeslip;
    @Column(name = "CADASTRACRI1")
    private Character cadastracri1;
    @Column(name = "CADASTRACRI2")
    private Character cadastracri2;
    @Column(name = "USATENTATIVRES")
    private Character usatentativres;
    @Column(name = "DIRRELAUDITORIA", length = 255)
    private String dirrelauditoria;
    @Column(name = "POLCANCRESERVA", length = 60)
    private String polcancreserva;
    @Column(name = "DIRCOVERPAGE", length = 255)
    private String dircoverpage;
    @Column(name = "MODELOSLIP")
    private Short modeloslip;
    @Column(name = "POLCANCRESERVAING", length = 60)
    private String polcancreservaing;
    @Column(name = "POLNOSHOWRESING", length = 60)
    private String polnoshowresing;
    @Column(name = "POLNOSHOWRES", length = 60)
    private String polnoshowres;
    @Column(name = "VLRCAFEPADRAO", precision = 17, scale = 2)
    private BigDecimal vlrcafepadrao;
    @Column(name = "PROXNUMERONOTA")
    private BigInteger proxnumeronota;
    @Column(name = "ACEITARESFPOOL")
    private Character aceitaresfpool;
    @Column(name = "TIPOCONTAGEMCAFE")
    private Short tipocontagemcafe;
    @Column(name = "UCEMDIMEDIATXOC")
    private Character ucemdimediatxoc;
    @Column(name = "IDMEIOPADRAO")
    private BigInteger idmeiopadrao;
    @Column(name = "IDVEICULOPADRAO")
    private BigInteger idveiculopadrao;
    @Column(name = "IDORIGEMPADRAO")
    private BigInteger idorigempadrao;
    @Column(name = "FLGUSAREGIME")
    private Character flgusaregime;
    @Column(name = "NOTAREGESP")
    private BigInteger notaregesp;
    @Column(name = "SEQARQUIVOTROP")
    private BigInteger seqarquivotrop;
    @Column(name = "FLGIMPFHMATRIX")
    private Character flgimpfhmatrix;
    @Column(name = "FLGINTEGRATEF")
    private Character flgintegratef;
    @Column(name = "FLGINTEGRACMNET")
    private Character flgintegracmnet;
    @Column(name = "CODPDVFRIGOBAR", length = 5)
    private String codpdvfrigobar;
    @Column(name = "IDMOTESTPDV")
    private BigInteger idmotestpdv;
    @Basic(optional = false)
    @Column(name = "COEMTXOC", nullable = false)
    private Character coemtxoc;
    @Basic(optional = false)
    @Column(name = "UCEMTXOC", nullable = false)
    private Character ucemtxoc;
    @Basic(optional = false)
    @Column(name = "PMEMTXOC", nullable = false)
    private Character pmemtxoc;
    @Basic(optional = false)
    @Column(name = "PMEMDIMEDIATXOC", nullable = false)
    private Character pmemdimediatxoc;
    @Column(name = "IDSTATUSGOVARRUM")
    private BigInteger idstatusgovarrum;
    @Column(name = "IDSTATUSGOVINSP")
    private BigInteger idstatusgovinsp;
    @Column(name = "IDSTATUSGOVMANUT")
    private BigInteger idstatusgovmanut;
    @Basic(optional = false)
    @Column(name = "FLGREGIMECONTAB", nullable = false, length = 2)
    private String flgregimecontab;
    @Basic(optional = false)
    @Column(name = "FLGLANCFRIGCHECKO", nullable = false)
    private Character flglancfrigchecko;
    @Column(name = "FLGIMPEXTRMATRIX")
    private Character flgimpextrmatrix;
    @Column(name = "MODELOEXTRATO")
    private Short modeloextrato;
    @Column(name = "ARQDBFINTEGRA", length = 1000)
    private String arqdbfintegra;
    @Column(name = "WSDLLOCATION", length = 100)
    private String wsdllocation;
    @Basic(optional = false)
    @Column(name = "FLGUSAHASAR", nullable = false)
    private Character flgusahasar;
    @Column(name = "MODELONFALT")
    private BigInteger modelonfalt;
    @Column(name = "FLGSOLICITAMOEDA")
    private Character flgsolicitamoeda;
    @Column(name = "ASSUNTOSLIP", length = 200)
    private String assuntoslip;
    @Column(name = "INTEGISENTOSEP")
    private Character integisentosep;
    @Column(name = "CORPOSLIP", length = 1000)
    private String corposlip;
    @Column(name = "FLGLANCIMPINCL")
    private Character flglancimpincl;
    @Basic(optional = false)
    @Column(name = "FLGPEDEMOEDANOTA", nullable = false)
    private Character flgpedemoedanota;
    @Column(name = "FLGSEPARALANCPDV")
    private Character flgseparalancpdv;
    @Column(name = "FLGESTIMPMOEESTR")
    private Character flgestimpmoeestr;
    @Basic(optional = false)
    @Column(name = "FLGIMPDETPDV", nullable = false)
    private Character flgimpdetpdv;
    @Basic(optional = false)
    @Column(name = "FLGUSAREGRAMODNF", nullable = false)
    private Character flgusaregramodnf;
    @Basic(optional = false)
    @Column(name = "TIPOARREDCASADEC", nullable = false)
    private Character tipoarredcasadec;
    @Column(name = "REFAZHOTEL")
    private Character refazhotel;
    @Column(name = "TIPOLIMREABCONTA")
    private Character tipolimreabconta;
    @Column(name = "FLGPREENCHEFNRH")
    private Character flgpreenchefnrh;
    @Basic(optional = false)
    @Column(name = "FLGVLRCAFEPARAM", nullable = false)
    private Character flgvlrcafeparam;
    @Column(name = "FLGSEPALCOOLICOS")
    private Character flgsepalcoolicos;
    @Column(name = "FLGUSASENHATELEF")
    private Character flgusasenhatelef;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "FLGSLIPFAXGRAFICO")
    private Character flgslipfaxgrafico;
    @Column(name = "TIPOVERCREDCLI")
    private Character tipovercredcli;
    @Column(name = "FLGAJUSTACREDITOS")
    private Character flgajustacreditos;
    @Column(name = "NUMDIASCHECKCRED")
    private Integer numdiascheckcred;
    @Column(name = "FLGREGCONTABIMP", length = 2)
    private String flgregcontabimp;
    @Column(name = "FLGREIMPRIMENOTA")
    private Character flgreimprimenota;
    @Column(name = "IDTIPODCINTERNBC")
    private BigInteger idtipodcinternbc;
    @Column(name = "FLGFUNCREDE")
    private Character flgfuncrede;
    @Column(name = "ACHPERDUNICOHOTEL")
    private Character achperdunicohotel;
    @Column(name = "FLGUSASUBCONTADC")
    private Character flgusasubcontadc;
    @Column(name = "ABRIRFICHASIMPLES")
    private Character abrirfichasimples;
    @Column(name = "FLGORDEMCONTAAV")
    private Character flgordemcontaav;
    @Column(name = "FLGUSAPROFORMAEMP")
    private Character flgusaproformaemp;
    @Column(name = "ASSINATURASLIP", length = 250)
    private String assinaturaslip;
    @Column(name = "PARTIDASIMPLES")
    private Character partidasimples;
    @Column(name = "NUMDIASALTUHLIMPA")
    private Short numdiasaltuhlimpa;
    @Column(name = "FLGOBRIGAEMPRES")
    private Character flgobrigaempres;
    @Column(name = "FLGNUMNOTAMANUAL")
    private Character flgnumnotamanual;
    @Column(name = "FLGVERIFTARIFADOR")
    private Character flgveriftarifador;
    @Column(name = "FLGADCONTATONARES")
    private Character flgadcontatonares;
    @Column(name = "NUMMAXMESCANCNOTA")
    private Short nummaxmescancnota;
    @Column(name = "FLGGERACONTAADIAN")
    private Character flggeracontaadian;
    @Column(name = "FLGLANCACONTAPDV")
    private Character flglancacontapdv;
    @Column(name = "NUMDIASMUDAROUPA")
    private Short numdiasmudaroupa;
    @Column(name = "FLGOBRIGAENCONDIA")
    private Character flgobrigaencondia;
    @Column(name = "FLGREGCONTABCRED", length = 2)
    private String flgregcontabcred;
    @Column(name = "FLGVENTPORPARAM")
    private Character flgventporparam;
    @Column(name = "NUMDIASDELREGOPER")
    private Short numdiasdelregoper;
    @Column(name = "VENTILACAFECO")
    private Character ventilacafeco;
    @Column(name = "VENTILACAFEUC")
    private Character ventilacafeuc;
    @Column(name = "CORHOSPINCOGNITO")
    private BigInteger corhospincognito;
    @Column(name = "FLGTITRELAT")
    private Character flgtitrelat;
    @Column(name = "FLGVLRPENSPARAM")
    private Character flgvlrpensparam;
    @Column(name = "FLGVENTPENSPARAM")
    private Character flgventpensparam;
    @Column(name = "EVENTOINTEGRADO")
    private Character eventointegrado;
    @Column(name = "FORMRELAUDIT")
    private Character formrelaudit;
    @Column(name = "FLGNEMITENOTAZERO")
    private Character flgnemitenotazero;
    @Column(name = "FLGIMPCOTNANFAFAT")
    private Character flgimpcotnanfafat;
    @Column(name = "FLGINTEGRAIDEAS")
    private Character flgintegraideas;
    @Column(name = "FLGINTEGFATPROPOR")
    private Character flgintegfatpropor;
    @Column(name = "FLGUSAUSUXMOEDA")
    private Character flgusausuxmoeda;
    @Column(name = "FLGPEDENUMPAGNF")
    private Character flgpedenumpagnf;
    @Column(name = "HISTORICOCORT", length = 200)
    private String historicocort;
    @Column(name = "VENTILAPENSAOCO")
    private Character ventilapensaoco;
    @Column(name = "VENTILAPENSAOUC")
    private Character ventilapensaouc;
    @Column(name = "FLGCALCCOMISSPARC")
    private Character flgcalccomissparc;
    @Column(name = "ERROMAXARREDIMPHA", precision = 18, scale = 2)
    private BigDecimal erromaxarredimpha;
    @Column(name = "TIPONOTACANCAUTOH", length = 2)
    private String tiponotacancautoh;
    @Column(name = "NUMDIGITOSPIN")
    private BigInteger numdigitospin;
    @Column(name = "EVITADIRECDICLI")
    private Character evitadirecdicli;
    @Column(name = "FLGUSACONTRMP")
    private Character flgusacontrmp;
    @Column(name = "FLGPEDEMODELONF")
    private Character flgpedemodelonf;
    @Column(name = "MINPARCONSGER")
    private Short minparconsger;
    @Column(name = "LANCIMPENCCTA")
    private Character lancimpenccta;
    @Column(name = "FLGBLOQCREDHOSP")
    private Character flgbloqcredhosp;
    @Column(name = "FLGBLOQCREDCLIE")
    private Character flgbloqcredclie;
    @Column(name = "LANCARSECDINOSHOW")
    private Character lancarsecdinoshow;
    @Column(name = "INTEGRACARTCONSUMO")
    private Character integracartconsumo;
    @Column(name = "CABECALHOSLIPCANC", length = 400)
    private String cabecalhoslipcanc;
    @Column(name = "RODAPESLIPCANC", length = 2000)
    private String rodapeslipcanc;
    @Column(name = "ASSUNTOSLIPCANC", length = 200)
    private String assuntoslipcanc;
    @Column(name = "CORPOSLIPCANC", length = 1000)
    private String corposlipcanc;
    @Column(name = "ASSINATURASLIPCAN", length = 250)
    private String assinaturaslipcan;
    @Column(name = "MODELOSLIPCANC")
    private Short modeloslipcanc;
    @Column(name = "DIRCOVERPAGECANC", length = 255)
    private String dircoverpagecanc;
    @Column(name = "FLGSLIPFXGRFCANC")
    private Character flgslipfxgrfcanc;
    @Column(name = "ASSSLIPCANC", length = 250)
    private String assslipcanc;
    @Column(name = "FLGINFMETIQUETA")
    private Character flginfmetiqueta;
    @Column(name = "FLGCONTABRECPDV")
    private Character flgcontabrecpdv;
    @Column(name = "FLGIMPCUPOMENOTA")
    private Character flgimpcupomenota;
    @Column(name = "NDIASBAIXACPER")
    private BigInteger ndiasbaixacper;
    @Column(name = "FLGAGREGIMPOSTO")
    private Character flgagregimposto;
    @Column(name = "FLGDESDIRLIMCRED")
    private Character flgdesdirlimcred;
    @Column(name = "COREARLYCHECKIN")
    private BigInteger corearlycheckin;
    @Column(name = "CORLATECHECKOUT")
    private BigInteger corlatecheckout;
    @Column(name = "FLGPERCANCISSGER")
    private Character flgpercancissger;
    @Column(name = "FLGMSGLIMCREDEXC")
    private Character flgmsglimcredexc;
    @Column(name = "FLGMOENFMOECRED")
    private Character flgmoenfmoecred;
    @Column(name = "FLGTIRAPOOLPROP")
    private Character flgtirapoolprop;
    @Column(name = "ENDWEBSERVICE", length = 300)
    private String endwebservice;
    @Column(name = "CHAVEWEBSERVICE", length = 100)
    private String chavewebservice;
    @Column(name = "CODUNIDHOTEL", length = 9)
    private String codunidhotel;
    @Column(name = "NUMESTABELEC", length = 2)
    private String numestabelec;
    @Column(name = "FLGAGRUPALANCAP")
    private Character flgagrupalancap;
    @Column(name = "FLGEPSONPF300")
    private Character flgepsonpf300;
    @Column(name = "FLGSOLICITAPASCART")
    private Character flgsolicitapascart;
    @Column(name = "FLGINTSIHOT", length = 1)
    private String flgintsihot;
    @Column(name = "SIHOTCOD", length = 4)
    private String sihotcod;
    @Column(name = "PATHSIHOT", length = 255)
    private String pathsihot;
    @Column(name = "FLGSUBTOTHASAR")
    private Character flgsubtothasar;
    @Column(name = "FLGMOSTRAERRO")
    private Character flgmostraerro;
    @Column(name = "USERPOUSADA", length = 20)
    private String userpousada;
    @Column(name = "PASSPOUSADA", length = 15)
    private String passpousada;
    @Column(name = "FLGDIACHECKIN")
    private Character flgdiacheckin;
    @Column(name = "FLGREQCHECKIN")
    private Character flgreqcheckin;
    @Column(name = "FLGFORMREGCONTAB", length = 2)
    private String flgformregcontab;
    @Column(name = "FLGINTEGFISFLEX")
    private Character flgintegfisflex;
    @Column(name = "FLGSAVEARQFLEX")
    private Character flgsavearqflex;
    @Column(name = "IDMODELODOCFLEX")
    private BigInteger idmodelodocflex;
    @Column(name = "CODSITUACAOFLEX", length = 2)
    private String codsituacaoflex;
    @Column(name = "CODSITUNOTACANC", length = 2)
    private String codsitunotacanc;
    @Column(name = "FLGINTEGICMSFLEX")
    private Character flgintegicmsflex;
    @Column(name = "IDMODELODOCICMSFLEX")
    private BigInteger idmodelodocicmsflex;
    @Column(name = "CODSITUACAOICMSFLEX", length = 2)
    private String codsituacaoicmsflex;
    @Column(name = "CODSITUNOTACANCICMS", length = 2)
    private String codsitunotacancicms;
    @Column(name = "FLGINTEGISSFLEX")
    private Character flgintegissflex;
    @Column(name = "REGCONFCONTA")
    private Character regconfconta;
    @Column(name = "REGCONTAABERTA")
    private Character regcontaaberta;
    @Column(name = "REGTRANSFCONTA")
    private Character regtransfconta;
    @Column(name = "REGMEIOSPGTO")
    private Character regmeiospgto;
    @Column(name = "REGCOMPROVTEF")
    private Character regcomprovtef;
    @Column(name = "REGREGISTROVENDA")
    private Character regregistrovenda;
    @Column(name = "REGIDENTPAF")
    private Character regidentpaf;
    @Column(name = "MD5FULL", length = 255)
    private String md5full;
    @Column(name = "REGPDVTERCPAF")
    private Character regpdvtercpaf;
    @Column(name = "FLGINTEGRAPAFECF")
    private Character flgintegrapafecf;
    @Column(name = "TOTALIZADORRECEBUH")
    private Character totalizadorrecebuh;
    @Column(name = "PATHSIHOTFIM", length = 255)
    private String pathsihotfim;
    @Column(name = "NUMDIASDELARQANEXO", precision = 18, scale = 2)
    private BigDecimal numdiasdelarqanexo;
    @Column(name = "LANCCUPOMDESCCMN")
    private Character lanccupomdesccmn;
    @Column(name = "FLGEMITIRNFE")
    private Character flgemitirnfe;
    @Column(name = "IDMODELODOCNFEFLEX")
    private BigInteger idmodelodocnfeflex;
    @Column(name = "QTDRESCONF")
    private Integer qtdresconf;
    @Column(name = "NUMNOITERESCONF")
    private Integer numnoiteresconf;
    @Column(name = "IDMODDOCNFESERV")
    private BigInteger idmoddocnfeserv;
    @Column(name = "FLGEMITIRNFESERV")
    private Character flgemitirnfeserv;
    @Column(name = "FLGALTDADOSPART")
    private Character flgaltdadospart;
    @Column(name = "VERSAOSISTEMA", length = 15)
    private String versaosistema;
    @Column(name = "IDMODELOCUPOMFISCAL")
    private BigInteger idmodelocupomfiscal;
    @Column(name = "FLGOBRIGORIGEMSEGMENTO")
    private Character flgobrigorigemsegmento;
    @Column(name = "FLGSEPARAPORALIQUOTA")
    private Character flgseparaporaliquota;
    @Column(name = "FLGIMPNOTACNPJEND")
    private Character flgimpnotacnpjend;
    @Column(name = "FLGNCSEMLANC")
  /*  private Character flgncsemlanc;
    @Column(name = "VALIDOUNF")*/
    private Character validounf;
    @Column(name = "FLGNAOALTDIARES")
    private Character flgnaoaltdiares;
    @Column(name = "FLGPERTIPOUHALLOT")
    private Character flgpertipouhallot;
    @Column(name = "FLGFATURAELETRONICA")
    private Character flgfaturaeletronica;
    @Column(name = "PASSOORCAMRES")
    private Short passoorcamres;
    @Column(name = "CAMINHOARQUIVOPOLICIA", length = 300)
    private String caminhoarquivopolicia;
    @Column(name = "CODIGOPOLICIAREDE", length = 10)
    private String codigopoliciarede;
    @Column(name = "CODIGOPOLICIAHOTEL", length = 10)
    private String codigopoliciahotel;
    @Column(name = "FLGFLEXF100")
    private Character flgflexf100;
    @Column(name = "FLGABATEDESDCFLEX")
    private Character flgabatedesdcflex;
    @Column(name = "FLGVERIFICAFICHATXTURISMO")
    private Character flgverificafichatxturismo;
    @Column(name = "FLGCONTRSERIEXMODNF")
    private Character flgcontrseriexmodnf;
    @Column(name = "CODPAIS", length = 3)
    private String codpais;
    @Column(name = "FLGBREAKDOWNTODASCONTAS")
    private Character flgbreakdowntodascontas;
    @Column(name = "FLGSUGERETARIFA")
    private Character flgsugeretarifa;
    @Column(name = "FLGCONTLANCPORCXCP")
    private Character flgcontlancporcxcp;
    @Column(name = "REGPARAMCONFIG", length = 2)
    private String regparamconfig;
    @Column(name = "FLGAJUSTAEXTRAS")
    private Character flgajustaextras;
    @Column(name = "CABECALHOSLIPALT", length = 2000)
    private String cabecalhoslipalt;
    @Column(name = "RODAPESLIPALT", length = 2000)
    private String rodapeslipalt;
    @Column(name = "ASSUNTOSLIPALT", length = 200)
    private String assuntoslipalt;
    @Column(name = "CORPOSLIPALT", length = 1000)
    private String corposlipalt;
    @Column(name = "ASSINATURASLIPALT", length = 250)
    private String assinaturaslipalt;
    @Column(name = "MODELOSLIPALT")
    private BigInteger modeloslipalt;
    @Column(name = "DIRCOVERPAGEALT", length = 255)
    private String dircoverpagealt;
    @Column(name = "FLGSLIPFXGRFALT")
    private Character flgslipfxgrfalt;
    @Column(name = "ASSSLIPALT", length = 250)
    private String assslipalt;
    @Column(name = "FLGLANCDIARIACONTRPERM")
    private Character flglancdiariacontrperm;
    @Column(name = "TIPOEXTRATO", length = 3)
    private String tipoextrato;
    @Column(name = "SERIEEXTRATO", length = 20)
    private String serieextrato;
    @Basic(optional = false)
    @Column(name = "FLGGRAVLOGDIARIA", nullable = false)
    private Character flggravlogdiaria;
    @Basic(optional = false)
    @Column(name = "FLGGRAVLOGVENTCAFE", nullable = false)
    private Character flggravlogventcafe;
 /*   @Column(name = "FLGINTEGRAOUTROSISTEMA")
    private Character flgintegraoutrosistema;*/
   /* @Basic(optional = false)
    @Column(name = "FLGORCMANUAL", nullable = false)
    private Character flgorcmanual;*/
  /*  @Column(name = "FLGSEPARARCLIENTEPOSTO")
    private Character flgsepararclienteposto;
    @Column(name = "FLGBLOQBTNREPETIRRESERVA")
    private Character flgbloqbtnrepetirreserva;*/
   /* @Column(name = "INICIOFIMDESEMANA")
    private BigInteger iniciofimdesemana;
   */ @JoinColumn(name = "IDMEIOCOMUNICACAO", referencedColumnName = "IDMEIOCOMUNICACAO")
    @ManyToOne
    private Meioscomunicacao idmeiocomunicacao;
    @JoinColumns({
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDTIPOHOSPGRUPO", referencedColumnName = "IDTIPOHOSPEDE", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Tipohospede tipohospede;
    @JoinColumns({
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDTIPOHOSPCENTRES", referencedColumnName = "IDTIPOHOSPEDE", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Tipohospede tipohospede1;
    @JoinColumns({
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDTIPOHOSPIND", referencedColumnName = "IDTIPOHOSPEDE", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Tipohospede tipohospede2;
    @JoinColumn(name = "MOEDANACIONAL", referencedColumnName = "MOECODIGO")
    @ManyToOne
    private Moeda moedanacional;
    @JoinColumn(name = "IDVALETUR", referencedColumnName = "IDPESSOA")
    @ManyToOne
    private Clientepess idvaletur;
    @JoinColumn(name = "IDMEIOCENTRES", referencedColumnName = "IDMEIOCOMUNICACAO")
    @ManyToOne
    private Meioscomunicacao idmeiocentres;
    @JoinColumn(name = "IDDOCCENTRES", referencedColumnName = "IDDOCUMENTO")
    @ManyToOne
    private Docconfirmahotel iddoccentres;
    @JoinColumns({
        @JoinColumn(name = "CODSEGCENTRES", referencedColumnName = "CODSEGMENTO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Segmento segmento;
    @JoinColumn(name = "MOEDADOLAR", referencedColumnName = "MOECODIGO")
    @ManyToOne
    private Moeda moedadolar;
    @JoinColumn(name = "IDMOTIVOESTIMP", referencedColumnName = "IDMOTIVO")
    @ManyToOne
    private Motivosfront idmotivoestimp;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Hotel hotel;
    @JoinColumn(name = "IDVEICULOSCENTRES", referencedColumnName = "IDVEICULOS")
    @ManyToOne
    private Veiculoscomunica idveiculoscentres;
    @JoinColumn(name = "MOEDACAFE", referencedColumnName = "MOECODIGO")
    @ManyToOne
    private Moeda moedacafe;
    @JoinColumn(name = "IDVEICPADRAOGRP", referencedColumnName = "IDVEICULOS")
    @ManyToOne
    private Veiculoscomunica idveicpadraogrp;
    @JoinColumn(name = "IDMOTIVOESTCORT", referencedColumnName = "IDMOTIVO")
    @ManyToOne
    private Motivosfront idmotivoestcort;
    @JoinColumns({
        @JoinColumn(name = "CODSEGPADRAOGRUPO", referencedColumnName = "CODSEGMENTO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Segmento segmento1;
    @JoinColumn(name = "IDUSUARIOPDV", referencedColumnName = "IDUSUARIO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Usuariosistema idusuariopdv;
    @JoinColumn(name = "IDCONTAPENSAO", referencedColumnName = "IDCONTA")
    @ManyToOne
    private Contasfront idcontapensao;
    @JoinColumns({
        @JoinColumn(name = "CODSEGPADRAO", referencedColumnName = "CODSEGMENTO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Segmento segmento2;
    @JoinColumn(name = "IDORIGEM", referencedColumnName = "IDORIGEM")
    @ManyToOne
    private Origemreserva idorigem;
    @JoinColumn(name = "IDVEICULOS", referencedColumnName = "IDVEICULOS")
    @ManyToOne
    private Veiculoscomunica idveiculos;
    @JoinColumn(name = "IDCONTAPACOTE", referencedColumnName = "IDCONTA")
    @ManyToOne
    private Contasfront idcontapacote;
    @JoinColumn(name = "IDCONTAREGIME", referencedColumnName = "IDCONTA")
    @ManyToOne
    private Contasfront idcontaregime;
    @JoinColumn(name = "IDMEIOPADRAOGRUPO", referencedColumnName = "IDMEIOCOMUNICACAO")
    @ManyToOne
    private Meioscomunicacao idmeiopadraogrupo;
    @JoinColumn(name = "IDORIGEMCENTRES", referencedColumnName = "IDORIGEM")
    @ManyToOne
    private Origemreserva idorigemcentres;
    @JoinColumn(name = "IDORIGEMPADRAOGRP", referencedColumnName = "IDORIGEM")
    @ManyToOne
    private Origemreserva idorigempadraogrp;
    @JoinColumn(name = "IDCONTAALL", referencedColumnName = "IDCONTA")
    @ManyToOne
    private Contasfront idcontaall;
    @JoinColumn(name = "IDMOTIVOCENTRES", referencedColumnName = "IDMOTIVO")
    @ManyToOne
    private Motivosfront idmotivocentres;
    @JoinColumn(name = "IDMOTPDRDESCCTR", referencedColumnName = "IDMOTIVO")
    @ManyToOne
    private Motivosfront idmotpdrdescctr;
    @JoinColumn(name = "IDUSUARIOCMNET", referencedColumnName = "IDUSUARIO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Usuariosistema idusuariocmnet;

    public Paramhotel() {
    }

    public Paramhotel(Long idhotel) {
        this.idhotel = idhotel;
    }

    public Paramhotel(Long idhotel, Character contabintegrado, Character usayieldmanag, Character abrecontaacomp, Character integratelefonia, Character cartaoidentifica, Character cafeemdimedia, Character coemdimediatxoc, Character pdvintegrado, Character incnumnotafolha, Character coemtxoc, Character ucemtxoc, Character pmemtxoc, Character pmemdimediatxoc, String flgregimecontab, Character flglancfrigchecko, Character flgusahasar, Character flgpedemoedanota, Character flgimpdetpdv, Character flgusaregramodnf, Character tipoarredcasadec, Character flgvlrcafeparam, Character flggravlogdiaria, Character flggravlogventcafe, Character flgorcmanual) {
        this.idhotel = idhotel;
        this.contabintegrado = contabintegrado;
        this.usayieldmanag = usayieldmanag;
        this.abrecontaacomp = abrecontaacomp;
        this.integratelefonia = integratelefonia;
        this.cartaoidentifica = cartaoidentifica;
        this.cafeemdimedia = cafeemdimedia;
        this.coemdimediatxoc = coemdimediatxoc;
        this.pdvintegrado = pdvintegrado;
        this.incnumnotafolha = incnumnotafolha;
        this.coemtxoc = coemtxoc;
        this.ucemtxoc = ucemtxoc;
        this.pmemtxoc = pmemtxoc;
        this.pmemdimediatxoc = pmemdimediatxoc;
        this.flgregimecontab = flgregimecontab;
        this.flglancfrigchecko = flglancfrigchecko;
        this.flgusahasar = flgusahasar;
        this.flgpedemoedanota = flgpedemoedanota;
        this.flgimpdetpdv = flgimpdetpdv;
        this.flgusaregramodnf = flgusaregramodnf;
        this.tipoarredcasadec = tipoarredcasadec;
        this.flgvlrcafeparam = flgvlrcafeparam;
        this.flggravlogdiaria = flggravlogdiaria;
        this.flggravlogventcafe = flggravlogventcafe;
       // this.flgorcmanual = flgorcmanual;
    }

    public Long getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(Long idhotel) {
        this.idhotel = idhotel;
    }

    public String getMascsegmento() {
        return mascsegmento;
    }

    public void setMascsegmento(String mascsegmento) {
        this.mascsegmento = mascsegmento;
    }

    public BigDecimal getTxservico() {
        return txservico;
    }

    public void setTxservico(BigDecimal txservico) {
        this.txservico = txservico;
    }

    public BigDecimal getPercimpdiarias() {
        return percimpdiarias;
    }

    public void setPercimpdiarias(BigDecimal percimpdiarias) {
        this.percimpdiarias = percimpdiarias;
    }

    public String getMasctipoenxov() {
        return masctipoenxov;
    }

    public void setMasctipoenxov(String masctipoenxov) {
        this.masctipoenxov = masctipoenxov;
    }

    public Character getCri1ComoAdt() {
        return cri1ComoAdt;
    }

    public void setCri1ComoAdt(Character cri1ComoAdt) {
        this.cri1ComoAdt = cri1ComoAdt;
    }

    public Character getCri2ComoAdt() {
        return cri2ComoAdt;
    }

    public void setCri2ComoAdt(Character cri2ComoAdt) {
        this.cri2ComoAdt = cri2ComoAdt;
    }

    public Character getPossueCri1() {
        return possueCri1;
    }

    public void setPossueCri1(Character possueCri1) {
        this.possueCri1 = possueCri1;
    }

    public Character getPossueCri2() {
        return possueCri2;
    }

    public void setPossueCri2(Character possueCri2) {
        this.possueCri2 = possueCri2;
    }

    public Character getHotelflat() {
        return hotelflat;
    }

    public void setHotelflat(Character hotelflat) {
        this.hotelflat = hotelflat;
    }

    public Date getDatasistema() {
        return datasistema;
    }

    public void setDatasistema(Date datasistema) {
        this.datasistema = datasistema;
    }

    public Short getIdademaxcri1() {
        return idademaxcri1;
    }

    public void setIdademaxcri1(Short idademaxcri1) {
        this.idademaxcri1 = idademaxcri1;
    }

    public Short getIdademaxcri2() {
        return idademaxcri2;
    }

    public void setIdademaxcri2(Short idademaxcri2) {
        this.idademaxcri2 = idademaxcri2;
    }

    public Date getHoracheckin() {
        return horacheckin;
    }

    public void setHoracheckin(Date horacheckin) {
        this.horacheckin = horacheckin;
    }

    public Date getHoracheckout() {
        return horacheckout;
    }

    public void setHoracheckout(Date horacheckout) {
        this.horacheckout = horacheckout;
    }

    public Character getTaxaporlanc() {
        return taxaporlanc;
    }

    public void setTaxaporlanc(Character taxaporlanc) {
        this.taxaporlanc = taxaporlanc;
    }

    public Character getImpostoporlanc() {
        return impostoporlanc;
    }

    public void setImpostoporlanc(Character impostoporlanc) {
        this.impostoporlanc = impostoporlanc;
    }

    public BigDecimal getPerciss() {
        return perciss;
    }

    public void setPerciss(BigDecimal perciss) {
        this.perciss = perciss;
    }

    public Character getTipopenspadrao() {
        return tipopenspadrao;
    }

    public void setTipopenspadrao(Character tipopenspadrao) {
        this.tipopenspadrao = tipopenspadrao;
    }

    public Short getNummaxdiasrsv() {
        return nummaxdiasrsv;
    }

    public void setNummaxdiasrsv(Short nummaxdiasrsv) {
        this.nummaxdiasrsv = nummaxdiasrsv;
    }

    public Short getPassoauditoria() {
        return passoauditoria;
    }

    public void setPassoauditoria(Short passoauditoria) {
        this.passoauditoria = passoauditoria;
    }

    public Character getImpnotasaldifzero() {
        return impnotasaldifzero;
    }

    public void setImpnotasaldifzero(Character impnotasaldifzero) {
        this.impnotasaldifzero = impnotasaldifzero;
    }

    public Character getLancardicheckin() {
        return lancardicheckin;
    }

    public void setLancardicheckin(Character lancardicheckin) {
        this.lancardicheckin = lancardicheckin;
    }

    public Character getContabintegrado() {
        return contabintegrado;
    }

    public void setContabintegrado(Character contabintegrado) {
        this.contabintegrado = contabintegrado;
    }

    public Character getUsayieldmanag() {
        return usayieldmanag;
    }

    public void setUsayieldmanag(Character usayieldmanag) {
        this.usayieldmanag = usayieldmanag;
    }

    public Character getAbrecontaacomp() {
        return abrecontaacomp;
    }

    public void setAbrecontaacomp(Character abrecontaacomp) {
        this.abrecontaacomp = abrecontaacomp;
    }

    public Character getIntegratelefonia() {
        return integratelefonia;
    }

    public void setIntegratelefonia(Character integratelefonia) {
        this.integratelefonia = integratelefonia;
    }

    public Character getCartaoidentifica() {
        return cartaoidentifica;
    }

    public void setCartaoidentifica(Character cartaoidentifica) {
        this.cartaoidentifica = cartaoidentifica;
    }

    public BigDecimal getTxexprlavanderia() {
        return txexprlavanderia;
    }

    public void setTxexprlavanderia(BigDecimal txexprlavanderia) {
        this.txexprlavanderia = txexprlavanderia;
    }

    public Short getNumdiasdelposco() {
        return numdiasdelposco;
    }

    public void setNumdiasdelposco(Short numdiasdelposco) {
        this.numdiasdelposco = numdiasdelposco;
    }

    public Character getCafeemdimedia() {
        return cafeemdimedia;
    }

    public void setCafeemdimedia(Character cafeemdimedia) {
        this.cafeemdimedia = cafeemdimedia;
    }

    public Character getCoemdimediatxoc() {
        return coemdimediatxoc;
    }

    public void setCoemdimediatxoc(Character coemdimediatxoc) {
        this.coemdimediatxoc = coemdimediatxoc;
    }

    public Short getArredondamentodi() {
        return arredondamentodi;
    }

    public void setArredondamentodi(Short arredondamentodi) {
        this.arredondamentodi = arredondamentodi;
    }

    public Character getPdvintegrado() {
        return pdvintegrado;
    }

    public void setPdvintegrado(Character pdvintegrado) {
        this.pdvintegrado = pdvintegrado;
    }

    public Short getNumdiasconfres() {
        return numdiasconfres;
    }

    public void setNumdiasconfres(Short numdiasconfres) {
        this.numdiasconfres = numdiasconfres;
    }

    public Short getNumdiasdelrelat() {
        return numdiasdelrelat;
    }

    public void setNumdiasdelrelat(Short numdiasdelrelat) {
        this.numdiasdelrelat = numdiasdelrelat;
    }

    public Character getIncnumnotafolha() {
        return incnumnotafolha;
    }

    public void setIncnumnotafolha(Character incnumnotafolha) {
        this.incnumnotafolha = incnumnotafolha;
    }

    public BigDecimal getValminconschtef() {
        return valminconschtef;
    }

    public void setValminconschtef(BigDecimal valminconschtef) {
        this.valminconschtef = valminconschtef;
    }

    public Short getNummaxdiasreabcta() {
        return nummaxdiasreabcta;
    }

    public void setNummaxdiasreabcta(Short nummaxdiasreabcta) {
        this.nummaxdiasreabcta = nummaxdiasreabcta;
    }

    public Short getNummaxcontaspend() {
        return nummaxcontaspend;
    }

    public void setNummaxcontaspend(Short nummaxcontaspend) {
        this.nummaxcontaspend = nummaxcontaspend;
    }

    public Character getLancardiliquida() {
        return lancardiliquida;
    }

    public void setLancardiliquida(Character lancardiliquida) {
        this.lancardiliquida = lancardiliquida;
    }

    public String getDirimagens() {
        return dirimagens;
    }

    public void setDirimagens(String dirimagens) {
        this.dirimagens = dirimagens;
    }

    public Character getRelsumariodebcred() {
        return relsumariodebcred;
    }

    public void setRelsumariodebcred(Character relsumariodebcred) {
        this.relsumariodebcred = relsumariodebcred;
    }

    public Character getRelcheckin() {
        return relcheckin;
    }

    public void setRelcheckin(Character relcheckin) {
        this.relcheckin = relcheckin;
    }

    public Character getRelprevocupacao() {
        return relprevocupacao;
    }

    public void setRelprevocupacao(Character relprevocupacao) {
        this.relprevocupacao = relprevocupacao;
    }

    public Character getReldemonstocup() {
        return reldemonstocup;
    }

    public void setReldemonstocup(Character reldemonstocup) {
        this.reldemonstocup = reldemonstocup;
    }

    public Character getRelsituacaouh() {
        return relsituacaouh;
    }

    public void setRelsituacaouh(Character relsituacaouh) {
        this.relsituacaouh = relsituacaouh;
    }

    public Character getRelhospedenacasa() {
        return relhospedenacasa;
    }

    public void setRelhospedenacasa(Character relhospedenacasa) {
        this.relhospedenacasa = relhospedenacasa;
    }

    public Character getRelcheckout() {
        return relcheckout;
    }

    public void setRelcheckout(Character relcheckout) {
        this.relcheckout = relcheckout;
    }

    public Character getRelextensoes() {
        return relextensoes;
    }

    public void setRelextensoes(Character relextensoes) {
        this.relextensoes = relextensoes;
    }

    public Character getRelsaldohospede() {
        return relsaldohospede;
    }

    public void setRelsaldohospede(Character relsaldohospede) {
        this.relsaldohospede = relsaldohospede;
    }

    public Character getRelborderodebcred() {
        return relborderodebcred;
    }

    public void setRelborderodebcred(Character relborderodebcred) {
        this.relborderodebcred = relborderodebcred;
    }

    public Character getRelrecebpag() {
        return relrecebpag;
    }

    public void setRelrecebpag(Character relrecebpag) {
        this.relrecebpag = relrecebpag;
    }

    public Character getRelnotaemitanalit() {
        return relnotaemitanalit;
    }

    public void setRelnotaemitanalit(Character relnotaemitanalit) {
        this.relnotaemitanalit = relnotaemitanalit;
    }

    public Character getRelnotaemitsintet() {
        return relnotaemitsintet;
    }

    public void setRelnotaemitsintet(Character relnotaemitsintet) {
        this.relnotaemitsintet = relnotaemitsintet;
    }

    public Character getRelestornoedesc() {
        return relestornoedesc;
    }

    public void setRelestornoedesc(Character relestornoedesc) {
        this.relestornoedesc = relestornoedesc;
    }

    public Character getRellanctransf() {
        return rellanctransf;
    }

    public void setRellanctransf(Character rellanctransf) {
        this.rellanctransf = rellanctransf;
    }

    public Character getRelsaldocontas() {
        return relsaldocontas;
    }

    public void setRelsaldocontas(Character relsaldocontas) {
        this.relsaldocontas = relsaldocontas;
    }

    public Character getRelhospedeemcurso() {
        return relhospedeemcurso;
    }

    public void setRelhospedeemcurso(Character relhospedeemcurso) {
        this.relhospedeemcurso = relhospedeemcurso;
    }

    public Character getRelrds() {
        return relrds;
    }

    public void setRelrds(Character relrds) {
        this.relrds = relrds;
    }

    public Character getRelestpernoite() {
        return relestpernoite;
    }

    public void setRelestpernoite(Character relestpernoite) {
        this.relestpernoite = relestpernoite;
    }

    public Character getRelesthotel() {
        return relesthotel;
    }

    public void setRelesthotel(Character relesthotel) {
        this.relesthotel = relesthotel;
    }

    public Character getRelestprocedenc() {
        return relestprocedenc;
    }

    public void setRelestprocedenc(Character relestprocedenc) {
        this.relestprocedenc = relestprocedenc;
    }

    public Character getRelestcliente() {
        return relestcliente;
    }

    public void setRelestcliente(Character relestcliente) {
        this.relestcliente = relestcliente;
    }

    public Character getRelresumgeralativ() {
        return relresumgeralativ;
    }

    public void setRelresumgeralativ(Character relresumgeralativ) {
        this.relresumgeralativ = relresumgeralativ;
    }

    public Short getNummaxantrsv() {
        return nummaxantrsv;
    }

    public void setNummaxantrsv(Short nummaxantrsv) {
        this.nummaxantrsv = nummaxantrsv;
    }

    public String getCabecalhoslip() {
        return cabecalhoslip;
    }

    public void setCabecalhoslip(String cabecalhoslip) {
        this.cabecalhoslip = cabecalhoslip;
    }

    public String getRodapeslip() {
        return rodapeslip;
    }

    public void setRodapeslip(String rodapeslip) {
        this.rodapeslip = rodapeslip;
    }

    public Character getCadastracri1() {
        return cadastracri1;
    }

    public void setCadastracri1(Character cadastracri1) {
        this.cadastracri1 = cadastracri1;
    }

    public Character getCadastracri2() {
        return cadastracri2;
    }

    public void setCadastracri2(Character cadastracri2) {
        this.cadastracri2 = cadastracri2;
    }

    public Character getUsatentativres() {
        return usatentativres;
    }

    public void setUsatentativres(Character usatentativres) {
        this.usatentativres = usatentativres;
    }

    public String getDirrelauditoria() {
        return dirrelauditoria;
    }

    public void setDirrelauditoria(String dirrelauditoria) {
        this.dirrelauditoria = dirrelauditoria;
    }

    public String getPolcancreserva() {
        return polcancreserva;
    }

    public void setPolcancreserva(String polcancreserva) {
        this.polcancreserva = polcancreserva;
    }

    public String getDircoverpage() {
        return dircoverpage;
    }

    public void setDircoverpage(String dircoverpage) {
        this.dircoverpage = dircoverpage;
    }

    public Short getModeloslip() {
        return modeloslip;
    }

    public void setModeloslip(Short modeloslip) {
        this.modeloslip = modeloslip;
    }

    public String getPolcancreservaing() {
        return polcancreservaing;
    }

    public void setPolcancreservaing(String polcancreservaing) {
        this.polcancreservaing = polcancreservaing;
    }

    public String getPolnoshowresing() {
        return polnoshowresing;
    }

    public void setPolnoshowresing(String polnoshowresing) {
        this.polnoshowresing = polnoshowresing;
    }

    public String getPolnoshowres() {
        return polnoshowres;
    }

    public void setPolnoshowres(String polnoshowres) {
        this.polnoshowres = polnoshowres;
    }

    public BigDecimal getVlrcafepadrao() {
        return vlrcafepadrao;
    }

    public void setVlrcafepadrao(BigDecimal vlrcafepadrao) {
        this.vlrcafepadrao = vlrcafepadrao;
    }

    public BigInteger getProxnumeronota() {
        return proxnumeronota;
    }

    public void setProxnumeronota(BigInteger proxnumeronota) {
        this.proxnumeronota = proxnumeronota;
    }

    public Character getAceitaresfpool() {
        return aceitaresfpool;
    }

    public void setAceitaresfpool(Character aceitaresfpool) {
        this.aceitaresfpool = aceitaresfpool;
    }

    public Short getTipocontagemcafe() {
        return tipocontagemcafe;
    }

    public void setTipocontagemcafe(Short tipocontagemcafe) {
        this.tipocontagemcafe = tipocontagemcafe;
    }

    public Character getUcemdimediatxoc() {
        return ucemdimediatxoc;
    }

    public void setUcemdimediatxoc(Character ucemdimediatxoc) {
        this.ucemdimediatxoc = ucemdimediatxoc;
    }

    public BigInteger getIdmeiopadrao() {
        return idmeiopadrao;
    }

    public void setIdmeiopadrao(BigInteger idmeiopadrao) {
        this.idmeiopadrao = idmeiopadrao;
    }

    public BigInteger getIdveiculopadrao() {
        return idveiculopadrao;
    }

    public void setIdveiculopadrao(BigInteger idveiculopadrao) {
        this.idveiculopadrao = idveiculopadrao;
    }

    public BigInteger getIdorigempadrao() {
        return idorigempadrao;
    }

    public void setIdorigempadrao(BigInteger idorigempadrao) {
        this.idorigempadrao = idorigempadrao;
    }

    public Character getFlgusaregime() {
        return flgusaregime;
    }

    public void setFlgusaregime(Character flgusaregime) {
        this.flgusaregime = flgusaregime;
    }

    public BigInteger getNotaregesp() {
        return notaregesp;
    }

    public void setNotaregesp(BigInteger notaregesp) {
        this.notaregesp = notaregesp;
    }

    public BigInteger getSeqarquivotrop() {
        return seqarquivotrop;
    }

    public void setSeqarquivotrop(BigInteger seqarquivotrop) {
        this.seqarquivotrop = seqarquivotrop;
    }

    public Character getFlgimpfhmatrix() {
        return flgimpfhmatrix;
    }

    public void setFlgimpfhmatrix(Character flgimpfhmatrix) {
        this.flgimpfhmatrix = flgimpfhmatrix;
    }

    public Character getFlgintegratef() {
        return flgintegratef;
    }

    public void setFlgintegratef(Character flgintegratef) {
        this.flgintegratef = flgintegratef;
    }

    public Character getFlgintegracmnet() {
        return flgintegracmnet;
    }

    public void setFlgintegracmnet(Character flgintegracmnet) {
        this.flgintegracmnet = flgintegracmnet;
    }

    public String getCodpdvfrigobar() {
        return codpdvfrigobar;
    }

    public void setCodpdvfrigobar(String codpdvfrigobar) {
        this.codpdvfrigobar = codpdvfrigobar;
    }

    public BigInteger getIdmotestpdv() {
        return idmotestpdv;
    }

    public void setIdmotestpdv(BigInteger idmotestpdv) {
        this.idmotestpdv = idmotestpdv;
    }

    public Character getCoemtxoc() {
        return coemtxoc;
    }

    public void setCoemtxoc(Character coemtxoc) {
        this.coemtxoc = coemtxoc;
    }

    public Character getUcemtxoc() {
        return ucemtxoc;
    }

    public void setUcemtxoc(Character ucemtxoc) {
        this.ucemtxoc = ucemtxoc;
    }

    public Character getPmemtxoc() {
        return pmemtxoc;
    }

    public void setPmemtxoc(Character pmemtxoc) {
        this.pmemtxoc = pmemtxoc;
    }

    public Character getPmemdimediatxoc() {
        return pmemdimediatxoc;
    }

    public void setPmemdimediatxoc(Character pmemdimediatxoc) {
        this.pmemdimediatxoc = pmemdimediatxoc;
    }

    public BigInteger getIdstatusgovarrum() {
        return idstatusgovarrum;
    }

    public void setIdstatusgovarrum(BigInteger idstatusgovarrum) {
        this.idstatusgovarrum = idstatusgovarrum;
    }

    public BigInteger getIdstatusgovinsp() {
        return idstatusgovinsp;
    }

    public void setIdstatusgovinsp(BigInteger idstatusgovinsp) {
        this.idstatusgovinsp = idstatusgovinsp;
    }

    public BigInteger getIdstatusgovmanut() {
        return idstatusgovmanut;
    }

    public void setIdstatusgovmanut(BigInteger idstatusgovmanut) {
        this.idstatusgovmanut = idstatusgovmanut;
    }

    public String getFlgregimecontab() {
        return flgregimecontab;
    }

    public void setFlgregimecontab(String flgregimecontab) {
        this.flgregimecontab = flgregimecontab;
    }

    public Character getFlglancfrigchecko() {
        return flglancfrigchecko;
    }

    public void setFlglancfrigchecko(Character flglancfrigchecko) {
        this.flglancfrigchecko = flglancfrigchecko;
    }

    public Character getFlgimpextrmatrix() {
        return flgimpextrmatrix;
    }

    public void setFlgimpextrmatrix(Character flgimpextrmatrix) {
        this.flgimpextrmatrix = flgimpextrmatrix;
    }

    public Short getModeloextrato() {
        return modeloextrato;
    }

    public void setModeloextrato(Short modeloextrato) {
        this.modeloextrato = modeloextrato;
    }

    public String getArqdbfintegra() {
        return arqdbfintegra;
    }

    public void setArqdbfintegra(String arqdbfintegra) {
        this.arqdbfintegra = arqdbfintegra;
    }

    public String getWsdllocation() {
        return wsdllocation;
    }

    public void setWsdllocation(String wsdllocation) {
        this.wsdllocation = wsdllocation;
    }

    public Character getFlgusahasar() {
        return flgusahasar;
    }

    public void setFlgusahasar(Character flgusahasar) {
        this.flgusahasar = flgusahasar;
    }

    public BigInteger getModelonfalt() {
        return modelonfalt;
    }

    public void setModelonfalt(BigInteger modelonfalt) {
        this.modelonfalt = modelonfalt;
    }

    public Character getFlgsolicitamoeda() {
        return flgsolicitamoeda;
    }

    public void setFlgsolicitamoeda(Character flgsolicitamoeda) {
        this.flgsolicitamoeda = flgsolicitamoeda;
    }

    public String getAssuntoslip() {
        return assuntoslip;
    }

    public void setAssuntoslip(String assuntoslip) {
        this.assuntoslip = assuntoslip;
    }

    public Character getIntegisentosep() {
        return integisentosep;
    }

    public void setIntegisentosep(Character integisentosep) {
        this.integisentosep = integisentosep;
    }

    public String getCorposlip() {
        return corposlip;
    }

    public void setCorposlip(String corposlip) {
        this.corposlip = corposlip;
    }

    public Character getFlglancimpincl() {
        return flglancimpincl;
    }

    public void setFlglancimpincl(Character flglancimpincl) {
        this.flglancimpincl = flglancimpincl;
    }

    public Character getFlgpedemoedanota() {
        return flgpedemoedanota;
    }

    public void setFlgpedemoedanota(Character flgpedemoedanota) {
        this.flgpedemoedanota = flgpedemoedanota;
    }

    public Character getFlgseparalancpdv() {
        return flgseparalancpdv;
    }

    public void setFlgseparalancpdv(Character flgseparalancpdv) {
        this.flgseparalancpdv = flgseparalancpdv;
    }

    public Character getFlgestimpmoeestr() {
        return flgestimpmoeestr;
    }

    public void setFlgestimpmoeestr(Character flgestimpmoeestr) {
        this.flgestimpmoeestr = flgestimpmoeestr;
    }

    public Character getFlgimpdetpdv() {
        return flgimpdetpdv;
    }

    public void setFlgimpdetpdv(Character flgimpdetpdv) {
        this.flgimpdetpdv = flgimpdetpdv;
    }

    public Character getFlgusaregramodnf() {
        return flgusaregramodnf;
    }

    public void setFlgusaregramodnf(Character flgusaregramodnf) {
        this.flgusaregramodnf = flgusaregramodnf;
    }

    public Character getTipoarredcasadec() {
        return tipoarredcasadec;
    }

    public void setTipoarredcasadec(Character tipoarredcasadec) {
        this.tipoarredcasadec = tipoarredcasadec;
    }

    public Character getRefazhotel() {
        return refazhotel;
    }

    public void setRefazhotel(Character refazhotel) {
        this.refazhotel = refazhotel;
    }

    public Character getTipolimreabconta() {
        return tipolimreabconta;
    }

    public void setTipolimreabconta(Character tipolimreabconta) {
        this.tipolimreabconta = tipolimreabconta;
    }

    public Character getFlgpreenchefnrh() {
        return flgpreenchefnrh;
    }

    public void setFlgpreenchefnrh(Character flgpreenchefnrh) {
        this.flgpreenchefnrh = flgpreenchefnrh;
    }

    public Character getFlgvlrcafeparam() {
        return flgvlrcafeparam;
    }

    public void setFlgvlrcafeparam(Character flgvlrcafeparam) {
        this.flgvlrcafeparam = flgvlrcafeparam;
    }

    public Character getFlgsepalcoolicos() {
        return flgsepalcoolicos;
    }

    public void setFlgsepalcoolicos(Character flgsepalcoolicos) {
        this.flgsepalcoolicos = flgsepalcoolicos;
    }

    public Character getFlgusasenhatelef() {
        return flgusasenhatelef;
    }

    public void setFlgusasenhatelef(Character flgusasenhatelef) {
        this.flgusasenhatelef = flgusasenhatelef;
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

    public Character getFlgslipfaxgrafico() {
        return flgslipfaxgrafico;
    }

    public void setFlgslipfaxgrafico(Character flgslipfaxgrafico) {
        this.flgslipfaxgrafico = flgslipfaxgrafico;
    }

    public Character getTipovercredcli() {
        return tipovercredcli;
    }

    public void setTipovercredcli(Character tipovercredcli) {
        this.tipovercredcli = tipovercredcli;
    }

    public Character getFlgajustacreditos() {
        return flgajustacreditos;
    }

    public void setFlgajustacreditos(Character flgajustacreditos) {
        this.flgajustacreditos = flgajustacreditos;
    }

    public Integer getNumdiascheckcred() {
        return numdiascheckcred;
    }

    public void setNumdiascheckcred(Integer numdiascheckcred) {
        this.numdiascheckcred = numdiascheckcred;
    }

    public String getFlgregcontabimp() {
        return flgregcontabimp;
    }

    public void setFlgregcontabimp(String flgregcontabimp) {
        this.flgregcontabimp = flgregcontabimp;
    }

    public Character getFlgreimprimenota() {
        return flgreimprimenota;
    }

    public void setFlgreimprimenota(Character flgreimprimenota) {
        this.flgreimprimenota = flgreimprimenota;
    }

    public BigInteger getIdtipodcinternbc() {
        return idtipodcinternbc;
    }

    public void setIdtipodcinternbc(BigInteger idtipodcinternbc) {
        this.idtipodcinternbc = idtipodcinternbc;
    }

    public Character getFlgfuncrede() {
        return flgfuncrede;
    }

    public void setFlgfuncrede(Character flgfuncrede) {
        this.flgfuncrede = flgfuncrede;
    }

    public Character getAchperdunicohotel() {
        return achperdunicohotel;
    }

    public void setAchperdunicohotel(Character achperdunicohotel) {
        this.achperdunicohotel = achperdunicohotel;
    }

    public Character getFlgusasubcontadc() {
        return flgusasubcontadc;
    }

    public void setFlgusasubcontadc(Character flgusasubcontadc) {
        this.flgusasubcontadc = flgusasubcontadc;
    }

    public Character getAbrirfichasimples() {
        return abrirfichasimples;
    }

    public void setAbrirfichasimples(Character abrirfichasimples) {
        this.abrirfichasimples = abrirfichasimples;
    }

    public Character getFlgordemcontaav() {
        return flgordemcontaav;
    }

    public void setFlgordemcontaav(Character flgordemcontaav) {
        this.flgordemcontaav = flgordemcontaav;
    }

    public Character getFlgusaproformaemp() {
        return flgusaproformaemp;
    }

    public void setFlgusaproformaemp(Character flgusaproformaemp) {
        this.flgusaproformaemp = flgusaproformaemp;
    }

    public String getAssinaturaslip() {
        return assinaturaslip;
    }

    public void setAssinaturaslip(String assinaturaslip) {
        this.assinaturaslip = assinaturaslip;
    }

    public Character getPartidasimples() {
        return partidasimples;
    }

    public void setPartidasimples(Character partidasimples) {
        this.partidasimples = partidasimples;
    }

    public Short getNumdiasaltuhlimpa() {
        return numdiasaltuhlimpa;
    }

    public void setNumdiasaltuhlimpa(Short numdiasaltuhlimpa) {
        this.numdiasaltuhlimpa = numdiasaltuhlimpa;
    }

    public Character getFlgobrigaempres() {
        return flgobrigaempres;
    }

    public void setFlgobrigaempres(Character flgobrigaempres) {
        this.flgobrigaempres = flgobrigaempres;
    }

    public Character getFlgnumnotamanual() {
        return flgnumnotamanual;
    }

    public void setFlgnumnotamanual(Character flgnumnotamanual) {
        this.flgnumnotamanual = flgnumnotamanual;
    }

    public Character getFlgveriftarifador() {
        return flgveriftarifador;
    }

    public void setFlgveriftarifador(Character flgveriftarifador) {
        this.flgveriftarifador = flgveriftarifador;
    }

    public Character getFlgadcontatonares() {
        return flgadcontatonares;
    }

    public void setFlgadcontatonares(Character flgadcontatonares) {
        this.flgadcontatonares = flgadcontatonares;
    }

    public Short getNummaxmescancnota() {
        return nummaxmescancnota;
    }

    public void setNummaxmescancnota(Short nummaxmescancnota) {
        this.nummaxmescancnota = nummaxmescancnota;
    }

    public Character getFlggeracontaadian() {
        return flggeracontaadian;
    }

    public void setFlggeracontaadian(Character flggeracontaadian) {
        this.flggeracontaadian = flggeracontaadian;
    }

    public Character getFlglancacontapdv() {
        return flglancacontapdv;
    }

    public void setFlglancacontapdv(Character flglancacontapdv) {
        this.flglancacontapdv = flglancacontapdv;
    }

    public Short getNumdiasmudaroupa() {
        return numdiasmudaroupa;
    }

    public void setNumdiasmudaroupa(Short numdiasmudaroupa) {
        this.numdiasmudaroupa = numdiasmudaroupa;
    }

    public Character getFlgobrigaencondia() {
        return flgobrigaencondia;
    }

    public void setFlgobrigaencondia(Character flgobrigaencondia) {
        this.flgobrigaencondia = flgobrigaencondia;
    }

    public String getFlgregcontabcred() {
        return flgregcontabcred;
    }

    public void setFlgregcontabcred(String flgregcontabcred) {
        this.flgregcontabcred = flgregcontabcred;
    }

    public Character getFlgventporparam() {
        return flgventporparam;
    }

    public void setFlgventporparam(Character flgventporparam) {
        this.flgventporparam = flgventporparam;
    }

    public Short getNumdiasdelregoper() {
        return numdiasdelregoper;
    }

    public void setNumdiasdelregoper(Short numdiasdelregoper) {
        this.numdiasdelregoper = numdiasdelregoper;
    }

    public Character getVentilacafeco() {
        return ventilacafeco;
    }

    public void setVentilacafeco(Character ventilacafeco) {
        this.ventilacafeco = ventilacafeco;
    }

    public Character getVentilacafeuc() {
        return ventilacafeuc;
    }

    public void setVentilacafeuc(Character ventilacafeuc) {
        this.ventilacafeuc = ventilacafeuc;
    }

    public BigInteger getCorhospincognito() {
        return corhospincognito;
    }

    public void setCorhospincognito(BigInteger corhospincognito) {
        this.corhospincognito = corhospincognito;
    }

    public Character getFlgtitrelat() {
        return flgtitrelat;
    }

    public void setFlgtitrelat(Character flgtitrelat) {
        this.flgtitrelat = flgtitrelat;
    }

    public Character getFlgvlrpensparam() {
        return flgvlrpensparam;
    }

    public void setFlgvlrpensparam(Character flgvlrpensparam) {
        this.flgvlrpensparam = flgvlrpensparam;
    }

    public Character getFlgventpensparam() {
        return flgventpensparam;
    }

    public void setFlgventpensparam(Character flgventpensparam) {
        this.flgventpensparam = flgventpensparam;
    }

    public Character getEventointegrado() {
        return eventointegrado;
    }

    public void setEventointegrado(Character eventointegrado) {
        this.eventointegrado = eventointegrado;
    }

    public Character getFormrelaudit() {
        return formrelaudit;
    }

    public void setFormrelaudit(Character formrelaudit) {
        this.formrelaudit = formrelaudit;
    }

    public Character getFlgnemitenotazero() {
        return flgnemitenotazero;
    }

    public void setFlgnemitenotazero(Character flgnemitenotazero) {
        this.flgnemitenotazero = flgnemitenotazero;
    }

    public Character getFlgimpcotnanfafat() {
        return flgimpcotnanfafat;
    }

    public void setFlgimpcotnanfafat(Character flgimpcotnanfafat) {
        this.flgimpcotnanfafat = flgimpcotnanfafat;
    }

    public Character getFlgintegraideas() {
        return flgintegraideas;
    }

    public void setFlgintegraideas(Character flgintegraideas) {
        this.flgintegraideas = flgintegraideas;
    }

    public Character getFlgintegfatpropor() {
        return flgintegfatpropor;
    }

    public void setFlgintegfatpropor(Character flgintegfatpropor) {
        this.flgintegfatpropor = flgintegfatpropor;
    }

    public Character getFlgusausuxmoeda() {
        return flgusausuxmoeda;
    }

    public void setFlgusausuxmoeda(Character flgusausuxmoeda) {
        this.flgusausuxmoeda = flgusausuxmoeda;
    }

    public Character getFlgpedenumpagnf() {
        return flgpedenumpagnf;
    }

    public void setFlgpedenumpagnf(Character flgpedenumpagnf) {
        this.flgpedenumpagnf = flgpedenumpagnf;
    }

    public String getHistoricocort() {
        return historicocort;
    }

    public void setHistoricocort(String historicocort) {
        this.historicocort = historicocort;
    }

    public Character getVentilapensaoco() {
        return ventilapensaoco;
    }

    public void setVentilapensaoco(Character ventilapensaoco) {
        this.ventilapensaoco = ventilapensaoco;
    }

    public Character getVentilapensaouc() {
        return ventilapensaouc;
    }

    public void setVentilapensaouc(Character ventilapensaouc) {
        this.ventilapensaouc = ventilapensaouc;
    }

    public Character getFlgcalccomissparc() {
        return flgcalccomissparc;
    }

    public void setFlgcalccomissparc(Character flgcalccomissparc) {
        this.flgcalccomissparc = flgcalccomissparc;
    }

    public BigDecimal getErromaxarredimpha() {
        return erromaxarredimpha;
    }

    public void setErromaxarredimpha(BigDecimal erromaxarredimpha) {
        this.erromaxarredimpha = erromaxarredimpha;
    }

    public String getTiponotacancautoh() {
        return tiponotacancautoh;
    }

    public void setTiponotacancautoh(String tiponotacancautoh) {
        this.tiponotacancautoh = tiponotacancautoh;
    }

    public BigInteger getNumdigitospin() {
        return numdigitospin;
    }

    public void setNumdigitospin(BigInteger numdigitospin) {
        this.numdigitospin = numdigitospin;
    }

    public Character getEvitadirecdicli() {
        return evitadirecdicli;
    }

    public void setEvitadirecdicli(Character evitadirecdicli) {
        this.evitadirecdicli = evitadirecdicli;
    }

    public Character getFlgusacontrmp() {
        return flgusacontrmp;
    }

    public void setFlgusacontrmp(Character flgusacontrmp) {
        this.flgusacontrmp = flgusacontrmp;
    }

    public Character getFlgpedemodelonf() {
        return flgpedemodelonf;
    }

    public void setFlgpedemodelonf(Character flgpedemodelonf) {
        this.flgpedemodelonf = flgpedemodelonf;
    }

    public Short getMinparconsger() {
        return minparconsger;
    }

    public void setMinparconsger(Short minparconsger) {
        this.minparconsger = minparconsger;
    }

    public Character getLancimpenccta() {
        return lancimpenccta;
    }

    public void setLancimpenccta(Character lancimpenccta) {
        this.lancimpenccta = lancimpenccta;
    }

    public Character getFlgbloqcredhosp() {
        return flgbloqcredhosp;
    }

    public void setFlgbloqcredhosp(Character flgbloqcredhosp) {
        this.flgbloqcredhosp = flgbloqcredhosp;
    }

    public Character getFlgbloqcredclie() {
        return flgbloqcredclie;
    }

    public void setFlgbloqcredclie(Character flgbloqcredclie) {
        this.flgbloqcredclie = flgbloqcredclie;
    }

    public Character getLancarsecdinoshow() {
        return lancarsecdinoshow;
    }

    public void setLancarsecdinoshow(Character lancarsecdinoshow) {
        this.lancarsecdinoshow = lancarsecdinoshow;
    }

    public Character getIntegracartconsumo() {
        return integracartconsumo;
    }

    public void setIntegracartconsumo(Character integracartconsumo) {
        this.integracartconsumo = integracartconsumo;
    }

    public String getCabecalhoslipcanc() {
        return cabecalhoslipcanc;
    }

    public void setCabecalhoslipcanc(String cabecalhoslipcanc) {
        this.cabecalhoslipcanc = cabecalhoslipcanc;
    }

    public String getRodapeslipcanc() {
        return rodapeslipcanc;
    }

    public void setRodapeslipcanc(String rodapeslipcanc) {
        this.rodapeslipcanc = rodapeslipcanc;
    }

    public String getAssuntoslipcanc() {
        return assuntoslipcanc;
    }

    public void setAssuntoslipcanc(String assuntoslipcanc) {
        this.assuntoslipcanc = assuntoslipcanc;
    }

    public String getCorposlipcanc() {
        return corposlipcanc;
    }

    public void setCorposlipcanc(String corposlipcanc) {
        this.corposlipcanc = corposlipcanc;
    }

    public String getAssinaturaslipcan() {
        return assinaturaslipcan;
    }

    public void setAssinaturaslipcan(String assinaturaslipcan) {
        this.assinaturaslipcan = assinaturaslipcan;
    }

    public Short getModeloslipcanc() {
        return modeloslipcanc;
    }

    public void setModeloslipcanc(Short modeloslipcanc) {
        this.modeloslipcanc = modeloslipcanc;
    }

    public String getDircoverpagecanc() {
        return dircoverpagecanc;
    }

    public void setDircoverpagecanc(String dircoverpagecanc) {
        this.dircoverpagecanc = dircoverpagecanc;
    }

    public Character getFlgslipfxgrfcanc() {
        return flgslipfxgrfcanc;
    }

    public void setFlgslipfxgrfcanc(Character flgslipfxgrfcanc) {
        this.flgslipfxgrfcanc = flgslipfxgrfcanc;
    }

    public String getAssslipcanc() {
        return assslipcanc;
    }

    public void setAssslipcanc(String assslipcanc) {
        this.assslipcanc = assslipcanc;
    }

    public Character getFlginfmetiqueta() {
        return flginfmetiqueta;
    }

    public void setFlginfmetiqueta(Character flginfmetiqueta) {
        this.flginfmetiqueta = flginfmetiqueta;
    }

    public Character getFlgcontabrecpdv() {
        return flgcontabrecpdv;
    }

    public void setFlgcontabrecpdv(Character flgcontabrecpdv) {
        this.flgcontabrecpdv = flgcontabrecpdv;
    }

    public Character getFlgimpcupomenota() {
        return flgimpcupomenota;
    }

    public void setFlgimpcupomenota(Character flgimpcupomenota) {
        this.flgimpcupomenota = flgimpcupomenota;
    }

    public BigInteger getNdiasbaixacper() {
        return ndiasbaixacper;
    }

    public void setNdiasbaixacper(BigInteger ndiasbaixacper) {
        this.ndiasbaixacper = ndiasbaixacper;
    }

    public Character getFlgagregimposto() {
        return flgagregimposto;
    }

    public void setFlgagregimposto(Character flgagregimposto) {
        this.flgagregimposto = flgagregimposto;
    }

    public Character getFlgdesdirlimcred() {
        return flgdesdirlimcred;
    }

    public void setFlgdesdirlimcred(Character flgdesdirlimcred) {
        this.flgdesdirlimcred = flgdesdirlimcred;
    }

    public BigInteger getCorearlycheckin() {
        return corearlycheckin;
    }

    public void setCorearlycheckin(BigInteger corearlycheckin) {
        this.corearlycheckin = corearlycheckin;
    }

    public BigInteger getCorlatecheckout() {
        return corlatecheckout;
    }

    public void setCorlatecheckout(BigInteger corlatecheckout) {
        this.corlatecheckout = corlatecheckout;
    }

    public Character getFlgpercancissger() {
        return flgpercancissger;
    }

    public void setFlgpercancissger(Character flgpercancissger) {
        this.flgpercancissger = flgpercancissger;
    }

    public Character getFlgmsglimcredexc() {
        return flgmsglimcredexc;
    }

    public void setFlgmsglimcredexc(Character flgmsglimcredexc) {
        this.flgmsglimcredexc = flgmsglimcredexc;
    }

    public Character getFlgmoenfmoecred() {
        return flgmoenfmoecred;
    }

    public void setFlgmoenfmoecred(Character flgmoenfmoecred) {
        this.flgmoenfmoecred = flgmoenfmoecred;
    }

    public Character getFlgtirapoolprop() {
        return flgtirapoolprop;
    }

    public void setFlgtirapoolprop(Character flgtirapoolprop) {
        this.flgtirapoolprop = flgtirapoolprop;
    }

    public String getEndwebservice() {
        return endwebservice;
    }

    public void setEndwebservice(String endwebservice) {
        this.endwebservice = endwebservice;
    }

    public String getChavewebservice() {
        return chavewebservice;
    }

    public void setChavewebservice(String chavewebservice) {
        this.chavewebservice = chavewebservice;
    }

    public String getCodunidhotel() {
        return codunidhotel;
    }

    public void setCodunidhotel(String codunidhotel) {
        this.codunidhotel = codunidhotel;
    }

    public String getNumestabelec() {
        return numestabelec;
    }

    public void setNumestabelec(String numestabelec) {
        this.numestabelec = numestabelec;
    }

    public Character getFlgagrupalancap() {
        return flgagrupalancap;
    }

    public void setFlgagrupalancap(Character flgagrupalancap) {
        this.flgagrupalancap = flgagrupalancap;
    }

    public Character getFlgepsonpf300() {
        return flgepsonpf300;
    }

    public void setFlgepsonpf300(Character flgepsonpf300) {
        this.flgepsonpf300 = flgepsonpf300;
    }

    public Character getFlgsolicitapascart() {
        return flgsolicitapascart;
    }

    public void setFlgsolicitapascart(Character flgsolicitapascart) {
        this.flgsolicitapascart = flgsolicitapascart;
    }

    public String getFlgintsihot() {
        return flgintsihot;
    }

    public void setFlgintsihot(String flgintsihot) {
        this.flgintsihot = flgintsihot;
    }

    public String getSihotcod() {
        return sihotcod;
    }

    public void setSihotcod(String sihotcod) {
        this.sihotcod = sihotcod;
    }

    public String getPathsihot() {
        return pathsihot;
    }

    public void setPathsihot(String pathsihot) {
        this.pathsihot = pathsihot;
    }

    public Character getFlgsubtothasar() {
        return flgsubtothasar;
    }

    public void setFlgsubtothasar(Character flgsubtothasar) {
        this.flgsubtothasar = flgsubtothasar;
    }

    public Character getFlgmostraerro() {
        return flgmostraerro;
    }

    public void setFlgmostraerro(Character flgmostraerro) {
        this.flgmostraerro = flgmostraerro;
    }

    public String getUserpousada() {
        return userpousada;
    }

    public void setUserpousada(String userpousada) {
        this.userpousada = userpousada;
    }

    public String getPasspousada() {
        return passpousada;
    }

    public void setPasspousada(String passpousada) {
        this.passpousada = passpousada;
    }

    public Character getFlgdiacheckin() {
        return flgdiacheckin;
    }

    public void setFlgdiacheckin(Character flgdiacheckin) {
        this.flgdiacheckin = flgdiacheckin;
    }

    public Character getFlgreqcheckin() {
        return flgreqcheckin;
    }

    public void setFlgreqcheckin(Character flgreqcheckin) {
        this.flgreqcheckin = flgreqcheckin;
    }

    public String getFlgformregcontab() {
        return flgformregcontab;
    }

    public void setFlgformregcontab(String flgformregcontab) {
        this.flgformregcontab = flgformregcontab;
    }

    public Character getFlgintegfisflex() {
        return flgintegfisflex;
    }

    public void setFlgintegfisflex(Character flgintegfisflex) {
        this.flgintegfisflex = flgintegfisflex;
    }

    public Character getFlgsavearqflex() {
        return flgsavearqflex;
    }

    public void setFlgsavearqflex(Character flgsavearqflex) {
        this.flgsavearqflex = flgsavearqflex;
    }

    public BigInteger getIdmodelodocflex() {
        return idmodelodocflex;
    }

    public void setIdmodelodocflex(BigInteger idmodelodocflex) {
        this.idmodelodocflex = idmodelodocflex;
    }

    public String getCodsituacaoflex() {
        return codsituacaoflex;
    }

    public void setCodsituacaoflex(String codsituacaoflex) {
        this.codsituacaoflex = codsituacaoflex;
    }

    public String getCodsitunotacanc() {
        return codsitunotacanc;
    }

    public void setCodsitunotacanc(String codsitunotacanc) {
        this.codsitunotacanc = codsitunotacanc;
    }

    public Character getFlgintegicmsflex() {
        return flgintegicmsflex;
    }

    public void setFlgintegicmsflex(Character flgintegicmsflex) {
        this.flgintegicmsflex = flgintegicmsflex;
    }

    public BigInteger getIdmodelodocicmsflex() {
        return idmodelodocicmsflex;
    }

    public void setIdmodelodocicmsflex(BigInteger idmodelodocicmsflex) {
        this.idmodelodocicmsflex = idmodelodocicmsflex;
    }

    public String getCodsituacaoicmsflex() {
        return codsituacaoicmsflex;
    }

    public void setCodsituacaoicmsflex(String codsituacaoicmsflex) {
        this.codsituacaoicmsflex = codsituacaoicmsflex;
    }

    public String getCodsitunotacancicms() {
        return codsitunotacancicms;
    }

    public void setCodsitunotacancicms(String codsitunotacancicms) {
        this.codsitunotacancicms = codsitunotacancicms;
    }

    public Character getFlgintegissflex() {
        return flgintegissflex;
    }

    public void setFlgintegissflex(Character flgintegissflex) {
        this.flgintegissflex = flgintegissflex;
    }

    public Character getRegconfconta() {
        return regconfconta;
    }

    public void setRegconfconta(Character regconfconta) {
        this.regconfconta = regconfconta;
    }

    public Character getRegcontaaberta() {
        return regcontaaberta;
    }

    public void setRegcontaaberta(Character regcontaaberta) {
        this.regcontaaberta = regcontaaberta;
    }

    public Character getRegtransfconta() {
        return regtransfconta;
    }

    public void setRegtransfconta(Character regtransfconta) {
        this.regtransfconta = regtransfconta;
    }

    public Character getRegmeiospgto() {
        return regmeiospgto;
    }

    public void setRegmeiospgto(Character regmeiospgto) {
        this.regmeiospgto = regmeiospgto;
    }

    public Character getRegcomprovtef() {
        return regcomprovtef;
    }

    public void setRegcomprovtef(Character regcomprovtef) {
        this.regcomprovtef = regcomprovtef;
    }

    public Character getRegregistrovenda() {
        return regregistrovenda;
    }

    public void setRegregistrovenda(Character regregistrovenda) {
        this.regregistrovenda = regregistrovenda;
    }

    public Character getRegidentpaf() {
        return regidentpaf;
    }

    public void setRegidentpaf(Character regidentpaf) {
        this.regidentpaf = regidentpaf;
    }

    public String getMd5full() {
        return md5full;
    }

    public void setMd5full(String md5full) {
        this.md5full = md5full;
    }

    public Character getRegpdvtercpaf() {
        return regpdvtercpaf;
    }

    public void setRegpdvtercpaf(Character regpdvtercpaf) {
        this.regpdvtercpaf = regpdvtercpaf;
    }

    public Character getFlgintegrapafecf() {
        return flgintegrapafecf;
    }

    public void setFlgintegrapafecf(Character flgintegrapafecf) {
        this.flgintegrapafecf = flgintegrapafecf;
    }

    public Character getTotalizadorrecebuh() {
        return totalizadorrecebuh;
    }

    public void setTotalizadorrecebuh(Character totalizadorrecebuh) {
        this.totalizadorrecebuh = totalizadorrecebuh;
    }

    public String getPathsihotfim() {
        return pathsihotfim;
    }

    public void setPathsihotfim(String pathsihotfim) {
        this.pathsihotfim = pathsihotfim;
    }

    public BigDecimal getNumdiasdelarqanexo() {
        return numdiasdelarqanexo;
    }

    public void setNumdiasdelarqanexo(BigDecimal numdiasdelarqanexo) {
        this.numdiasdelarqanexo = numdiasdelarqanexo;
    }

    public Character getLanccupomdesccmn() {
        return lanccupomdesccmn;
    }

    public void setLanccupomdesccmn(Character lanccupomdesccmn) {
        this.lanccupomdesccmn = lanccupomdesccmn;
    }

    public Character getFlgemitirnfe() {
        return flgemitirnfe;
    }

    public void setFlgemitirnfe(Character flgemitirnfe) {
        this.flgemitirnfe = flgemitirnfe;
    }

    public BigInteger getIdmodelodocnfeflex() {
        return idmodelodocnfeflex;
    }

    public void setIdmodelodocnfeflex(BigInteger idmodelodocnfeflex) {
        this.idmodelodocnfeflex = idmodelodocnfeflex;
    }

    public Integer getQtdresconf() {
        return qtdresconf;
    }

    public void setQtdresconf(Integer qtdresconf) {
        this.qtdresconf = qtdresconf;
    }

    public Integer getNumnoiteresconf() {
        return numnoiteresconf;
    }

    public void setNumnoiteresconf(Integer numnoiteresconf) {
        this.numnoiteresconf = numnoiteresconf;
    }

    public BigInteger getIdmoddocnfeserv() {
        return idmoddocnfeserv;
    }

    public void setIdmoddocnfeserv(BigInteger idmoddocnfeserv) {
        this.idmoddocnfeserv = idmoddocnfeserv;
    }

    public Character getFlgemitirnfeserv() {
        return flgemitirnfeserv;
    }

    public void setFlgemitirnfeserv(Character flgemitirnfeserv) {
        this.flgemitirnfeserv = flgemitirnfeserv;
    }

    public Character getFlgaltdadospart() {
        return flgaltdadospart;
    }

    public void setFlgaltdadospart(Character flgaltdadospart) {
        this.flgaltdadospart = flgaltdadospart;
    }

    public String getVersaosistema() {
        return versaosistema;
    }

    public void setVersaosistema(String versaosistema) {
        this.versaosistema = versaosistema;
    }

    public BigInteger getIdmodelocupomfiscal() {
        return idmodelocupomfiscal;
    }

    public void setIdmodelocupomfiscal(BigInteger idmodelocupomfiscal) {
        this.idmodelocupomfiscal = idmodelocupomfiscal;
    }

    public Character getFlgobrigorigemsegmento() {
        return flgobrigorigemsegmento;
    }

    public void setFlgobrigorigemsegmento(Character flgobrigorigemsegmento) {
        this.flgobrigorigemsegmento = flgobrigorigemsegmento;
    }

    public Character getFlgseparaporaliquota() {
        return flgseparaporaliquota;
    }

    public void setFlgseparaporaliquota(Character flgseparaporaliquota) {
        this.flgseparaporaliquota = flgseparaporaliquota;
    }

    public Character getFlgimpnotacnpjend() {
        return flgimpnotacnpjend;
    }

    public void setFlgimpnotacnpjend(Character flgimpnotacnpjend) {
        this.flgimpnotacnpjend = flgimpnotacnpjend;
    }

/*    public Character getFlgncsemlanc() {
        return flgncsemlanc;
    }

    public void setFlgncsemlanc(Character flgncsemlanc) {
        this.flgncsemlanc = flgncsemlanc;
    }*/

    public Character getValidounf() {
        return validounf;
    }

    public void setValidounf(Character validounf) {
        this.validounf = validounf;
    }

    public Character getFlgnaoaltdiares() {
        return flgnaoaltdiares;
    }

    public void setFlgnaoaltdiares(Character flgnaoaltdiares) {
        this.flgnaoaltdiares = flgnaoaltdiares;
    }

    public Character getFlgpertipouhallot() {
        return flgpertipouhallot;
    }

    public void setFlgpertipouhallot(Character flgpertipouhallot) {
        this.flgpertipouhallot = flgpertipouhallot;
    }

    public Character getFlgfaturaeletronica() {
        return flgfaturaeletronica;
    }

    public void setFlgfaturaeletronica(Character flgfaturaeletronica) {
        this.flgfaturaeletronica = flgfaturaeletronica;
    }

    public Short getPassoorcamres() {
        return passoorcamres;
    }

    public void setPassoorcamres(Short passoorcamres) {
        this.passoorcamres = passoorcamres;
    }

    public String getCaminhoarquivopolicia() {
        return caminhoarquivopolicia;
    }

    public void setCaminhoarquivopolicia(String caminhoarquivopolicia) {
        this.caminhoarquivopolicia = caminhoarquivopolicia;
    }

    public String getCodigopoliciarede() {
        return codigopoliciarede;
    }

    public void setCodigopoliciarede(String codigopoliciarede) {
        this.codigopoliciarede = codigopoliciarede;
    }

    public String getCodigopoliciahotel() {
        return codigopoliciahotel;
    }

    public void setCodigopoliciahotel(String codigopoliciahotel) {
        this.codigopoliciahotel = codigopoliciahotel;
    }

    public Character getFlgflexf100() {
        return flgflexf100;
    }

    public void setFlgflexf100(Character flgflexf100) {
        this.flgflexf100 = flgflexf100;
    }

    public Character getFlgabatedesdcflex() {
        return flgabatedesdcflex;
    }

    public void setFlgabatedesdcflex(Character flgabatedesdcflex) {
        this.flgabatedesdcflex = flgabatedesdcflex;
    }

    public Character getFlgverificafichatxturismo() {
        return flgverificafichatxturismo;
    }

    public void setFlgverificafichatxturismo(Character flgverificafichatxturismo) {
        this.flgverificafichatxturismo = flgverificafichatxturismo;
    }

    public Character getFlgcontrseriexmodnf() {
        return flgcontrseriexmodnf;
    }

    public void setFlgcontrseriexmodnf(Character flgcontrseriexmodnf) {
        this.flgcontrseriexmodnf = flgcontrseriexmodnf;
    }

    public String getCodpais() {
        return codpais;
    }

    public void setCodpais(String codpais) {
        this.codpais = codpais;
    }

    public Character getFlgbreakdowntodascontas() {
        return flgbreakdowntodascontas;
    }

    public void setFlgbreakdowntodascontas(Character flgbreakdowntodascontas) {
        this.flgbreakdowntodascontas = flgbreakdowntodascontas;
    }

    public Character getFlgsugeretarifa() {
        return flgsugeretarifa;
    }

    public void setFlgsugeretarifa(Character flgsugeretarifa) {
        this.flgsugeretarifa = flgsugeretarifa;
    }

    public Character getFlgcontlancporcxcp() {
        return flgcontlancporcxcp;
    }

    public void setFlgcontlancporcxcp(Character flgcontlancporcxcp) {
        this.flgcontlancporcxcp = flgcontlancporcxcp;
    }

    public String getRegparamconfig() {
        return regparamconfig;
    }

    public void setRegparamconfig(String regparamconfig) {
        this.regparamconfig = regparamconfig;
    }

    public Character getFlgajustaextras() {
        return flgajustaextras;
    }

    public void setFlgajustaextras(Character flgajustaextras) {
        this.flgajustaextras = flgajustaextras;
    }

    public String getCabecalhoslipalt() {
        return cabecalhoslipalt;
    }

    public void setCabecalhoslipalt(String cabecalhoslipalt) {
        this.cabecalhoslipalt = cabecalhoslipalt;
    }

    public String getRodapeslipalt() {
        return rodapeslipalt;
    }

    public void setRodapeslipalt(String rodapeslipalt) {
        this.rodapeslipalt = rodapeslipalt;
    }

    public String getAssuntoslipalt() {
        return assuntoslipalt;
    }

    public void setAssuntoslipalt(String assuntoslipalt) {
        this.assuntoslipalt = assuntoslipalt;
    }

    public String getCorposlipalt() {
        return corposlipalt;
    }

    public void setCorposlipalt(String corposlipalt) {
        this.corposlipalt = corposlipalt;
    }

    public String getAssinaturaslipalt() {
        return assinaturaslipalt;
    }

    public void setAssinaturaslipalt(String assinaturaslipalt) {
        this.assinaturaslipalt = assinaturaslipalt;
    }

    public BigInteger getModeloslipalt() {
        return modeloslipalt;
    }

    public void setModeloslipalt(BigInteger modeloslipalt) {
        this.modeloslipalt = modeloslipalt;
    }

    public String getDircoverpagealt() {
        return dircoverpagealt;
    }

    public void setDircoverpagealt(String dircoverpagealt) {
        this.dircoverpagealt = dircoverpagealt;
    }

    public Character getFlgslipfxgrfalt() {
        return flgslipfxgrfalt;
    }

    public void setFlgslipfxgrfalt(Character flgslipfxgrfalt) {
        this.flgslipfxgrfalt = flgslipfxgrfalt;
    }

    public String getAssslipalt() {
        return assslipalt;
    }

    public void setAssslipalt(String assslipalt) {
        this.assslipalt = assslipalt;
    }

    public Character getFlglancdiariacontrperm() {
        return flglancdiariacontrperm;
    }

    public void setFlglancdiariacontrperm(Character flglancdiariacontrperm) {
        this.flglancdiariacontrperm = flglancdiariacontrperm;
    }

    public String getTipoextrato() {
        return tipoextrato;
    }

    public void setTipoextrato(String tipoextrato) {
        this.tipoextrato = tipoextrato;
    }

    public String getSerieextrato() {
        return serieextrato;
    }

    public void setSerieextrato(String serieextrato) {
        this.serieextrato = serieextrato;
    }

    public Character getFlggravlogdiaria() {
        return flggravlogdiaria;
    }

    public void setFlggravlogdiaria(Character flggravlogdiaria) {
        this.flggravlogdiaria = flggravlogdiaria;
    }

    public Character getFlggravlogventcafe() {
        return flggravlogventcafe;
    }

    public void setFlggravlogventcafe(Character flggravlogventcafe) {
        this.flggravlogventcafe = flggravlogventcafe;
    }

   /* public Character getFlgintegraoutrosistema() {
        return flgintegraoutrosistema;
    }

    public void setFlgintegraoutrosistema(Character flgintegraoutrosistema) {
        this.flgintegraoutrosistema = flgintegraoutrosistema;
    }
*/
   /* public Character getFlgorcmanual() {
        return flgorcmanual;
    }

    public void setFlgorcmanual(Character flgorcmanual) {
        this.flgorcmanual = flgorcmanual;
    }*/

  /*  public Character getFlgsepararclienteposto() {
        return flgsepararclienteposto;
    }

    public void setFlgsepararclienteposto(Character flgsepararclienteposto) {
        this.flgsepararclienteposto = flgsepararclienteposto;
    }
*/
  /*  public Character getFlgbloqbtnrepetirreserva() {
        return flgbloqbtnrepetirreserva;
    }*/

    /*public void setFlgbloqbtnrepetirreserva(Character flgbloqbtnrepetirreserva) {
        this.flgbloqbtnrepetirreserva = flgbloqbtnrepetirreserva;
    }
*/
/*    public BigInteger getIniciofimdesemana() {
        return iniciofimdesemana;
    }

    public void setIniciofimdesemana(BigInteger iniciofimdesemana) {
        this.iniciofimdesemana = iniciofimdesemana;
    }
*/

    public Meioscomunicacao getIdmeiocomunicacao() {
        return idmeiocomunicacao;
    }

    public void setIdmeiocomunicacao(Meioscomunicacao idmeiocomunicacao) {
        this.idmeiocomunicacao = idmeiocomunicacao;
    }


    public Tipohospede getTipohospede() {
        return tipohospede;
    }

    public void setTipohospede(Tipohospede tipohospede) {
        this.tipohospede = tipohospede;
    }


    public Tipohospede getTipohospede1() {
        return tipohospede1;
    }

    public void setTipohospede1(Tipohospede tipohospede1) {
        this.tipohospede1 = tipohospede1;
    }

  
  
    public Tipohospede getTipohospede2() {
        return tipohospede2;
    }

    public void setTipohospede2(Tipohospede tipohospede2) {
        this.tipohospede2 = tipohospede2;
    }

    public Moeda getMoedanacional() {
        return moedanacional;
    }

    public void setMoedanacional(Moeda moedanacional) {
        this.moedanacional = moedanacional;
    }

  
    public Clientepess getIdvaletur() {
        return idvaletur;
    }

    public void setIdvaletur(Clientepess idvaletur) {
        this.idvaletur = idvaletur;
    }

  
    public Meioscomunicacao getIdmeiocentres() {
        return idmeiocentres;
    }

    public void setIdmeiocentres(Meioscomunicacao idmeiocentres) {
        this.idmeiocentres = idmeiocentres;
    }

   
    public Docconfirmahotel getIddoccentres() {
        return iddoccentres;
    }

    public void setIddoccentres(Docconfirmahotel iddoccentres) {
        this.iddoccentres = iddoccentres;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }

   
    public Moeda getMoedadolar() {
        return moedadolar;
    }

    public void setMoedadolar(Moeda moedadolar) {
        this.moedadolar = moedadolar;
    }

    public Motivosfront getIdmotivoestimp() {
        return idmotivoestimp;
    }

    public void setIdmotivoestimp(Motivosfront idmotivoestimp) {
        this.idmotivoestimp = idmotivoestimp;
    }

   
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }


    public Veiculoscomunica getIdveiculoscentres() {
        return idveiculoscentres;
    }

    public void setIdveiculoscentres(Veiculoscomunica idveiculoscentres) {
        this.idveiculoscentres = idveiculoscentres;
    }


    public Moeda getMoedacafe() {
        return moedacafe;
    }

    public void setMoedacafe(Moeda moedacafe) {
        this.moedacafe = moedacafe;
    }


    public Veiculoscomunica getIdveicpadraogrp() {
        return idveicpadraogrp;
    }

    public void setIdveicpadraogrp(Veiculoscomunica idveicpadraogrp) {
        this.idveicpadraogrp = idveicpadraogrp;
    }

   
    public Motivosfront getIdmotivoestcort() {
        return idmotivoestcort;
    }

    public void setIdmotivoestcort(Motivosfront idmotivoestcort) {
        this.idmotivoestcort = idmotivoestcort;
    }

    public Segmento getSegmento1() {
        return segmento1;
    }

    public void setSegmento1(Segmento segmento1) {
        this.segmento1 = segmento1;
    }

    
    public Usuariosistema getIdusuariopdv() {
        return idusuariopdv;
    }

    public void setIdusuariopdv(Usuariosistema idusuariopdv) {
        this.idusuariopdv = idusuariopdv;
    }

  
    public Contasfront getIdcontapensao() {
        return idcontapensao;
    }

    public void setIdcontapensao(Contasfront idcontapensao) {
        this.idcontapensao = idcontapensao;
    }

   
    public Segmento getSegmento2() {
        return segmento2;
    }

    public void setSegmento2(Segmento segmento2) {
        this.segmento2 = segmento2;
    }

   
    public Origemreserva getIdorigem() {
        return idorigem;
    }

    public void setIdorigem(Origemreserva idorigem) {
        this.idorigem = idorigem;
    }

   
    public Veiculoscomunica getIdveiculos() {
        return idveiculos;
    }

    public void setIdveiculos(Veiculoscomunica idveiculos) {
        this.idveiculos = idveiculos;
    }

   
    public Contasfront getIdcontapacote() {
        return idcontapacote;
    }

    public void setIdcontapacote(Contasfront idcontapacote) {
        this.idcontapacote = idcontapacote;
    }

    public Contasfront getIdcontaregime() {
        return idcontaregime;
    }

    public void setIdcontaregime(Contasfront idcontaregime) {
        this.idcontaregime = idcontaregime;
    }

    public Meioscomunicacao getIdmeiopadraogrupo() {
        return idmeiopadraogrupo;
    }

    public void setIdmeiopadraogrupo(Meioscomunicacao idmeiopadraogrupo) {
        this.idmeiopadraogrupo = idmeiopadraogrupo;
    }



    public Origemreserva getIdorigemcentres() {
        return idorigemcentres;
    }

    public void setIdorigemcentres(Origemreserva idorigemcentres) {
        this.idorigemcentres = idorigemcentres;
    }


    public Origemreserva getIdorigempadraogrp() {
        return idorigempadraogrp;
    }

    public void setIdorigempadraogrp(Origemreserva idorigempadraogrp) {
        this.idorigempadraogrp = idorigempadraogrp;
    }

    public Contasfront getIdcontaall() {
        return idcontaall;
    }

    public void setIdcontaall(Contasfront idcontaall) {
        this.idcontaall = idcontaall;
    }


    public Motivosfront getIdmotivocentres() {
        return idmotivocentres;
    }

    public void setIdmotivocentres(Motivosfront idmotivocentres) {
        this.idmotivocentres = idmotivocentres;
    }

   
    public Motivosfront getIdmotpdrdescctr() {
        return idmotpdrdescctr;
    }

    public void setIdmotpdrdescctr(Motivosfront idmotpdrdescctr) {
        this.idmotpdrdescctr = idmotpdrdescctr;
    }

    public Usuariosistema getIdusuariocmnet() {
        return idusuariocmnet;
    }

    public void setIdusuariocmnet(Usuariosistema idusuariocmnet) {
        this.idusuariocmnet = idusuariocmnet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhotel != null ? idhotel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paramhotel)) {
            return false;
        }
        Paramhotel other = (Paramhotel) object;
        if ((this.idhotel == null && other.idhotel != null) || (this.idhotel != null && !this.idhotel.equals(other.idhotel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Paramhotel[ idhotel=" + idhotel + " ]";
    }
    
}

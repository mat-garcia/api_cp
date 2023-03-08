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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "CONTASFRONT")
@XmlRootElement
public class Contasfront implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDCONTA", nullable = false, precision = 22)
    private Long idconta;
    @Column(name = "TIPOCONTA")
    private Character tipoconta;
    @Column(name = "DESIGNACAO", length = 60)
    private String designacao;
    @Column(name = "DATAABERTURA")
    @Temporal(TemporalType.DATE)
    private Date dataabertura;
    @Column(name = "HORAABERTURA")
    @Temporal(TemporalType.DATE)
    private Date horaabertura;
    @Column(name = "FORMAPAGT")
    private Character formapagt;
    @Column(name = "CARTAOCREDITO", length = 20)
    private String cartaocredito;
    @Column(name = "DATAVALIDACARTAO", length = 6)
    private String datavalidacartao;
    @Column(name = "LIMITECREDITO", precision = 17, scale = 2)
    private BigDecimal limitecredito;
    @Column(name = "OBSERVACOES", length = 200)
    private String observacoes;
    @Column(name = "DATAENCPREVISTO")
    @Temporal(TemporalType.DATE)
    private Date dataencprevisto;
    @Column(name = "HORAENCPREVISTO")
    @Temporal(TemporalType.DATE)
    private Date horaencprevisto;
    @Column(name = "DATAENCREAL")
    @Temporal(TemporalType.DATE)
    private Date dataencreal;
    @Column(name = "HORAENCREAL")
    @Temporal(TemporalType.DATE)
    private Date horaencreal;
    @Column(name = "NUMCUPOMFISCAL", length = 6)
    private String numcupomfiscal;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "DATAULTENCPARC")
    @Temporal(TemporalType.DATE)
    private Date dataultencparc;
    @Column(name = "NUMSERIALECF", length = 25)
    private String numserialecf;
    @Column(name = "FLGESTRECEITAS")
    private Character flgestreceitas;
    @Column(name = "DATAHORAECF")
    @Temporal(TemporalType.DATE)
    private Date datahoraecf;
    @Column(name = "NUMEXTRATOCAIXAECF", length = 10)
    private String numextratocaixaecf;
    @Column(name = "NUMEXTRATOCOOECF", length = 10)
    private String numextratocooecf;
    @Column(name = "FLGIMPRIMIUEXTRATO")
    private Character flgimprimiuextrato;
    @Column(name = "NUMEXTRATOECF", length = 10)
    private String numextratoecf;
  /*  @Column(name = "FLGVENDABALCAO")
    private Character flgvendabalcao;*/
    @OneToMany(mappedBy = "idcontaorigemnc")
    private List<Contasfront> contasfrontList;
    @JoinColumn(name = "IDCONTAORIGEMNC", referencedColumnName = "IDCONTA")
    @ManyToOne
    private Contasfront idcontaorigemnc;
    @JoinColumns({
        @JoinColumn(name = "IDFORCLI", referencedColumnName = "IDFORCLI", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "CODCONTRATO", referencedColumnName = "CODCONTRATO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Contrclihotel contrclihotel;
    @JoinColumn(name = "IDHOSPEDE", referencedColumnName = "IDHOSPEDE")
    @ManyToOne
    private Hospede idhospede;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false)
    @ManyToOne(optional = false)
    private Hotel idhotel;
    @JoinColumn(name = "IDORIGEM", referencedColumnName = "IDORIGEM")
    @ManyToOne
    private Origemreserva idorigem;
    @JoinColumn(name = "IDPASSANTE", referencedColumnName = "IDPESSOA")
    @ManyToOne
    private Pessoa idpassante;
    @JoinColumns({
        @JoinColumn(name = "CODSEGMENTO", referencedColumnName = "CODSEGMENTO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Segmento segmento;
    @JoinColumn(name = "IDRESERVASFRONT", referencedColumnName = "IDRESERVASFRONT")
    @ManyToOne
    private Reservasfront idreservasfront;
    @OneToMany(mappedBy = "idcontapensao")
    private List<Paramhotel> paramhotelList;
    @OneToMany(mappedBy = "idcontapacote")
    private List<Paramhotel> paramhotelList1;
    @OneToMany(mappedBy = "idcontaregime")
    private List<Paramhotel> paramhotelList2;
    @OneToMany(mappedBy = "idcontaall")
    private List<Paramhotel> paramhotelList3;
   
    public Contasfront() {
    }

    public Contasfront(Long idconta) {
        this.idconta = idconta;
    }

    public Long getIdconta() {
        return idconta;
    }

    public void setIdconta(Long idconta) {
        this.idconta = idconta;
    }

    public Character getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(Character tipoconta) {
        this.tipoconta = tipoconta;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public Date getDataabertura() {
        return dataabertura;
    }

    public void setDataabertura(Date dataabertura) {
        this.dataabertura = dataabertura;
    }

    public Date getHoraabertura() {
        return horaabertura;
    }

    public void setHoraabertura(Date horaabertura) {
        this.horaabertura = horaabertura;
    }

    public Character getFormapagt() {
        return formapagt;
    }

    public void setFormapagt(Character formapagt) {
        this.formapagt = formapagt;
    }

    public String getCartaocredito() {
        return cartaocredito;
    }

    public void setCartaocredito(String cartaocredito) {
        this.cartaocredito = cartaocredito;
    }

    public String getDatavalidacartao() {
        return datavalidacartao;
    }

    public void setDatavalidacartao(String datavalidacartao) {
        this.datavalidacartao = datavalidacartao;
    }

    public BigDecimal getLimitecredito() {
        return limitecredito;
    }

    public void setLimitecredito(BigDecimal limitecredito) {
        this.limitecredito = limitecredito;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getDataencprevisto() {
        return dataencprevisto;
    }

    public void setDataencprevisto(Date dataencprevisto) {
        this.dataencprevisto = dataencprevisto;
    }

    public Date getHoraencprevisto() {
        return horaencprevisto;
    }

    public void setHoraencprevisto(Date horaencprevisto) {
        this.horaencprevisto = horaencprevisto;
    }

    public Date getDataencreal() {
        return dataencreal;
    }

    public void setDataencreal(Date dataencreal) {
        this.dataencreal = dataencreal;
    }

    public Date getHoraencreal() {
        return horaencreal;
    }

    public void setHoraencreal(Date horaencreal) {
        this.horaencreal = horaencreal;
    }

    public String getNumcupomfiscal() {
        return numcupomfiscal;
    }

    public void setNumcupomfiscal(String numcupomfiscal) {
        this.numcupomfiscal = numcupomfiscal;
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

    public Date getDataultencparc() {
        return dataultencparc;
    }

    public void setDataultencparc(Date dataultencparc) {
        this.dataultencparc = dataultencparc;
    }

    public String getNumserialecf() {
        return numserialecf;
    }

    public void setNumserialecf(String numserialecf) {
        this.numserialecf = numserialecf;
    }

    public Character getFlgestreceitas() {
        return flgestreceitas;
    }

    public void setFlgestreceitas(Character flgestreceitas) {
        this.flgestreceitas = flgestreceitas;
    }

    public Date getDatahoraecf() {
        return datahoraecf;
    }

    public void setDatahoraecf(Date datahoraecf) {
        this.datahoraecf = datahoraecf;
    }

    public String getNumextratocaixaecf() {
        return numextratocaixaecf;
    }

    public void setNumextratocaixaecf(String numextratocaixaecf) {
        this.numextratocaixaecf = numextratocaixaecf;
    }

    public String getNumextratocooecf() {
        return numextratocooecf;
    }

    public void setNumextratocooecf(String numextratocooecf) {
        this.numextratocooecf = numextratocooecf;
    }

    public Character getFlgimprimiuextrato() {
        return flgimprimiuextrato;
    }

    public void setFlgimprimiuextrato(Character flgimprimiuextrato) {
        this.flgimprimiuextrato = flgimprimiuextrato;
    }

    public String getNumextratoecf() {
        return numextratoecf;
    }

    public void setNumextratoecf(String numextratoecf) {
        this.numextratoecf = numextratoecf;
    }

   /* public Character getFlgvendabalcao() {
        return flgvendabalcao;
    }

    public void setFlgvendabalcao(Character flgvendabalcao) {
        this.flgvendabalcao = flgvendabalcao;
    }*/

   
    @XmlTransient
    public List<Contasfront> getContasfrontList() {
        return contasfrontList;
    }

    public void setContasfrontList(List<Contasfront> contasfrontList) {
        this.contasfrontList = contasfrontList;
    }

    public Contasfront getIdcontaorigemnc() {
        return idcontaorigemnc;
    }

    public void setIdcontaorigemnc(Contasfront idcontaorigemnc) {
        this.idcontaorigemnc = idcontaorigemnc;
    }

    public Contrclihotel getContrclihotel() {
        return contrclihotel;
    }

    public void setContrclihotel(Contrclihotel contrclihotel) {
        this.contrclihotel = contrclihotel;
    }

    
    public Hospede getIdhospede() {
        return idhospede;
    }

    public void setIdhospede(Hospede idhospede) {
        this.idhospede = idhospede;
    }

    public Hotel getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(Hotel idhotel) {
        this.idhotel = idhotel;
    }

   
    public Origemreserva getIdorigem() {
        return idorigem;
    }

    public void setIdorigem(Origemreserva idorigem) {
        this.idorigem = idorigem;
    }

    public Pessoa getIdpassante() {
        return idpassante;
    }

    public void setIdpassante(Pessoa idpassante) {
        this.idpassante = idpassante;
    }

   
    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }

    public Reservasfront getIdreservasfront() {
        return idreservasfront;
    }

    public void setIdreservasfront(Reservasfront idreservasfront) {
        this.idreservasfront = idreservasfront;
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
        int hash = 0;
        hash += (idconta != null ? idconta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contasfront)) {
            return false;
        }
        Contasfront other = (Contasfront) object;
        if ((this.idconta == null && other.idconta != null) || (this.idconta != null && !this.idconta.equals(other.idconta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Contasfront[ idconta=" + idconta + " ]";
    }
    
}

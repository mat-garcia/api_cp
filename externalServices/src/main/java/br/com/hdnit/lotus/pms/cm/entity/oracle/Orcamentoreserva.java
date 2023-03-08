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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "ORCAMENTORESERVA")
@XmlRootElement
public class Orcamentoreserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrcamentoreservaPK orcamentoreservaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR", precision = 17, scale = 2)
    private BigDecimal valor;
    @Column(name = "SIGLAMOEDA", length = 10)
    private String siglamoeda;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "CODPENSAO")
    private Character codpensao;
    @Column(name = "VALORTARIFA")
    private BigInteger valortarifa;
    @Column(name = "VALORMANUAL")
    private BigInteger valormanual;
    @Column(name = "PERCDESCONTO")
    private BigInteger percdesconto;
    @Column(name = "MSGLOG", length = 50)
    private String msglog;
    @Column(name = "VALORDIFDIARIA", precision = 17, scale = 2)
    private BigDecimal valordifdiaria;
    @Column(name = "VALORCAFE", precision = 17, scale = 2)
    private BigDecimal valorcafe;
    @Column(name = "VALORPENSAO", precision = 17, scale = 2)
    private BigDecimal valorpensao;
    @JoinColumn(name = "MOECODIGO", referencedColumnName = "MOECODIGO")
    @ManyToOne
    private Moeda moecodigo;
    @JoinColumn(name = "IDORIGEM", referencedColumnName = "IDORIGEM")
    @ManyToOne
    private Origemreserva idorigem;
    @JoinColumn(name = "IDRESERVASFRONT", referencedColumnName = "IDRESERVASFRONT", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Reservasfront reservasfront;
    @JoinColumns({
        @JoinColumn(name = "CODSEGMENTO", referencedColumnName = "CODSEGMENTO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne
    private Segmento segmento;
    @JoinColumns({
        @JoinColumn(name = "IDTARIFA", referencedColumnName = "IDTARIFA", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)})
    @ManyToOne
    private Tarifahotel tarifahotel;

    public Orcamentoreserva() {
    }

    public Orcamentoreserva(OrcamentoreservaPK orcamentoreservaPK) {
        this.orcamentoreservaPK = orcamentoreservaPK;
    }

    public Orcamentoreserva(BigInteger idreservasfront, Date data) {
        this.orcamentoreservaPK = new OrcamentoreservaPK(idreservasfront, data);
    }

    public OrcamentoreservaPK getOrcamentoreservaPK() {
        return orcamentoreservaPK;
    }

    public void setOrcamentoreservaPK(OrcamentoreservaPK orcamentoreservaPK) {
        this.orcamentoreservaPK = orcamentoreservaPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getSiglamoeda() {
        return siglamoeda;
    }

    public void setSiglamoeda(String siglamoeda) {
        this.siglamoeda = siglamoeda;
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

    public Character getCodpensao() {
        return codpensao;
    }

    public void setCodpensao(Character codpensao) {
        this.codpensao = codpensao;
    }

    public BigInteger getValortarifa() {
        return valortarifa;
    }

    public void setValortarifa(BigInteger valortarifa) {
        this.valortarifa = valortarifa;
    }

    public BigInteger getValormanual() {
        return valormanual;
    }

    public void setValormanual(BigInteger valormanual) {
        this.valormanual = valormanual;
    }

    public BigInteger getPercdesconto() {
        return percdesconto;
    }

    public void setPercdesconto(BigInteger percdesconto) {
        this.percdesconto = percdesconto;
    }

    public String getMsglog() {
        return msglog;
    }

    public void setMsglog(String msglog) {
        this.msglog = msglog;
    }

    public BigDecimal getValordifdiaria() {
        return valordifdiaria;
    }

    public void setValordifdiaria(BigDecimal valordifdiaria) {
        this.valordifdiaria = valordifdiaria;
    }

    public BigDecimal getValorcafe() {
        return valorcafe;
    }

    public void setValorcafe(BigDecimal valorcafe) {
        this.valorcafe = valorcafe;
    }

    public BigDecimal getValorpensao() {
        return valorpensao;
    }

    public void setValorpensao(BigDecimal valorpensao) {
        this.valorpensao = valorpensao;
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

   
    public Reservasfront getReservasfront() {
        return reservasfront;
    }

    public void setReservasfront(Reservasfront reservasfront) {
        this.reservasfront = reservasfront;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
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
        hash += (orcamentoreservaPK != null ? orcamentoreservaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orcamentoreserva)) {
            return false;
        }
        Orcamentoreserva other = (Orcamentoreserva) object;
        if ((this.orcamentoreservaPK == null && other.orcamentoreservaPK != null) || (this.orcamentoreservaPK != null && !this.orcamentoreservaPK.equals(other.orcamentoreservaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Orcamentoreserva[ orcamentoreservaPK=" + orcamentoreservaPK + " ]";
    }
    
}

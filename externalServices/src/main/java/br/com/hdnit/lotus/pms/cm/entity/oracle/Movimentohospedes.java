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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "MOVIMENTOHOSPEDES")
@XmlRootElement
public class Movimentohospedes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MovimentohospedesPK movimentohospedesPK;
    @Column(name = "INCOGNITO")
    private Character incognito;
    @Basic(optional = false)
    @Column(name = "DATACHEGPREVISTA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datachegprevista;
    @Column(name = "HORACHEGPREVISTA")
    @Temporal(TemporalType.DATE)
    private Date horachegprevista;
    @Basic(optional = false)
    @Column(name = "DATAPARTPREVISTA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datapartprevista;
    @Column(name = "HORAPARTPREVISTA")
    @Temporal(TemporalType.DATE)
    private Date horapartprevista;
    @Column(name = "DATACHEGREAL")
    @Temporal(TemporalType.DATE)
    private Date datachegreal;
    @Column(name = "HORACHEGREAL")
    @Temporal(TemporalType.DATE)
    private Date horachegreal;
    @Column(name = "DATAPARTREAL")
    @Temporal(TemporalType.DATE)
    private Date datapartreal;
    @Column(name = "HORAPARTREAL")
    @Temporal(TemporalType.DATE)
    private Date horapartreal;
    @Column(name = "USODACASA")
    private Character usodacasa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PERCDIARIA", precision = 7, scale = 3)
    private BigDecimal percdiaria;
    @Column(name = "DIARIACONFIDENCIA")
    private Character diariaconfidencia;
    @Column(name = "NUMFICHANACIONAL", length = 10)
    private String numfichanacional;
    @Column(name = "COFRE")
    private Character cofre;
    @Column(name = "DATAULTLANDIARIA")
    @Temporal(TemporalType.DATE)
    private Date dataultlandiaria;
    @Column(name = "DATALANCDIFDIARIA")
    @Temporal(TemporalType.DATE)
    private Date datalancdifdiaria;
    @Column(name = "PRINCIPAL")
    private Character principal;
    @Column(name = "PIN", length = 20)
    private String pin;
    @Column(name = "PASSWORD", length = 20)
    private String password;
    @Column(name = "SENHATELEFONIA", length = 6)
    private String senhatelefonia;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "CARTAOFIDELIDADE", length = 20)
    private String cartaofidelidade;
    @Column(name = "BOXVEICULO", length = 10)
    private String boxveiculo;
    @Column(name = "MENORIDADE")
    private Character menoridade;
    @Column(name = "CODIGOFNRH", length = 60)
    private String codigofnrh;
    @Column(name = "FNRHCHECKIN")
    private Character fnrhcheckin;
    @Column(name = "FNRHCHECKOUT")
    private Character fnrhcheckout;
    @Column(name = "FLGHOSPMESCLADO")
    private Short flghospmesclado;
    @JoinColumn(name = "IDHOSPEDE", referencedColumnName = "IDHOSPEDE", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hospede hospede;
    @JoinColumn(name = "IDRESPONSAVEL", referencedColumnName = "IDPESSOA")
    @ManyToOne
    private Pessoa idresponsavel;
    @JoinColumn(name = "IDRESERVASFRONT", referencedColumnName = "IDRESERVASFRONT", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Reservasfront reservasfront;
    @JoinColumns({
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false),
        @JoinColumn(name = "IDTIPOHOSPEDE", referencedColumnName = "IDTIPOHOSPEDE")})
    @ManyToOne(optional = false)
    private Tipohospede tipohospede;
    @JoinColumn(name = "USERCHECKOUT", referencedColumnName = "IDUSUARIO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Usuariosistema usercheckout;
    @JoinColumn(name = "USERCHECKIN", referencedColumnName = "IDUSUARIO")
    @ManyToOne(fetch=FetchType.LAZY)
    private Usuariosistema usercheckin;

    public Movimentohospedes() {
    }

    public Movimentohospedes(MovimentohospedesPK movimentohospedesPK) {
        this.movimentohospedesPK = movimentohospedesPK;
    }

    public Movimentohospedes(MovimentohospedesPK movimentohospedesPK, Date datachegprevista, Date datapartprevista) {
        this.movimentohospedesPK = movimentohospedesPK;
        this.datachegprevista = datachegprevista;
        this.datapartprevista = datapartprevista;
    }

    public Movimentohospedes(BigInteger idreservasfront, BigInteger idhospede) {
        this.movimentohospedesPK = new MovimentohospedesPK(idreservasfront, idhospede);
    }

    public MovimentohospedesPK getMovimentohospedesPK() {
        return movimentohospedesPK;
    }

    public void setMovimentohospedesPK(MovimentohospedesPK movimentohospedesPK) {
        this.movimentohospedesPK = movimentohospedesPK;
    }

    public Character getIncognito() {
        return incognito;
    }

    public void setIncognito(Character incognito) {
        this.incognito = incognito;
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

    public Date getDatachegreal() {
        return datachegreal;
    }

    public void setDatachegreal(Date datachegreal) {
        this.datachegreal = datachegreal;
    }

    public Date getHorachegreal() {
        return horachegreal;
    }

    public void setHorachegreal(Date horachegreal) {
        this.horachegreal = horachegreal;
    }

    public Date getDatapartreal() {
        return datapartreal;
    }

    public void setDatapartreal(Date datapartreal) {
        this.datapartreal = datapartreal;
    }

    public Date getHorapartreal() {
        return horapartreal;
    }

    public void setHorapartreal(Date horapartreal) {
        this.horapartreal = horapartreal;
    }

    public Character getUsodacasa() {
        return usodacasa;
    }

    public void setUsodacasa(Character usodacasa) {
        this.usodacasa = usodacasa;
    }

    public BigDecimal getPercdiaria() {
        return percdiaria;
    }

    public void setPercdiaria(BigDecimal percdiaria) {
        this.percdiaria = percdiaria;
    }

    public Character getDiariaconfidencia() {
        return diariaconfidencia;
    }

    public void setDiariaconfidencia(Character diariaconfidencia) {
        this.diariaconfidencia = diariaconfidencia;
    }

    public String getNumfichanacional() {
        return numfichanacional;
    }

    public void setNumfichanacional(String numfichanacional) {
        this.numfichanacional = numfichanacional;
    }

    public Character getCofre() {
        return cofre;
    }

    public void setCofre(Character cofre) {
        this.cofre = cofre;
    }

    public Date getDataultlandiaria() {
        return dataultlandiaria;
    }

    public void setDataultlandiaria(Date dataultlandiaria) {
        this.dataultlandiaria = dataultlandiaria;
    }

    public Date getDatalancdifdiaria() {
        return datalancdifdiaria;
    }

    public void setDatalancdifdiaria(Date datalancdifdiaria) {
        this.datalancdifdiaria = datalancdifdiaria;
    }

    public Character getPrincipal() {
        return principal;
    }

    public void setPrincipal(Character principal) {
        this.principal = principal;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSenhatelefonia() {
        return senhatelefonia;
    }

    public void setSenhatelefonia(String senhatelefonia) {
        this.senhatelefonia = senhatelefonia;
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

    public String getCartaofidelidade() {
        return cartaofidelidade;
    }

    public void setCartaofidelidade(String cartaofidelidade) {
        this.cartaofidelidade = cartaofidelidade;
    }

    public String getBoxveiculo() {
        return boxveiculo;
    }

    public void setBoxveiculo(String boxveiculo) {
        this.boxveiculo = boxveiculo;
    }

    public Character getMenoridade() {
        return menoridade;
    }

    public void setMenoridade(Character menoridade) {
        this.menoridade = menoridade;
    }

    public String getCodigofnrh() {
        return codigofnrh;
    }

    public void setCodigofnrh(String codigofnrh) {
        this.codigofnrh = codigofnrh;
    }

    public Character getFnrhcheckin() {
        return fnrhcheckin;
    }

    public void setFnrhcheckin(Character fnrhcheckin) {
        this.fnrhcheckin = fnrhcheckin;
    }

    public Character getFnrhcheckout() {
        return fnrhcheckout;
    }

    public void setFnrhcheckout(Character fnrhcheckout) {
        this.fnrhcheckout = fnrhcheckout;
    }

    public Short getFlghospmesclado() {
        return flghospmesclado;
    }

    public void setFlghospmesclado(Short flghospmesclado) {
        this.flghospmesclado = flghospmesclado;
    }

   
    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Pessoa getIdresponsavel() {
        return idresponsavel;
    }

    public void setIdresponsavel(Pessoa idresponsavel) {
        this.idresponsavel = idresponsavel;
    }

    public Reservasfront getReservasfront() {
        return reservasfront;
    }

    public void setReservasfront(Reservasfront reservasfront) {
        this.reservasfront = reservasfront;
    }

    public Tipohospede getTipohospede() {
        return tipohospede;
    }

    public void setTipohospede(Tipohospede tipohospede) {
        this.tipohospede = tipohospede;
    }

    public Usuariosistema getUsercheckout() {
        return usercheckout;
    }

    public void setUsercheckout(Usuariosistema usercheckout) {
        this.usercheckout = usercheckout;
    }

    public Usuariosistema getUsercheckin() {
        return usercheckin;
    }

    public void setUsercheckin(Usuariosistema usercheckin) {
        this.usercheckin = usercheckin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movimentohospedesPK != null ? movimentohospedesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimentohospedes)) {
            return false;
        }
        Movimentohospedes other = (Movimentohospedes) object;
        if ((this.movimentohospedesPK == null && other.movimentohospedesPK != null) || (this.movimentohospedesPK != null && !this.movimentohospedesPK.equals(other.movimentohospedesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Movimentohospedes[ movimentohospedesPK=" + movimentohospedesPK + " ]";
    }
    
}

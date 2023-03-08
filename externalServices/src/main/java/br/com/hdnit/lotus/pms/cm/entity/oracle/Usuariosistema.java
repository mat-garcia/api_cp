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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "USUARIOSISTEMA", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMEUSUARIO"})})
@XmlRootElement
public class Usuariosistema implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDUSUARIO", nullable = false, precision = 22)
    private Long idusuario;
    @Basic(optional = false)
    @Column(name = "NOMEUSUARIO", nullable = false, length = 20)
    private String nomeusuario;
    @Basic(optional = false)
    @Column(name = "SENHA", nullable = false, length = 15)
    private String senha;
    @Column(name = "FLGAUSENTE")
    private Character flgausente;
    @Column(name = "SENHAAUTORIZ", length = 15)
    private String senhaautoriz;
    @Column(name = "MUDARSENHA")
    private Character mudarsenha;
    @Column(name = "SENHAPERMANENTE")
    private Character senhapermanente;
    @Column(name = "NAOMUDASENHA")
    private Character naomudasenha;
    @Column(name = "VALIDADESENHA")
    @Temporal(TemporalType.DATE)
    private Date validadesenha;
    @Column(name = "DESCRICAO", length = 40)
    private String descricao;
    @Column(name = "BLOQUEADO")
    private Character bloqueado;
    @Column(name = "DESATIVADO")
    private Character desativado;
    @Column(name = "FLGDISPFINANC")
    private Character flgdispfinanc;
    @Column(name = "SENHATRANSF", length = 255)
    private String senhatransf;
    @Column(name = "TMRVERIFICAEMAIL")
    private Short tmrverificaemail;
    @Column(name = "FLGTIPOVEREMAIL")
    private Character flgtipoveremail;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "FIR", length = 4000)
    private String fir;
    @Column(name = "DATAULTSENHA")
    @Temporal(TemporalType.DATE)
    private Date dataultsenha;
    @Column(name = "TEMPOTRAVA")
    private Integer tempotrava;
    @Column(name = "IDUSUORIGEM")
    private BigInteger idusuorigem;
   /* @OneToMany(mappedBy = "idusualteracao")
    private List<Reservasfront> reservasfrontList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Reservasfront> reservasfrontList1;
    @OneToMany(mappedBy = "idusuariopdv")
    private List<Paramhotel> paramhotelList;
    @OneToMany(mappedBy = "idusuariocmnet")
    private List<Paramhotel> paramhotelList1;
   */ @JoinColumn(name = "IDUSUARIO", referencedColumnName = "IDPESSOA", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false, fetch=FetchType.LAZY)
    private Pessoa pessoa;
    
    public Usuariosistema() {
    }

    public Usuariosistema(Long idusuario) {
        this.idusuario = idusuario;
    }

    public Usuariosistema(Long idusuario, String nomeusuario, String senha) {
        this.idusuario = idusuario;
        this.nomeusuario = nomeusuario;
        this.senha = senha;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Character getFlgausente() {
        return flgausente;
    }

    public void setFlgausente(Character flgausente) {
        this.flgausente = flgausente;
    }

    public String getSenhaautoriz() {
        return senhaautoriz;
    }

    public void setSenhaautoriz(String senhaautoriz) {
        this.senhaautoriz = senhaautoriz;
    }

    public Character getMudarsenha() {
        return mudarsenha;
    }

    public void setMudarsenha(Character mudarsenha) {
        this.mudarsenha = mudarsenha;
    }

    public Character getSenhapermanente() {
        return senhapermanente;
    }

    public void setSenhapermanente(Character senhapermanente) {
        this.senhapermanente = senhapermanente;
    }

    public Character getNaomudasenha() {
        return naomudasenha;
    }

    public void setNaomudasenha(Character naomudasenha) {
        this.naomudasenha = naomudasenha;
    }

    public Date getValidadesenha() {
        return validadesenha;
    }

    public void setValidadesenha(Date validadesenha) {
        this.validadesenha = validadesenha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Character getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Character bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Character getDesativado() {
        return desativado;
    }

    public void setDesativado(Character desativado) {
        this.desativado = desativado;
    }

    public Character getFlgdispfinanc() {
        return flgdispfinanc;
    }

    public void setFlgdispfinanc(Character flgdispfinanc) {
        this.flgdispfinanc = flgdispfinanc;
    }

    public String getSenhatransf() {
        return senhatransf;
    }

    public void setSenhatransf(String senhatransf) {
        this.senhatransf = senhatransf;
    }

    public Short getTmrverificaemail() {
        return tmrverificaemail;
    }

    public void setTmrverificaemail(Short tmrverificaemail) {
        this.tmrverificaemail = tmrverificaemail;
    }

    public Character getFlgtipoveremail() {
        return flgtipoveremail;
    }

    public void setFlgtipoveremail(Character flgtipoveremail) {
        this.flgtipoveremail = flgtipoveremail;
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

    public String getFir() {
        return fir;
    }

    public void setFir(String fir) {
        this.fir = fir;
    }

    public Date getDataultsenha() {
        return dataultsenha;
    }

    public void setDataultsenha(Date dataultsenha) {
        this.dataultsenha = dataultsenha;
    }

    public Integer getTempotrava() {
        return tempotrava;
    }

    public void setTempotrava(Integer tempotrava) {
        this.tempotrava = tempotrava;
    }

    public BigInteger getIdusuorigem() {
        return idusuorigem;
    }

    public void setIdusuorigem(BigInteger idusuorigem) {
        this.idusuorigem = idusuorigem;
    }

   
   /* @XmlTransient
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
    }*/

   
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

   
   
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idusuario == null) ? 0 : idusuario.hashCode());
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
		Usuariosistema other = (Usuariosistema) obj;
		if (idusuario == null) {
			if (other.idusuario != null)
				return false;
		} else if (!idusuario.equals(other.idusuario))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Usuariosistema[ idusuario=" + idusuario + " ]";
    }
  
    

    @Transient
    public String getLabel() {
        return  this.getNomeusuario();
    }
}

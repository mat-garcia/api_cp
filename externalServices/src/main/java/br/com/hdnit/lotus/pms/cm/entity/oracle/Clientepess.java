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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "CLIENTEPESS")
@XmlRootElement
public class Clientepess implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDPESSOA", nullable = false, precision = 22)
    private Long idpessoa;
    @Column(name = "CODCLIENTE", length = 10)
    private String codcliente;
    @Column(name = "NUMEROCARTAO", length = 16)
    private String numerocartao;
    @Column(name = "BLOQUEIO")
    private Character bloqueio;
    @Column(name = "CODCMNET", length = 10)
    private String codcmnet;
    @Column(name = "RATEACCESS", length = 10)
    private String rateaccess;
    @Column(name = "DUNSIATA", length = 25)
    private String dunsiata;
    @Column(name = "SCNUMBER", length = 25)
    private String scnumber;
    @Column(name = "SCCCODE")
    private Long scccode;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "OBSGERAL", length = 3000)
    private String obsgeral;
    @Column(name = "FLGREQUERAPROVA")
    private Character flgrequeraprova;
    @OneToMany(mappedBy = "clientereservante", fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList;
    @OneToMany(mappedBy = "clientehospede", fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList1;
    @OneToMany(mappedBy = "idvaletur", fetch=FetchType.LAZY)
    private List<Paramhotel> paramhotelList;
    @OneToMany(mappedBy = "idforcliafaturar", fetch=FetchType.LAZY)
    private List<Contrclihotel> contrclihotelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientepess", fetch=FetchType.LAZY)
    private List<Contrclihotel> contrclihotelList1;
    @OneToMany(mappedBy = "idposto", fetch=FetchType.LAZY)
    private List<Contrclihotel> contrclihotelList2;
    @OneToMany(mappedBy = "idpessoa", fetch=FetchType.LAZY)
    private List<Origemreserva> origemreservaList;
    @JoinColumn(name = "IDPESSOA", referencedColumnName = "IDPESSOA", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false,fetch=FetchType.LAZY)
    private Pessoa pessoa;
   
    public Clientepess() {
    }

    public Clientepess(Long idpessoa) {
        this.idpessoa = idpessoa;
    }

    public Long getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Long idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public String getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(String numerocartao) {
        this.numerocartao = numerocartao;
    }

    public Character getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(Character bloqueio) {
        this.bloqueio = bloqueio;
    }

    public String getCodcmnet() {
        return codcmnet;
    }

    public void setCodcmnet(String codcmnet) {
        this.codcmnet = codcmnet;
    }

    public String getRateaccess() {
        return rateaccess;
    }

    public void setRateaccess(String rateaccess) {
        this.rateaccess = rateaccess;
    }

    public String getDunsiata() {
        return dunsiata;
    }

    public void setDunsiata(String dunsiata) {
        this.dunsiata = dunsiata;
    }

    public String getScnumber() {
        return scnumber;
    }

    public void setScnumber(String scnumber) {
        this.scnumber = scnumber;
    }

    public Long getScccode() {
        return scccode;
    }

    public void setScccode(Long scccode) {
        this.scccode = scccode;
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

    public String getObsgeral() {
        return obsgeral;
    }

    public void setObsgeral(String obsgeral) {
        this.obsgeral = obsgeral;
    }

    public Character getFlgrequeraprova() {
        return flgrequeraprova;
    }

    public void setFlgrequeraprova(Character flgrequeraprova) {
        this.flgrequeraprova = flgrequeraprova;
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
    @OneToMany(mappedBy = "idvaletur", fetch=FetchType.LAZY)
    public List<Paramhotel> getParamhotelList() {
        return paramhotelList;
    }

    public void setParamhotelList(List<Paramhotel> paramhotelList) {
        this.paramhotelList = paramhotelList;
    }

    @XmlTransient
    public List<Contrclihotel> getContrclihotelList() {
        return contrclihotelList;
    }

    public void setContrclihotelList(List<Contrclihotel> contrclihotelList) {
        this.contrclihotelList = contrclihotelList;
    }

    @XmlTransient
    public List<Contrclihotel> getContrclihotelList1() {
        return contrclihotelList1;
    }

    public void setContrclihotelList1(List<Contrclihotel> contrclihotelList1) {
        this.contrclihotelList1 = contrclihotelList1;
    }

    @XmlTransient
    public List<Contrclihotel> getContrclihotelList2() {
        return contrclihotelList2;
    }

    public void setContrclihotelList2(List<Contrclihotel> contrclihotelList2) {
        this.contrclihotelList2 = contrclihotelList2;
    }

   
    @XmlTransient
    public List<Origemreserva> getOrigemreservaList() {
        return origemreservaList;
    }

    public void setOrigemreservaList(List<Origemreserva> origemreservaList) {
        this.origemreservaList = origemreservaList;
    }

  
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
		result = prime * result + ((idpessoa == null) ? 0 : idpessoa.hashCode());
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
		Clientepess other = (Clientepess) obj;
		if (idpessoa == null) {
			if (other.idpessoa != null)
				return false;
		} else if (!idpessoa.equals(other.idpessoa))
			return false;
		return true;
	}

    
    @Transient
    public String getLabel() {
        return this.getPessoa().getNome();
    }
}

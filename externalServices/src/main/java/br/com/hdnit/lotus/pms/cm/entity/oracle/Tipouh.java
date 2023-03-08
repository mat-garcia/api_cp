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
@Table(name = "TIPOUH")
@XmlRootElement
public class Tipouh implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TipouhPK tipouhPK;
    @Column(name = "DESCRICAO", length = 60)
    private String descricao;
    @Column(name = "CODREDUZIDO", length = 4)
    private String codreduzido;
    @Column(name = "QTDREAL")
    private Integer qtdreal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PERCOVERGERAL", precision = 6, scale = 2)
    private BigDecimal percovergeral;
    @Column(name = "ORDEMDISP")
    private BigInteger ordemdisp;
    @Column(name = "QTDMAXPESSOAS")
    private Integer qtdmaxpessoas;
    @Column(name = "FRACAODISTALUGUEL")
    private BigInteger fracaodistaluguel;
    @Column(name = "COMENTARIO", length = 1000)
    private String comentario;
    @Column(name = "COMENTARIOING", length = 1000)
    private String comentarioing;
    @Column(name = "QTDOVERGERAL")
    private Integer qtdovergeral;
    @Column(name = "CODTIPOCMNET", length = 3)
    private String codtipocmnet;
    @Basic(optional = false)
    @Column(name = "FLGAPARECENADISP", nullable = false)
    private Character flgaparecenadisp;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "VLRALUGUELFIXO", precision = 17, scale = 2)
    private BigDecimal vlraluguelfixo;
    @Column(name = "QTDMAXADT")
    private Integer qtdmaxadt;
    @Column(name = "QTDMAXCRI")
    private Integer qtdmaxcri;
    @Column(name = "FLGATIVA")
    private Character flgativa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipouh",fetch=FetchType.LAZY)
    private List<Reservasfront> reservasfrontList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipouh1",fetch=FetchType.LAZY )
    private List<Reservasfront> reservasfrontList1;
    @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hotel hotel;
   
    public Tipouh() {
    }

    public Tipouh(TipouhPK tipouhPK) {
        this.tipouhPK = tipouhPK;
    }

    public Tipouh(TipouhPK tipouhPK, Character flgaparecenadisp) {
        this.tipouhPK = tipouhPK;
        this.flgaparecenadisp = flgaparecenadisp;
    }

    public Tipouh(BigInteger idtipouh, BigInteger idhotel) {
        this.tipouhPK = new TipouhPK(idtipouh, idhotel);
    }

    public TipouhPK getTipouhPK() {
        return tipouhPK;
    }

    public void setTipouhPK(TipouhPK tipouhPK) {
        this.tipouhPK = tipouhPK;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodreduzido() {
        return codreduzido;
    }

    public void setCodreduzido(String codreduzido) {
        this.codreduzido = codreduzido;
    }

    public Integer getQtdreal() {
        return qtdreal;
    }

    public void setQtdreal(Integer qtdreal) {
        this.qtdreal = qtdreal;
    }

    public BigDecimal getPercovergeral() {
        return percovergeral;
    }

    public void setPercovergeral(BigDecimal percovergeral) {
        this.percovergeral = percovergeral;
    }

    public BigInteger getOrdemdisp() {
        return ordemdisp;
    }

    public void setOrdemdisp(BigInteger ordemdisp) {
        this.ordemdisp = ordemdisp;
    }

    public Integer getQtdmaxpessoas() {
        return qtdmaxpessoas;
    }

    public void setQtdmaxpessoas(Integer qtdmaxpessoas) {
        this.qtdmaxpessoas = qtdmaxpessoas;
    }

    public BigInteger getFracaodistaluguel() {
        return fracaodistaluguel;
    }

    public void setFracaodistaluguel(BigInteger fracaodistaluguel) {
        this.fracaodistaluguel = fracaodistaluguel;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComentarioing() {
        return comentarioing;
    }

    public void setComentarioing(String comentarioing) {
        this.comentarioing = comentarioing;
    }

    public Integer getQtdovergeral() {
        return qtdovergeral;
    }

    public void setQtdovergeral(Integer qtdovergeral) {
        this.qtdovergeral = qtdovergeral;
    }

    public String getCodtipocmnet() {
        return codtipocmnet;
    }

    public void setCodtipocmnet(String codtipocmnet) {
        this.codtipocmnet = codtipocmnet;
    }

    public Character getFlgaparecenadisp() {
        return flgaparecenadisp;
    }

    public void setFlgaparecenadisp(Character flgaparecenadisp) {
        this.flgaparecenadisp = flgaparecenadisp;
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

    public BigDecimal getVlraluguelfixo() {
        return vlraluguelfixo;
    }

    public void setVlraluguelfixo(BigDecimal vlraluguelfixo) {
        this.vlraluguelfixo = vlraluguelfixo;
    }

    public Integer getQtdmaxadt() {
        return qtdmaxadt;
    }

    public void setQtdmaxadt(Integer qtdmaxadt) {
        this.qtdmaxadt = qtdmaxadt;
    }

    public Integer getQtdmaxcri() {
        return qtdmaxcri;
    }

    public void setQtdmaxcri(Integer qtdmaxcri) {
        this.qtdmaxcri = qtdmaxcri;
    }

    public Character getFlgativa() {
        return flgativa;
    }

    public void setFlgativa(Character flgativa) {
        this.flgativa = flgativa;
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

  
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

  
  
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipouhPK == null) ? 0 : tipouhPK.hashCode());
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
		Tipouh other = (Tipouh) obj;
		if (tipouhPK == null) {
			if (other.tipouhPK != null)
				return false;
		} else if (!tipouhPK.equals(other.tipouhPK))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Tipouh[ tipouhPK=" + tipouhPK + " ]";
    }
    
    @Transient
    public String getLabel() {
        return this.getDescricao();
    }
    
}

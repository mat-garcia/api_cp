/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "TRATAMENTO")
@XmlRootElement
public class Tratamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODTRATAMENTO", nullable = false, length = 20)
    private String codtratamento;
    @Column(name = "DESCRICAO", length = 60)
    private String descricao;
   /* @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;*/
   /* @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;*/
    @Column(name = "FLGATIVO", length = 1)
    private Character flgativo;
    @OneToMany(mappedBy = "codtratamento",fetch=FetchType.LAZY)
    private List<Hospede> hospedeList;
    
    public Tratamento() {
    }

    public Tratamento(String codtratamento) {
        this.codtratamento = codtratamento;
    }

    public String getCodtratamento() {
        return codtratamento;
    }

    public void setCodtratamento(String codtratamento) {
        this.codtratamento = codtratamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   /* public Date getTrgdtinclusao() {
        return trgdtinclusao;
    }

    public void setTrgdtinclusao(Date trgdtinclusao) {
        this.trgdtinclusao = trgdtinclusao;
    }*/

   /* public String getTrguserinclusao() {
        return trguserinclusao;
    }

    public void setTrguserinclusao(String trguserinclusao) {
        this.trguserinclusao = trguserinclusao;
    }*/

    @XmlTransient
    public List<Hospede> getHospedeList() {
        return hospedeList;
    }

    public Character getFlgativo() {
		return flgativo;
	}

	public void setFlgativo(Character flgativo) {
		this.flgativo = flgativo;
	}

	public void setHospedeList(List<Hospede> hospedeList) {
        this.hospedeList = hospedeList;
    }

   
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codtratamento == null) ? 0 : codtratamento.hashCode());
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
		Tratamento other = (Tratamento) obj;
		if (codtratamento == null) {
			if (other.codtratamento != null)
				return false;
		} else if (!codtratamento.equals(other.codtratamento))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Tratamento[ codtratamento=" + codtratamento + " ]";
    }
    
    @Transient
    public String getLabel() {
        return this.getDescricao();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "PENSAOFRONT")
@XmlRootElement
public class Pensaofront implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODPENSAO", nullable = false, length = 1)
    private String codpensao;
    @Basic(optional = false)
    @Column(name = "CODPENSAOCM", nullable = false)
    private Character codpensaocm;
    @Basic(optional = false)
    @Column(name = "DESCRICAO", nullable = false, length = 30)
    private String descricao;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;

    public Pensaofront() {
    }

    public Pensaofront(String codpensao) {
        this.codpensao = codpensao;
    }

    public Pensaofront(String codpensao, Character codpensaocm, String descricao) {
        this.codpensao = codpensao;
        this.codpensaocm = codpensaocm;
        this.descricao = descricao;
    }

    public String getCodpensao() {
        return codpensao;
    }

    public void setCodpensao(String codpensao) {
        this.codpensao = codpensao;
    }

    public Character getCodpensaocm() {
        return codpensaocm;
    }

    public void setCodpensaocm(Character codpensaocm) {
        this.codpensaocm = codpensaocm;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codpensao == null) ? 0 : codpensao.hashCode());
		result = prime * result + ((codpensaocm == null) ? 0 : codpensaocm.hashCode());
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
		Pensaofront other = (Pensaofront) obj;
		if (codpensao == null) {
			if (other.codpensao != null)
				return false;
		} else if (!codpensao.equals(other.codpensao))
			return false;
		if (codpensaocm == null) {
			if (other.codpensaocm != null)
				return false;
		} else if (!codpensaocm.equals(other.codpensaocm))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Pensaofront[ codpensao=" + codpensao + " ]";
    }

    @Transient
    public String getLabel() {
        return this.getCodpensao() + " - " + this.getDescricao();
    }
}

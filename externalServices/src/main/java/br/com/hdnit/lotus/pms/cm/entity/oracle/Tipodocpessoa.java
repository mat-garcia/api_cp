package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "TIPODOCPESSOA")
@XmlRootElement
public class Tipodocpessoa implements Serializable{
	 private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
	@Column(name = "IDDOCUMENTO", nullable = false, precision = 22)
	private Integer idDocumento;
	
	@Column(name = "NOMEDOCUMENTO", nullable = false, length = 60)
	private String nomeDocumento;
	
	@Column(name = "IDREGRA")
	private Integer idRegra;
	
	@Column(name = "FISICAJURIDICA", length = 1)
	private String fisicaJuridica;
	
	@Column(name = "MASCARA", length = 30)
	private String mascara;
	
	@Column(name = "DOCCHAVE", length = 1)
	private String docChave;
	
	@Column(name = "OBRIGAUF", length = 1)
	private String obrigaUf;
	
	@Column(name = "OBRIGAORGAO", length = 1)
	private String obrigaOrgao;
	
	@Column(name = "OBRIGAEMISSAO", length = 1)
	private String obrigaeMissao;
	
	@Column(name = "FLGOBRIGAVALIDADE", length = 1)
	private String flgObrigaValidade;
	
	@Column(name = "TRGDTINCLUSAO")
	@Temporal(TemporalType.DATE)
	private Date trgDtInclusao;
	
	@Column(name = "TRGUSERINCLUSAO", length = 30)
	private String trgUserInclusao;
	
	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getNomeDocumento() {
		return nomeDocumento;
	}

	public void setNomeDocumento(String nomeDocumento) {
		this.nomeDocumento = nomeDocumento;
	}

	public Integer getIdRegra() {
		return idRegra;
	}

	public void setIdRegra(Integer idRegra) {
		this.idRegra = idRegra;
	}

	public String getFisicaJuridica() {
		return fisicaJuridica;
	}

	public void setFisicaJuridica(String fisicaJuridica) {
		this.fisicaJuridica = fisicaJuridica;
	}

	public String getMascara() {
		return mascara;
	}

	public void setMascara(String mascara) {
		this.mascara = mascara;
	}

	public String getDocChave() {
		return docChave;
	}

	public void setDocChave(String docChave) {
		this.docChave = docChave;
	}

	public String getObrigaUf() {
		return obrigaUf;
	}

	public void setObrigaUf(String obrigaUf) {
		this.obrigaUf = obrigaUf;
	}

	public String getObrigaOrgao() {
		return obrigaOrgao;
	}

	public void setObrigaOrgao(String obrigaOrgao) {
		this.obrigaOrgao = obrigaOrgao;
	}

	public String getObrigaeMissao() {
		return obrigaeMissao;
	}

	public void setObrigaeMissao(String obrigaeMissao) {
		this.obrigaeMissao = obrigaeMissao;
	}

	public String getFlgObrigaValidade() {
		return flgObrigaValidade;
	}

	public void setFlgObrigaValidade(String flgObrigaValidade) {
		this.flgObrigaValidade = flgObrigaValidade;
	}

	public Date getTrgDtInclusao() {
		return trgDtInclusao;
	}

	public void setTrgDtInclusao(Date trgDtInclusao) {
		this.trgDtInclusao = trgDtInclusao;
	}

	public String getTrgUserInclusao() {
		return trgUserInclusao;
	}

	public void setTrgUserInclusao(String trgUserInclusao) {
		this.trgUserInclusao = trgUserInclusao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDocumento == null) ? 0 : idDocumento.hashCode());
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
		Tipodocpessoa other = (Tipodocpessoa) obj;
		if (idDocumento == null) {
			if (other.idDocumento != null)
				return false;
		} else if (!idDocumento.equals(other.idDocumento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "com.mycompany.mavenproject1.Faixaetaria[ idDocumento=" + idDocumento + " ]";
	}

	@Transient
	public String getLabel() {
		return this.getNomeDocumento();
	}

}

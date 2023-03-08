package br.com.hdnit.lotus.domain.entity.config;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.hdnit.lotus.domain.entity.Configuracao;

@Entity
@Table(name = "tipodoc_pessoa")
@XmlRootElement
public class TipoDocPessoaConfig extends Configuracao {

	private static final long serialVersionUID = -3928789719858753281L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	@Column(name = "ID_DOCUMENTO", nullable = false, precision = 22)
	private Integer idDocumento;

	@Column(name = "NOME_DOCUMENTO", nullable = false)
	private String nomeDocumento;
	
	@Column(name = "DOC_CHAVE", nullable = true, length = 1)
	private String docChave;

	@Column(name = "FISICA_JURIDICA", nullable = true, length = 1)
	private String fisicaJuridica;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
	

	public String getDocChave() {
		return docChave;
	}

	public void setDocChave(String docChave) {
		this.docChave = docChave;
	}

	public String getFisicaJuridica() {
		return fisicaJuridica;
	}

	public void setFisicaJuridica(String fisicaJuridica) {
		this.fisicaJuridica = fisicaJuridica;
	}

}


package br.com.hdnit.lotus.domain.entity.config;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.envers.Audited;

import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.domain.entity.Configuracao;
import br.com.hdnit.lotus.domain.entity.enums.UsuarioStatusEnum;



@Entity
@Table(name = "lt_docconfirma")
@XmlRootElement
public class DocconfirmahotelConfig extends Configuracao {

    private static final long serialVersionUID = -3928789719858753281L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;
   
    @Column(name = "IDDOCUMENTO", nullable = true, precision = 22)
    private Long iddocumento;

    @Column(name = "IDDOC_CARTAO", nullable = true, precision = 22)
    private Long iddocumentoCartao;

    @Column(name = "DESCRICAO_CARTAO", nullable = true)
    @Audited
    protected String descricaoCartao;
 
    @Column(name = "COD_REDUZIDO_CARTAO", nullable = true)
    @Audited
    protected String codigoReduzidoCartao;
    
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getIddocumento() {
		return iddocumento;
	}

	public void setIddocumento(Long iddocumento) {
		this.iddocumento = iddocumento;
	}

	public String getLabel() {
		return this.getCodigoReduzido() + " - " + this.getDescricao();
	}

	public String getLabel1() {
		return this.getCodigoReduzidoCartao() + " - " + this.getDescricaoCartao();
	}

	public Long getIddocumentoCartao() {
		return iddocumentoCartao;
	}

	public void setIddocumentoCartao(Long iddocumentoCartao) {
		this.iddocumentoCartao = iddocumentoCartao;
	}

	public String getDescricaoCartao() {
		return descricaoCartao;
	}

	public void setDescricaoCartao(String descricaoCartao) {
		this.descricaoCartao = descricaoCartao;
	}

	public String getCodigoReduzidoCartao() {
		return codigoReduzidoCartao;
	}

	public void setCodigoReduzidoCartao(String codigoReduzidoCartao) {
		this.codigoReduzidoCartao = codigoReduzidoCartao;
	}

}

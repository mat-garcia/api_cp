/*
 * 
 */

package br.com.hdnit.lotus.domain.entity.config;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.hdnit.lotus.domain.entity.Configuracao;
import br.com.hdnit.lotus.domain.entity.corporativo.CanalHotel;

// TODO: Auto-generated Javadoc
/**
 * The Class MensagemDTO.
 */
@Entity
@Table(name = "tipo_debito_empresa")
@XmlRootElement
public class TipoDebitoConfigEmpresa extends  Configuracao {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	
    /** The titulo. */
	@Column(name = "IDTIPODEBCRED", nullable = false)
    private Integer IDTIPODEBCRED;
    
   
	public Integer getIDTIPODEBCRED() {
		return IDTIPODEBCRED;
	}


	public void setIDTIPODEBCRED(Integer iDTIPODEBCRED) {
		IDTIPODEBCRED = iDTIPODEBCRED;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}



    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hdnit.lotus.domain.dto;

import java.io.Serializable;

/**
 *
 * @author hdn
 */
public class ProcessamentoPisDTO implements Serializable {

	/**
     * 
     */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String bairro;
	private String localidade;
	private String logradouro;
	private String Rua;
	private String cep;
	private String uf;
	

	public ProcessamentoPisDTO() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRepresentante() {
		return bairro;
	}

	public void setRepresentante(String representante) {
		this.bairro = representante;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}

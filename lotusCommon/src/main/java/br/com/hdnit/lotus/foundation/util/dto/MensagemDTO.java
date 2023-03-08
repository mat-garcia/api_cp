/*
 * 
 */

package br.com.hdnit.lotus.foundation.util.dto;


// TODO: Auto-generated Javadoc
/**
 * The Class MensagemDTO.
 */
public class MensagemDTO {

    /** The titulo. */
    private String titulo;
    
    /** The mensagem. */
    private String mensagem;
    /** The to. */
    private String to;
    
    private boolean possuiAnexo;

 
    /**
     * Gets the to.
     *
     * @return the to
     */
    public String getTo() {
		return to;
	}

	/**
	 * Sets the to.
	 *
	 * @param to the new to
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * Gets the mensagem.
	 *
	 * @return the mensagem
	 */
	public String getMensagem() {
        return mensagem;
    }

    /**
     * Sets the mensagem.
     *
     * @param mensagem the new mensagem
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * Gets the titulo.
     *
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the titulo.
     *
     * @param titulo the new titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

	public boolean isPossuiAnexo() {
		return possuiAnexo;
	}

	public void setPossuiAnexo(boolean possuiAnexo) {
		this.possuiAnexo = possuiAnexo;
	}

  
}

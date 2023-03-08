package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.util.Date;

public class ViewPrimeDisponibilidadeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private Long idhotel;

    private Date dataInicial;
    
    private Date dataFinal;
	
    private String codReduzido;
			
	private Integer disponibilidade;
	
	private Integer qtd_uhs;

	public Long getIdhotel() {
		return idhotel;
	}

	public void setIdhotel(Long idhotel) {
		this.idhotel = idhotel;
	}
	

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getCodReduzido() {
		return codReduzido;
	}

	public void setCodReduzido(String codReduzido) {
		this.codReduzido = codReduzido;
	}
	
	public Integer getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(Integer disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public Integer getQtd_uhs() {
		return qtd_uhs;
	}

	public void setQtd_uhs(Integer qtd_uhs) {
		this.qtd_uhs = qtd_uhs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idhotel == null) ? 0 : idhotel.hashCode());
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
		ViewPrimeDisponibilidadeDTO other = (ViewPrimeDisponibilidadeDTO) obj;
		if (idhotel == null) {
			if (other.idhotel != null)
				return false;
		} else if (!idhotel.equals(other.idhotel))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "[ idhotel=		 " + idhotel 	 	+ ", " +
        	   " data= 			 " + dataInicial 	+ ", " +
        	   " data= 			 " + dataFinal  	+ ", " +
        	   " codreduzido= 	 " + codReduzido 	+ ", " +
        	   " disponibilidade=  " + disponibilidade 	+" ]";
    }

}

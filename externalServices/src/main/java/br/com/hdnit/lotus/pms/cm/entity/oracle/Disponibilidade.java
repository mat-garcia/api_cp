package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ALL_VIEWS")
@XmlRootElement

public class Disponibilidade  implements Serializable {
	
	@Column(name = "VIEW_NAME", length = 60)
    private String nomeView;

	public String getNomeView() {
		return nomeView;
	}

	public void setNomeView(String nomeView) {
		this.nomeView = nomeView;
	}
}


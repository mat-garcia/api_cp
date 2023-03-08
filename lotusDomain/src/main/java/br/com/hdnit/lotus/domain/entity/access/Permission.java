package br.com.hdnit.lotus.domain.entity.access;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.domain.entity.comparator.PermissionComparator;
import br.com.hdnit.lotus.domain.entity.corporativo.Empresa;
import br.com.hdnit.lotus.domain.entity.enums.GrupoPermissaoComparator;
import br.com.hdnit.lotus.domain.entity.enums.GrupoPermissaoEnum;

/**
 * <P>
 * <B>Description :</B><BR>
 * The Ingrediente class includes attributes that describe what are the
 * characteristics of a specific permission to access a system
 * </P>
 * <P>
 * 
 * @author <a href="mailto:contato@hdntecnologia.com.brrce 28/04/2009
 * @version $Revision: 1.0 $
 */
@Entity
@Table(name = "ac_permission", uniqueConstraints = { @UniqueConstraint(columnNames = {
		"NM_permission", "ID_EMPRESA" }) })
@XmlType(name = "permission", propOrder = { "description", "id", "name", "url" })
public class Permission extends AuditTrail {

	public static PermissionComparator PERMISSION_COMPARATOR = new PermissionComparator();

	public static GrupoPermissaoComparator GRUPO_PERMISSAO_COMPARATOR = new GrupoPermissaoComparator();

	private static final long serialVersionUID = -631473041725593152L;
	@Id
	@GeneratedValue
	@Column(name = "ID_permission")
	private Integer id;

	@Column(name = "NM_permission", length = 50)
	private String name;

	@Column(name = "DS_permission", length = 50)
	private String description;

	@Column(name = "NM_url", length = 50)
	private String url;

	@Enumerated(EnumType.STRING)
	@Column(name = "GRUPO", length = 50, nullable = true)
	private GrupoPermissaoEnum grupoPermissao;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Permission() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name.trim();
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description != null) {
			this.description = description.trim();
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		int result = 0;
		if (this.name != null) {
			result = name.hashCode();
		}
		return result;
	}

	@Override
	public boolean equals(Object object) {
		boolean returnValue = false;

		if (object instanceof Permission) {
			Permission permission = (Permission) object;
			if (this.name != null) {
				returnValue = this.name.equalsIgnoreCase(permission.name);
			}
		}
		return returnValue;
	}

	@Override
	public String getLabel() {
		return this.getName();
	}

	@Override
	public void setLabel(String nome) {
		this.setName(nome);
	}

	public GrupoPermissaoEnum getGrupoPermissao() {
		return grupoPermissao;
	}

	public void setGrupoPermissao(GrupoPermissaoEnum grupoPermissao) {
		this.grupoPermissao = grupoPermissao;
	}


}

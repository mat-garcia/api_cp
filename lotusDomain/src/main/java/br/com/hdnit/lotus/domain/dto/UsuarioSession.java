
package br.com.hdnit.lotus.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import br.com.hdnit.lotus.domain.entity.access.Permission;
import br.com.hdnit.lotus.domain.entity.access.Usuario;
import br.com.hdnit.lotus.domain.entity.corporativo.Empresa;
import br.com.hdnit.lotus.domain.entity.enums.GrupoPermissaoEnum;
import br.com.hdnit.lotus.foundation.util.PropertiesUtils;
import br.com.hdnit.lotus.foundation.util.dto.PropertiesEnum;

public class UsuarioSession implements Serializable {

	private Usuario usuario;

	Map<String, String> permissionMap = new HashMap<String, String>();
	Map<GrupoPermissaoEnum, List<String>> permissionGroupMap = new HashMap<GrupoPermissaoEnum, List<String>>();

	private String login;
	private String passWd;

	private Date lastLogin;
	
	private Empresa empresaCorrente;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;

	}

	public Map<String, String> getPermissionMap() {
		return permissionMap;
	}

	public void setPermissionMap(Map<String, String> permissionMap) {
		this.permissionMap = permissionMap;
	}

	public String getPassWd() {
		return passWd;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}

	public boolean isUsuarioLogado() {
		// TODO Auto-generated method stub
		return this.getUsuario() != null && this.getUsuario().getId() != null ? true : false;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Boolean getPermission(String url) {

		return getPermissionMap().containsValue(url);
	}

	public Boolean hasPermission(String nome) {

		return getPermissionMap().containsKey(nome);
	}

	public Boolean hasGroupPermission(GrupoPermissaoEnum nome) {

		return getPermissionGroupMap().containsKey(nome);
	}

	public void addPermission() {

		getPermissionMap().clear();
		for (Permission p : this.getUsuario().getProfile().getPermissions()) {
			if (p.getName() != null && !getPermissionMap().containsKey(p.getName()))
				getPermissionMap().put(p.getName(), p.getUrl());

			if (p.getGrupoPermissao() != null && !getPermissionMap().containsKey(p.getGrupoPermissao())) {
				List<String> itens = new ArrayList<String>();
				itens.add(p.getName());
				getPermissionGroupMap().put(p.getGrupoPermissao(), itens);
			} else if (p.getGrupoPermissao() != null && getPermissionMap().containsKey(p.getGrupoPermissao())) {
				List<String> itens = getPermissionGroupMap().get(p.getGrupoPermissao());
				itens.add(p.getName());
			}
		}

	}

	public Empresa getEmpresaCorrente() {
		if (empresaCorrente == null) {
			empresaCorrente = usuario.getIdEmpresa();
		}
		return empresaCorrente;
	}

	public void setEmpresaCorrente(Empresa empresaCorrente) {
		this.empresaCorrente = empresaCorrente;
	//buildProperties();

	}

	private void buildProperties() {
		Properties applicationProperties = PropertiesUtils.getInstance().getApplicationProperties();
		applicationProperties.clear();
		/*applicationProperties.put(PropertiesEnum.EXTERNAL_DB_OWNER.toString(), this.getEmpresaCorrente().getExternalDbOwner());
		applicationProperties.put(PropertiesEnum.MIXFISCAL_OWNER.toString(), this.getEmpresaCorrente().getMixFiscalOwner());
		applicationProperties.put(PropertiesEnum.TMP_ICMS_ENTRADA.toString(), this.getEmpresaCorrente().getTmp_icms_entrada());
		applicationProperties.put(PropertiesEnum.TMP_ICMS_SAIDA.toString(), this.getEmpresaCorrente().getTmp_icms_saida());
		applicationProperties.put(PropertiesEnum.TMP_PIS.toString(), this.getEmpresaCorrente().getTmp_pis());
		applicationProperties.put(PropertiesEnum.VW_ICMS.toString(), this.getEmpresaCorrente().getVw_icms());
		applicationProperties.put(PropertiesEnum.VW_PIS.toString(), this.getEmpresaCorrente().getVw_pis());
*/
	}

	public Map<GrupoPermissaoEnum, List<String>> getPermissionGroupMap() {
		return permissionGroupMap;
	}

	public void setPermissionGroupMap(Map<GrupoPermissaoEnum, List<String>> permissionGroupMap) {
		this.permissionGroupMap = permissionGroupMap;
	}

	public Boolean isSuperAdm() {
		return getUsuario().getSuperAdmin();
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
}

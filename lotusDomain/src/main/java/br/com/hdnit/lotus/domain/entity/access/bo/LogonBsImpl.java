
package br.com.hdnit.lotus.domain.entity.access.bo;

import java.util.Calendar;
import java.util.Random;

import br.com.hdnit.lotus.domain.bo.generic.AbstractBussinesObject;
import br.com.hdnit.lotus.domain.dto.UsuarioSession;
import br.com.hdnit.lotus.domain.entity.access.UserValidationException;
import br.com.hdnit.lotus.domain.entity.access.Usuario;
import br.com.hdnit.lotus.domain.entity.access.dao.impl.DataViolationException;
import br.com.hdnit.lotus.domain.entity.access.dao.impl.UsuarioDAOImpl;
import br.com.hdnit.lotus.domain.entity.corporativo.Empresa;
import br.com.hdnit.lotus.domain.entity.corporativo.bo.EmpresaBsImpl;
import br.com.hdnit.lotus.foundation.util.BundleUtils;
import br.com.hdnit.lotus.foundation.util.DateUtils;
import br.com.hdnit.lotus.foundation.util.EmailUtil;
import br.com.hdnit.lotus.foundation.util.dto.MensagemDTO;

public class LogonBsImpl extends AbstractBussinesObject<Usuario, UsuarioDAOImpl> {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	private EmpresaBsImpl empresaBs;

	public LogonBsImpl() {
		super();
		empresaBs = new EmpresaBsImpl();
	}

	public UsuarioSession authenticate(String login, String senha)
			throws UserValidationException, DataViolationException {

		Usuario user = dao.existsUserValidatePassword(login, senha);

		Empresa empresa = empresaBs.findEmpresaById(user.getIdEmpresa().getId());

		user.setIdEmpresa(empresa);

		UsuarioSession usuarioSession = new UsuarioSession();
		usuarioSession.setUsuario(user);
		usuarioSession.addPermission();
		Calendar cal = DateUtils.getInstance().getCalendar();
		cal.setTimeInMillis(System.currentTimeMillis());
		usuarioSession.setLastLogin(cal.getTime());
		usuarioSession.setEmpresaCorrente(user.getIdEmpresa());
		return usuarioSession;

	}

	public UsuarioSession validaLogin(String login, String sessionKey)
			throws UserValidationException, DataViolationException {

		Usuario user = dao.existsUserValidateSessionKey(login, sessionKey);

		Empresa empresa = empresaBs.findEmpresaById(user.getIdEmpresa().getId());

		user.setIdEmpresa(empresa);

		UsuarioSession usuarioSession = new UsuarioSession();
		usuarioSession.setUsuario(user);
		usuarioSession.addPermission();

		usuarioSession.setEmpresaCorrente(user.getIdEmpresa());
		return usuarioSession;

	}

	public String rememberPassword(String login) throws Exception {
		String returnedString = "failed";
		try {
			Usuario user = dao.findByEmail(login);

			if (user != null) {
				String subject = BundleUtils.getMessage("login.recuperar.senha.subject");
				String email = user.getEmail();
				String password = generateNewPassword();
				user.setPassword(password);
				// user.setPasswordRetype(password);
				// facade.createHashForUserPassword(user);
				String body = BundleUtils.getMessage("login.recuperar.senha.body") + " " + password;
				MensagemDTO mensagemInicio = new MensagemDTO();
				mensagemInicio.setTitulo(subject);

				mensagemInicio.setTo(email);
				mensagemInicio.setMensagem(body);
				enviarEmail(mensagemInicio);
				dao.updateUser(user);

				returnedString = "sucess";
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}

		return returnedString;
	}

	public String generateNewPassword() {
		StringBuilder newPassword = new StringBuilder();
		Random random = new Random();

		int i = 0;
		while (newPassword.length() < 8) {
			int indice = random.nextInt(122);
			if (indice >= 65 && (indice < 91 || indice > 96)) {
				char character = (char) indice;
				newPassword.append(character);
				i++;

			}
		}
		return newPassword.toString();
	}

	private void enviarEmail(MensagemDTO mensagem) throws Exception {

		try {
			EmailUtil.enviaEmail(mensagem);
		} catch (Exception ex) {
			throw ex;

		}

	}


}

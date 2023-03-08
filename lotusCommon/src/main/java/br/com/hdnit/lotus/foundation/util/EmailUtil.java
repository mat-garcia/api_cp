/*
 * 
 */

package br.com.hdnit.lotus.foundation.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.codemonkey.simplejavamail.Email;
import org.codemonkey.simplejavamail.Mailer;
import org.codemonkey.simplejavamail.TransportStrategy;

import br.com.hdnit.lotus.foundation.util.dto.MensagemDTO;
import br.com.hdnit.lotus.foundation.util.exception.EmailException;

// TODO: Auto-generated Javadoc
/**
 * The Class EmailUtil.
 */
public class EmailUtil {

	private static Logger _logger = Logger.getLogger(EmailUtil.class);

	
    /** The Constant EMAILORIGEM. */
    private static final String EMAILORIGEM = BundleUtils.getMessage("email.util.emailorigem");

    /** The Constant HOSTNAME. */
    private static final String HOSTNAME = BundleUtils.getMessage("email.util.hostname");

    /** The Constant EMAILCC. */
    private static final String EMAILCC = BundleUtils.getMessage("email.util.emailgroup");

    /** The Constant EMAILCC. */

    private static final String PORTA = BundleUtils.getMessage("email.util.hostporta");

    /** The Constant USER. */
    private static final String USER = BundleUtils.getMessage("email.util.username");
    
    
    /** The Constant PASSWD. */
    private static final String PASSWD = BundleUtils.getMessage("email.util.password");

    /** The descricao. */
    static String descricao;

    /** The nome arquivo. */
    static String nomeArquivo;

    /**
     * Envia email.
     *
     * @param mensagem the mensagem
     * @throws Exception 
     */
    public static void enviaEmail(MensagemDTO mensagem) throws Exception {
        // Recipient's email ID needs to be mentioned.
        String to = mensagem.getTo();

        String cc = EMAILCC;

        // Sender's email ID needs to be mentioned
        String from = EMAILORIGEM;

        // Assuming you are sending email from localhost
        String host = HOSTNAME;

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
   
        properties.put("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.port", PORTA);
      


        //create Authenticator object to pass in Session.getInstance argument
        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USER, PASSWD);
            }
        };

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties, auth);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set CC: header field of the header.
            if (cc != null && !cc.isEmpty())
                message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc));

            // Set Subject: header field
            message.setSubject(mensagem.getTitulo());

            // Now set the actual message
            message.setText(mensagem.getMensagem());
            
            // Send message
            Transport.send(message);

        } catch (Exception mex) {
            
            _logger.error(mex);

            throw new EmailException(BundleUtils.getMessage("login.error.enviar.email"), mex);
        }

    }

    /**
     * Envia email.
     *
     * @param mensagem the mensagem
     * @throws Exception 
     */
    public static void enviaEmailTls(MensagemDTO mensagem) throws Exception {
        // Recipient's email ID needs to be mentioned.
        String to = mensagem.getTo();

        String cc = EMAILCC;

        // Sender's email ID needs to be mentioned
        String from = EMAILORIGEM;

        // Assuming you are sending email from localhost
        String host = HOSTNAME;

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
   
        /*  properties.put("mail.smtp.starttls.enable","true");
          properties.put("mail.smtp.auth", "true");  // If you need to authenticate
          // Use the following if you need SSL
          properties.put("mail.smtp.socketFactory.port", PORTA);
          properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
          properties.put("mail.smtp.socketFactory.fallback", "false");
          
          */
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", BundleUtils.getMessage("email.util.hablitatls"));
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.port", PORTA);
      


        //create Authenticator object to pass in Session.getInstance argument
        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USER, PASSWD);
            }
        };

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties, auth);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set CC: header field of the header.
            if (cc != null && !cc.isEmpty())
                message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc));

            // Set Subject: header field
            message.setSubject(mensagem.getTitulo());

            // Now set the actual message
            message.setText(mensagem.getMensagem());
            
            // Send message
            Transport.send(message);

        } catch (Exception mex) {
            
            _logger.error(mex);

            throw new EmailException(BundleUtils.getMessage("login.error.enviar.email"), mex);
        }

    }

    
    public static void sendEmail2(MensagemDTO mensagem){
    	
    	final Email email = new Email();
		email.setFromAddress(USER, USER);
		email.addRecipient(mensagem.getTo(), mensagem.getTo(), RecipientType.TO);
		email.setSubject(mensagem.getTitulo());
		email.setTextHTML(mensagem.getMensagem());
		
		String host = HOSTNAME;
    	new Mailer(host, Integer.parseInt(PORTA), USER, PASSWD, TransportStrategy.SMTP_TLS).sendMail(email);
    }
    
    
    public static void sendEmail(MensagemDTO mensagem) throws AddressException, MessagingException {
        
        // Recipient's email ID needs to be mentioned.
        String to = mensagem.getTo();

        String cc = EMAILCC;

        // Sender's email ID needs to be mentioned
        String from = EMAILORIGEM;

        // Assuming you are sending email from localhost
        String host = HOSTNAME;
        
        
        // Step1
        _logger.info("Inserindo configurações de envio de email");
        Properties mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", PORTA);
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        
        _logger.info("configurações de envio de email inseridas com sucesso");
 
        // Step2
        _logger.info("iniciando sessão de envio");
        Session getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        MimeMessage generateMailMessage = new MimeMessage(getMailSession);
        generateMailMessage.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
       

        if (cc != null && !cc.isEmpty()){
            generateMailMessage.addRecipients(Message.RecipientType.CC, InternetAddress.parse(cc));
        }

        generateMailMessage.setSubject(mensagem.getTitulo());
        String emailBody = mensagem.getMensagem();
        
        generateMailMessage.setContent(emailBody, "text/html");
        _logger.info("mensagem gerada com sucesso");
 

        _logger.info("iniciando envio do email");
        Transport transport = getMailSession.getTransport("smtp");
 

       
     
        transport.connect(host, from, PASSWD);
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        _logger.info("email enviado com sucesso");
        transport.close();
    }

    /**
     * Gets the descricao.
     *
     * @return the descricao
     */
    public static String getDescricao() {
        return descricao;
    }

    /**
     * Sets the descricao.
     *
     * @param descricao2 the new descricao
     */
    public static void setDescricao(String descricao2) {
        descricao = descricao2;
    }

    /**
     * Gets the nome arquivo.
     *
     * @return the nome arquivo
     */
    public static String getNomeArquivo() {
        return nomeArquivo;
    }

    /**
     * Sets the nome arquivo.
     *
     * @param nomeArquivo2 the new nome arquivo
     */
    public static void setNomeArquivo(String nomeArquivo2) {
        nomeArquivo = nomeArquivo2;
    }

    /**
     * Gets the emailorigem.
     *
     * @return the emailorigem
     */
    public static String getEmailorigem() {
        return EMAILORIGEM;
    }

    /**
     * Gets the hostname.
     *
     * @return the hostname
     */
    public static String getHostname() {
        return HOSTNAME;
    }

    /**
     * Gets the emailcc.
     *
     * @return the emailcc
     */
    public static String getEmailcc() {
        return EMAILCC;
    }
    
    
    /**
     * Envia email com anexo.
     *
     * @param MensagemDTO, arquivo, e tipo (ex. "plain/text", "image/gif" or "application/pdf").
     */
    public static void sendEmailWithAttachment(MensagemDTO mensagem, byte[] file, String tipo){
    	
    	final Email email = new Email();
		email.setFromAddress(USER, USER);
		email.addRecipient(mensagem.getTo(), mensagem.getTo(), RecipientType.TO);
		email.setSubject(mensagem.getTitulo());
		email.setTextHTML(mensagem.getMensagem());
		email.addAttachment(getNomeArquivo(), file, tipo);
		
		String host = HOSTNAME;
    	new Mailer(host, Integer.parseInt(PORTA), USER, PASSWD, TransportStrategy.SMTP_TLS).sendMail(email);
    }

}

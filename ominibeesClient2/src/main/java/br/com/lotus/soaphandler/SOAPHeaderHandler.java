package br.com.lotus.soaphandler;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.namespace.QName;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SOAPHeaderHandler implements SOAPHandler<SOAPMessageContext> {

    private final String userCode;
    private final String userName;
    private final String userPassword;

    public SOAPHeaderHandler(String userCode,String userName,String userPassword) {
        this.userCode = userCode;
        this.userName = userName;
        this.userPassword = userPassword;
        
    }

    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outboundProperty =
                (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        System.out.println("entrei no handleMessage !!");
        
        if (outboundProperty.booleanValue()) {
       
        	System.out.println("chamei servico  !!");
            
        	
        	 SOAPMessage message =  context.getMessage();
        	
            try {
                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                
                if (envelope.getHeader() == null) {
                	envelope.addHeader();
                }
                
                Name name = envelope.createName("OmnibeesCredentials", "con", "http://connectors.omnibees.com/");
                SOAPHeaderElement security = envelope.getHeader().addHeaderElement(name);
         
                SOAPElement usernameToken = security.addChildElement("UserCode", "con");
                usernameToken.setTextContent(userCode);
                SOAPElement username = security.addChildElement("UserName", "con");
                username.setTextContent(userName);
                SOAPElement password = security.addChildElement("UserPassword", "con");
                password.setTextContent(userPassword);
      
              /*  
                if (envelope.getHeader() != null) {
                    envelope.getHeader().detachNode();
                 }
                
                SOAPFactory factory = SOAPFactory.newInstance();
                String prefix = "con";
                String uri = "con:connectors.omnibees.com";

                
                SOAPElement securityElem =
                        factory.createElement("OmnibeesCredentials", prefix, uri);
                SOAPElement userCodeElem =
                        factory.createElement("UserCode", prefix, uri);
                userCodeElem.setValue(userCode);
                
                SOAPElement userNameElem =
                        factory.createElement("UserName", prefix, uri);
                userNameElem.setValue();
                
                SOAPElement  userPasswordElem =
                        factory.createElement("UserPassword", prefix, uri);
                userPasswordElem.setValue(userPassword);
                
                
                securityElem.addChildElement(userCodeElem);
                securityElem.addChildElement(userNameElem);
                securityElem.addChildElement(userPasswordElem);
                
                SOAPHeader header = envelope.addHeader();
                header.addHeaderElement(securityElem);
                */
                //Print out the outbound SOAP message to System.out
                context.getMessage().saveChanges();
                
                message.writeTo(System.out);
                System.out.println(message.toString());
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // inbound
        }
        return true;
    }

    public Set<QName> getHeaders() {
        return new TreeSet();
    }

    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    public void close(MessageContext context) {
        //
    }
}
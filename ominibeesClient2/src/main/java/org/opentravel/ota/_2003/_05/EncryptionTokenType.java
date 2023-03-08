
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EncryptionTokenType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EncryptionTokenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.opentravel.org/OTA/2003/05}WarningType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EncryptionKeyMethod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EncryptionMethod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EncryptedValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Token" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TokenProviderID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AuthenticationMethod"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="SecurityCode"/&gt;
 *             &lt;enumeration value="MagneticStripe"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionTokenType", propOrder = {
    "plainText",
    "tpaExtensions",
    "warning"
})
public class EncryptionTokenType {

    @XmlElement(name = "PlainText")
    protected String plainText;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "Warning")
    protected WarningType warning;
    @XmlAttribute(name = "EncryptionKey")
    protected String encryptionKey;
    @XmlAttribute(name = "EncryptionKeyMethod")
    protected String encryptionKeyMethod;
    @XmlAttribute(name = "EncryptionMethod")
    protected String encryptionMethod;
    @XmlAttribute(name = "EncryptedValue")
    protected String encryptedValue;
    @XmlAttribute(name = "Mask")
    protected String mask;
    @XmlAttribute(name = "Token")
    protected String token;
    @XmlAttribute(name = "TokenProviderID")
    protected String tokenProviderID;
    @XmlAttribute(name = "AuthenticationMethod")
    protected String authenticationMethod;

    /**
     * Obtém o valor da propriedade plainText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * Define o valor da propriedade plainText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlainText(String value) {
        this.plainText = value;
    }

    /**
     * Obtém o valor da propriedade tpaExtensions.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Define o valor da propriedade tpaExtensions.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Obtém o valor da propriedade warning.
     * 
     * @return
     *     possible object is
     *     {@link WarningType }
     *     
     */
    public WarningType getWarning() {
        return warning;
    }

    /**
     * Define o valor da propriedade warning.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningType }
     *     
     */
    public void setWarning(WarningType value) {
        this.warning = value;
    }

    /**
     * Obtém o valor da propriedade encryptionKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Define o valor da propriedade encryptionKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
    }

    /**
     * Obtém o valor da propriedade encryptionKeyMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKeyMethod() {
        return encryptionKeyMethod;
    }

    /**
     * Define o valor da propriedade encryptionKeyMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKeyMethod(String value) {
        this.encryptionKeyMethod = value;
    }

    /**
     * Obtém o valor da propriedade encryptionMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionMethod() {
        return encryptionMethod;
    }

    /**
     * Define o valor da propriedade encryptionMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionMethod(String value) {
        this.encryptionMethod = value;
    }

    /**
     * Obtém o valor da propriedade encryptedValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedValue() {
        return encryptedValue;
    }

    /**
     * Define o valor da propriedade encryptedValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedValue(String value) {
        this.encryptedValue = value;
    }

    /**
     * Obtém o valor da propriedade mask.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Define o valor da propriedade mask.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Obtém o valor da propriedade token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define o valor da propriedade token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtém o valor da propriedade tokenProviderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenProviderID() {
        return tokenProviderID;
    }

    /**
     * Define o valor da propriedade tokenProviderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenProviderID(String value) {
        this.tokenProviderID = value;
    }

    /**
     * Obtém o valor da propriedade authenticationMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Define o valor da propriedade authenticationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMethod(String value) {
        this.authenticationMethod = value;
    }

}

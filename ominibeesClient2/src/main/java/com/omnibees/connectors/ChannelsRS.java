
package com.omnibees.connectors;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.opentravel.ota._2003._05.SuccessType;
import org.opentravel.ota._2003._05.TransactionStatusCode;
import org.opentravel.ota._2003._05.TypeTarget;


/**
 * <p>Classe Java de ChannelsRS complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ChannelsRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://connectors.omnibees.com/}ComplementarResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Channels" type="{http://connectors.omnibees.com/}ArrayOfChannel" minOccurs="0"/&gt;
 *         &lt;element name="Warnings" type="{http://connectors.omnibees.com/}ArrayOfWarningType" minOccurs="0"/&gt;
 *         &lt;element name="Errors" type="{http://connectors.omnibees.com/}ArrayOfErrorType" minOccurs="0"/&gt;
 *         &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/&gt;
 *         &lt;element name="TargetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionStatusCode" type="{http://www.opentravel.org/OTA/2003/05}TransactionStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AltLangID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Target" type="{http://www.opentravel.org/OTA/2003/05}TypeTarget" /&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelsRS", propOrder = {
    "channels",
    "warnings",
    "errors",
    "success",
    "targetName",
    "transactionIdentifier",
    "sequenceNmbr",
    "transactionStatusCode",
    "retransmissionIndicator",
    "correlationID",
    "primaryLangID",
    "altLangID"
})
public class ChannelsRS
    extends ComplementarResponse
{

    @XmlElement(name = "Channels")
    protected ArrayOfChannel channels;
    @XmlElement(name = "Warnings")
    protected ArrayOfWarningType warnings;
    @XmlElement(name = "Errors")
    protected ArrayOfErrorType errors;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "TargetName")
    protected String targetName;
    @XmlElement(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlElement(name = "SequenceNmbr")
    protected String sequenceNmbr;
    @XmlElement(name = "TransactionStatusCode")
    @XmlSchemaType(name = "string")
    protected TransactionStatusCode transactionStatusCode;
    @XmlElement(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlElement(name = "AltLangID")
    protected String altLangID;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected TypeTarget target;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;

    /**
     * Obtém o valor da propriedade channels.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChannel }
     *     
     */
    public ArrayOfChannel getChannels() {
        return channels;
    }

    /**
     * Define o valor da propriedade channels.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChannel }
     *     
     */
    public void setChannels(ArrayOfChannel value) {
        this.channels = value;
    }

    /**
     * Obtém o valor da propriedade warnings.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarningType }
     *     
     */
    public ArrayOfWarningType getWarnings() {
        return warnings;
    }

    /**
     * Define o valor da propriedade warnings.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarningType }
     *     
     */
    public void setWarnings(ArrayOfWarningType value) {
        this.warnings = value;
    }

    /**
     * Obtém o valor da propriedade errors.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorType }
     *     
     */
    public ArrayOfErrorType getErrors() {
        return errors;
    }

    /**
     * Define o valor da propriedade errors.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorType }
     *     
     */
    public void setErrors(ArrayOfErrorType value) {
        this.errors = value;
    }

    /**
     * Obtém o valor da propriedade success.
     * 
     * @return
     *     possible object is
     *     {@link SuccessType }
     *     
     */
    public SuccessType getSuccess() {
        return success;
    }

    /**
     * Define o valor da propriedade success.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessType }
     *     
     */
    public void setSuccess(SuccessType value) {
        this.success = value;
    }

    /**
     * Obtém o valor da propriedade targetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * Define o valor da propriedade targetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetName(String value) {
        this.targetName = value;
    }

    /**
     * Obtém o valor da propriedade transactionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Define o valor da propriedade transactionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNmbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Define o valor da propriedade sequenceNmbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNmbr(String value) {
        this.sequenceNmbr = value;
    }

    /**
     * Obtém o valor da propriedade transactionStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusCode }
     *     
     */
    public TransactionStatusCode getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Define o valor da propriedade transactionStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusCode }
     *     
     */
    public void setTransactionStatusCode(TransactionStatusCode value) {
        this.transactionStatusCode = value;
    }

    /**
     * Obtém o valor da propriedade retransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * Define o valor da propriedade retransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade correlationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Define o valor da propriedade correlationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Obtém o valor da propriedade primaryLangID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Define o valor da propriedade primaryLangID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Obtém o valor da propriedade altLangID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Define o valor da propriedade altLangID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

    /**
     * Obtém o valor da propriedade echoToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Define o valor da propriedade echoToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Obtém o valor da propriedade timeStamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Define o valor da propriedade timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Obtém o valor da propriedade target.
     * 
     * @return
     *     possible object is
     *     {@link TypeTarget }
     *     
     */
    public TypeTarget getTarget() {
        return target;
    }

    /**
     * Define o valor da propriedade target.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTarget }
     *     
     */
    public void setTarget(TypeTarget value) {
        this.target = value;
    }

    /**
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}

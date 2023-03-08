//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 12:21:47 PM BRST 
//


package org.opentravel.ota2010a;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType"/&gt;
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
 *           &lt;element name="Authorization" maxOccurs="99"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="AuthorizationDetail" type="{http://www.opentravel.org/OTA/2003/05}AuthorizationType" minOccurs="0"/&gt;
 *                     &lt;element name="AuthorizationResult" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;attribute name="AuthorizationCode"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;pattern value="[A-Za-z0-9]{1,12}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                             &lt;attribute name="ApprovalDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
 *                             &lt;attribute name="Result"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                   &lt;enumeration value="Approved"/&gt;
 *                                   &lt;enumeration value="ApprovedWithPositiveID"/&gt;
 *                                   &lt;enumeration value="Denied"/&gt;
 *                                   &lt;enumeration value="DeniedPickupCard"/&gt;
 *                                   &lt;enumeration value="ReferToIssuer"/&gt;
 *                                   &lt;enumeration value="EditError"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                             &lt;attribute name="AddressResultCode"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;pattern value="[A-Za-z0-9]{1,6}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                             &lt;attribute name="CVC_Result"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                   &lt;enumeration value="Match"/&gt;
 *                                   &lt;enumeration value="DoesNotMatch"/&gt;
 *                                   &lt;enumeration value="NotProcessed"/&gt;
 *                                   &lt;enumeration value="Required"/&gt;
 *                                   &lt;enumeration value="IssuerNotCertified"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                             &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
 *                     &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "success",
    "warnings",
    "authorization",
    "errors"
})
@XmlRootElement(name = "OTA_AuthorizationRS")
public class OTA_AuthorizationRS
    implements Serializable
{

    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Authorization")
    protected List<OTA_AuthorizationRS.Authorization> authorization = new Vector<OTA_AuthorizationRS.Authorization>();
    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;

    /**
     * Gets the value of the success property.
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
     * Sets the value of the success property.
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
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTA_AuthorizationRS.Authorization }
     * 
     * 
     */
    public List<OTA_AuthorizationRS.Authorization> getAuthorization() {
        if (authorization == null) {
            authorization = new Vector<OTA_AuthorizationRS.Authorization>();
        }
        return this.authorization;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the echoToken property.
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
     * Sets the value of the echoToken property.
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
     * Gets the value of the timeStamp property.
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
     * Sets the value of the timeStamp property.
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
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
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
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
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
     * Sets the value of the transactionIdentifier property.
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
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the retransmissionIndicator property.
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
     * Sets the value of the retransmissionIndicator property.
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
     * Gets the value of the correlationID property.
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
     * Sets the value of the correlationID property.
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
     * Gets the value of the primaryLangID property.
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
     * Sets the value of the primaryLangID property.
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
     * Gets the value of the altLangID property.
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
     * Sets the value of the altLangID property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AuthorizationDetail" type="{http://www.opentravel.org/OTA/2003/05}AuthorizationType" minOccurs="0"/&gt;
     *         &lt;element name="AuthorizationResult" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="AuthorizationCode"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;pattern value="[A-Za-z0-9]{1,12}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ApprovalDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
     *                 &lt;attribute name="Result"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                       &lt;enumeration value="Approved"/&gt;
     *                       &lt;enumeration value="ApprovedWithPositiveID"/&gt;
     *                       &lt;enumeration value="Denied"/&gt;
     *                       &lt;enumeration value="DeniedPickupCard"/&gt;
     *                       &lt;enumeration value="ReferToIssuer"/&gt;
     *                       &lt;enumeration value="EditError"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="AddressResultCode"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;pattern value="[A-Za-z0-9]{1,6}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="CVC_Result"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                       &lt;enumeration value="Match"/&gt;
     *                       &lt;enumeration value="DoesNotMatch"/&gt;
     *                       &lt;enumeration value="NotProcessed"/&gt;
     *                       &lt;enumeration value="Required"/&gt;
     *                       &lt;enumeration value="IssuerNotCertified"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
     *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "authorizationDetail",
        "authorizationResult",
        "warnings",
        "comments"
    })
    public static class Authorization
        implements Serializable
    {

        @XmlElement(name = "AuthorizationDetail")
        protected AuthorizationType authorizationDetail;
        @XmlElement(name = "AuthorizationResult")
        protected OTA_AuthorizationRS.Authorization.AuthorizationResult authorizationResult;
        @XmlElement(name = "Warnings")
        protected WarningsType warnings;
        @XmlElement(name = "Comments")
        protected CommentType comments;

        /**
         * Gets the value of the authorizationDetail property.
         * 
         * @return
         *     possible object is
         *     {@link AuthorizationType }
         *     
         */
        public AuthorizationType getAuthorizationDetail() {
            return authorizationDetail;
        }

        /**
         * Sets the value of the authorizationDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link AuthorizationType }
         *     
         */
        public void setAuthorizationDetail(AuthorizationType value) {
            this.authorizationDetail = value;
        }

        /**
         * Gets the value of the authorizationResult property.
         * 
         * @return
         *     possible object is
         *     {@link OTA_AuthorizationRS.Authorization.AuthorizationResult }
         *     
         */
        public OTA_AuthorizationRS.Authorization.AuthorizationResult getAuthorizationResult() {
            return authorizationResult;
        }

        /**
         * Sets the value of the authorizationResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTA_AuthorizationRS.Authorization.AuthorizationResult }
         *     
         */
        public void setAuthorizationResult(OTA_AuthorizationRS.Authorization.AuthorizationResult value) {
            this.authorizationResult = value;
        }

        /**
         * Gets the value of the warnings property.
         * 
         * @return
         *     possible object is
         *     {@link WarningsType }
         *     
         */
        public WarningsType getWarnings() {
            return warnings;
        }

        /**
         * Sets the value of the warnings property.
         * 
         * @param value
         *     allowed object is
         *     {@link WarningsType }
         *     
         */
        public void setWarnings(WarningsType value) {
            this.warnings = value;
        }

        /**
         * Gets the value of the comments property.
         * 
         * @return
         *     possible object is
         *     {@link CommentType }
         *     
         */
        public CommentType getComments() {
            return comments;
        }

        /**
         * Sets the value of the comments property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommentType }
         *     
         */
        public void setComments(CommentType value) {
            this.comments = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="AuthorizationCode"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;pattern value="[A-Za-z0-9]{1,12}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ApprovalDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
         *       &lt;attribute name="Result"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *             &lt;enumeration value="Approved"/&gt;
         *             &lt;enumeration value="ApprovedWithPositiveID"/&gt;
         *             &lt;enumeration value="Denied"/&gt;
         *             &lt;enumeration value="DeniedPickupCard"/&gt;
         *             &lt;enumeration value="ReferToIssuer"/&gt;
         *             &lt;enumeration value="EditError"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="AddressResultCode"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;pattern value="[A-Za-z0-9]{1,6}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="CVC_Result"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *             &lt;enumeration value="Match"/&gt;
         *             &lt;enumeration value="DoesNotMatch"/&gt;
         *             &lt;enumeration value="NotProcessed"/&gt;
         *             &lt;enumeration value="Required"/&gt;
         *             &lt;enumeration value="IssuerNotCertified"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AuthorizationResult
            implements Serializable
        {

            @XmlAttribute(name = "AuthorizationCode")
            protected String authorizationCode;
            @XmlAttribute(name = "ApprovalDateTime")
            protected String approvalDateTime;
            @XmlAttribute(name = "Result")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String result;
            @XmlAttribute(name = "AddressResultCode")
            protected String addressResultCode;
            @XmlAttribute(name = "CVC_Result")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String cvc_Result;
            @XmlAttribute(name = "Description")
            protected String description;

            /**
             * Gets the value of the authorizationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthorizationCode() {
                return authorizationCode;
            }

            /**
             * Sets the value of the authorizationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthorizationCode(String value) {
                this.authorizationCode = value;
            }

            /**
             * Gets the value of the approvalDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApprovalDateTime() {
                return approvalDateTime;
            }

            /**
             * Sets the value of the approvalDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApprovalDateTime(String value) {
                this.approvalDateTime = value;
            }

            /**
             * Gets the value of the result property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResult() {
                return result;
            }

            /**
             * Sets the value of the result property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResult(String value) {
                this.result = value;
            }

            /**
             * Gets the value of the addressResultCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressResultCode() {
                return addressResultCode;
            }

            /**
             * Sets the value of the addressResultCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressResultCode(String value) {
                this.addressResultCode = value;
            }

            /**
             * Gets the value of the cvc_Result property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCVC_Result() {
                return cvc_Result;
            }

            /**
             * Sets the value of the cvc_Result property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCVC_Result(String value) {
                this.cvc_Result = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

        }

    }

}

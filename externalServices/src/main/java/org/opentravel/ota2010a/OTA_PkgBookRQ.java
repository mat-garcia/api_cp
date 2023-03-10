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
 *       &lt;sequence&gt;
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}POS_Type" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *         &lt;element name="PackageRequest" type="{http://www.opentravel.org/OTA/2003/05}PackageType" minOccurs="0"/&gt;
 *         &lt;element name="ContactDetail" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" minOccurs="0"/&gt;
 *         &lt;element name="PassengerListItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PassengerListItem" type="{http://www.opentravel.org/OTA/2003/05}PkgPassengerListItem" maxOccurs="99"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OwnInsuranceChoices" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OwnInsuranceChoice" type="{http://www.opentravel.org/OTA/2003/05}OwnInsuranceChoiceType" maxOccurs="9"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PaymentDetail" maxOccurs="9"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType"&gt;
 *                           &lt;attribute name="SecurityCode" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to9999" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReqRespVersion"/&gt;
 *       &lt;attribute name="ActionType" use="required" type="{http://www.opentravel.org/OTA/2003/05}TransactionActionType" /&gt;
 *       &lt;attribute name="ExpectedGrossAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" /&gt;
 *       &lt;attribute name="RequestedCurrency" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pos",
    "uniqueID",
    "packageRequest",
    "contactDetail",
    "passengerListItems",
    "ownInsuranceChoices",
    "paymentDetails",
    "tpa_Extensions"
})
@XmlRootElement(name = "OTA_PkgBookRQ")
public class OTA_PkgBookRQ
    implements Serializable
{

    @XmlElement(name = "POS")
    protected POS_Type pos;
    @XmlElement(name = "UniqueID")
    protected UniqueID_Type uniqueID;
    @XmlElement(name = "PackageRequest")
    protected PackageType packageRequest;
    @XmlElement(name = "ContactDetail")
    protected ContactPersonType contactDetail;
    @XmlElement(name = "PassengerListItems")
    protected OTA_PkgBookRQ.PassengerListItems passengerListItems;
    @XmlElement(name = "OwnInsuranceChoices")
    protected OTA_PkgBookRQ.OwnInsuranceChoices ownInsuranceChoices;
    @XmlElement(name = "PaymentDetails")
    protected OTA_PkgBookRQ.PaymentDetails paymentDetails;
    @XmlElement(name = "TPA_Extensions")
    protected TPA_ExtensionsType tpa_Extensions;
    @XmlAttribute(name = "ActionType", required = true)
    protected TransactionActionType actionType;
    @XmlAttribute(name = "ExpectedGrossAmount")
    protected BigDecimal expectedGrossAmount;
    @XmlAttribute(name = "RequestedCurrency")
    protected String requestedCurrency;
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
    @XmlAttribute(name = "ReqRespVersion")
    protected String reqRespVersion;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link POS_Type }
     *     
     */
    public POS_Type getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POS_Type }
     *     
     */
    public void setPOS(POS_Type value) {
        this.pos = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID_Type }
     *     
     */
    public UniqueID_Type getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID_Type }
     *     
     */
    public void setUniqueID(UniqueID_Type value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the packageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackageRequest() {
        return packageRequest;
    }

    /**
     * Sets the value of the packageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackageRequest(PackageType value) {
        this.packageRequest = value;
    }

    /**
     * Gets the value of the contactDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getContactDetail() {
        return contactDetail;
    }

    /**
     * Sets the value of the contactDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setContactDetail(ContactPersonType value) {
        this.contactDetail = value;
    }

    /**
     * Gets the value of the passengerListItems property.
     * 
     * @return
     *     possible object is
     *     {@link OTA_PkgBookRQ.PassengerListItems }
     *     
     */
    public OTA_PkgBookRQ.PassengerListItems getPassengerListItems() {
        return passengerListItems;
    }

    /**
     * Sets the value of the passengerListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTA_PkgBookRQ.PassengerListItems }
     *     
     */
    public void setPassengerListItems(OTA_PkgBookRQ.PassengerListItems value) {
        this.passengerListItems = value;
    }

    /**
     * Gets the value of the ownInsuranceChoices property.
     * 
     * @return
     *     possible object is
     *     {@link OTA_PkgBookRQ.OwnInsuranceChoices }
     *     
     */
    public OTA_PkgBookRQ.OwnInsuranceChoices getOwnInsuranceChoices() {
        return ownInsuranceChoices;
    }

    /**
     * Sets the value of the ownInsuranceChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTA_PkgBookRQ.OwnInsuranceChoices }
     *     
     */
    public void setOwnInsuranceChoices(OTA_PkgBookRQ.OwnInsuranceChoices value) {
        this.ownInsuranceChoices = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OTA_PkgBookRQ.PaymentDetails }
     *     
     */
    public OTA_PkgBookRQ.PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTA_PkgBookRQ.PaymentDetails }
     *     
     */
    public void setPaymentDetails(OTA_PkgBookRQ.PaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the tpa_Extensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPA_ExtensionsType }
     *     
     */
    public TPA_ExtensionsType getTPA_Extensions() {
        return tpa_Extensions;
    }

    /**
     * Sets the value of the tpa_Extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPA_ExtensionsType }
     *     
     */
    public void setTPA_Extensions(TPA_ExtensionsType value) {
        this.tpa_Extensions = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionActionType }
     *     
     */
    public TransactionActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionActionType }
     *     
     */
    public void setActionType(TransactionActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the expectedGrossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpectedGrossAmount() {
        return expectedGrossAmount;
    }

    /**
     * Sets the value of the expectedGrossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpectedGrossAmount(BigDecimal value) {
        this.expectedGrossAmount = value;
    }

    /**
     * Gets the value of the requestedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedCurrency() {
        return requestedCurrency;
    }

    /**
     * Sets the value of the requestedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedCurrency(String value) {
        this.requestedCurrency = value;
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
     * Gets the value of the reqRespVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRespVersion() {
        return reqRespVersion;
    }

    /**
     * Sets the value of the reqRespVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRespVersion(String value) {
        this.reqRespVersion = value;
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
     *         &lt;element name="OwnInsuranceChoice" type="{http://www.opentravel.org/OTA/2003/05}OwnInsuranceChoiceType" maxOccurs="9"/&gt;
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
        "ownInsuranceChoice"
    })
    public static class OwnInsuranceChoices
        implements Serializable
    {

        @XmlElement(name = "OwnInsuranceChoice", required = true)
        protected List<OwnInsuranceChoiceType> ownInsuranceChoice = new Vector<OwnInsuranceChoiceType>();

        /**
         * Gets the value of the ownInsuranceChoice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ownInsuranceChoice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOwnInsuranceChoice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OwnInsuranceChoiceType }
         * 
         * 
         */
        public List<OwnInsuranceChoiceType> getOwnInsuranceChoice() {
            if (ownInsuranceChoice == null) {
                ownInsuranceChoice = new Vector<OwnInsuranceChoiceType>();
            }
            return this.ownInsuranceChoice;
        }

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
     *         &lt;element name="PassengerListItem" type="{http://www.opentravel.org/OTA/2003/05}PkgPassengerListItem" maxOccurs="99"/&gt;
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
        "passengerListItem"
    })
    public static class PassengerListItems
        implements Serializable
    {

        @XmlElement(name = "PassengerListItem", required = true)
        protected List<PkgPassengerListItem> passengerListItem = new Vector<PkgPassengerListItem>();

        /**
         * Gets the value of the passengerListItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerListItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerListItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PkgPassengerListItem }
         * 
         * 
         */
        public List<PkgPassengerListItem> getPassengerListItem() {
            if (passengerListItem == null) {
                passengerListItem = new Vector<PkgPassengerListItem>();
            }
            return this.passengerListItem;
        }

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
     *         &lt;element name="PaymentDetail" maxOccurs="9"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType"&gt;
     *                 &lt;attribute name="SecurityCode" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to9999" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "paymentDetail"
    })
    public static class PaymentDetails
        implements Serializable
    {

        @XmlElement(name = "PaymentDetail", required = true)
        protected List<OTA_PkgBookRQ.PaymentDetails.PaymentDetail> paymentDetail = new Vector<OTA_PkgBookRQ.PaymentDetails.PaymentDetail>();

        /**
         * Gets the value of the paymentDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTA_PkgBookRQ.PaymentDetails.PaymentDetail }
         * 
         * 
         */
        public List<OTA_PkgBookRQ.PaymentDetails.PaymentDetail> getPaymentDetail() {
            if (paymentDetail == null) {
                paymentDetail = new Vector<OTA_PkgBookRQ.PaymentDetails.PaymentDetail>();
            }
            return this.paymentDetail;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType"&gt;
         *       &lt;attribute name="SecurityCode" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to9999" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentDetail
            extends PaymentDetailType
            implements Serializable
        {

            @XmlAttribute(name = "SecurityCode")
            protected Integer securityCode;

            /**
             * Gets the value of the securityCode property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSecurityCode() {
                return securityCode;
            }

            /**
             * Sets the value of the securityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSecurityCode(Integer value) {
                this.securityCode = value;
            }

        }

    }

}

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
 *         &lt;element name="RailAvailInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OriginDestinationInformation" type="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationType"/&gt;
 *                   &lt;element name="PassengerType" maxOccurs="5" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerCountGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ReturnDateTime" type="{http://www.opentravel.org/OTA/2003/05}TravelDateTimeType" minOccurs="0"/&gt;
 *                   &lt;element name="RailPrefs" type="{http://www.opentravel.org/OTA/2003/05}RailAvailPrefsType" minOccurs="0"/&gt;
 *                   &lt;element name="FareQualifier" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateQualifierCoreGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="MaxChanges" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="TrainNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
 *                 &lt;attribute name="Class" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
 *                 &lt;attribute name="BulletinRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MaxResponsesGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/&gt;
 *       &lt;attribute name="ResponseType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Fares"/&gt;
 *             &lt;enumeration value="Schedules"/&gt;
 *             &lt;enumeration value="Availability"/&gt;
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
@XmlType(name = "", propOrder = {
    "pos",
    "railAvailInfo"
})
@XmlRootElement(name = "OTA_RailAvailRQ")
public class OTA_RailAvailRQ
    implements Serializable
{

    @XmlElement(name = "POS")
    protected POS_Type pos;
    @XmlElement(name = "RailAvailInfo", required = true)
    protected OTA_RailAvailRQ.RailAvailInfo railAvailInfo;
    @XmlAttribute(name = "ResponseType", required = true)
    protected String responseType;
    @XmlAttribute(name = "MaxResponses")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxResponses;
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
     * Gets the value of the railAvailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OTA_RailAvailRQ.RailAvailInfo }
     *     
     */
    public OTA_RailAvailRQ.RailAvailInfo getRailAvailInfo() {
        return railAvailInfo;
    }

    /**
     * Sets the value of the railAvailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTA_RailAvailRQ.RailAvailInfo }
     *     
     */
    public void setRailAvailInfo(OTA_RailAvailRQ.RailAvailInfo value) {
        this.railAvailInfo = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the maxResponses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxResponses() {
        return maxResponses;
    }

    /**
     * Sets the value of the maxResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxResponses(BigInteger value) {
        this.maxResponses = value;
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
     *         &lt;element name="OriginDestinationInformation" type="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationType"/&gt;
     *         &lt;element name="PassengerType" maxOccurs="5" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerCountGroup"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ReturnDateTime" type="{http://www.opentravel.org/OTA/2003/05}TravelDateTimeType" minOccurs="0"/&gt;
     *         &lt;element name="RailPrefs" type="{http://www.opentravel.org/OTA/2003/05}RailAvailPrefsType" minOccurs="0"/&gt;
     *         &lt;element name="FareQualifier" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateQualifierCoreGroup"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="MaxChanges" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="TrainNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
     *       &lt;attribute name="Class" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
     *       &lt;attribute name="BulletinRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originDestinationInformation",
        "passengerType",
        "returnDateTime",
        "railPrefs",
        "fareQualifier"
    })
    public static class RailAvailInfo
        implements Serializable
    {

        @XmlElement(name = "OriginDestinationInformation", required = true)
        protected OriginDestinationInformationType originDestinationInformation;
        @XmlElement(name = "PassengerType")
        protected List<OTA_RailAvailRQ.RailAvailInfo.PassengerType> passengerType = new Vector<OTA_RailAvailRQ.RailAvailInfo.PassengerType>();
        @XmlElement(name = "ReturnDateTime")
        protected TravelDateTimeType returnDateTime;
        @XmlElement(name = "RailPrefs")
        protected RailAvailPrefsType railPrefs;
        @XmlElement(name = "FareQualifier")
        protected OTA_RailAvailRQ.RailAvailInfo.FareQualifier fareQualifier;
        @XmlAttribute(name = "MaxChanges")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxChanges;
        @XmlAttribute(name = "TrainNumber")
        protected String trainNumber;
        @XmlAttribute(name = "Class")
        protected String clazz;
        @XmlAttribute(name = "BulletinRequired")
        protected Boolean bulletinRequired;

        /**
         * Gets the value of the originDestinationInformation property.
         * 
         * @return
         *     possible object is
         *     {@link OriginDestinationInformationType }
         *     
         */
        public OriginDestinationInformationType getOriginDestinationInformation() {
            return originDestinationInformation;
        }

        /**
         * Sets the value of the originDestinationInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginDestinationInformationType }
         *     
         */
        public void setOriginDestinationInformation(OriginDestinationInformationType value) {
            this.originDestinationInformation = value;
        }

        /**
         * Gets the value of the passengerType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTA_RailAvailRQ.RailAvailInfo.PassengerType }
         * 
         * 
         */
        public List<OTA_RailAvailRQ.RailAvailInfo.PassengerType> getPassengerType() {
            if (passengerType == null) {
                passengerType = new Vector<OTA_RailAvailRQ.RailAvailInfo.PassengerType>();
            }
            return this.passengerType;
        }

        /**
         * Gets the value of the returnDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link TravelDateTimeType }
         *     
         */
        public TravelDateTimeType getReturnDateTime() {
            return returnDateTime;
        }

        /**
         * Sets the value of the returnDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelDateTimeType }
         *     
         */
        public void setReturnDateTime(TravelDateTimeType value) {
            this.returnDateTime = value;
        }

        /**
         * Gets the value of the railPrefs property.
         * 
         * @return
         *     possible object is
         *     {@link RailAvailPrefsType }
         *     
         */
        public RailAvailPrefsType getRailPrefs() {
            return railPrefs;
        }

        /**
         * Sets the value of the railPrefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link RailAvailPrefsType }
         *     
         */
        public void setRailPrefs(RailAvailPrefsType value) {
            this.railPrefs = value;
        }

        /**
         * Gets the value of the fareQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link OTA_RailAvailRQ.RailAvailInfo.FareQualifier }
         *     
         */
        public OTA_RailAvailRQ.RailAvailInfo.FareQualifier getFareQualifier() {
            return fareQualifier;
        }

        /**
         * Sets the value of the fareQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTA_RailAvailRQ.RailAvailInfo.FareQualifier }
         *     
         */
        public void setFareQualifier(OTA_RailAvailRQ.RailAvailInfo.FareQualifier value) {
            this.fareQualifier = value;
        }

        /**
         * Gets the value of the maxChanges property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxChanges() {
            return maxChanges;
        }

        /**
         * Sets the value of the maxChanges property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxChanges(BigInteger value) {
            this.maxChanges = value;
        }

        /**
         * Gets the value of the trainNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrainNumber() {
            return trainNumber;
        }

        /**
         * Sets the value of the trainNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrainNumber(String value) {
            this.trainNumber = value;
        }

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClazz(String value) {
            this.clazz = value;
        }

        /**
         * Gets the value of the bulletinRequired property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBulletinRequired() {
            return bulletinRequired;
        }

        /**
         * Sets the value of the bulletinRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBulletinRequired(Boolean value) {
            this.bulletinRequired = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateQualifierCoreGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FareQualifier
            implements Serializable
        {

            @XmlAttribute(name = "TravelPurpose")
            protected String travelPurpose;
            @XmlAttribute(name = "RateCategory")
            protected String rateCategory;
            @XmlAttribute(name = "CorpDiscountNmbr")
            protected String corpDiscountNmbr;
            @XmlAttribute(name = "RateQualifier")
            protected String rateQualifier;
            @XmlAttribute(name = "RatePeriod")
            protected RatePeriodSimpleType ratePeriod;
            @XmlAttribute(name = "GuaranteedInd")
            protected Boolean guaranteedInd;
            @XmlAttribute(name = "PromotionCode")
            protected String promotionCode;
            @XmlAttribute(name = "PromotionVendorCode")
            protected List<String> promotionVendorCode = new Vector<String>();

            /**
             * Gets the value of the travelPurpose property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTravelPurpose() {
                return travelPurpose;
            }

            /**
             * Sets the value of the travelPurpose property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTravelPurpose(String value) {
                this.travelPurpose = value;
            }

            /**
             * Gets the value of the rateCategory property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRateCategory() {
                return rateCategory;
            }

            /**
             * Sets the value of the rateCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRateCategory(String value) {
                this.rateCategory = value;
            }

            /**
             * Gets the value of the corpDiscountNmbr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorpDiscountNmbr() {
                return corpDiscountNmbr;
            }

            /**
             * Sets the value of the corpDiscountNmbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorpDiscountNmbr(String value) {
                this.corpDiscountNmbr = value;
            }

            /**
             * Gets the value of the rateQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRateQualifier() {
                return rateQualifier;
            }

            /**
             * Sets the value of the rateQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRateQualifier(String value) {
                this.rateQualifier = value;
            }

            /**
             * Gets the value of the ratePeriod property.
             * 
             * @return
             *     possible object is
             *     {@link RatePeriodSimpleType }
             *     
             */
            public RatePeriodSimpleType getRatePeriod() {
                return ratePeriod;
            }

            /**
             * Sets the value of the ratePeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link RatePeriodSimpleType }
             *     
             */
            public void setRatePeriod(RatePeriodSimpleType value) {
                this.ratePeriod = value;
            }

            /**
             * Gets the value of the guaranteedInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isGuaranteedInd() {
                return guaranteedInd;
            }

            /**
             * Sets the value of the guaranteedInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setGuaranteedInd(Boolean value) {
                this.guaranteedInd = value;
            }

            /**
             * Gets the value of the promotionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPromotionCode() {
                return promotionCode;
            }

            /**
             * Sets the value of the promotionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPromotionCode(String value) {
                this.promotionCode = value;
            }

            /**
             * Gets the value of the promotionVendorCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPromotionVendorCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getPromotionVendorCode() {
                if (promotionVendorCode == null) {
                    promotionVendorCode = new Vector<String>();
                }
                return this.promotionVendorCode;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerCountGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PassengerType
            implements Serializable
        {

            @XmlAttribute(name = "Age")
            protected Integer age;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "URI")
            @XmlSchemaType(name = "anyURI")
            protected String uri;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;

            /**
             * Gets the value of the age property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAge() {
                return age;
            }

            /**
             * Sets the value of the age property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAge(Integer value) {
                this.age = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * Sets the value of the codeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

            /**
             * Gets the value of the uri property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getURI() {
                return uri;
            }

            /**
             * Sets the value of the uri property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setURI(String value) {
                this.uri = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

        }

    }

}
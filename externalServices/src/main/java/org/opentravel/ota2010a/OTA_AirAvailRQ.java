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
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}POS_Type"/&gt;
 *         &lt;element name="ProcessingInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirProcessingInfoGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OriginDestinationInformation" maxOccurs="99"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SpecificFlightInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecificFlightInfoType"&gt;
 *                           &lt;attribute name="PollingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TravelPreferences" type="{http://www.opentravel.org/OTA/2003/05}AirSearchPrefsType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="SameAirportInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SpecificFlightInfo" type="{http://www.opentravel.org/OTA/2003/05}SpecificFlightInfoType" minOccurs="0"/&gt;
 *         &lt;element name="TravelPreferences" type="{http://www.opentravel.org/OTA/2003/05}AirSearchPrefsType" minOccurs="0"/&gt;
 *         &lt;element name="TravelerInfoSummary" type="{http://www.opentravel.org/OTA/2003/05}TravelerInfoSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="BookedFlightSegment" type="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MaxResponsesGroup"/&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DirectAndStopsGroup"/&gt;
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
    "pos",
    "processingInfo",
    "originDestinationInformation",
    "specificFlightInfo",
    "travelPreferences",
    "travelerInfoSummary",
    "bookedFlightSegment"
})
@XmlRootElement(name = "OTA_AirAvailRQ")
public class OTA_AirAvailRQ
    implements Serializable
{

    @XmlElement(name = "POS", required = true)
    protected POS_Type pos;
    @XmlElement(name = "ProcessingInfo")
    protected OTA_AirAvailRQ.ProcessingInfo processingInfo;
    @XmlElement(name = "OriginDestinationInformation", required = true)
    protected List<OTA_AirAvailRQ.OriginDestinationInformation> originDestinationInformation = new Vector<OTA_AirAvailRQ.OriginDestinationInformation>();
    @XmlElement(name = "SpecificFlightInfo")
    protected SpecificFlightInfoType specificFlightInfo;
    @XmlElement(name = "TravelPreferences")
    protected AirSearchPrefsType travelPreferences;
    @XmlElement(name = "TravelerInfoSummary")
    protected TravelerInfoSummaryType travelerInfoSummary;
    @XmlElement(name = "BookedFlightSegment")
    protected List<BookFlightSegmentType> bookedFlightSegment = new Vector<BookFlightSegmentType>();
    @XmlAttribute(name = "MaxResponses")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxResponses;
    @XmlAttribute(name = "DirectFlightsOnly")
    protected Boolean directFlightsOnly;
    @XmlAttribute(name = "NumberStops")
    protected Integer numberStops;
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
     * Gets the value of the processingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OTA_AirAvailRQ.ProcessingInfo }
     *     
     */
    public OTA_AirAvailRQ.ProcessingInfo getProcessingInfo() {
        return processingInfo;
    }

    /**
     * Sets the value of the processingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTA_AirAvailRQ.ProcessingInfo }
     *     
     */
    public void setProcessingInfo(OTA_AirAvailRQ.ProcessingInfo value) {
        this.processingInfo = value;
    }

    /**
     * Gets the value of the originDestinationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTA_AirAvailRQ.OriginDestinationInformation }
     * 
     * 
     */
    public List<OTA_AirAvailRQ.OriginDestinationInformation> getOriginDestinationInformation() {
        if (originDestinationInformation == null) {
            originDestinationInformation = new Vector<OTA_AirAvailRQ.OriginDestinationInformation>();
        }
        return this.originDestinationInformation;
    }

    /**
     * Gets the value of the specificFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificFlightInfoType }
     *     
     */
    public SpecificFlightInfoType getSpecificFlightInfo() {
        return specificFlightInfo;
    }

    /**
     * Sets the value of the specificFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificFlightInfoType }
     *     
     */
    public void setSpecificFlightInfo(SpecificFlightInfoType value) {
        this.specificFlightInfo = value;
    }

    /**
     * Gets the value of the travelPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchPrefsType }
     *     
     */
    public AirSearchPrefsType getTravelPreferences() {
        return travelPreferences;
    }

    /**
     * Sets the value of the travelPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchPrefsType }
     *     
     */
    public void setTravelPreferences(AirSearchPrefsType value) {
        this.travelPreferences = value;
    }

    /**
     * Gets the value of the travelerInfoSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoSummaryType }
     *     
     */
    public TravelerInfoSummaryType getTravelerInfoSummary() {
        return travelerInfoSummary;
    }

    /**
     * Sets the value of the travelerInfoSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoSummaryType }
     *     
     */
    public void setTravelerInfoSummary(TravelerInfoSummaryType value) {
        this.travelerInfoSummary = value;
    }

    /**
     * Gets the value of the bookedFlightSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookedFlightSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookedFlightSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookFlightSegmentType }
     * 
     * 
     */
    public List<BookFlightSegmentType> getBookedFlightSegment() {
        if (bookedFlightSegment == null) {
            bookedFlightSegment = new Vector<BookFlightSegmentType>();
        }
        return this.bookedFlightSegment;
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
     * Gets the value of the directFlightsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectFlightsOnly() {
        return directFlightsOnly;
    }

    /**
     * Sets the value of the directFlightsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectFlightsOnly(Boolean value) {
        this.directFlightsOnly = value;
    }

    /**
     * Gets the value of the numberStops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberStops() {
        return numberStops;
    }

    /**
     * Sets the value of the numberStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberStops(Integer value) {
        this.numberStops = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformationType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SpecificFlightInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecificFlightInfoType"&gt;
     *                 &lt;attribute name="PollingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TravelPreferences" type="{http://www.opentravel.org/OTA/2003/05}AirSearchPrefsType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="SameAirportInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specificFlightInfo",
        "travelPreferences"
    })
    public static class OriginDestinationInformation
        extends OriginDestinationInformationType
        implements Serializable
    {

        @XmlElement(name = "SpecificFlightInfo")
        protected OTA_AirAvailRQ.OriginDestinationInformation.SpecificFlightInfo specificFlightInfo;
        @XmlElement(name = "TravelPreferences")
        protected AirSearchPrefsType travelPreferences;
        @XmlAttribute(name = "SameAirportInd")
        protected Boolean sameAirportInd;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Gets the value of the specificFlightInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OTA_AirAvailRQ.OriginDestinationInformation.SpecificFlightInfo }
         *     
         */
        public OTA_AirAvailRQ.OriginDestinationInformation.SpecificFlightInfo getSpecificFlightInfo() {
            return specificFlightInfo;
        }

        /**
         * Sets the value of the specificFlightInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTA_AirAvailRQ.OriginDestinationInformation.SpecificFlightInfo }
         *     
         */
        public void setSpecificFlightInfo(OTA_AirAvailRQ.OriginDestinationInformation.SpecificFlightInfo value) {
            this.specificFlightInfo = value;
        }

        /**
         * Gets the value of the travelPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link AirSearchPrefsType }
         *     
         */
        public AirSearchPrefsType getTravelPreferences() {
            return travelPreferences;
        }

        /**
         * Sets the value of the travelPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirSearchPrefsType }
         *     
         */
        public void setTravelPreferences(AirSearchPrefsType value) {
            this.travelPreferences = value;
        }

        /**
         * Gets the value of the sameAirportInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSameAirportInd() {
            return sameAirportInd;
        }

        /**
         * Sets the value of the sameAirportInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSameAirportInd(Boolean value) {
            this.sameAirportInd = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecificFlightInfoType"&gt;
         *       &lt;attribute name="PollingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SpecificFlightInfo
            extends SpecificFlightInfoType
            implements Serializable
        {

            @XmlAttribute(name = "PollingIndicator")
            protected Boolean pollingIndicator;

            /**
             * Gets the value of the pollingIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPollingIndicator() {
                return pollingIndicator;
            }

            /**
             * Sets the value of the pollingIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPollingIndicator(Boolean value) {
                this.pollingIndicator = value;
            }

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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirProcessingInfoGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProcessingInfo
        implements Serializable
    {

        @XmlAttribute(name = "TargetSource")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String targetSource;
        @XmlAttribute(name = "FlightSvcInfoIndicator")
        protected Boolean flightSvcInfoIndicator;
        @XmlAttribute(name = "DisplayOrder")
        protected DisplayOrderType displayOrder;
        @XmlAttribute(name = "ReducedDataIndicator")
        protected Boolean reducedDataIndicator;
        @XmlAttribute(name = "BaseFaresOnlyIndicator")
        protected Boolean baseFaresOnlyIndicator;
        @XmlAttribute(name = "SearchType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String searchType;
        @XmlAttribute(name = "AvailabilityIndicator")
        protected Boolean availabilityIndicator;

        /**
         * Gets the value of the targetSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetSource() {
            return targetSource;
        }

        /**
         * Sets the value of the targetSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetSource(String value) {
            this.targetSource = value;
        }

        /**
         * Gets the value of the flightSvcInfoIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFlightSvcInfoIndicator() {
            return flightSvcInfoIndicator;
        }

        /**
         * Sets the value of the flightSvcInfoIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFlightSvcInfoIndicator(Boolean value) {
            this.flightSvcInfoIndicator = value;
        }

        /**
         * Gets the value of the displayOrder property.
         * 
         * @return
         *     possible object is
         *     {@link DisplayOrderType }
         *     
         */
        public DisplayOrderType getDisplayOrder() {
            return displayOrder;
        }

        /**
         * Sets the value of the displayOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link DisplayOrderType }
         *     
         */
        public void setDisplayOrder(DisplayOrderType value) {
            this.displayOrder = value;
        }

        /**
         * Gets the value of the reducedDataIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReducedDataIndicator() {
            return reducedDataIndicator;
        }

        /**
         * Sets the value of the reducedDataIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReducedDataIndicator(Boolean value) {
            this.reducedDataIndicator = value;
        }

        /**
         * Gets the value of the baseFaresOnlyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBaseFaresOnlyIndicator() {
            return baseFaresOnlyIndicator;
        }

        /**
         * Sets the value of the baseFaresOnlyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBaseFaresOnlyIndicator(Boolean value) {
            this.baseFaresOnlyIndicator = value;
        }

        /**
         * Gets the value of the searchType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchType() {
            return searchType;
        }

        /**
         * Sets the value of the searchType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchType(String value) {
            this.searchType = value;
        }

        /**
         * Gets the value of the availabilityIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailabilityIndicator() {
            return availabilityIndicator;
        }

        /**
         * Sets the value of the availabilityIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailabilityIndicator(Boolean value) {
            this.availabilityIndicator = value;
        }

    }

}
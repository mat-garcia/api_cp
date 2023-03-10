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
 *           &lt;element name="SelectedSailing"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedSailingGroup"/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="CruiseItinInfos"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="CruiseItinInfo" maxOccurs="99"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="DateTimeDescription" maxOccurs="9"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;attribute name="DateTimeQualifier" use="required"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                             &lt;enumeration value="arrival"/&gt;
 *                                             &lt;enumeration value="departure"/&gt;
 *                                             &lt;enumeration value="stay"/&gt;
 *                                             &lt;enumeration value="boarding"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/attribute&gt;
 *                                       &lt;attribute name="DateTimeDetails" use="required" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
 *                                       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationInfoGroup"/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
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
    "selectedSailing",
    "cruiseItinInfos",
    "errors"
})
@XmlRootElement(name = "OTA_CruiseItineraryDescRS")
public class OTA_CruiseItineraryDescRS
    implements Serializable
{

    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "SelectedSailing")
    protected OTA_CruiseItineraryDescRS.SelectedSailing selectedSailing;
    @XmlElement(name = "CruiseItinInfos")
    protected OTA_CruiseItineraryDescRS.CruiseItinInfos cruiseItinInfos;
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
     * Gets the value of the selectedSailing property.
     * 
     * @return
     *     possible object is
     *     {@link OTA_CruiseItineraryDescRS.SelectedSailing }
     *     
     */
    public OTA_CruiseItineraryDescRS.SelectedSailing getSelectedSailing() {
        return selectedSailing;
    }

    /**
     * Sets the value of the selectedSailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTA_CruiseItineraryDescRS.SelectedSailing }
     *     
     */
    public void setSelectedSailing(OTA_CruiseItineraryDescRS.SelectedSailing value) {
        this.selectedSailing = value;
    }

    /**
     * Gets the value of the cruiseItinInfos property.
     * 
     * @return
     *     possible object is
     *     {@link OTA_CruiseItineraryDescRS.CruiseItinInfos }
     *     
     */
    public OTA_CruiseItineraryDescRS.CruiseItinInfos getCruiseItinInfos() {
        return cruiseItinInfos;
    }

    /**
     * Sets the value of the cruiseItinInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTA_CruiseItineraryDescRS.CruiseItinInfos }
     *     
     */
    public void setCruiseItinInfos(OTA_CruiseItineraryDescRS.CruiseItinInfos value) {
        this.cruiseItinInfos = value;
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
     *         &lt;element name="CruiseItinInfo" maxOccurs="99"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DateTimeDescription" maxOccurs="9"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="DateTimeQualifier" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                                 &lt;enumeration value="arrival"/&gt;
     *                                 &lt;enumeration value="departure"/&gt;
     *                                 &lt;enumeration value="stay"/&gt;
     *                                 &lt;enumeration value="boarding"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="DateTimeDetails" use="required" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
     *                           &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationInfoGroup"/&gt;
     *               &lt;/restriction&gt;
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
        "cruiseItinInfo"
    })
    public static class CruiseItinInfos
        implements Serializable
    {

        @XmlElement(name = "CruiseItinInfo", required = true)
        protected List<OTA_CruiseItineraryDescRS.CruiseItinInfos.CruiseItinInfo> cruiseItinInfo = new Vector<OTA_CruiseItineraryDescRS.CruiseItinInfos.CruiseItinInfo>();

        /**
         * Gets the value of the cruiseItinInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cruiseItinInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCruiseItinInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTA_CruiseItineraryDescRS.CruiseItinInfos.CruiseItinInfo }
         * 
         * 
         */
        public List<OTA_CruiseItineraryDescRS.CruiseItinInfos.CruiseItinInfo> getCruiseItinInfo() {
            if (cruiseItinInfo == null) {
                cruiseItinInfo = new Vector<OTA_CruiseItineraryDescRS.CruiseItinInfos.CruiseItinInfo>();
            }
            return this.cruiseItinInfo;
        }


        /**
         * Used to specify detailed cruise itinerary information.
         * 
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="DateTimeDescription" maxOccurs="9"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="DateTimeQualifier" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *                       &lt;enumeration value="arrival"/&gt;
         *                       &lt;enumeration value="departure"/&gt;
         *                       &lt;enumeration value="stay"/&gt;
         *                       &lt;enumeration value="boarding"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="DateTimeDetails" use="required" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
         *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationInfoGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dateTimeDescription",
            "information"
        })
        public static class CruiseItinInfo
            implements Serializable
        {

            @XmlElement(name = "DateTimeDescription", required = true)
            protected List<OTA_CruiseItineraryDescRS.CruiseItinInfos.CruiseItinInfo.DateTimeDescription> dateTimeDescription = new Vector<OTA_CruiseItineraryDescRS.CruiseItinInfos.CruiseItinInfo.DateTimeDescription>();
            @XmlElement(name = "Information")
            protected ParagraphType information;
            @XmlAttribute(name = "PortCode")
            protected String portCode;
            @XmlAttribute(name = "PortName")
            protected String portName;
            @XmlAttribute(name = "PortCountryCode")
            protected String portCountryCode;
            @XmlAttribute(name = "DockIndicator")
            protected Boolean dockIndicator;
            @XmlAttribute(name = "ShorexIndicator")
            protected Boolean shorexIndicator;

            /**
             * Gets the value of the dateTimeDescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dateTimeDescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDateTimeDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OTA_CruiseItineraryDescRS.CruiseItinInfos.CruiseItinInfo.DateTimeDescription }
             * 
             * 
             */
            public List<OTA_CruiseItineraryDescRS.CruiseItinInfos.CruiseItinInfo.DateTimeDescription> getDateTimeDescription() {
                if (dateTimeDescription == null) {
                    dateTimeDescription = new Vector<OTA_CruiseItineraryDescRS.CruiseItinInfos.CruiseItinInfo.DateTimeDescription>();
                }
                return this.dateTimeDescription;
            }

            /**
             * Gets the value of the information property.
             * 
             * @return
             *     possible object is
             *     {@link ParagraphType }
             *     
             */
            public ParagraphType getInformation() {
                return information;
            }

            /**
             * Sets the value of the information property.
             * 
             * @param value
             *     allowed object is
             *     {@link ParagraphType }
             *     
             */
            public void setInformation(ParagraphType value) {
                this.information = value;
            }

            /**
             * Gets the value of the portCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPortCode() {
                return portCode;
            }

            /**
             * Sets the value of the portCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPortCode(String value) {
                this.portCode = value;
            }

            /**
             * Gets the value of the portName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPortName() {
                return portName;
            }

            /**
             * Sets the value of the portName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPortName(String value) {
                this.portName = value;
            }

            /**
             * Gets the value of the portCountryCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPortCountryCode() {
                return portCountryCode;
            }

            /**
             * Sets the value of the portCountryCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPortCountryCode(String value) {
                this.portCountryCode = value;
            }

            /**
             * Gets the value of the dockIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDockIndicator() {
                return dockIndicator;
            }

            /**
             * Sets the value of the dockIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDockIndicator(Boolean value) {
                this.dockIndicator = value;
            }

            /**
             * Gets the value of the shorexIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isShorexIndicator() {
                return shorexIndicator;
            }

            /**
             * Sets the value of the shorexIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setShorexIndicator(Boolean value) {
                this.shorexIndicator = value;
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
             *       &lt;attribute name="DateTimeQualifier" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
             *             &lt;enumeration value="arrival"/&gt;
             *             &lt;enumeration value="departure"/&gt;
             *             &lt;enumeration value="stay"/&gt;
             *             &lt;enumeration value="boarding"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="DateTimeDetails" use="required" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
             *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DateTimeDescription
                implements Serializable
            {

                @XmlAttribute(name = "DateTimeQualifier", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String dateTimeQualifier;
                @XmlAttribute(name = "DateTimeDetails", required = true)
                protected String dateTimeDetails;
                @XmlAttribute(name = "DayOfWeek")
                protected DayOfWeekType dayOfWeek;

                /**
                 * Gets the value of the dateTimeQualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDateTimeQualifier() {
                    return dateTimeQualifier;
                }

                /**
                 * Sets the value of the dateTimeQualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDateTimeQualifier(String value) {
                    this.dateTimeQualifier = value;
                }

                /**
                 * Gets the value of the dateTimeDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDateTimeDetails() {
                    return dateTimeDetails;
                }

                /**
                 * Sets the value of the dateTimeDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDateTimeDetails(String value) {
                    this.dateTimeDetails = value;
                }

                /**
                 * Gets the value of the dayOfWeek property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DayOfWeekType }
                 *     
                 */
                public DayOfWeekType getDayOfWeek() {
                    return dayOfWeek;
                }

                /**
                 * Sets the value of the dayOfWeek property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DayOfWeekType }
                 *     
                 */
                public void setDayOfWeek(DayOfWeekType value) {
                    this.dayOfWeek = value;
                }

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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SelectedSailingGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedSailing
        implements Serializable
    {

        @XmlAttribute(name = "VoyageID")
        protected String voyageID;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "VendorCode")
        protected String vendorCode;
        @XmlAttribute(name = "VendorName")
        protected String vendorName;
        @XmlAttribute(name = "ShipCode")
        protected String shipCode;
        @XmlAttribute(name = "ShipName")
        protected String shipName;
        @XmlAttribute(name = "VendorCodeContext")
        protected String vendorCodeContext;

        /**
         * Gets the value of the voyageID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoyageID() {
            return voyageID;
        }

        /**
         * Sets the value of the voyageID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoyageID(String value) {
            this.voyageID = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * Gets the value of the vendorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCode() {
            return vendorCode;
        }

        /**
         * Sets the value of the vendorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        /**
         * Gets the value of the vendorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorName() {
            return vendorName;
        }

        /**
         * Sets the value of the vendorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorName(String value) {
            this.vendorName = value;
        }

        /**
         * Gets the value of the shipCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipCode() {
            return shipCode;
        }

        /**
         * Sets the value of the shipCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipCode(String value) {
            this.shipCode = value;
        }

        /**
         * Gets the value of the shipName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipName() {
            return shipName;
        }

        /**
         * Sets the value of the shipName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipName(String value) {
            this.shipName = value;
        }

        /**
         * Gets the value of the vendorCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCodeContext() {
            return vendorCodeContext;
        }

        /**
         * Sets the value of the vendorCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCodeContext(String value) {
            this.vendorCodeContext = value;
        }

    }

}

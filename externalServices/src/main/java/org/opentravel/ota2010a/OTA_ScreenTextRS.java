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
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType"/&gt;
 *             &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="TextScreens" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TextScreen" maxOccurs="999"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TextData" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ScreenSequenceNum" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to999" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/&gt;
 *                 &lt;attribute name="ScreenLineInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ScreenRowsNum" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to5" /&gt;
 *                 &lt;attribute name="ScreenColumnsNum" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to5" /&gt;
 *                 &lt;attribute name="MergeScreenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/&gt;
 *       &lt;attribute name="MessageFunction" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to64" /&gt;
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
    "errors",
    "textScreens"
})
@XmlRootElement(name = "OTA_ScreenTextRS")
public class OTA_ScreenTextRS
    implements Serializable
{

    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "TextScreens")
    protected OTA_ScreenTextRS.TextScreens textScreens;
    @XmlAttribute(name = "MessageFunction")
    protected String messageFunction;
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
     * Gets the value of the textScreens property.
     * 
     * @return
     *     possible object is
     *     {@link OTA_ScreenTextRS.TextScreens }
     *     
     */
    public OTA_ScreenTextRS.TextScreens getTextScreens() {
        return textScreens;
    }

    /**
     * Sets the value of the textScreens property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTA_ScreenTextRS.TextScreens }
     *     
     */
    public void setTextScreens(OTA_ScreenTextRS.TextScreens value) {
        this.textScreens = value;
    }

    /**
     * Gets the value of the messageFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageFunction() {
        return messageFunction;
    }

    /**
     * Sets the value of the messageFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageFunction(String value) {
        this.messageFunction = value;
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
     *         &lt;element name="TextScreen" maxOccurs="999"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TextData" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ScreenSequenceNum" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to999" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/&gt;
     *       &lt;attribute name="ScreenLineInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ScreenRowsNum" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to5" /&gt;
     *       &lt;attribute name="ScreenColumnsNum" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to5" /&gt;
     *       &lt;attribute name="MergeScreenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "textScreen"
    })
    public static class TextScreens
        implements Serializable
    {

        @XmlElement(name = "TextScreen", required = true)
        protected List<OTA_ScreenTextRS.TextScreens.TextScreen> textScreen = new Vector<OTA_ScreenTextRS.TextScreens.TextScreen>();
        @XmlAttribute(name = "ScreenLineInd")
        protected Boolean screenLineInd;
        @XmlAttribute(name = "ScreenRowsNum")
        protected String screenRowsNum;
        @XmlAttribute(name = "ScreenColumnsNum")
        protected String screenColumnsNum;
        @XmlAttribute(name = "MergeScreenIndicator")
        protected Boolean mergeScreenIndicator;
        @XmlAttribute(name = "MoreIndicator")
        protected Boolean moreIndicator;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;

        /**
         * Gets the value of the textScreen property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the textScreen property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTextScreen().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTA_ScreenTextRS.TextScreens.TextScreen }
         * 
         * 
         */
        public List<OTA_ScreenTextRS.TextScreens.TextScreen> getTextScreen() {
            if (textScreen == null) {
                textScreen = new Vector<OTA_ScreenTextRS.TextScreens.TextScreen>();
            }
            return this.textScreen;
        }

        /**
         * Gets the value of the screenLineInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isScreenLineInd() {
            return screenLineInd;
        }

        /**
         * Sets the value of the screenLineInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setScreenLineInd(Boolean value) {
            this.screenLineInd = value;
        }

        /**
         * Gets the value of the screenRowsNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScreenRowsNum() {
            return screenRowsNum;
        }

        /**
         * Sets the value of the screenRowsNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScreenRowsNum(String value) {
            this.screenRowsNum = value;
        }

        /**
         * Gets the value of the screenColumnsNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScreenColumnsNum() {
            return screenColumnsNum;
        }

        /**
         * Sets the value of the screenColumnsNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScreenColumnsNum(String value) {
            this.screenColumnsNum = value;
        }

        /**
         * Gets the value of the mergeScreenIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMergeScreenIndicator() {
            return mergeScreenIndicator;
        }

        /**
         * Sets the value of the mergeScreenIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMergeScreenIndicator(Boolean value) {
            this.mergeScreenIndicator = value;
        }

        /**
         * Gets the value of the moreIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMoreIndicator() {
            return moreIndicator;
        }

        /**
         * Sets the value of the moreIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMoreIndicator(Boolean value) {
            this.moreIndicator = value;
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
         *         &lt;element name="TextData" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ScreenSequenceNum" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to999" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "textData"
        })
        public static class TextScreen
            implements Serializable
        {

            @XmlElement(name = "TextData", required = true)
            protected List<String> textData = new Vector<String>();
            @XmlAttribute(name = "ScreenSequenceNum")
            protected Integer screenSequenceNum;

            /**
             * Gets the value of the textData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the textData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTextData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTextData() {
                if (textData == null) {
                    textData = new Vector<String>();
                }
                return this.textData;
            }

            /**
             * Gets the value of the screenSequenceNum property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getScreenSequenceNum() {
                return screenSequenceNum;
            }

            /**
             * Sets the value of the screenSequenceNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setScreenSequenceNum(Integer value) {
                this.screenSequenceNum = value;
            }

        }

    }

}

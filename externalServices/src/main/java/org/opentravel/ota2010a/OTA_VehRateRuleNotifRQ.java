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
 *         &lt;element name="Rules"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Rule" maxOccurs="999"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateRulesType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ProcessingInfo"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProcessingInfoGroup"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RuleText" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RuleQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ReqRespVersion"/&gt;
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
    "rules"
})
@XmlRootElement(name = "OTA_VehRateRuleNotifRQ")
public class OTA_VehRateRuleNotifRQ
    implements Serializable
{

    @XmlElement(name = "POS", required = true)
    protected POS_Type pos;
    @XmlElement(name = "Rules", required = true)
    protected OTA_VehRateRuleNotifRQ.Rules rules;
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
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link OTA_VehRateRuleNotifRQ.Rules }
     *     
     */
    public OTA_VehRateRuleNotifRQ.Rules getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTA_VehRateRuleNotifRQ.Rules }
     *     
     */
    public void setRules(OTA_VehRateRuleNotifRQ.Rules value) {
        this.rules = value;
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
     *         &lt;element name="Rule" maxOccurs="999"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateRulesType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ProcessingInfo"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProcessingInfoGroup"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RuleText" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RuleQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rule"
    })
    public static class Rules
        implements Serializable
    {

        @XmlElement(name = "Rule", required = true)
        protected List<OTA_VehRateRuleNotifRQ.Rules.Rule> rule = new Vector<OTA_VehRateRuleNotifRQ.Rules.Rule>();
        @XmlAttribute(name = "RuleQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger ruleQuantity;

        /**
         * Gets the value of the rule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OTA_VehRateRuleNotifRQ.Rules.Rule }
         * 
         * 
         */
        public List<OTA_VehRateRuleNotifRQ.Rules.Rule> getRule() {
            if (rule == null) {
                rule = new Vector<OTA_VehRateRuleNotifRQ.Rules.Rule>();
            }
            return this.rule;
        }

        /**
         * Gets the value of the ruleQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRuleQuantity() {
            return ruleQuantity;
        }

        /**
         * Sets the value of the ruleQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRuleQuantity(BigInteger value) {
            this.ruleQuantity = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateRulesType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ProcessingInfo"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProcessingInfoGroup"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="RuleText" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "processingInfo",
            "ruleText"
        })
        public static class Rule
            extends RateRulesType
            implements Serializable
        {

            @XmlElement(name = "ProcessingInfo", required = true)
            protected OTA_VehRateRuleNotifRQ.Rules.Rule.ProcessingInfo processingInfo;
            @XmlElement(name = "RuleText")
            protected FormattedTextTextType ruleText;
            @XmlAttribute(name = "ID")
            protected String id;

            /**
             * Gets the value of the processingInfo property.
             * 
             * @return
             *     possible object is
             *     {@link OTA_VehRateRuleNotifRQ.Rules.Rule.ProcessingInfo }
             *     
             */
            public OTA_VehRateRuleNotifRQ.Rules.Rule.ProcessingInfo getProcessingInfo() {
                return processingInfo;
            }

            /**
             * Sets the value of the processingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link OTA_VehRateRuleNotifRQ.Rules.Rule.ProcessingInfo }
             *     
             */
            public void setProcessingInfo(OTA_VehRateRuleNotifRQ.Rules.Rule.ProcessingInfo value) {
                this.processingInfo = value;
            }

            /**
             * Gets the value of the ruleText property.
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextTextType }
             *     
             */
            public FormattedTextTextType getRuleText() {
                return ruleText;
            }

            /**
             * Sets the value of the ruleText property.
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextTextType }
             *     
             */
            public void setRuleText(FormattedTextTextType value) {
                this.ruleText = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProcessingInfoGroup"/&gt;
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

                @XmlAttribute(name = "Action")
                protected ActionType action;
                @XmlAttribute(name = "Start")
                protected String start;
                @XmlAttribute(name = "Duration")
                protected String duration;
                @XmlAttribute(name = "End")
                protected String end;
                @XmlAttribute(name = "CompanyShortName")
                protected String companyShortName;
                @XmlAttribute(name = "TravelSector")
                protected String travelSector;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ActionType }
                 *     
                 */
                public ActionType getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ActionType }
                 *     
                 */
                public void setAction(ActionType value) {
                    this.action = value;
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
                 * Gets the value of the companyShortName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompanyShortName() {
                    return companyShortName;
                }

                /**
                 * Sets the value of the companyShortName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompanyShortName(String value) {
                    this.companyShortName = value;
                }

                /**
                 * Gets the value of the travelSector property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTravelSector() {
                    return travelSector;
                }

                /**
                 * Sets the value of the travelSector property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTravelSector(String value) {
                    this.travelSector = value;
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

            }

        }

    }

}
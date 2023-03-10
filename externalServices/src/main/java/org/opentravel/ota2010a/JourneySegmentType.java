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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Any valid journey leg type.
 * 
 * <p>Java class for JourneySegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneySegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TrainSegment"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TrainSegmentType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TrainOrigin" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *                   &lt;element name="TrainDestination" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *                   &lt;element name="ClassCodes"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ClassCode" maxOccurs="9"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}VendorMessagesType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="OnTimeRate" type="{http://www.opentravel.org/OTA/2003/05}Percentage" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NonTrainSegment"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Origin" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/&gt;
 *                   &lt;element name="Destination" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="LegRef" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
 *                 &lt;attribute name="TransportationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *                 &lt;attribute name="TransitTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *                 &lt;attribute name="ChangeTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneySegmentType", propOrder = {
    "trainSegment",
    "nonTrainSegment"
})
public class JourneySegmentType
    implements Serializable
{

    @XmlElement(name = "TrainSegment")
    protected JourneySegmentType.TrainSegment trainSegment;
    @XmlElement(name = "NonTrainSegment")
    protected JourneySegmentType.NonTrainSegment nonTrainSegment;

    /**
     * Gets the value of the trainSegment property.
     * 
     * @return
     *     possible object is
     *     {@link JourneySegmentType.TrainSegment }
     *     
     */
    public JourneySegmentType.TrainSegment getTrainSegment() {
        return trainSegment;
    }

    /**
     * Sets the value of the trainSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneySegmentType.TrainSegment }
     *     
     */
    public void setTrainSegment(JourneySegmentType.TrainSegment value) {
        this.trainSegment = value;
    }

    /**
     * Gets the value of the nonTrainSegment property.
     * 
     * @return
     *     possible object is
     *     {@link JourneySegmentType.NonTrainSegment }
     *     
     */
    public JourneySegmentType.NonTrainSegment getNonTrainSegment() {
        return nonTrainSegment;
    }

    /**
     * Sets the value of the nonTrainSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneySegmentType.NonTrainSegment }
     *     
     */
    public void setNonTrainSegment(JourneySegmentType.NonTrainSegment value) {
        this.nonTrainSegment = value;
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
     *         &lt;element name="Origin" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/&gt;
     *         &lt;element name="Destination" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="LegRef" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
     *       &lt;attribute name="TransportationCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *       &lt;attribute name="TransitTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
     *       &lt;attribute name="ChangeTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "origin",
        "destination"
    })
    public static class NonTrainSegment
        implements Serializable
    {

        @XmlElement(name = "Origin", required = true)
        protected LocationType origin;
        @XmlElement(name = "Destination", required = true)
        protected LocationType destination;
        @XmlAttribute(name = "LegRef", required = true)
        protected String legRef;
        @XmlAttribute(name = "TransportationCode", required = true)
        protected String transportationCode;
        @XmlAttribute(name = "TransitTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar transitTime;
        @XmlAttribute(name = "ChangeTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar changeTime;

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setOrigin(LocationType value) {
            this.origin = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setDestination(LocationType value) {
            this.destination = value;
        }

        /**
         * Gets the value of the legRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegRef() {
            return legRef;
        }

        /**
         * Sets the value of the legRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegRef(String value) {
            this.legRef = value;
        }

        /**
         * Gets the value of the transportationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportationCode() {
            return transportationCode;
        }

        /**
         * Sets the value of the transportationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransportationCode(String value) {
            this.transportationCode = value;
        }

        /**
         * Gets the value of the transitTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTransitTime() {
            return transitTime;
        }

        /**
         * Sets the value of the transitTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTransitTime(XMLGregorianCalendar value) {
            this.transitTime = value;
        }

        /**
         * Gets the value of the changeTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getChangeTime() {
            return changeTime;
        }

        /**
         * Sets the value of the changeTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setChangeTime(XMLGregorianCalendar value) {
            this.changeTime = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TrainSegmentType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TrainOrigin" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
     *         &lt;element name="TrainDestination" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
     *         &lt;element name="ClassCodes"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ClassCode" maxOccurs="9"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}VendorMessagesType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="OnTimeRate" type="{http://www.opentravel.org/OTA/2003/05}Percentage" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trainOrigin",
        "trainDestination",
        "classCodes",
        "vendorMessages"
    })
    public static class TrainSegment
        extends TrainSegmentType
        implements Serializable
    {

        @XmlElement(name = "TrainOrigin")
        protected LocationType trainOrigin;
        @XmlElement(name = "TrainDestination")
        protected LocationType trainDestination;
        @XmlElement(name = "ClassCodes", required = true)
        protected JourneySegmentType.TrainSegment.ClassCodes classCodes;
        @XmlElement(name = "VendorMessages")
        protected VendorMessagesType vendorMessages;
        @XmlAttribute(name = "OnTimeRate")
        protected BigDecimal onTimeRate;

        /**
         * Gets the value of the trainOrigin property.
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getTrainOrigin() {
            return trainOrigin;
        }

        /**
         * Sets the value of the trainOrigin property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setTrainOrigin(LocationType value) {
            this.trainOrigin = value;
        }

        /**
         * Gets the value of the trainDestination property.
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getTrainDestination() {
            return trainDestination;
        }

        /**
         * Sets the value of the trainDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setTrainDestination(LocationType value) {
            this.trainDestination = value;
        }

        /**
         * Gets the value of the classCodes property.
         * 
         * @return
         *     possible object is
         *     {@link JourneySegmentType.TrainSegment.ClassCodes }
         *     
         */
        public JourneySegmentType.TrainSegment.ClassCodes getClassCodes() {
            return classCodes;
        }

        /**
         * Sets the value of the classCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link JourneySegmentType.TrainSegment.ClassCodes }
         *     
         */
        public void setClassCodes(JourneySegmentType.TrainSegment.ClassCodes value) {
            this.classCodes = value;
        }

        /**
         * Gets the value of the vendorMessages property.
         * 
         * @return
         *     possible object is
         *     {@link VendorMessagesType }
         *     
         */
        public VendorMessagesType getVendorMessages() {
            return vendorMessages;
        }

        /**
         * Sets the value of the vendorMessages property.
         * 
         * @param value
         *     allowed object is
         *     {@link VendorMessagesType }
         *     
         */
        public void setVendorMessages(VendorMessagesType value) {
            this.vendorMessages = value;
        }

        /**
         * Gets the value of the onTimeRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOnTimeRate() {
            return onTimeRate;
        }

        /**
         * Sets the value of the onTimeRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOnTimeRate(BigDecimal value) {
            this.onTimeRate = value;
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
         *         &lt;element name="ClassCode" maxOccurs="9"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/&gt;
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
            "classCode"
        })
        public static class ClassCodes
            implements Serializable
        {

            @XmlElement(name = "ClassCode", required = true)
            protected List<JourneySegmentType.TrainSegment.ClassCodes.ClassCode> classCode = new Vector<JourneySegmentType.TrainSegment.ClassCodes.ClassCode>();

            /**
             * Gets the value of the classCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the classCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getClassCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JourneySegmentType.TrainSegment.ClassCodes.ClassCode }
             * 
             * 
             */
            public List<JourneySegmentType.TrainSegment.ClassCodes.ClassCode> getClassCode() {
                if (classCode == null) {
                    classCode = new Vector<JourneySegmentType.TrainSegment.ClassCodes.ClassCode>();
                }
                return this.classCode;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ClassCode
                implements Serializable
            {

                @XmlAttribute(name = "URI")
                @XmlSchemaType(name = "anyURI")
                protected String uri;
                @XmlAttribute(name = "Quantity")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger quantity;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

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

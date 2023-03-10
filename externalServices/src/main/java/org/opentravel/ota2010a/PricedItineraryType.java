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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Itinerary with pricing information.
 * 
 * <p>Java class for PricedItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedItineraryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirItinerary" type="{http://www.opentravel.org/OTA/2003/05}AirItineraryType" minOccurs="0"/&gt;
 *         &lt;element name="AirItineraryPricingInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType"&gt;
 *                 &lt;attribute name="RepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Notes" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="TicketingInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DeliveryInfo" maxOccurs="5" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
 *                           &lt;attribute name="DistribType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="PaymentType" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="PriceType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
 *       &lt;attribute name="NUC_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedItineraryType", propOrder = {
    "airItinerary",
    "airItineraryPricingInfo",
    "notes",
    "ticketingInfo"
})
@XmlSeeAlso({
    org.opentravel.ota2010a.PricedItinerariesType.PricedItinerary.class
})
public class PricedItineraryType
    implements Serializable
{

    @XmlElement(name = "AirItinerary")
    protected AirItineraryType airItinerary;
    @XmlElement(name = "AirItineraryPricingInfo")
    protected PricedItineraryType.AirItineraryPricingInfo airItineraryPricingInfo;
    @XmlElement(name = "Notes")
    protected List<FreeTextType> notes = new Vector<FreeTextType>();
    @XmlElement(name = "TicketingInfo")
    protected PricedItineraryType.TicketingInfo ticketingInfo;
    @XmlAttribute(name = "SequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "PriceType")
    protected String priceType;
    @XmlAttribute(name = "NUC_Rate")
    protected BigDecimal nuc_Rate;
    @XmlAttribute(name = "ExchangeRate")
    protected BigDecimal exchangeRate;

    /**
     * Gets the value of the airItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType }
     *     
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /**
     * Sets the value of the airItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType }
     *     
     */
    public void setAirItinerary(AirItineraryType value) {
        this.airItinerary = value;
    }

    /**
     * Gets the value of the airItineraryPricingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricedItineraryType.AirItineraryPricingInfo }
     *     
     */
    public PricedItineraryType.AirItineraryPricingInfo getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    /**
     * Sets the value of the airItineraryPricingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItineraryType.AirItineraryPricingInfo }
     *     
     */
    public void setAirItineraryPricingInfo(PricedItineraryType.AirItineraryPricingInfo value) {
        this.airItineraryPricingInfo = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getNotes() {
        if (notes == null) {
            notes = new Vector<FreeTextType>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the ticketingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PricedItineraryType.TicketingInfo }
     *     
     */
    public PricedItineraryType.TicketingInfo getTicketingInfo() {
        return ticketingInfo;
    }

    /**
     * Sets the value of the ticketingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItineraryType.TicketingInfo }
     *     
     */
    public void setTicketingInfo(PricedItineraryType.TicketingInfo value) {
        this.ticketingInfo = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the nuc_Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUC_Rate() {
        return nuc_Rate;
    }

    /**
     * Sets the value of the nuc_Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUC_Rate(BigDecimal value) {
        this.nuc_Rate = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType"&gt;
     *       &lt;attribute name="RepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirItineraryPricingInfo
        extends AirItineraryPricingInfoType
        implements Serializable
    {

        @XmlAttribute(name = "RepriceRequired")
        protected Boolean repriceRequired;

        /**
         * Gets the value of the repriceRequired property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRepriceRequired() {
            return repriceRequired;
        }

        /**
         * Sets the value of the repriceRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRepriceRequired(Boolean value) {
            this.repriceRequired = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DeliveryInfo" maxOccurs="5" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
     *                 &lt;attribute name="DistribType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PaymentType" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "deliveryInfo"
    })
    public static class TicketingInfo
        extends TicketingInfoRS_Type
        implements Serializable
    {

        @XmlElement(name = "DeliveryInfo")
        protected List<PricedItineraryType.TicketingInfo.DeliveryInfo> deliveryInfo = new Vector<PricedItineraryType.TicketingInfo.DeliveryInfo>();
        @XmlAttribute(name = "PaymentType")
        protected List<String> paymentType = new Vector<String>();

        /**
         * Gets the value of the deliveryInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deliveryInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeliveryInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PricedItineraryType.TicketingInfo.DeliveryInfo }
         * 
         * 
         */
        public List<PricedItineraryType.TicketingInfo.DeliveryInfo> getDeliveryInfo() {
            if (deliveryInfo == null) {
                deliveryInfo = new Vector<PricedItineraryType.TicketingInfo.DeliveryInfo>();
            }
            return this.deliveryInfo;
        }

        /**
         * Gets the value of the paymentType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPaymentType() {
            if (paymentType == null) {
                paymentType = new Vector<String>();
            }
            return this.paymentType;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
         *       &lt;attribute name="DistribType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DeliveryInfo
            implements Serializable
        {

            @XmlAttribute(name = "DistribType")
            protected String distribType;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the distribType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDistribType() {
                return distribType;
            }

            /**
             * Sets the value of the distribType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDistribType(String value) {
                this.distribType = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

        }

    }

}

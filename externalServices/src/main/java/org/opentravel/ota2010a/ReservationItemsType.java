//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 12:21:47 PM BRST 
//


package org.opentravel.ota2010a;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Travel segment (air, vehicle, hotel, rail, cruise, tour, general and package), pricing and special request information.
 * 
 * <p>Java class for ReservationItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelSegmentType"&gt;
 *                 &lt;attribute name="ItinSeqNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="IsPassive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="IssueBoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="BoardingPassIssued" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemPricing" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItinPricingType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AirFareInfo" type="{http://www.opentravel.org/OTA/2003/05}BookingPriceInfoType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SpecialRequestDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ChronoOrdered" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationItemsType", propOrder = {
    "item",
    "itemPricing",
    "specialRequestDetails"
})
public class ReservationItemsType
    implements Serializable
{

    @XmlElement(name = "Item", required = true)
    protected List<ReservationItemsType.Item> item = new Vector<ReservationItemsType.Item>();
    @XmlElement(name = "ItemPricing")
    protected List<ReservationItemsType.ItemPricing> itemPricing = new Vector<ReservationItemsType.ItemPricing>();
    @XmlElement(name = "SpecialRequestDetails")
    protected ReservationItemsType.SpecialRequestDetails specialRequestDetails;
    @XmlAttribute(name = "ChronoOrdered")
    protected Boolean chronoOrdered;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationItemsType.Item }
     * 
     * 
     */
    public List<ReservationItemsType.Item> getItem() {
        if (item == null) {
            item = new Vector<ReservationItemsType.Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the itemPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationItemsType.ItemPricing }
     * 
     * 
     */
    public List<ReservationItemsType.ItemPricing> getItemPricing() {
        if (itemPricing == null) {
            itemPricing = new Vector<ReservationItemsType.ItemPricing>();
        }
        return this.itemPricing;
    }

    /**
     * Gets the value of the specialRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationItemsType.SpecialRequestDetails }
     *     
     */
    public ReservationItemsType.SpecialRequestDetails getSpecialRequestDetails() {
        return specialRequestDetails;
    }

    /**
     * Sets the value of the specialRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationItemsType.SpecialRequestDetails }
     *     
     */
    public void setSpecialRequestDetails(ReservationItemsType.SpecialRequestDetails value) {
        this.specialRequestDetails = value;
    }

    /**
     * Gets the value of the chronoOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChronoOrdered() {
        return chronoOrdered;
    }

    /**
     * Sets the value of the chronoOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChronoOrdered(Boolean value) {
        this.chronoOrdered = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelSegmentType"&gt;
     *       &lt;attribute name="ItinSeqNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="IsPassive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="IssueBoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="BoardingPassIssued" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Item
        extends TravelSegmentType
        implements Serializable
    {

        @XmlAttribute(name = "ItinSeqNumber")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger itinSeqNumber;
        @XmlAttribute(name = "IsPassive")
        protected Boolean isPassive;
        @XmlAttribute(name = "IssueBoardingPass")
        protected Boolean issueBoardingPass;
        @XmlAttribute(name = "BoardingPassIssued")
        protected Boolean boardingPassIssued;

        /**
         * Gets the value of the itinSeqNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getItinSeqNumber() {
            return itinSeqNumber;
        }

        /**
         * Sets the value of the itinSeqNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setItinSeqNumber(BigInteger value) {
            this.itinSeqNumber = value;
        }

        /**
         * Gets the value of the isPassive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsPassive() {
            return isPassive;
        }

        /**
         * Sets the value of the isPassive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsPassive(Boolean value) {
            this.isPassive = value;
        }

        /**
         * Gets the value of the issueBoardingPass property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIssueBoardingPass() {
            return issueBoardingPass;
        }

        /**
         * Sets the value of the issueBoardingPass property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIssueBoardingPass(Boolean value) {
            this.issueBoardingPass = value;
        }

        /**
         * Gets the value of the boardingPassIssued property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBoardingPassIssued() {
            return boardingPassIssued;
        }

        /**
         * Sets the value of the boardingPassIssued property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBoardingPassIssued(Boolean value) {
            this.boardingPassIssued = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItinPricingType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AirFareInfo" type="{http://www.opentravel.org/OTA/2003/05}BookingPriceInfoType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airFareInfo"
    })
    public static class ItemPricing
        extends ItinPricingType
        implements Serializable
    {

        @XmlElement(name = "AirFareInfo", required = true)
        protected BookingPriceInfoType airFareInfo;

        /**
         * Gets the value of the airFareInfo property.
         * 
         * @return
         *     possible object is
         *     {@link BookingPriceInfoType }
         *     
         */
        public BookingPriceInfoType getAirFareInfo() {
            return airFareInfo;
        }

        /**
         * Sets the value of the airFareInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookingPriceInfoType }
         *     
         */
        public void setAirFareInfo(BookingPriceInfoType value) {
            this.airFareInfo = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpa_Extensions"
    })
    public static class SpecialRequestDetails
        extends SpecialReqDetailsType
        implements Serializable
    {

        @XmlElement(name = "TPA_Extensions")
        protected TPA_ExtensionsType tpa_Extensions;

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

    }

}

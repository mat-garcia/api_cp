//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 12:21:47 PM BRST 
//


package org.opentravel.ota2010a;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specific itinerary information, including additional contact information, reservation items, air reservation ticket information, pricing and special requests.
 * 
 * <p>Java class for ItineraryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" minOccurs="0"/&gt;
 *         &lt;element name="ReservationItems" type="{http://www.opentravel.org/OTA/2003/05}ReservationItemsType" minOccurs="0"/&gt;
 *         &lt;element name="Ticketing" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type"&gt;
 *                 &lt;attribute name="PlatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItineraryPricing" type="{http://www.opentravel.org/OTA/2003/05}ItinPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialRequestDetails"&gt;
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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryInfoType", propOrder = {
    "contactInfo",
    "reservationItems",
    "ticketing",
    "itineraryPricing",
    "specialRequestDetails",
    "tpa_Extensions"
})
public class ItineraryInfoType
    implements Serializable
{

    @XmlElement(name = "ContactInfo")
    protected ContactPersonType contactInfo;
    @XmlElement(name = "ReservationItems")
    protected ReservationItemsType reservationItems;
    @XmlElement(name = "Ticketing")
    protected ItineraryInfoType.Ticketing ticketing;
    @XmlElement(name = "ItineraryPricing")
    protected List<ItinPricingType> itineraryPricing = new Vector<ItinPricingType>();
    @XmlElement(name = "SpecialRequestDetails", required = true)
    protected ItineraryInfoType.SpecialRequestDetails specialRequestDetails;
    @XmlElement(name = "TPA_Extensions")
    protected TPA_ExtensionsType tpa_Extensions;

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setContactInfo(ContactPersonType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the reservationItems property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationItemsType }
     *     
     */
    public ReservationItemsType getReservationItems() {
        return reservationItems;
    }

    /**
     * Sets the value of the reservationItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationItemsType }
     *     
     */
    public void setReservationItems(ReservationItemsType value) {
        this.reservationItems = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryInfoType.Ticketing }
     *     
     */
    public ItineraryInfoType.Ticketing getTicketing() {
        return ticketing;
    }

    /**
     * Sets the value of the ticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryInfoType.Ticketing }
     *     
     */
    public void setTicketing(ItineraryInfoType.Ticketing value) {
        this.ticketing = value;
    }

    /**
     * Gets the value of the itineraryPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItinPricingType }
     * 
     * 
     */
    public List<ItinPricingType> getItineraryPricing() {
        if (itineraryPricing == null) {
            itineraryPricing = new Vector<ItinPricingType>();
        }
        return this.itineraryPricing;
    }

    /**
     * Gets the value of the specialRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryInfoType.SpecialRequestDetails }
     *     
     */
    public ItineraryInfoType.SpecialRequestDetails getSpecialRequestDetails() {
        return specialRequestDetails;
    }

    /**
     * Sets the value of the specialRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryInfoType.SpecialRequestDetails }
     *     
     */
    public void setSpecialRequestDetails(ItineraryInfoType.SpecialRequestDetails value) {
        this.specialRequestDetails = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TicketingInfoRS_Type"&gt;
     *       &lt;attribute name="PlatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Ticketing
        extends TicketingInfoRS_Type
        implements Serializable
    {

        @XmlAttribute(name = "PlatingCarrier")
        protected String platingCarrier;

        /**
         * Gets the value of the platingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatingCarrier() {
            return platingCarrier;
        }

        /**
         * Sets the value of the platingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatingCarrier(String value) {
            this.platingCarrier = value;
        }

    }

}

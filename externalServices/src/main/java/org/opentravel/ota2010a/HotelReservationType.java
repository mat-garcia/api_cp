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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Reservation class contains the current reservation being created or altered.
 * 
 * <p>Java class for HotelReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelReservationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}POS_Type" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="RoomStays" type="{http://www.opentravel.org/OTA/2003/05}RoomStaysType" minOccurs="0"/&gt;
 *         &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ServicesType" minOccurs="0"/&gt;
 *         &lt;element name="ResGuests" type="{http://www.opentravel.org/OTA/2003/05}ResGuestsType" minOccurs="0"/&gt;
 *         &lt;element name="ResGlobalInfo" type="{http://www.opentravel.org/OTA/2003/05}ResGlobalInfoType" minOccurs="0"/&gt;
 *         &lt;element name="WrittenConfInst" type="{http://www.opentravel.org/OTA/2003/05}WrittenConfInstType" minOccurs="0"/&gt;
 *         &lt;element name="Queue" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/&gt;
 *       &lt;attribute name="RoomStayReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ResStatus" type="{http://www.opentravel.org/OTA/2003/05}HotelResStatusType" /&gt;
 *       &lt;attribute name="ForcedSellIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ServiceOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WalkInIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RoomNumberLockedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OriginalDeliveryMethodCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *       &lt;attribute name="PassiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationType", propOrder = {
    "pos",
    "uniqueID",
    "roomStays",
    "services",
    "resGuests",
    "resGlobalInfo",
    "writtenConfInst",
    "queue",
    "tpa_Extensions"
})
@XmlSeeAlso({
    org.opentravel.ota2010a.DynamicPkgType.Components.HotelComponent.class,
    org.opentravel.ota2010a.OTA_NotifReportRQ.NotifDetails.HotelNotifReport.HotelReservations.HotelReservation.class,
    org.opentravel.ota2010a.HotelResModifyType.HotelResModify.class
})
public class HotelReservationType
    implements Serializable
{

    @XmlElement(name = "POS")
    protected POS_Type pos;
    @XmlElement(name = "UniqueID")
    protected List<UniqueID_Type> uniqueID = new Vector<UniqueID_Type>();
    @XmlElement(name = "RoomStays")
    protected RoomStaysType roomStays;
    @XmlElement(name = "Services")
    protected ServicesType services;
    @XmlElement(name = "ResGuests")
    protected ResGuestsType resGuests;
    @XmlElement(name = "ResGlobalInfo")
    protected ResGlobalInfoType resGlobalInfo;
    @XmlElement(name = "WrittenConfInst")
    protected WrittenConfInstType writtenConfInst;
    @XmlElement(name = "Queue")
    protected HotelReservationType.Queue queue;
    @XmlElement(name = "TPA_Extensions")
    protected TPA_ExtensionsType tpa_Extensions;
    @XmlAttribute(name = "RoomStayReservation")
    protected Boolean roomStayReservation;
    @XmlAttribute(name = "ResStatus")
    protected String resStatus;
    @XmlAttribute(name = "ForcedSellIndicator")
    protected Boolean forcedSellIndicator;
    @XmlAttribute(name = "ServiceOverrideIndicator")
    protected Boolean serviceOverrideIndicator;
    @XmlAttribute(name = "RateOverrideIndicator")
    protected Boolean rateOverrideIndicator;
    @XmlAttribute(name = "WalkInIndicator")
    protected Boolean walkInIndicator;
    @XmlAttribute(name = "RoomNumberLockedIndicator")
    protected Boolean roomNumberLockedIndicator;
    @XmlAttribute(name = "OriginalDeliveryMethodCode")
    protected String originalDeliveryMethodCode;
    @XmlAttribute(name = "PassiveIndicator")
    protected Boolean passiveIndicator;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "PurgeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purgeDate;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueID_Type }
     * 
     * 
     */
    public List<UniqueID_Type> getUniqueID() {
        if (uniqueID == null) {
            uniqueID = new Vector<UniqueID_Type>();
        }
        return this.uniqueID;
    }

    /**
     * Gets the value of the roomStays property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStaysType }
     *     
     */
    public RoomStaysType getRoomStays() {
        return roomStays;
    }

    /**
     * Sets the value of the roomStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStaysType }
     *     
     */
    public void setRoomStays(RoomStaysType value) {
        this.roomStays = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesType }
     *     
     */
    public ServicesType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesType }
     *     
     */
    public void setServices(ServicesType value) {
        this.services = value;
    }

    /**
     * Gets the value of the resGuests property.
     * 
     * @return
     *     possible object is
     *     {@link ResGuestsType }
     *     
     */
    public ResGuestsType getResGuests() {
        return resGuests;
    }

    /**
     * Sets the value of the resGuests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuestsType }
     *     
     */
    public void setResGuests(ResGuestsType value) {
        this.resGuests = value;
    }

    /**
     * Gets the value of the resGlobalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResGlobalInfoType }
     *     
     */
    public ResGlobalInfoType getResGlobalInfo() {
        return resGlobalInfo;
    }

    /**
     * Sets the value of the resGlobalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGlobalInfoType }
     *     
     */
    public void setResGlobalInfo(ResGlobalInfoType value) {
        this.resGlobalInfo = value;
    }

    /**
     * Gets the value of the writtenConfInst property.
     * 
     * @return
     *     possible object is
     *     {@link WrittenConfInstType }
     *     
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * Sets the value of the writtenConfInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link WrittenConfInstType }
     *     
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationType.Queue }
     *     
     */
    public HotelReservationType.Queue getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationType.Queue }
     *     
     */
    public void setQueue(HotelReservationType.Queue value) {
        this.queue = value;
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
     * Gets the value of the roomStayReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoomStayReservation() {
        return roomStayReservation;
    }

    /**
     * Sets the value of the roomStayReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoomStayReservation(Boolean value) {
        this.roomStayReservation = value;
    }

    /**
     * Gets the value of the resStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatus() {
        return resStatus;
    }

    /**
     * Sets the value of the resStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatus(String value) {
        this.resStatus = value;
    }

    /**
     * Gets the value of the forcedSellIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcedSellIndicator() {
        return forcedSellIndicator;
    }

    /**
     * Sets the value of the forcedSellIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcedSellIndicator(Boolean value) {
        this.forcedSellIndicator = value;
    }

    /**
     * Gets the value of the serviceOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceOverrideIndicator() {
        return serviceOverrideIndicator;
    }

    /**
     * Sets the value of the serviceOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceOverrideIndicator(Boolean value) {
        this.serviceOverrideIndicator = value;
    }

    /**
     * Gets the value of the rateOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateOverrideIndicator() {
        return rateOverrideIndicator;
    }

    /**
     * Sets the value of the rateOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateOverrideIndicator(Boolean value) {
        this.rateOverrideIndicator = value;
    }

    /**
     * Gets the value of the walkInIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWalkInIndicator() {
        return walkInIndicator;
    }

    /**
     * Sets the value of the walkInIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWalkInIndicator(Boolean value) {
        this.walkInIndicator = value;
    }

    /**
     * Gets the value of the roomNumberLockedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoomNumberLockedIndicator() {
        return roomNumberLockedIndicator;
    }

    /**
     * Sets the value of the roomNumberLockedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoomNumberLockedIndicator(Boolean value) {
        this.roomNumberLockedIndicator = value;
    }

    /**
     * Gets the value of the originalDeliveryMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDeliveryMethodCode() {
        return originalDeliveryMethodCode;
    }

    /**
     * Sets the value of the originalDeliveryMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDeliveryMethodCode(String value) {
        this.originalDeliveryMethodCode = value;
    }

    /**
     * Gets the value of the passiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassiveIndicator() {
        return passiveIndicator;
    }

    /**
     * Sets the value of the passiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassiveIndicator(Boolean value) {
        this.passiveIndicator = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the creatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * Gets the value of the lastModifyDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * Sets the value of the lastModifyDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * Gets the value of the lastModifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * Sets the value of the lastModifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * Gets the value of the purgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * Sets the value of the purgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Queue
        implements Serializable
    {

        @XmlAttribute(name = "PseudoCityCode")
        protected String pseudoCityCode;
        @XmlAttribute(name = "QueueNumber")
        protected String queueNumber;
        @XmlAttribute(name = "QueueCategory")
        protected String queueCategory;
        @XmlAttribute(name = "SystemCode")
        protected String systemCode;
        @XmlAttribute(name = "QueueID")
        protected String queueID;

        /**
         * Gets the value of the pseudoCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPseudoCityCode() {
            return pseudoCityCode;
        }

        /**
         * Sets the value of the pseudoCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPseudoCityCode(String value) {
            this.pseudoCityCode = value;
        }

        /**
         * Gets the value of the queueNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueNumber() {
            return queueNumber;
        }

        /**
         * Sets the value of the queueNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueNumber(String value) {
            this.queueNumber = value;
        }

        /**
         * Gets the value of the queueCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueCategory() {
            return queueCategory;
        }

        /**
         * Sets the value of the queueCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueCategory(String value) {
            this.queueCategory = value;
        }

        /**
         * Gets the value of the systemCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSystemCode() {
            return systemCode;
        }

        /**
         * Sets the value of the systemCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSystemCode(String value) {
            this.systemCode = value;
        }

        /**
         * Gets the value of the queueID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueID() {
            return queueID;
        }

        /**
         * Sets the value of the queueID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueID(String value) {
            this.queueID = value;
        }

    }

}

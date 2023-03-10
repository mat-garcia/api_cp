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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides details for an air segment in a response message.
 * 
 * <p>Java class for PkgFlightSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PkgFlightSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PkgFlightSegmentBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinAvailability" type="{http://www.opentravel.org/OTA/2003/05}CabinAvailType" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Charter"/&gt;
 *             &lt;enumeration value="Scheduled"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DepartureDay" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *       &lt;attribute name="TravelCode" type="{http://www.opentravel.org/OTA/2003/05}PkgTravelCode" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="DirectionInd" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" /&gt;
 *       &lt;attribute name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CheckInDesk" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *       &lt;attribute name="TOD_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TicketType" type="{http://www.opentravel.org/OTA/2003/05}TicketType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgFlightSegmentType", propOrder = {
    "cabinAvailability"
})
public class PkgFlightSegmentType
    extends PkgFlightSegmentBaseType
    implements Serializable
{

    @XmlElement(name = "CabinAvailability")
    protected List<CabinAvailType> cabinAvailability = new Vector<CabinAvailType>();
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "DepartureDay")
    protected DayOfWeekType departureDay;
    @XmlAttribute(name = "TravelCode")
    protected String travelCode;
    @XmlAttribute(name = "Duration")
    protected Duration duration;
    @XmlAttribute(name = "DirectionInd")
    protected AirTripType directionInd;
    @XmlAttribute(name = "CheckInDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInDate;
    @XmlAttribute(name = "CheckInDesk")
    protected String checkInDesk;
    @XmlAttribute(name = "TOD_Indicator")
    protected Boolean tod_Indicator;
    @XmlAttribute(name = "TicketType")
    protected TicketType ticketType;

    /**
     * Gets the value of the cabinAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinAvailType }
     * 
     * 
     */
    public List<CabinAvailType> getCabinAvailability() {
        if (cabinAvailability == null) {
            cabinAvailability = new Vector<CabinAvailType>();
        }
        return this.cabinAvailability;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the departureDay property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDepartureDay() {
        return departureDay;
    }

    /**
     * Sets the value of the departureDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDepartureDay(DayOfWeekType value) {
        this.departureDay = value;
    }

    /**
     * Gets the value of the travelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelCode() {
        return travelCode;
    }

    /**
     * Sets the value of the travelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelCode(String value) {
        this.travelCode = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the directionInd property.
     * 
     * @return
     *     possible object is
     *     {@link AirTripType }
     *     
     */
    public AirTripType getDirectionInd() {
        return directionInd;
    }

    /**
     * Sets the value of the directionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTripType }
     *     
     */
    public void setDirectionInd(AirTripType value) {
        this.directionInd = value;
    }

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInDate(XMLGregorianCalendar value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the checkInDesk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInDesk() {
        return checkInDesk;
    }

    /**
     * Sets the value of the checkInDesk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInDesk(String value) {
        this.checkInDesk = value;
    }

    /**
     * Gets the value of the tod_Indicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTOD_Indicator() {
        return tod_Indicator;
    }

    /**
     * Sets the value of the tod_Indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTOD_Indicator(Boolean value) {
        this.tod_Indicator = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType }
     *     
     */
    public TicketType getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType }
     *     
     */
    public void setTicketType(TicketType value) {
        this.ticketType = value;
    }

}

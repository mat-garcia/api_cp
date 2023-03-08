
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ResGlobalInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResGlobalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResCommonDetailType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfHotelReservationID" minOccurs="0"/&gt;
 *         &lt;element name="RoutingHops" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRoutingHopTypeRoutingHop" minOccurs="0"/&gt;
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfileInfo" minOccurs="0"/&gt;
 *         &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRule" minOccurs="0"/&gt;
 *         &lt;element name="TotalCommissions" type="{http://www.opentravel.org/OTA/2003/05}CommissionType" minOccurs="0"/&gt;
 *         &lt;element name="PNR" type="{http://www.opentravel.org/OTA/2003/05}PNR" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGlobalInfoType", propOrder = {
    "hotelReservationIDs",
    "routingHops",
    "profiles",
    "bookingRules",
    "totalCommissions",
    "pnr"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.HotelReservationType.ResGlobalInfo.class
})
public class ResGlobalInfoType
    extends ResCommonDetailType
{

    @XmlElement(name = "HotelReservationIDs")
    protected ArrayOfHotelReservationID hotelReservationIDs;
    @XmlElement(name = "RoutingHops")
    protected ArrayOfRoutingHopTypeRoutingHop routingHops;
    @XmlElement(name = "Profiles")
    protected ArrayOfProfileInfo profiles;
    @XmlElement(name = "BookingRules")
    protected ArrayOfBookingRule bookingRules;
    @XmlElement(name = "TotalCommissions")
    protected CommissionType totalCommissions;
    @XmlElement(name = "PNR")
    protected PNR pnr;

    /**
     * Obtém o valor da propriedade hotelReservationIDs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelReservationID }
     *     
     */
    public ArrayOfHotelReservationID getHotelReservationIDs() {
        return hotelReservationIDs;
    }

    /**
     * Define o valor da propriedade hotelReservationIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelReservationID }
     *     
     */
    public void setHotelReservationIDs(ArrayOfHotelReservationID value) {
        this.hotelReservationIDs = value;
    }

    /**
     * Obtém o valor da propriedade routingHops.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoutingHopTypeRoutingHop }
     *     
     */
    public ArrayOfRoutingHopTypeRoutingHop getRoutingHops() {
        return routingHops;
    }

    /**
     * Define o valor da propriedade routingHops.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoutingHopTypeRoutingHop }
     *     
     */
    public void setRoutingHops(ArrayOfRoutingHopTypeRoutingHop value) {
        this.routingHops = value;
    }

    /**
     * Obtém o valor da propriedade profiles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileInfo }
     *     
     */
    public ArrayOfProfileInfo getProfiles() {
        return profiles;
    }

    /**
     * Define o valor da propriedade profiles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileInfo }
     *     
     */
    public void setProfiles(ArrayOfProfileInfo value) {
        this.profiles = value;
    }

    /**
     * Obtém o valor da propriedade bookingRules.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBookingRule }
     *     
     */
    public ArrayOfBookingRule getBookingRules() {
        return bookingRules;
    }

    /**
     * Define o valor da propriedade bookingRules.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBookingRule }
     *     
     */
    public void setBookingRules(ArrayOfBookingRule value) {
        this.bookingRules = value;
    }

    /**
     * Obtém o valor da propriedade totalCommissions.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getTotalCommissions() {
        return totalCommissions;
    }

    /**
     * Define o valor da propriedade totalCommissions.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setTotalCommissions(CommissionType value) {
        this.totalCommissions = value;
    }

    /**
     * Obtém o valor da propriedade pnr.
     * 
     * @return
     *     possible object is
     *     {@link PNR }
     *     
     */
    public PNR getPNR() {
        return pnr;
    }

    /**
     * Define o valor da propriedade pnr.
     * 
     * @param value
     *     allowed object is
     *     {@link PNR }
     *     
     */
    public void setPNR(PNR value) {
        this.pnr = value;
    }

}

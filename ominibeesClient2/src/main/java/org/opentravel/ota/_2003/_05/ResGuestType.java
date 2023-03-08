
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ResGuestType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResGuestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfProfileInfo" minOccurs="0"/&gt;
 *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequest" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfComment" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPH" minOccurs="0"/&gt;
 *         &lt;element name="ProfileRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfResGuestTypeProfileRPH" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTransport" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfTransportInfoTypeTransportInfo" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTransport" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfTransportInfoTypeTransportInfo" minOccurs="0"/&gt;
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/&gt;
 *         &lt;element name="InHouseTimeSpan" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResGuestRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="GroupEventCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PrimaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGuestType", propOrder = {
    "profiles",
    "specialRequests",
    "comments",
    "serviceRPHs",
    "profileRPHs",
    "arrivalTransport",
    "departureTransport",
    "guestCounts",
    "inHouseTimeSpan",
    "tpaExtensions"
})
public class ResGuestType {

    @XmlElement(name = "Profiles")
    protected ArrayOfProfileInfo profiles;
    @XmlElement(name = "SpecialRequests")
    protected ArrayOfSpecialRequest specialRequests;
    @XmlElement(name = "Comments")
    protected ArrayOfComment comments;
    @XmlElement(name = "ServiceRPHs")
    protected ArrayOfServiceRPH serviceRPHs;
    @XmlElement(name = "ProfileRPHs")
    protected ArrayOfResGuestTypeProfileRPH profileRPHs;
    @XmlElement(name = "ArrivalTransport")
    protected ArrayOfTransportInfoTypeTransportInfo arrivalTransport;
    @XmlElement(name = "DepartureTransport")
    protected ArrayOfTransportInfoTypeTransportInfo departureTransport;
    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "InHouseTimeSpan")
    protected DateTimeSpanType inHouseTimeSpan;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ResGuestRPH")
    protected String resGuestRPH;
    @XmlAttribute(name = "AgeQualifyingCode")
    protected String ageQualifyingCode;
    @XmlAttribute(name = "ArrivalTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arrivalTime;
    @XmlAttribute(name = "DepartureTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlAttribute(name = "GroupEventCode")
    protected String groupEventCode;
    @XmlAttribute(name = "VIP")
    protected Boolean vip;
    @XmlAttribute(name = "PrimaryIndicator")
    protected Boolean primaryIndicator;
    @XmlAttribute(name = "Age")
    protected BigInteger age;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "Action")
    protected ActionType action;

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
     * Obtém o valor da propriedade specialRequests.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialRequest }
     *     
     */
    public ArrayOfSpecialRequest getSpecialRequests() {
        return specialRequests;
    }

    /**
     * Define o valor da propriedade specialRequests.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialRequest }
     *     
     */
    public void setSpecialRequests(ArrayOfSpecialRequest value) {
        this.specialRequests = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComment }
     *     
     */
    public ArrayOfComment getComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComment }
     *     
     */
    public void setComments(ArrayOfComment value) {
        this.comments = value;
    }

    /**
     * Obtém o valor da propriedade serviceRPHs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceRPH }
     *     
     */
    public ArrayOfServiceRPH getServiceRPHs() {
        return serviceRPHs;
    }

    /**
     * Define o valor da propriedade serviceRPHs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceRPH }
     *     
     */
    public void setServiceRPHs(ArrayOfServiceRPH value) {
        this.serviceRPHs = value;
    }

    /**
     * Obtém o valor da propriedade profileRPHs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResGuestTypeProfileRPH }
     *     
     */
    public ArrayOfResGuestTypeProfileRPH getProfileRPHs() {
        return profileRPHs;
    }

    /**
     * Define o valor da propriedade profileRPHs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResGuestTypeProfileRPH }
     *     
     */
    public void setProfileRPHs(ArrayOfResGuestTypeProfileRPH value) {
        this.profileRPHs = value;
    }

    /**
     * Obtém o valor da propriedade arrivalTransport.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransportInfoTypeTransportInfo }
     *     
     */
    public ArrayOfTransportInfoTypeTransportInfo getArrivalTransport() {
        return arrivalTransport;
    }

    /**
     * Define o valor da propriedade arrivalTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransportInfoTypeTransportInfo }
     *     
     */
    public void setArrivalTransport(ArrayOfTransportInfoTypeTransportInfo value) {
        this.arrivalTransport = value;
    }

    /**
     * Obtém o valor da propriedade departureTransport.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransportInfoTypeTransportInfo }
     *     
     */
    public ArrayOfTransportInfoTypeTransportInfo getDepartureTransport() {
        return departureTransport;
    }

    /**
     * Define o valor da propriedade departureTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransportInfoTypeTransportInfo }
     *     
     */
    public void setDepartureTransport(ArrayOfTransportInfoTypeTransportInfo value) {
        this.departureTransport = value;
    }

    /**
     * Obtém o valor da propriedade guestCounts.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * Define o valor da propriedade guestCounts.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * Obtém o valor da propriedade inHouseTimeSpan.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getInHouseTimeSpan() {
        return inHouseTimeSpan;
    }

    /**
     * Define o valor da propriedade inHouseTimeSpan.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setInHouseTimeSpan(DateTimeSpanType value) {
        this.inHouseTimeSpan = value;
    }

    /**
     * Obtém o valor da propriedade tpaExtensions.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Define o valor da propriedade tpaExtensions.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Obtém o valor da propriedade resGuestRPH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResGuestRPH() {
        return resGuestRPH;
    }

    /**
     * Define o valor da propriedade resGuestRPH.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResGuestRPH(String value) {
        this.resGuestRPH = value;
    }

    /**
     * Obtém o valor da propriedade ageQualifyingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * Define o valor da propriedade ageQualifyingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    /**
     * Obtém o valor da propriedade arrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Define o valor da propriedade arrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    /**
     * Obtém o valor da propriedade departureTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Define o valor da propriedade departureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Obtém o valor da propriedade groupEventCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupEventCode() {
        return groupEventCode;
    }

    /**
     * Define o valor da propriedade groupEventCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupEventCode(String value) {
        this.groupEventCode = value;
    }

    /**
     * Obtém o valor da propriedade vip.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVIP() {
        return vip;
    }

    /**
     * Define o valor da propriedade vip.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVIP(Boolean value) {
        this.vip = value;
    }

    /**
     * Obtém o valor da propriedade primaryIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * Define o valor da propriedade primaryIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryIndicator(Boolean value) {
        this.primaryIndicator = value;
    }

    /**
     * Obtém o valor da propriedade age.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Define o valor da propriedade age.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * Obtém o valor da propriedade locationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Define o valor da propriedade locationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Obtém o valor da propriedade codeContext.
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
     * Define o valor da propriedade codeContext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * Obtém o valor da propriedade action.
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
     * Define o valor da propriedade action.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

}

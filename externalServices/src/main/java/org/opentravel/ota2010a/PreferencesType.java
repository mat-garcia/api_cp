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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Needs of the traveler related to travel experiences.
 * 
 * <p>Java class for PreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferencesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrefCollection" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CommonPref" type="{http://www.opentravel.org/OTA/2003/05}CommonPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="VehicleRentalPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleProfileRentalPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AirlinePref" type="{http://www.opentravel.org/OTA/2003/05}AirlinePrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="HotelPref" type="{http://www.opentravel.org/OTA/2003/05}HotelPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OtherSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}OtherSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/&gt;
 *                 &lt;attribute name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferencesType", propOrder = {
    "prefCollection"
})
public class PreferencesType
    implements Serializable
{

    @XmlElement(name = "PrefCollection", required = true)
    protected List<PreferencesType.PrefCollection> prefCollection = new Vector<PreferencesType.PrefCollection>();
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

    /**
     * Gets the value of the prefCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferencesType.PrefCollection }
     * 
     * 
     */
    public List<PreferencesType.PrefCollection> getPrefCollection() {
        if (prefCollection == null) {
            prefCollection = new Vector<PreferencesType.PrefCollection>();
        }
        return this.prefCollection;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
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
     *         &lt;element name="CommonPref" type="{http://www.opentravel.org/OTA/2003/05}CommonPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="VehicleRentalPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleProfileRentalPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="AirlinePref" type="{http://www.opentravel.org/OTA/2003/05}AirlinePrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="HotelPref" type="{http://www.opentravel.org/OTA/2003/05}HotelPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OtherSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}OtherSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/&gt;
     *       &lt;attribute name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commonPref",
        "vehicleRentalPref",
        "airlinePref",
        "hotelPref",
        "otherSrvcPref",
        "tpa_Extensions"
    })
    public static class PrefCollection
        implements Serializable
    {

        @XmlElement(name = "CommonPref")
        protected List<CommonPrefType> commonPref = new Vector<CommonPrefType>();
        @XmlElement(name = "VehicleRentalPref")
        protected List<VehicleProfileRentalPrefType> vehicleRentalPref = new Vector<VehicleProfileRentalPrefType>();
        @XmlElement(name = "AirlinePref")
        protected List<AirlinePrefType> airlinePref = new Vector<AirlinePrefType>();
        @XmlElement(name = "HotelPref")
        protected List<HotelPrefType> hotelPref = new Vector<HotelPrefType>();
        @XmlElement(name = "OtherSrvcPref")
        protected List<OtherSrvcPrefType> otherSrvcPref = new Vector<OtherSrvcPrefType>();
        @XmlElement(name = "TPA_Extensions")
        protected TPA_ExtensionsType tpa_Extensions;
        @XmlAttribute(name = "TravelPurpose")
        protected String travelPurpose;
        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;

        /**
         * Gets the value of the commonPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commonPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommonPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommonPrefType }
         * 
         * 
         */
        public List<CommonPrefType> getCommonPref() {
            if (commonPref == null) {
                commonPref = new Vector<CommonPrefType>();
            }
            return this.commonPref;
        }

        /**
         * Gets the value of the vehicleRentalPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleRentalPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleRentalPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleProfileRentalPrefType }
         * 
         * 
         */
        public List<VehicleProfileRentalPrefType> getVehicleRentalPref() {
            if (vehicleRentalPref == null) {
                vehicleRentalPref = new Vector<VehicleProfileRentalPrefType>();
            }
            return this.vehicleRentalPref;
        }

        /**
         * Gets the value of the airlinePref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlinePref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlinePref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirlinePrefType }
         * 
         * 
         */
        public List<AirlinePrefType> getAirlinePref() {
            if (airlinePref == null) {
                airlinePref = new Vector<AirlinePrefType>();
            }
            return this.airlinePref;
        }

        /**
         * Gets the value of the hotelPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelPrefType }
         * 
         * 
         */
        public List<HotelPrefType> getHotelPref() {
            if (hotelPref == null) {
                hotelPref = new Vector<HotelPrefType>();
            }
            return this.hotelPref;
        }

        /**
         * Gets the value of the otherSrvcPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherSrvcPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherSrvcPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherSrvcPrefType }
         * 
         * 
         */
        public List<OtherSrvcPrefType> getOtherSrvcPref() {
            if (otherSrvcPref == null) {
                otherSrvcPref = new Vector<OtherSrvcPrefType>();
            }
            return this.otherSrvcPref;
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
         * Gets the value of the travelPurpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelPurpose() {
            return travelPurpose;
        }

        /**
         * Sets the value of the travelPurpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelPurpose(String value) {
            this.travelPurpose = value;
        }

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

    }

}


package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MessageAcknowledgementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReservationsList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;element name="CruiseReservation" type="{http://www.opentravel.org/OTA/2003/05}CruiseReservationType" minOccurs="0"/&gt;
 *                     &lt;element name="GlobalReservation" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *                               &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="PackageReservation" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *                               &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
 *                               &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *                               &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                             &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="HotelReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MoreIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservationsList"
})
@XmlRootElement(name = "OTA_ResRetrieveRS")
public class OTAResRetrieveRS
    extends MessageAcknowledgementType
{

    @XmlElement(name = "ReservationsList")
    protected OTAResRetrieveRS.ReservationsList reservationsList;
    @XmlAttribute(name = "MoreIndicator")
    protected Boolean moreIndicator;
    @XmlAttribute(name = "MoreDataEchoToken")
    protected String moreDataEchoToken;
    @XmlAttribute(name = "MaxResponses")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxResponses;

    /**
     * Obtém o valor da propriedade reservationsList.
     * 
     * @return
     *     possible object is
     *     {@link OTAResRetrieveRS.ReservationsList }
     *     
     */
    public OTAResRetrieveRS.ReservationsList getReservationsList() {
        return reservationsList;
    }

    /**
     * Define o valor da propriedade reservationsList.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAResRetrieveRS.ReservationsList }
     *     
     */
    public void setReservationsList(OTAResRetrieveRS.ReservationsList value) {
        this.reservationsList = value;
    }

    /**
     * Obtém o valor da propriedade moreIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreIndicator() {
        return moreIndicator;
    }

    /**
     * Define o valor da propriedade moreIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreIndicator(Boolean value) {
        this.moreIndicator = value;
    }

    /**
     * Obtém o valor da propriedade moreDataEchoToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDataEchoToken() {
        return moreDataEchoToken;
    }

    /**
     * Define o valor da propriedade moreDataEchoToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreDataEchoToken(String value) {
        this.moreDataEchoToken = value;
    }

    /**
     * Obtém o valor da propriedade maxResponses.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxResponses() {
        return maxResponses;
    }

    /**
     * Define o valor da propriedade maxResponses.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxResponses(BigInteger value) {
        this.maxResponses = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;element name="CruiseReservation" type="{http://www.opentravel.org/OTA/2003/05}CruiseReservationType" minOccurs="0"/&gt;
     *           &lt;element name="GlobalReservation" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
     *                     &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="PackageReservation" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
     *                     &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
     *                     &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
     *                     &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                   &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;attribute name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="HotelReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "cruiseReservationOrGlobalReservationOrPackageReservation",
        "hotelReservation"
    })
    public static class ReservationsList {

        @XmlElements({
            @XmlElement(name = "CruiseReservation", type = CruiseReservationType.class),
            @XmlElement(name = "GlobalReservation", type = OTAResRetrieveRS.ReservationsList.GlobalReservation.class),
            @XmlElement(name = "PackageReservation", type = OTAResRetrieveRS.ReservationsList.PackageReservation.class)
        })
        protected List<Object> cruiseReservationOrGlobalReservationOrPackageReservation;
        @XmlElement(name = "HotelReservation")
        protected List<HotelReservationType> hotelReservation;

        /**
         * Gets the value of the cruiseReservationOrGlobalReservationOrPackageReservation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cruiseReservationOrGlobalReservationOrPackageReservation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCruiseReservationOrGlobalReservationOrPackageReservation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseReservationType }
         * {@link OTAResRetrieveRS.ReservationsList.GlobalReservation }
         * {@link OTAResRetrieveRS.ReservationsList.PackageReservation }
         * 
         * 
         */
        public List<Object> getCruiseReservationOrGlobalReservationOrPackageReservation() {
            if (cruiseReservationOrGlobalReservationOrPackageReservation == null) {
                cruiseReservationOrGlobalReservationOrPackageReservation = new ArrayList<Object>();
            }
            return this.cruiseReservationOrGlobalReservationOrPackageReservation;
        }

        /**
         * Gets the value of the hotelReservation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelReservation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelReservation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelReservationType }
         * 
         * 
         */
        public List<HotelReservationType> getHotelReservation() {
            if (hotelReservation == null) {
                hotelReservation = new ArrayList<HotelReservationType>();
            }
            return this.hotelReservation;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
         *         &lt;element name="TravelerName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ItineraryName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "uniqueID",
            "travelerName"
        })
        public static class GlobalReservation {

            @XmlElement(name = "UniqueID")
            protected UniqueIDType uniqueID;
            @XmlElement(name = "TravelerName")
            protected PersonNameType travelerName;
            @XmlAttribute(name = "ItineraryName")
            protected String itineraryName;
            @XmlAttribute(name = "Start")
            protected String start;

            /**
             * Obtém o valor da propriedade uniqueID.
             * 
             * @return
             *     possible object is
             *     {@link UniqueIDType }
             *     
             */
            public UniqueIDType getUniqueID() {
                return uniqueID;
            }

            /**
             * Define o valor da propriedade uniqueID.
             * 
             * @param value
             *     allowed object is
             *     {@link UniqueIDType }
             *     
             */
            public void setUniqueID(UniqueIDType value) {
                this.uniqueID = value;
            }

            /**
             * Obtém o valor da propriedade travelerName.
             * 
             * @return
             *     possible object is
             *     {@link PersonNameType }
             *     
             */
            public PersonNameType getTravelerName() {
                return travelerName;
            }

            /**
             * Define o valor da propriedade travelerName.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonNameType }
             *     
             */
            public void setTravelerName(PersonNameType value) {
                this.travelerName = value;
            }

            /**
             * Obtém o valor da propriedade itineraryName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItineraryName() {
                return itineraryName;
            }

            /**
             * Define o valor da propriedade itineraryName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItineraryName(String value) {
                this.itineraryName = value;
            }

            /**
             * Obtém o valor da propriedade start.
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
             * Define o valor da propriedade start.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
         *         &lt;element name="Name" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
         *         &lt;element name="ArrivalLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
         *         &lt;element name="DepartureLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TravelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="ReservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ReservationStatus" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "uniqueID",
            "name",
            "arrivalLocation",
            "departureLocation"
        })
        public static class PackageReservation {

            @XmlElement(name = "UniqueID")
            protected UniqueIDType uniqueID;
            @XmlElement(name = "Name")
            protected PersonNameType name;
            @XmlElement(name = "ArrivalLocation")
            protected LocationType arrivalLocation;
            @XmlElement(name = "DepartureLocation")
            protected LocationType departureLocation;
            @XmlAttribute(name = "TravelCode")
            protected String travelCode;
            @XmlAttribute(name = "TourCode")
            protected String tourCode;
            @XmlAttribute(name = "PackageID")
            protected String packageID;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;
            @XmlAttribute(name = "ReservationStatusCode")
            protected String reservationStatusCode;
            @XmlAttribute(name = "ReservationStatus")
            protected InventoryStatusType reservationStatus;

            /**
             * Obtém o valor da propriedade uniqueID.
             * 
             * @return
             *     possible object is
             *     {@link UniqueIDType }
             *     
             */
            public UniqueIDType getUniqueID() {
                return uniqueID;
            }

            /**
             * Define o valor da propriedade uniqueID.
             * 
             * @param value
             *     allowed object is
             *     {@link UniqueIDType }
             *     
             */
            public void setUniqueID(UniqueIDType value) {
                this.uniqueID = value;
            }

            /**
             * Obtém o valor da propriedade name.
             * 
             * @return
             *     possible object is
             *     {@link PersonNameType }
             *     
             */
            public PersonNameType getName() {
                return name;
            }

            /**
             * Define o valor da propriedade name.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonNameType }
             *     
             */
            public void setName(PersonNameType value) {
                this.name = value;
            }

            /**
             * Obtém o valor da propriedade arrivalLocation.
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getArrivalLocation() {
                return arrivalLocation;
            }

            /**
             * Define o valor da propriedade arrivalLocation.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setArrivalLocation(LocationType value) {
                this.arrivalLocation = value;
            }

            /**
             * Obtém o valor da propriedade departureLocation.
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getDepartureLocation() {
                return departureLocation;
            }

            /**
             * Define o valor da propriedade departureLocation.
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setDepartureLocation(LocationType value) {
                this.departureLocation = value;
            }

            /**
             * Obtém o valor da propriedade travelCode.
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
             * Define o valor da propriedade travelCode.
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
             * Obtém o valor da propriedade tourCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTourCode() {
                return tourCode;
            }

            /**
             * Define o valor da propriedade tourCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTourCode(String value) {
                this.tourCode = value;
            }

            /**
             * Obtém o valor da propriedade packageID.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPackageID() {
                return packageID;
            }

            /**
             * Define o valor da propriedade packageID.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPackageID(String value) {
                this.packageID = value;
            }

            /**
             * Obtém o valor da propriedade start.
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
             * Define o valor da propriedade start.
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
             * Obtém o valor da propriedade duration.
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
             * Define o valor da propriedade duration.
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
             * Obtém o valor da propriedade end.
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
             * Define o valor da propriedade end.
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
             * Obtém o valor da propriedade quantity.
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
             * Define o valor da propriedade quantity.
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
             * Obtém o valor da propriedade reservationStatusCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationStatusCode() {
                return reservationStatusCode;
            }

            /**
             * Define o valor da propriedade reservationStatusCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationStatusCode(String value) {
                this.reservationStatusCode = value;
            }

            /**
             * Obtém o valor da propriedade reservationStatus.
             * 
             * @return
             *     possible object is
             *     {@link InventoryStatusType }
             *     
             */
            public InventoryStatusType getReservationStatus() {
                return reservationStatus;
            }

            /**
             * Define o valor da propriedade reservationStatus.
             * 
             * @param value
             *     allowed object is
             *     {@link InventoryStatusType }
             *     
             */
            public void setReservationStatus(InventoryStatusType value) {
                this.reservationStatus = value;
            }

        }

    }

}


package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ArrayOfRoomStay complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoomStay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomStay" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/&gt;
 *                   &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMembershipTypeMembership" minOccurs="0"/&gt;
 *                   &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfComment" minOccurs="0"/&gt;
 *                   &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequest" minOccurs="0"/&gt;
 *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPH" minOccurs="0"/&gt;
 *                   &lt;element name="Reference" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
 *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRule" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "ArrayOfRoomStay", propOrder = {
    "roomStay"
})
public class ArrayOfRoomStay {

    @XmlElement(name = "RoomStay")
    protected List<ArrayOfRoomStay.RoomStay> roomStay;

    /**
     * Gets the value of the roomStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRoomStay.RoomStay }
     * 
     * 
     */
    public List<ArrayOfRoomStay.RoomStay> getRoomStay() {
        if (roomStay == null) {
            roomStay = new ArrayList<ArrayOfRoomStay.RoomStay>();
        }
        return this.roomStay;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/&gt;
     *         &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMembershipTypeMembership" minOccurs="0"/&gt;
     *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfComment" minOccurs="0"/&gt;
     *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequest" minOccurs="0"/&gt;
     *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfServiceRPH" minOccurs="0"/&gt;
     *         &lt;element name="Reference" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
     *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfBookingRule" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resGuestRPHs",
        "memberships",
        "comments",
        "specialRequests",
        "serviceRPHs",
        "reference",
        "bookingRules"
    })
    public static class RoomStay
        extends RoomStayType
    {

        @XmlElement(name = "ResGuestRPHs")
        protected ResGuestRPHsType resGuestRPHs;
        @XmlElement(name = "Memberships")
        protected ArrayOfMembershipTypeMembership memberships;
        @XmlElement(name = "Comments")
        protected ArrayOfComment comments;
        @XmlElement(name = "SpecialRequests")
        protected ArrayOfSpecialRequest specialRequests;
        @XmlElement(name = "ServiceRPHs")
        protected ArrayOfServiceRPH serviceRPHs;
        @XmlElement(name = "Reference")
        protected ArrayOfRoomStay.RoomStay.Reference reference;
        @XmlElement(name = "BookingRules")
        protected ArrayOfBookingRule bookingRules;
        @XmlAttribute(name = "IndexNumber")
        protected BigInteger indexNumber;

        /**
         * Obtém o valor da propriedade resGuestRPHs.
         * 
         * @return
         *     possible object is
         *     {@link ResGuestRPHsType }
         *     
         */
        public ResGuestRPHsType getResGuestRPHs() {
            return resGuestRPHs;
        }

        /**
         * Define o valor da propriedade resGuestRPHs.
         * 
         * @param value
         *     allowed object is
         *     {@link ResGuestRPHsType }
         *     
         */
        public void setResGuestRPHs(ResGuestRPHsType value) {
            this.resGuestRPHs = value;
        }

        /**
         * Obtém o valor da propriedade memberships.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfMembershipTypeMembership }
         *     
         */
        public ArrayOfMembershipTypeMembership getMemberships() {
            return memberships;
        }

        /**
         * Define o valor da propriedade memberships.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfMembershipTypeMembership }
         *     
         */
        public void setMemberships(ArrayOfMembershipTypeMembership value) {
            this.memberships = value;
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
         * Obtém o valor da propriedade reference.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfRoomStay.RoomStay.Reference }
         *     
         */
        public ArrayOfRoomStay.RoomStay.Reference getReference() {
            return reference;
        }

        /**
         * Define o valor da propriedade reference.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfRoomStay.RoomStay.Reference }
         *     
         */
        public void setReference(ArrayOfRoomStay.RoomStay.Reference value) {
            this.reference = value;
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
         * Obtém o valor da propriedade indexNumber.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndexNumber() {
            return indexNumber;
        }

        /**
         * Define o valor da propriedade indexNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndexNumber(BigInteger value) {
            this.indexNumber = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
         *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Reference
            extends UniqueIDType
        {

            @XmlAttribute(name = "DateTime")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dateTime;

            /**
             * Obtém o valor da propriedade dateTime.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateTime() {
                return dateTime;
            }

            /**
             * Define o valor da propriedade dateTime.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateTime(XMLGregorianCalendar value) {
                this.dateTime = value;
            }

        }

    }

}

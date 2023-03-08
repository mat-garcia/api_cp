
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MeetingRoomCapacityType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MeetingRoomCapacityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Occupancy" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MinRoomCharge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MeetingRoomFormatCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRoomCapacityType", propOrder = {
    "occupancy"
})
public class MeetingRoomCapacityType {

    @XmlElement(name = "Occupancy")
    protected MeetingRoomCapacityType.Occupancy occupancy;
    @XmlAttribute(name = "MeetingRoomFormatCode")
    protected String meetingRoomFormatCode;

    /**
     * Obtém o valor da propriedade occupancy.
     * 
     * @return
     *     possible object is
     *     {@link MeetingRoomCapacityType.Occupancy }
     *     
     */
    public MeetingRoomCapacityType.Occupancy getOccupancy() {
        return occupancy;
    }

    /**
     * Define o valor da propriedade occupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingRoomCapacityType.Occupancy }
     *     
     */
    public void setOccupancy(MeetingRoomCapacityType.Occupancy value) {
        this.occupancy = value;
    }

    /**
     * Obtém o valor da propriedade meetingRoomFormatCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingRoomFormatCode() {
        return meetingRoomFormatCode;
    }

    /**
     * Define o valor da propriedade meetingRoomFormatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingRoomFormatCode(String value) {
        this.meetingRoomFormatCode = value;
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
     *         &lt;element name="MinRoomCharge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "minRoomCharge"
    })
    public static class Occupancy {

        @XmlElement(name = "MinRoomCharge")
        protected FeeType minRoomCharge;
        @XmlAttribute(name = "MinOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minOccupancy;
        @XmlAttribute(name = "MaxOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxOccupancy;
        @XmlAttribute(name = "StandardOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger standardOccupancy;

        /**
         * Obtém o valor da propriedade minRoomCharge.
         * 
         * @return
         *     possible object is
         *     {@link FeeType }
         *     
         */
        public FeeType getMinRoomCharge() {
            return minRoomCharge;
        }

        /**
         * Define o valor da propriedade minRoomCharge.
         * 
         * @param value
         *     allowed object is
         *     {@link FeeType }
         *     
         */
        public void setMinRoomCharge(FeeType value) {
            this.minRoomCharge = value;
        }

        /**
         * Obtém o valor da propriedade minOccupancy.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinOccupancy() {
            return minOccupancy;
        }

        /**
         * Define o valor da propriedade minOccupancy.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinOccupancy(BigInteger value) {
            this.minOccupancy = value;
        }

        /**
         * Obtém o valor da propriedade maxOccupancy.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxOccupancy() {
            return maxOccupancy;
        }

        /**
         * Define o valor da propriedade maxOccupancy.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxOccupancy(BigInteger value) {
            this.maxOccupancy = value;
        }

        /**
         * Obtém o valor da propriedade standardOccupancy.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStandardOccupancy() {
            return standardOccupancy;
        }

        /**
         * Define o valor da propriedade standardOccupancy.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStandardOccupancy(BigInteger value) {
            this.standardOccupancy = value;
        }

    }

}

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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A container for flight segments.
 * 
 * <p>Java class for OriginDestinationOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightSegment" maxOccurs="8"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "OriginDestinationOptionType", propOrder = {
    "flightSegment"
})
@XmlSeeAlso({
    org.opentravel.ota2010a.AirItineraryType.OriginDestinationOptions.OriginDestinationOption.class
})
public class OriginDestinationOptionType
    implements Serializable
{

    @XmlElement(name = "FlightSegment", required = true)
    protected List<OriginDestinationOptionType.FlightSegment> flightSegment = new Vector<OriginDestinationOptionType.FlightSegment>();

    /**
     * Gets the value of the flightSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestinationOptionType.FlightSegment }
     * 
     * 
     */
    public List<OriginDestinationOptionType.FlightSegment> getFlightSegment() {
        if (flightSegment == null) {
            flightSegment = new Vector<OriginDestinationOptionType.FlightSegment>();
        }
        return this.flightSegment;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType"&gt;
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
    public static class FlightSegment
        extends BookFlightSegmentType
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

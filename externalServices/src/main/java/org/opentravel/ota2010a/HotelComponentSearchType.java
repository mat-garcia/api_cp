//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 12:21:47 PM BRST 
//


package org.opentravel.ota2010a;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelComponentSearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HotelComponentSearchType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AvailPrice"/&gt;
 *     &lt;enumeration value="Avail"/&gt;
 *     &lt;enumeration value="PropertyList"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HotelComponentSearchType")
@XmlEnum
public enum HotelComponentSearchType {

    @XmlEnumValue("AvailPrice")
    AVAIL_PRICE("AvailPrice"),
    @XmlEnumValue("Avail")
    AVAIL("Avail"),
    @XmlEnumValue("PropertyList")
    PROPERTY_LIST("PropertyList");
    private final String value;

    HotelComponentSearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelComponentSearchType fromValue(String v) {
        for (HotelComponentSearchType c: HotelComponentSearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
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
 * <p>Java class for FlightTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Nonstop"/&gt;
 *     &lt;enumeration value="Direct"/&gt;
 *     &lt;enumeration value="Connection"/&gt;
 *     &lt;enumeration value="SingleConnection"/&gt;
 *     &lt;enumeration value="DoubleConnection"/&gt;
 *     &lt;enumeration value="OneStopOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlightTypeType")
@XmlEnum
public enum FlightTypeType {


    /**
     * Indicates the flight does not make any scheduled stops between 2 points.
     * 
     */
    @XmlEnumValue("Nonstop")
    NONSTOP("Nonstop"),

    /**
     * Indicates the flight makes a scheduled stop(s) between 2 points.
     * 
     */
    @XmlEnumValue("Direct")
    DIRECT("Direct"),

    /**
     * Indicates the flight will require a change of aircraft at a connecting point(s).
     * 
     */
    @XmlEnumValue("Connection")
    CONNECTION("Connection"),

    /**
     * A trip with only one connection.
     * 
     */
    @XmlEnumValue("SingleConnection")
    SINGLE_CONNECTION("SingleConnection"),

    /**
     * A trip with only two connections.
     * 
     */
    @XmlEnumValue("DoubleConnection")
    DOUBLE_CONNECTION("DoubleConnection"),

    /**
     * Indicates that the flight makes only one stop.
     * 
     */
    @XmlEnumValue("OneStopOnly")
    ONE_STOP_ONLY("OneStopOnly");
    private final String value;

    FlightTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightTypeType fromValue(String v) {
        for (FlightTypeType c: FlightTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

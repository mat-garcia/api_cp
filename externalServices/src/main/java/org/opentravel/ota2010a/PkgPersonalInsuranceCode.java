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
 * <p>Java class for PkgPersonalInsuranceCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PkgPersonalInsuranceCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ski"/&gt;
 *     &lt;enumeration value="Worldwide"/&gt;
 *     &lt;enumeration value="Europe"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PkgPersonalInsuranceCode")
@XmlEnum
public enum PkgPersonalInsuranceCode {

    @XmlEnumValue("Ski")
    SKI("Ski"),
    @XmlEnumValue("Worldwide")
    WORLDWIDE("Worldwide"),
    @XmlEnumValue("Europe")
    EUROPE("Europe");
    private final String value;

    PkgPersonalInsuranceCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PkgPersonalInsuranceCode fromValue(String v) {
        for (PkgPersonalInsuranceCode c: PkgPersonalInsuranceCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
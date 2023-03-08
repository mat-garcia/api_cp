//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 12:21:47 PM BRST 
//


package org.opentravel.ota2010a;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Street name; number on street.
 * 
 * <p>Java class for StreetNmbrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreetNmbrType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;StringLength0to64"&gt;
 *       &lt;attribute name="PO_Box" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreetNmbrType", propOrder = {
    "value"
})
@XmlSeeAlso({
    org.opentravel.ota2010a.AddressType.StreetNmbr.class
})
public class StreetNmbrType
    implements Serializable
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PO_Box")
    protected String po_Box;

    /**
     * Used for Character Strings, length 0 to 64.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the po_Box property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPO_Box() {
        return po_Box;
    }

    /**
     * Sets the value of the po_Box property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPO_Box(String value) {
        this.po_Box = value;
    }

}

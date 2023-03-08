
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de TimeInstantType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeInstantType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="WindowBefore" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="WindowAfter" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="CrossDateAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInstantType", propOrder = {
    "value"
})
public class TimeInstantType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "WindowBefore")
    protected Duration windowBefore;
    @XmlAttribute(name = "WindowAfter")
    protected Duration windowAfter;
    @XmlAttribute(name = "CrossDateAllowedIndicator")
    protected Boolean crossDateAllowedIndicator;

    /**
     * Obtém o valor da propriedade value.
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
     * Define o valor da propriedade value.
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
     * Obtém o valor da propriedade windowBefore.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getWindowBefore() {
        return windowBefore;
    }

    /**
     * Define o valor da propriedade windowBefore.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setWindowBefore(Duration value) {
        this.windowBefore = value;
    }

    /**
     * Obtém o valor da propriedade windowAfter.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getWindowAfter() {
        return windowAfter;
    }

    /**
     * Define o valor da propriedade windowAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setWindowAfter(Duration value) {
        this.windowAfter = value;
    }

    /**
     * Obtém o valor da propriedade crossDateAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossDateAllowedIndicator() {
        return crossDateAllowedIndicator;
    }

    /**
     * Define o valor da propriedade crossDateAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossDateAllowedIndicator(Boolean value) {
        this.crossDateAllowedIndicator = value;
    }

}

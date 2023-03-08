
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransportationsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransportationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transportations" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfTransportationTypeTransportation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationsType", propOrder = {
    "transportations"
})
@XmlSeeAlso({
    RelativePositionType.class
})
public class TransportationsType {

    @XmlElement(name = "Transportations")
    protected ArrayOfTransportationTypeTransportation transportations;

    /**
     * Obtém o valor da propriedade transportations.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransportationTypeTransportation }
     *     
     */
    public ArrayOfTransportationTypeTransportation getTransportations() {
        return transportations;
    }

    /**
     * Define o valor da propriedade transportations.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransportationTypeTransportation }
     *     
     */
    public void setTransportations(ArrayOfTransportationTypeTransportation value) {
        this.transportations = value;
    }

}

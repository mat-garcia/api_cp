
package com.omnibees.connectors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PaymentGatewayReservation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentGatewayReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GatewayDetails" type="{http://connectors.omnibees.com/}ArrayOfGatewayDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentGatewayReservation", propOrder = {
    "gatewayDetails"
})
public class PaymentGatewayReservation {

    @XmlElement(name = "GatewayDetails")
    protected ArrayOfGatewayDetail gatewayDetails;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "Number")
    protected String number;

    /**
     * Obtém o valor da propriedade gatewayDetails.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGatewayDetail }
     *     
     */
    public ArrayOfGatewayDetail getGatewayDetails() {
        return gatewayDetails;
    }

    /**
     * Define o valor da propriedade gatewayDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGatewayDetail }
     *     
     */
    public void setGatewayDetails(ArrayOfGatewayDetail value) {
        this.gatewayDetails = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define o valor da propriedade number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

}


package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de TPA_ExtensionsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TPA_ExtensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VATNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PropertyExchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GatewayDetails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGatewayDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPA_ExtensionsType", propOrder = {
    "any",
    "vatNumber",
    "taxID",
    "propertyExchangeRate",
    "propertyExchangeRateDate",
    "gatewayDetails"
})
public class TPAExtensionsType {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "VATNumber")
    protected String vatNumber;
    @XmlElement(name = "TaxID")
    protected String taxID;
    @XmlElement(name = "PropertyExchangeRate")
    protected BigDecimal propertyExchangeRate;
    @XmlElement(name = "PropertyExchangeRateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar propertyExchangeRateDate;
    @XmlElement(name = "GatewayDetails")
    protected ArrayOfGatewayDetail gatewayDetails;

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Obtém o valor da propriedade vatNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATNumber() {
        return vatNumber;
    }

    /**
     * Define o valor da propriedade vatNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * Obtém o valor da propriedade taxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * Define o valor da propriedade taxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

    /**
     * Obtém o valor da propriedade propertyExchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPropertyExchangeRate() {
        return propertyExchangeRate;
    }

    /**
     * Define o valor da propriedade propertyExchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPropertyExchangeRate(BigDecimal value) {
        this.propertyExchangeRate = value;
    }

    /**
     * Obtém o valor da propriedade propertyExchangeRateDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPropertyExchangeRateDate() {
        return propertyExchangeRateDate;
    }

    /**
     * Define o valor da propriedade propertyExchangeRateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPropertyExchangeRateDate(XMLGregorianCalendar value) {
        this.propertyExchangeRateDate = value;
    }

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

}

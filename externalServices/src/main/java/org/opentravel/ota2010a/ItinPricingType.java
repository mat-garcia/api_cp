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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Pricing information for the travel itinerary.
 * 
 * <p>Java class for ItinPricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinPricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cost"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType"&gt;
 *                 &lt;attribute name="FormOfPaymentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ItemRPH_List" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" /&gt;
 *       &lt;attribute name="AssociatedItemRPH"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinPricingType", propOrder = {
    "cost",
    "tpa_Extensions"
})
@XmlSeeAlso({
    org.opentravel.ota2010a.ReservationItemsType.ItemPricing.class
})
public class ItinPricingType
    implements Serializable
{

    @XmlElement(name = "Cost", required = true)
    protected ItinPricingType.Cost cost;
    @XmlElement(name = "TPA_Extensions")
    protected TPA_ExtensionsType tpa_Extensions;
    @XmlAttribute(name = "ItemRPH_List")
    protected List<String> itemRPH_List = new Vector<String>();
    @XmlAttribute(name = "AssociatedItemRPH")
    protected List<String> associatedItemRPH = new Vector<String>();

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link ItinPricingType.Cost }
     *     
     */
    public ItinPricingType.Cost getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinPricingType.Cost }
     *     
     */
    public void setCost(ItinPricingType.Cost value) {
        this.cost = value;
    }

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

    /**
     * Gets the value of the itemRPHList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemRPHList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemRPH_List().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItemRPH_List() {
        if (itemRPH_List == null) {
            itemRPH_List = new Vector<String>();
        }
        return this.itemRPH_List;
    }

    /**
     * Gets the value of the associatedItemRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedItemRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedItemRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssociatedItemRPH() {
        if (associatedItemRPH == null) {
            associatedItemRPH = new Vector<String>();
        }
        return this.associatedItemRPH;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType"&gt;
     *       &lt;attribute name="FormOfPaymentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cost
        extends TotalType
        implements Serializable
    {

        @XmlAttribute(name = "FormOfPaymentRPH")
        protected String formOfPaymentRPH;

        /**
         * Gets the value of the formOfPaymentRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormOfPaymentRPH() {
            return formOfPaymentRPH;
        }

        /**
         * Sets the value of the formOfPaymentRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormOfPaymentRPH(String value) {
            this.formOfPaymentRPH = value;
        }

    }

}

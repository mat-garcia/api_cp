
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRatePlanShoulder complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRatePlanShoulder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlanShoulder" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProduct" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ShoulderRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PreShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="PostShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="PreShoulderStartDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PostShoulderEndDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "ArrayOfRatePlanShoulder", propOrder = {
    "ratePlanShoulder"
})
public class ArrayOfRatePlanShoulder {

    @XmlElement(name = "RatePlanShoulder")
    protected List<ArrayOfRatePlanShoulder.RatePlanShoulder> ratePlanShoulder;

    /**
     * Gets the value of the ratePlanShoulder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanShoulder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanShoulder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfRatePlanShoulder.RatePlanShoulder }
     * 
     * 
     */
    public List<ArrayOfRatePlanShoulder.RatePlanShoulder> getRatePlanShoulder() {
        if (ratePlanShoulder == null) {
            ratePlanShoulder = new ArrayList<ArrayOfRatePlanShoulder.RatePlanShoulder>();
        }
        return this.ratePlanShoulder;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SellableProducts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSellableProduct" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ShoulderRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PreShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="PostShoulderSellLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="PreShoulderStartDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PostShoulderEndDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sellableProducts"
    })
    public static class RatePlanShoulder {

        @XmlElement(name = "SellableProducts")
        protected ArrayOfSellableProduct sellableProducts;
        @XmlAttribute(name = "ShoulderRPH")
        protected String shoulderRPH;
        @XmlAttribute(name = "PreShoulderSellLimit")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger preShoulderSellLimit;
        @XmlAttribute(name = "PostShoulderSellLimit")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger postShoulderSellLimit;
        @XmlAttribute(name = "PreShoulderStartDate")
        protected String preShoulderStartDate;
        @XmlAttribute(name = "PostShoulderEndDate")
        protected String postShoulderEndDate;

        /**
         * Obtém o valor da propriedade sellableProducts.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSellableProduct }
         *     
         */
        public ArrayOfSellableProduct getSellableProducts() {
            return sellableProducts;
        }

        /**
         * Define o valor da propriedade sellableProducts.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSellableProduct }
         *     
         */
        public void setSellableProducts(ArrayOfSellableProduct value) {
            this.sellableProducts = value;
        }

        /**
         * Obtém o valor da propriedade shoulderRPH.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShoulderRPH() {
            return shoulderRPH;
        }

        /**
         * Define o valor da propriedade shoulderRPH.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShoulderRPH(String value) {
            this.shoulderRPH = value;
        }

        /**
         * Obtém o valor da propriedade preShoulderSellLimit.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPreShoulderSellLimit() {
            return preShoulderSellLimit;
        }

        /**
         * Define o valor da propriedade preShoulderSellLimit.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPreShoulderSellLimit(BigInteger value) {
            this.preShoulderSellLimit = value;
        }

        /**
         * Obtém o valor da propriedade postShoulderSellLimit.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPostShoulderSellLimit() {
            return postShoulderSellLimit;
        }

        /**
         * Define o valor da propriedade postShoulderSellLimit.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPostShoulderSellLimit(BigInteger value) {
            this.postShoulderSellLimit = value;
        }

        /**
         * Obtém o valor da propriedade preShoulderStartDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreShoulderStartDate() {
            return preShoulderStartDate;
        }

        /**
         * Define o valor da propriedade preShoulderStartDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreShoulderStartDate(String value) {
            this.preShoulderStartDate = value;
        }

        /**
         * Obtém o valor da propriedade postShoulderEndDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostShoulderEndDate() {
            return postShoulderEndDate;
        }

        /**
         * Define o valor da propriedade postShoulderEndDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostShoulderEndDate(String value) {
            this.postShoulderEndDate = value;
        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 12:21:47 PM BRST 
//


package org.opentravel.ota2010a;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * ResGlobalInfo is a container for various information that affects the Reservation as a whole. These include global comments, counts, reservation IDs, loyalty programs, and payment methods.
 * 
 * <p>Java class for DynamicPkgGlobalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicPkgGlobalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResGlobalInfoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DynamicPkgIDs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DynamicPkgID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Promotions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Promotion" maxOccurs="99"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountInfoGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicPkgGlobalInfoType", propOrder = {
    "dynamicPkgIDs",
    "promotions"
})
public class DynamicPkgGlobalInfoType
    extends ResGlobalInfoType
    implements Serializable
{

    @XmlElement(name = "DynamicPkgIDs")
    protected DynamicPkgGlobalInfoType.DynamicPkgIDs dynamicPkgIDs;
    @XmlElement(name = "Promotions")
    protected DynamicPkgGlobalInfoType.Promotions promotions;

    /**
     * Gets the value of the dynamicPkgIDs property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicPkgGlobalInfoType.DynamicPkgIDs }
     *     
     */
    public DynamicPkgGlobalInfoType.DynamicPkgIDs getDynamicPkgIDs() {
        return dynamicPkgIDs;
    }

    /**
     * Sets the value of the dynamicPkgIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicPkgGlobalInfoType.DynamicPkgIDs }
     *     
     */
    public void setDynamicPkgIDs(DynamicPkgGlobalInfoType.DynamicPkgIDs value) {
        this.dynamicPkgIDs = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicPkgGlobalInfoType.Promotions }
     *     
     */
    public DynamicPkgGlobalInfoType.Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicPkgGlobalInfoType.Promotions }
     *     
     */
    public void setPromotions(DynamicPkgGlobalInfoType.Promotions value) {
        this.promotions = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DynamicPkgID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dynamicPkgID"
    })
    public static class DynamicPkgIDs
        implements Serializable
    {

        @XmlElement(name = "DynamicPkgID", required = true)
        protected List<UniqueID_Type> dynamicPkgID = new Vector<UniqueID_Type>();

        /**
         * Gets the value of the dynamicPkgID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dynamicPkgID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDynamicPkgID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UniqueID_Type }
         * 
         * 
         */
        public List<UniqueID_Type> getDynamicPkgID() {
            if (dynamicPkgID == null) {
                dynamicPkgID = new Vector<UniqueID_Type>();
            }
            return this.dynamicPkgID;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Promotion" maxOccurs="99"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountInfoGroup"/&gt;
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
    @XmlType(name = "", propOrder = {
        "promotion"
    })
    public static class Promotions
        implements Serializable
    {

        @XmlElement(name = "Promotion", required = true)
        protected List<DynamicPkgGlobalInfoType.Promotions.Promotion> promotion = new Vector<DynamicPkgGlobalInfoType.Promotions.Promotion>();

        /**
         * Gets the value of the promotion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DynamicPkgGlobalInfoType.Promotions.Promotion }
         * 
         * 
         */
        public List<DynamicPkgGlobalInfoType.Promotions.Promotion> getPromotion() {
            if (promotion == null) {
                promotion = new Vector<DynamicPkgGlobalInfoType.Promotions.Promotion>();
            }
            return this.promotion;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountInfoGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Promotion
            implements Serializable
        {

            @XmlAttribute(name = "Percent")
            protected BigDecimal percent;
            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the percent property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercent() {
                return percent;
            }

            /**
             * Sets the value of the percent property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercent(BigDecimal value) {
                this.percent = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

        }

    }

}
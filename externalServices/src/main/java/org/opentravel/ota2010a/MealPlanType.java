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
 * Details of meal arrangements, booked or available according to context, with appropriate supplementary charges.
 * 
 * <p>Java class for MealPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MealPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerCounts" type="{http://www.opentravel.org/OTA/2003/05}CustomerCountsType" minOccurs="0"/&gt;
 *         &lt;element name="PassengerRPHs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ListOfPassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Prices" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Price" maxOccurs="9"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/&gt;
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
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealPlanGroup"/&gt;
 *       &lt;attribute name="ListOfRoomRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MealPlanType", propOrder = {
    "customerCounts",
    "passengerRPHs",
    "prices"
})
public class MealPlanType
    implements Serializable
{

    @XmlElement(name = "CustomerCounts")
    protected CustomerCountsType customerCounts;
    @XmlElement(name = "PassengerRPHs")
    protected MealPlanType.PassengerRPHs passengerRPHs;
    @XmlElement(name = "Prices")
    protected MealPlanType.Prices prices;
    @XmlAttribute(name = "ListOfRoomRPH")
    protected List<String> listOfRoomRPH = new Vector<String>();
    @XmlAttribute(name = "Plan")
    protected String plan;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;

    /**
     * Gets the value of the customerCounts property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCountsType }
     *     
     */
    public CustomerCountsType getCustomerCounts() {
        return customerCounts;
    }

    /**
     * Sets the value of the customerCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCountsType }
     *     
     */
    public void setCustomerCounts(CustomerCountsType value) {
        this.customerCounts = value;
    }

    /**
     * Gets the value of the passengerRPHs property.
     * 
     * @return
     *     possible object is
     *     {@link MealPlanType.PassengerRPHs }
     *     
     */
    public MealPlanType.PassengerRPHs getPassengerRPHs() {
        return passengerRPHs;
    }

    /**
     * Sets the value of the passengerRPHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealPlanType.PassengerRPHs }
     *     
     */
    public void setPassengerRPHs(MealPlanType.PassengerRPHs value) {
        this.passengerRPHs = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link MealPlanType.Prices }
     *     
     */
    public MealPlanType.Prices getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealPlanType.Prices }
     *     
     */
    public void setPrices(MealPlanType.Prices value) {
        this.prices = value;
    }

    /**
     * Gets the value of the listOfRoomRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfRoomRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfRoomRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfRoomRPH() {
        if (listOfRoomRPH == null) {
            listOfRoomRPH = new Vector<String>();
        }
        return this.listOfRoomRPH;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlan(String value) {
        this.plan = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
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
     *       &lt;attribute name="ListOfPassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerRPHs
        implements Serializable
    {

        @XmlAttribute(name = "ListOfPassengerRPH")
        protected List<String> listOfPassengerRPH = new Vector<String>();

        /**
         * Gets the value of the listOfPassengerRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOfPassengerRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOfPassengerRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getListOfPassengerRPH() {
            if (listOfPassengerRPH == null) {
                listOfPassengerRPH = new Vector<String>();
            }
            return this.listOfPassengerRPH;
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
     *         &lt;element name="Price" maxOccurs="9"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/&gt;
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
        "price"
    })
    public static class Prices
        implements Serializable
    {

        @XmlElement(name = "Price", required = true)
        protected List<MealPlanType.Prices.Price> price = new Vector<MealPlanType.Prices.Price>();

        /**
         * Gets the value of the price property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the price property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MealPlanType.Prices.Price }
         * 
         * 
         */
        public List<MealPlanType.Prices.Price> getPrice() {
            if (price == null) {
                price = new Vector<MealPlanType.Prices.Price>();
            }
            return this.price;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Price
            implements Serializable
        {

            @XmlAttribute(name = "PriceQualifier")
            protected Integer priceQualifier;
            @XmlAttribute(name = "PriceBasis")
            protected PricingType priceBasis;
            @XmlAttribute(name = "AgeQualifyingCode")
            protected String ageQualifyingCode;
            @XmlAttribute(name = "Age")
            protected Integer age;
            @XmlAttribute(name = "Count")
            protected Integer count;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the priceQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPriceQualifier() {
                return priceQualifier;
            }

            /**
             * Sets the value of the priceQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPriceQualifier(Integer value) {
                this.priceQualifier = value;
            }

            /**
             * Gets the value of the priceBasis property.
             * 
             * @return
             *     possible object is
             *     {@link PricingType }
             *     
             */
            public PricingType getPriceBasis() {
                return priceBasis;
            }

            /**
             * Sets the value of the priceBasis property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingType }
             *     
             */
            public void setPriceBasis(PricingType value) {
                this.priceBasis = value;
            }

            /**
             * Gets the value of the ageQualifyingCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeQualifyingCode() {
                return ageQualifyingCode;
            }

            /**
             * Sets the value of the ageQualifyingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeQualifyingCode(String value) {
                this.ageQualifyingCode = value;
            }

            /**
             * Gets the value of the age property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAge() {
                return age;
            }

            /**
             * Sets the value of the age property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAge(Integer value) {
                this.age = value;
            }

            /**
             * Gets the value of the count property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCount() {
                return count;
            }

            /**
             * Sets the value of the count property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCount(Integer value) {
                this.count = value;
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

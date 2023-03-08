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
 * A single round of golf that may include one or more golfers. If there is more than one round, each round will be represented separately.
 * 
 * <p>Java class for RoundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoundType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Charges" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cancel" type="{http://www.opentravel.org/OTA/2003/05}CancelRuleType" minOccurs="0"/&gt;
 *         &lt;element name="Golfers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Golfer" type="{http://www.opentravel.org/OTA/2003/05}GolferType" maxOccurs="99"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RateQualifiers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RateQualifier" type="{http://www.opentravel.org/OTA/2003/05}RateQualifierType" maxOccurs="99"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/&gt;
 *       &lt;attribute name="RoundID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="PlayDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" /&gt;
 *       &lt;attribute name="NumberOfGolfers" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="PackageID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
 *       &lt;attribute name="StartingTee" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" /&gt;
 *       &lt;attribute name="NumberOfCarts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundType", propOrder = {
    "charges",
    "cancel",
    "golfers",
    "rateQualifiers"
})
public class RoundType
    implements Serializable
{

    @XmlElement(name = "Charges")
    protected RoundType.Charges charges;
    @XmlElement(name = "Cancel")
    protected CancelRuleType cancel;
    @XmlElement(name = "Golfers")
    protected RoundType.Golfers golfers;
    @XmlElement(name = "RateQualifiers")
    protected RoundType.RateQualifiers rateQualifiers;
    @XmlAttribute(name = "RoundID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger roundID;
    @XmlAttribute(name = "PlayDateTime")
    protected String playDateTime;
    @XmlAttribute(name = "NumberOfGolfers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfGolfers;
    @XmlAttribute(name = "PackageID")
    protected String packageID;
    @XmlAttribute(name = "StartingTee")
    protected String startingTee;
    @XmlAttribute(name = "NumberOfCarts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfCarts;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link RoundType.Charges }
     *     
     */
    public RoundType.Charges getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundType.Charges }
     *     
     */
    public void setCharges(RoundType.Charges value) {
        this.charges = value;
    }

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link CancelRuleType }
     *     
     */
    public CancelRuleType getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelRuleType }
     *     
     */
    public void setCancel(CancelRuleType value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the golfers property.
     * 
     * @return
     *     possible object is
     *     {@link RoundType.Golfers }
     *     
     */
    public RoundType.Golfers getGolfers() {
        return golfers;
    }

    /**
     * Sets the value of the golfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundType.Golfers }
     *     
     */
    public void setGolfers(RoundType.Golfers value) {
        this.golfers = value;
    }

    /**
     * Gets the value of the rateQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link RoundType.RateQualifiers }
     *     
     */
    public RoundType.RateQualifiers getRateQualifiers() {
        return rateQualifiers;
    }

    /**
     * Sets the value of the rateQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundType.RateQualifiers }
     *     
     */
    public void setRateQualifiers(RoundType.RateQualifiers value) {
        this.rateQualifiers = value;
    }

    /**
     * Gets the value of the roundID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoundID() {
        return roundID;
    }

    /**
     * Sets the value of the roundID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoundID(BigInteger value) {
        this.roundID = value;
    }

    /**
     * Gets the value of the playDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayDateTime() {
        return playDateTime;
    }

    /**
     * Sets the value of the playDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayDateTime(String value) {
        this.playDateTime = value;
    }

    /**
     * Gets the value of the numberOfGolfers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfGolfers() {
        return numberOfGolfers;
    }

    /**
     * Sets the value of the numberOfGolfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfGolfers(BigInteger value) {
        this.numberOfGolfers = value;
    }

    /**
     * Gets the value of the packageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageID() {
        return packageID;
    }

    /**
     * Sets the value of the packageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageID(String value) {
        this.packageID = value;
    }

    /**
     * Gets the value of the startingTee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingTee() {
        return startingTee;
    }

    /**
     * Sets the value of the startingTee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingTee(String value) {
        this.startingTee = value;
    }

    /**
     * Gets the value of the numberOfCarts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCarts() {
        return numberOfCarts;
    }

    /**
     * Sets the value of the numberOfCarts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCarts(BigInteger value) {
        this.numberOfCarts = value;
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
     *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" maxOccurs="unbounded"/&gt;
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
        "charge"
    })
    public static class Charges
        implements Serializable
    {

        @XmlElement(name = "Charge", required = true)
        protected List<FeeType> charge = new Vector<FeeType>();

        /**
         * Gets the value of the charge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the charge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeeType }
         * 
         * 
         */
        public List<FeeType> getCharge() {
            if (charge == null) {
                charge = new Vector<FeeType>();
            }
            return this.charge;
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
     *         &lt;element name="Golfer" type="{http://www.opentravel.org/OTA/2003/05}GolferType" maxOccurs="99"/&gt;
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
        "golfer"
    })
    public static class Golfers
        implements Serializable
    {

        @XmlElement(name = "Golfer", required = true)
        protected List<GolferType> golfer = new Vector<GolferType>();

        /**
         * Gets the value of the golfer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the golfer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGolfer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GolferType }
         * 
         * 
         */
        public List<GolferType> getGolfer() {
            if (golfer == null) {
                golfer = new Vector<GolferType>();
            }
            return this.golfer;
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
     *         &lt;element name="RateQualifier" type="{http://www.opentravel.org/OTA/2003/05}RateQualifierType" maxOccurs="99"/&gt;
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
        "rateQualifier"
    })
    public static class RateQualifiers
        implements Serializable
    {

        @XmlElement(name = "RateQualifier", required = true)
        protected List<RateQualifierType> rateQualifier = new Vector<RateQualifierType>();

        /**
         * Gets the value of the rateQualifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rateQualifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRateQualifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateQualifierType }
         * 
         * 
         */
        public List<RateQualifierType> getRateQualifier() {
            if (rateQualifier == null) {
                rateQualifier = new Vector<RateQualifierType>();
            }
            return this.rateQualifier;
        }

    }

}


package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OfferType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferRule" minOccurs="0"/&gt;
 *         &lt;element name="Discount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="NightsRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="NightsDiscounted" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="DiscountPattern" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="ChargeUnitCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}Enum_ChargeType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FreeUpgrade" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UpgradeFrom" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="InvCodeApplication"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="DoesNotApply"/&gt;
 *                                 &lt;enumeration value="InvCode"/&gt;
 *                                 &lt;enumeration value="InvGroupingCode"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UpgradeTo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="InvCodeApplication"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="DoesNotApply"/&gt;
 *                                 &lt;enumeration value="InvCode"/&gt;
 *                                 &lt;enumeration value="InvGroupingCode"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="UpgradeBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OfferDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *         &lt;element name="CompatibleOffers" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCompatibleOffer" minOccurs="0"/&gt;
 *         &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeInventory" minOccurs="0"/&gt;
 *         &lt;element name="Guests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeGuest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ApplicationOrder" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType", propOrder = {
    "offerRules",
    "discount",
    "freeUpgrade",
    "offerDescription",
    "compatibleOffers",
    "inventories",
    "guests"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.ArrayOfOffer.Offer.class
})
public class OfferType {

    @XmlElement(name = "OfferRules")
    protected ArrayOfOfferRule offerRules;
    @XmlElement(name = "Discount")
    protected OfferType.Discount discount;
    @XmlElement(name = "FreeUpgrade")
    protected OfferType.FreeUpgrade freeUpgrade;
    @XmlElement(name = "OfferDescription")
    protected ParagraphType offerDescription;
    @XmlElement(name = "CompatibleOffers")
    protected ArrayOfCompatibleOffer compatibleOffers;
    @XmlElement(name = "Inventories")
    protected ArrayOfOfferTypeInventory inventories;
    @XmlElement(name = "Guests")
    protected ArrayOfOfferTypeGuest guests;
    @XmlAttribute(name = "OfferCode")
    protected String offerCode;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ApplicationOrder")
    protected BigInteger applicationOrder;

    /**
     * Obtém o valor da propriedade offerRules.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferRule }
     *     
     */
    public ArrayOfOfferRule getOfferRules() {
        return offerRules;
    }

    /**
     * Define o valor da propriedade offerRules.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferRule }
     *     
     */
    public void setOfferRules(ArrayOfOfferRule value) {
        this.offerRules = value;
    }

    /**
     * Obtém o valor da propriedade discount.
     * 
     * @return
     *     possible object is
     *     {@link OfferType.Discount }
     *     
     */
    public OfferType.Discount getDiscount() {
        return discount;
    }

    /**
     * Define o valor da propriedade discount.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType.Discount }
     *     
     */
    public void setDiscount(OfferType.Discount value) {
        this.discount = value;
    }

    /**
     * Obtém o valor da propriedade freeUpgrade.
     * 
     * @return
     *     possible object is
     *     {@link OfferType.FreeUpgrade }
     *     
     */
    public OfferType.FreeUpgrade getFreeUpgrade() {
        return freeUpgrade;
    }

    /**
     * Define o valor da propriedade freeUpgrade.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType.FreeUpgrade }
     *     
     */
    public void setFreeUpgrade(OfferType.FreeUpgrade value) {
        this.freeUpgrade = value;
    }

    /**
     * Obtém o valor da propriedade offerDescription.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getOfferDescription() {
        return offerDescription;
    }

    /**
     * Define o valor da propriedade offerDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setOfferDescription(ParagraphType value) {
        this.offerDescription = value;
    }

    /**
     * Obtém o valor da propriedade compatibleOffers.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompatibleOffer }
     *     
     */
    public ArrayOfCompatibleOffer getCompatibleOffers() {
        return compatibleOffers;
    }

    /**
     * Define o valor da propriedade compatibleOffers.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompatibleOffer }
     *     
     */
    public void setCompatibleOffers(ArrayOfCompatibleOffer value) {
        this.compatibleOffers = value;
    }

    /**
     * Obtém o valor da propriedade inventories.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferTypeInventory }
     *     
     */
    public ArrayOfOfferTypeInventory getInventories() {
        return inventories;
    }

    /**
     * Define o valor da propriedade inventories.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferTypeInventory }
     *     
     */
    public void setInventories(ArrayOfOfferTypeInventory value) {
        this.inventories = value;
    }

    /**
     * Obtém o valor da propriedade guests.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferTypeGuest }
     *     
     */
    public ArrayOfOfferTypeGuest getGuests() {
        return guests;
    }

    /**
     * Define o valor da propriedade guests.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferTypeGuest }
     *     
     */
    public void setGuests(ArrayOfOfferTypeGuest value) {
        this.guests = value;
    }

    /**
     * Obtém o valor da propriedade offerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Define o valor da propriedade offerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
    }

    /**
     * Obtém o valor da propriedade rph.
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
     * Define o valor da propriedade rph.
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
     * Obtém o valor da propriedade applicationOrder.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationOrder() {
        return applicationOrder;
    }

    /**
     * Define o valor da propriedade applicationOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationOrder(BigInteger value) {
        this.applicationOrder = value;
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
     *       &lt;attribute name="NightsRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="NightsDiscounted" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="DiscountPattern" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="ChargeUnitCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}Enum_ChargeType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Discount {

        @XmlAttribute(name = "NightsRequired")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nightsRequired;
        @XmlAttribute(name = "NightsDiscounted")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nightsDiscounted;
        @XmlAttribute(name = "DiscountPattern")
        protected String discountPattern;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "ChargeUnitCode", required = true)
        protected String chargeUnitCode;

        /**
         * Obtém o valor da propriedade nightsRequired.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNightsRequired() {
            return nightsRequired;
        }

        /**
         * Define o valor da propriedade nightsRequired.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNightsRequired(BigInteger value) {
            this.nightsRequired = value;
        }

        /**
         * Obtém o valor da propriedade nightsDiscounted.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNightsDiscounted() {
            return nightsDiscounted;
        }

        /**
         * Define o valor da propriedade nightsDiscounted.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNightsDiscounted(BigInteger value) {
            this.nightsDiscounted = value;
        }

        /**
         * Obtém o valor da propriedade discountPattern.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscountPattern() {
            return discountPattern;
        }

        /**
         * Define o valor da propriedade discountPattern.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscountPattern(String value) {
            this.discountPattern = value;
        }

        /**
         * Obtém o valor da propriedade currencyCode.
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
         * Define o valor da propriedade currencyCode.
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
         * Obtém o valor da propriedade decimalPlaces.
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
         * Define o valor da propriedade decimalPlaces.
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
         * Obtém o valor da propriedade amount.
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
         * Define o valor da propriedade amount.
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
         * Obtém o valor da propriedade percent.
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
         * Define o valor da propriedade percent.
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
         * Obtém o valor da propriedade chargeUnitCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargeUnitCode() {
            return chargeUnitCode;
        }

        /**
         * Define o valor da propriedade chargeUnitCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargeUnitCode(String value) {
            this.chargeUnitCode = value;
        }

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
     *         &lt;element name="UpgradeFrom" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="InvCodeApplication"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="DoesNotApply"/&gt;
     *                       &lt;enumeration value="InvCode"/&gt;
     *                       &lt;enumeration value="InvGroupingCode"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="UpgradeTo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="InvCodeApplication"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="DoesNotApply"/&gt;
     *                       &lt;enumeration value="InvCode"/&gt;
     *                       &lt;enumeration value="InvGroupingCode"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="UpgradeBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "upgradeFrom",
        "upgradeTo"
    })
    public static class FreeUpgrade {

        @XmlElement(name = "UpgradeFrom")
        protected OfferType.FreeUpgrade.UpgradeFrom upgradeFrom;
        @XmlElement(name = "UpgradeTo")
        protected OfferType.FreeUpgrade.UpgradeTo upgradeTo;
        @XmlAttribute(name = "UpgradeBookingCode")
        protected String upgradeBookingCode;

        /**
         * Obtém o valor da propriedade upgradeFrom.
         * 
         * @return
         *     possible object is
         *     {@link OfferType.FreeUpgrade.UpgradeFrom }
         *     
         */
        public OfferType.FreeUpgrade.UpgradeFrom getUpgradeFrom() {
            return upgradeFrom;
        }

        /**
         * Define o valor da propriedade upgradeFrom.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferType.FreeUpgrade.UpgradeFrom }
         *     
         */
        public void setUpgradeFrom(OfferType.FreeUpgrade.UpgradeFrom value) {
            this.upgradeFrom = value;
        }

        /**
         * Obtém o valor da propriedade upgradeTo.
         * 
         * @return
         *     possible object is
         *     {@link OfferType.FreeUpgrade.UpgradeTo }
         *     
         */
        public OfferType.FreeUpgrade.UpgradeTo getUpgradeTo() {
            return upgradeTo;
        }

        /**
         * Define o valor da propriedade upgradeTo.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferType.FreeUpgrade.UpgradeTo }
         *     
         */
        public void setUpgradeTo(OfferType.FreeUpgrade.UpgradeTo value) {
            this.upgradeTo = value;
        }

        /**
         * Obtém o valor da propriedade upgradeBookingCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpgradeBookingCode() {
            return upgradeBookingCode;
        }

        /**
         * Define o valor da propriedade upgradeBookingCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpgradeBookingCode(String value) {
            this.upgradeBookingCode = value;
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
         *       &lt;attribute name="InvCodeApplication"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="DoesNotApply"/&gt;
         *             &lt;enumeration value="InvCode"/&gt;
         *             &lt;enumeration value="InvGroupingCode"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UpgradeFrom {

            @XmlAttribute(name = "InvCodeApplication")
            protected String invCodeApplication;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;
            @XmlAttribute(name = "InvTypeCode")
            protected String invTypeCode;
            @XmlAttribute(name = "IsRoom")
            protected Boolean isRoom;

            /**
             * Obtém o valor da propriedade invCodeApplication.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * Define o valor da propriedade invCodeApplication.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * Obtém o valor da propriedade invCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * Define o valor da propriedade invCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * Obtém o valor da propriedade invType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * Define o valor da propriedade invType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * Obtém o valor da propriedade invTypeCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * Define o valor da propriedade invTypeCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * Obtém o valor da propriedade isRoom.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * Define o valor da propriedade isRoom.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
            }

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
         *       &lt;attribute name="InvCodeApplication"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="DoesNotApply"/&gt;
         *             &lt;enumeration value="InvCode"/&gt;
         *             &lt;enumeration value="InvGroupingCode"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UpgradeTo {

            @XmlAttribute(name = "InvCodeApplication")
            protected String invCodeApplication;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;
            @XmlAttribute(name = "InvTypeCode")
            protected String invTypeCode;
            @XmlAttribute(name = "IsRoom")
            protected Boolean isRoom;

            /**
             * Obtém o valor da propriedade invCodeApplication.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * Define o valor da propriedade invCodeApplication.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * Obtém o valor da propriedade invCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * Define o valor da propriedade invCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * Obtém o valor da propriedade invType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * Define o valor da propriedade invType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * Obtém o valor da propriedade invTypeCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * Define o valor da propriedade invTypeCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * Obtém o valor da propriedade isRoom.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * Define o valor da propriedade isRoom.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
            }

        }

    }

}

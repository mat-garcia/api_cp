
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CabinOptionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CabinOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinConfiguration" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="BedConfigurationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MeasurementInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DimensionInfo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CategoryLocation" type="{http://www.opentravel.org/OTA/2003/05}CategoryLocationType" /&gt;
 *       &lt;attribute name="ShipSide"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Starboard"/&gt;
 *             &lt;enumeration value="Port"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PositionInShip"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Aft"/&gt;
 *             &lt;enumeration value="Forward"/&gt;
 *             &lt;enumeration value="Midship"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="BedType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="DeclineIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="HeldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReleaseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="DeckNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DeckName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CabinCategoryStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CabinCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CabinRanking" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ConnectingCabinIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ConnectingCabinNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SharedCabinGender"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Female"/&gt;
 *             &lt;enumeration value="Male"/&gt;
 *             &lt;enumeration value="MaleAndFemale"/&gt;
 *             &lt;enumeration value="NoPreference"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ConfirmedOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinOptionType", propOrder = {
    "cabinConfiguration",
    "measurementInfo",
    "remark"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.SailingCategoryInfoType.SelectedCategory.SelectedCabin.class
})
public class CabinOptionType {

    @XmlElement(name = "CabinConfiguration")
    protected List<CabinOptionType.CabinConfiguration> cabinConfiguration;
    @XmlElement(name = "MeasurementInfo")
    protected List<CabinOptionType.MeasurementInfo> measurementInfo;
    @XmlElement(name = "Remark")
    protected FreeTextType remark;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "CategoryLocation")
    protected CategoryLocationType categoryLocation;
    @XmlAttribute(name = "ShipSide")
    protected String shipSide;
    @XmlAttribute(name = "PositionInShip")
    protected String positionInShip;
    @XmlAttribute(name = "BedType")
    protected String bedType;
    @XmlAttribute(name = "CabinNumber")
    protected String cabinNumber;
    @XmlAttribute(name = "MaxOccupancy")
    protected BigInteger maxOccupancy;
    @XmlAttribute(name = "DeclineIndicator")
    protected Boolean declineIndicator;
    @XmlAttribute(name = "HeldIndicator")
    protected Boolean heldIndicator;
    @XmlAttribute(name = "ReleaseDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDateTime;
    @XmlAttribute(name = "DeckNumber")
    protected String deckNumber;
    @XmlAttribute(name = "DeckName")
    protected String deckName;
    @XmlAttribute(name = "CabinCategoryStatusCode")
    protected String cabinCategoryStatusCode;
    @XmlAttribute(name = "CabinCategoryCode")
    protected String cabinCategoryCode;
    @XmlAttribute(name = "CabinRanking")
    protected BigInteger cabinRanking;
    @XmlAttribute(name = "ConnectingCabinIndicator")
    protected Boolean connectingCabinIndicator;
    @XmlAttribute(name = "ConnectingCabinNumber")
    protected String connectingCabinNumber;
    @XmlAttribute(name = "SharedCabinGender")
    protected String sharedCabinGender;
    @XmlAttribute(name = "ConfirmedOccupancy")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger confirmedOccupancy;

    /**
     * Gets the value of the cabinConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinOptionType.CabinConfiguration }
     * 
     * 
     */
    public List<CabinOptionType.CabinConfiguration> getCabinConfiguration() {
        if (cabinConfiguration == null) {
            cabinConfiguration = new ArrayList<CabinOptionType.CabinConfiguration>();
        }
        return this.cabinConfiguration;
    }

    /**
     * Gets the value of the measurementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinOptionType.MeasurementInfo }
     * 
     * 
     */
    public List<CabinOptionType.MeasurementInfo> getMeasurementInfo() {
        if (measurementInfo == null) {
            measurementInfo = new ArrayList<CabinOptionType.MeasurementInfo>();
        }
        return this.measurementInfo;
    }

    /**
     * Obtém o valor da propriedade remark.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getRemark() {
        return remark;
    }

    /**
     * Define o valor da propriedade remark.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setRemark(FreeTextType value) {
        this.remark = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade categoryLocation.
     * 
     * @return
     *     possible object is
     *     {@link CategoryLocationType }
     *     
     */
    public CategoryLocationType getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * Define o valor da propriedade categoryLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryLocationType }
     *     
     */
    public void setCategoryLocation(CategoryLocationType value) {
        this.categoryLocation = value;
    }

    /**
     * Obtém o valor da propriedade shipSide.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipSide() {
        return shipSide;
    }

    /**
     * Define o valor da propriedade shipSide.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipSide(String value) {
        this.shipSide = value;
    }

    /**
     * Obtém o valor da propriedade positionInShip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionInShip() {
        return positionInShip;
    }

    /**
     * Define o valor da propriedade positionInShip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionInShip(String value) {
        this.positionInShip = value;
    }

    /**
     * Obtém o valor da propriedade bedType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * Define o valor da propriedade bedType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedType(String value) {
        this.bedType = value;
    }

    /**
     * Obtém o valor da propriedade cabinNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinNumber() {
        return cabinNumber;
    }

    /**
     * Define o valor da propriedade cabinNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinNumber(String value) {
        this.cabinNumber = value;
    }

    /**
     * Obtém o valor da propriedade maxOccupancy.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Define o valor da propriedade maxOccupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOccupancy(BigInteger value) {
        this.maxOccupancy = value;
    }

    /**
     * Obtém o valor da propriedade declineIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeclineIndicator() {
        return declineIndicator;
    }

    /**
     * Define o valor da propriedade declineIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeclineIndicator(Boolean value) {
        this.declineIndicator = value;
    }

    /**
     * Obtém o valor da propriedade heldIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeldIndicator() {
        return heldIndicator;
    }

    /**
     * Define o valor da propriedade heldIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeldIndicator(Boolean value) {
        this.heldIndicator = value;
    }

    /**
     * Obtém o valor da propriedade releaseDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDateTime() {
        return releaseDateTime;
    }

    /**
     * Define o valor da propriedade releaseDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDateTime(XMLGregorianCalendar value) {
        this.releaseDateTime = value;
    }

    /**
     * Obtém o valor da propriedade deckNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckNumber() {
        return deckNumber;
    }

    /**
     * Define o valor da propriedade deckNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckNumber(String value) {
        this.deckNumber = value;
    }

    /**
     * Obtém o valor da propriedade deckName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckName() {
        return deckName;
    }

    /**
     * Define o valor da propriedade deckName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckName(String value) {
        this.deckName = value;
    }

    /**
     * Obtém o valor da propriedade cabinCategoryStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCategoryStatusCode() {
        return cabinCategoryStatusCode;
    }

    /**
     * Define o valor da propriedade cabinCategoryStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCategoryStatusCode(String value) {
        this.cabinCategoryStatusCode = value;
    }

    /**
     * Obtém o valor da propriedade cabinCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinCategoryCode() {
        return cabinCategoryCode;
    }

    /**
     * Define o valor da propriedade cabinCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinCategoryCode(String value) {
        this.cabinCategoryCode = value;
    }

    /**
     * Obtém o valor da propriedade cabinRanking.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinRanking() {
        return cabinRanking;
    }

    /**
     * Define o valor da propriedade cabinRanking.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinRanking(BigInteger value) {
        this.cabinRanking = value;
    }

    /**
     * Obtém o valor da propriedade connectingCabinIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectingCabinIndicator() {
        return connectingCabinIndicator;
    }

    /**
     * Define o valor da propriedade connectingCabinIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectingCabinIndicator(Boolean value) {
        this.connectingCabinIndicator = value;
    }

    /**
     * Obtém o valor da propriedade connectingCabinNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectingCabinNumber() {
        return connectingCabinNumber;
    }

    /**
     * Define o valor da propriedade connectingCabinNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectingCabinNumber(String value) {
        this.connectingCabinNumber = value;
    }

    /**
     * Obtém o valor da propriedade sharedCabinGender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedCabinGender() {
        return sharedCabinGender;
    }

    /**
     * Define o valor da propriedade sharedCabinGender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedCabinGender(String value) {
        this.sharedCabinGender = value;
    }

    /**
     * Obtém o valor da propriedade confirmedOccupancy.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConfirmedOccupancy() {
        return confirmedOccupancy;
    }

    /**
     * Define o valor da propriedade confirmedOccupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConfirmedOccupancy(BigInteger value) {
        this.confirmedOccupancy = value;
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
     *       &lt;attribute name="BedConfigurationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinConfiguration {

        @XmlAttribute(name = "BedConfigurationCode")
        protected String bedConfigurationCode;

        /**
         * Obtém o valor da propriedade bedConfigurationCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBedConfigurationCode() {
            return bedConfigurationCode;
        }

        /**
         * Define o valor da propriedade bedConfigurationCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBedConfigurationCode(String value) {
            this.bedConfigurationCode = value;
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
     *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DimensionInfo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MeasurementInfo {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "DimensionInfo")
        protected String dimensionInfo;

        /**
         * Obtém o valor da propriedade unitOfMeasureQuantity.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * Define o valor da propriedade unitOfMeasureQuantity.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * Obtém o valor da propriedade unitOfMeasure.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * Define o valor da propriedade unitOfMeasure.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * Obtém o valor da propriedade unitOfMeasureCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * Define o valor da propriedade unitOfMeasureCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

        /**
         * Obtém o valor da propriedade code.
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
         * Define o valor da propriedade code.
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
         * Obtém o valor da propriedade name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define o valor da propriedade name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtém o valor da propriedade dimensionInfo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDimensionInfo() {
            return dimensionInfo;
        }

        /**
         * Define o valor da propriedade dimensionInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDimensionInfo(String value) {
            this.dimensionInfo = value;
        }

    }

}

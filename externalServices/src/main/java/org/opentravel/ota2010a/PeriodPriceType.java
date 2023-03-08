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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Provides dates and times of availability together with duration and prices. The Duration attribite defines the period for which a charge applies, e.g. P1D = per day, P1N = per night, P7D = per week etc.  If this attribute is not present, the period is assumed to be the duration of the booking.
 * 
 * <p>Java class for PeriodPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OperationScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://www.opentravel.org/OTA/2003/05}PkgPriceType" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
 *       &lt;attribute name="Category"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Room"/&gt;
 *             &lt;enumeration value="Booking"/&gt;
 *             &lt;enumeration value="Person"/&gt;
 *             &lt;enumeration value="Adult"/&gt;
 *             &lt;enumeration value="Child"/&gt;
 *             &lt;enumeration value="Car"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Type"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Base"/&gt;
 *             &lt;enumeration value="AddOn"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DurationPeriod" type="{http://www.opentravel.org/OTA/2003/05}DurationType" /&gt;
 *       &lt;attribute name="PriceBasis" type="{http://www.opentravel.org/OTA/2003/05}PricingType" /&gt;
 *       &lt;attribute name="BasePeriodRPHs" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" /&gt;
 *       &lt;attribute name="GuidePriceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaximumPeriod" type="{http://www.opentravel.org/OTA/2003/05}DurationType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodPriceType", propOrder = {
    "price"
})
public class PeriodPriceType
    extends OperationScheduleType
    implements Serializable
{

    @XmlElement(name = "Price")
    protected List<PkgPriceType> price = new Vector<PkgPriceType>();
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Category")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String category;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "DurationPeriod")
    protected String durationPeriod;
    @XmlAttribute(name = "PriceBasis")
    protected PricingType priceBasis;
    @XmlAttribute(name = "BasePeriodRPHs")
    protected List<String> basePeriodRPHs = new Vector<String>();
    @XmlAttribute(name = "GuidePriceIndicator")
    protected Boolean guidePriceIndicator;
    @XmlAttribute(name = "MaximumPeriod")
    protected String maximumPeriod;

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
     * {@link PkgPriceType }
     * 
     * 
     */
    public List<PkgPriceType> getPrice() {
        if (price == null) {
            price = new Vector<PkgPriceType>();
        }
        return this.price;
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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the durationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * Sets the value of the durationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationPeriod(String value) {
        this.durationPeriod = value;
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
     * Gets the value of the basePeriodRPHs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basePeriodRPHs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasePeriodRPHs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBasePeriodRPHs() {
        if (basePeriodRPHs == null) {
            basePeriodRPHs = new Vector<String>();
        }
        return this.basePeriodRPHs;
    }

    /**
     * Gets the value of the guidePriceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuidePriceIndicator() {
        return guidePriceIndicator;
    }

    /**
     * Sets the value of the guidePriceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuidePriceIndicator(Boolean value) {
        this.guidePriceIndicator = value;
    }

    /**
     * Gets the value of the maximumPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumPeriod() {
        return maximumPeriod;
    }

    /**
     * Sets the value of the maximumPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumPeriod(String value) {
        this.maximumPeriod = value;
    }

}
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


/**
 * <p>Java class for InclusionSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InclusionSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlans" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RatePlan" type="{http://www.opentravel.org/OTA/2003/05}IncludedRatePlanType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Descriptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" /&gt;
 *       &lt;attribute name="Rule" type="{http://www.opentravel.org/OTA/2003/05}DynamicPkgInclusionRule" /&gt;
 *       &lt;attribute name="MatchGuestCount" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MinAdult" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" /&gt;
 *       &lt;attribute name="MaxAdult" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" /&gt;
 *       &lt;attribute name="MinChild" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" /&gt;
 *       &lt;attribute name="MaxChild" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InclusionSetType", propOrder = {
    "ratePlans",
    "descriptions"
})
public class InclusionSetType
    implements Serializable
{

    @XmlElement(name = "RatePlans")
    protected InclusionSetType.RatePlans ratePlans;
    @XmlElement(name = "Descriptions")
    protected InclusionSetType.Descriptions descriptions;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Rule")
    protected DynamicPkgInclusionRule rule;
    @XmlAttribute(name = "MatchGuestCount")
    protected Boolean matchGuestCount;
    @XmlAttribute(name = "MinAdult")
    protected Integer minAdult;
    @XmlAttribute(name = "MaxAdult")
    protected Integer maxAdult;
    @XmlAttribute(name = "MinChild")
    protected Integer minChild;
    @XmlAttribute(name = "MaxChild")
    protected Integer maxChild;

    /**
     * Gets the value of the ratePlans property.
     * 
     * @return
     *     possible object is
     *     {@link InclusionSetType.RatePlans }
     *     
     */
    public InclusionSetType.RatePlans getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link InclusionSetType.RatePlans }
     *     
     */
    public void setRatePlans(InclusionSetType.RatePlans value) {
        this.ratePlans = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link InclusionSetType.Descriptions }
     *     
     */
    public InclusionSetType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link InclusionSetType.Descriptions }
     *     
     */
    public void setDescriptions(InclusionSetType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicPkgInclusionRule }
     *     
     */
    public DynamicPkgInclusionRule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicPkgInclusionRule }
     *     
     */
    public void setRule(DynamicPkgInclusionRule value) {
        this.rule = value;
    }

    /**
     * Gets the value of the matchGuestCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchGuestCount() {
        return matchGuestCount;
    }

    /**
     * Sets the value of the matchGuestCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchGuestCount(Boolean value) {
        this.matchGuestCount = value;
    }

    /**
     * Gets the value of the minAdult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAdult() {
        return minAdult;
    }

    /**
     * Sets the value of the minAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAdult(Integer value) {
        this.minAdult = value;
    }

    /**
     * Gets the value of the maxAdult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAdult() {
        return maxAdult;
    }

    /**
     * Sets the value of the maxAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAdult(Integer value) {
        this.maxAdult = value;
    }

    /**
     * Gets the value of the minChild property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinChild() {
        return minChild;
    }

    /**
     * Sets the value of the minChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinChild(Integer value) {
        this.minChild = value;
    }

    /**
     * Gets the value of the maxChild property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxChild() {
        return maxChild;
    }

    /**
     * Sets the value of the maxChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxChild(Integer value) {
        this.maxChild = value;
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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded"/&gt;
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
        "description"
    })
    public static class Descriptions
        implements Serializable
    {

        @XmlElement(name = "Description", required = true)
        protected List<ParagraphType> description = new Vector<ParagraphType>();

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParagraphType }
         * 
         * 
         */
        public List<ParagraphType> getDescription() {
            if (description == null) {
                description = new Vector<ParagraphType>();
            }
            return this.description;
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
     *         &lt;element name="RatePlan" type="{http://www.opentravel.org/OTA/2003/05}IncludedRatePlanType" maxOccurs="unbounded"/&gt;
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
        "ratePlan"
    })
    public static class RatePlans
        implements Serializable
    {

        @XmlElement(name = "RatePlan", required = true)
        protected List<IncludedRatePlanType> ratePlan = new Vector<IncludedRatePlanType>();

        /**
         * Gets the value of the ratePlan property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ratePlan property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRatePlan().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IncludedRatePlanType }
         * 
         * 
         */
        public List<IncludedRatePlanType> getRatePlan() {
            if (ratePlan == null) {
                ratePlan = new Vector<IncludedRatePlanType>();
            }
            return this.ratePlan;
        }

    }

}

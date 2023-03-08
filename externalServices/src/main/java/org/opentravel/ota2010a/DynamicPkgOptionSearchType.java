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
 * A collection of package option search criteria.
 * 
 * <p>Java class for DynamicPkgOptionSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicPkgOptionSearchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DynamicPkgSearchType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OptionSearchCriteria" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Criterion" type="{http://www.opentravel.org/OTA/2003/05}PackageOptionSearchCriterionType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="AvailableOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RequestType" type="{http://www.opentravel.org/OTA/2003/05}PackageOptionComponentSearchType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicPkgOptionSearchType", propOrder = {
    "optionSearchCriteria",
    "tpa_Extensions"
})
public class DynamicPkgOptionSearchType
    extends DynamicPkgSearchType
    implements Serializable
{

    @XmlElement(name = "OptionSearchCriteria")
    protected DynamicPkgOptionSearchType.OptionSearchCriteria optionSearchCriteria;
    @XmlElement(name = "TPA_Extensions")
    protected TPA_ExtensionsType tpa_Extensions;
    @XmlAttribute(name = "RequestType")
    protected PackageOptionComponentSearchType requestType;

    /**
     * Gets the value of the optionSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicPkgOptionSearchType.OptionSearchCriteria }
     *     
     */
    public DynamicPkgOptionSearchType.OptionSearchCriteria getOptionSearchCriteria() {
        return optionSearchCriteria;
    }

    /**
     * Sets the value of the optionSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicPkgOptionSearchType.OptionSearchCriteria }
     *     
     */
    public void setOptionSearchCriteria(DynamicPkgOptionSearchType.OptionSearchCriteria value) {
        this.optionSearchCriteria = value;
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
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageOptionComponentSearchType }
     *     
     */
    public PackageOptionComponentSearchType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageOptionComponentSearchType }
     *     
     */
    public void setRequestType(PackageOptionComponentSearchType value) {
        this.requestType = value;
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
     *         &lt;element name="Criterion" type="{http://www.opentravel.org/OTA/2003/05}PackageOptionSearchCriterionType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="AvailableOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "criterion"
    })
    public static class OptionSearchCriteria
        implements Serializable
    {

        @XmlElement(name = "Criterion", required = true)
        protected List<PackageOptionSearchCriterionType> criterion = new Vector<PackageOptionSearchCriterionType>();
        @XmlAttribute(name = "AvailableOnlyIndicator")
        protected Boolean availableOnlyIndicator;

        /**
         * Gets the value of the criterion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the criterion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCriterion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PackageOptionSearchCriterionType }
         * 
         * 
         */
        public List<PackageOptionSearchCriterionType> getCriterion() {
            if (criterion == null) {
                criterion = new Vector<PackageOptionSearchCriterionType>();
            }
            return this.criterion;
        }

        /**
         * Gets the value of the availableOnlyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailableOnlyIndicator() {
            return availableOnlyIndicator;
        }

        /**
         * Sets the value of the availableOnlyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailableOnlyIndicator(Boolean value) {
            this.availableOnlyIndicator = value;
        }

    }

}
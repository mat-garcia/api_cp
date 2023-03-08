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
 * Information about the travelers requesting coverage by the insurance plan and traveler(s)' requirements for insurance coverage.
 * 
 * <p>Java class for InsCoverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsCoverageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoveredTravelers"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CoveredTraveler" type="{http://www.opentravel.org/OTA/2003/05}CoveredTravelerType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InsCoverageDetail" type="{http://www.opentravel.org/OTA/2003/05}InsCoverageDetailType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PlanID_Group"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsCoverageType", propOrder = {
    "coveredTravelers",
    "insCoverageDetail"
})
@XmlSeeAlso({
    org.opentravel.ota2010a.OTA_InsuranceBookRQ.PlanForBookRQ.class,
    org.opentravel.ota2010a.OTA_InsuranceQuoteRQ.PlanForQuoteRQ.class
})
public class InsCoverageType
    implements Serializable
{

    @XmlElement(name = "CoveredTravelers", required = true)
    protected InsCoverageType.CoveredTravelers coveredTravelers;
    @XmlElement(name = "InsCoverageDetail", required = true)
    protected InsCoverageDetailType insCoverageDetail;
    @XmlAttribute(name = "PlanID", required = true)
    protected String planID;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "TypeID")
    protected String typeID;

    /**
     * Gets the value of the coveredTravelers property.
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageType.CoveredTravelers }
     *     
     */
    public InsCoverageType.CoveredTravelers getCoveredTravelers() {
        return coveredTravelers;
    }

    /**
     * Sets the value of the coveredTravelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageType.CoveredTravelers }
     *     
     */
    public void setCoveredTravelers(InsCoverageType.CoveredTravelers value) {
        this.coveredTravelers = value;
    }

    /**
     * Gets the value of the insCoverageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailType }
     *     
     */
    public InsCoverageDetailType getInsCoverageDetail() {
        return insCoverageDetail;
    }

    /**
     * Sets the value of the insCoverageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailType }
     *     
     */
    public void setInsCoverageDetail(InsCoverageDetailType value) {
        this.insCoverageDetail = value;
    }

    /**
     * Gets the value of the planID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanID() {
        return planID;
    }

    /**
     * Sets the value of the planID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanID(String value) {
        this.planID = value;
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
     * Gets the value of the typeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * Sets the value of the typeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
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
     *         &lt;element name="CoveredTraveler" type="{http://www.opentravel.org/OTA/2003/05}CoveredTravelerType" maxOccurs="unbounded"/&gt;
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
        "coveredTraveler"
    })
    public static class CoveredTravelers
        implements Serializable
    {

        @XmlElement(name = "CoveredTraveler", required = true)
        protected List<CoveredTravelerType> coveredTraveler = new Vector<CoveredTravelerType>();

        /**
         * Gets the value of the coveredTraveler property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coveredTraveler property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoveredTraveler().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CoveredTravelerType }
         * 
         * 
         */
        public List<CoveredTravelerType> getCoveredTraveler() {
            if (coveredTraveler == null) {
                coveredTraveler = new Vector<CoveredTravelerType>();
            }
            return this.coveredTraveler;
        }

    }

}

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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Defines an entity that provides travel services or benefits to a customer or company.
 * 
 * <p>Java class for AffiliationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffiliationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Organization" type="{http://www.opentravel.org/OTA/2003/05}OrganizationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Employer" type="{http://www.opentravel.org/OTA/2003/05}EmployerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelArranger" type="{http://www.opentravel.org/OTA/2003/05}TravelArrangerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelClub" type="{http://www.opentravel.org/OTA/2003/05}TravelClubType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Insurance" type="{http://www.opentravel.org/OTA/2003/05}InsuranceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliationsType", propOrder = {
    "organization",
    "employer",
    "travelArranger",
    "travelClub",
    "insurance",
    "tpa_Extensions"
})
@XmlSeeAlso({
    BoundedAffiliationsType.class
})
public class AffiliationsType
    implements Serializable
{

    @XmlElement(name = "Organization")
    protected List<OrganizationType> organization = new Vector<OrganizationType>();
    @XmlElement(name = "Employer")
    protected List<EmployerType> employer = new Vector<EmployerType>();
    @XmlElement(name = "TravelArranger")
    protected List<TravelArrangerType> travelArranger = new Vector<TravelArrangerType>();
    @XmlElement(name = "TravelClub")
    protected List<TravelClubType> travelClub = new Vector<TravelClubType>();
    @XmlElement(name = "Insurance")
    protected List<InsuranceType> insurance = new Vector<InsuranceType>();
    @XmlElement(name = "TPA_Extensions")
    protected TPA_ExtensionsType tpa_Extensions;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationType }
     * 
     * 
     */
    public List<OrganizationType> getOrganization() {
        if (organization == null) {
            organization = new Vector<OrganizationType>();
        }
        return this.organization;
    }

    /**
     * Gets the value of the employer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployerType }
     * 
     * 
     */
    public List<EmployerType> getEmployer() {
        if (employer == null) {
            employer = new Vector<EmployerType>();
        }
        return this.employer;
    }

    /**
     * Gets the value of the travelArranger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelArranger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelArranger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelArrangerType }
     * 
     * 
     */
    public List<TravelArrangerType> getTravelArranger() {
        if (travelArranger == null) {
            travelArranger = new Vector<TravelArrangerType>();
        }
        return this.travelArranger;
    }

    /**
     * Gets the value of the travelClub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelClub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelClub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelClubType }
     * 
     * 
     */
    public List<TravelClubType> getTravelClub() {
        if (travelClub == null) {
            travelClub = new Vector<TravelClubType>();
        }
        return this.travelClub;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceType }
     * 
     * 
     */
    public List<InsuranceType> getInsurance() {
        if (insurance == null) {
            insurance = new Vector<InsuranceType>();
        }
        return this.insurance;
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
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

}
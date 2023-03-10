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
 * <p>Java class for VehicleMatchedLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleMatchedLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationDetail" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationDetailsType"/&gt;
 *         &lt;element name="VehLocSearchCriterion" type="{http://www.opentravel.org/OTA/2003/05}ItemSearchCriterionType" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AlternateLocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMatchedLocationType", propOrder = {
    "locationDetail",
    "vehLocSearchCriterion"
})
public class VehicleMatchedLocationType
    implements Serializable
{

    @XmlElement(name = "LocationDetail", required = true)
    protected VehicleLocationDetailsType locationDetail;
    @XmlElement(name = "VehLocSearchCriterion")
    protected List<ItemSearchCriterionType> vehLocSearchCriterion = new Vector<ItemSearchCriterionType>();
    @XmlAttribute(name = "AlternateLocInd")
    protected Boolean alternateLocInd;

    /**
     * Gets the value of the locationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationDetailsType }
     *     
     */
    public VehicleLocationDetailsType getLocationDetail() {
        return locationDetail;
    }

    /**
     * Sets the value of the locationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationDetailsType }
     *     
     */
    public void setLocationDetail(VehicleLocationDetailsType value) {
        this.locationDetail = value;
    }

    /**
     * Gets the value of the vehLocSearchCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehLocSearchCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehLocSearchCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSearchCriterionType }
     * 
     * 
     */
    public List<ItemSearchCriterionType> getVehLocSearchCriterion() {
        if (vehLocSearchCriterion == null) {
            vehLocSearchCriterion = new Vector<ItemSearchCriterionType>();
        }
        return this.vehLocSearchCriterion;
    }

    /**
     * Gets the value of the alternateLocInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternateLocInd() {
        return alternateLocInd;
    }

    /**
     * Sets the value of the alternateLocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternateLocInd(Boolean value) {
        this.alternateLocInd = value;
    }

}

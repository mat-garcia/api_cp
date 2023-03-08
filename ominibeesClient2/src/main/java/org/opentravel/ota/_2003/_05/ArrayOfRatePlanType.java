
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRatePlanType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRatePlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatePlan" type="{http://www.opentravel.org/OTA/2003/05}RatePlanType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRatePlanType", propOrder = {
    "ratePlan"
})
public class ArrayOfRatePlanType {

    @XmlElement(name = "RatePlan")
    protected List<RatePlanType> ratePlan;

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
     * {@link RatePlanType }
     * 
     * 
     */
    public List<RatePlanType> getRatePlan() {
        if (ratePlan == null) {
            ratePlan = new ArrayList<RatePlanType>();
        }
        return this.ratePlan;
    }

}


package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CruiseReservationType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CruiseReservationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SailingInfo" type="{http://www.opentravel.org/OTA/2003/05}SailingCategoryInfoType" minOccurs="0"/&gt;
 *         &lt;element name="SailingProfile" type="{http://www.opentravel.org/OTA/2003/05}CruiseProfileType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentsDue" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCruiseReservationTypePaymentDue" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseReservationType", propOrder = {
    "sailingInfo",
    "sailingProfile",
    "paymentsDue",
    "information"
})
public class CruiseReservationType {

    @XmlElement(name = "SailingInfo")
    protected SailingCategoryInfoType sailingInfo;
    @XmlElement(name = "SailingProfile")
    protected List<CruiseProfileType> sailingProfile;
    @XmlElement(name = "PaymentsDue")
    protected ArrayOfCruiseReservationTypePaymentDue paymentsDue;
    @XmlElement(name = "Information")
    protected List<ParagraphType> information;

    /**
     * Obtém o valor da propriedade sailingInfo.
     * 
     * @return
     *     possible object is
     *     {@link SailingCategoryInfoType }
     *     
     */
    public SailingCategoryInfoType getSailingInfo() {
        return sailingInfo;
    }

    /**
     * Define o valor da propriedade sailingInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingCategoryInfoType }
     *     
     */
    public void setSailingInfo(SailingCategoryInfoType value) {
        this.sailingInfo = value;
    }

    /**
     * Gets the value of the sailingProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sailingProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSailingProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseProfileType }
     * 
     * 
     */
    public List<CruiseProfileType> getSailingProfile() {
        if (sailingProfile == null) {
            sailingProfile = new ArrayList<CruiseProfileType>();
        }
        return this.sailingProfile;
    }

    /**
     * Obtém o valor da propriedade paymentsDue.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCruiseReservationTypePaymentDue }
     *     
     */
    public ArrayOfCruiseReservationTypePaymentDue getPaymentsDue() {
        return paymentsDue;
    }

    /**
     * Define o valor da propriedade paymentsDue.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCruiseReservationTypePaymentDue }
     *     
     */
    public void setPaymentsDue(ArrayOfCruiseReservationTypePaymentDue value) {
        this.paymentsDue = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getInformation() {
        if (information == null) {
            information = new ArrayList<ParagraphType>();
        }
        return this.information;
    }

}

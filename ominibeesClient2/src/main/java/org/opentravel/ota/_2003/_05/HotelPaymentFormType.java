
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HotelPaymentFormType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HotelPaymentFormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MasterAccountUsage" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="BillingType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="EachPaysOwn"/&gt;
 *                       &lt;enumeration value="SignRoomAndTax"/&gt;
 *                       &lt;enumeration value="SignAllCharges"/&gt;
 *                       &lt;enumeration value="SignRoomOnly"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="SignFoodAndBev" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPaymentFormType", propOrder = {
    "masterAccountUsage"
})
public class HotelPaymentFormType
    extends PaymentFormType
{

    @XmlElement(name = "MasterAccountUsage")
    protected HotelPaymentFormType.MasterAccountUsage masterAccountUsage;

    /**
     * Obtém o valor da propriedade masterAccountUsage.
     * 
     * @return
     *     possible object is
     *     {@link HotelPaymentFormType.MasterAccountUsage }
     *     
     */
    public HotelPaymentFormType.MasterAccountUsage getMasterAccountUsage() {
        return masterAccountUsage;
    }

    /**
     * Define o valor da propriedade masterAccountUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPaymentFormType.MasterAccountUsage }
     *     
     */
    public void setMasterAccountUsage(HotelPaymentFormType.MasterAccountUsage value) {
        this.masterAccountUsage = value;
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
     *       &lt;attribute name="BillingType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="EachPaysOwn"/&gt;
     *             &lt;enumeration value="SignRoomAndTax"/&gt;
     *             &lt;enumeration value="SignAllCharges"/&gt;
     *             &lt;enumeration value="SignRoomOnly"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="SignFoodAndBev" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MasterAccountUsage {

        @XmlAttribute(name = "BillingType")
        protected String billingType;
        @XmlAttribute(name = "SignFoodAndBev")
        protected Boolean signFoodAndBev;

        /**
         * Obtém o valor da propriedade billingType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingType() {
            return billingType;
        }

        /**
         * Define o valor da propriedade billingType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingType(String value) {
            this.billingType = value;
        }

        /**
         * Obtém o valor da propriedade signFoodAndBev.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSignFoodAndBev() {
            return signFoodAndBev;
        }

        /**
         * Define o valor da propriedade signFoodAndBev.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSignFoodAndBev(Boolean value) {
            this.signFoodAndBev = value;
        }

    }

}

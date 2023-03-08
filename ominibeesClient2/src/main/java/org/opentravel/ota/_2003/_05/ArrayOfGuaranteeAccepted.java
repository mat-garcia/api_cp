
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfGuaranteeAccepted complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGuaranteeAccepted"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuaranteeAccepted" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
 *                 &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuaranteeAccepted", propOrder = {
    "guaranteeAccepted"
})
public class ArrayOfGuaranteeAccepted {

    @XmlElement(name = "GuaranteeAccepted")
    protected List<ArrayOfGuaranteeAccepted.GuaranteeAccepted> guaranteeAccepted;

    /**
     * Gets the value of the guaranteeAccepted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteeAccepted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteeAccepted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfGuaranteeAccepted.GuaranteeAccepted }
     * 
     * 
     */
    public List<ArrayOfGuaranteeAccepted.GuaranteeAccepted> getGuaranteeAccepted() {
        if (guaranteeAccepted == null) {
            guaranteeAccepted = new ArrayList<ArrayOfGuaranteeAccepted.GuaranteeAccepted>();
        }
        return this.guaranteeAccepted;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
     *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GuaranteeAccepted
        extends PaymentFormType
    {

        @XmlAttribute(name = "Default")
        protected Boolean _default;
        @XmlAttribute(name = "NoCardHolderInfoReqInd")
        protected Boolean noCardHolderInfoReqInd;
        @XmlAttribute(name = "NameReqInd")
        protected Boolean nameReqInd;
        @XmlAttribute(name = "AddressReqInd")
        protected Boolean addressReqInd;
        @XmlAttribute(name = "PhoneReqInd")
        protected Boolean phoneReqInd;
        @XmlAttribute(name = "InterbankNbrReqInd")
        protected Boolean interbankNbrReqInd;
        @XmlAttribute(name = "BookingSourceAllowedInd")
        protected Boolean bookingSourceAllowedInd;
        @XmlAttribute(name = "CorpDiscountNbrAllowedInd")
        protected Boolean corpDiscountNbrAllowedInd;

        /**
         * Obtém o valor da propriedade default.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefault() {
            return _default;
        }

        /**
         * Define o valor da propriedade default.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefault(Boolean value) {
            this._default = value;
        }

        /**
         * Obtém o valor da propriedade noCardHolderInfoReqInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoCardHolderInfoReqInd() {
            return noCardHolderInfoReqInd;
        }

        /**
         * Define o valor da propriedade noCardHolderInfoReqInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoCardHolderInfoReqInd(Boolean value) {
            this.noCardHolderInfoReqInd = value;
        }

        /**
         * Obtém o valor da propriedade nameReqInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNameReqInd() {
            return nameReqInd;
        }

        /**
         * Define o valor da propriedade nameReqInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNameReqInd(Boolean value) {
            this.nameReqInd = value;
        }

        /**
         * Obtém o valor da propriedade addressReqInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAddressReqInd() {
            return addressReqInd;
        }

        /**
         * Define o valor da propriedade addressReqInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAddressReqInd(Boolean value) {
            this.addressReqInd = value;
        }

        /**
         * Obtém o valor da propriedade phoneReqInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPhoneReqInd() {
            return phoneReqInd;
        }

        /**
         * Define o valor da propriedade phoneReqInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPhoneReqInd(Boolean value) {
            this.phoneReqInd = value;
        }

        /**
         * Obtém o valor da propriedade interbankNbrReqInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInterbankNbrReqInd() {
            return interbankNbrReqInd;
        }

        /**
         * Define o valor da propriedade interbankNbrReqInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInterbankNbrReqInd(Boolean value) {
            this.interbankNbrReqInd = value;
        }

        /**
         * Obtém o valor da propriedade bookingSourceAllowedInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBookingSourceAllowedInd() {
            return bookingSourceAllowedInd;
        }

        /**
         * Define o valor da propriedade bookingSourceAllowedInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBookingSourceAllowedInd(Boolean value) {
            this.bookingSourceAllowedInd = value;
        }

        /**
         * Obtém o valor da propriedade corpDiscountNbrAllowedInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCorpDiscountNbrAllowedInd() {
            return corpDiscountNbrAllowedInd;
        }

        /**
         * Define o valor da propriedade corpDiscountNbrAllowedInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorpDiscountNbrAllowedInd(Boolean value) {
            this.corpDiscountNbrAllowedInd = value;
        }

    }

}

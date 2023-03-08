
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java de ArrayOfHotelRatePlanTypeDestinationSystemCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelRatePlanTypeDestinationSystemCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationSystemCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="ChainRateLevelCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ChainRateCodeCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LengthOfStayRuleID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="POS_RuleID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RateAccessID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="GuaranteeDepositRuleID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CancelRuleID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "ArrayOfHotelRatePlanTypeDestinationSystemCode", propOrder = {
    "destinationSystemCode"
})
public class ArrayOfHotelRatePlanTypeDestinationSystemCode {

    @XmlElement(name = "DestinationSystemCode")
    protected List<ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode> destinationSystemCode;

    /**
     * Gets the value of the destinationSystemCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationSystemCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationSystemCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode }
     * 
     * 
     */
    public List<ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode> getDestinationSystemCode() {
        if (destinationSystemCode == null) {
            destinationSystemCode = new ArrayList<ArrayOfHotelRatePlanTypeDestinationSystemCode.DestinationSystemCode>();
        }
        return this.destinationSystemCode;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="ChainRateLevelCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ChainRateCodeCrossRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LengthOfStayRuleID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="POS_RuleID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RateAccessID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="GuaranteeDepositRuleID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CancelRuleID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DestinationSystemCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ChainRateLevelCrossRef")
        protected String chainRateLevelCrossRef;
        @XmlAttribute(name = "ChainRateCodeCrossRef")
        protected String chainRateCodeCrossRef;
        @XmlAttribute(name = "LengthOfStayRuleID")
        protected String lengthOfStayRuleID;
        @XmlAttribute(name = "POS_RuleID")
        protected String posRuleID;
        @XmlAttribute(name = "RateAccessID")
        protected String rateAccessID;
        @XmlAttribute(name = "GuaranteeDepositRuleID")
        protected String guaranteeDepositRuleID;
        @XmlAttribute(name = "CancelRuleID")
        protected String cancelRuleID;

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtém o valor da propriedade chainRateLevelCrossRef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainRateLevelCrossRef() {
            return chainRateLevelCrossRef;
        }

        /**
         * Define o valor da propriedade chainRateLevelCrossRef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainRateLevelCrossRef(String value) {
            this.chainRateLevelCrossRef = value;
        }

        /**
         * Obtém o valor da propriedade chainRateCodeCrossRef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainRateCodeCrossRef() {
            return chainRateCodeCrossRef;
        }

        /**
         * Define o valor da propriedade chainRateCodeCrossRef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainRateCodeCrossRef(String value) {
            this.chainRateCodeCrossRef = value;
        }

        /**
         * Obtém o valor da propriedade lengthOfStayRuleID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLengthOfStayRuleID() {
            return lengthOfStayRuleID;
        }

        /**
         * Define o valor da propriedade lengthOfStayRuleID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLengthOfStayRuleID(String value) {
            this.lengthOfStayRuleID = value;
        }

        /**
         * Obtém o valor da propriedade posRuleID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOSRuleID() {
            return posRuleID;
        }

        /**
         * Define o valor da propriedade posRuleID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOSRuleID(String value) {
            this.posRuleID = value;
        }

        /**
         * Obtém o valor da propriedade rateAccessID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateAccessID() {
            return rateAccessID;
        }

        /**
         * Define o valor da propriedade rateAccessID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateAccessID(String value) {
            this.rateAccessID = value;
        }

        /**
         * Obtém o valor da propriedade guaranteeDepositRuleID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuaranteeDepositRuleID() {
            return guaranteeDepositRuleID;
        }

        /**
         * Define o valor da propriedade guaranteeDepositRuleID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuaranteeDepositRuleID(String value) {
            this.guaranteeDepositRuleID = value;
        }

        /**
         * Obtém o valor da propriedade cancelRuleID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelRuleID() {
            return cancelRuleID;
        }

        /**
         * Define o valor da propriedade cancelRuleID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelRuleID(String value) {
            this.cancelRuleID = value;
        }

    }

}

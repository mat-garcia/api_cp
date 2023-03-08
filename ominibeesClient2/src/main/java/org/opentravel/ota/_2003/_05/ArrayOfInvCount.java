
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de ArrayOfInvCount complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInvCount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvCount" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InvBlockCutoff" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *                           &lt;attribute name="OffsetCalculationMode"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="BeforeBlockStartDate"/&gt;
 *                                 &lt;enumeration value="AfterBlockCreation"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="CountType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="AdjustReason" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ActionType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Adjustment"/&gt;
 *                       &lt;enumeration value="Used"/&gt;
 *                       &lt;enumeration value="Remaining"/&gt;
 *                       &lt;enumeration value="Allocation"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "ArrayOfInvCount", propOrder = {
    "invCount"
})
public class ArrayOfInvCount {

    @XmlElement(name = "InvCount")
    protected List<ArrayOfInvCount.InvCount> invCount;

    /**
     * Gets the value of the invCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfInvCount.InvCount }
     * 
     * 
     */
    public List<ArrayOfInvCount.InvCount> getInvCount() {
        if (invCount == null) {
            invCount = new ArrayList<ArrayOfInvCount.InvCount>();
        }
        return this.invCount;
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
     *       &lt;sequence&gt;
     *         &lt;element name="InvBlockCutoff" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *                 &lt;attribute name="OffsetCalculationMode"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="BeforeBlockStartDate"/&gt;
     *                       &lt;enumeration value="AfterBlockCreation"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="CountType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="AdjustReason" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ActionType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Adjustment"/&gt;
     *             &lt;enumeration value="Used"/&gt;
     *             &lt;enumeration value="Remaining"/&gt;
     *             &lt;enumeration value="Allocation"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "invBlockCutoff"
    })
    public static class InvCount {

        @XmlElement(name = "InvBlockCutoff")
        protected ArrayOfInvCount.InvCount.InvBlockCutoff invBlockCutoff;
        @XmlAttribute(name = "CountType")
        protected String countType;
        @XmlAttribute(name = "Count")
        protected BigInteger count;
        @XmlAttribute(name = "AdjustReason")
        protected String adjustReason;
        @XmlAttribute(name = "ActionType")
        protected String actionType;

        /**
         * Obtém o valor da propriedade invBlockCutoff.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfInvCount.InvCount.InvBlockCutoff }
         *     
         */
        public ArrayOfInvCount.InvCount.InvBlockCutoff getInvBlockCutoff() {
            return invBlockCutoff;
        }

        /**
         * Define o valor da propriedade invBlockCutoff.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfInvCount.InvCount.InvBlockCutoff }
         *     
         */
        public void setInvBlockCutoff(ArrayOfInvCount.InvCount.InvBlockCutoff value) {
            this.invBlockCutoff = value;
        }

        /**
         * Obtém o valor da propriedade countType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountType() {
            return countType;
        }

        /**
         * Define o valor da propriedade countType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountType(String value) {
            this.countType = value;
        }

        /**
         * Obtém o valor da propriedade count.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * Define o valor da propriedade count.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

        /**
         * Obtém o valor da propriedade adjustReason.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjustReason() {
            return adjustReason;
        }

        /**
         * Define o valor da propriedade adjustReason.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjustReason(String value) {
            this.adjustReason = value;
        }

        /**
         * Obtém o valor da propriedade actionType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionType() {
            return actionType;
        }

        /**
         * Define o valor da propriedade actionType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionType(String value) {
            this.actionType = value;
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
         *       &lt;attribute name="AbsoluteCutoff" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="OffsetDuration" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
         *       &lt;attribute name="OffsetCalculationMode"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="BeforeBlockStartDate"/&gt;
         *             &lt;enumeration value="AfterBlockCreation"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InvBlockCutoff {

            @XmlAttribute(name = "AbsoluteCutoff")
            protected String absoluteCutoff;
            @XmlAttribute(name = "OffsetDuration")
            protected Duration offsetDuration;
            @XmlAttribute(name = "OffsetCalculationMode")
            protected String offsetCalculationMode;

            /**
             * Obtém o valor da propriedade absoluteCutoff.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAbsoluteCutoff() {
                return absoluteCutoff;
            }

            /**
             * Define o valor da propriedade absoluteCutoff.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAbsoluteCutoff(String value) {
                this.absoluteCutoff = value;
            }

            /**
             * Obtém o valor da propriedade offsetDuration.
             * 
             * @return
             *     possible object is
             *     {@link Duration }
             *     
             */
            public Duration getOffsetDuration() {
                return offsetDuration;
            }

            /**
             * Define o valor da propriedade offsetDuration.
             * 
             * @param value
             *     allowed object is
             *     {@link Duration }
             *     
             */
            public void setOffsetDuration(Duration value) {
                this.offsetDuration = value;
            }

            /**
             * Obtém o valor da propriedade offsetCalculationMode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffsetCalculationMode() {
                return offsetCalculationMode;
            }

            /**
             * Define o valor da propriedade offsetCalculationMode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffsetCalculationMode(String value) {
                this.offsetCalculationMode = value;
            }

        }

    }

}

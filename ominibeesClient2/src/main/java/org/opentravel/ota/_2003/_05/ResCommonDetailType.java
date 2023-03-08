
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de ResCommonDetailType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResCommonDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/&gt;
 *         &lt;element name="TimeSpan" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"&gt;
 *                 &lt;attribute name="Increment" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/&gt;
 *         &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMembershipTypeMembership" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfComment" minOccurs="0"/&gt;
 *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSpecialRequest" minOccurs="0"/&gt;
 *         &lt;element name="Guarantee" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuaranteeType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AmountPercent" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType"&gt;
 *                           &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DepositPayments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfGuaranteePayment" minOccurs="0"/&gt;
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/&gt;
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResCommonDetailType", propOrder = {
    "guestCounts",
    "timeSpan",
    "resGuestRPHs",
    "memberships",
    "comments",
    "specialRequests",
    "guarantee",
    "depositPayments",
    "cancelPenalties",
    "fees",
    "total"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.ServiceType.ServiceDetails.class,
    ResGlobalInfoType.class
})
public class ResCommonDetailType {

    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "TimeSpan")
    protected ResCommonDetailType.TimeSpan timeSpan;
    @XmlElement(name = "ResGuestRPHs")
    protected ResGuestRPHsType resGuestRPHs;
    @XmlElement(name = "Memberships")
    protected ArrayOfMembershipTypeMembership memberships;
    @XmlElement(name = "Comments")
    protected ArrayOfComment comments;
    @XmlElement(name = "SpecialRequests")
    protected ArrayOfSpecialRequest specialRequests;
    @XmlElement(name = "Guarantee")
    protected ResCommonDetailType.Guarantee guarantee;
    @XmlElement(name = "DepositPayments")
    protected ArrayOfGuaranteePayment depositPayments;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "Fees")
    protected ArrayOfFeeType fees;
    @XmlElement(name = "Total")
    protected TotalType total;

    /**
     * Obtém o valor da propriedade guestCounts.
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * Define o valor da propriedade guestCounts.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * Obtém o valor da propriedade timeSpan.
     * 
     * @return
     *     possible object is
     *     {@link ResCommonDetailType.TimeSpan }
     *     
     */
    public ResCommonDetailType.TimeSpan getTimeSpan() {
        return timeSpan;
    }

    /**
     * Define o valor da propriedade timeSpan.
     * 
     * @param value
     *     allowed object is
     *     {@link ResCommonDetailType.TimeSpan }
     *     
     */
    public void setTimeSpan(ResCommonDetailType.TimeSpan value) {
        this.timeSpan = value;
    }

    /**
     * Obtém o valor da propriedade resGuestRPHs.
     * 
     * @return
     *     possible object is
     *     {@link ResGuestRPHsType }
     *     
     */
    public ResGuestRPHsType getResGuestRPHs() {
        return resGuestRPHs;
    }

    /**
     * Define o valor da propriedade resGuestRPHs.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuestRPHsType }
     *     
     */
    public void setResGuestRPHs(ResGuestRPHsType value) {
        this.resGuestRPHs = value;
    }

    /**
     * Obtém o valor da propriedade memberships.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMembershipTypeMembership }
     *     
     */
    public ArrayOfMembershipTypeMembership getMemberships() {
        return memberships;
    }

    /**
     * Define o valor da propriedade memberships.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMembershipTypeMembership }
     *     
     */
    public void setMemberships(ArrayOfMembershipTypeMembership value) {
        this.memberships = value;
    }

    /**
     * Obtém o valor da propriedade comments.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComment }
     *     
     */
    public ArrayOfComment getComments() {
        return comments;
    }

    /**
     * Define o valor da propriedade comments.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComment }
     *     
     */
    public void setComments(ArrayOfComment value) {
        this.comments = value;
    }

    /**
     * Obtém o valor da propriedade specialRequests.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecialRequest }
     *     
     */
    public ArrayOfSpecialRequest getSpecialRequests() {
        return specialRequests;
    }

    /**
     * Define o valor da propriedade specialRequests.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecialRequest }
     *     
     */
    public void setSpecialRequests(ArrayOfSpecialRequest value) {
        this.specialRequests = value;
    }

    /**
     * Obtém o valor da propriedade guarantee.
     * 
     * @return
     *     possible object is
     *     {@link ResCommonDetailType.Guarantee }
     *     
     */
    public ResCommonDetailType.Guarantee getGuarantee() {
        return guarantee;
    }

    /**
     * Define o valor da propriedade guarantee.
     * 
     * @param value
     *     allowed object is
     *     {@link ResCommonDetailType.Guarantee }
     *     
     */
    public void setGuarantee(ResCommonDetailType.Guarantee value) {
        this.guarantee = value;
    }

    /**
     * Obtém o valor da propriedade depositPayments.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuaranteePayment }
     *     
     */
    public ArrayOfGuaranteePayment getDepositPayments() {
        return depositPayments;
    }

    /**
     * Define o valor da propriedade depositPayments.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuaranteePayment }
     *     
     */
    public void setDepositPayments(ArrayOfGuaranteePayment value) {
        this.depositPayments = value;
    }

    /**
     * Obtém o valor da propriedade cancelPenalties.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * Define o valor da propriedade cancelPenalties.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * Obtém o valor da propriedade fees.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeType }
     *     
     */
    public ArrayOfFeeType getFees() {
        return fees;
    }

    /**
     * Define o valor da propriedade fees.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeType }
     *     
     */
    public void setFees(ArrayOfFeeType value) {
        this.fees = value;
    }

    /**
     * Obtém o valor da propriedade total.
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * Define o valor da propriedade total.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}GuaranteeType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AmountPercent" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType"&gt;
     *                 &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
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
    @XmlType(name = "", propOrder = {
        "amountPercent"
    })
    public static class Guarantee
        extends GuaranteeType
    {

        @XmlElement(name = "AmountPercent")
        protected ResCommonDetailType.Guarantee.AmountPercent amountPercent;

        /**
         * Obtém o valor da propriedade amountPercent.
         * 
         * @return
         *     possible object is
         *     {@link ResCommonDetailType.Guarantee.AmountPercent }
         *     
         */
        public ResCommonDetailType.Guarantee.AmountPercent getAmountPercent() {
            return amountPercent;
        }

        /**
         * Define o valor da propriedade amountPercent.
         * 
         * @param value
         *     allowed object is
         *     {@link ResCommonDetailType.Guarantee.AmountPercent }
         *     
         */
        public void setAmountPercent(ResCommonDetailType.Guarantee.AmountPercent value) {
            this.amountPercent = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountPercentType"&gt;
         *       &lt;attribute name="OverriddenAmountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AmountPercent
            extends AmountPercentType
        {

            @XmlAttribute(name = "OverriddenAmountIndicator")
            protected Boolean overriddenAmountIndicator;

            /**
             * Obtém o valor da propriedade overriddenAmountIndicator.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOverriddenAmountIndicator() {
                return overriddenAmountIndicator;
            }

            /**
             * Define o valor da propriedade overriddenAmountIndicator.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOverriddenAmountIndicator(Boolean value) {
                this.overriddenAmountIndicator = value;
            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"&gt;
     *       &lt;attribute name="Increment" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TimeSpan
        extends DateTimeSpanType
    {

        @XmlAttribute(name = "Increment")
        protected Duration increment;

        /**
         * Obtém o valor da propriedade increment.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getIncrement() {
            return increment;
        }

        /**
         * Define o valor da propriedade increment.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setIncrement(Duration value) {
            this.increment = value;
        }

    }

}

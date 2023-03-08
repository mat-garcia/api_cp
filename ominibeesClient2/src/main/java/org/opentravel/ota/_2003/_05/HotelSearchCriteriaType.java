
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de HotelSearchCriteriaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HotelSearchCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Criterion" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriterionType"&gt;
 *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AlternateAvailability"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Never"/&gt;
 *                       &lt;enumeration value="WhenUnavailable"/&gt;
 *                       &lt;enumeration value="Always"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="AddressSearchScope"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Primary"/&gt;
 *                       &lt;enumeration value="Alternate"/&gt;
 *                       &lt;enumeration value="PrimaryAndAlternate"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AvailableOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BestOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TotalAfterTaxOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelSearchCriteriaType", propOrder = {
    "criterion"
})
public class HotelSearchCriteriaType {

    @XmlElement(name = "Criterion")
    protected List<HotelSearchCriteriaType.Criterion> criterion;
    @XmlAttribute(name = "AvailableOnlyIndicator")
    protected Boolean availableOnlyIndicator;
    @XmlAttribute(name = "BestOnlyIndicator")
    protected Boolean bestOnlyIndicator;
    @XmlAttribute(name = "TotalAfterTaxOnlyInd")
    protected Boolean totalAfterTaxOnlyInd;

    /**
     * Gets the value of the criterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriteriaType.Criterion }
     * 
     * 
     */
    public List<HotelSearchCriteriaType.Criterion> getCriterion() {
        if (criterion == null) {
            criterion = new ArrayList<HotelSearchCriteriaType.Criterion>();
        }
        return this.criterion;
    }

    /**
     * Obtém o valor da propriedade availableOnlyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableOnlyIndicator() {
        return availableOnlyIndicator;
    }

    /**
     * Define o valor da propriedade availableOnlyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableOnlyIndicator(Boolean value) {
        this.availableOnlyIndicator = value;
    }

    /**
     * Obtém o valor da propriedade bestOnlyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOnlyIndicator() {
        return bestOnlyIndicator;
    }

    /**
     * Define o valor da propriedade bestOnlyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOnlyIndicator(Boolean value) {
        this.bestOnlyIndicator = value;
    }

    /**
     * Obtém o valor da propriedade totalAfterTaxOnlyInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalAfterTaxOnlyInd() {
        return totalAfterTaxOnlyInd;
    }

    /**
     * Define o valor da propriedade totalAfterTaxOnlyInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalAfterTaxOnlyInd(Boolean value) {
        this.totalAfterTaxOnlyInd = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriterionType"&gt;
     *       &lt;attribute name="MoreDataEchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InfoSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AlternateAvailability"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Never"/&gt;
     *             &lt;enumeration value="WhenUnavailable"/&gt;
     *             &lt;enumeration value="Always"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="AddressSearchScope"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Primary"/&gt;
     *             &lt;enumeration value="Alternate"/&gt;
     *             &lt;enumeration value="PrimaryAndAlternate"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Criterion
        extends HotelSearchCriterionType
    {

        @XmlAttribute(name = "MoreDataEchoToken")
        protected String moreDataEchoToken;
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "AlternateAvailability")
        protected String alternateAvailability;
        @XmlAttribute(name = "AddressSearchScope")
        protected String addressSearchScope;

        /**
         * Obtém o valor da propriedade moreDataEchoToken.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoreDataEchoToken() {
            return moreDataEchoToken;
        }

        /**
         * Define o valor da propriedade moreDataEchoToken.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoreDataEchoToken(String value) {
            this.moreDataEchoToken = value;
        }

        /**
         * Obtém o valor da propriedade infoSource.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * Define o valor da propriedade infoSource.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * Obtém o valor da propriedade alternateAvailability.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternateAvailability() {
            return alternateAvailability;
        }

        /**
         * Define o valor da propriedade alternateAvailability.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternateAvailability(String value) {
            this.alternateAvailability = value;
        }

        /**
         * Obtém o valor da propriedade addressSearchScope.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressSearchScope() {
            return addressSearchScope;
        }

        /**
         * Define o valor da propriedade addressSearchScope.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressSearchScope(String value) {
            this.addressSearchScope = value;
        }

    }

}

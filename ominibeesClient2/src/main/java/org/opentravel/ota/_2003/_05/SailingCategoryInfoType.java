
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SailingCategoryInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SailingCategoryInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SailingInfoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectedCategory" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute" minOccurs="0"/&gt;
 *                   &lt;element name="SelectedCabin" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="BerthedCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PricedCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DeckNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DeckName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="WaitlistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="FareCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "SailingCategoryInfoType", propOrder = {
    "selectedCategory"
})
public class SailingCategoryInfoType
    extends SailingInfoType
{

    @XmlElement(name = "SelectedCategory")
    protected List<SailingCategoryInfoType.SelectedCategory> selectedCategory;

    /**
     * Gets the value of the selectedCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SailingCategoryInfoType.SelectedCategory }
     * 
     * 
     */
    public List<SailingCategoryInfoType.SelectedCategory> getSelectedCategory() {
        if (selectedCategory == null) {
            selectedCategory = new ArrayList<SailingCategoryInfoType.SelectedCategory>();
        }
        return this.selectedCategory;
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
     *         &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute" minOccurs="0"/&gt;
     *         &lt;element name="SelectedCabin" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="BerthedCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PricedCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DeckNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DeckName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="WaitlistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="FareCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cabinAttributes",
        "selectedCabin"
    })
    public static class SelectedCategory {

        @XmlElement(name = "CabinAttributes")
        protected ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute cabinAttributes;
        @XmlElement(name = "SelectedCabin")
        protected List<SailingCategoryInfoType.SelectedCategory.SelectedCabin> selectedCabin;
        @XmlAttribute(name = "BerthedCategoryCode")
        protected String berthedCategoryCode;
        @XmlAttribute(name = "PricedCategoryCode")
        protected String pricedCategoryCode;
        @XmlAttribute(name = "DeckNumber")
        protected String deckNumber;
        @XmlAttribute(name = "DeckName")
        protected String deckName;
        @XmlAttribute(name = "WaitlistIndicator")
        protected Boolean waitlistIndicator;
        @XmlAttribute(name = "FareCode")
        protected String fareCode;
        @XmlAttribute(name = "GroupCode")
        protected String groupCode;

        /**
         * Obtém o valor da propriedade cabinAttributes.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute }
         *     
         */
        public ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute getCabinAttributes() {
            return cabinAttributes;
        }

        /**
         * Define o valor da propriedade cabinAttributes.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute }
         *     
         */
        public void setCabinAttributes(ArrayOfSailingCategoryInfoTypeSelectedCategoryCabinAttribute value) {
            this.cabinAttributes = value;
        }

        /**
         * Gets the value of the selectedCabin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedCabin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedCabin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin }
         * 
         * 
         */
        public List<SailingCategoryInfoType.SelectedCategory.SelectedCabin> getSelectedCabin() {
            if (selectedCabin == null) {
                selectedCabin = new ArrayList<SailingCategoryInfoType.SelectedCategory.SelectedCabin>();
            }
            return this.selectedCabin;
        }

        /**
         * Obtém o valor da propriedade berthedCategoryCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBerthedCategoryCode() {
            return berthedCategoryCode;
        }

        /**
         * Define o valor da propriedade berthedCategoryCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBerthedCategoryCode(String value) {
            this.berthedCategoryCode = value;
        }

        /**
         * Obtém o valor da propriedade pricedCategoryCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPricedCategoryCode() {
            return pricedCategoryCode;
        }

        /**
         * Define o valor da propriedade pricedCategoryCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPricedCategoryCode(String value) {
            this.pricedCategoryCode = value;
        }

        /**
         * Obtém o valor da propriedade deckNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeckNumber() {
            return deckNumber;
        }

        /**
         * Define o valor da propriedade deckNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeckNumber(String value) {
            this.deckNumber = value;
        }

        /**
         * Obtém o valor da propriedade deckName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeckName() {
            return deckName;
        }

        /**
         * Define o valor da propriedade deckName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeckName(String value) {
            this.deckName = value;
        }

        /**
         * Obtém o valor da propriedade waitlistIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWaitlistIndicator() {
            return waitlistIndicator;
        }

        /**
         * Define o valor da propriedade waitlistIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWaitlistIndicator(Boolean value) {
            this.waitlistIndicator = value;
        }

        /**
         * Obtém o valor da propriedade fareCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCode() {
            return fareCode;
        }

        /**
         * Define o valor da propriedade fareCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCode(String value) {
            this.fareCode = value;
        }

        /**
         * Obtém o valor da propriedade groupCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupCode() {
            return groupCode;
        }

        /**
         * Define o valor da propriedade groupCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupCode(String value) {
            this.groupCode = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CabinAttributes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute" minOccurs="0"/&gt;
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
            "cabinAttributes"
        })
        public static class SelectedCabin
            extends CabinOptionType
        {

            @XmlElement(name = "CabinAttributes")
            protected ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute cabinAttributes;

            /**
             * Obtém o valor da propriedade cabinAttributes.
             * 
             * @return
             *     possible object is
             *     {@link ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute }
             *     
             */
            public ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute getCabinAttributes() {
                return cabinAttributes;
            }

            /**
             * Define o valor da propriedade cabinAttributes.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute }
             *     
             */
            public void setCabinAttributes(ArrayOfSailingCategoryInfoTypeSelectedCategorySelectedCabinCabinAttribute value) {
                this.cabinAttributes = value;
            }

        }

    }

}

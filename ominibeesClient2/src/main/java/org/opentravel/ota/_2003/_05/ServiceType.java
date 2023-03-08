
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://www.opentravel.org/OTA/2003/05}AmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResCommonDetailType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ServicePricingType" type="{http://www.opentravel.org/OTA/2003/05}PricingType" /&gt;
 *       &lt;attribute name="ReservationStatusType" type="{http://www.opentravel.org/OTA/2003/05}PMS_ResStatusType" /&gt;
 *       &lt;attribute name="ServiceRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ServiceInventoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InventoryBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PriceGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Inclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="RequestedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Instance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ServiceCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "price",
    "serviceDetails",
    "tpaExtensions"
})
public class ServiceType {

    @XmlElement(name = "Price")
    protected List<AmountType> price;
    @XmlElement(name = "ServiceDetails")
    protected ServiceType.ServiceDetails serviceDetails;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ServicePricingType")
    protected PricingType servicePricingType;
    @XmlAttribute(name = "ReservationStatusType")
    protected PMSResStatusType reservationStatusType;
    @XmlAttribute(name = "ServiceRPH")
    protected String serviceRPH;
    @XmlAttribute(name = "ServiceInventoryCode")
    protected String serviceInventoryCode;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "InventoryBlockCode")
    protected String inventoryBlockCode;
    @XmlAttribute(name = "PriceGuaranteed")
    protected Boolean priceGuaranteed;
    @XmlAttribute(name = "Inclusive")
    protected Boolean inclusive;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "RequestedIndicator")
    protected Boolean requestedIndicator;
    @XmlAttribute(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Instance")
    protected String instance;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "ID_Context")
    protected String idContext;
    @XmlAttribute(name = "RequiredInd")
    protected Boolean requiredInd;
    @XmlAttribute(name = "ServiceCategoryCode")
    protected String serviceCategoryCode;

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getPrice() {
        if (price == null) {
            price = new ArrayList<AmountType>();
        }
        return this.price;
    }

    /**
     * Obtém o valor da propriedade serviceDetails.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType.ServiceDetails }
     *     
     */
    public ServiceType.ServiceDetails getServiceDetails() {
        return serviceDetails;
    }

    /**
     * Define o valor da propriedade serviceDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType.ServiceDetails }
     *     
     */
    public void setServiceDetails(ServiceType.ServiceDetails value) {
        this.serviceDetails = value;
    }

    /**
     * Obtém o valor da propriedade tpaExtensions.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Define o valor da propriedade tpaExtensions.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Obtém o valor da propriedade servicePricingType.
     * 
     * @return
     *     possible object is
     *     {@link PricingType }
     *     
     */
    public PricingType getServicePricingType() {
        return servicePricingType;
    }

    /**
     * Define o valor da propriedade servicePricingType.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingType }
     *     
     */
    public void setServicePricingType(PricingType value) {
        this.servicePricingType = value;
    }

    /**
     * Obtém o valor da propriedade reservationStatusType.
     * 
     * @return
     *     possible object is
     *     {@link PMSResStatusType }
     *     
     */
    public PMSResStatusType getReservationStatusType() {
        return reservationStatusType;
    }

    /**
     * Define o valor da propriedade reservationStatusType.
     * 
     * @param value
     *     allowed object is
     *     {@link PMSResStatusType }
     *     
     */
    public void setReservationStatusType(PMSResStatusType value) {
        this.reservationStatusType = value;
    }

    /**
     * Obtém o valor da propriedade serviceRPH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRPH() {
        return serviceRPH;
    }

    /**
     * Define o valor da propriedade serviceRPH.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRPH(String value) {
        this.serviceRPH = value;
    }

    /**
     * Obtém o valor da propriedade serviceInventoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInventoryCode() {
        return serviceInventoryCode;
    }

    /**
     * Define o valor da propriedade serviceInventoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInventoryCode(String value) {
        this.serviceInventoryCode = value;
    }

    /**
     * Obtém o valor da propriedade ratePlanCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Define o valor da propriedade ratePlanCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Obtém o valor da propriedade inventoryBlockCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryBlockCode() {
        return inventoryBlockCode;
    }

    /**
     * Define o valor da propriedade inventoryBlockCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryBlockCode(String value) {
        this.inventoryBlockCode = value;
    }

    /**
     * Obtém o valor da propriedade priceGuaranteed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceGuaranteed() {
        return priceGuaranteed;
    }

    /**
     * Define o valor da propriedade priceGuaranteed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceGuaranteed(Boolean value) {
        this.priceGuaranteed = value;
    }

    /**
     * Obtém o valor da propriedade inclusive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclusive() {
        return inclusive;
    }

    /**
     * Define o valor da propriedade inclusive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusive(Boolean value) {
        this.inclusive = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Obtém o valor da propriedade requestedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedIndicator() {
        return requestedIndicator;
    }

    /**
     * Define o valor da propriedade requestedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestedIndicator(Boolean value) {
        this.requestedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Define o valor da propriedade url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtém o valor da propriedade instance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstance() {
        return instance;
    }

    /**
     * Define o valor da propriedade instance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstance(String value) {
        this.instance = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade idContext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDContext() {
        return idContext;
    }

    /**
     * Define o valor da propriedade idContext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDContext(String value) {
        this.idContext = value;
    }

    /**
     * Obtém o valor da propriedade requiredInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredInd() {
        return requiredInd;
    }

    /**
     * Define o valor da propriedade requiredInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredInd(Boolean value) {
        this.requiredInd = value;
    }

    /**
     * Obtém o valor da propriedade serviceCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategoryCode() {
        return serviceCategoryCode;
    }

    /**
     * Define o valor da propriedade serviceCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategoryCode(String value) {
        this.serviceCategoryCode = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResCommonDetailType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ServiceDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
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
        "serviceDescription"
    })
    public static class ServiceDetails
        extends ResCommonDetailType
    {

        @XmlElement(name = "ServiceDescription")
        protected ParagraphType serviceDescription;

        /**
         * Obtém o valor da propriedade serviceDescription.
         * 
         * @return
         *     possible object is
         *     {@link ParagraphType }
         *     
         */
        public ParagraphType getServiceDescription() {
            return serviceDescription;
        }

        /**
         * Define o valor da propriedade serviceDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link ParagraphType }
         *     
         */
        public void setServiceDescription(ParagraphType value) {
            this.serviceDescription = value;
        }

    }

}

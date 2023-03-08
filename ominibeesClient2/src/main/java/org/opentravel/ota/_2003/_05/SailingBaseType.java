
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SailingBaseType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SailingBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CruiseLine" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ShipCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ShipName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VendorCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Region" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SubRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SubRegionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeparturePort" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="EmbarkationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ArrivalPort" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="DebarkationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ListOfSailingDescriptionCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "SailingBaseType", propOrder = {
    "cruiseLine",
    "region",
    "departurePort",
    "arrivalPort"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.SailingInfoType.SelectedSailing.class
})
public class SailingBaseType {

    @XmlElement(name = "CruiseLine")
    protected SailingBaseType.CruiseLine cruiseLine;
    @XmlElement(name = "Region")
    protected SailingBaseType.Region region;
    @XmlElement(name = "DeparturePort")
    protected SailingBaseType.DeparturePort departurePort;
    @XmlElement(name = "ArrivalPort")
    protected SailingBaseType.ArrivalPort arrivalPort;
    @XmlAttribute(name = "ListOfSailingDescriptionCode")
    protected List<String> listOfSailingDescriptionCode;

    /**
     * Obtém o valor da propriedade cruiseLine.
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.CruiseLine }
     *     
     */
    public SailingBaseType.CruiseLine getCruiseLine() {
        return cruiseLine;
    }

    /**
     * Define o valor da propriedade cruiseLine.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.CruiseLine }
     *     
     */
    public void setCruiseLine(SailingBaseType.CruiseLine value) {
        this.cruiseLine = value;
    }

    /**
     * Obtém o valor da propriedade region.
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.Region }
     *     
     */
    public SailingBaseType.Region getRegion() {
        return region;
    }

    /**
     * Define o valor da propriedade region.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.Region }
     *     
     */
    public void setRegion(SailingBaseType.Region value) {
        this.region = value;
    }

    /**
     * Obtém o valor da propriedade departurePort.
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.DeparturePort }
     *     
     */
    public SailingBaseType.DeparturePort getDeparturePort() {
        return departurePort;
    }

    /**
     * Define o valor da propriedade departurePort.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.DeparturePort }
     *     
     */
    public void setDeparturePort(SailingBaseType.DeparturePort value) {
        this.departurePort = value;
    }

    /**
     * Obtém o valor da propriedade arrivalPort.
     * 
     * @return
     *     possible object is
     *     {@link SailingBaseType.ArrivalPort }
     *     
     */
    public SailingBaseType.ArrivalPort getArrivalPort() {
        return arrivalPort;
    }

    /**
     * Define o valor da propriedade arrivalPort.
     * 
     * @param value
     *     allowed object is
     *     {@link SailingBaseType.ArrivalPort }
     *     
     */
    public void setArrivalPort(SailingBaseType.ArrivalPort value) {
        this.arrivalPort = value;
    }

    /**
     * Gets the value of the listOfSailingDescriptionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfSailingDescriptionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfSailingDescriptionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfSailingDescriptionCode() {
        if (listOfSailingDescriptionCode == null) {
            listOfSailingDescriptionCode = new ArrayList<String>();
        }
        return this.listOfSailingDescriptionCode;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attribute name="DebarkationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrivalPort
        extends LocationType
    {

        @XmlAttribute(name = "DebarkationDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar debarkationDateTime;

        /**
         * Obtém o valor da propriedade debarkationDateTime.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDebarkationDateTime() {
            return debarkationDateTime;
        }

        /**
         * Define o valor da propriedade debarkationDateTime.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDebarkationDateTime(XMLGregorianCalendar value) {
            this.debarkationDateTime = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ShipCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ShipName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VendorCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CruiseLine {

        @XmlAttribute(name = "VendorCode")
        protected String vendorCode;
        @XmlAttribute(name = "VendorName")
        protected String vendorName;
        @XmlAttribute(name = "ShipCode")
        protected String shipCode;
        @XmlAttribute(name = "ShipName")
        protected String shipName;
        @XmlAttribute(name = "VendorCodeContext")
        protected String vendorCodeContext;

        /**
         * Obtém o valor da propriedade vendorCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCode() {
            return vendorCode;
        }

        /**
         * Define o valor da propriedade vendorCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCode(String value) {
            this.vendorCode = value;
        }

        /**
         * Obtém o valor da propriedade vendorName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorName() {
            return vendorName;
        }

        /**
         * Define o valor da propriedade vendorName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorName(String value) {
            this.vendorName = value;
        }

        /**
         * Obtém o valor da propriedade shipCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipCode() {
            return shipCode;
        }

        /**
         * Define o valor da propriedade shipCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipCode(String value) {
            this.shipCode = value;
        }

        /**
         * Obtém o valor da propriedade shipName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShipName() {
            return shipName;
        }

        /**
         * Define o valor da propriedade shipName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShipName(String value) {
            this.shipName = value;
        }

        /**
         * Obtém o valor da propriedade vendorCodeContext.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorCodeContext() {
            return vendorCodeContext;
        }

        /**
         * Define o valor da propriedade vendorCodeContext.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorCodeContext(String value) {
            this.vendorCodeContext = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attribute name="EmbarkationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DeparturePort
        extends LocationType
    {

        @XmlAttribute(name = "EmbarkationTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar embarkationTime;

        /**
         * Obtém o valor da propriedade embarkationTime.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEmbarkationTime() {
            return embarkationTime;
        }

        /**
         * Define o valor da propriedade embarkationTime.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEmbarkationTime(XMLGregorianCalendar value) {
            this.embarkationTime = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RegionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SubRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SubRegionName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Region {

        @XmlAttribute(name = "RegionCode")
        protected String regionCode;
        @XmlAttribute(name = "RegionName")
        protected String regionName;
        @XmlAttribute(name = "SubRegionCode")
        protected String subRegionCode;
        @XmlAttribute(name = "SubRegionName")
        protected String subRegionName;

        /**
         * Obtém o valor da propriedade regionCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionCode() {
            return regionCode;
        }

        /**
         * Define o valor da propriedade regionCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegionCode(String value) {
            this.regionCode = value;
        }

        /**
         * Obtém o valor da propriedade regionName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionName() {
            return regionName;
        }

        /**
         * Define o valor da propriedade regionName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegionName(String value) {
            this.regionName = value;
        }

        /**
         * Obtém o valor da propriedade subRegionCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubRegionCode() {
            return subRegionCode;
        }

        /**
         * Define o valor da propriedade subRegionCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubRegionCode(String value) {
            this.subRegionCode = value;
        }

        /**
         * Obtém o valor da propriedade subRegionName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubRegionName() {
            return subRegionName;
        }

        /**
         * Define o valor da propriedade subRegionName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubRegionName(String value) {
            this.subRegionName = value;
        }

    }

}

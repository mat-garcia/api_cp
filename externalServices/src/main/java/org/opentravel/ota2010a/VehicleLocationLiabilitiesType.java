//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 12:21:47 PM BRST 
//


package org.opentravel.ota2010a;

import java.io.Serializable;
import java.util.List;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Vehicle Location Liabilities Type is used to define information on the financial liabilities assumed by the renter when renting from this facility, along with optional coverage to reduce the financial liabilities. 
 * 
 * <p>Java class for VehicleLocationLiabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationLiabilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coverages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Coverage" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                             &lt;element name="CoverageFees" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CoverageFee" maxOccurs="99"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/&gt;
 *                                                 &lt;element name="Vehicles" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Vehicle" maxOccurs="99"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
 *                                                                   &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
 *                                                                 &lt;/extension&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *                           &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationLiabilitiesType", propOrder = {
    "coverages",
    "info",
    "tpa_Extensions"
})
@XmlSeeAlso({
    org.opentravel.ota2010a.OTA_VehLocDetailsNotifRQ.LocationDetails.LocationDetail.Liabilities.class
})
public class VehicleLocationLiabilitiesType
    implements Serializable
{

    @XmlElement(name = "Coverages")
    protected VehicleLocationLiabilitiesType.Coverages coverages;
    @XmlElement(name = "Info")
    protected FormattedTextType info;
    @XmlElement(name = "TPA_Extensions")
    protected TPA_ExtensionsType tpa_Extensions;

    /**
     * Gets the value of the coverages property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationLiabilitiesType.Coverages }
     *     
     */
    public VehicleLocationLiabilitiesType.Coverages getCoverages() {
        return coverages;
    }

    /**
     * Sets the value of the coverages property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationLiabilitiesType.Coverages }
     *     
     */
    public void setCoverages(VehicleLocationLiabilitiesType.Coverages value) {
        this.coverages = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextType }
     *     
     */
    public FormattedTextType getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextType }
     *     
     */
    public void setInfo(FormattedTextType value) {
        this.info = value;
    }

    /**
     * Gets the value of the tpa_Extensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPA_ExtensionsType }
     *     
     */
    public TPA_ExtensionsType getTPA_Extensions() {
        return tpa_Extensions;
    }

    /**
     * Sets the value of the tpa_Extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPA_ExtensionsType }
     *     
     */
    public void setTPA_Extensions(TPA_ExtensionsType value) {
        this.tpa_Extensions = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Coverage" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                   &lt;element name="CoverageFees" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CoverageFee" maxOccurs="99"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/&gt;
     *                                       &lt;element name="Vehicles" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Vehicle" maxOccurs="99"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
     *                                                         &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
     *                                                       &lt;/extension&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *                 &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    @XmlType(name = "", propOrder = {
        "coverage"
    })
    public static class Coverages
        implements Serializable
    {

        @XmlElement(name = "Coverage")
        protected List<VehicleLocationLiabilitiesType.Coverages.Coverage> coverage = new Vector<VehicleLocationLiabilitiesType.Coverages.Coverage>();

        /**
         * Gets the value of the coverage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coverage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoverage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationLiabilitiesType.Coverages.Coverage }
         * 
         * 
         */
        public List<VehicleLocationLiabilitiesType.Coverages.Coverage> getCoverage() {
            if (coverage == null) {
                coverage = new Vector<VehicleLocationLiabilitiesType.Coverages.Coverage>();
            }
            return this.coverage;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
         *         &lt;element name="CoverageFees" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CoverageFee" maxOccurs="99"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/&gt;
         *                             &lt;element name="Vehicles" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Vehicle" maxOccurs="99"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
         *                                               &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
         *                                             &lt;/extension&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
         *       &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "coverageInfo",
            "coverageFees"
        })
        public static class Coverage
            implements Serializable
        {

            @XmlElement(name = "CoverageInfo")
            protected FormattedTextType coverageInfo;
            @XmlElement(name = "CoverageFees")
            protected VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees coverageFees;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "RequiredInd")
            protected Boolean requiredInd;

            /**
             * Gets the value of the coverageInfo property.
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getCoverageInfo() {
                return coverageInfo;
            }

            /**
             * Sets the value of the coverageInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setCoverageInfo(FormattedTextType value) {
                this.coverageInfo = value;
            }

            /**
             * Gets the value of the coverageFees property.
             * 
             * @return
             *     possible object is
             *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees }
             *     
             */
            public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees getCoverageFees() {
                return coverageFees;
            }

            /**
             * Sets the value of the coverageFees property.
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees }
             *     
             */
            public void setCoverageFees(VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees value) {
                this.coverageFees = value;
            }

            /**
             * Gets the value of the type property.
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
             * Sets the value of the type property.
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
             * Gets the value of the requiredInd property.
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
             * Sets the value of the requiredInd property.
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="CoverageFee" maxOccurs="99"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/&gt;
             *                   &lt;element name="Vehicles" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Vehicle" maxOccurs="99"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
             *                                     &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
             *                                   &lt;/extension&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
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
            @XmlType(name = "", propOrder = {
                "coverageFee"
            })
            public static class CoverageFees
                implements Serializable
            {

                @XmlElement(name = "CoverageFee", required = true)
                protected List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee> coverageFee = new Vector<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee>();

                /**
                 * Gets the value of the coverageFee property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the coverageFee property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCoverageFee().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee }
                 * 
                 * 
                 */
                public List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee> getCoverageFee() {
                    if (coverageFee == null) {
                        coverageFee = new Vector<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee>();
                    }
                    return this.coverageFee;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"/&gt;
                 *         &lt;element name="Vehicles" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Vehicle" maxOccurs="99"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
                 *                           &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
                 *                         &lt;/extension&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "charge",
                    "vehicles",
                    "deductible"
                })
                public static class CoverageFee
                    implements Serializable
                {

                    @XmlElement(name = "Charge", required = true)
                    protected VehicleChargeType charge;
                    @XmlElement(name = "Vehicles")
                    protected VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles vehicles;
                    @XmlElement(name = "Deductible")
                    protected DeductibleType deductible;

                    /**
                     * Gets the value of the charge property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link VehicleChargeType }
                     *     
                     */
                    public VehicleChargeType getCharge() {
                        return charge;
                    }

                    /**
                     * Sets the value of the charge property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VehicleChargeType }
                     *     
                     */
                    public void setCharge(VehicleChargeType value) {
                        this.charge = value;
                    }

                    /**
                     * Gets the value of the vehicles property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles }
                     *     
                     */
                    public VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles getVehicles() {
                        return vehicles;
                    }

                    /**
                     * Sets the value of the vehicles property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles }
                     *     
                     */
                    public void setVehicles(VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles value) {
                        this.vehicles = value;
                    }

                    /**
                     * Gets the value of the deductible property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DeductibleType }
                     *     
                     */
                    public DeductibleType getDeductible() {
                        return deductible;
                    }

                    /**
                     * Sets the value of the deductible property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DeductibleType }
                     *     
                     */
                    public void setDeductible(DeductibleType value) {
                        this.deductible = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="Vehicle" maxOccurs="99"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
                     *                 &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
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
                    @XmlType(name = "", propOrder = {
                        "vehicle"
                    })
                    public static class Vehicles
                        implements Serializable
                    {

                        @XmlElement(name = "Vehicle", required = true)
                        protected List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle> vehicle = new Vector<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle>();

                        /**
                         * Gets the value of the vehicle property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the vehicle property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getVehicle().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle }
                         * 
                         * 
                         */
                        public List<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle> getVehicle() {
                            if (vehicle == null) {
                                vehicle = new Vector<VehicleLocationLiabilitiesType.Coverages.Coverage.CoverageFees.CoverageFee.Vehicles.Vehicle>();
                            }
                            return this.vehicle;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
                         *       &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
                         *     &lt;/extension&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Vehicle
                            extends VehicleType
                            implements Serializable
                        {

                            @XmlAttribute(name = "IncludeExclude")
                            protected IncludeExcludeType includeExclude;

                            /**
                             * Gets the value of the includeExclude property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link IncludeExcludeType }
                             *     
                             */
                            public IncludeExcludeType getIncludeExclude() {
                                return includeExclude;
                            }

                            /**
                             * Sets the value of the includeExclude property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link IncludeExcludeType }
                             *     
                             */
                            public void setIncludeExclude(IncludeExcludeType value) {
                                this.includeExclude = value;
                            }

                        }

                    }

                }

            }

        }

    }

}

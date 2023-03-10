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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This defines codes used by individual GDS's, which can be used to upload rate information.
 * 
 * <p>Java class for GDS_InfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDS_InfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GDS_Codes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GDS_Code" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="GDS_CodeDetails" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="GDS_CodeDetail" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *                                               &lt;attribute name="AgencyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
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
 *                           &lt;attribute name="ChainCode"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="2"/&gt;
 *                                 &lt;maxLength value="2"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="GDS_PropertyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
 *                           &lt;attribute name="GDS_Name" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *                                 &lt;enumeration value="Amadeus"/&gt;
 *                                 &lt;enumeration value="ApolloGalileo"/&gt;
 *                                 &lt;enumeration value="Sabre"/&gt;
 *                                 &lt;enumeration value="Worldspan"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MasterChainCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="2"/&gt;
 *             &lt;maxLength value="2"/&gt;
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
@XmlType(name = "GDS_InfoType", propOrder = {
    "gds_Codes"
})
public class GDS_InfoType
    implements Serializable
{

    @XmlElement(name = "GDS_Codes")
    protected GDS_InfoType.GDS_Codes gds_Codes;
    @XmlAttribute(name = "MasterChainCode")
    protected String masterChainCode;

    /**
     * Gets the value of the gds_Codes property.
     * 
     * @return
     *     possible object is
     *     {@link GDS_InfoType.GDS_Codes }
     *     
     */
    public GDS_InfoType.GDS_Codes getGDS_Codes() {
        return gds_Codes;
    }

    /**
     * Sets the value of the gds_Codes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDS_InfoType.GDS_Codes }
     *     
     */
    public void setGDS_Codes(GDS_InfoType.GDS_Codes value) {
        this.gds_Codes = value;
    }

    /**
     * Gets the value of the masterChainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterChainCode() {
        return masterChainCode;
    }

    /**
     * Sets the value of the masterChainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterChainCode(String value) {
        this.masterChainCode = value;
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
     *         &lt;element name="GDS_Code" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="GDS_CodeDetails" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="GDS_CodeDetail" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
     *                                     &lt;attribute name="AgencyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
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
     *                 &lt;attribute name="ChainCode"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="2"/&gt;
     *                       &lt;maxLength value="2"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="GDS_PropertyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
     *                 &lt;attribute name="GDS_Name" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
     *                       &lt;enumeration value="Amadeus"/&gt;
     *                       &lt;enumeration value="ApolloGalileo"/&gt;
     *                       &lt;enumeration value="Sabre"/&gt;
     *                       &lt;enumeration value="Worldspan"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gds_Code"
    })
    public static class GDS_Codes
        implements Serializable
    {

        @XmlElement(name = "GDS_Code")
        protected List<GDS_InfoType.GDS_Codes.GDS_Code> gds_Code = new Vector<GDS_InfoType.GDS_Codes.GDS_Code>();
        @XmlAttribute(name = "LoadGDSIndicator")
        protected Boolean loadGDSIndicator;

        /**
         * Gets the value of the gdsCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gdsCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGDS_Code().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GDS_InfoType.GDS_Codes.GDS_Code }
         * 
         * 
         */
        public List<GDS_InfoType.GDS_Codes.GDS_Code> getGDS_Code() {
            if (gds_Code == null) {
                gds_Code = new Vector<GDS_InfoType.GDS_Codes.GDS_Code>();
            }
            return this.gds_Code;
        }

        /**
         * Gets the value of the loadGDSIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLoadGDSIndicator() {
            return loadGDSIndicator;
        }

        /**
         * Sets the value of the loadGDSIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLoadGDSIndicator(Boolean value) {
            this.loadGDSIndicator = value;
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
         *         &lt;element name="GDS_CodeDetails" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="GDS_CodeDetail" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
         *                           &lt;attribute name="AgencyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
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
         *       &lt;attribute name="ChainCode"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="2"/&gt;
         *             &lt;maxLength value="2"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="GDS_PropertyCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
         *       &lt;attribute name="GDS_Name" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
         *             &lt;enumeration value="Amadeus"/&gt;
         *             &lt;enumeration value="ApolloGalileo"/&gt;
         *             &lt;enumeration value="Sabre"/&gt;
         *             &lt;enumeration value="Worldspan"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="LoadGDSIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "gds_CodeDetails"
        })
        public static class GDS_Code
            implements Serializable
        {

            @XmlElement(name = "GDS_CodeDetails")
            protected GDS_InfoType.GDS_Codes.GDS_Code.GDS_CodeDetails gds_CodeDetails;
            @XmlAttribute(name = "ChainCode")
            protected String chainCode;
            @XmlAttribute(name = "GDS_PropertyCode")
            protected String gds_PropertyCode;
            @XmlAttribute(name = "GDS_Name", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String gds_Name;
            @XmlAttribute(name = "LoadGDSIndicator")
            protected Boolean loadGDSIndicator;

            /**
             * Gets the value of the gds_CodeDetails property.
             * 
             * @return
             *     possible object is
             *     {@link GDS_InfoType.GDS_Codes.GDS_Code.GDS_CodeDetails }
             *     
             */
            public GDS_InfoType.GDS_Codes.GDS_Code.GDS_CodeDetails getGDS_CodeDetails() {
                return gds_CodeDetails;
            }

            /**
             * Sets the value of the gds_CodeDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link GDS_InfoType.GDS_Codes.GDS_Code.GDS_CodeDetails }
             *     
             */
            public void setGDS_CodeDetails(GDS_InfoType.GDS_Codes.GDS_Code.GDS_CodeDetails value) {
                this.gds_CodeDetails = value;
            }

            /**
             * Gets the value of the chainCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChainCode() {
                return chainCode;
            }

            /**
             * Sets the value of the chainCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChainCode(String value) {
                this.chainCode = value;
            }

            /**
             * Gets the value of the gds_PropertyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDS_PropertyCode() {
                return gds_PropertyCode;
            }

            /**
             * Sets the value of the gds_PropertyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDS_PropertyCode(String value) {
                this.gds_PropertyCode = value;
            }

            /**
             * Gets the value of the gds_Name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGDS_Name() {
                return gds_Name;
            }

            /**
             * Sets the value of the gds_Name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGDS_Name(String value) {
                this.gds_Name = value;
            }

            /**
             * Gets the value of the loadGDSIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLoadGDSIndicator() {
                return loadGDSIndicator;
            }

            /**
             * Sets the value of the loadGDSIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLoadGDSIndicator(Boolean value) {
                this.loadGDSIndicator = value;
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
             *         &lt;element name="GDS_CodeDetail" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
             *                 &lt;attribute name="AgencyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
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
                "gds_CodeDetail"
            })
            public static class GDS_CodeDetails
                implements Serializable
            {

                @XmlElement(name = "GDS_CodeDetail")
                protected List<GDS_InfoType.GDS_Codes.GDS_Code.GDS_CodeDetails.GDS_CodeDetail> gds_CodeDetail = new Vector<GDS_InfoType.GDS_Codes.GDS_Code.GDS_CodeDetails.GDS_CodeDetail>();

                /**
                 * Gets the value of the gdsCodeDetail property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the gdsCodeDetail property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGDS_CodeDetail().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GDS_InfoType.GDS_Codes.GDS_Code.GDS_CodeDetails.GDS_CodeDetail }
                 * 
                 * 
                 */
                public List<GDS_InfoType.GDS_Codes.GDS_Code.GDS_CodeDetails.GDS_CodeDetail> getGDS_CodeDetail() {
                    if (gds_CodeDetail == null) {
                        gds_CodeDetail = new Vector<GDS_InfoType.GDS_Codes.GDS_Code.GDS_CodeDetails.GDS_CodeDetail>();
                    }
                    return this.gds_CodeDetail;
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
                 *       &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" /&gt;
                 *       &lt;attribute name="AgencyName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class GDS_CodeDetail
                    implements Serializable
                {

                    @XmlAttribute(name = "PseudoCityCode")
                    protected String pseudoCityCode;
                    @XmlAttribute(name = "AgencyName")
                    protected String agencyName;

                    /**
                     * Gets the value of the pseudoCityCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPseudoCityCode() {
                        return pseudoCityCode;
                    }

                    /**
                     * Sets the value of the pseudoCityCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPseudoCityCode(String value) {
                        this.pseudoCityCode = value;
                    }

                    /**
                     * Gets the value of the agencyName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgencyName() {
                        return agencyName;
                    }

                    /**
                     * Sets the value of the agencyName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgencyName(String value) {
                        this.agencyName = value;
                    }

                }

            }

        }

    }

}

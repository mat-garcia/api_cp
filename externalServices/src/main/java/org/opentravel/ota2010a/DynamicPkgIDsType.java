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


/**
 * A collection of DynamicPkgID objects for a given reservation.
 * 
 * <p>Java class for DynamicPkgIDsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicPkgIDsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DynamicPkgID" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ResID_Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *                 &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *                 &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
 *                 &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
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
@XmlType(name = "DynamicPkgIDsType", propOrder = {
    "dynamicPkgID"
})
public class DynamicPkgIDsType
    implements Serializable
{

    @XmlElement(name = "DynamicPkgID", required = true)
    protected List<DynamicPkgIDsType.DynamicPkgID> dynamicPkgID = new Vector<DynamicPkgIDsType.DynamicPkgID>();

    /**
     * Gets the value of the dynamicPkgID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicPkgID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicPkgID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicPkgIDsType.DynamicPkgID }
     * 
     * 
     */
    public List<DynamicPkgIDsType.DynamicPkgID> getDynamicPkgID() {
        if (dynamicPkgID == null) {
            dynamicPkgID = new Vector<DynamicPkgIDsType.DynamicPkgID>();
        }
        return this.dynamicPkgID;
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
     *       &lt;attribute name="ResID_Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *       &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
     *       &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
     *       &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DynamicPkgID
        implements Serializable
    {

        @XmlAttribute(name = "ResID_Type")
        protected String resID_Type;
        @XmlAttribute(name = "ResID_Value")
        protected String resID_Value;
        @XmlAttribute(name = "ResID_Source")
        protected String resID_Source;
        @XmlAttribute(name = "ResID_SourceContext")
        protected String resID_SourceContext;

        /**
         * Gets the value of the resID_Type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResID_Type() {
            return resID_Type;
        }

        /**
         * Sets the value of the resID_Type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResID_Type(String value) {
            this.resID_Type = value;
        }

        /**
         * Gets the value of the resID_Value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResID_Value() {
            return resID_Value;
        }

        /**
         * Sets the value of the resID_Value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResID_Value(String value) {
            this.resID_Value = value;
        }

        /**
         * Gets the value of the resID_Source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResID_Source() {
            return resID_Source;
        }

        /**
         * Sets the value of the resID_Source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResID_Source(String value) {
            this.resID_Source = value;
        }

        /**
         * Gets the value of the resID_SourceContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResID_SourceContext() {
            return resID_SourceContext;
        }

        /**
         * Sets the value of the resID_SourceContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResID_SourceContext(String value) {
            this.resID_SourceContext = value;
        }

    }

}

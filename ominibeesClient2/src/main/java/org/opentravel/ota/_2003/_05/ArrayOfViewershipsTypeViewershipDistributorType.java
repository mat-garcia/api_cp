
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
 * <p>Classe Java de ArrayOfViewershipsTypeViewershipDistributorType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfViewershipsTypeViewershipDistributorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistributorType" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="DistributorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DistributorTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfViewershipsTypeViewershipDistributorType", propOrder = {
    "distributorType"
})
public class ArrayOfViewershipsTypeViewershipDistributorType {

    @XmlElement(name = "DistributorType")
    protected List<ArrayOfViewershipsTypeViewershipDistributorType.DistributorType> distributorType;

    /**
     * Gets the value of the distributorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfViewershipsTypeViewershipDistributorType.DistributorType }
     * 
     * 
     */
    public List<ArrayOfViewershipsTypeViewershipDistributorType.DistributorType> getDistributorType() {
        if (distributorType == null) {
            distributorType = new ArrayList<ArrayOfViewershipsTypeViewershipDistributorType.DistributorType>();
        }
        return this.distributorType;
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
     *       &lt;attribute name="DistributorCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DistributorTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class DistributorType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "DistributorCode")
        protected String distributorCode;
        @XmlAttribute(name = "DistributorTypeCode")
        protected String distributorTypeCode;

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
         * Obtém o valor da propriedade distributorCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistributorCode() {
            return distributorCode;
        }

        /**
         * Define o valor da propriedade distributorCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistributorCode(String value) {
            this.distributorCode = value;
        }

        /**
         * Obtém o valor da propriedade distributorTypeCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistributorTypeCode() {
            return distributorTypeCode;
        }

        /**
         * Define o valor da propriedade distributorTypeCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistributorTypeCode(String value) {
            this.distributorTypeCode = value;
        }

    }

}

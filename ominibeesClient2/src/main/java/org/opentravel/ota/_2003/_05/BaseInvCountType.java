
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BaseInvCountType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BaseInvCountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusApplicationControl" type="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType" minOccurs="0"/&gt;
 *         &lt;element name="InvCounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfInvCount" minOccurs="0"/&gt;
 *         &lt;element name="OffSell" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="OffSellValueType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Total"/&gt;
 *                       &lt;enumeration value="Adjustment"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="OffSellValue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseInvCountType", propOrder = {
    "statusApplicationControl",
    "invCounts",
    "offSell",
    "uniqueID"
})
public class BaseInvCountType {

    @XmlElement(name = "StatusApplicationControl")
    protected StatusApplicationControlType statusApplicationControl;
    @XmlElement(name = "InvCounts")
    protected ArrayOfInvCount invCounts;
    @XmlElement(name = "OffSell")
    protected BaseInvCountType.OffSell offSell;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;

    /**
     * Obtém o valor da propriedade statusApplicationControl.
     * 
     * @return
     *     possible object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public StatusApplicationControlType getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * Define o valor da propriedade statusApplicationControl.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusApplicationControlType }
     *     
     */
    public void setStatusApplicationControl(StatusApplicationControlType value) {
        this.statusApplicationControl = value;
    }

    /**
     * Obtém o valor da propriedade invCounts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvCount }
     *     
     */
    public ArrayOfInvCount getInvCounts() {
        return invCounts;
    }

    /**
     * Define o valor da propriedade invCounts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvCount }
     *     
     */
    public void setInvCounts(ArrayOfInvCount value) {
        this.invCounts = value;
    }

    /**
     * Obtém o valor da propriedade offSell.
     * 
     * @return
     *     possible object is
     *     {@link BaseInvCountType.OffSell }
     *     
     */
    public BaseInvCountType.OffSell getOffSell() {
        return offSell;
    }

    /**
     * Define o valor da propriedade offSell.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseInvCountType.OffSell }
     *     
     */
    public void setOffSell(BaseInvCountType.OffSell value) {
        this.offSell = value;
    }

    /**
     * Obtém o valor da propriedade uniqueID.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Define o valor da propriedade uniqueID.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
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
     *       &lt;attribute name="OffSellValueType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Total"/&gt;
     *             &lt;enumeration value="Adjustment"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="OffSellValue" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OffSell {

        @XmlAttribute(name = "OffSellValueType")
        protected String offSellValueType;
        @XmlAttribute(name = "OffSellValue")
        protected BigDecimal offSellValue;

        /**
         * Obtém o valor da propriedade offSellValueType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffSellValueType() {
            return offSellValueType;
        }

        /**
         * Define o valor da propriedade offSellValueType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffSellValueType(String value) {
            this.offSellValueType = value;
        }

        /**
         * Obtém o valor da propriedade offSellValue.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOffSellValue() {
            return offSellValue;
        }

        /**
         * Define o valor da propriedade offSellValue.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOffSellValue(BigDecimal value) {
            this.offSellValue = value;
        }

    }

}

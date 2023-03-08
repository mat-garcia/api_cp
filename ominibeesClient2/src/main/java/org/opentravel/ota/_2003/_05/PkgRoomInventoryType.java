
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PkgRoomInventoryType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PkgRoomInventoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplementCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFeeType1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MaxAdults" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="CotQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="FreeChildFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgRoomInventoryType", propOrder = {
    "supplementCharges"
})
public class PkgRoomInventoryType
    extends RoomStayCandidateType
{

    @XmlElement(name = "SupplementCharges")
    protected ArrayOfFeeType1 supplementCharges;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "MinOccupancy")
    protected BigInteger minOccupancy;
    @XmlAttribute(name = "MaxOccupancy")
    protected BigInteger maxOccupancy;
    @XmlAttribute(name = "MaxAdults")
    protected BigInteger maxAdults;
    @XmlAttribute(name = "CotQuantity")
    protected BigInteger cotQuantity;
    @XmlAttribute(name = "FreeChildFlag")
    protected Boolean freeChildFlag;

    /**
     * Obtém o valor da propriedade supplementCharges.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFeeType1 }
     *     
     */
    public ArrayOfFeeType1 getSupplementCharges() {
        return supplementCharges;
    }

    /**
     * Define o valor da propriedade supplementCharges.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFeeType1 }
     *     
     */
    public void setSupplementCharges(ArrayOfFeeType1 value) {
        this.supplementCharges = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade minOccupancy.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinOccupancy() {
        return minOccupancy;
    }

    /**
     * Define o valor da propriedade minOccupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinOccupancy(BigInteger value) {
        this.minOccupancy = value;
    }

    /**
     * Obtém o valor da propriedade maxOccupancy.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Define o valor da propriedade maxOccupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOccupancy(BigInteger value) {
        this.maxOccupancy = value;
    }

    /**
     * Obtém o valor da propriedade maxAdults.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAdults() {
        return maxAdults;
    }

    /**
     * Define o valor da propriedade maxAdults.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAdults(BigInteger value) {
        this.maxAdults = value;
    }

    /**
     * Obtém o valor da propriedade cotQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCotQuantity() {
        return cotQuantity;
    }

    /**
     * Define o valor da propriedade cotQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCotQuantity(BigInteger value) {
        this.cotQuantity = value;
    }

    /**
     * Obtém o valor da propriedade freeChildFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeChildFlag() {
        return freeChildFlag;
    }

    /**
     * Define o valor da propriedade freeChildFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeChildFlag(Boolean value) {
        this.freeChildFlag = value;
    }

}

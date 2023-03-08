
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MessageAcknowledgementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}InvCountType" minOccurs="0"/&gt;
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
    "inventories"
})
@XmlRootElement(name = "OTA_HotelInvCountNotifRS")
public class OTAHotelInvCountNotifRS
    extends MessageAcknowledgementType
{

    @XmlElement(name = "Inventories")
    protected InvCountType inventories;

    /**
     * Obtém o valor da propriedade inventories.
     * 
     * @return
     *     possible object is
     *     {@link InvCountType }
     *     
     */
    public InvCountType getInventories() {
        return inventories;
    }

    /**
     * Define o valor da propriedade inventories.
     * 
     * @param value
     *     allowed object is
     *     {@link InvCountType }
     *     
     */
    public void setInventories(InvCountType value) {
        this.inventories = value;
    }

}

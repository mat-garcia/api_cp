
package com.omnibees.connectors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.opentravel.ota._2003._05.ChannelDetail;


/**
 * <p>Classe Java de Channel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Channel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelDetail" type="{http://www.opentravel.org/OTA/2003/05}ChannelDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Channel", propOrder = {
    "uid",
    "name",
    "channelDetail"
})
public class Channel {

    @XmlElement(name = "UID")
    protected long uid;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ChannelDetail")
    protected ChannelDetail channelDetail;

    /**
     * Obtém o valor da propriedade uid.
     * 
     */
    public long getUID() {
        return uid;
    }

    /**
     * Define o valor da propriedade uid.
     * 
     */
    public void setUID(long value) {
        this.uid = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade channelDetail.
     * 
     * @return
     *     possible object is
     *     {@link ChannelDetail }
     *     
     */
    public ChannelDetail getChannelDetail() {
        return channelDetail;
    }

    /**
     * Define o valor da propriedade channelDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelDetail }
     *     
     */
    public void setChannelDetail(ChannelDetail value) {
        this.channelDetail = value;
    }

}

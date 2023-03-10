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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *  This is used by OTA_HotelRFP_TransientNotifRQ schema. This accommodates detailed transient RFP information.
 * 
 * <p>Java class for RFP_TransientDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFP_TransientDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RFP_TransientResponses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RFP_TransientResponse" type="{http://www.opentravel.org/OTA/2003/05}RFP_TransientResponseType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MessageID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
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
@XmlType(name = "RFP_TransientDetailsType", propOrder = {
    "rfp_TransientResponses",
    "messageID"
})
@XmlSeeAlso({
    OTA_HotelRFP_TransientNotifRQ.class
})
public class RFP_TransientDetailsType
    implements Serializable
{

    @XmlElement(name = "RFP_TransientResponses")
    protected RFP_TransientDetailsType.RFP_TransientResponses rfp_TransientResponses;
    @XmlElement(name = "MessageID")
    protected RFP_TransientDetailsType.MessageID messageID;

    /**
     * Gets the value of the rfp_TransientResponses property.
     * 
     * @return
     *     possible object is
     *     {@link RFP_TransientDetailsType.RFP_TransientResponses }
     *     
     */
    public RFP_TransientDetailsType.RFP_TransientResponses getRFP_TransientResponses() {
        return rfp_TransientResponses;
    }

    /**
     * Sets the value of the rfp_TransientResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFP_TransientDetailsType.RFP_TransientResponses }
     *     
     */
    public void setRFP_TransientResponses(RFP_TransientDetailsType.RFP_TransientResponses value) {
        this.rfp_TransientResponses = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link RFP_TransientDetailsType.MessageID }
     *     
     */
    public RFP_TransientDetailsType.MessageID getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFP_TransientDetailsType.MessageID }
     *     
     */
    public void setMessageID(RFP_TransientDetailsType.MessageID value) {
        this.messageID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MessageID
        extends UniqueID_Type
        implements Serializable
    {


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
     *         &lt;element name="RFP_TransientResponse" type="{http://www.opentravel.org/OTA/2003/05}RFP_TransientResponseType" maxOccurs="unbounded"/&gt;
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
        "rfp_TransientResponse"
    })
    public static class RFP_TransientResponses
        implements Serializable
    {

        @XmlElement(name = "RFP_TransientResponse", required = true)
        protected List<RFP_TransientResponseType> rfp_TransientResponse = new Vector<RFP_TransientResponseType>();

        /**
         * Gets the value of the rfpTransientResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rfpTransientResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRFP_TransientResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RFP_TransientResponseType }
         * 
         * 
         */
        public List<RFP_TransientResponseType> getRFP_TransientResponse() {
            if (rfp_TransientResponse == null) {
                rfp_TransientResponse = new Vector<RFP_TransientResponseType>();
            }
            return this.rfp_TransientResponse;
        }

    }

}


package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OperatingAirlineType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OperatingAirlineType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNameType"&gt;
 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MarketingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BookedRBD" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TicketedRBD" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FrequentFlierMiles" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingAirlineType")
public class OperatingAirlineType
    extends CompanyNameType
{

    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "ResBookDesigCode")
    protected String resBookDesigCode;
    @XmlAttribute(name = "MarketingInd")
    protected Boolean marketingInd;
    @XmlAttribute(name = "BookedRBD")
    protected String bookedRBD;
    @XmlAttribute(name = "TicketedRBD")
    protected String ticketedRBD;
    @XmlAttribute(name = "FrequentFlierMiles")
    protected String frequentFlierMiles;

    /**
     * Obtém o valor da propriedade flightNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Define o valor da propriedade flightNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Obtém o valor da propriedade resBookDesigCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * Define o valor da propriedade resBookDesigCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
    }

    /**
     * Obtém o valor da propriedade marketingInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingInd() {
        return marketingInd;
    }

    /**
     * Define o valor da propriedade marketingInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingInd(Boolean value) {
        this.marketingInd = value;
    }

    /**
     * Obtém o valor da propriedade bookedRBD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookedRBD() {
        return bookedRBD;
    }

    /**
     * Define o valor da propriedade bookedRBD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookedRBD(String value) {
        this.bookedRBD = value;
    }

    /**
     * Obtém o valor da propriedade ticketedRBD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketedRBD() {
        return ticketedRBD;
    }

    /**
     * Define o valor da propriedade ticketedRBD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketedRBD(String value) {
        this.ticketedRBD = value;
    }

    /**
     * Obtém o valor da propriedade frequentFlierMiles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentFlierMiles() {
        return frequentFlierMiles;
    }

    /**
     * Define o valor da propriedade frequentFlierMiles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentFlierMiles(String value) {
        this.frequentFlierMiles = value;
    }

}

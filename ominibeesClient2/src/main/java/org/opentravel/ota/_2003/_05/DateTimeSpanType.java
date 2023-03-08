
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de DateTimeSpanType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DateTimeSpanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="DateWindowRange" type="{http://www.opentravel.org/OTA/2003/05}TimeInstantType" minOccurs="0"/&gt;
 *           &lt;element name="EndDateWindow" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="StartDateWindow" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeSpanType", propOrder = {
    "dateWindowRangeOrEndDateWindowOrStartDateWindow"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.ResCommonDetailType.TimeSpan.class
})
public class DateTimeSpanType {

    @XmlElements({
        @XmlElement(name = "DateWindowRange", type = TimeInstantType.class),
        @XmlElement(name = "EndDateWindow", type = DateTimeSpanType.EndDateWindow.class),
        @XmlElement(name = "StartDateWindow", type = DateTimeSpanType.StartDateWindow.class)
    })
    protected List<Object> dateWindowRangeOrEndDateWindowOrStartDateWindow;
    @XmlAttribute(name = "Start", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;

    /**
     * Gets the value of the dateWindowRangeOrEndDateWindowOrStartDateWindow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateWindowRangeOrEndDateWindowOrStartDateWindow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateWindowRangeOrEndDateWindowOrStartDateWindow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimeSpanType.EndDateWindow }
     * {@link DateTimeSpanType.StartDateWindow }
     * {@link TimeInstantType }
     * 
     * 
     */
    public List<Object> getDateWindowRangeOrEndDateWindowOrStartDateWindow() {
        if (dateWindowRangeOrEndDateWindowOrStartDateWindow == null) {
            dateWindowRangeOrEndDateWindowOrStartDateWindow = new ArrayList<Object>();
        }
        return this.dateWindowRangeOrEndDateWindowOrStartDateWindow;
    }

    /**
     * Obtém o valor da propriedade start.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Define o valor da propriedade start.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Obtém o valor da propriedade duration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Define o valor da propriedade duration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Obtém o valor da propriedade end.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Define o valor da propriedade end.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
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
     *       &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EndDateWindow {

        @XmlAttribute(name = "EarliestDate")
        protected String earliestDate;
        @XmlAttribute(name = "LatestDate")
        protected String latestDate;
        @XmlAttribute(name = "DOW")
        protected DayOfWeekType dow;

        /**
         * Obtém o valor da propriedade earliestDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarliestDate() {
            return earliestDate;
        }

        /**
         * Define o valor da propriedade earliestDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarliestDate(String value) {
            this.earliestDate = value;
        }

        /**
         * Obtém o valor da propriedade latestDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestDate() {
            return latestDate;
        }

        /**
         * Define o valor da propriedade latestDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestDate(String value) {
            this.latestDate = value;
        }

        /**
         * Obtém o valor da propriedade dow.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDOW() {
            return dow;
        }

        /**
         * Define o valor da propriedade dow.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDOW(DayOfWeekType value) {
            this.dow = value;
        }

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
     *       &lt;attribute name="EarliestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LatestDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DOW" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StartDateWindow {

        @XmlAttribute(name = "EarliestDate")
        protected String earliestDate;
        @XmlAttribute(name = "LatestDate")
        protected String latestDate;
        @XmlAttribute(name = "DOW")
        protected DayOfWeekType dow;

        /**
         * Obtém o valor da propriedade earliestDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarliestDate() {
            return earliestDate;
        }

        /**
         * Define o valor da propriedade earliestDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarliestDate(String value) {
            this.earliestDate = value;
        }

        /**
         * Obtém o valor da propriedade latestDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatestDate() {
            return latestDate;
        }

        /**
         * Define o valor da propriedade latestDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatestDate(String value) {
            this.latestDate = value;
        }

        /**
         * Obtém o valor da propriedade dow.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDOW() {
            return dow;
        }

        /**
         * Define o valor da propriedade dow.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDOW(DayOfWeekType value) {
            this.dow = value;
        }

    }

}

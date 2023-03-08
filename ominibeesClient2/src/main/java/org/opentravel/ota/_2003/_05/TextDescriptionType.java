
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de TextDescriptionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TextDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="Description" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;TextType"&gt;
 *                   &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Author" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CopyrightNotice" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CopyrightOwner" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CopyrightStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CopyrightEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EffectiveStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EffectiveEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SourceID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextDescriptionType", propOrder = {
    "descriptionOrURL"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.TextItemsType.TextItem.class
})
public class TextDescriptionType {

    @XmlElements({
        @XmlElement(name = "Description", type = TextDescriptionType.Description.class),
        @XmlElement(name = "URL", type = String.class)
    })
    protected List<Object> descriptionOrURL;
    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "ContentID")
    protected String contentID;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "Author")
    protected String author;
    @XmlAttribute(name = "CopyrightNotice")
    protected String copyrightNotice;
    @XmlAttribute(name = "CopyrightOwner")
    protected String copyrightOwner;
    @XmlAttribute(name = "CopyrightStart")
    protected String copyrightStart;
    @XmlAttribute(name = "CopyrightEnd")
    protected String copyrightEnd;
    @XmlAttribute(name = "EffectiveStart")
    protected String effectiveStart;
    @XmlAttribute(name = "EffectiveEnd")
    protected String effectiveEnd;
    @XmlAttribute(name = "ApplicableStart")
    protected String applicableStart;
    @XmlAttribute(name = "ApplicableEnd")
    protected String applicableEnd;
    @XmlAttribute(name = "RecordID")
    protected String recordID;
    @XmlAttribute(name = "SourceID")
    protected String sourceID;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;

    /**
     * Gets the value of the descriptionOrURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionOrURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionOrURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link TextDescriptionType.Description }
     * 
     * 
     */
    public List<Object> getDescriptionOrURL() {
        if (descriptionOrURL == null) {
            descriptionOrURL = new ArrayList<Object>();
        }
        return this.descriptionOrURL;
    }

    /**
     * Obtém o valor da propriedade category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define o valor da propriedade category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Obtém o valor da propriedade contentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentID() {
        return contentID;
    }

    /**
     * Define o valor da propriedade contentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentID(String value) {
        this.contentID = value;
    }

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtém o valor da propriedade author.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Define o valor da propriedade author.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Obtém o valor da propriedade copyrightNotice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightNotice() {
        return copyrightNotice;
    }

    /**
     * Define o valor da propriedade copyrightNotice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightNotice(String value) {
        this.copyrightNotice = value;
    }

    /**
     * Obtém o valor da propriedade copyrightOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightOwner() {
        return copyrightOwner;
    }

    /**
     * Define o valor da propriedade copyrightOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightOwner(String value) {
        this.copyrightOwner = value;
    }

    /**
     * Obtém o valor da propriedade copyrightStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightStart() {
        return copyrightStart;
    }

    /**
     * Define o valor da propriedade copyrightStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightStart(String value) {
        this.copyrightStart = value;
    }

    /**
     * Obtém o valor da propriedade copyrightEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightEnd() {
        return copyrightEnd;
    }

    /**
     * Define o valor da propriedade copyrightEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightEnd(String value) {
        this.copyrightEnd = value;
    }

    /**
     * Obtém o valor da propriedade effectiveStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveStart() {
        return effectiveStart;
    }

    /**
     * Define o valor da propriedade effectiveStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveStart(String value) {
        this.effectiveStart = value;
    }

    /**
     * Obtém o valor da propriedade effectiveEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveEnd() {
        return effectiveEnd;
    }

    /**
     * Define o valor da propriedade effectiveEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveEnd(String value) {
        this.effectiveEnd = value;
    }

    /**
     * Obtém o valor da propriedade applicableStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableStart() {
        return applicableStart;
    }

    /**
     * Define o valor da propriedade applicableStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableStart(String value) {
        this.applicableStart = value;
    }

    /**
     * Obtém o valor da propriedade applicableEnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableEnd() {
        return applicableEnd;
    }

    /**
     * Define o valor da propriedade applicableEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableEnd(String value) {
        this.applicableEnd = value;
    }

    /**
     * Obtém o valor da propriedade recordID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * Define o valor da propriedade recordID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordID(String value) {
        this.recordID = value;
    }

    /**
     * Obtém o valor da propriedade sourceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceID() {
        return sourceID;
    }

    /**
     * Define o valor da propriedade sourceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceID(String value) {
        this.sourceID = value;
    }

    /**
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;TextType"&gt;
     *       &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Description
        extends TextType
    {

        @XmlAttribute(name = "ListItem")
        protected BigInteger listItem;

        /**
         * Obtém o valor da propriedade listItem.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getListItem() {
            return listItem;
        }

        /**
         * Define o valor da propriedade listItem.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setListItem(BigInteger value) {
            this.listItem = value;
        }

    }

}

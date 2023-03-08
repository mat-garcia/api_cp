
package org.opentravel.ota._2003._05;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BasicPropertyInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BasicPropertyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BasicPropertyInfoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserGeneratedContent" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicPropertyInfo", propOrder = {
    "userGeneratedContent"
})
public class BasicPropertyInfo
    extends BasicPropertyInfoType
{

    @XmlElement(name = "UserGeneratedContent")
    protected BasicPropertyInfo.UserGeneratedContent userGeneratedContent;

    /**
     * Obtém o valor da propriedade userGeneratedContent.
     * 
     * @return
     *     possible object is
     *     {@link BasicPropertyInfo.UserGeneratedContent }
     *     
     */
    public BasicPropertyInfo.UserGeneratedContent getUserGeneratedContent() {
        return userGeneratedContent;
    }

    /**
     * Define o valor da propriedade userGeneratedContent.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPropertyInfo.UserGeneratedContent }
     *     
     */
    public void setUserGeneratedContent(BasicPropertyInfo.UserGeneratedContent value) {
        this.userGeneratedContent = value;
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
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UserGeneratedContent {

        @XmlAttribute(name = "Rating")
        protected BigInteger rating;

        /**
         * Obtém o valor da propriedade rating.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRating() {
            return rating;
        }

        /**
         * Define o valor da propriedade rating.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRating(BigInteger value) {
            this.rating = value;
        }

    }

}

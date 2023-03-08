//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 12:21:47 PM BRST 
//


package org.opentravel.ota2010a;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Textual information to provide descriptions and/or additional information.
 * 
 * <p>Java class for FreeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeTextType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LanguageGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeTextType", propOrder = {
    "value"
})
@XmlSeeAlso({
    org.opentravel.ota2010a.OTA_AirAvailRS.OriginDestinationInformation.OriginDestinationOptions.OriginDestinationOption.FlightSegment.TrafficRestrictionInfo.class,
    org.opentravel.ota2010a.OTA_AirFlifoRS.FlightInfoDetails.FlightLegInfo.Comment.class,
    org.opentravel.ota2010a.OTA_CancelRQ.Reasons.Reason.class,
    org.opentravel.ota2010a.OTA_DynamicPkgAvailRS.SearchResults.AirResults.OriginDestinationInformation.OriginDestinationOptions.OriginDestinationOption.FlightSegment.TrafficRestrictionInfo.class,
    WarningType.class,
    ErrorType.class,
    org.opentravel.ota2010a.PTCFareBreakdownType.Endorsements.Endorsement.class,
    org.opentravel.ota2010a.FareRuleResponseInfoType.AdvisoryInfo.class,
    org.opentravel.ota2010a.FareCodeOptionType.FareRemark.class,
    CertificationType.class,
    CommissionInfoType.class,
    org.opentravel.ota2010a.IndCoverageReqsType.PreexistingConditions.PreexistingCondition.class,
    org.opentravel.ota2010a.PlanRestrictionType.PlanRestriction.class,
    org.opentravel.ota2010a.TicketingInfoType.TicketAdvisory.class
})
public class FreeTextType
    implements Serializable
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;

    /**
     * Gets the value of the value property.
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
     * Sets the value of the value property.
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
     * Gets the value of the language property.
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
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}

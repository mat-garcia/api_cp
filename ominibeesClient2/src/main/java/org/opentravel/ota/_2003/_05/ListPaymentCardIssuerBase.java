
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de List_PaymentCardIssuer_Base.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="List_PaymentCardIssuer_Base"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AmericanExpress"/&gt;
 *     &lt;enumeration value="BankOfAmerica"/&gt;
 *     &lt;enumeration value="BritishAirways"/&gt;
 *     &lt;enumeration value="CapitalOne"/&gt;
 *     &lt;enumeration value="Chase"/&gt;
 *     &lt;enumeration value="Citibank"/&gt;
 *     &lt;enumeration value="ContinentalAirlines"/&gt;
 *     &lt;enumeration value="DeltaAirlines"/&gt;
 *     &lt;enumeration value="DiscoverCard"/&gt;
 *     &lt;enumeration value="Disney"/&gt;
 *     &lt;enumeration value="Eurocard"/&gt;
 *     &lt;enumeration value="Hilton"/&gt;
 *     &lt;enumeration value="Hyatt"/&gt;
 *     &lt;enumeration value="Mariott"/&gt;
 *     &lt;enumeration value="Mastercard"/&gt;
 *     &lt;enumeration value="RitzCarlton"/&gt;
 *     &lt;enumeration value="SouthwestAirlines"/&gt;
 *     &lt;enumeration value="StarwoodHotels"/&gt;
 *     &lt;enumeration value="UnitedAirlines"/&gt;
 *     &lt;enumeration value="USAirways"/&gt;
 *     &lt;enumeration value="VISA"/&gt;
 *     &lt;enumeration value="Other_"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "List_PaymentCardIssuer_Base")
@XmlEnum
public enum ListPaymentCardIssuerBase {

    @XmlEnumValue("AmericanExpress")
    AMERICAN_EXPRESS("AmericanExpress"),
    @XmlEnumValue("BankOfAmerica")
    BANK_OF_AMERICA("BankOfAmerica"),
    @XmlEnumValue("BritishAirways")
    BRITISH_AIRWAYS("BritishAirways"),
    @XmlEnumValue("CapitalOne")
    CAPITAL_ONE("CapitalOne"),
    @XmlEnumValue("Chase")
    CHASE("Chase"),
    @XmlEnumValue("Citibank")
    CITIBANK("Citibank"),
    @XmlEnumValue("ContinentalAirlines")
    CONTINENTAL_AIRLINES("ContinentalAirlines"),
    @XmlEnumValue("DeltaAirlines")
    DELTA_AIRLINES("DeltaAirlines"),
    @XmlEnumValue("DiscoverCard")
    DISCOVER_CARD("DiscoverCard"),
    @XmlEnumValue("Disney")
    DISNEY("Disney"),
    @XmlEnumValue("Eurocard")
    EUROCARD("Eurocard"),
    @XmlEnumValue("Hilton")
    HILTON("Hilton"),
    @XmlEnumValue("Hyatt")
    HYATT("Hyatt"),
    @XmlEnumValue("Mariott")
    MARIOTT("Mariott"),
    @XmlEnumValue("Mastercard")
    MASTERCARD("Mastercard"),
    @XmlEnumValue("RitzCarlton")
    RITZ_CARLTON("RitzCarlton"),
    @XmlEnumValue("SouthwestAirlines")
    SOUTHWEST_AIRLINES("SouthwestAirlines"),
    @XmlEnumValue("StarwoodHotels")
    STARWOOD_HOTELS("StarwoodHotels"),
    @XmlEnumValue("UnitedAirlines")
    UNITED_AIRLINES("UnitedAirlines"),
    @XmlEnumValue("USAirways")
    US_AIRWAYS("USAirways"),
    VISA("VISA"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListPaymentCardIssuerBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListPaymentCardIssuerBase fromValue(String v) {
        for (ListPaymentCardIssuerBase c: ListPaymentCardIssuerBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

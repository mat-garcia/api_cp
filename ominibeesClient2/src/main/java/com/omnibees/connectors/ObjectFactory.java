
package com.omnibees.connectors;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.omnibees.connectors package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OmnibeesCredentials_QNAME = new QName("http://connectors.omnibees.com/", "OmnibeesCredentials");
    private final static QName _ChannelsRQ_QNAME = new QName("http://connectors.omnibees.com/", "ChannelsRQ");
    private final static QName _ChannelsRS_QNAME = new QName("http://connectors.omnibees.com/", "ChannelsRS");
    private final static QName _PaymentGatewayDetailRQ_QNAME = new QName("http://connectors.omnibees.com/", "PaymentGatewayDetailRQ");
    private final static QName _PaymentGatewayDetailRS_QNAME = new QName("http://connectors.omnibees.com/", "PaymentGatewayDetailRS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.omnibees.connectors
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OmnibeesCredentials }
     * 
     */
    public OmnibeesCredentials createOmnibeesCredentials() {
        return new OmnibeesCredentials();
    }

    /**
     * Create an instance of {@link ChannelsRQ }
     * 
     */
    public ChannelsRQ createChannelsRQ() {
        return new ChannelsRQ();
    }

    /**
     * Create an instance of {@link ChannelsRS }
     * 
     */
    public ChannelsRS createChannelsRS() {
        return new ChannelsRS();
    }

    /**
     * Create an instance of {@link PaymentGatewayDetailRQ }
     * 
     */
    public PaymentGatewayDetailRQ createPaymentGatewayDetailRQ() {
        return new PaymentGatewayDetailRQ();
    }

    /**
     * Create an instance of {@link PaymentGatewayDetailRS }
     * 
     */
    public PaymentGatewayDetailRS createPaymentGatewayDetailRS() {
        return new PaymentGatewayDetailRS();
    }

    /**
     * Create an instance of {@link ComplementarResponse }
     * 
     */
    public ComplementarResponse createComplementarResponse() {
        return new ComplementarResponse();
    }

    /**
     * Create an instance of {@link ArrayOfChannel }
     * 
     */
    public ArrayOfChannel createArrayOfChannel() {
        return new ArrayOfChannel();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link ArrayOfWarningType }
     * 
     */
    public ArrayOfWarningType createArrayOfWarningType() {
        return new ArrayOfWarningType();
    }

    /**
     * Create an instance of {@link ArrayOfErrorType }
     * 
     */
    public ArrayOfErrorType createArrayOfErrorType() {
        return new ArrayOfErrorType();
    }

    /**
     * Create an instance of {@link ArrayOfLong }
     * 
     */
    public ArrayOfLong createArrayOfLong() {
        return new ArrayOfLong();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentGatewayReservation }
     * 
     */
    public ArrayOfPaymentGatewayReservation createArrayOfPaymentGatewayReservation() {
        return new ArrayOfPaymentGatewayReservation();
    }

    /**
     * Create an instance of {@link PaymentGatewayReservation }
     * 
     */
    public PaymentGatewayReservation createPaymentGatewayReservation() {
        return new PaymentGatewayReservation();
    }

    /**
     * Create an instance of {@link ArrayOfGatewayDetail }
     * 
     */
    public ArrayOfGatewayDetail createArrayOfGatewayDetail() {
        return new ArrayOfGatewayDetail();
    }

    /**
     * Create an instance of {@link GatewayDetail }
     * 
     */
    public GatewayDetail createGatewayDetail() {
        return new GatewayDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OmnibeesCredentials }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OmnibeesCredentials }{@code >}
     */
    @XmlElementDecl(namespace = "http://connectors.omnibees.com/", name = "OmnibeesCredentials")
    public JAXBElement<OmnibeesCredentials> createOmnibeesCredentials(OmnibeesCredentials value) {
        return new JAXBElement<OmnibeesCredentials>(_OmnibeesCredentials_QNAME, OmnibeesCredentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelsRQ }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChannelsRQ }{@code >}
     */
    @XmlElementDecl(namespace = "http://connectors.omnibees.com/", name = "ChannelsRQ")
    public JAXBElement<ChannelsRQ> createChannelsRQ(ChannelsRQ value) {
        return new JAXBElement<ChannelsRQ>(_ChannelsRQ_QNAME, ChannelsRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelsRS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChannelsRS }{@code >}
     */
    @XmlElementDecl(namespace = "http://connectors.omnibees.com/", name = "ChannelsRS")
    public JAXBElement<ChannelsRS> createChannelsRS(ChannelsRS value) {
        return new JAXBElement<ChannelsRS>(_ChannelsRS_QNAME, ChannelsRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentGatewayDetailRQ }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentGatewayDetailRQ }{@code >}
     */
    @XmlElementDecl(namespace = "http://connectors.omnibees.com/", name = "PaymentGatewayDetailRQ")
    public JAXBElement<PaymentGatewayDetailRQ> createPaymentGatewayDetailRQ(PaymentGatewayDetailRQ value) {
        return new JAXBElement<PaymentGatewayDetailRQ>(_PaymentGatewayDetailRQ_QNAME, PaymentGatewayDetailRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentGatewayDetailRS }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentGatewayDetailRS }{@code >}
     */
    @XmlElementDecl(namespace = "http://connectors.omnibees.com/", name = "PaymentGatewayDetailRS")
    public JAXBElement<PaymentGatewayDetailRS> createPaymentGatewayDetailRS(PaymentGatewayDetailRS value) {
        return new JAXBElement<PaymentGatewayDetailRS>(_PaymentGatewayDetailRS_QNAME, PaymentGatewayDetailRS.class, null, value);
    }

}

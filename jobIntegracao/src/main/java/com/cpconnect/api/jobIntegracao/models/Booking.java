package com.cpconnect.api.jobIntegracao.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Booking {

    @JsonProperty("bookingId")
    private int bookingId;
    @JsonProperty("bookingPMSId")
    private String bookingPMSId;
    @JsonProperty("alphaId")
    private String alphaId;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("roomTypePMSId")
    private String roomTypePMSId;
    @JsonProperty("rules")
    private Rules rules;
    @JsonProperty("rates")
    private List<Rates> rates;
    @JsonProperty("payments")
    private Payments payments;
    @JsonProperty("guests")
    private List<Guests> guests;
    @JsonProperty("total")
    private Total total;
    @JsonProperty("status")
    private String status;
    @JsonProperty("source")
    private String source;
    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("requestor")
    private Requestor requestor;
    @JsonProperty("channelReservationNumber")
    private String channelReservationNumber;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("locator")
    private String locator;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("confirmation")
    private String confirmation;
    @JsonProperty("property")
    private Property property;
    @JsonProperty("lastModified")
    private String lastModified;
    @JsonProperty("created")
    private String created;
    @JsonProperty("guestCounts")
    private List<GuestCounts> guestCounts;

    public Booking(int bookingId, String bookingPMSId, String alphaId, String startDate, String endDate, String roomTypePMSId, Rules rules, List<Rates> rates, Payments payments, List<Guests> guests, Total total, String status, String source, Customer customer, Requestor requestor, String channelReservationNumber, String channel, String locator, String comments, String confirmation, Property property, String lastModified, String created, List<GuestCounts> guestCounts) {
        this.bookingId = bookingId;
        this.bookingPMSId = bookingPMSId;
        this.alphaId = alphaId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomTypePMSId = roomTypePMSId;
        this.rules = rules;
        this.rates = rates;
        this.payments = payments;
        this.guests = guests;
        this.total = total;
        this.status = status;
        this.source = source;
        this.customer = customer;
        this.requestor = requestor;
        this.channelReservationNumber = channelReservationNumber;
        this.channel = channel;
        this.locator = locator;
        this.comments = comments;
        this.confirmation = confirmation;
        this.property = property;
        this.lastModified = lastModified;
        this.created = created;
        this.guestCounts = guestCounts;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingPMSId() {
        return bookingPMSId;
    }

    public void setBookingPMSId(String bookingPMSId) {
        this.bookingPMSId = bookingPMSId;
    }

    public String getAlphaId() {
        return alphaId;
    }

    public void setAlphaId(String alphaId) {
        this.alphaId = alphaId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRoomTypePMSId() {
        return roomTypePMSId;
    }

    public void setRoomTypePMSId(String roomTypePMSId) {
        this.roomTypePMSId = roomTypePMSId;
    }

    public Rules getRules() {
        return rules;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    public List<Rates> getRates() {
        return rates;
    }

    public void setRates(List<Rates> rates) {
        this.rates = rates;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }

    public List<Guests> getGuests() {
        return guests;
    }

    public void setGuests(List<Guests> guests) {
        this.guests = guests;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Requestor getRequestor() {
        return requestor;
    }

    public void setRequestor(Requestor requestor) {
        this.requestor = requestor;
    }

    public String getChannelReservationNumber() {
        return channelReservationNumber;
    }

    public void setChannelReservationNumber(String channelReservationNumber) {
        this.channelReservationNumber = channelReservationNumber;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public List<GuestCounts> getGuestCounts() {
        return guestCounts;
    }

    public void setGuestCounts(List<GuestCounts> guestCounts) {
        this.guestCounts = guestCounts;
    }
}

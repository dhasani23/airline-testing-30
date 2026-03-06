package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reservation {
    private long bookingReference;
    private int passengerId;
    private int flightId;
    private String reservationDate;
    private String reservationTime;
    private String reservationStatus;
    private String travelClass;
    private double ticketPrice;
    private String currencyCode;
    private String paymentStatus;
    private String paymentMode;
    private String contactNumber;
    private String contactEmail;

    //Create a tostring method to convert the object to string
    @Override
    public String toString() {
        return "Reservation{" +
                "bookingReference=" + bookingReference +
                ", passengerId=" + passengerId +
                ", flightId=" + flightId +
                ", reservationDate='" + reservationDate + '\'' +
                ", reservationTime='" + reservationTime + '\'' +
                ", reservationStatus='" + reservationStatus + '\'' +
                ", travelClass='" + travelClass + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", currencyCode='" + currencyCode + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }
    //Create a toJson method to convert the object to Json String
    public String toJson() {
        return "{" +
                "\"bookingReference\":" + bookingReference +
                ", \"passengerId\":" + passengerId +
                ", \"flightId\":" + flightId +
                ", \"reservationDate\":\"" + reservationDate + '\"' +
                ", \"reservationTime\":\"" + reservationTime + '\"' +
                ", \"reservationStatus\":\"" + reservationStatus + '\"' +
                ", \"travelClass\":\"" + travelClass + '\"' +
                ", \"ticketPrice\":" + ticketPrice +
                ", \"currencyCode\":\"" + currencyCode + '\"' +
                ", \"paymentStatus\":\"" + paymentStatus + '\"' +
                ", \"paymentMode\":\"" + paymentMode + '\"' +
                ", \"contactNumber\":\"" + contactNumber + '\"' +
                ", \"contactEmail\":\"" + contactEmail + '\"' +
                '}';
    }

}

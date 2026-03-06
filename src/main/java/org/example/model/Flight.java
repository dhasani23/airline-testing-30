package org.example.model;


import lombok.Getter;
import lombok.Setter;


/* Create an Entity class Flight mapped to database table flight with following attributes:
 id as id, departureDate, departureTime, departureAirportCode,
 arrivalDate, arrivalTime, arrivalAirportCode,  flightNumber, flightDuration,
 ticketPrice as double, ticketCurrency,seatCapacity as int and seatAvailable as int,
 They should be mapped to database columns with _as separator */

@Getter
@Setter
public class Flight {

    private int id;
    private String departureDate;
    private String departureTime;
    private String departureAirportCode;
    private String arrivalDate;
    private String arrivalTime;
    private String arrivalAirportCode;
    private String flightNumber;
    private String flightDuration;
    private double ticketPrice;
    private String ticketCurrency;
    private int seatCapacity;
    private int seatAvailable;



    //Create a tostring method to convert attributes to string
    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureDate='" + departureDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", departureAirportCode='" + departureAirportCode + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", arrivalAirportCode='" + arrivalAirportCode + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightDuration='" + flightDuration + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", ticketCurrency='" + ticketCurrency + '\'' +
                ", seatCapacity=" + seatCapacity +
                ", seatAvailable=" + seatAvailable +
                '}';
    }
    //Create a toJson method to convert the attributes to Json String
    public String toJson() {
        return "{" +
                "\"id\":" + id +
                ", \"departureDate\":\"" + departureDate + '\"' +
                ", \"departureTime\":\"" + departureTime + '\"' +
                ", \"departureAirportCode\":\"" + departureAirportCode + '\"' +
                ", \"arrivalDate\":\"" + arrivalDate + '\"' +
                ", \"arrivalTime\":\"" + arrivalTime + '\"' +
                ", \"arrivalAirportCode\":\"" + arrivalAirportCode + '\"' +
                ", \"flightNumber\":\"" + flightNumber + '\"' +
                ", \"flightDuration\":\"" + flightDuration + '\"' +
                ", \"ticketPrice\":" + ticketPrice +
                ", \"ticketCurrency\":\"" + ticketCurrency + '\"' +
                ", \"seatCapacity\":" + seatCapacity +
                ", \"seatAvailable\":" + seatAvailable +
                '}';
    }
}


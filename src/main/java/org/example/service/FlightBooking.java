package org.example.service;

import org.example.exception.FlightNotFoundException;
import org.example.exception.RequestedSeatsNotAvailable;
import org.example.model.Passenger;
import org.example.model.Reservation;
import org.example.repository.FlightRepository;
import org.example.repository.PassengerRepository;
import org.example.repository.ReservationRepository;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import software.amazon.awssdk.services.sns.model.PublishResponse;

@Service
public class FlightBooking {

    private final PassengerRepository passengerRepository;
    private final ReservationRepository reservationRepository;  
    private final FlightRepository flightRepository;

    public FlightBooking(PassengerRepository passengerRepository, ReservationRepository reservationRepository, FlightRepository flightRepository) {
        this.passengerRepository = passengerRepository;
        this.reservationRepository = reservationRepository;
        this.flightRepository = flightRepository;
    }

    /* create a method send message with sns arn and AWS Region as input parameter*/
    public void sendMessage(String message, String arn, Region region) {
        SnsClient snsClient = SnsClient.builder()
                .region(region)
                .build();

        PublishRequest request = PublishRequest.builder()
                .message(message)
                .topicArn(arn)
                .build();

        PublishResponse result = snsClient.publish(request);
        System.out.println(result.messageId() + " Message sent. Status is " + result.sdkHttpResponse().statusCode());
        snsClient.close();


    }

    public Boolean reserveFlight(Passenger passenger, Reservation reservation,
                                 PassengerRepository passengerRepository, ReservationRepository reservationRepository, FlightRepository flightRepository,
                                 int numberOfPassengers, String topicArn, Region region) throws FlightNotFoundException, RequestedSeatsNotAvailable {
        //add logic to reserve flight
        return null;
    }


}


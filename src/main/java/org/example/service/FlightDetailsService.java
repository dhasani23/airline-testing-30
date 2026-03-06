package org.example.service;

import org.example.dto.FlightDetails;
import org.example.model.Airport;
import org.example.model.Flight;
import org.example.repository.AirportRepository;
import org.example.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightDetailsService {

    private final FlightRepository flightRepository;
    private final AirportRepository airportRepository;

    public FlightDetailsService(FlightRepository flightRepository, AirportRepository airportRepository) {
        this.flightRepository = flightRepository;
        this.airportRepository = airportRepository;
    }

    /* Create private method populateFlightDetails method which takes flight, arrival airport and departure airport
   as input parameters and returns flightDetails object. */
    private FlightDetails populateFlightDetails(Flight flight, Airport arrivalAirport, Airport departureAirport) {
        /* Match and Assign all the attributes from flight, arrivalAirport and departureAirport object
    to flightDetails object. */
        FlightDetails flightDetails = new FlightDetails();
        flightDetails.setFlightId(flight.getId());
        flightDetails.setDepartureDate(flight.getDepartureDate());
        flightDetails.setDepartureTime(flight.getDepartureTime());
        flightDetails.setArrivalDate(flight.getArrivalDate());
        flightDetails.setArrivalTime(flight.getArrivalTime());
        flightDetails.setArrivalAirportCode(arrivalAirport.getAirportCode());
        flightDetails.setArrivalAirportName(arrivalAirport.getAirportName());
        flightDetails.setArrivalAirportCity(arrivalAirport.getAirportCity());
        flightDetails.setArrivalAirportLocale(arrivalAirport.getAirportLocale());
        flightDetails.setDepartureAirportCode(departureAirport.getAirportCode());
        flightDetails.setDepartureAirportName(departureAirport.getAirportName());
        flightDetails.setDepartureAirportCity(departureAirport.getAirportCity());
        flightDetails.setDepartureAirportLocale(departureAirport.getAirportLocale());
        flightDetails.setFlightDuration(flight.getFlightDuration());
        flightDetails.setTicketPrice(flight.getTicketPrice());
        flightDetails.setTicketCurrency(flight.getTicketCurrency());
        flightDetails.setSeatAvailable(flight.getSeatAvailable());
        flightDetails.setFlightNumber(flight.getFlightNumber());
        return flightDetails;
    }

    public List<FlightDetails> findFlights(String departureDate, String departureAirportCode,
                                           String arrivalAirportCode, FlightRepository flightRepository,
                                           AirportRepository airportRepository) {
        System.out.println("findFlights");
        return null;
    }

    // rest of the code
}


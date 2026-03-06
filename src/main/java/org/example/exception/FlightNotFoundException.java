package org.example.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/*
Create a public class FlightNotFoundException that extends Runtime Exception with member variable
response entity.
Create constructor with flightId as input parameter
Exception message returned should be "No flights found for the flight id " and append flight id
*/
@Getter
public class FlightNotFoundException extends RuntimeException {
    private ResponseEntity<String> responseEntity;

    public FlightNotFoundException(int flightId) {
        responseEntity = new ResponseEntity<>("No flights found for the flight id " + flightId, HttpStatus.NOT_FOUND);
    }
}

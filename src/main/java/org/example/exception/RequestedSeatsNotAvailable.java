package org.example.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/*
Create a public class RequestedSeatsNotAvailable that extends Runtime Exception with member variable
response entity, constructor has no arguments
exception message returned should be "Seats not available. Reservation could not be made"
*/
@Getter
public class RequestedSeatsNotAvailable extends RuntimeException {
    private ResponseEntity<String> responseEntity;

    public RequestedSeatsNotAvailable() {
        responseEntity = new ResponseEntity<>("Seats not available. Reservation could not be made", HttpStatus.NOT_FOUND);
    }
}



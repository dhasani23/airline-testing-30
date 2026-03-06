package org.example.controller;

import org.example.Main;
import org.example.service.FlightBooking;
import org.example.dto.FlightDetails;
import org.example.dto.ReservationDetails;
import org.example.repository.AirportRepository;
import org.example.repository.FlightRepository;
import org.example.repository.PassengerRepository;
import org.example.repository.ReservationRepository;
import org.example.service.FlightBooking;
import org.example.service.FlightDetailsService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collections;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Main.class)
@AutoConfigureMockMvc
public class FlightReservationTest {
    @Mock
    private FlightRepository flightRepository;
    @Mock  
    private AirportRepository airportRepository;
    @MockBean
    private FlightDetailsService flightDetailsService;
    @Mock
    private PassengerRepository passengerRepository;
    @Mock
    private ReservationRepository reservationRepository; 
    @Mock
    private FlightBooking flightBooking;

    @Spy
    @InjectMocks
    private FlightReservation flightReservation;
    
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testGetFlightDetails() throws Exception {
        // TODO: Implement test case as per requirements
        String departureDate = "2023-06-01";
        String departureAirportCode = "JFK";
        String arrivalAirportCode = "LHR";
        String authorization = "Bearer token test";
        String cognitoUserPoolId = "test";
        String awsRegion = "test";
        FlightDetails flightDetails = new FlightDetails();
        flightDetails.setFlightNumber("ABC123");
        flightDetails.setDepartureAirportCode(departureAirportCode);
        flightDetails.setArrivalAirportCode(arrivalAirportCode);
        flightDetails.setDepartureTime("10:00 AM");
        flightDetails.setArrivalTime("3:00 PM");
        doReturn(true).when(flightReservation).verifyToken(cognitoUserPoolId, awsRegion, authorization);
        when(flightDetailsService.findFlights(departureDate, departureAirportCode, arrivalAirportCode, null, null)).thenReturn(Collections.singletonList(flightDetails));
        mockMvc.perform(MockMvcRequestBuilders.get("/flight")
                        .param("departureDate", departureDate)
                        .param("departureAirportCode", departureAirportCode)
                        .param("arrivalAirportCode", arrivalAirportCode)
                        .header("Authorization", authorization))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}

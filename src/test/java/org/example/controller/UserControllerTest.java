package org.example.controller;

import org.example.Main;
import org.example.dataobject.UserDetails;
import org.example.repository.AirportRepository;
import org.example.repository.FlightRepository;
import org.example.repository.PassengerRepository;
import org.example.repository.ReservationRepository;
import org.example.service.FlightBooking;
import org.example.service.FlightDetailsService;
import org.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Main.class)
@AutoConfigureMockMvc
public class UserControllerTest {
    @Mock
    private AirportRepository airportRepository;
    private FlightRepository flightRepository;

    @Mock
    private FlightDetailsService flightDetailsService;
    @Mock
    private PassengerRepository passengerRepository;
    @Mock  
    private ReservationRepository reservationRepository;
    @Mock
    private FlightBooking flightBooking;
    @Mock
    private UserService userService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetUserDetails() throws Exception {

        UserDetails userDetails = new UserDetails();
        userDetails.setUserName("Dinesh");
        when(userService.getUser()).thenReturn(userDetails);

        mockMvc.perform(MockMvcRequestBuilders.get("/user"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.userName").value("Dinesh"));
    }


}

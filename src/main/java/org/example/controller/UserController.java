package org.example.controller;

import org.example.dataobject.UserDetails;
import org.example.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Date;

@RestController
@Validated
public class UserController {

    private static final Logger LOGGER = LogManager.getLogger(UserController.class);

    @GetMapping("/user")
    public UserDetails getUserDetails() {
        LOGGER.info("Received request to get user details");
        return userService.getUser();
    }

    //generate post method to update user id
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public String updateUserId(@Valid @RequestBody UserDetails userDetails) {
        LOGGER.info("Received request to update user id to {}", userDetails.toString());
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        LOGGER.info("Current date and time is {}", dayOfMonth);
        return userService.updateUserId(userDetails);
    }



    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


}

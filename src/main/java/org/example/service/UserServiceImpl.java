package org.example.service;

import org.example.dataobject.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDetails getUser() {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId("1");
        userDetails.setUserName("Dinesh");
        userDetails.setAge("35");
        userDetails.setEmail("dbalaaji@amazon.com");
        return userDetails;
    }

    @Override
    public String updateUserId(UserDetails userDetails) {
        //logic to udpate user id
        return "done";
    }
}

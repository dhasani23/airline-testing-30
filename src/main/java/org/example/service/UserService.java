package org.example.service;

import org.example.dataobject.UserDetails;

public interface UserService {
    UserDetails getUser();

    String updateUserId(UserDetails userDetails);
}

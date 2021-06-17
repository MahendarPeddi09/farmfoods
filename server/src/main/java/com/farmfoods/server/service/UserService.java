package com.farmfoods.server.service;

import com.farmfoods.server.model.User;

public interface UserService {
    User getUserById(Long id);
    User getUserByUserId(String userId);
    User getUserByPhoneNo(String phoneNo);
    User getUserByEmail(String email);


}

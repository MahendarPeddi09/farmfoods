package com.farmfoods.server.service.impl;

import com.farmfoods.server.model.User;
import com.farmfoods.server.repository.UserRepository;
import com.farmfoods.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User getUserByUserId(String userId) {
        return null;
    }

    @Override
    public User getUserByPhoneNo(String phoneNo) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }
}

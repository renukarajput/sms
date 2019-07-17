package com.management.service;

import com.management.entity.User;
import com.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void add(User user) {
        if (user != null)
            userRepository.save(user);
    }
}

package com.example.mongodb.user.service;

import com.example.mongodb.user.model.User;
import com.example.mongodb.user.model.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void createUser(User user){
        userRepository.insert(user);
    }


}

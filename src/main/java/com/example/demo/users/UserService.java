package com.example.demo.users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void addUser(User user){
        if (userRepository.findUserByEmail(user.getEmail()).isEmpty())
            userRepository.save(user);
    }
}

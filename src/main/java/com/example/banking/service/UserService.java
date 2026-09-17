package com.example.banking.service;

import com.example.banking.model.User;
import com.example.banking.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void replaceUser(int userid, User newUser) {
        if (userRepository.existsById(userid)) {
            User oldUser = userRepository.findById(userid).get();

            oldUser.setUsername(newUser.getUsername());

            userRepository.save(oldUser);
        }
    }

    public void removeUser(int userid) {
        userRepository.deleteById(userid);
    }
}
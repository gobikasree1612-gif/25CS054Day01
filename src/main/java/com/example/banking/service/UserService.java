package com.example.banking.service;
import com.example.banking.model.User;
import com.example.banking.repository.UserRepository;
import java.util.List;
public class UserService {
    private UserRepository userRepository = new UserRepository();
    public List<User>getAllUsers(){
        return userRepository.getAllUsers();
    }
    public void addUser(User user){
        userRepository.addUser(user);
    }
    public void replaceUser(int userid,User newUser){
        userRepository.replaceUser(userid,newUser);
    }
    public void removeUser(int userid){
        userRepository.removeUser(userid);
    }
}

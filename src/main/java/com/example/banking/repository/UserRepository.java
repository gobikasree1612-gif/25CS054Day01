package com.example.banking.repository;
import com.example.banking.model.User;
import java.util.ArrayList;
import java.util.List;
public class UserRepository {
    private List<User> users=new ArrayList<>();
    public List<User> getAllUsers(){
        return users;
    }
    public void addUser(User user){
        users.add(user);
    }
    public void replaceUser(int userid,User newUser){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUserid()==userid){
                users.set(i,newUser);
                return;
            }
        }
    }
    public void removeUser(int userid){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getUserid()==userid){
                users.remove(i);
                return;
            }
        }
    }
}

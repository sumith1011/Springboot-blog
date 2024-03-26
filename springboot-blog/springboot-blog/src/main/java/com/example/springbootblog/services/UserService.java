package com.example.springbootblog.services;


import com.example.springbootblog.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getUsers();
    public User getUserById(long userId);
    User addUser(User user);
    public User updateUser(long userId, User userDetails);
    boolean deleteUser(long userId);



    void deleteAllUsers();

}
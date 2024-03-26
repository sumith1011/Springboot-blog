package com.example.springbootblog.services;

import com.example.springbootblog.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    List<User> userList;
    public UserServiceImpl(){
        userList= new ArrayList<>();
        userList.add(new User(1,"Smith",24,"Smith@gmail"));
        userList.add(new User(2,"Sumith",24,"Sumith@gmail"));
        userList.add(new User(3,"John",24,"John@gmail"));

    }
    @Override
    public List<User> getUsers() {
        return userList;
    }

    @Override
    public User getUserById(long userId) {
        User user = null;
        for(User u:userList){
            if(u.getUserId()==userId){
                user = u;
                break;
            }
        }
        return user;
    }

    @Override
    public User updateUser(long userId, User userDetails) {
        for (User user : userList) {
            if (user.getUserId() == userId) {
                user.setName(userDetails.getName());
                user.setAge(userDetails.getAge());
                user.setMailId(userDetails.getMailId());

                return user;
            }
        }
        return null;
    }

    @Override
    public User addUser(User user) {
        userList.add(user);
        return user;
    }
    @Override
    public void deleteAllUsers() {
        userList.clear();
    }

    @Override
    public boolean deleteUser(long userId) {
        return userList.removeIf(user -> user.getUserId() == userId);
    }
}
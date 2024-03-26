package com.example.springbootblog.model;

import org.springframework.stereotype.Component;

@Component
public class User {

    private long userId;
    private String name;
    private int age;

    private String mailId;

    public User(long userId, String name, int age, String mailId) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.mailId = mailId;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mailId='" + mailId + '\'' +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }




}
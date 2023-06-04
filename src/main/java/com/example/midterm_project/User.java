package com.example.midterm_project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String username;
    private String fullName;
    private String password;
    private String emailAddress;
    private int phoneNumber;
    private String country;
    private String birthDate;
    private Date joinAt;
    private List<Tweet> tweets;
    // Other user-related properties and methods

    public User(String username,String fullName, String password,String emailAddress,int phoneNumber,String country,String birthDate) {
        this.username = username;
        this.fullName = fullName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.birthDate = birthDate;
        this.joinAt = new Date();
        this.tweets = new ArrayList<>();
    }

    public void addTweet(Tweet tweet) {
        this.tweets.add(tweet);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCountry() {
        return country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getJoinAt() {
        return joinAt;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}

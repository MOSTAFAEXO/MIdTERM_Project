package com.example.midterm_project;

import java.util.Date;

public class Tweet {
    private String text;
    private User author;
    private Date createdAt;
    private int likes;
    private int views;
    // Other tweet-related properties and methods

    public Tweet(String text, User author) {
        this.text = text;
        this.author = author;
        this.createdAt = new Date();
        this.likes = 0;
        this.views = 0;
    }
    public void addLike() {
        this.likes++;
    }

    public void addView() {
        this.views++;
    }


    // Getters and setters for the properties
}

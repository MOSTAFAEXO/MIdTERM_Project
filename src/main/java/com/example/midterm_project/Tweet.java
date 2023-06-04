package com.example.midterm_project;

import java.util.Date;

public class Tweet {
    private String text;
    private User author;
    private Date createdAt;
    private int likes;
    private int views;
    private int reTweet;
    private boolean favStar;
    // Other tweet-related properties and methods

    public Tweet(String text, User author) {
        if (text.length()>=280)
            System.err.println("too long tweet");
        else{
            this.text = text;
            this.author = author;
            this.createdAt = new Date();
            this.likes = 0;
            this.views = 0;
            this.favStar = false;
        }
    }
    public Tweet(String text, User author,String picture) {        // tweet with picture
        if (text.length()>=280)
            System.err.println("too long tweet");
        else{
            this.text = text;
            this.author = author;
            this.createdAt = new Date();
            this.likes = 0;
            this.views = 0;
            this.favStar = false;
        }
        // set the picture
    }

    public void addLike() {
        this.likes++;
    }

    public void addView() {
        this.views++;
    }
    public void addReTweet(){
        this.reTweet++;
    }

    public int getLikes() {
        return likes;
    }

    public int getViews() {
        return views;
    }

    public int getReTweet() {
        return reTweet;
    }
    public void checkFavStar(){
        if(likes>=10)
            favStar = true;
    }

    // Getters and setters for the properties
}

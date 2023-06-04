package com.example.midterm_project;
import java.util.*;
public class Twitter {
        private List<User> users;
        private List<Tweet> tweets;

        public Twitter() {
            this.users = new ArrayList<>();
            this.tweets = new ArrayList<>();
        }

        public User signUp(String username,String fullName, String password,String emailAddress,int phoneNumber,String country,String birthDate) {   /* unique username and email and phone number */
            User user = new User(username,fullName ,password,emailAddress,phoneNumber,country,birthDate);
            this.users.add(user);
            return user;
        }

        public User logIn(String username, String password) {
            for (User user : this.users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return user;
                }
            }
            return null;
        }

        public Tweet postTweet(User author, String text) {
            Tweet tweet = new Tweet(text, author);
            this.tweets.add(tweet);
            author.addTweet(tweet);
            return tweet;
        }

    public List<Tweet> getPopularTweetsByLikes(int limit) {
        List<Tweet> sortedTweets = new ArrayList<>(this.tweets);
        sortedTweets.sort(Comparator.comparingInt(Tweet::getLikes).reversed());
        return sortedTweets.subList(0, Math.min(limit, sortedTweets.size()));
    }

    public List<Tweet> getPopularTweetsByViews(int limit) {
        List<Tweet> sortedTweets = new ArrayList<>(this.tweets);
        sortedTweets.sort(Comparator.comparingInt(Tweet::getViews).reversed());
        return sortedTweets.subList(0, Math.min(limit, sortedTweets.size()));
    }
}



        // Other methods for interacting with the platform, such as following users, searching for tweets, etc.
}


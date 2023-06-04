
import java.util.*;
public class Twitter {
        private List<User> users;
        private List<Tweet> tweets;

        public Twitter() {
            this.users = new ArrayList<>();
            this.tweets = new ArrayList<>();
        }

        public User signUp(String username,String fullName, String password,String emailAddress,int phoneNumber,String country,String birthDate) {

            for (User i:users) {
                if(!username.equals(i.getUsername())){
                    if (!emailAddress.equals(i.getEmailAddress())){
                        if(phoneNumber!=i.getPhoneNumber()){
                            System.err.println("You are successfully signed up.Welcome! ");
                        }
                    }
                }
                else(){
                    System.err.println("username or phonenumber or email is already used,try again.");
                }

            }

                // if ( unique phone )

            User user = new User(username,fullName ,password,emailAddress,phoneNumber,country,birthDate);
            this.users.add(user);
            return user;
        }

        public User logIn(String username, String password) {    /// error for wrong password
            for (User user: this.users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    System.err.println("welcome again friend");
                } else if (!user.getPassword().equals(password)) {
                    System.err.println("password is incorrect!your access is denied");
                }
                else(){
                    System.err.println("access denied");
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


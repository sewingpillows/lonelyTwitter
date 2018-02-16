package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by boukall on 2/16/18.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet){
        if (this.hasTweet(tweet) == true){
            throw new  IllegalArgumentException("Duplicate tweet - cannot be added");
        }
        tweets.add(tweet);

    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public int getCount(){
        return tweets.size();
    }

    public  ArrayList<Tweet> getTweets(){
        return tweets;
    }
}

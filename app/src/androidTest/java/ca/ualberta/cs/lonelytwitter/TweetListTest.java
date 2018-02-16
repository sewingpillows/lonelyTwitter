package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by boukall on 2/16/18.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }


    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

    }
    // test for addTweet() -- should throw an IllegalArgumentException when one tries to add a duplicate tweet
    // referenced from https://stackoverflow.com/questions/10148101/junit-testing-assertequals-for-exception
    public void testAddTweetDuplicate(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding tweet");
        tweets.add(tweet);

        try {
            tweets.add(tweet);
            Assert.fail("Duplicate test failed - Duplicate tweet added");
        }
        catch(Exception e){
            String mess= "Duplicate tweet - cannot be added";
            Assert.assertEquals( "Duplicate test passed", mess, e.getMessage() );
        }



    }

    //test for hasTweet() -- should return true if there is a tweet that equals() another tweet
    // from what we did in lab, and I added an extra test for false if list size>1
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding tweet");
        assertFalse(tweets.hasTweet(tweet));

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        //for list size >1
        Tweet tweet2 = new NormalTweet("Adding tweet2");
        assertFalse(tweets.hasTweet(tweet2));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding tweet");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getDate(), tweet.getDate());

    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Adding tweet");
        tweets.add(tweet);

        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }


    // test for getTweets() -- sould return a list of tweets in chronological order
    public void testgetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("Tweet text1");
        Tweet tweet2 = new NormalTweet("Tweet text2");
        Tweet tweet3 = new NormalTweet("Tweet text3");
        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);

        ArrayList<Tweet> tweets2 = new ArrayList<Tweet>(Arrays.asList(tweet1, tweet2, tweet3));

        assertEquals(tweets.getTweets(), tweets2);

    }


    //test for equal message in tweet to test
    public void hasTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet1 = new NormalTweet("Tweet text1");
        Tweet tweet1cp = new NormalTweet("Tweet text1");
        Tweet tweet2 = new NormalTweet("Tweet text2");

        tweets.add(tweet1);

    }
    // test for getCount() -- should accurately count up the tweets
    public void testgetCount() {
        TweetList tweets = new TweetList();
        //test1 - 0 size
        assertEquals(tweets.getCount(), 0);

        //test2 - 1 size
        Tweet tweet1 = new NormalTweet("Adding tweet1");
        tweets.add(tweet1);
        assertEquals(tweets.getCount(), 1);

        //test3 - 2 size
        Tweet tweet2 = new NormalTweet("Adding tweet2");
        tweets.add(tweet2);
        assertEquals(tweets.getCount(), 2);

        //test3 - decrement size
        tweets.delete(tweet1);
        assertEquals(tweets.getCount(), 1);

    }
}

/*
 * Copyright (c) 2018. CMPT 301 - yeah!
 * You many use and distribute. Any question contact email@email.com
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by boukall on 1/17/18.
 */

/**
 * Represents a Tweet
 * @author boukall
 * @version 1.5
 * @see NormalTweet
 *
 */
public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();

    /**
     *
     * @param text tweet message
     *
     */
    public Tweet(String text){
        this.message = text;
        this.date = new Date(System.currentTimeMillis());
    }

    /**
     * @param text tweet message
     *
     *
     */
    public Tweet(String text, Date date){
        this.message = text;
        this.date = date;
    }

    /**
     *
     * @param mood a mood object added to moodList
     */
    public void addMood(Mood mood){
      moodList.add(mood);
          }

    /**
     *
     * @return an ArrayList<Mood> of moods associated with this tweet
     */
   public ArrayList<Mood> getMoods(){
               return this.moodList;
         }

    /**
     *
     * @return date - the date the tweet was created
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date this will change the date of the tweet
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     *
     * @return this returns the tweet message
     */
    public String getMessage(){
        return message;
    }

    /**
     *
     * @param message the message to create the tweet
     * @throws TweetTooLongException - tweet must be less than 160 characters
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 160) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     *
     * @return the message associated with the tweet object
     */
    @Override
    public String toString(){
        return message;
    }

    /**
     *
     * @return a boolean value of if the tweet is important or not
     */
    public abstract boolean isImportant();
}

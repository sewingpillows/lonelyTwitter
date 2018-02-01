/*
 * Copyright (c) 2018. CMPT 301 - yeah!
 * You many use and distribute. Any question contact email@email.com
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a a Normal Tweet
 * @author boukall
 * @version 1.5
 * @see Tweet
 *
 */


public class NormalTweet extends Tweet {

    /**
     *
     * @param text - the string to be set with the tweet
     */
        NormalTweet(String text){
            super(text);
        }

    /**
     *
     * @param message - string message to be associated with the tweet
     * @param date - date object to be associated with the tweet
     */
    NormalTweet(String message, Date date){
        super(message,date);
    }

    /**
     *
     * @return a boolean of if the tweet is important - Will return false.
     */
    @Override
    public boolean isImportant(){
        return false;
    }
}


/*
 * Copyright (c) 2018. CMPT 301 - yeah!
 * You many use and distribute. Any question contact email@email.com
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a Madmood
 * @author boukall
 * @version 1.5
 * @see Mood
 *
 */
public class MadMood extends Mood {

    /**
     * Create a mood object, date will be set to the current date
     */
    public MadMood(){
        super();
    }

    /**
     * Constructs a mood object with date set by user
     * @param date Date tweet was created
     *
     */
    public MadMood(Date date ){
        super(date);
    }

    /**
     * This returns a string representing the mood
     * @return string message of 'I am mad'
     */
    @Override
    public String getMood(){
        return "I am mad";
    }
}


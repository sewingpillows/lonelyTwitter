package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a SadMood
 * @author boukall
 * @version 1.5
 * @see Mood
 *
 */
public class SadMood extends Mood {

    /**
     * Create a mood object with date set by the current date
     */
    public SadMood(){
        super();
    }

    /**
     * Constructs a mood object with date set by user
     * @param date Date tweet was created
     *
     */
    public SadMood(Date date ){
        super(date);
    }

    /**
     * This returns a string representing the mood
     * @return string message of 'I am sad'
     */
    public String getMood(){
        return "I am sad";
    }
}

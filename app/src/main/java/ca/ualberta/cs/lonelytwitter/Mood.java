/*
 * Copyright (c) 2018. CMPT 301 - yeah!
 * You many use and distribute. Any question contact email@email.com
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a Abstract class of Mood
 * @author boukall
 * @version 1.5
 * @see MadMood
 * @see SadMood
 *
 */
public abstract class Mood {

    private Date date;

    /**
     * Sets the private attribute using the current date
     */
    public Mood(){
        this.date = new Date(System.currentTimeMillis());
    }

    /**
     * Uses the parameter to see the date attribute
     * @param date - the  date passed into the system
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     *
     * @return date - the date associated with the mood
     */
    public Date getDate() {
        return date;
    }

    /**
     * This allows the user to change the date of the mood
     * @param date date to be set to the mood
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     *
     * @return a string set in the inherited sub mood classes
     */
    public abstract String getMood();

}

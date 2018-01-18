package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by boukall on 1/17/18.
 */

public class Madmood extends Tweet {
    public Madmood(String message){
        super(message);
    }

    public Madmood(String message, Date date ){
        super(message, date);
    }


    public String getMood(){
        return "I am mad";
    }
}


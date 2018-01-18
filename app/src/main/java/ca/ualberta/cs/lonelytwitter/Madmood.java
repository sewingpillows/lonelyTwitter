package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by boukall on 1/17/18.
 */

public class Madmood extends Mood {
    public Madmood(){
        super();
    }

    public Madmood(Date date ){
        super(date);
    }


    public String getMood(){
        return "I am mad";
    }
}


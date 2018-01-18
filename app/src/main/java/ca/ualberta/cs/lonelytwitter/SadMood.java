package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by boukall on 1/17/18.
 */

public class SadMood extends Tweet {
    public SadMood(String message){
        super(message);
    }

    public SadMood(String message, Date date ){
        super(message, date);
    }


    public String getMood(){
        return "I am sad";
    }
}

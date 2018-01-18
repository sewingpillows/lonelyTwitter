package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by boukall on 1/17/18.
 */

public class MadMood extends Mood {

    public MadMood(){
        super();
    }

    public MadMood(Date date){
        super(date);
    }

    @Override
    public String getMood(){
        return "I am mad";
    }
}


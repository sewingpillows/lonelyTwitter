package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by boukall on 1/17/18.
 */

public class SadMood extends Mood {
    public SadMood(){
        super();
    }

    public SadMood(Date date ){
        super(date);
    }

    @Override
    public String getMood(){
        return "I am sad";
    }
}

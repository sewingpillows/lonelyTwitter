package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by boukall on 1/17/18.
 */

public abstract class Tweet {
    private String message;
    private Date date;

    public Tweet(String text){
        this.message = text;
        this.date = new Date(System.currentTimeMillis());
    }

    public Tweet(String text, Date date){
        this.message = text;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage(){
        return message;
    }


}

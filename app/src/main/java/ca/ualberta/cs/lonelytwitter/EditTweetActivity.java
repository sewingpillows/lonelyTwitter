package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    private TextView tweetTextField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Tweet tweet = getTweet();
        tweetTextField = (TextView) findViewById(R.id.tweet);
        tweetTextField.setText(tweet.toString());

    }


    private Tweet getTweet() {
        Intent intent = getIntent();
        Tweet tweet = (Tweet) intent.getSerializableExtra("Tweet");
        return tweet;
    }
}

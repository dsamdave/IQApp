package com.example.android.iqapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(displayMessage.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.score_board_message);
        textView.setText(message);
    }
}

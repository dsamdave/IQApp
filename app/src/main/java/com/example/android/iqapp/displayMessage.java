package com.example.android.iqapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.message;

public class displayMessage extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.welcome_message);
        textView.setText(message);


    }









    public void submit(View view) {
        RadioButton oneA = (RadioButton) findViewById(R.id.one_a);
        RadioButton twoC = (RadioButton) findViewById(R.id.two_c);
        RadioButton threeB = (RadioButton) findViewById(R.id.three_b);



        LinearLayout one = (LinearLayout) findViewById(R.id.status_bar_1);
        LinearLayout two = (LinearLayout) findViewById(R.id.status_bar_2);
        LinearLayout three = (LinearLayout) findViewById(R.id.status_bar_3);



        ImageView right1 = (ImageView) findViewById(R.id.right1);
        ImageView wrong1 = (ImageView) findViewById(R.id.wrong1);
        ImageView right2 = (ImageView) findViewById(R.id.right2);
        ImageView wrong2 = (ImageView) findViewById(R.id.wrong2);
        ImageView right3 = (ImageView) findViewById(R.id.right3);
        ImageView wrong3 = (ImageView) findViewById(R.id.wrong3);



        if (oneA.isChecked()) {
            score += 5;
            right1.setVisibility(View.VISIBLE);
            wrong1.setVisibility(View.INVISIBLE);
            one.setBackgroundResource(R.drawable.correct_shape);
        } else {
            wrong1.setVisibility(View.VISIBLE);
            right1.setVisibility(View.INVISIBLE);
            one.setBackgroundResource(R.drawable.wrong_shape);
        }

        if (twoC.isChecked()) {
            score += 5;
            right2.setVisibility(View.VISIBLE);
            wrong2.setVisibility(View.INVISIBLE);
            two.setBackgroundResource(R.drawable.correct_shape);
        } else {
            wrong2.setVisibility(View.VISIBLE);
            right2.setVisibility(View.INVISIBLE);
            two.setBackgroundResource(R.drawable.wrong_shape);
        }

        if (threeB.isChecked()) {
            score += 5;
            right3.setVisibility(View.VISIBLE);
            wrong3.setVisibility(View.INVISIBLE);
            three.setBackgroundResource(R.drawable.correct_shape);
        } else {
            wrong3.setVisibility(View.VISIBLE);
            right3.setVisibility(View.INVISIBLE);
            three.setBackgroundResource(R.drawable.wrong_shape);
        }





        Toast.makeText(this, "You Scored: " + score + "Points",
                Toast.LENGTH_LONG).show();
        score = 0;

    }


    public void next(View v) {


        // TODO 1 create new Intent(context, class)
        // use the activity as context parameter
        // and "ResultActivity.class" for the class parameter

        // TODO 2 start second activity with
        // startActivity(intent);

        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Bold step, " + message);
        startActivity(intent);
    }




    public void reset(View v) {
        LinearLayout one = (LinearLayout) findViewById(R.id.status_bar_1);
        LinearLayout two = (LinearLayout) findViewById(R.id.status_bar_2);
        LinearLayout three = (LinearLayout) findViewById(R.id.status_bar_3);


        ImageView right1 = (ImageView) findViewById(R.id.right1);
        ImageView wrong1 = (ImageView) findViewById(R.id.wrong1);
        ImageView right2 = (ImageView) findViewById(R.id.right2);
        ImageView wrong2 = (ImageView) findViewById(R.id.wrong2);
        ImageView right3 = (ImageView) findViewById(R.id.right3);
        ImageView wrong3 = (ImageView) findViewById(R.id.wrong3);


        right1.setVisibility(View.INVISIBLE);
        wrong1.setVisibility(View.INVISIBLE);
        right2.setVisibility(View.INVISIBLE);
        wrong2.setVisibility(View.INVISIBLE);
        right3.setVisibility(View.INVISIBLE);
        wrong3.setVisibility(View.INVISIBLE);


        RadioGroup group1 = (RadioGroup) findViewById(R.id.radio_group_1);
        group1.clearCheck();
        RadioGroup group2 = (RadioGroup) findViewById(R.id.radio_group_2);
        group2.clearCheck();
        RadioGroup group3 = (RadioGroup) findViewById(R.id.radio_group_3);
        group3.clearCheck();
    }
}





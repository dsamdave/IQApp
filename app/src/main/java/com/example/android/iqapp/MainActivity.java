package com.example.android.iqapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void proceed(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        EditText sexField = (EditText) findViewById(R.id.sex_field);
        String sex = sexField.getText().toString();

        EditText ageField = (EditText) findViewById(R.id.age_field);
        String age = nameField.getText().toString();

        EditText occupationField = (EditText) findViewById(R.id.occupation_field);
        String occupation = nameField.getText().toString();

        // TODO 1 create new Intent(context, class)
        // use the activity as context parameter
        // and "ResultActivity.class" for the class parameter

        // TODO 2 start second activity with
        // startActivity(intent);

        Intent intent = new Intent(this, displayMessage.class);
        EditText editText = (EditText) findViewById(R.id.name_field);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, "Welcome, " + message);
        startActivity(intent);
    }
}

package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.text.SimpleDateFormat;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAME ="com.example.assignment1.NAME";
    public static final String EXTRA_NOUN ="com.example.assignment1.NOUN";
    public static final String EXTRA_EVENT ="com.example.assignment1.EVENT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnMakeClick(View view) {

        // do something when you click the button Make

        Intent intent = new Intent( this, DisplayResultsActivity.class);

        EditText nameText = (EditText) findViewById(R.id.editNameText);
        String name = nameText.getText().toString();
        intent.putExtra(EXTRA_NAME, name);

        //Noun Text
        EditText nounText = (EditText) findViewById(R.id.editNounText);
        String noun = nounText.getText().toString();
        intent.putExtra(EXTRA_NOUN, noun);

        // An Event Text
        EditText eventText = (EditText) findViewById(R.id.editEventText);
        String event = eventText.getText().toString();
        intent.putExtra(EXTRA_EVENT, event);


        startActivity(intent);



    }



    public void btnClearClick(View view) {

        ((EditText) findViewById(R.id.editNameText)).setText("");
        ((EditText) findViewById(R.id.editNounText)).setText("");
        ((EditText) findViewById(R.id.editEventText)).setText("");




    }



}
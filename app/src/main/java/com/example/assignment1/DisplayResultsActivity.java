package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DisplayResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_results);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        TextView dateText = findViewById(R.id.textDateView);
        dateText.setText(currentDate);
        //get intent

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String noun = intent.getStringExtra(MainActivity.EXTRA_NOUN);
        String event = intent.getStringExtra(MainActivity.EXTRA_EVENT);





        //get teh textView and set the text

        TextView nameText = findViewById(R.id.nameTextView);
        nameText.setText(name +" "+"is too cool");

        TextView nounText = findViewById(R.id.nounTextView);
        nounText.setText("for"+ " " +noun +" " + "class");

        TextView eventText = findViewById(R.id.eventTextView);
        eventText.setText("\nInstead, she/he will be\n attending the"+" "+event);

    }
}
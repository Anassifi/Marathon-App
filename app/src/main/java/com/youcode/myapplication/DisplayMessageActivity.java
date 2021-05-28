package com.youcode.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String user_name = intent.getStringExtra(MainActivity.EXTRA_FNAME);
        String user_lname = intent.getStringExtra(MainActivity.EXTRA_LNAME);

        // Capture the layout's TextView and set the string as its text
        TextView textView1 = findViewById(R.id.user_name);
        TextView textView2 = findViewById(R.id.user_lname);
        textView1.setText(user_name);
        textView2.setText(user_lname);
    }

}
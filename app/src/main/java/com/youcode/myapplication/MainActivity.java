package com.youcode.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String[] form;
    public static final String EXTRA_FNAME = "com.youcode.myapplication.FNAME";
    public static final String EXTRA_LNAME = "com.youcode.myapplication.LNAME";
    public static final String EXTRA_EMAIL = "com.youcode.myapplication.EMAIL";
    public static final String EXTRA_PHONE = "com.youcode.myapplication.PHONE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText fname = (EditText) findViewById(R.id.editTextTextPersonFName);
        EditText lname = (EditText) findViewById(R.id.editTextTextPersonLName);
        EditText email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText phone = (EditText) findViewById(R.id.editTextPhone);
        form[1] = fname.getText().toString();
        form[2] = lname.getText().toString();
        form[3] = email.getText().toString();
        form[4] = phone.getText().toString();

        intent.putExtra(EXTRA_FNAME, form[1]);
        intent.putExtra(EXTRA_LNAME, form[2]);
        intent.putExtra(EXTRA_EMAIL, form[3]);
        intent.putExtra(EXTRA_PHONE, form[4]);

        startActivity(intent);
    }
}
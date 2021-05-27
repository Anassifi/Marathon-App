package com.youcode.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

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
        String ftname = fname.getText().toString();
        String ltname= lname.getText().toString();
        String mail = email.getText().toString();
        String tel = phone.getText().toString();

        intent.putExtra(EXTRA_FNAME, ftname);
        intent.putExtra(EXTRA_LNAME, ltname);
        intent.putExtra(EXTRA_EMAIL, mail);
        intent.putExtra(EXTRA_PHONE, tel);

        startActivity(intent);
    }
}
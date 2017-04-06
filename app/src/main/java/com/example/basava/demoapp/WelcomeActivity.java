package com.example.basava.demoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        Intent intent = getIntent();
        String name = (String) intent.getExtras().get("name");
        TextView textView = (TextView) findViewById(R.id.message);
        String welcomeText = "Welcome to your new android App \n" + name;
        textView.setText(welcomeText);
    }
}

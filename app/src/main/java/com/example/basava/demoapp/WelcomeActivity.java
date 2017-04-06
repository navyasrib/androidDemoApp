package com.example.basava.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        Intent intent = getIntent();
        String name = (String) intent.getExtras().get("name");
        TextView textView = (TextView) findViewById(R.id.name);
        String welcomeText = textView.getText() + name;
        textView.setText(welcomeText);
    }
}

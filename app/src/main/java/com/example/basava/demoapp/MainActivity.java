package com.example.basava.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToWelcomePage(View view) {
        final EditText nameField = (EditText) findViewById(R.id.name);
        Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
        intent.putExtra("name", nameField.getText().toString());
        startActivity(intent);
    }
}

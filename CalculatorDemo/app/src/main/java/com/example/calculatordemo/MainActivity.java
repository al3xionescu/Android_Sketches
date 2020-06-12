package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText etUserName;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
    }

    String userName = "admin";
    String passWord = "1111";
    String name = "Alexandru Ionescu";

    public void buLogin(View view) {
        if (userName.equals(etUserName.getText().toString()) && passWord.equals(etPassword.getText().toString())) {
            Intent intent = new Intent(this, Home.class);
            intent.putExtra("name", name);
            startActivity(intent);
        }
    }
}

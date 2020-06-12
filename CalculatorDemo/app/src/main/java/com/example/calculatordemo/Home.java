package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Home extends AppCompatActivity {
    EditText etShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Bundle b = getIntent().getExtras();
        String name = b.getString("name");
        etShow = (EditText) findViewById(R.id.etShow);
        etShow.setText(name);
    }

    public void buClose(View view) {
        finish();
    }
}

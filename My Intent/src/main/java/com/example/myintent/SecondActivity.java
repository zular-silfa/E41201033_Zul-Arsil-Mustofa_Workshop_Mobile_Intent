package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textname = findViewById(R.id.text_name);

        Bundle extra = getIntent().getExtras();
        textname.setText("My Name is " + extra.getString("myName"));
    }
}
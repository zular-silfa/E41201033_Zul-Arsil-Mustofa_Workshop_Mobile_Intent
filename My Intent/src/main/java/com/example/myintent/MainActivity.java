package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editname, edituri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editname = findViewById(R.id.edit_name);
        edituri = findViewById(R.id.edit_uri);
    }

    public void actionSend(View view) {
        String name = editname.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("myName", name);
        startActivity(intent);

    }

    public void actionSubmit(View view) {
        String url = edituri.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }
}
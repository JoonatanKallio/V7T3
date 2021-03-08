package com.example.v7t3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private String teksti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edit_text);
        textView = (TextView) findViewById(R.id.textView3);

    }
    public void testFunction (View v) {
        teksti = editText.getText().toString();
        textView.setText(teksti);
    }
}
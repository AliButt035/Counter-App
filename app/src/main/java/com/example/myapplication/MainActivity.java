package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button dec;
    private Button inc;
    private Button reset;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextNumberSigned);
        dec=findViewById(R.id.button2);
        reset=findViewById(R.id.button);
        inc=findViewById(R.id.button3);

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c=editText.getText().toString();
                int d=Integer.parseInt(c);
                d=d-1;
                String s=String.valueOf(d);
                editText.setText(s);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("0");
            }
        });

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c=editText.getText().toString();
                int d=Integer.parseInt(c);
                d=d+1;
                String s=String.valueOf(d);
                editText.setText(s);
            }
        });

    }
}
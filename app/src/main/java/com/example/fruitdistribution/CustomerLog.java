package com.example.fruitdistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CustomerLog extends AppCompatActivity {
    Button button;
    EditText e1,e2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_log);
        e1 = (EditText) findViewById(R.id.username1);
        e2 = (EditText) findViewById(R.id.password1);
        button =(Button) findViewById(R.id.loginbutton);


            }

    }


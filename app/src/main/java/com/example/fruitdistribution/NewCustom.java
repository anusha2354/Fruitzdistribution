package com.example.fruitdistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class NewCustom extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button button;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_custom);
        e1=(EditText)findViewById(R.id.name) ;
        e2=(EditText)findViewById(R.id.phonenumber);
        e3=(EditText)findViewById(R.id.accountnumber);
        e4=(EditText)findViewById(R.id.location);
        button=(Button)findViewById(R.id.submitbutton);

    }
}

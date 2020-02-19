package com.example.fruitdistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class AddDetail extends AppCompatActivity {
    Button button1,button2,button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_detail);
        button1=(Button)findViewById(R.id.adddetails);
        button2=(Button)findViewById(R.id.viewproducts);
        button3=(Button)findViewById(R.id.vieworder);
    }
}

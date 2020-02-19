package com.example.fruitdistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ItemList extends AppCompatActivity {
    EditText e1,e2,e3;
    Button button;
    String s1,s2,s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        e1=(EditText)findViewById(R.id.item) ;
        e2=(EditText)findViewById(R.id.quantity);
        e3=(EditText)findViewById(R.id.date);
        button=(Button)findViewById(R.id.orderbutton);
    }
}

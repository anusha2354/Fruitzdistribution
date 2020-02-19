package com.example.fruitdistribution;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ProductDetails extends AppCompatActivity {
    Button button;
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        e1=(EditText)findViewById(R.id.productname) ;
        e2=(EditText)findViewById(R.id.price);
        e3=(EditText)findViewById(R.id.description);
        button=(Button)findViewById(R.id.addbutton);




    }
}

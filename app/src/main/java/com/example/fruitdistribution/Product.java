package com.example.fruitdistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Product extends AppCompatActivity {
    Button button,button1,button2,button3;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        button=(Button)findViewById(R.id.addproducts);
        button1=(Button)findViewById(R.id.vieworder);
        button2=(Button)findViewById(R.id.orderlist);
        button3=(Button)findViewById(R.id.abouttransaction);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(getApplicationContext(),AmountDetails.class);
                startActivity(intent);
            }
        });











    }
}

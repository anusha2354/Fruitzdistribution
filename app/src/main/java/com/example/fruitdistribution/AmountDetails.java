package com.example.fruitdistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class AmountDetails extends AppCompatActivity {
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount_details);
        e1=(EditText)findViewById(R.id.amount) ;
        e2=(EditText)findViewById(R.id.balanceget);
        e3=(EditText)findViewById(R.id.balancegive);
    }
}

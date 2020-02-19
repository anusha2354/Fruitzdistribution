package com.example.fruitdistribution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button button1,button2;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.username) ;
        e2=(EditText)findViewById(R.id.password);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               Intent intent=new Intent(getApplicationContext(),CustomerLog.class);
               startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString().trim();
                s2=e2.getText().toString().trim();

                if (s1.equals("fds") && s2.equals("1234")) {
                    Toast.makeText(getApplicationContext(), "successfully logged in", Toast.LENGTH_LONG).show();
                    Intent i=new Intent(getApplicationContext(),Product.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"invalid user name or password",Toast.LENGTH_LONG).show();

                }

            }
        });





    }
}


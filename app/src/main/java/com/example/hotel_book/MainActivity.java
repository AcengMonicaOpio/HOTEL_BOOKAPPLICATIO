package com.example.hotel_book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText get ;
    private EditText passed;
    private Button logup;
    private Button logv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            get=(EditText)findViewById(R.id.faste);
            passed=(EditText)findViewById(R.id.passme);
            logup=findViewById(R.id.button);
            logup.setOnClickListener( new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Intent intem = new Intent(MainActivity.this,THIRD.class);
                    startActivity(intem);

                }
            });
            logv=findViewById(R.id.button2);
            logv.setOnClickListener( new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Intent intr = new Intent(MainActivity.this,SIGN.class);
                    startActivity(intr);


                }
            });


        }
    }



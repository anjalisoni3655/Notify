package com.example.notify;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private factbook factBook= new factbook();
    private ColorWheel colorWheel =new ColorWheel();
    private TextView mytext;
    private Button mybutton;
    private RelativeLayout relativeLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext = (TextView) findViewById(R.id.mytext);
        mybutton = (Button) findViewById(R.id.mybutton);
        relativeLayout =(RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getfact();



                mytext.setText(fact);
                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                mybutton.setTextColor(color);


            }


        };
        mybutton.setOnClickListener(listener);
    }
};

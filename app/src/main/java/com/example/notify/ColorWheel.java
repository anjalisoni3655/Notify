package com.example.notify;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    public String[] colors =  {

                "#39add1","#3079ab","#c25975","#e15258","#f9845b","#b7c0c7","#f092b0","#e0ab18","#53bbb4","#637a91"
        };
  int getColor(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
int color = Color.parseColor(colors[randomNumber]);
        return color ;
    }
}

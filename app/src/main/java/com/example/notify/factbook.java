package com.example.notify;

import java.util.Random;

public class factbook {public String getfact(){
    String[] facts = {
            "1","2","3","4","5","6","7","8","9","10"
    };

    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(facts.length);

    return facts[randomNumber];
}
}

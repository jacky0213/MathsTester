package com.example.jackykwong.mathstester;

/**
 * Created by Jacky on 2016/7/18.
 */
public class Calculation {

    public float calculation (float percentage, float number){
        float dec = percentage / 100;
        float result =  dec * number;
        return result;
    }
}

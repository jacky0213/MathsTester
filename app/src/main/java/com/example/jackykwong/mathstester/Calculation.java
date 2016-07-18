package com.example.jackykwong.mathstester;

import android.util.Log;

/**
 * Created by Jacky on 2016/7/18.
 */
public class Calculation {

    private final String TAG = "Calculation";

    public float calculation (float percentage, float number){
        float dec = percentage / 100;
        float result =  dec * number;
        Log.d(TAG, "The " + percentage + "% of " + number + "is " + result);
        return result;
    }
}

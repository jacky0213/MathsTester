package com.example.jackykwong.mathstester;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    Calculation cal = new Calculation();

    @Test
    public void NormalCase(){
        assertTrue(Float.toString(cal.calculation(10, 10)), true);
        assertEquals(Float.toString(cal.calculation(10, 10)), Float.toString(1));

    }

    @Test
    public void Negative_Input(){
        assertTrue(Float.toString(cal.calculation(-10, -10)), true);
    }

    @Test
    public void Extreme_Input(){
        assertTrue(Float.toString(cal.calculation(10, 1000000000)), true);
    }

    @Test
    public void Extreme1_Input(){
        assertTrue(Float.toString(cal.calculation(10, 1000000000)), true);
    }

    @Test
    public void Extreme2_Input(){
        assertTrue(Float.toString(cal.calculation(10, 1000000000)), true);
    }



}
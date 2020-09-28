package com.example.mcalc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ModelTest {
    @Test
    public void testPayment1() {
        MortgageModel myModel;

        myModel = new MortgageModel("700000", "2.75", "25");
        Assert.assertEquals("C1", "$3,229.18", myModel.computePayment());
    }
    @Test
    public void testPayment2(){
        MortgageModel myModel;
        myModel = new MortgageModel("300000", "4.5", "20");
        Assert.assertEquals("C2", "$3,000.00", myModel.computePayment());
    }
}
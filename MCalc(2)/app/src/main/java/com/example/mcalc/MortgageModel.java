package com.example.mcalc;

public class MortgageModel {

    private double p;
    private int a;
    private double i;

    public MortgageModel(String p, String a, String i){
        this.p = Double.parseDouble(p);
        this.i = Double.parseDouble(i);
        this.a = Integer.parseInt(a);
    }
    public String computePayment(){
        String  result;
        double r = i/1200;
        int n = a*12;
        double mp = (r*p)/(1-(Math.pow((1+r),-n)));
        result = "$" + String.format("%.2f", mp);
        return result;

    }
}

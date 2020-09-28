package com.example.mcalc;

public class MortgageModel   {
    // declared these variables
    private double p;
    private double i;
    private int a;


    public MortgageModel(String p, String a, String i){
    this.p = Double.parseDouble(p);
    this.a = Integer.parseInt(a);
    this.i = Double.parseDouble(i);
    }

    public String computePayment(){
        String payment;
        double r = i/1200;
        int n = a * 12;
        double mort = (r * p) / (1 - (Math.pow(1+r, -n)));
        payment = "$" + String.format("%,.2f", mort);
        return payment;
    }

}
/*

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

    }*/

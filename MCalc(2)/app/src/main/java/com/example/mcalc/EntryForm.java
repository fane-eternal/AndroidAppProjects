package com.example.mcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }
    public void buttonClicked(View v)
    {
        EditText principleView = (EditText) findViewById(R.id.principle);
        String p = principleView.getText().toString();
        EditText amortizationView = (EditText) findViewById(R.id.amortization);
        String a = amortizationView.getText().toString();
        EditText interestView = (EditText) findViewById(R.id.interest);
        String i = interestView.getText().toString();

        MortgageModel m = new MortgageModel(p, a, i);
        String s = m.computePayment();

        ((TextView) findViewById(R.id.answer)).setText(s);
    }
}

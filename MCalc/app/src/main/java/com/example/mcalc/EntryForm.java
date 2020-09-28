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

    private void setContentOfTextView(int id, String newContents) {
        View view = findViewById(id);// find the UI by ID return and store in View
        TextView textview = (TextView) view; // Manual casting
        textview.setText(newContents);
    }

    private String getContentOfEditText(int id) {
        View view = findViewById(id);// find the UI by ID return and store in View
        EditText editText = (EditText) view; // Manual casting
        String str = editText.getText().toString();
        return str;
    }

    // my own input to make the button interact with the information inputted by the user(3 textboxes )
    public void buttonClicked(View v) {
        EditText principleView = (EditText) findViewById(R.id.principleBox);
        String prS = principleView.getText().toString();
        EditText amortizationView = (EditText) findViewById(R.id.amortizationBox);
        String amS = amortizationView.getText().toString();
        EditText interestView = (EditText) findViewById(R.id.interestBox);
        String inS = interestView.getText().toString();
        MortgageModel m = new MortgageModel(prS, amS, inS);
        String mort = m.computePayment();
        ((TextView) findViewById(R.id.payment)).setText(mort);
    }
}
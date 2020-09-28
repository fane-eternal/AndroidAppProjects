package com.example.bmi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_layout);
    }
    private void setContentOfTextView(int id, String newContents){
        View view = findViewById(id);// find the UI by ID return and store in View
        TextView textview = (TextView) view; // Manual casting
        textview.setText(newContents);
    }
    private String getContentOfEditText(int id){
        View view = findViewById(id);// find the UI by ID return and store in View
        EditText editText = (EditText) view; // Manual casting
        String str = editText.getText().toString();
        return str;
    }
    public void buttonClicked(View v)
    {
        EditText weightView = (EditText) findViewById(R.id.weightBox);
        String wS = weightView.getText().toString();
        EditText heightView = (EditText) findViewById(R.id.heightBox);
        String hS = heightView.getText().toString();
        double wD = BMIModel.toDouble(wS);
        double hD = BMIModel.toDouble(hS);
        double bmiD = BMIModel.getBMI(wD, hD);
        String bmiS = BMIModel.formatBMI(bmiD);
        ((TextView) findViewById(R.id.answer)).setText(bmiS);
    }
}
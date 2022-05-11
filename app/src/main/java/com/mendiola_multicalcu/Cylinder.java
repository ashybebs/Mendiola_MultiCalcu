package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cylinder extends AppCompatActivity implements View.OnClickListener {

    EditText txtLength, txtWidth, txtHeight;
    double num1, num2, Cylinder;
    TextView answer;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cylinder);
        btnCalc = findViewById(R.id.btnCalc);
        txtLength = findViewById(R.id.fillin1);
        txtWidth = findViewById(R.id.fillin2);
        answer = findViewById(R.id.answer);
        btnCalc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        num1 = Double.parseDouble(txtLength.getText().toString());
        num2 = Double.parseDouble(txtWidth.getText().toString());
        Cylinder = num1 * num1 * num2 * Math.PI;
        answer.setText("The area is: " + Cylinder);
    }

}


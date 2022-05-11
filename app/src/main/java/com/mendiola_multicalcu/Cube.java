package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cube extends AppCompatActivity implements View.OnClickListener {

    EditText txtSide;
    double num1, Cube;
    TextView answer;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cube);
        btnCalc = findViewById(R.id.btnCalc);
        txtSide = findViewById(R.id.fillin1);
        answer = findViewById(R.id.answer);
        btnCalc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        num1 = Double.parseDouble(txtSide.getText().toString());
        Cube = num1 * num1 * num1;
        answer.setText("The area is: " + Cube);
    }

}



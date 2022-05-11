package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Square extends AppCompatActivity implements View.OnClickListener {

    EditText fillin;
    double num1, Square;
    TextView answer;
    Button btn_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square);
        btn_calc = findViewById(R.id.btnCalc);
        fillin = findViewById(R.id.fillin);
        answer = findViewById(R.id.answer);
        btn_calc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        num1 = Double.parseDouble(fillin.getText().toString());
        Square = num1 * num1;
        answer.setText("The area is: " + Square);
    }

}


package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rectangle extends AppCompatActivity implements View.OnClickListener {

    EditText length, width;
    double num1, num2, Rectangle;
    TextView answer;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rectangle);
        btnCalc = findViewById(R.id.btnCalc);
        length = findViewById(R.id.fillin1);
        width = findViewById(R.id.fillin2);
        answer = findViewById(R.id.answer);
        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        num1 = Double.parseDouble(length.getText().toString());
        num2 = Double.parseDouble(width.getText().toString());
        Rectangle = num1 * num2;
        answer.setText("The area is: " + Rectangle);
    }

}



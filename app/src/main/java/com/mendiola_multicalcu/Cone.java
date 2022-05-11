package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cone extends AppCompatActivity implements View.OnClickListener {

    EditText txtRadius, txtHeight;
    double num1, num2,ans;
    TextView Cone;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cone);
        btnCalc = findViewById(R.id.btnCalc);
        txtRadius = findViewById(R.id.fillin1);
        txtHeight = findViewById(R.id.fillin2);
        Cone = findViewById(R.id.answer);
        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        num1 = Double.parseDouble(txtRadius.getText().toString());
        num2 = Double.parseDouble(txtHeight.getText().toString());
        ans = Math.PI* num1 * num1 * num2 /3;
        Cone.setText("The area is: " + ans);
    }

}


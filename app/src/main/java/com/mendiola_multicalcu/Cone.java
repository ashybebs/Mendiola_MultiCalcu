package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cone extends AppCompatActivity implements View.OnClickListener {

    EditText txtRadius, txtHeight;
    double var1, var2 ,ans;
    TextView txt_answer;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cone);
        btnCalc = findViewById(R.id.btnCalc);
        txtRadius = findViewById(R.id.fillin1);
        txtHeight = findViewById(R.id.fillin2);
        txt_answer = findViewById(R.id.answer);
        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txtRadius.getText().toString());
        var2 = Double.parseDouble(txtHeight.getText().toString());
        ans = Math.PI* var1 *var1* var2/3;
        txt_answer.setText("The area is: " + ans);
    }

}


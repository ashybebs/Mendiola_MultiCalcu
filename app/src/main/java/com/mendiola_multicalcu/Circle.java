package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Circle extends AppCompatActivity implements View.OnClickListener {

    EditText radius;
    double var1, ans;
    TextView answer;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);
        btnCalc = findViewById(R.id.btnCalc);
        radius = findViewById(R.id.fillin4);
        answer = findViewById(R.id.answer);
        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(radius.getText().toString());
        ans = var1 * var1 * Math.PI;
        answer.setText("The area is: " + ans);
    }

}


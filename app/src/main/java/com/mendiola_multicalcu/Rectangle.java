package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rectangle extends AppCompatActivity implements View.OnClickListener {

    EditText length, width;
    double var1, var2 ,ans;
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
        var1 = Double.parseDouble(length.getText().toString());
        var2 = Double.parseDouble(width.getText().toString());
        ans = var1 * var2;
        answer.setText("The area is: " + ans);
    }

}



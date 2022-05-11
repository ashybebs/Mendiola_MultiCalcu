package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Square extends AppCompatActivity implements View.OnClickListener {

    EditText fillin;
    double var1,ans;
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
        var1 = Double.parseDouble(fillin.getText().toString());
        ans = var1 * var1;
        answer.setText("The area is " + ans);
    }

}


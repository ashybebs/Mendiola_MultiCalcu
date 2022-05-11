package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Prism extends AppCompatActivity implements View.OnClickListener {

    EditText txtLength, txtWidth, txtHeight;
    double var1, var2, var3,ans;
    TextView txt_answer;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prism);
        btnCalc = findViewById(R.id.btnCalc);
        txtLength = findViewById(R.id.fillin1);
        txtWidth = findViewById(R.id.fillin2);
        txtHeight = findViewById(R.id.fillin3);
        txt_answer = findViewById(R.id.answer);
        btnCalc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txtLength.getText().toString());
        var2 = Double.parseDouble(txtWidth.getText().toString());
        var3 = Double.parseDouble(txtHeight.getText().toString());
        ans = var1 * var2 * var3;
        txt_answer.setText("The volume is" + ans);
    }

}


package com.mendiola_multicalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cube extends AppCompatActivity implements View.OnClickListener {

    EditText txtSide;
    double var1,ans;
    TextView txt_answer;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cube);
        btnCalc = findViewById(R.id.btnCalc);
        txtSide = findViewById(R.id.fillin1);
        txt_answer = findViewById(R.id.answer);
        btnCalc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txtSide.getText().toString());
        ans = var1 * var1 * var1;
        txt_answer.setText("The volume is:" + ans);
    }

}



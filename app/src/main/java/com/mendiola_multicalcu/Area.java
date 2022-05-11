package com.mendiola_multicalcu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Area extends AppCompatActivity {

    Button btnSquare;
    Button btnRectangle;
    Button btnCircle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area);

        btnRectangle = (Button) findViewById(R.id.btnRectangle);
        btnSquare = (Button) findViewById(R.id.btnSquare);
        btnCircle = (Button) findViewById(R.id.btnCircle);

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Area.this, Square.class));
            }

        });
        btnRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Area.this, Rectangle.class));
            }
        });
        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Area.this, Circle.class));
            }
        });}}


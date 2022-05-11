package com.mendiola_multicalcu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Volume extends AppCompatActivity {

    Button btnCone, btnPrism, btnCube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume);
        btnCone = (Button) findViewById(R.id.btnCone);
        btnPrism = (Button) findViewById(R.id.btnPrism);
        btnCube = (Button) findViewById(R.id.btnCube);


        btnCone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Volume.this, Cone.class));
            }

        });
        btnPrism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Volume.this, Cylinder.class));
            }
        });
        btnCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Volume.this, Cube.class));
            }
        });
    }
}

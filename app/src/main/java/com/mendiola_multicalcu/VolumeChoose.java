package com.mendiola_multicalcu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VolumeChoose extends AppCompatActivity {

    Button btnCone, btnPrism, btnCube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);
        btnCone = (Button) findViewById(R.id.btnSquare);
        btnPrism = (Button) findViewById(R.id.btnPrism);
        btnCube = (Button) findViewById(R.id.btnCube);


        btnCone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VolumeChoose.this, Cone.class));
            }

        });
        btnPrism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VolumeChoose.this, com.example.muliloda_multicalc.Volume.Prism.class));
            }
        });
        btnCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VolumeChoose.this, com.example.muliloda_multicalc.Volume.Cube.class));
            }
        });
    }
}

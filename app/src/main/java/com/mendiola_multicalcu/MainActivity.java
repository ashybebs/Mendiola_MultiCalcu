package com.mendiola_multicalcu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.muliloda_multicalc.Area.AreaChoose;

public class MainActivity extends AppCompatActivity {

    Button btnArea, btnVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pick_shape);
        btnVolume = (Button) findViewById(R.id.btnVolume);
        btnArea = (Button) findViewById(R.id.btnArea);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AreaChoose.class));
            }

        });
        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VolumeChoose.class));
            }
        });
    }
}


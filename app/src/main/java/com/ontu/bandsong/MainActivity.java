package com.ontu.bandsong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView artcell, warfaze, avoid, arth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        artcell = findViewById(R.id.artcell);
        warfaze = findViewById(R.id.warfaze);
        avoid = findViewById(R.id.avoid);
        arth = findViewById(R.id.arth);

        artcell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artcell = new Intent(MainActivity.this, Artcell.class);
                startActivity(artcell);

            }
        });

        warfaze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent warfaze = new Intent(MainActivity.this , Warfaze.class);
                startActivity(warfaze);

            }
        });


        avoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent avoid = new Intent(MainActivity.this, AvoidRafa.class);
                startActivity(avoid);
            }
        });

        arth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artho = new Intent(MainActivity.this , Arthohin.class);
                startActivity(artho);
            }
        });




    }
}
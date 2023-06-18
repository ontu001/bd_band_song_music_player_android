package com.ontu.bandsong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Warfaze extends AppCompatActivity {
    LinearLayout purnota,rupkotha,obak,bose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.warfaze_album);

        purnota = findViewById(R.id.purnota);
        rupkotha =findViewById(R.id.rupkotha);
        obak =findViewById(R.id.obak);
        bose =findViewById(R.id.bose);

        purnota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play ="https://www.youtube.com/embed/uB2rhjulY4Q";
                Intent purnota = new Intent(Warfaze.this , Player.class);
                startActivity(purnota);
            }
        });


        rupkotha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play ="https://www.youtube.com/embed/CLUL2eO9o9w";
                Intent rupkotha = new Intent(Warfaze.this , Player.class);
                startActivity(rupkotha);
            }
        });


        obak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play="https://www.youtube.com/embed/Qh_sxMN9UH8";
                Intent obak = new Intent(Warfaze.this, Player.class);
                startActivity(obak);
            }
        });

        bose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play ="https://www.youtube.com/embed/lOLo2WokugA";
                Intent bose = new Intent(Warfaze.this, Player.class);
                startActivity(bose);
            }
        });



    }
}
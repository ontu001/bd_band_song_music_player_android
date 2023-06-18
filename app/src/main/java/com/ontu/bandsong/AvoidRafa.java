package com.ontu.bandsong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AvoidRafa extends AppCompatActivity {
    LinearLayout harkala,odvut,akash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avoid_rafa_album);

        harkala= findViewById(R.id.harkala);
        odvut= findViewById(R.id.odvut);
        akash =findViewById(R.id.akash);

        harkala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play ="https://www.youtube.com/embed/86XiuLtCTFE";

                Intent harkala = new Intent(AvoidRafa.this , Player.class);
                startActivity(harkala);
            }
        });




        odvut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play="https://www.youtube.com/embed/ZgKWJ3BH0b4";
                Intent odvut = new Intent(AvoidRafa.this , Player.class);
                startActivity(odvut);
            }
        });



        akash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play ="https://www.youtube.com/embed/M2M8dTzgE7Q";
                Intent akash = new Intent(AvoidRafa.this , Player.class);
                startActivity(akash);
            }
        });
    }
}
package com.ontu.bandsong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Arthohin extends AppCompatActivity {
    LinearLayout anmone,anmone2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arthohin_album);

        anmone = findViewById(R.id.anmone);
        anmone2 =findViewById(R.id.anmone2);

        anmone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play ="https://www.youtube.com/embed/P9jXUxOkcR8";
                Intent anmone= new Intent(Arthohin.this ,Player.class);
                startActivity(anmone);
            }
        });

        anmone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play="https://www.youtube.com/embed/3I3l-x93kOY";
                Intent anmone2 = new Intent(Arthohin.this , Player.class);
                startActivity(anmone2);
            }
        });
    }
}
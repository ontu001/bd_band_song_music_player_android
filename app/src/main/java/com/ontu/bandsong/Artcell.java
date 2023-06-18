package com.ontu.bandsong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Artcell extends AppCompatActivity {
    LinearLayout oniket,dhusor,dukkho,poth,ei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artcell_album);

        oniket = findViewById(R.id.oniket);
        dhusor= findViewById(R.id.dhusor);
        dukkho = findViewById(R.id.dukkho);
        poth = findViewById(R.id.poth);
        ei = findViewById(R.id.ei);




        oniket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play ="https://www.youtube.com/embed/qw1CVt43VKw";
                Intent oniket =new Intent(Artcell.this, Player.class);
                startActivity(oniket);
            }
        });






        dhusor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play ="https://www.youtube.com/embed/iW_tQgrQfek";

                Intent dhusor = new Intent(Artcell.this , Player.class);
                startActivity(dhusor);
            }
        });




        dukkho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play ="https://www.youtube.com/embed/ye-9Cqa_SC8";

                Intent dukkho = new Intent(Artcell.this , Player.class);
                startActivity(dukkho);
            }
        });


        poth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play = "https://www.youtube.com/embed/CKfhGvUPXkY";

                Intent poth = new Intent(Artcell.this , Player.class);
                startActivity(poth);
            }
        });





        ei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.play ="https://www.youtube.com/embed/DV4AUG4XMhc";

                Intent ei = new Intent(Artcell.this , Player.class);
                startActivity(ei);
            }
        });
    }
}
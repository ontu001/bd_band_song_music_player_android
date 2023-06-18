package com.ontu.bandsong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Player extends AppCompatActivity {

    WebView web;
    public static String play= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        web = findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);

        web.loadUrl(play);
    }
}
package com.example.fanny.micurriculo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
Button botonAtras4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        botonAtras4 = (Button) findViewById(R.id.btnAtras4);
        botonAtras4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botonAtras4 = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(botonAtras4);
            }
        });
    }

}

package com.example.fanny.micurriculo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button foto;
    Button datosPersonales;
    Button formacionAcademica;
    Button experienciaProfesional;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foto = (Button) findViewById(R.id.btn1);
        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foto = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(foto);

            }
        });

        datosPersonales = (Button) findViewById(R.id.btn2);
        datosPersonales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent datosPersonales = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(datosPersonales);

            }
        });

        formacionAcademica = (Button) findViewById(R.id.btn3);
        formacionAcademica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent formacionAcademica = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(formacionAcademica);

            }
        });

        experienciaProfesional= (Button) findViewById(R.id.btn4);
        experienciaProfesional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent experienciaProfesional = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(experienciaProfesional);

            }
        });




    }
}

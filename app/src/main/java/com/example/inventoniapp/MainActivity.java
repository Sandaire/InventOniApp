package com.example.inventoniapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Parameter;


public class MainActivity extends AppCompatActivity {
    private CardView dashboard;
    private CardView rapport;
    private CardView inventaire;

    private CardView parametre;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dashboard= (CardView) findViewById(R.id.dash);
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendashboard();
            }
        });

        rapport= (CardView) findViewById(R.id.rapp);
        rapport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrapport();
            }
        });

        inventaire= (CardView) findViewById(R.id.inv);
        inventaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinventaire();
            }
        });

        parametre= (CardView) findViewById(R.id.para);
        parametre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparametre();
            }
        });
    }

    public void opendashboard(){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

    public void openrapport(){
        Intent intent = new Intent(this, Rapport.class);
        startActivity(intent);
    }

    public void openinventaire(){
        Intent intent = new Intent(this, Inventaire.class);
        startActivity(intent);
    }

    public void openparametre(){
        Intent intent = new Intent(this, Parametre.class);
        startActivity(intent);
    }
}
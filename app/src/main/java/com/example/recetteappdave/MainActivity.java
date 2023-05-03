package com.example.recetteappdave;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    //recup header
    SearchView searchRef;
    ImageView addref;
    ImageView settingsref;
    Button petitdejButton;
    Button entreesButton;
    Button platsButton;
    Button aperosButton;
    Button boissonsButton;
    Button dessertsButton;
    List<Item> itemList;

    boolean petitdejButtonState = false;
    boolean entreesButtonState = false;
    boolean platsButtonState = false;
    boolean aperosButtonState = false;
    boolean boissonsButtonState = false;
    boolean dessertsButtonState = false;

    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recup par id
        addref = findViewById(R.id.add);
        settingsref = findViewById(R.id.options);
        searchRef = findViewById(R.id.searchView);
        searchRef.clearFocus();
        petitdejButton = findViewById(R.id.petitdej);
        entreesButton = findViewById(R.id.entrees);
        platsButton = findViewById(R.id.plats);
        aperosButton = findViewById(R.id.aperos);
        boissonsButton = findViewById(R.id.boissons);
        dessertsButton = findViewById(R.id.desserts);
        itemList = new ArrayList<>();
        LinearLayout linearLayout = findViewById(R.id.scroll_layout3);
        //add data Items
        itemList.add(new Item("Poulet Curry", R.drawable.image_recette_1));
        itemList.add(new Item("Gratin d'auphinois", R.drawable.image_recette_2));
        itemList.add(new Item("Roti aux haricots", R.drawable.image_recette_3));
        itemList.add(new Item(" Patates Douce", R.drawable.image_recette_4));
        itemList.add(new Item(" Burger", R.drawable.image_recette_5));
        itemList.add(new Item("Saumon cuit au four", R.drawable.image_recette_6));
        itemList.add(new Item("Sushis maison", R.drawable.image_recette_7));
        itemList.add(new Item("Gateau chocolat", R.drawable.image_recette_8));
        itemList.add(new Item("Pâtes lardons", R.drawable.image_recette_9));
        itemList.add(new Item("Tiramisu aux fraises", R.drawable.image_recette_10));

        //ref itemxml.xml
        ItemView itemView = new ItemView(this);
        itemView.setItem(itemList.get(0));
        linearLayout.addView(itemView);

        //onclick buttons
        addref.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent goToAddRecette = new Intent(MainActivity.this, AddRecette.class);
                startActivity(goToAddRecette);
            };
        });
        settingsref.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent goToOptions = new Intent(MainActivity.this, Options.class);
                startActivity(goToOptions);
            };

        });
        // A OPTIMISER (avec fragments ou drawable)
        // Onclick pour les boutons du header de la page home
        petitdejButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(petitdejButtonState == true){
                    petitdejButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    petitdejButtonState = false;
                } else {
                    petitdejButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    petitdejButtonState = true;
                }

            };

        });
        entreesButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(entreesButtonState == true){
                    entreesButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    entreesButtonState = false;
                } else {
                    entreesButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    entreesButtonState = true;
                }

            };

        });
        platsButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(platsButtonState == true){
                    platsButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    platsButtonState = false;
                } else {
                    platsButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    platsButtonState = true;
                }

            };

        });
        aperosButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(aperosButtonState == true){
                    aperosButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    aperosButtonState = false;
                } else {
                    aperosButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    aperosButtonState = true;
                }

            };

        });
        boissonsButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(boissonsButtonState == true){
                    boissonsButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    boissonsButtonState = false;
                } else {
                    boissonsButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    boissonsButtonState = true;
                }

            };

        });
        dessertsButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(dessertsButtonState == true){
                    dessertsButton.setBackgroundResource(R.drawable.sort_button_top_home);

                    dessertsButtonState = false;
                } else {
                    dessertsButton.setBackgroundResource(R.drawable.sort_button_top_home2);

                    dessertsButtonState = true;
                }

            };

        });


    }

}


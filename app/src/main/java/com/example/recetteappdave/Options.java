package com.example.recetteappdave;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Switch;

import java.util.Locale;

public class Options extends AppCompatActivity {
    Spinner spinnerLangues;
    public static final String[] languages = {"Chosissez la langue", "English", "Français", "Deutsch"};
    private static boolean configChanged = false; // ajout de la variable de drapeau
    public static int changerDarkMode = 0;
    public static int changerLangueVariable = 0;
    LinearLayout layoutOptions;

    public interface OnLanguageChangedListener {
        void onLanguageChanged(String langCode);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        layoutOptions = findViewById(R.id.optionsLayout);
        Switch darkMode = findViewById(R.id.switchdarkmode);
        //Mettre en dark Mode background
        darkMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(changerDarkMode == 0){
                    layoutOptions.setBackgroundResource(R.color.black);
                    changerDarkMode += 1;
                } else {
                    layoutOptions.setBackgroundResource(R.color.beige);
                    changerDarkMode -= 1;
                }

            }
        });

        //Changer Langues
        spinnerLangues = findViewById(R.id.spinnerLangues);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLangues.setAdapter(adapter);
        spinnerLangues.setSelection(0);
        spinnerLangues.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedLang = parent.getItemAtPosition(position).toString();

                if (selectedLang.equals("Français")){
                    setLocale(Options.this, "fr");
                    changerLangueVariable = 0;
                    finish();
                    startActivity(getIntent());
                } else if (selectedLang.equals("English")) {
                    setLocale(Options.this, "en");
                    changerLangueVariable = 1;
                    finish();
                    startActivity(getIntent());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public static void setLocale(Activity activity, String langCode){
        if (!configChanged) { // Vérifiez si la configuration a déjà été modifiée
            Locale locale = new Locale(langCode);
            Locale.setDefault(locale);
            Resources resources = activity.getResources();
            Configuration config = resources.getConfiguration();
            config.setLocale(locale);
            resources.updateConfiguration(config, resources.getDisplayMetrics());
        }
    }

}

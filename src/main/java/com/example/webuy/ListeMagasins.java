package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.webuy.ui.main.MagasinAdapter;

import java.util.ArrayList;

public class ListeMagasins extends AppCompatActivity {

    ArrayList<String> magasins;
    ListView listview;
    MagasinAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_magasins);
        listview = (ListView) findViewById(R.id.listMembresInscrits);
        installeMagasins();
        adapter = new MagasinAdapter(magasins, getApplicationContext());
        listview.setAdapter(adapter);


    }

    private void installeMagasins() {
        //base de données
        magasins = new ArrayList<String>();
        magasins.add("Carrefour");
        magasins.add("Leclerc");
        magasins.add("Auchan");
    }
}

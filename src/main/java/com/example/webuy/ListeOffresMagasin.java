package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListeOffresMagasin extends AppCompatActivity {


    ArrayList<String> offres;
    ListView listview;
    ListeOffresAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_offres_magasin);

        listview = (ListView) findViewById(R.id.listMembresInscrits);
        installeOffres();
        adapter = new ListeOffresAdapter(offres, getApplicationContext());
        listview.setAdapter(adapter);
    }


    private void installeOffres() {
        //base de données


            offres = new ArrayList<String>();
            offres.add("Lait");
            offres.add("Thé");
            offres.add("Oranges");



    }
}

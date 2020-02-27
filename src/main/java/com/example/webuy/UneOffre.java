package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class UneOffre extends AppCompatActivity {

    ArrayList<String> membres;
    ListView listview;
    ListeMembresAdapter adapter;
    TextView description;
    TextView titreArticle;
    TextView lancePromo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_une_offre);

        listview = (ListView) findViewById(R.id.listMembresInscrits);
        installeMembres();
        adapter = new ListeMembresAdapter(membres, getApplicationContext());
        listview.setAdapter(adapter);


        description=findViewById(R.id.description);
        lancePromo=findViewById(R.id.lanceur);
        titreArticle=findViewById(R.id.titreArticle);

        String membre ="nouveauMembre";
        description.setText("bfurrravhhbfruiheuerifhurhuf");
        titreArticle.setText("nouvelle offre!!!!!");
        lancePromo.setText("Lancé par : "+membre);




    }

    private void installeMembres() {
        membres = new ArrayList<String>();
        membres.add("Membre1");
        membres.add("Membre5678");
        membres.add("Membredeux");

    }
}

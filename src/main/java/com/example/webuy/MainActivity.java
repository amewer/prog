package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView magasins;
    ImageView messages;
    ImageView offres;
    ImageView settings;
    TextView connexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        magasins=findViewById(R.id.magasins);
        messages=findViewById(R.id.messages);
        offres=findViewById(R.id.offres);
        settings=findViewById(R.id.settings);
        connexion=findViewById(R.id.connexion);

        connexion.setPaintFlags(connexion.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);

        magasins.setOnClickListener(btnMagasinsOnClickListener);
        offres.setOnClickListener(btnOffresOnClickListener);
        messages.setOnClickListener(btnMessagesOnClickListener);
        connexion.setOnClickListener(btnConnexionOnClickListener);

    }


    View.OnClickListener btnMagasinsOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent intent = new Intent(v.getContext(), ListeMagasins.class);
            startActivity(intent);

        }
    };

    View.OnClickListener btnOffresOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent intent = new Intent(v.getContext(), ListeOffres.class);
            startActivity(intent);

        }
    };


    View.OnClickListener btnMessagesOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent intent = new Intent(v.getContext(), Messages.class);
            startActivity(intent);

        }
    };

    View.OnClickListener btnConnexionOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent intent = new Intent(v.getContext(), Login.class);
            startActivity(intent);

        }
    };
}

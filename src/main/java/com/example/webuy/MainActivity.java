package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView magasins;
    ImageView messages;
    ImageView offres;
    ImageView settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        magasins=findViewById(R.id.magasins);
        messages=findViewById(R.id.messages);
        offres=findViewById(R.id.offres);
        settings=findViewById(R.id.settings);

        magasins.setOnClickListener(btnMagasinsOnClickListener);
        offres.setOnClickListener(btnOffresOnClickListener);
        messages.setOnClickListener(btnMessagesOnClickListener);

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
}

package com.example.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Login extends AppCompatActivity {

    RelativeLayout connexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        connexion=findViewById(R.id.ButtonConnexion);
        connexion.setOnClickListener(btnConnexionOnClickListener);

    }

    View.OnClickListener btnConnexionOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent intent = new Intent(v.getContext(), MainActivity.class);
            startActivity(intent);

        }
    };

}

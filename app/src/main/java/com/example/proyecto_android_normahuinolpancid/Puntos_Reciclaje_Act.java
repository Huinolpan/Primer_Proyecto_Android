package com.example.proyecto_android_normahuinolpancid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Puntos_Reciclaje_Act extends AppCompatActivity {

    ImageButton ibTelefono;
    ImageButton ibMapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntos_reciclaje);

        ibTelefono = (ImageButton) findViewById(R.id.imgFonon);
        ibMapa = (ImageButton) findViewById(R.id.imgMapan);

        ibMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMAp = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:42.1345931, -0.4053455"));
                startActivity(intentMAp);
            }
        });

        ibTelefono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:956851444"));
                startActivity(intentCall);
            }
        });

    }
}
package com.example.proyecto_android_normahuinolpancid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class servicios_proyecto extends AppCompatActivity
{

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios_proyecto);

        video=(VideoView)findViewById(R.id.vv);

        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/" + R.raw.video));

        MediaController mediaController= new MediaController(this);
        video.setMediaController(mediaController);
    }

    public void Task(View view) {
        try {
            for (int i = 0; i <= 10; i++) {
                Thread.sleep(25000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Punto(View view)
    {
        Intent i = new Intent(this, Puntos_Reciclaje_Act.class);
        startActivity(i);
    }

    public void Reciclaje(View view)
    {
        Intent i = new Intent(this, Reciclaje_prod_Act.class);
        startActivity(i);
    }
    public void Tips(View view)
    {
        Intent i = new Intent(this, Tips_Reciclaje_Act.class);
        startActivity(i);
    }
    public void Retiro(View view)
    {
        Intent i = new Intent(this, Retiro_Reciclaje_Act.class);
        startActivity(i);
    }
}

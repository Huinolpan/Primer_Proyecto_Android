package com.example.proyecto_android_normahuinolpancid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import Objetos.Administrador;

public class MainActivity extends AppCompatActivity
{
    private EditText wirrinUy;
    private EditText elkatuchiNemul;
    private TextView werkun;
    private Button salir;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Traemos los elementos por su ID.
        wirrinUy=(EditText)findViewById(R.id.et);
        elkatuchiNemul=(EditText)findViewById(R.id.et1);
        werkun=(TextView)findViewById(R.id.tv);
        salir=(Button) findViewById(R.id.btnSalir);
    }

    public void Konwe(View view)
    {
        //Obtengo los valores que necesito para Inicio de sesión.
        String usuario = wirrinUy.getText().toString().trim();
        String contrasena = elkatuchiNemul.getText().toString().trim();
        Administrador adm = new Administrador(1, usuario,contrasena);
        //Obtengo los valores que tiene la clase Administrador.
        String wirrinUyObj = adm.getWirrinUy().trim();
        String elkatuchiNemul = adm.getElkatuchiNemul().trim();

        switch (usuario)
        {
            case "Norma":
                if(elkatuchiNemul.equals("123"))
                {
                    werkun.setText("Ingreso super exitoso");

                    Intent i = new Intent(this,servicios_proyecto.class);
                    startActivity(i);
                }

                break;
            case "":
                if(elkatuchiNemul.equals(""))
                {
                    werkun.setText("Los campos no deben venir vacios.");
                }

                break;

            default:
                werkun.setText("El usuario ingresado no está registrado");
                break;
        }
    }

    public void Salir(View view)
    {
        finish();
    }

    public void Facebook(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com//"));
        startActivity(i);
    }

    public void Whatsapp(View view)
    {
       Intent i = new Intent(Intent.ACTION_VIEW);
       i.setData(Uri.parse("https://www.whatsapp.com//"));
       startActivity(i);
    }

    public void Twitter(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.twitter.com//"));
        startActivity(i);
    }
}
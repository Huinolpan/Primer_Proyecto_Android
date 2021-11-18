package com.example.proyecto_android_normahuinolpancid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Productos;

public class Reciclaje_prod_Act extends AppCompatActivity {
    Spinner objSPProductos;
    RatingBar objRB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclaje_prod);

        objSPProductos = (Spinner) findViewById(R.id.sp_productos);
        Productos prod = new Productos();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, prod.getProductos());
        objSPProductos.setAdapter(adapter);

        objSPProductos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(parent.getId())
                {
                    case R.id.sp_productos:
                        objRB = (RatingBar) findViewById(R.id.ratingBar);
                        TextView texto = (TextView) findViewById(R.id.tv_producto);
                        if (parent.getSelectedItem().toString() == "Vidrio")
                        {
                            texto.setText("Se recicla todo tipo de botellas de bebidas.");
                            objRB.setRating(5);
                        }
                        else if (parent.getSelectedItem().toString() == "Papel")
                        {
                            texto.setText("Permite reducir la cantidad de árboles que se tienen que talar.");
                            objRB.setRating(4.5f);
                        }
                        else if (parent.getSelectedItem().toString() == "Latas")
                        {
                            texto.setText("Una vez seleccionadas y prensadas,se funde y con él se fabrican nuevos lingotes de aluminio.");
                            objRB.setRating(4);
                        }
                        else if (parent.getSelectedItem().toString() == "Plasticos")
                        {
                            texto.setText("Se deben depositar en los contenedores de color amarillo.");
                            objRB.setRating(3.5f);
                        }
                        else if (parent.getSelectedItem().toString() == "Cartones")
                        {
                            objRB.setRating(3);
                            texto.setText("Es muy beneficioso para el medio ambiente,puede reciclarse hasta siete veces.");
                        }
                        else if (parent.getSelectedItem().toString() == "Tetra-Pack")
                        {
                            objRB.setRating(4.8f);
                            texto.setText("Se debe limpiar una vez llevado al deposito ,se debe aplastar para que ocupe menos espacio en el contenedor.");
                        }
                        else if (parent.getSelectedItem().toString() == "Aceite")
                        {
                            objRB.setRating(3.8f);
                            texto.setText("Se aprovecha para crear diversos productos ecológicos como biodiésel o jabones.");
                        }
                    break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
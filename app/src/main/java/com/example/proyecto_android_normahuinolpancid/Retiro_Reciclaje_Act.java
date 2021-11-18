package com.example.proyecto_android_normahuinolpancid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Productos;

public class Retiro_Reciclaje_Act extends AppCompatActivity {

    Spinner objSPProductos;
    TextView objTVMensaje;
    EditText objETNombre;
    EditText objETDireccion;
    EditText objETNumero;
    EditText objETEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retiro_reciclaje);

        objSPProductos = (Spinner) findViewById(R.id.sp_productosRetiro);
        objTVMensaje = (TextView) findViewById(R.id.tv_mensaje);
        objETNombre = (EditText) findViewById(R.id.et_nombre);
        objETDireccion = (EditText) findViewById(R.id.et_direccion);
        objETNumero = (EditText) findViewById(R.id.et_numero);
        objETEmail = (EditText) findViewById(R.id.et_email);

        Productos prod = new Productos();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, prod.getProductos());
        objSPProductos.setAdapter(adapter);
    }

    public void Guardar (View view)
    {
        boolean a = (!objETNombre.getText().toString().trim().isEmpty());
        boolean b = (!objETDireccion.getText().toString().trim().isEmpty());
        boolean c = (!objETNumero.getText().toString().trim().isEmpty());
        boolean d = (!objETEmail.getText().toString().trim().isEmpty());
        if(a && b && c && d)
        {
            objTVMensaje.setText(objETNombre.getText().toString() + " los datos se han guardado, nos contactaremos con ud para su retiro");
        }
        else
        {
            objTVMensaje.setText("Por favor nodejar vacíos los campos");
        }

    }
}
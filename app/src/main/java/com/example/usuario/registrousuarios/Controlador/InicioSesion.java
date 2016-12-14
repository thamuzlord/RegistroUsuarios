package com.example.usuario.registrousuarios.Controlador;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.example.usuario.registrousuarios.R;

/**
 * Created by usuario on 13/12/2016.
 */

public class InicioSesion extends AppCompatActivity {

    private EditText usuario;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion);
        cargarVistas();
    }


    public void cargarVistas(){
        usuario = (EditText) findViewById(R.id.usuario);
        usuario.setText("Hola");
    }
}

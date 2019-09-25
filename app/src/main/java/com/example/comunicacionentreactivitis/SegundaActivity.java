package com.example.comunicacionentreactivitis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    public static final String NOMBRE = "nombre";
    public static final String APELLIDO = "apellido";
    private TextView textViewNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textViewNombre = findViewById(R.id.activitySegundaTextViewNombre);


        //recibimos/capturamos/recuperamos el intent
        Intent intentRecibido = getIntent();

        //recuperamos el bundle desde el intent
        Bundle bundleRecibido = intentRecibido.getExtras();

        //le sacamos el valor de la key nombre al bundle
        String nombreRecibido = bundleRecibido.getString(NOMBRE);
        String apellido1 = bundleRecibido.getString(APELLIDO);

        String mensaje = "El nombre recibido es " + nombreRecibido + apellido1;
        //Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();

        textViewNombre.setText(nombreRecibido + " " + apellido1);



    }
}

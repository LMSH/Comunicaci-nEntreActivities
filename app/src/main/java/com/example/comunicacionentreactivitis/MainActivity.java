package com.example.comunicacionentreactivitis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;
    private EditText editTextNombre;
    private EditText apellido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hacemos los findViewById de los elementos.
        buttonEnviar = findViewById(R.id.buttonEnviar);
        editTextNombre = findViewById(R.id.editTextNombre);
        apellido = findViewById(R.id.Apellido);

        //seteamos un listener de clicks para cuando hagan click en el boton Enviar
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tomamos el texto del editTextNombre y lo guardamos en la variable nombre de tipo string.
                String nombre = editTextNombre.getText().toString();
                String apellido1 = apellido.getText().toString();


                //Imprimimos a manera informativa una tostada con el nombre previamente tomado del editText
                Toast.makeText(MainActivity.this, (nombre + " " + apellido1), Toast.LENGTH_SHORT).show();
                //creamos un intent (Actividad donde estamos, Actividad a donde vamos.class)
                Intent unIntent = new Intent(MainActivity.this,SegundaActivity.class);

                //opcionalmente si vamos a llevar informacion necesitamos un bundle
                Bundle unBundle = new Bundle();
                unBundle.putString(SegundaActivity.APELLIDO, "Soler");
                unBundle.putString(SegundaActivity.NOMBRE,nombre);

                //asociamos el bundle al intent
                unIntent.putExtras(unBundle);
                //iniciamos la nueva actividad
                startActivity(unIntent);
            }
        });


    }
}

/**
 * Un Bundle es como un diccionario pero nos evita estar haciendo uno nuevo por cada tipo de valor
 *
 */
/**
 *                 Bundle unBundle = new Bundle();
 *                 unBundle.putInt("edad",25);
 *                 unBundle.putString("nombre","edu");
 *
 *                 Map<String,String> diccionario = new HashMap<>();
 *                 diccionario.put("nombre","edu");
 *                 diccionario.put("edad", 25);
 *
 *                 Map<String,Integer> diccionarioDeNumeros = new HashMap<>();
 *                 diccionarioDeNumeros.put("edad",25);
 *
 */

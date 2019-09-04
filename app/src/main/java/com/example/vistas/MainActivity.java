package com.example.vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    String[] peliculas = {"Avengers", "Ghost", "Thor", "X-Men"};
    int[] imagenes = {R.drawable.vengadores,R.drawable.ghost,R.drawable.thor,R.drawable.xmen};
    int[] calif = {10,5,8,7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista);

        lista = (ListView) findViewById(R.id.ListViewVistas);

        lista.setAdapter(new AdapterLista(this,peliculas,imagenes,calif));


    }
}

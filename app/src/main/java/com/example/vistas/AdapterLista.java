package com.example.vistas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class AdapterLista extends BaseAdapter {

    private static LayoutInflater inflater = null;
    Context contexto;
    String[] peliculas;
    int[] imagenes;
    int[] calificaciones;

    public AdapterLista(Context contexto, String[] peliculas, int[] imagenes, int[] calificaciones) {
        this.contexto = contexto;
        this.peliculas = peliculas;
        this.imagenes = imagenes;
        this.calificaciones = calificaciones;
        inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final View vista = inflater.inflate(R.layout.items,null);
        TextView pelicula = (TextView) vista.findViewById(R.id.ItemPelicula);
        ImageView imagen = (ImageView) vista.findViewById(R.id.itemImagen);
        RatingBar estrellas = (RatingBar) vista.findViewById(R.id.ItemCalificacion);

        pelicula.setText(peliculas[i]);
        imagen.setImageResource(imagenes[i]);
        estrellas.setProgress(calificaciones[i]);

        imagen.setTag(i);

        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent(contexto, VisorImg.class);
                visorImagen.putExtra("IMG",imagenes[(Integer)v.getTag()]);
                contexto.startActivity(visorImagen);
            }
        });

        return vista;
    }

    @Override
    public int getCount() {
        return imagenes.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}

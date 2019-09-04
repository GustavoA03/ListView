package com.example.vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class VisorImg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_img);

        ImageView img = (ImageView) findViewById(R.id.imagenCompleta);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b!=null)
            img.setImageResource(b.getInt("IMG"));
    }
}

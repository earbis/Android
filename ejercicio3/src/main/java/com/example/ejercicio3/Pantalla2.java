package com.example.ejercicio3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Pantalla2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
    }

    public static void mostrarMensaje(Context context, String message) {
        @SuppressLint("ResourceType")
        View view = LayoutInflater.from(context).inflate(R.id.customMessage, null);

    }

}

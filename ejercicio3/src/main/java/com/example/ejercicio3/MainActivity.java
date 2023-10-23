package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7;
    private Button b;
    private TextView tv;
    private ImageView miImagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg = (RadioGroup) findViewById(R.id.RadioGroup);
        rb1= (RadioButton)findViewById(R.id.radioButton);
        rb2= (RadioButton)findViewById(R.id.radioButton2);
        rb3= (RadioButton)findViewById(R.id.radioButton3);
        rb4= (RadioButton)findViewById(R.id.radioButton4);
        rb5= (RadioButton)findViewById(R.id.radioButton5);
        rb6= (RadioButton)findViewById(R.id.radioButton6);
        rb7= (RadioButton)findViewById(R.id.radioButton7);
        tv = (TextView) findViewById(R.id.text1);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Pantalla2.class);
                startActivity(i);
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radioButton) {
                    // Lógica para el caso Id1
                    miImagen.setImageResource(R.drawable.lunes);
                } else if (i == R.id.radioButton2) {
                    // Lógica para el caso Id2
                    miImagen.setImageResource(R.drawable.martes);
                } else if (i == R.id.radioButton3) {
                    // Lógica para el caso Id3
                    miImagen.setImageResource(R.drawable.miercoles);
                } else if (i == R.id.radioButton4) {
                    // Lógica para el caso Id4
                    miImagen.setImageResource(R.drawable.jueves);
                } else if (i == R.id.radioButton7) {
                    // Lógica para el caso Id7
                    miImagen.setImageResource(R.drawable.domingo);
                } else if (i == R.id.radioButton5) {
                    // Lógica para el caso Id5
                    miImagen.setImageResource(R.drawable.viernes);
                } else if (i == R.id.radioButton6) {
                    // Lógica para el caso Id6
                    miImagen.setImageResource(R.drawable.sabado);
                }
            }
        });



    }
    public void siguiente(View view){
        Intent i = new Intent(this, Pantalla2.class);
        startActivity(i);
    }
}
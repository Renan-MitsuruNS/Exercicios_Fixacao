package com.example.exerciciofixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void linkEx1 (View view){
            Intent in = new Intent(MainActivity.this, ExercicioUm.class);
            startActivity(in);
        }

    public void linkEx4 (View view){
        Intent in = new Intent(MainActivity.this, ExercicioQuatro.class);
        startActivity(in);
    }
}
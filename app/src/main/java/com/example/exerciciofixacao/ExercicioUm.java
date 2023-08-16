package com.example.exerciciofixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExercicioUm extends AppCompatActivity {

    private EditText editN1;
    private EditText editN2;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_um);

        editN1 = findViewById(R.id.editN1);
        editN2 = findViewById(R.id.editN2);
        txtResultado = findViewById(R.id.txtResultado);
    }
    /*Criando Método para checar se são múltiplos ou não*/

    public void ChecarMultiplos(View view){
        double num1 = Double.parseDouble(editN1.getText().toString());
        double num2 = Double.parseDouble(editN2.getText().toString());

        double resultado = num1 % num2;

        if (resultado >0){
            txtResultado.setText("Números não múltiplos");
        }
        else {
            txtResultado.setText("Números múltiplos");
        }

    }
}
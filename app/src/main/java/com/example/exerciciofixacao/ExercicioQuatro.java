package com.example.exerciciofixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExercicioQuatro extends AppCompatActivity {

    EditText idhorario;
    TextView idresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_quatro);
    }
    public int CalcularHorario(View view){
        idhorario = findViewById(R.id.editNum1);
        idresultado = findViewById(R.id.txtResult);

        int horario = Integer.parseInt(idhorario.getText().toString());



        int horarioFinal = (horario + 6) % 24;



        idresultado.setText(String.valueOf(horarioFinal));
        return horario;
    }
}
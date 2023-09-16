package com.example.conversodemoeda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Real;
    private EditText Dolar;
    private AppCompatButton botao;
    private TextView Resultado; // Altere o nome para corresponder ao ID do XML

    private TextView Erro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Real = findViewById(R.id.Real1);
        Dolar = findViewById(R.id.Dolar1);

        Resultado = findViewById(R.id.Resultado1);



    }

    public void conversor(View view) {
        String realText = Real.getText().toString();
        String dolarText = Dolar.getText().toString();

        if (realText.isEmpty() || dolarText.isEmpty()) {
            // Pelo menos um dos campos está vazio, mostre uma mensagem de erro
            Resultado.setTextColor(getResources().getColor(R.color.red)); // Definir a cor do texto como vermelho
            Resultado.setText("Erro!");
            return;
        }

        double real = Double.parseDouble(realText);
        double dolar = Double.parseDouble(dolarText);

        double resultado = real / dolar;

        Resultado.setTextColor(getResources().getColor(R.color.black));
        Resultado.setVisibility(View.VISIBLE); // Tornar o TextView visível
        Resultado.setText("U$ " + resultado);
    }
}


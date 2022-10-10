package com.example.appteste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // atributo tipo botão ID dos elementos na activity
    Button btnTela2,btnFechar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* TROCA DE TELA */
        // localizar o elemento pelo ID e atribuir os valores ao atributo
        btnTela2 = findViewById(R.id.btnTela2);
        // configurando o botão com a opção de click
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // instanciando a tela/activity - na tela arquivo java, ex: Tela2.class
                Intent tela2 = new Intent(getApplicationContext(), Tela2.class);
                // inicia a intent = tela 2 = activity
                startActivity(tela2);
            }
        });
        /* BOTÃO DE FECHAR O APLICATIVO */
        btnFechar = findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // comando para fechar o aplicativo
                finish();
                finishActivity();
            }
        });
    }
}
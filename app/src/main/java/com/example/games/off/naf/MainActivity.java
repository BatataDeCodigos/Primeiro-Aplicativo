package com.example.games.off.naf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // pega o botão do XML
        Button btn1 = findViewById(R.id.btn1);

        // ação do clique
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // cria o "caminho" para a próxima tela
                Intent intent = new Intent(MainActivity.this, secondActivy.class);

                // abre a próxima tela
                startActivity(intent);
            }
        });
    }
}

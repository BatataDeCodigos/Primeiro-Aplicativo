package com.example.games.off.naf;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        // pega o botão do XML
        Button btn2 = findViewById(R.id.btn2);

        // ação do clique
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // cria o "caminho" para a próxima tela
                Intent intent = new Intent(secondActivy.this, thirdActivy.class);

                // abre a próxima tela
                startActivity(intent);
            }

        });
    }
}


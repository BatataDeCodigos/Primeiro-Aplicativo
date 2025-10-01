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

        }

    // fazer um botão que volte para a activity principal
    Button btnvoltar = findViewById(R.id.btnvoltar);
    //ação do clique
        public void ONclick(View){
            //voltará para a mainactivity
        finish();

       }

        }




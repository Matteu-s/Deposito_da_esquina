package com.mateussantosti.deposito_da_esquina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnDinheiro = (Button)findViewById(R.id.btnDinheiro);
        btnDinheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this, pedidoConcluido.class ));
            }
        });

        Button btnCartao = (Button)findViewById(R.id.btnCartao);
        btnCartao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this, pedidoConcluido.class ));
            }
        });
    }
}
package com.mateussantosti.deposito_da_esquina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class produtos_carrinho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos_carrinho);

        Button btnReturnWhisky = (Button)findViewById(R.id.btnReturnWhisky);
        btnReturnWhisky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(produtos_carrinho.this, produtos_whisky.class ));

            }
        });

        Button btnFinalizarCompra = (Button)findViewById(R.id.btnFinalizarCompra);
        btnFinalizarCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(produtos_carrinho.this, login.class ));

            }
        });
    }
}
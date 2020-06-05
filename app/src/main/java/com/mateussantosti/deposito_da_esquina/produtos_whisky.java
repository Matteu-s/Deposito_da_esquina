package com.mateussantosti.deposito_da_esquina;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class produtos_whisky extends AppCompatActivity {
    public int produto = 1;
    public int produto2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos_whisky);

        Button btnWhiskyRedLabelCarrinho = (Button)findViewById(R.id.btnWRedLabelCarrinho);
        btnWhiskyRedLabelCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                produto = produto +1;
                exibirTexto();
            }
            public void exibirTexto(){
                Context context = getApplicationContext();
                CharSequence text = "Foram adicionados "+produto;
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button btnWhiskyJackDanielsCarrinho = (Button)findViewById(R.id.btnWJackDanielsCarrinho);
        btnWhiskyJackDanielsCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                produto2 = produto2 +1;
                exibirTexto();
            }
            public void exibirTexto(){
                Context context = getApplicationContext();
                CharSequence text = "Foram adicionados "+produto;
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button btnReturn = (Button)findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(produtos_whisky.this, MainActivity.class ));
            }
        });

        Button btnCarrinho = (Button)findViewById(R.id.btnCarrinho);
        btnCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(produtos_whisky.this, produtos_carrinho.class ));
            }
        });
    }
}
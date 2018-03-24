package com.example.jucel.lucynocontrole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView valorProduto,valorQuant,telaTotal;
    double totalProduto,produto;
    double totalCompra = 0;
    int quantidade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        valorProduto =  findViewById(R.id.valorProduto);
        valorQuant =  findViewById(R.id.valorQuantidade);
        telaTotal = findViewById(R.id.txtTotal);


    }

    public void calcularCompra(View view){

        produto = Double.parseDouble(valorProduto.getText().toString());
        quantidade = Integer.parseInt(valorQuant.getText().toString());

        if(produto== 0 ){
            produto = 0;

        }else if(quantidade == 0){
            quantidade = 1;

        }
            totalProduto = produto * quantidade;

            totalCompra = totalProduto + totalCompra;

            telaTotal.setText(String.valueOf(String.format("%.2f",totalCompra)));
            valorProduto.setText("");
            valorQuant.setText("");
            valorProduto.requestFocus();
        }

        


    }

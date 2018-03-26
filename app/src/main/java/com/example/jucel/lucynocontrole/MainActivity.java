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

        if(valorProduto.getText().toString().equals("")) {
            valorProduto.setError("Preencha este campo!");
            valorProduto.requestFocus();
            return;
        }
        if(valorQuant.getText().toString().equals("")) {
            valorQuant.setText("1");
        }
        metodoCalculo();


    }

    void metodoCalculo(){

        produto = Double.parseDouble(valorProduto.getText().toString());
        quantidade = Integer.parseInt(valorQuant.getText().toString());

        totalProduto = produto * quantidade;

        totalCompra = totalProduto + totalCompra;

        telaTotal.setText(String.valueOf(String.format("%.2f",totalCompra)));
        valorProduto.setText("");
        valorQuant.setText("");
        valorProduto.requestFocus();
    }

        


    }


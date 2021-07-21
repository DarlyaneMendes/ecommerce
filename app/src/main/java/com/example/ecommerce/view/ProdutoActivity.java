package com.example.ecommerce.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import com.example.ecommerce.viewModel.ClienteViewModel;
import com.example.ecommerce.databinding.ActivityProdutoBinding;

public class ProdutoActivity extends AppCompatActivity {

    private ClienteViewModel clienteViewModel;
    private ActivityProdutoBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProdutoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Cadastro de Produto");

        final TextView textViewCodigoProduto = binding.textViewCodigoProduto;
        final EditText editTextCodigoProduto = binding.editTextCodigoProduto;
        final TextView textViewDescricaoProduto = binding.textViewDescricaoProduto;
        final EditText editTextDescricaoProduto = binding.editTextDescricaoProduto;
        final TextView textViewCategoriaProduto = binding.textViewCategoriaProduto;
        final EditText editTextCategoriaProduto = binding.editTextCategoriaProduto;
        final TextView textViewQuantidadeDisponivel = binding.textViewQuantidadeDisponivel;
        final EditText editTextQuantidadeDisponivel = binding.editTextQuantidadeDisponivel;
        final Button buttonSalvar = binding.buttonSalvar;
        final Button buttonCancelar = binding.buttonCancelar;

        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProdutoActivity.this);
                builder.setMessage("Deseja cancelar?");
                builder.setCancelable(true);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                });
                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();

                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}
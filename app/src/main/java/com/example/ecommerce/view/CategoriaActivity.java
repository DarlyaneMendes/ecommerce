package com.example.ecommerce.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.ecommerce.viewModel.ClienteViewModel;
import com.example.ecommerce.databinding.ActivityCategoriaBinding;

import java.util.HashMap;
import java.util.Map;

public class CategoriaActivity extends AppCompatActivity {

    private ClienteViewModel clienteViewModel;
    private ActivityCategoriaBinding binding;

    Intent intent = getIntent();

    private TextView textViewCadastroCategoria, textViewCodigo, textViewDescricaoCatgoria;
    private Button buttonSalvar, buttonCancelar;
    private Map<String,String> cadastroCategoria = new HashMap<String, String>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCategoriaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final TextView textViewCadastroCategoria = binding.textViewCadastroCategoria;
        final TextView textViewCodigo = binding.textViewCodigo;
        final TextView textViewDescricaoCategoria = binding.textViewDescricao;
        final Button buttonSalvar = binding.buttonSalvar;
        final Button buttonCancelar = binding.buttonCancelar;
        final ImageButton imageButtonHome = binding.imageButtonHome;
        final ImageButton imageButtonPerfil = binding.imageButtonPerfil;
        final ImageButton imageButtonSair = binding.imageButtonSair;

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //BancoController crud = new BancoController(getBaseContext());

                cadastroCategoria.put("codigo", textViewCodigo.getText().toString());
                cadastroCategoria.put("descricao", textViewDescricaoCategoria.getText().toString());

                Snackbar.make(v, "Salvando...", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CategoriaActivity.this);
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

        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoriaActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


        imageButtonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CategoriaActivity.this);
                builder.setMessage("Deseja sair do aplicativo?");
                builder.setCancelable(true);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                        System.exit(0);

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
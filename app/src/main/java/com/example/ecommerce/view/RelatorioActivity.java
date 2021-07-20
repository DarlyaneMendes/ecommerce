package com.example.ecommerce.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.ecommerce.viewModel.ClienteViewModel;
import com.example.ecommerce.databinding.ActivityRelatorioBinding;

public class RelatorioActivity extends AppCompatActivity {

    private ClienteViewModel clienteViewModel;
    private ActivityRelatorioBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRelatorioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final TextView textViewGerarRelatorio = binding.textViewGerarRelatorio;
        final TextView textViewDataInicial = binding.textViewDataInicial;
        final EditText editTextDataInicial = binding.editTextDataInicial;
        final TextView textViewDataFinal = binding.textViewDataFinal;
        final Button buttonGerar = binding.buttonGerar;
        final ImageButton imageButtonHome = binding.imageButtonHome;
        final ImageButton imageButtonPerfil = binding.imageButtonPerfil;
        final ImageButton imageButtonSair = binding.imageButtonSair;


        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelatorioActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        imageButtonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(RelatorioActivity.this);
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
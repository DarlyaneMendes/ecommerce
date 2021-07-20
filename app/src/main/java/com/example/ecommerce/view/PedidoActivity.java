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
import com.example.ecommerce.databinding.ActivityPedidoBinding;

public class PedidoActivity extends AppCompatActivity {

    private ClienteViewModel clienteViewModel;
    private ActivityPedidoBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPedidoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final TextView textViewCadastroPedido = binding.textViewCadastroPedido;
        final TextView textViewCodigoPedido = binding.textViewCodigoPedido;
        final EditText editTextCodigoPedido = binding.editTextCodigoPedido;
        final TextView textViewDataPedido = binding.textViewDataPedido;
        final EditText editTextDataPedido = binding.editTextDataPedido;
        final TextView textViewCpf = binding.textViewCpf;
        final EditText editTextCpf = binding.editTextCpf;
        final TextView textViewItemPedido = binding.textViewItemPedido;
        final EditText editTextItemPedido = binding.editTextItemPedido;
        final TextView textViewQuantidade = binding.textViewQuantidade;
        final EditText editTextQuantidade = binding.editTextQuantidade;
        final Button buttonSalvar = binding.buttonSalvar;
        final Button buttonCancelar = binding.buttonCancelar;
        final ImageButton imageButtonHome = binding.imageButtonHome;
        final ImageButton imageButtonPerfil = binding.imageButtonPerfil;
        final ImageButton imageButtonSair = binding.imageButtonSair;


        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PedidoActivity.this);
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
                Intent intent = new Intent(PedidoActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        imageButtonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PedidoActivity.this);
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
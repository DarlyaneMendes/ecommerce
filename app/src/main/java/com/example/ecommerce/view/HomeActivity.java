package com.example.ecommerce.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.ecommerce.viewModel.HomeViewModel;
import com.example.ecommerce.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private HomeViewModel homeViewModel;
    private ActivityHomeBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final ImageButton imageButtonCliente = binding.imageButtonCliente;
        final TextView textViewCliente = binding.textViewCliente;
        final ImageButton imageButtonProduto = binding.imageButtonProduto;
        final TextView textViewProduto = binding.textViewProduto;
        final ImageButton imageButtonPedido = binding.imageButtonPedido;
        final TextView textViewPedido = binding.textViewPedido;
        final ImageButton imageButtonCategoria = binding.imageButtonCategoria;
        final TextView textViewCategoria = binding.textViewCategoria;
        final ImageButton imageButtonRelatorio = binding.imageButtonRelatorio;
        final TextView textViewRelatorio = binding.textViewRelatorio;
        final ImageButton imageButtonHome = binding.imageButtonHome;
        final ImageButton imageButtonPerfil = binding.imageButtonPerfil;
        final ImageButton imageButtonSair = binding.imageButtonSair;


        imageButtonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imageButtonCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ListaClienteActivity.class);
                startActivity(intent);
            }
        });

        textViewCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ListaClienteActivity.class);
                startActivity(intent);
            }
        });

        imageButtonPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ListaPedidoActivity.class);
                startActivity(intent);
            }
        });

        textViewPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ListaPedidoActivity.class);
                startActivity(intent);
            }
        });

        imageButtonProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ListaProdutoActivity.class);
                startActivity(intent);
            }
        });

        textViewProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ListaProdutoActivity.class);
                startActivity(intent);
            }
        });

        imageButtonCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ListaCategoriaActivity.class);
                startActivity(intent);
            }
        });

        textViewCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ListaCategoriaActivity.class);
                startActivity(intent);
            }
        });

        imageButtonRelatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ListaRelatorioActivity.class);
                startActivity(intent);
            }
        });

        textViewRelatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ListaRelatorioActivity.class);
                startActivity(intent);
            }
        });

        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        imageButtonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
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
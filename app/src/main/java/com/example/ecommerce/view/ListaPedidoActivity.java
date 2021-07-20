package com.example.ecommerce.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.ecommerce.viewModel.ClienteViewModel;
import com.example.ecommerce.databinding.ActivityListaPedidoBinding;

public class ListaPedidoActivity extends AppCompatActivity {

    private ClienteViewModel clienteViewModel;
    private @NonNull ActivityListaPedidoBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListaPedidoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final TextView textViewListaPedido= binding.textViewListaPedido;
        final RecyclerView recyclerViewPedido = binding.recyclerViewPedido;
        final FloatingActionButton floatingActionButtonAdicionar = binding.floatingActionButtonAdicionar;
        final ImageButton imageButtonHome = binding.imageButtonHome;
        final ImageButton imageButtonCliente = binding.imageButtonCliente;
        final ImageButton imageButtonEditar = binding.imageButtonEditar;
        final ImageButton imageButtonExcluir = binding.imageButtonExcluir;
        final ImageButton imageButtonSair = binding.imageButtonSair;

        floatingActionButtonAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaPedidoActivity.this, PedidoActivity.class);
                startActivity(intent);
            }
        });

        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaPedidoActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        imageButtonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ListaPedidoActivity.this);
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
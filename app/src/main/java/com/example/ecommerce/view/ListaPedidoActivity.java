package com.example.ecommerce.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.example.ecommerce.R;
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

        setTitle("Pedido");

        final RecyclerView recyclerViewPedido = binding.recyclerViewPedido;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_novo:
                Intent intent = new Intent(this, PedidoActivity.class);
                startActivity(intent);
                break;

            case R.id.action_editar:

                break;

            case R.id.action_excluir:

                break;

            case R.id.action_buscar:

                break;
        }
        return false;
    }
}
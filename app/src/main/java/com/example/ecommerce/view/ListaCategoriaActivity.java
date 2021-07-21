package com.example.ecommerce.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import com.example.ecommerce.R;
import com.example.ecommerce.viewModel.ClienteViewModel;
import com.example.ecommerce.databinding.ActivityListaCategoriaBinding;

public class ListaCategoriaActivity extends AppCompatActivity {

    final String TAG = getClass().getSimpleName();

    private @NonNull ActivityListaCategoriaBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListaCategoriaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Categoria");


        final RecyclerView recyclerViewCategoria = binding.recyclerViewCategoria;

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
                Intent intent = new Intent(ListaCategoriaActivity.this, CategoriaActivity.class);
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
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

        setTitle("Relatório");

        final TextView textViewDataInicial = binding.textViewDataInicial;
        final EditText editTextDataInicial = binding.editTextDataInicial;
        final TextView textViewDataFinal = binding.textViewDataFinal;
        final Button buttonGerar = binding.buttonGerar;
    }
}
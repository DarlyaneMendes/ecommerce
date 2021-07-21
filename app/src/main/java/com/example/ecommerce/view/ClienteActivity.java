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
import com.example.ecommerce.databinding.ActivityClienteBinding;

public class ClienteActivity extends AppCompatActivity {

    private ClienteViewModel clienteViewModel;
    private ActivityClienteBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityClienteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Cadastro de Cliente");

        final TextView textViewCpf = binding.textViewCpf;
        final EditText editTextCpf = binding.editTextCpf;
        final TextView textViewNome = binding.textViewNome;
        final EditText editTextNome = binding.editTextNome;
        final TextView textViewEndereco = binding.textViewEndereco;
        final EditText editTextEndereco = binding.editTextEndereco;
        final TextView textViewEstado = binding.textViewEstado;
        final EditText editTextCidade = binding.editTextCidade;
        final TextView textViewTelefone = binding.textViewTelefone;
        final EditText editTextEmail = binding.editTextEmail;
        final Button buttonSalvar = binding.buttonSalvar;
        final Button buttonCancelar = binding.buttonCancelar;



        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ClienteActivity.this);
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
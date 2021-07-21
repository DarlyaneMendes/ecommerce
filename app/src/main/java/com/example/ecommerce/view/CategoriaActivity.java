package com.example.ecommerce.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.ecommerce.R;
import com.example.ecommerce.model.Categoria;
import com.example.ecommerce.viewModel.CategoriaViewModel;
import com.example.ecommerce.viewModel.ClienteViewModel;
import com.example.ecommerce.databinding.ActivityCategoriaBinding;

public class CategoriaActivity extends AppCompatActivity {

    final String TAG = getClass().getSimpleName();

    public static Context contexto;
    Button buttonSalvar;
    Button buttonCancelar;

    TextView textViewCodigo;
    TextView textViewDescricaoCatgoria;

    boolean NOVO = false;

    public void atualizarCampos (Categoria categoria){

        textViewCodigo.setText(categoria.getCodCategoria());
        textViewDescricaoCatgoria.setText(categoria.getNomeCategoria());
    }

    private ClienteViewModel clienteViewModel;
    private ActivityCategoriaBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCategoriaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Cadastro de Categoria");

        contexto = getBaseContext();

        final CategoriaViewModel categoriaViewModel = new CategoriaViewModel();

        final TextView textViewCodigo = binding.textViewCodigo;
        final TextView textViewDescricaoCategoria = binding.textViewDescricao;
        final Button buttonSalvar = binding.buttonSalvar;
        final Button buttonCancelar = binding.buttonCancelar;


        /*buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (NOVO == true) {

                    if (categoriaViewModel.salvarCategoria(textViewCodigo.getText().toString(),
                            textViewDescricaoCategoria.getText().toString())) {

                        Toast.makeText(CategoriaActivity.this, "Categoria salvo com sucesso",
                                Toast.LENGTH_SHORT).show();
                    } else {

                        Toast.makeText(CategoriaActivity.this, "Categoria não foi salvo com sucesso",
                                Toast.LENGTH_SHORT).show();
                    }
                } else {
                    if (categoriaViewModel.atualizarCategoria(textViewCodigo.getText().toString(),
                            textViewDescricaoCategoria.getText().toString())) {

                        Toast.makeText(CategoriaActivity.this, "Categoria atualizado com sucesso",
                                Toast.LENGTH_SHORT).show();
                    } else {

                        Toast.makeText(CategoriaActivity.this, "Categoria não foi atualizado com sucesso",
                                Toast.LENGTH_SHORT).show();
                    }
                }
                NOVO = false;
            }
        });*/

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
            }
        }
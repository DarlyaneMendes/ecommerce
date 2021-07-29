package com.example.ecommerce.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import com.example.ecommerce.Constant;
import com.example.ecommerce.ProdutoAPI;
import com.example.ecommerce.viewModel.ClienteViewModel;
import com.example.ecommerce.databinding.ActivityProdutoBinding;
import com.example.ecommerce.viewModel.ProdutoViewModel;

import org.jetbrains.annotations.NotNull;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.ecommerce.Constant.BASE_URL;

public class ProdutoActivity extends AppCompatActivity {

    EditText editTextCodigoProduto;
    EditText editTextDescricaoProduto;
    EditText editTextCategoriaProduto;
    EditText editTextQuantidadeDisponivel;
    EditText editTextPreco;

    private ClienteViewModel clienteViewModel;
    private ActivityProdutoBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProdutoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Cadastro de Produto");

        editTextCodigoProduto = binding.editTextCodigoProduto;
        editTextDescricaoProduto = binding.editTextDescricaoProduto;
        editTextCategoriaProduto = binding.editTextCategoriaProduto;
        editTextQuantidadeDisponivel = binding.editTextQuantidadeDisponivel;
        editTextPreco = binding.editTextPreco;

        final Button buttonSalvar = binding.buttonSalvar;
        final Button buttonCancelar = binding.buttonCancelar;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(new Constant.NullOnEmptyConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        buttonSalvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ProdutoViewModel listaProdutoResponse = new ProdutoViewModel(
                        Integer.parseInt(editTextCodigoProduto.getText().toString()),
                        editTextDescricaoProduto.getText().toString(),
                        Integer.parseInt(editTextQuantidadeDisponivel.getText().toString()),
                        Integer.parseInt(editTextPreco.getText().toString()),
                        editTextCategoriaProduto.getText().toString());

                final String json  =  "{\"codProduto\": \"" + editTextCodigoProduto.getText().toString() +
                        "\", \"nomeProduto\": \"" + editTextDescricaoProduto.getText().toString() +
                        "\", \"precoProduto\": \"" + editTextPreco.getText().toString() +
                        "\", \"quantidadeEstoque\": \"" + editTextQuantidadeDisponivel.getText().toString() +
                        "\", \"categoriaProduto\": \"" + editTextCategoriaProduto.getText().toString() +
                        "\"}";

                RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), json);

                ProdutoAPI service = retrofit.create(ProdutoAPI.class);
                Call<ProdutoViewModel> call = service.postProduto(body);


                call.enqueue(new Callback<ProdutoViewModel>() {
                    @Override
                    public void onResponse(@NotNull Call<ProdutoViewModel> call, Response<ProdutoViewModel> response) {

                        Toast.makeText(ProdutoActivity.this, "Produto salvo com sucesso",
                                Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(ProdutoActivity.this, ListaProdutoActivity.class);
                        startActivity(intent);

                        if (response.isSuccessful()){

                            ProdutoViewModel listaProdutoResponse = response.body();

                        }
                    }

                    @Override
                    public void onFailure(Call<ProdutoViewModel> call, Throwable t) {

                    }


                });
            }
        });

        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProdutoActivity.this);
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
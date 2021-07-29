package com.example.ecommerce.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import com.example.ecommerce.Constant;
import com.example.ecommerce.ProdutoAPI;
import com.example.ecommerce.viewModel.ProdutoViewModel;

import com.example.ecommerce.databinding.ActivityListaProdutoBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.ecommerce.Constant.BASE_URL;

public class ListaProdutoActivity extends AppCompatActivity {

    EditText editTextCodigo;

    private ProdutoViewModel ProdutoViewModel;
    private @NonNull ActivityListaProdutoBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListaProdutoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Produto");


        editTextCodigo = binding.editTextCodigoProduto;

        final Button buttonNovo = binding.buttonNovoProduto;
        final Button buttonBuscar = binding.buttonBuscarProduto;
        final Button buttonExcluir = binding.buttonExcluirProduto;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(new Constant.NullOnEmptyConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        buttonNovo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListaProdutoActivity.this, ProdutoActivity.class);
                startActivity(intent);
            }
        });

        buttonBuscar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final String codProduto = editTextCodigo.getText().toString();

                ProdutoAPI service = retrofit.create(ProdutoAPI.class);
                Call<List<ProdutoViewModel>> call = service.getProduto(codProduto);


                call.enqueue(new Callback<List<ProdutoViewModel>>() {
                    @Override
                    public void onResponse(Call<List<ProdutoViewModel>> call, Response<List<ProdutoViewModel>> response) {


                        if (response.isSuccessful()) {

                            ProdutoViewModel listaProdutoResponse = (ProdutoViewModel) response.body();

                        }
                    }

                    @Override
                    public void onFailure(Call<List<ProdutoViewModel>> call, Throwable t) {

                    }

                });

                Toast.makeText(ListaProdutoActivity.this, "Funcionalidade não implementada.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        buttonExcluir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                final String codProduto = editTextCodigo.getText().toString();

                    Integer codigo = (Integer.parseInt(String.valueOf(codProduto)));

                    ProdutoAPI service = retrofit.create(ProdutoAPI.class);
                    Call<ProdutoViewModel> call = service.deleteProduto(codigo);


                    call.enqueue(new Callback<ProdutoViewModel>() {
                        @Override
                        public void onResponse(Call<ProdutoViewModel> call, Response<ProdutoViewModel> response) {


                            Toast.makeText(ListaProdutoActivity.this, "Produto excluído com sucesso",
                                    Toast.LENGTH_SHORT).show();

                            if (response.isSuccessful()) {

                                ProdutoViewModel listaProdutoResponse = response.body();

                            }
                        }

                        @Override
                        public void onFailure(Call<ProdutoViewModel> call, Throwable t) {

                        }

                    });

                editTextCodigo.getText().clear();
            }
        });

    }
}
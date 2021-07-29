package com.example.ecommerce.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecommerce.CategoriaAPI;
import com.example.ecommerce.Constant;

import com.example.ecommerce.databinding.ActivityListaCategoriaBinding;
import com.example.ecommerce.viewModel.CategoriaViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.ecommerce.Constant.BASE_URL;

public class ListaCategoriaActivity extends AppCompatActivity {

    EditText editTextCodigo;

    private CategoriaViewModel categoriaViewModel;
    private ActivityListaCategoriaBinding binding;


    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListaCategoriaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Categoria");

        editTextCodigo = binding.editTextCodigo;

        final Button buttonNovo = binding.buttonNovoCategoria;
        final Button buttonBuscar = binding.buttonBuscarCategoria;
        final Button buttonExcluir = binding.buttonExcluirCategoria;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(new Constant.NullOnEmptyConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        buttonNovo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListaCategoriaActivity.this, CategoriaActivity.class);
                startActivity(intent);
            }
        });

        buttonBuscar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final String codCategoria = editTextCodigo.getText().toString();

                CategoriaAPI service = retrofit.create(CategoriaAPI.class);
                Call<CategoriaViewModel> call = service.getCategoria(codCategoria);


                call.enqueue(new Callback<CategoriaViewModel>() {
                    @Override
                    public void onResponse(Call<CategoriaViewModel> call, Response<CategoriaViewModel> response) {


                        Toast.makeText(ListaCategoriaActivity.this, "Categoria excluída com sucesso",
                                Toast.LENGTH_SHORT).show();

                        if (response.isSuccessful()) {

                            CategoriaViewModel listaCategoriaResponse = response.body();

                        }
                    }

                    @Override
                    public void onFailure(Call<CategoriaViewModel> call, Throwable t) {

                    }

                });

                Toast.makeText(ListaCategoriaActivity.this, "Funcionalidade não implementada.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        buttonExcluir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                final String codCategoria = editTextCodigo.getText().toString();

                    Integer codigo = (Integer.parseInt(String.valueOf(codCategoria)));

                    CategoriaAPI service = retrofit.create(CategoriaAPI.class);
                    Call<CategoriaViewModel> call = service.deleteCategoria (codigo);


                    call.enqueue(new Callback<CategoriaViewModel>() {
                        @Override
                        public void onResponse(Call<CategoriaViewModel> call, Response<CategoriaViewModel> response) {


                            Toast.makeText(ListaCategoriaActivity.this, "Categoria excluída com sucesso",
                                    Toast.LENGTH_SHORT).show();

                            if (response.isSuccessful()) {

                                CategoriaViewModel listaCategoriaResponse = response.body();

                            }
                        }

                        @Override
                        public void onFailure(Call<CategoriaViewModel> call, Throwable t) {

                        }

                    });

                editTextCodigo.getText().clear();
            }

        });
    }

}
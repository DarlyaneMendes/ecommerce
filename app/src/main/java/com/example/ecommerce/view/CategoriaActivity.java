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

import com.example.ecommerce.CategoriaAPI;
import com.example.ecommerce.Constant;
import com.example.ecommerce.viewModel.CategoriaViewModel;
import com.example.ecommerce.viewModel.ClienteViewModel;
import com.example.ecommerce.databinding.ActivityCategoriaBinding;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.ecommerce.Constant.BASE_URL;

public class CategoriaActivity extends AppCompatActivity {

    EditText editTextCodigo;
    EditText editTextDescricao;

    private ClienteViewModel clienteViewModel;
    private ActivityCategoriaBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCategoriaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Cadastro de Categoria");

        editTextCodigo = binding.editTextCodigo;
        editTextDescricao = binding.editTextDescricao;

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

                CategoriaViewModel listaCategoriaResponse = new CategoriaViewModel(
                        editTextCodigo.getText().toString(), editTextDescricao.getText().toString());

                final String json  =  "{\"codCategoria\": \"" +
                        editTextCodigo.getText().toString() +
                        "\", \"nomeCategoria\": \"" + editTextDescricao.getText().toString() +
                        "\"}";

                RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), json);

                CategoriaAPI service = retrofit.create(CategoriaAPI.class);
                Call<CategoriaViewModel> call = service.postCategoria(body);


                call.enqueue(new Callback<CategoriaViewModel>() {
                    @Override
                    public void onResponse(Call<CategoriaViewModel> call, Response<CategoriaViewModel> response) {

                        Toast.makeText(CategoriaActivity.this, "Categoria salvo com sucesso",
                                Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(CategoriaActivity.this, ListaCategoriaActivity.class);
                        startActivity(intent);

                        if (response.isSuccessful()){

                            CategoriaViewModel listaCategoriaResponse = response.body();

                        }
                    }

                    @Override
                    public void onFailure(Call<CategoriaViewModel> call, Throwable t) {

                    }

                });
            }
        });

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
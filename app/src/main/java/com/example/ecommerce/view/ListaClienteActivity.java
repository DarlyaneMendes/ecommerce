package com.example.ecommerce.view;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.example.ecommerce.ClienteAPI;
import com.example.ecommerce.Constant;

import com.example.ecommerce.viewModel.ClienteViewModel;
import com.example.ecommerce.databinding.ActivityListaClienteBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.ecommerce.Constant.BASE_URL;

public class ListaClienteActivity extends AppCompatActivity {

    EditText editTextCpf;

    private ClienteViewModel clienteViewModel;
    private @NonNull ActivityListaClienteBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListaClienteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Cliente");

        editTextCpf = binding.editTextCpf;

        final Button buttonNovo = binding.buttonNovoCliente;
        final Button buttonBuscar = binding.buttonBuscarCliente;
        final Button buttonExcluir = binding.buttonExcluirCliente;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(new Constant.NullOnEmptyConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        buttonNovo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaClienteActivity.this, ClienteActivity.class);
                startActivity(intent);
                                          }
        });

        buttonBuscar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final String cpf = editTextCpf.getText().toString();

                ClienteAPI service = retrofit.create(ClienteAPI.class);
                Call<List<ClienteViewModel>> call = service.getCliente(cpf);


                call.enqueue(new Callback<List<ClienteViewModel>>() {
                    @Override
                    public void onResponse(Call<List<ClienteViewModel>> call, Response<List<ClienteViewModel>> response) {


                        if (response.isSuccessful()) {

                            ClienteViewModel listaCategoriaResponse = (ClienteViewModel) response.body();

                        }
                    }

                    @Override
                    public void onFailure(Call<List<ClienteViewModel>> call, Throwable t) {

                    }

                });

                Toast.makeText(ListaClienteActivity.this, "Funcionalidade não implementada.",
                        Toast.LENGTH_SHORT).show();
            }

        });


        buttonExcluir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                final String cpf = editTextCpf.getText().toString();

                    Integer codigo = (Integer.parseInt(String.valueOf(cpf)));

                    ClienteAPI service = retrofit.create(ClienteAPI.class);
                    Call<ClienteViewModel> call = service.deleteCliente(codigo);


                    call.enqueue(new Callback<ClienteViewModel>() {
                        @Override
                        public void onResponse(Call<ClienteViewModel> call, Response<ClienteViewModel> response) {


                            Toast.makeText(ListaClienteActivity.this, "Cliente excluído com sucesso",
                                    Toast.LENGTH_SHORT).show();

                            if (response.isSuccessful()) {

                                ClienteViewModel listaClienteResponse = response.body();

                            }
                        }

                        @Override
                        public void onFailure(Call<ClienteViewModel> call, Throwable t) {

                        }

                    });

                editTextCpf.getText().clear();
            }
        });
    }


}
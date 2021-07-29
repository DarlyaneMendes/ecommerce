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

import com.example.ecommerce.ClienteAPI;
import com.example.ecommerce.Constant;
import com.example.ecommerce.viewModel.ClienteViewModel;
import com.example.ecommerce.databinding.ActivityClienteBinding;

import org.jetbrains.annotations.NotNull;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.ecommerce.Constant.BASE_URL;

public class ClienteActivity extends AppCompatActivity {

    EditText editTextCpf;
    EditText editTextNome;
    EditText editTextEndereco;
    EditText editTextEstado;
    EditText editTextMunicipio;
    EditText editTextTelefone;
    EditText editTextEmail;
    EditText editTextSenha;

    private ClienteViewModel clienteViewModel;
    private ActivityClienteBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityClienteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Cadastro de Cliente");

        editTextCpf = binding.editTextCpf;
        editTextNome = binding.editTextNome;
        editTextEndereco = binding.editTextEndereco;
        editTextEstado = binding.editTextEstado;
        editTextMunicipio = binding.editTextMunicipio;
        editTextTelefone = binding.editTextTelefone;
        editTextEmail = binding.editTextEmail;
        editTextSenha = binding.editTextSenha;

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

                ClienteViewModel listaClienteResponse = new ClienteViewModel(
                        editTextCpf.getText().toString(),
                        editTextNome.getText().toString(),
                        editTextEndereco.getText().toString(),
                        editTextEstado.getText().toString(),
                        editTextMunicipio.getText().toString(),
                        editTextTelefone.getText().toString(),
                        editTextEmail.getText().toString(),
                        editTextSenha.getText().toString());

                final String json  =  "{\"cpf\": \"" + editTextCpf.getText().toString() +
                        "\", \"nomeCliente\": \"" + editTextNome.getText().toString() +
                        "\", \"endereco\": \"" + editTextEndereco.getText().toString() +
                        "\", \"estado\": \"" + editTextEstado.getText().toString() +
                        "\", \"municipio\": \"" + editTextMunicipio.getText().toString() +
                        "\", \"telefone\": \"" + editTextTelefone.getText().toString() +
                        "\", \"email\": \"" + editTextEmail.getText().toString() +
                        "\", \"senha\": \"" + editTextSenha.getText().toString() +
                        "\"}";

                RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), json);

                ClienteAPI service = retrofit.create(ClienteAPI.class);
                Call<ClienteViewModel> call = service.postCliente(body);


                call.enqueue(new Callback<ClienteViewModel>() {
                    @Override
                    public void onResponse(@NotNull Call<ClienteViewModel> call, Response<ClienteViewModel> response) {

                        Toast.makeText(ClienteActivity.this, "Cliente salvo com sucesso",
                                Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(ClienteActivity.this, ListaClienteActivity.class);
                        startActivity(intent);

                        if (response.isSuccessful()){

                            ClienteViewModel listaClienteResponse = response.body();

                        }
                    }

                    @Override
                    public void onFailure(Call<ClienteViewModel> call, Throwable t) {

                    }

                });
            }
        });

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
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
import com.example.ecommerce.PedidoAPI;
import com.example.ecommerce.viewModel.PedidoViewModel;

import com.example.ecommerce.databinding.ActivityListaPedidoBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.ecommerce.Constant.BASE_URL;

public class ListaPedidoActivity extends AppCompatActivity {

    EditText editTextCodigo;

    private PedidoViewModel pedidoViewModel;
    private @NonNull ActivityListaPedidoBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityListaPedidoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Pedido");


        editTextCodigo = binding.editTextCodigoPedido;

        final Button buttonNovo = binding.buttonNovoPedido;
        final Button buttonBuscar = binding.buttonBuscarPedido;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(new Constant.NullOnEmptyConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        buttonNovo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListaPedidoActivity.this, PedidoActivity.class);
                startActivity(intent);
            }
        });

        buttonBuscar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final String codPedido = editTextCodigo.getText().toString();

                PedidoAPI service = retrofit.create(PedidoAPI.class);
                Call<List<PedidoViewModel>> call = service.getPedido(codPedido);


                call.enqueue(new Callback<List<PedidoViewModel>>() {
                    @Override
                    public void onResponse(Call<List<PedidoViewModel>> call, Response<List<PedidoViewModel>> response) {

                        if (response.isSuccessful()) {

                            PedidoViewModel listaPedidoResponse = (PedidoViewModel) response.body();

                        }
                    }

                    @Override
                    public void onFailure(Call<List<PedidoViewModel>> call, Throwable t) {

                    }

                });

                Toast.makeText(ListaPedidoActivity.this, "Funcionalidade não implementada.",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
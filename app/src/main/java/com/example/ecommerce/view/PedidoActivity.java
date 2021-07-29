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
import com.example.ecommerce.PedidoAPI;
import com.example.ecommerce.databinding.ActivityPedidoBinding;
import com.example.ecommerce.viewModel.PedidoItemViewModel;
import com.example.ecommerce.viewModel.PedidoViewModel;

import org.jetbrains.annotations.NotNull;

import java.sql.Date;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.ecommerce.Constant.BASE_URL;

public class PedidoActivity extends AppCompatActivity {

    EditText editTextCodigoPedido;
    EditText editTextDataPedido;
    EditText editTextCpf;
    EditText editTextItemPedido;
    EditText editTextQuantidade;

    private PedidoViewModel pedidoViewModel;
    private ActivityPedidoBinding binding;

    Intent intent = getIntent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPedidoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Pedido");

        editTextCodigoPedido = binding.editTextCodigoPedido;
        editTextDataPedido = binding.editTextDataPedido;
        editTextCpf = binding.editTextCpf;
        editTextItemPedido = binding.editTextItemPedido;
        editTextQuantidade = binding.editTextQuantidade;

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

                PedidoViewModel listapedidoResponsePedido = new PedidoViewModel(
                        Integer.parseInt(editTextCodigoPedido.getText().toString()),
                        Date.valueOf(editTextDataPedido.getText().toString()),
                        editTextCpf.getText().toString());

                final String jsonPedido  =  "{\"codPedido\": \"" + editTextCodigoPedido.getText() +
                        "\", \"dataPedido\": \"" + editTextDataPedido +
                        "\", \"cpf\": \"" + editTextCpf.getText().toString() +
                        "\"}";

                RequestBody bodyPedido = RequestBody.create(okhttp3.MediaType.parse(
                        "application/json; charset=utf-8"), jsonPedido);

                PedidoAPI service = retrofit.create(PedidoAPI.class);
                Call<PedidoViewModel> callPedido = service.postPedido(bodyPedido);

                callPedido.enqueue(new Callback<PedidoViewModel>() {
                    @Override
                    public void onResponse(@NotNull Call<PedidoViewModel> call, Response<PedidoViewModel> response) {

                        if (response.isSuccessful()){

                            PedidoViewModel listaPedidoResponse = response.body();

                        }
                    }

                    @Override
                    public void onFailure(Call<PedidoViewModel> call, Throwable t) {

                    }

                });

                PedidoItemViewModel listapedidoResponseItem = new PedidoItemViewModel(
                        editTextCodigoPedido.getText().toString(),
                        Integer.parseInt(editTextItemPedido.getText().toString()),
                        Integer.parseInt(editTextQuantidade.getText().toString()));

                final String jsonItem =  "{\"codPedido\": \"" + editTextCodigoPedido.getText() +
                        "\", \"codProduto\": \"" + editTextItemPedido.getText() +
                        "\", \"quantidade\": \"" + editTextQuantidade.getText() +
                        "\"}";


                RequestBody bodyItem = RequestBody.create(okhttp3.MediaType.parse(
                        "application/json; charset=utf-8"), jsonItem);


                PedidoAPI serviceItem = retrofit.create(PedidoAPI.class);
                Call<PedidoViewModel> callItem = serviceItem.postPedidoItem(bodyItem);

                callItem.enqueue(new Callback<PedidoViewModel>() {
                    @Override
                    public void onResponse(@NotNull Call<PedidoViewModel> call, Response<PedidoViewModel> response) {

                        Toast.makeText(PedidoActivity.this, "Pedido salvo com sucesso",
                                Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(PedidoActivity.this, PedidoActivity.class);
                        startActivity(intent);

                        if (response.isSuccessful()){

                            PedidoViewModel listaPedidoResponse = response.body();

                        }
                    }

                    @Override
                    public void onFailure(Call<PedidoViewModel> call, Throwable t) {

                    }

                });
            }
        });


        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PedidoActivity.this);
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
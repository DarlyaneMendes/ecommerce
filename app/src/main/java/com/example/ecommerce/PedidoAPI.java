package com.example.ecommerce;

import com.example.ecommerce.viewModel.PedidoViewModel;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PedidoAPI {

    @GET("/api/pedido")
    Call<List<PedidoViewModel>> getPedido();

    @GET("/api/pedido/{codPedido}")
    Call<List<PedidoViewModel>> getPedido(@Path("codPedido") String codPedido);

    @POST("/api/pedido/salvar")
    Call<PedidoViewModel> postPedido(@Body RequestBody body);

    @POST("/api/pedidoitem/salvar")
    Call<PedidoViewModel> postPedidoItem(@Body RequestBody body);

}

package com.example.ecommerce;

import com.example.ecommerce.viewModel.ClienteViewModel;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ClienteAPI {

    @GET("/api/cliente")
    Call<List<ClienteViewModel>> getCliente();

    @GET("/api/cliente/{cpf}")
    Call<List<ClienteViewModel>> getCliente(@Path("cpf") String cpf);

    @POST("/api/cliente/salvar")
    Call<ClienteViewModel> postCliente(@Body RequestBody postClienteResponse);

    @DELETE("/api/cliente/{cpf}")
    Call<ClienteViewModel> deleteCliente(@Path("cpf") Integer cpf);

}

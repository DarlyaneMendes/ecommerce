package com.example.ecommerce;


import com.example.ecommerce.viewModel.CategoriaViewModel;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface CategoriaAPI {

    @GET("/api/categoria")
    Call<List<CategoriaViewModel>> getCategoria();

    @GET("/api/categoria/{codCategoria}")
    Call<CategoriaViewModel> getCategoria(@Path("codCategoria") String codCategoria);

    @POST("/api/categoria/salvar")
    Call<CategoriaViewModel> postCategoria(@Body RequestBody postCategoriaResponse);

    @DELETE("/api/categoria/{codCategoria}")
    Call<CategoriaViewModel> deleteCategoria(@Path ("codCategoria") Integer codCategoria);

}

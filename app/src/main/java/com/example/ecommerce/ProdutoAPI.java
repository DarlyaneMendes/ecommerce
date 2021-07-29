package com.example.ecommerce;

import com.example.ecommerce.viewModel.ProdutoViewModel;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ProdutoAPI {

    @GET("/api/produto")
    Call<List<ProdutoViewModel>> getProduto();

    @GET("/api/produto/{codProduto}")
    Call<List<ProdutoViewModel>> getProduto(@Path("codProduto") String codProduto);

    @POST("/api/produto/salvar")
    Call<ProdutoViewModel> postProduto(@Body RequestBody postProdutoResponse);

    @DELETE("/api/produto/{codProduto}")
    Call<ProdutoViewModel> deleteProduto(@Path("codProduto") Integer codProduto);

}

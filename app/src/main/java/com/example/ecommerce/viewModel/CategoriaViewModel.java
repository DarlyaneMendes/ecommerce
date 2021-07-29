package com.example.ecommerce.viewModel;

import androidx.lifecycle.ViewModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoriaViewModel extends ViewModel {

    @SerializedName("codCategoria")
    @Expose
    private String codCategoria;

    @SerializedName("nomeCategoria")
    @Expose
    private String nomeCategoria;

    public String getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public CategoriaViewModel(String codCategoria, String nomeCategoria) {
        this.codCategoria = codCategoria;
        this.nomeCategoria = nomeCategoria;
    }

    public CategoriaViewModel(String codCategoria) {
        this.codCategoria = codCategoria;
    }

}

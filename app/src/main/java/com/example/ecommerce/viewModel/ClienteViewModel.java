package com.example.ecommerce.viewModel;


import androidx.lifecycle.ViewModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClienteViewModel extends ViewModel {

    @SerializedName("cpf")
    @Expose
    private String cpf;

    @SerializedName("nomeCliente")
    @Expose
    private String nomeCliente;

    @SerializedName("endereco")
    @Expose
    private String endereco;

    @SerializedName("estado")
    @Expose
    private String estado;

    @SerializedName("municipio")
    @Expose
    private String municipio;

    @SerializedName("telefone")
    @Expose
    private String telefone;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("senha")
    @Expose
    private String senha;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public ClienteViewModel(){

    }

    public ClienteViewModel(String cpf, String nomeCliente, String endereco,
                                String estado, String municipio, String tefelone,
                                String email, String senha) {
        this.cpf = cpf;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.estado = estado;
        this.municipio = municipio;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;

    }

}
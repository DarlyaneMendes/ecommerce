package com.example.ecommerce.viewModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.sql.Date;

public class PedidoViewModel {

    @SerializedName("codPedido")
    @Expose
    private Integer codPedido;

    @SerializedName("dataPedido")
    @Expose
    private Date dataPedido;

    @SerializedName("cpf")
    @Expose
    private String cpf;

    public Integer getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(Integer codPedido) {
        this.codPedido = codPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PedidoViewModel(Integer codPedido, Date dataPedido, String cpf) {
        this.codPedido = codPedido;
        this.dataPedido = dataPedido;
        this.cpf = cpf;
    }
}

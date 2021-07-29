package com.example.ecommerce.viewModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PedidoItemViewModel {

    @SerializedName("codPedido")
    @Expose
    private String codPedido;

    @SerializedName("codProduto")
    @Expose
    private Integer codProduto;

    @SerializedName("quantidade")
    @Expose
    private Integer quantidade;

    public String getCodPedido() {
        return codPedido;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public PedidoItemViewModel(String codPedido, Integer codProduto, Integer quantidade) {
        this.codPedido = codPedido;
        this.codProduto = codProduto;
        this.quantidade = quantidade;
    }
}

package com.example.ecommerce.viewModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProdutoViewModel {

    @SerializedName("codProduto")
    @Expose
    private Integer codProduto;

    @SerializedName("nomeProduto")
    @Expose
    private String nomeProduto;

    @SerializedName("precoProduto")
    @Expose
    private Integer precoProduto;

    @SerializedName("quantidadeEstoque")
    @Expose
    private Integer quantidadeEstoque;

    @SerializedName("categoriaProduto")
    @Expose
    private String catetoriaProduto;


    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Integer precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque;}

    public String getCatetoriaProduto() {
        return catetoriaProduto;
    }

    public void setCatetoriaProduto(String nomeProduto) {
        this.catetoriaProduto = catetoriaProduto;
    }

    public ProdutoViewModel(Integer codProduto,
                                String nomeProduto,
                                Integer precoProduto,
                                Integer quantidadeEstoque,
                                String catetoriaProduto) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.catetoriaProduto = catetoriaProduto;
    }
}

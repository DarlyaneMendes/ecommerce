package com.example.ecommerce.model.ecommerce.ecommerce;

public interface Categoria extends EObject {

	String getCodCategoria();

	void setCodCategoria(String value);

	String getNomeCategoria();

	void setNomeCategoria(String value);

	Produto getProduto();

	void setProduto(Produto value);

}

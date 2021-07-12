package com.example.ecommerce.model.ecommerce.ecommerce;

import org.eclipse.emf.ecore.EObject;

public interface Cliente extends EObject {

	String getCpf();

	void setCpf(String value);

	String getNomeCliente();

	void setNomeCliente(String value);

	String getEndereco();

	void setEndereco(String value);

	String getEstado();

	void setEstado(String value);

	String getMunicipio();

	void setMunicipio(String value);

	String getTelefone();

	void setTelefone(String value);

	String getEmail();

	void setEmail(String value);

	String getSenha();

	void setSenha(String value);

	Pedido getPedido();

	void setPedido(Pedido value);

}

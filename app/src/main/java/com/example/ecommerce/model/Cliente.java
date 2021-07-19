/**
 */
package com.example.ecommerce.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.ecommerce.model.Cliente#getCpf <em>Cpf</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Cliente#getNomeCliente <em>Nome Cliente</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Cliente#getEndereco <em>Endereco</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Cliente#getEstado <em>Estado</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Cliente#getMunicipio <em>Municipio</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Cliente#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Cliente#getEmail <em>Email</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Cliente#getSenha <em>Senha</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Cliente#getPedido <em>Pedido</em>}</li>
 * </ul>
 *
 * @see com.example.ecommerce.model.EcommercePackage#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpf</em>' attribute.
	 * @see #setCpf(String)
	 * @see com.example.ecommerce.model.EcommercePackage#getCliente_Cpf()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCpf();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Cliente#getCpf <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpf</em>' attribute.
	 * @see #getCpf()
	 * @generated
	 */
	void setCpf(String value);

	/**
	 * Returns the value of the '<em><b>Nome Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Cliente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Cliente</em>' attribute.
	 * @see #setNomeCliente(String)
	 * @see com.example.ecommerce.model.EcommercePackage#getCliente_NomeCliente()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNomeCliente();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Cliente#getNomeCliente <em>Nome Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Cliente</em>' attribute.
	 * @see #getNomeCliente()
	 * @generated
	 */
	void setNomeCliente(String value);

	/**
	 * Returns the value of the '<em><b>Endereco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endereco</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endereco</em>' attribute.
	 * @see #setEndereco(String)
	 * @see com.example.ecommerce.model.EcommercePackage#getCliente_Endereco()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEndereco();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Cliente#getEndereco <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endereco</em>' attribute.
	 * @see #getEndereco()
	 * @generated
	 */
	void setEndereco(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see com.example.ecommerce.model.EcommercePackage#getCliente_Estado()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Cliente#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Municipio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Municipio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Municipio</em>' attribute.
	 * @see #setMunicipio(String)
	 * @see com.example.ecommerce.model.EcommercePackage#getCliente_Municipio()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMunicipio();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Cliente#getMunicipio <em>Municipio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Municipio</em>' attribute.
	 * @see #getMunicipio()
	 * @generated
	 */
	void setMunicipio(String value);

	/**
	 * Returns the value of the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefone</em>' attribute.
	 * @see #setTelefone(String)
	 * @see com.example.ecommerce.model.EcommercePackage#getCliente_Telefone()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTelefone();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Cliente#getTelefone <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefone</em>' attribute.
	 * @see #getTelefone()
	 * @generated
	 */
	void setTelefone(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see com.example.ecommerce.model.EcommercePackage#getCliente_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Cliente#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Senha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Senha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senha</em>' attribute.
	 * @see #setSenha(String)
	 * @see com.example.ecommerce.model.EcommercePackage#getCliente_Senha()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSenha();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Cliente#getSenha <em>Senha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Senha</em>' attribute.
	 * @see #getSenha()
	 * @generated
	 */
	void setSenha(String value);

	/**
	 * Returns the value of the '<em><b>Pedido</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.example.ecommerce.model.Pedido#getCliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pedido</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedido</em>' reference.
	 * @see #setPedido(Pedido)
	 * @see com.example.ecommerce.model.EcommercePackage#getCliente_Pedido()
	 * @see com.example.ecommerce.model.Pedido#getCliente
	 * @model opposite="cliente" required="true" ordered="false"
	 * @generated
	 */
	Pedido getPedido();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Cliente#getPedido <em>Pedido</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pedido</em>' reference.
	 * @see #getPedido()
	 * @generated
	 */
	void setPedido(Pedido value);

} // Cliente

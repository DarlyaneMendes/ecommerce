/**
 */
package com.example.ecommerce.model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Pedido#getCodPedido <em>Cod Pedido</em>}</li>
 *   <li>{@link Pedido#getDataPedido <em>Data Pedido</em>}</li>
 *   <li>{@link Pedido#getCpf <em>Cpf</em>}</li>
 *   <li>{@link Pedido#getProduto <em>Produto</em>}</li>
 *   <li>{@link Pedido#getItemPedido <em>Item Pedido</em>}</li>
 *   <li>{@link Pedido#getCliente <em>Cliente</em>}</li>
 * </ul>
 *
 * @see EcommercePackage#getPedido()
 * @model
 * @generated
 */
public interface Pedido extends EObject {
	/**
	 * Returns the value of the '<em><b>Cod Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Pedido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Pedido</em>' attribute.
	 * @see #setCodPedido(String)
	 * @see EcommercePackage#getPedido_CodPedido()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCodPedido();

	/**
	 * Sets the value of the '{@link Pedido#getCodPedido <em>Cod Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Pedido</em>' attribute.
	 * @see #getCodPedido()
	 * @generated
	 */
	void setCodPedido(String value);

	/**
	 * Returns the value of the '<em><b>Data Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pedido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pedido</em>' attribute.
	 * @see #setDataPedido(Date)
	 * @see EcommercePackage#getPedido_DataPedido()
	 * @model
	 * @generated
	 */
	Date getDataPedido();

	/**
	 * Sets the value of the '{@link Pedido#getDataPedido <em>Data Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Pedido</em>' attribute.
	 * @see #getDataPedido()
	 * @generated
	 */
	void setDataPedido(Date value);

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
	 * @see EcommercePackage#getPedido_Cpf()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCpf();

	/**
	 * Sets the value of the '{@link Pedido#getCpf <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpf</em>' attribute.
	 * @see #getCpf()
	 * @generated
	 */
	void setCpf(String value);

	/**
	 * Returns the value of the '<em><b>Produto</b></em>' reference list.
	 * The list contents are of type {@link Produto}.
	 * It is bidirectional and its opposite is '{@link Produto#getPedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produto</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produto</em>' reference list.
	 * @see EcommercePackage#getPedido_Produto()
	 * @see Produto#getPedido
	 * @model opposite="pedido" required="true" ordered="false"
	 * @generated
	 */
	EList<Produto> getProduto();

	/**
	 * Returns the value of the '<em><b>Item Pedido</b></em>' reference list.
	 * The list contents are of type {@link ItemPedido}.
	 * It is bidirectional and its opposite is '{@link ItemPedido#getPedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Pedido</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Pedido</em>' reference list.
	 * @see EcommercePackage#getPedido_ItemPedido()
	 * @see ItemPedido#getPedido
	 * @model opposite="pedido" ordered="false"
	 * @generated
	 */
	EList<ItemPedido> getItemPedido();

	/**
	 * Returns the value of the '<em><b>Cliente</b></em>' reference list.
	 * The list contents are of type {@link Cliente}.
	 * It is bidirectional and its opposite is '{@link Cliente#getPedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cliente</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliente</em>' reference list.
	 * @see EcommercePackage#getPedido_Cliente()
	 * @see Cliente#getPedido
	 * @model opposite="pedido" ordered="false"
	 * @generated
	 */
	EList<Cliente> getCliente();

} // Pedido

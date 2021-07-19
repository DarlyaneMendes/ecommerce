/**
 */
package com.example.ecommerce.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Pedido</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.ecommerce.model.ItemPedido#getCodPedido <em>Cod Pedido</em>}</li>
 *   <li>{@link com.example.ecommerce.model.ItemPedido#getCodProduto <em>Cod Produto</em>}</li>
 *   <li>{@link com.example.ecommerce.model.ItemPedido#getQuantidade <em>Quantidade</em>}</li>
 *   <li>{@link com.example.ecommerce.model.ItemPedido#getPedido <em>Pedido</em>}</li>
 * </ul>
 *
 * @see com.example.ecommerce.model.EcommercePackage#getItemPedido()
 * @model
 * @generated
 */
public interface ItemPedido extends EObject {
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
	 * @see com.example.ecommerce.model.EcommercePackage#getItemPedido_CodPedido()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCodPedido();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.ItemPedido#getCodPedido <em>Cod Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Pedido</em>' attribute.
	 * @see #getCodPedido()
	 * @generated
	 */
	void setCodPedido(String value);

	/**
	 * Returns the value of the '<em><b>Cod Produto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Produto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Produto</em>' attribute.
	 * @see #setCodProduto(String)
	 * @see com.example.ecommerce.model.EcommercePackage#getItemPedido_CodProduto()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCodProduto();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.ItemPedido#getCodProduto <em>Cod Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Produto</em>' attribute.
	 * @see #getCodProduto()
	 * @generated
	 */
	void setCodProduto(String value);

	/**
	 * Returns the value of the '<em><b>Quantidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantidade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantidade</em>' attribute.
	 * @see #setQuantidade(int)
	 * @see com.example.ecommerce.model.EcommercePackage#getItemPedido_Quantidade()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getQuantidade();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.ItemPedido#getQuantidade <em>Quantidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantidade</em>' attribute.
	 * @see #getQuantidade()
	 * @generated
	 */
	void setQuantidade(int value);

	/**
	 * Returns the value of the '<em><b>Pedido</b></em>' reference list.
	 * The list contents are of type {@link com.example.ecommerce.model.Pedido}.
	 * It is bidirectional and its opposite is '{@link com.example.ecommerce.model.Pedido#getItemPedido <em>Item Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pedido</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedido</em>' reference list.
	 * @see com.example.ecommerce.model.EcommercePackage#getItemPedido_Pedido()
	 * @see com.example.ecommerce.model.Pedido#getItemPedido
	 * @model opposite="itemPedido" required="true" ordered="false"
	 * @generated
	 */
	EList<Pedido> getPedido();

} // ItemPedido

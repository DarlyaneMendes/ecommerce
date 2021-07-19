/**
 */
package com.example.ecommerce.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Produto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.ecommerce.model.Produto#getCodProduto <em>Cod Produto</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Produto#getNomeProduto <em>Nome Produto</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Produto#getPrecoProduto <em>Preco Produto</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Produto#getQtdeEstoque <em>Qtde Estoque</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Produto#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link com.example.ecommerce.model.Produto#getPedido <em>Pedido</em>}</li>
 * </ul>
 *
 * @see com.example.ecommerce.model.EcommercePackage#getProduto()
 * @model
 * @generated
 */
public interface Produto extends EObject {
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
	 * @see com.example.ecommerce.model.EcommercePackage#getProduto_CodProduto()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCodProduto();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Produto#getCodProduto <em>Cod Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Produto</em>' attribute.
	 * @see #getCodProduto()
	 * @generated
	 */
	void setCodProduto(String value);

	/**
	 * Returns the value of the '<em><b>Nome Produto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Produto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Produto</em>' attribute.
	 * @see #setNomeProduto(String)
	 * @see com.example.ecommerce.model.EcommercePackage#getProduto_NomeProduto()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNomeProduto();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Produto#getNomeProduto <em>Nome Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Produto</em>' attribute.
	 * @see #getNomeProduto()
	 * @generated
	 */
	void setNomeProduto(String value);

	/**
	 * Returns the value of the '<em><b>Preco Produto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preco Produto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preco Produto</em>' attribute.
	 * @see #setPrecoProduto(double)
	 * @see com.example.ecommerce.model.EcommercePackage#getProduto_PrecoProduto()
	 * @model dataType="org.eclipse.uml2.types.Real"
	 * @generated
	 */
	double getPrecoProduto();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Produto#getPrecoProduto <em>Preco Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preco Produto</em>' attribute.
	 * @see #getPrecoProduto()
	 * @generated
	 */
	void setPrecoProduto(double value);

	/**
	 * Returns the value of the '<em><b>Qtde Estoque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qtde Estoque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qtde Estoque</em>' attribute.
	 * @see #setQtdeEstoque(int)
	 * @see com.example.ecommerce.model.EcommercePackage#getProduto_QtdeEstoque()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getQtdeEstoque();

	/**
	 * Sets the value of the '{@link com.example.ecommerce.model.Produto#getQtdeEstoque <em>Qtde Estoque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qtde Estoque</em>' attribute.
	 * @see #getQtdeEstoque()
	 * @generated
	 */
	void setQtdeEstoque(int value);

	/**
	 * Returns the value of the '<em><b>Categoria</b></em>' reference list.
	 * The list contents are of type {@link com.example.ecommerce.model.Categoria}.
	 * It is bidirectional and its opposite is '{@link com.example.ecommerce.model.Categoria#getProduto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categoria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoria</em>' reference list.
	 * @see com.example.ecommerce.model.EcommercePackage#getProduto_Categoria()
	 * @see com.example.ecommerce.model.Categoria#getProduto
	 * @model opposite="produto" ordered="false"
	 * @generated
	 */
	EList<Categoria> getCategoria();

	/**
	 * Returns the value of the '<em><b>Pedido</b></em>' reference list.
	 * The list contents are of type {@link com.example.ecommerce.model.Pedido}.
	 * It is bidirectional and its opposite is '{@link com.example.ecommerce.model.Pedido#getProduto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pedido</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedido</em>' reference list.
	 * @see com.example.ecommerce.model.EcommercePackage#getProduto_Pedido()
	 * @see com.example.ecommerce.model.Pedido#getProduto
	 * @model opposite="produto" required="true" ordered="false"
	 * @generated
	 */
	EList<Pedido> getPedido();

} // Produto

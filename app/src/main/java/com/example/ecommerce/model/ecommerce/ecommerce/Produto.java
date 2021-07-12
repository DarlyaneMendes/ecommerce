/**
 */
package com.example.ecommerce.model.ecommerce.ecommerce;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Produto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecommerce.ecommerce.Produto#getCodProduto <em>Cod Produto</em>}</li>
 *   <li>{@link ecommerce.ecommerce.Produto#getNomeProduto <em>Nome Produto</em>}</li>
 *   <li>{@link ecommerce.ecommerce.Produto#getPrecoProduto <em>Preco Produto</em>}</li>
 *   <li>{@link ecommerce.ecommerce.Produto#getQtdeEstoque <em>Qtde Estoque</em>}</li>
 *   <li>{@link ecommerce.ecommerce.Produto#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link ecommerce.ecommerce.Produto#getPedido <em>Pedido</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecommerce.ecommerce.EcommercePackage#getProduto()
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
	 * @see ecommerce.ecommerce.EcommercePackage#getProduto_CodProduto()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCodProduto();

	/**
	 * Sets the value of the '{@link ecommerce.ecommerce.Produto#getCodProduto <em>Cod Produto</em>}' attribute.
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
	 * @see ecommerce.ecommerce.EcommercePackage#getProduto_NomeProduto()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNomeProduto();

	/**
	 * Sets the value of the '{@link ecommerce.ecommerce.Produto#getNomeProduto <em>Nome Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Produto</em>' attribute.
	 * @see #getNomeProduto()
	 * @generated
	 */
	void setNomeProduto(String value);

	/**
	 * Returns the value of the '<em><b>Preco Produto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preco Produto</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preco Produto</em>' containment reference.
	 * @see #setPrecoProduto(ecommerce.long)
	 * @see ecommerce.ecommerce.EcommercePackage#getProduto_PrecoProduto()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ecommerce.long getPrecoProduto();

	/**
	 * Sets the value of the '{@link ecommerce.ecommerce.Produto#getPrecoProduto <em>Preco Produto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preco Produto</em>' containment reference.
	 * @see #getPrecoProduto()
	 * @generated
	 */
	void setPrecoProduto(ecommerce.long value);

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
	 * @see ecommerce.ecommerce.EcommercePackage#getProduto_QtdeEstoque()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getQtdeEstoque();

	/**
	 * Sets the value of the '{@link ecommerce.ecommerce.Produto#getQtdeEstoque <em>Qtde Estoque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qtde Estoque</em>' attribute.
	 * @see #getQtdeEstoque()
	 * @generated
	 */
	void setQtdeEstoque(int value);

	/**
	 * Returns the value of the '<em><b>Categoria</b></em>' reference list.
	 * The list contents are of type {@link ecommerce.ecommerce.Categoria}.
	 * It is bidirectional and its opposite is '{@link ecommerce.ecommerce.Categoria#getProduto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categoria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categoria</em>' reference list.
	 * @see ecommerce.ecommerce.EcommercePackage#getProduto_Categoria()
	 * @see ecommerce.ecommerce.Categoria#getProduto
	 * @model opposite="produto" ordered="false"
	 * @generated
	 */
	EList<Categoria> getCategoria();

	/**
	 * Returns the value of the '<em><b>Pedido</b></em>' reference list.
	 * The list contents are of type {@link ecommerce.ecommerce.Pedido}.
	 * It is bidirectional and its opposite is '{@link ecommerce.ecommerce.Pedido#getProduto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pedido</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedido</em>' reference list.
	 * @see ecommerce.ecommerce.EcommercePackage#getProduto_Pedido()
	 * @see ecommerce.ecommerce.Pedido#getProduto
	 * @model opposite="produto" required="true" ordered="false"
	 * @generated
	 */
	EList<Pedido> getPedido();

} // Produto

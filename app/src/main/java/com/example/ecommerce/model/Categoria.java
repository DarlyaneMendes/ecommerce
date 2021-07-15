/**
 */
package com.example.ecommerce.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categoria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Categoria#getCodCategoria <em>Cod Categoria</em>}</li>
 *   <li>{@link Categoria#getNomeCategoria <em>Nome Categoria</em>}</li>
 *   <li>{@link Categoria#getProduto <em>Produto</em>}</li>
 * </ul>
 *
 * @see EcommercePackage#getCategoria()
 * @model
 * @generated
 */
public interface Categoria extends EObject {
	/**
	 * Returns the value of the '<em><b>Cod Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Categoria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Categoria</em>' attribute.
	 * @see #setCodCategoria(String)
	 * @see EcommercePackage#getCategoria_CodCategoria()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCodCategoria();

	/**
	 * Sets the value of the '{@link Categoria#getCodCategoria <em>Cod Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Categoria</em>' attribute.
	 * @see #getCodCategoria()
	 * @generated
	 */
	void setCodCategoria(String value);

	/**
	 * Returns the value of the '<em><b>Nome Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Categoria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Categoria</em>' attribute.
	 * @see #setNomeCategoria(String)
	 * @see EcommercePackage#getCategoria_NomeCategoria()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNomeCategoria();

	/**
	 * Sets the value of the '{@link Categoria#getNomeCategoria <em>Nome Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Categoria</em>' attribute.
	 * @see #getNomeCategoria()
	 * @generated
	 */
	void setNomeCategoria(String value);

	/**
	 * Returns the value of the '<em><b>Produto</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Produto#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produto</em>' reference.
	 * @see #setProduto(Produto)
	 * @see EcommercePackage#getCategoria_Produto()
	 * @see Produto#getCategoria
	 * @model opposite="categoria" ordered="false"
	 * @generated
	 */
	Produto getProduto();

	/**
	 * Sets the value of the '{@link Categoria#getProduto <em>Produto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produto</em>' reference.
	 * @see #getProduto()
	 * @generated
	 */
	void setProduto(Produto value);

} // Categoria

package com.example.ecommerce.model.ecommerce.ecommerce;

import com.example.ecommerce.model.ecommerce.impl.EcommerceFactoryImpl;

import org.eclipse.emf.ecore.EFactory;

public interface EcommerceFactory extends EFactory {

	EcommerceFactory eINSTANCE = ecommerce.ecommerce.impl.EcommerceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliente</em>'.
	 * @generated
	 */
	Cliente createCliente();

	/**
	 * Returns a new object of class '<em>Pedido</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pedido</em>'.
	 * @generated
	 */
	Pedido createPedido();

	/**
	 * Returns a new object of class '<em>Produto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Produto</em>'.
	 * @generated
	 */
	Produto createProduto();

	/**
	 * Returns a new object of class '<em>Categoria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categoria</em>'.
	 * @generated
	 */
	Categoria createCategoria();

	/**
	 * Returns a new object of class '<em>Item Pedido</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Pedido</em>'.
	 * @generated
	 */
	ItemPedido createItemPedido();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcommercePackage getEcommercePackage();

} //EcommerceFactory

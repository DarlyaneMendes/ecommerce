package com.example.ecommerce.model.ecommerce.ecommerce.impl;

import com.example.ecommerce.model.ecommerce.ecommerce.Categoria;
import com.example.ecommerce.model.ecommerce.ecommerce.Cliente;
import com.example.ecommerce.model.ecommerce.ecommerce.EcommerceFactory;
import com.example.ecommerce.model.ecommerce.ecommerce.EcommercePackage;
import com.example.ecommerce.model.ecommerce.ecommerce.ItemPedido;
import com.example.ecommerce.model.ecommerce.ecommerce.Pedido;
import com.example.ecommerce.model.ecommerce.ecommerce.Produto;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class EcommerceFactoryImpl extends EFactoryImpl implements EcommerceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcommerceFactory init() {
		try {
			EcommerceFactory theEcommerceFactory = (EcommerceFactory)EPackage.Registry
					.INSTANCE.getEFactory(EcommercePackage.eNS_URI);
			if (theEcommerceFactory != null) {
				return theEcommerceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcommerceFactoryImpl();
	}

	public EcommerceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcommercePackage.CLIENTE: return createCliente();
			case EcommercePackage.PEDIDO: return createPedido();
			case EcommercePackage.PRODUTO: return createProduto();
			case EcommercePackage.CATEGORIA: return createCategoria();
			case EcommercePackage.ITEM_PEDIDO: return createItemPedido();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	public Cliente createCliente() {
		ClienteImpl cliente = new ClienteImpl();
		return cliente;
	}

	public Pedido createPedido() {
		PedidoImpl pedido = new PedidoImpl();
		return pedido;
	}

	public Produto createProduto() {
		ProdutoImpl produto = new ProdutoImpl();
		return produto;
	}

	public Categoria createCategoria() {
		CategoriaImpl categoria = new CategoriaImpl();
		return categoria;
	}

	public ItemPedido createItemPedido() {
		ItemPedidoImpl itemPedido = new ItemPedidoImpl();
		return itemPedido;
	}

	public EcommercePackage getEcommercePackage() {

		return (EcommercePackage)getEPackage();
	}

	@Deprecated
	public static EcommercePackage getPackage() {

		return EcommercePackage.eINSTANCE;
	}

}

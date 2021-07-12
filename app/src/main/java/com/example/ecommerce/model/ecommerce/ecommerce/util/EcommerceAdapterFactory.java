package com.example.ecommerce.model.ecommerce.ecommerce.util;

import com.example.ecommerce.*;
import com.example.ecommerce.model.ecommerce.EcommercePackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

public class EcommerceAdapterFactory extends AdapterFactoryImpl {

	protected static EcommercePackage modelPackage;

	public EcommerceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcommercePackage.eINSTANCE;
		}
	}

	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	protected EcommerceSwitch<Adapter> modelSwitch =
		new EcommerceSwitch<Adapter>() {
			@Override
			public Adapter caseCliente(Cliente object) {

				return createClienteAdapter();
			}
			@Override
			public Adapter casePedido(Pedido object) {

				return createPedidoAdapter();
			}
			@Override
			public Adapter caseProduto(Produto object) {

				return createProdutoAdapter();
			}
			@Override
			public Adapter caseCategoria(Categoria object) {

				return createCategoriaAdapter();
			}
			@Override
			public Adapter caseItemPedido(ItemPedido object) {

				return createItemPedidoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {

				return createEObjectAdapter();
			}
		};


	@Override
	public Adapter createAdapter(Notifier target) {

		return modelSwitch.doSwitch((EObject)target);
	}

	public Adapter createClienteAdapter() {

		return null;
	}

	public Adapter createPedidoAdapter() {

		return null;
	}


	public Adapter createProdutoAdapter() {

		return null;
	}

	public Adapter createCategoriaAdapter() {

		return null;
	}

	public Adapter createItemPedidoAdapter() {

		return null;
	}

	public Adapter createEObjectAdapter() {

		return null;
	}

}

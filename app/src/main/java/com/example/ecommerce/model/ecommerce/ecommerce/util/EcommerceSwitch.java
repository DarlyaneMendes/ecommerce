package com.example.ecommerce.model.ecommerce.ecommerce.util;

import com.example.ecommerce.model.ecommerce.ecommerce.Categoria;
import com.example.ecommerce.model.ecommerce.ecommerce.Cliente;
import com.example.ecommerce.model.ecommerce.ecommerce.EcommercePackage;
import com.example.ecommerce.model.ecommerce.ecommerce.ItemPedido;
import com.example.ecommerce.model.ecommerce.ecommerce.Pedido;
import com.example.ecommerce.model.ecommerce.ecommerce.Produto;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

public class EcommerceSwitch<T> extends Switch<T> {

	protected static EcommercePackage modelPackage;

	public EcommerceSwitch() {
		if (modelPackage == null) {
			modelPackage = EcommercePackage.eINSTANCE;
		}
	}

	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EcommercePackage.CLIENTE: {
				Cliente cliente = (Cliente)theEObject;
				T result = caseCliente(cliente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcommercePackage.PEDIDO: {
				Pedido pedido = (Pedido)theEObject;
				T result = casePedido(pedido);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcommercePackage.PRODUTO: {
				Produto produto = (Produto)theEObject;
				T result = caseProduto(produto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcommercePackage.CATEGORIA: {
				Categoria categoria = (Categoria)theEObject;
				T result = caseCategoria(categoria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcommercePackage.ITEM_PEDIDO: {
				ItemPedido itemPedido = (ItemPedido)theEObject;
				T result = caseItemPedido(itemPedido);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	public T caseCliente(Cliente object) {

		return null;
	}

	public T casePedido(Pedido object) {

		return null;
	}

	public T caseProduto(Produto object) {

		return null;
	}

	public T caseCategoria(Categoria object) {

		return null;
	}

	public T caseItemPedido(ItemPedido object) {

		return null;
	}

	@Override
	public T defaultCase(EObject object) {

		return null;
	}

}

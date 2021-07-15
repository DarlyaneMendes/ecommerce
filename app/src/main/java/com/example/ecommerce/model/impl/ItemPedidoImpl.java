/**
 */
package com.example.ecommerce.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.example.ecommerce.model.EcommercePackage;
import com.example.ecommerce.model.ItemPedido;
import com.example.ecommerce.model.Pedido;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ItemPedidoImpl#getCodPedido <em>Cod Pedido</em>}</li>
 *   <li>{@link ItemPedidoImpl#getCodProduto <em>Cod Produto</em>}</li>
 *   <li>{@link ItemPedidoImpl#getQuantidade <em>Quantidade</em>}</li>
 *   <li>{@link ItemPedidoImpl#getPedido <em>Pedido</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemPedidoImpl extends MinimalEObjectImpl.Container implements ItemPedido {
	/**
	 * The default value of the '{@link #getCodPedido() <em>Cod Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodPedido()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_PEDIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodPedido() <em>Cod Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodPedido()
	 * @generated
	 * @ordered
	 */
	protected String codPedido = COD_PEDIDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodProduto() <em>Cod Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodProduto()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_PRODUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodProduto() <em>Cod Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodProduto()
	 * @generated
	 * @ordered
	 */
	protected String codProduto = COD_PRODUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantidade() <em>Quantidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantidade()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTIDADE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantidade() <em>Quantidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantidade()
	 * @generated
	 * @ordered
	 */
	protected int quantidade = QUANTIDADE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPedido() <em>Pedido</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedido()
	 * @generated
	 * @ordered
	 */
	protected EList<Pedido> pedido;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemPedidoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.ITEM_PEDIDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodPedido() {
		return codPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodPedido(String newCodPedido) {
		String oldCodPedido = codPedido;
		codPedido = newCodPedido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ITEM_PEDIDO__COD_PEDIDO, oldCodPedido, codPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodProduto() {
		return codProduto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodProduto(String newCodProduto) {
		String oldCodProduto = codProduto;
		codProduto = newCodProduto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ITEM_PEDIDO__COD_PRODUTO, oldCodProduto, codProduto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantidade(int newQuantidade) {
		int oldQuantidade = quantidade;
		quantidade = newQuantidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ITEM_PEDIDO__QUANTIDADE, oldQuantidade, quantidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pedido> getPedido() {
		if (pedido == null) {
			pedido = new EObjectWithInverseResolvingEList.ManyInverse<Pedido>(Pedido.class, this, EcommercePackage.ITEM_PEDIDO__PEDIDO, EcommercePackage.PEDIDO__ITEM_PEDIDO);
		}
		return pedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcommercePackage.ITEM_PEDIDO__PEDIDO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPedido()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcommercePackage.ITEM_PEDIDO__PEDIDO:
				return ((InternalEList<?>)getPedido()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcommercePackage.ITEM_PEDIDO__COD_PEDIDO:
				return getCodPedido();
			case EcommercePackage.ITEM_PEDIDO__COD_PRODUTO:
				return getCodProduto();
			case EcommercePackage.ITEM_PEDIDO__QUANTIDADE:
				return getQuantidade();
			case EcommercePackage.ITEM_PEDIDO__PEDIDO:
				return getPedido();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcommercePackage.ITEM_PEDIDO__COD_PEDIDO:
				setCodPedido((String)newValue);
				return;
			case EcommercePackage.ITEM_PEDIDO__COD_PRODUTO:
				setCodProduto((String)newValue);
				return;
			case EcommercePackage.ITEM_PEDIDO__QUANTIDADE:
				setQuantidade((Integer)newValue);
				return;
			case EcommercePackage.ITEM_PEDIDO__PEDIDO:
				getPedido().clear();
				getPedido().addAll((Collection<? extends Pedido>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcommercePackage.ITEM_PEDIDO__COD_PEDIDO:
				setCodPedido(COD_PEDIDO_EDEFAULT);
				return;
			case EcommercePackage.ITEM_PEDIDO__COD_PRODUTO:
				setCodProduto(COD_PRODUTO_EDEFAULT);
				return;
			case EcommercePackage.ITEM_PEDIDO__QUANTIDADE:
				setQuantidade(QUANTIDADE_EDEFAULT);
				return;
			case EcommercePackage.ITEM_PEDIDO__PEDIDO:
				getPedido().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcommercePackage.ITEM_PEDIDO__COD_PEDIDO:
				return COD_PEDIDO_EDEFAULT == null ? codPedido != null : !COD_PEDIDO_EDEFAULT.equals(codPedido);
			case EcommercePackage.ITEM_PEDIDO__COD_PRODUTO:
				return COD_PRODUTO_EDEFAULT == null ? codProduto != null : !COD_PRODUTO_EDEFAULT.equals(codProduto);
			case EcommercePackage.ITEM_PEDIDO__QUANTIDADE:
				return quantidade != QUANTIDADE_EDEFAULT;
			case EcommercePackage.ITEM_PEDIDO__PEDIDO:
				return pedido != null && !pedido.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (codPedido: ");
		result.append(codPedido);
		result.append(", codProduto: ");
		result.append(codProduto);
		result.append(", quantidade: ");
		result.append(quantidade);
		result.append(')');
		return result.toString();
	}

} //ItemPedidoImpl

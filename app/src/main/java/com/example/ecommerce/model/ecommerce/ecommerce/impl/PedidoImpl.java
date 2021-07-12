/**
 */
package com.example.ecommerce.model.ecommerce.ecommerce.impl;

import ecommerce.date;

import ecommerce.ecommerce.Cliente;
import ecommerce.ecommerce.EcommercePackage;
import ecommerce.ecommerce.ItemPedido;
import ecommerce.ecommerce.Pedido;
import ecommerce.ecommerce.Produto;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecommerce.ecommerce.impl.PedidoImpl#getCodPedido <em>Cod Pedido</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.PedidoImpl#getDataPedido <em>Data Pedido</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.PedidoImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.PedidoImpl#getProduto <em>Produto</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.PedidoImpl#getItemPedido <em>Item Pedido</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.PedidoImpl#getCliente <em>Cliente</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PedidoImpl extends MinimalEObjectImpl.Container implements Pedido {
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
	 * The cached value of the '{@link #getDataPedido() <em>Data Pedido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPedido()
	 * @generated
	 * @ordered
	 */
	protected date dataPedido;

	/**
	 * The default value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected static final String CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected String cpf = CPF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduto() <em>Produto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduto()
	 * @generated
	 * @ordered
	 */
	protected EList<Produto> produto;

	/**
	 * The cached value of the '{@link #getItemPedido() <em>Item Pedido</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemPedido()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemPedido> itemPedido;

	/**
	 * The cached value of the '{@link #getCliente() <em>Cliente</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCliente()
	 * @generated
	 * @ordered
	 */
	protected EList<Cliente> cliente;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedidoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.PEDIDO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PEDIDO__COD_PEDIDO, oldCodPedido, codPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public date getDataPedido() {
		return dataPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPedido(date newDataPedido, NotificationChain msgs) {
		date oldDataPedido = dataPedido;
		dataPedido = newDataPedido;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcommercePackage.PEDIDO__DATA_PEDIDO, oldDataPedido, newDataPedido);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPedido(date newDataPedido) {
		if (newDataPedido != dataPedido) {
			NotificationChain msgs = null;
			if (dataPedido != null)
				msgs = ((InternalEObject)dataPedido).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcommercePackage.PEDIDO__DATA_PEDIDO, null, msgs);
			if (newDataPedido != null)
				msgs = ((InternalEObject)newDataPedido).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcommercePackage.PEDIDO__DATA_PEDIDO, null, msgs);
			msgs = basicSetDataPedido(newDataPedido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PEDIDO__DATA_PEDIDO, newDataPedido, newDataPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpf(String newCpf) {
		String oldCpf = cpf;
		cpf = newCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PEDIDO__CPF, oldCpf, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Produto> getProduto() {
		if (produto == null) {
			produto = new EObjectWithInverseResolvingEList.ManyInverse<Produto>(Produto.class, this, EcommercePackage.PEDIDO__PRODUTO, EcommercePackage.PRODUTO__PEDIDO);
		}
		return produto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemPedido> getItemPedido() {
		if (itemPedido == null) {
			itemPedido = new EObjectWithInverseResolvingEList.ManyInverse<ItemPedido>(ItemPedido.class, this, EcommercePackage.PEDIDO__ITEM_PEDIDO, EcommercePackage.ITEM_PEDIDO__PEDIDO);
		}
		return itemPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cliente> getCliente() {
		if (cliente == null) {
			cliente = new EObjectWithInverseResolvingEList<Cliente>(Cliente.class, this, EcommercePackage.PEDIDO__CLIENTE, EcommercePackage.CLIENTE__PEDIDO);
		}
		return cliente;
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
			case EcommercePackage.PEDIDO__PRODUTO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProduto()).basicAdd(otherEnd, msgs);
			case EcommercePackage.PEDIDO__ITEM_PEDIDO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItemPedido()).basicAdd(otherEnd, msgs);
			case EcommercePackage.PEDIDO__CLIENTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCliente()).basicAdd(otherEnd, msgs);
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
			case EcommercePackage.PEDIDO__DATA_PEDIDO:
				return basicSetDataPedido(null, msgs);
			case EcommercePackage.PEDIDO__PRODUTO:
				return ((InternalEList<?>)getProduto()).basicRemove(otherEnd, msgs);
			case EcommercePackage.PEDIDO__ITEM_PEDIDO:
				return ((InternalEList<?>)getItemPedido()).basicRemove(otherEnd, msgs);
			case EcommercePackage.PEDIDO__CLIENTE:
				return ((InternalEList<?>)getCliente()).basicRemove(otherEnd, msgs);
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
			case EcommercePackage.PEDIDO__COD_PEDIDO:
				return getCodPedido();
			case EcommercePackage.PEDIDO__DATA_PEDIDO:
				return getDataPedido();
			case EcommercePackage.PEDIDO__CPF:
				return getCpf();
			case EcommercePackage.PEDIDO__PRODUTO:
				return getProduto();
			case EcommercePackage.PEDIDO__ITEM_PEDIDO:
				return getItemPedido();
			case EcommercePackage.PEDIDO__CLIENTE:
				return getCliente();
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
			case EcommercePackage.PEDIDO__COD_PEDIDO:
				setCodPedido((String)newValue);
				return;
			case EcommercePackage.PEDIDO__DATA_PEDIDO:
				setDataPedido((date)newValue);
				return;
			case EcommercePackage.PEDIDO__CPF:
				setCpf((String)newValue);
				return;
			case EcommercePackage.PEDIDO__PRODUTO:
				getProduto().clear();
				getProduto().addAll((Collection<? extends Produto>)newValue);
				return;
			case EcommercePackage.PEDIDO__ITEM_PEDIDO:
				getItemPedido().clear();
				getItemPedido().addAll((Collection<? extends ItemPedido>)newValue);
				return;
			case EcommercePackage.PEDIDO__CLIENTE:
				getCliente().clear();
				getCliente().addAll((Collection<? extends Cliente>)newValue);
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
			case EcommercePackage.PEDIDO__COD_PEDIDO:
				setCodPedido(COD_PEDIDO_EDEFAULT);
				return;
			case EcommercePackage.PEDIDO__DATA_PEDIDO:
				setDataPedido((date)null);
				return;
			case EcommercePackage.PEDIDO__CPF:
				setCpf(CPF_EDEFAULT);
				return;
			case EcommercePackage.PEDIDO__PRODUTO:
				getProduto().clear();
				return;
			case EcommercePackage.PEDIDO__ITEM_PEDIDO:
				getItemPedido().clear();
				return;
			case EcommercePackage.PEDIDO__CLIENTE:
				getCliente().clear();
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
			case EcommercePackage.PEDIDO__COD_PEDIDO:
				return COD_PEDIDO_EDEFAULT == null ? codPedido != null : !COD_PEDIDO_EDEFAULT.equals(codPedido);
			case EcommercePackage.PEDIDO__DATA_PEDIDO:
				return dataPedido != null;
			case EcommercePackage.PEDIDO__CPF:
				return CPF_EDEFAULT == null ? cpf != null : !CPF_EDEFAULT.equals(cpf);
			case EcommercePackage.PEDIDO__PRODUTO:
				return produto != null && !produto.isEmpty();
			case EcommercePackage.PEDIDO__ITEM_PEDIDO:
				return itemPedido != null && !itemPedido.isEmpty();
			case EcommercePackage.PEDIDO__CLIENTE:
				return cliente != null && !cliente.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (codPedido: ");
		result.append(codPedido);
		result.append(", cpf: ");
		result.append(cpf);
		result.append(')');
		return result.toString();
	}

} //PedidoImpl

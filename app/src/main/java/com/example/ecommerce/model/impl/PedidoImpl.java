/**
 */
package com.example.ecommerce.model.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.example.ecommerce.model.Cliente;
import com.example.ecommerce.model.EcommercePackage;
import com.example.ecommerce.model.ItemPedido;
import com.example.ecommerce.model.Pedido;
import com.example.ecommerce.model.Produto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pedido</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PedidoImpl#getCodPedido <em>Cod Pedido</em>}</li>
 *   <li>{@link PedidoImpl#getDataPedido <em>Data Pedido</em>}</li>
 *   <li>{@link PedidoImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link PedidoImpl#getProduto <em>Produto</em>}</li>
 *   <li>{@link PedidoImpl#getItemPedido <em>Item Pedido</em>}</li>
 *   <li>{@link PedidoImpl#getCliente <em>Cliente</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #getDataPedido() <em>Data Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPedido()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_PEDIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPedido() <em>Data Pedido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPedido()
	 * @generated
	 * @ordered
	 */
	protected Date dataPedido = DATA_PEDIDO_EDEFAULT;

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
	public Date getDataPedido() {
		return dataPedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPedido(Date newDataPedido) {
		Date oldDataPedido = dataPedido;
		dataPedido = newDataPedido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PEDIDO__DATA_PEDIDO, oldDataPedido, dataPedido));
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
				setDataPedido((Date)newValue);
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
				setDataPedido(DATA_PEDIDO_EDEFAULT);
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
				return DATA_PEDIDO_EDEFAULT == null ? dataPedido != null : !DATA_PEDIDO_EDEFAULT.equals(dataPedido);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (codPedido: ");
		result.append(codPedido);
		result.append(", dataPedido: ");
		result.append(dataPedido);
		result.append(", cpf: ");
		result.append(cpf);
		result.append(')');
		return result.toString();
	}

} //PedidoImpl

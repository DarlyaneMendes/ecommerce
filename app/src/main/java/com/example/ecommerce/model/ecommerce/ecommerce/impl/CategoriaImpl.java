/**
 */
package com.example.ecommerce.model.ecommerce.ecommerce.impl;

import ecommerce.ecommerce.Categoria;
import ecommerce.ecommerce.EcommercePackage;
import ecommerce.ecommerce.Produto;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categoria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecommerce.ecommerce.impl.CategoriaImpl#getCodCategoria <em>Cod Categoria</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.CategoriaImpl#getNomeCategoria <em>Nome Categoria</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.CategoriaImpl#getProduto <em>Produto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoriaImpl extends MinimalEObjectImpl.Container implements Categoria {
	/**
	 * The default value of the '{@link #getCodCategoria() <em>Cod Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodCategoria()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_CATEGORIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodCategoria() <em>Cod Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodCategoria()
	 * @generated
	 * @ordered
	 */
	protected String codCategoria = COD_CATEGORIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomeCategoria() <em>Nome Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeCategoria()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_CATEGORIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomeCategoria() <em>Nome Categoria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeCategoria()
	 * @generated
	 * @ordered
	 */
	protected String nomeCategoria = NOME_CATEGORIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduto() <em>Produto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduto()
	 * @generated
	 * @ordered
	 */
	protected Produto produto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.CATEGORIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodCategoria() {
		return codCategoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodCategoria(String newCodCategoria) {
		String oldCodCategoria = codCategoria;
		codCategoria = newCodCategoria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CATEGORIA__COD_CATEGORIA, oldCodCategoria, codCategoria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomeCategoria() {
		return nomeCategoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeCategoria(String newNomeCategoria) {
		String oldNomeCategoria = nomeCategoria;
		nomeCategoria = newNomeCategoria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CATEGORIA__NOME_CATEGORIA, oldNomeCategoria, nomeCategoria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produto getProduto() {
		if (produto != null && produto.eIsProxy()) {
			InternalEObject oldProduto = (InternalEObject)produto;
			produto = (Produto)eResolveProxy(oldProduto);
			if (produto != oldProduto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcommercePackage.CATEGORIA__PRODUTO, oldProduto, produto));
			}
		}
		return produto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produto basicGetProduto() {
		return produto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduto(Produto newProduto, NotificationChain msgs) {
		Produto oldProduto = produto;
		produto = newProduto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcommercePackage.CATEGORIA__PRODUTO, oldProduto, newProduto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduto(Produto newProduto) {
		if (newProduto != produto) {
			NotificationChain msgs = null;
			if (produto != null)
				msgs = ((InternalEObject)produto).eInverseRemove(this, EcommercePackage.PRODUTO__CATEGORIA, Produto.class, msgs);
			if (newProduto != null)
				msgs = ((InternalEObject)newProduto).eInverseAdd(this, EcommercePackage.PRODUTO__CATEGORIA, Produto.class, msgs);
			msgs = basicSetProduto(newProduto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CATEGORIA__PRODUTO, newProduto, newProduto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcommercePackage.CATEGORIA__PRODUTO:
				if (produto != null)
					msgs = ((InternalEObject)produto).eInverseRemove(this, EcommercePackage.PRODUTO__CATEGORIA, Produto.class, msgs);
				return basicSetProduto((Produto)otherEnd, msgs);
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
			case EcommercePackage.CATEGORIA__PRODUTO:
				return basicSetProduto(null, msgs);
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
			case EcommercePackage.CATEGORIA__COD_CATEGORIA:
				return getCodCategoria();
			case EcommercePackage.CATEGORIA__NOME_CATEGORIA:
				return getNomeCategoria();
			case EcommercePackage.CATEGORIA__PRODUTO:
				if (resolve) return getProduto();
				return basicGetProduto();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcommercePackage.CATEGORIA__COD_CATEGORIA:
				setCodCategoria((String)newValue);
				return;
			case EcommercePackage.CATEGORIA__NOME_CATEGORIA:
				setNomeCategoria((String)newValue);
				return;
			case EcommercePackage.CATEGORIA__PRODUTO:
				setProduto((Produto)newValue);
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
			case EcommercePackage.CATEGORIA__COD_CATEGORIA:
				setCodCategoria(COD_CATEGORIA_EDEFAULT);
				return;
			case EcommercePackage.CATEGORIA__NOME_CATEGORIA:
				setNomeCategoria(NOME_CATEGORIA_EDEFAULT);
				return;
			case EcommercePackage.CATEGORIA__PRODUTO:
				setProduto((Produto)null);
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
			case EcommercePackage.CATEGORIA__COD_CATEGORIA:
				return COD_CATEGORIA_EDEFAULT == null ? codCategoria != null : !COD_CATEGORIA_EDEFAULT.equals(codCategoria);
			case EcommercePackage.CATEGORIA__NOME_CATEGORIA:
				return NOME_CATEGORIA_EDEFAULT == null ? nomeCategoria != null : !NOME_CATEGORIA_EDEFAULT.equals(nomeCategoria);
			case EcommercePackage.CATEGORIA__PRODUTO:
				return produto != null;
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
		result.append(" (codCategoria: ");
		result.append(codCategoria);
		result.append(", nomeCategoria: ");
		result.append(nomeCategoria);
		result.append(')');
		return result.toString();
	}

} //CategoriaImpl

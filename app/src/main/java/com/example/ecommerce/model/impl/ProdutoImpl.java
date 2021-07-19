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

import com.example.ecommerce.model.Categoria;
import com.example.ecommerce.model.EcommercePackage;
import com.example.ecommerce.model.Pedido;
import com.example.ecommerce.model.Produto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.ecommerce.model.impl.ProdutoImpl#getCodProduto <em>Cod Produto</em>}</li>
 *   <li>{@link com.example.ecommerce.model.impl.ProdutoImpl#getNomeProduto <em>Nome Produto</em>}</li>
 *   <li>{@link com.example.ecommerce.model.impl.ProdutoImpl#getPrecoProduto <em>Preco Produto</em>}</li>
 *   <li>{@link com.example.ecommerce.model.impl.ProdutoImpl#getQtdeEstoque <em>Qtde Estoque</em>}</li>
 *   <li>{@link com.example.ecommerce.model.impl.ProdutoImpl#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link com.example.ecommerce.model.impl.ProdutoImpl#getPedido <em>Pedido</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProdutoImpl extends MinimalEObjectImpl.Container implements Produto {
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
	 * The default value of the '{@link #getNomeProduto() <em>Nome Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeProduto()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_PRODUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomeProduto() <em>Nome Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeProduto()
	 * @generated
	 * @ordered
	 */
	protected String nomeProduto = NOME_PRODUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecoProduto() <em>Preco Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecoProduto()
	 * @generated
	 * @ordered
	 */
	protected static final double PRECO_PRODUTO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrecoProduto() <em>Preco Produto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecoProduto()
	 * @generated
	 * @ordered
	 */
	protected double precoProduto = PRECO_PRODUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getQtdeEstoque() <em>Qtde Estoque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtdeEstoque()
	 * @generated
	 * @ordered
	 */
	protected static final int QTDE_ESTOQUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQtdeEstoque() <em>Qtde Estoque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQtdeEstoque()
	 * @generated
	 * @ordered
	 */
	protected int qtdeEstoque = QTDE_ESTOQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategoria() <em>Categoria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoria()
	 * @generated
	 * @ordered
	 */
	protected EList<Categoria> categoria;

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
	protected ProdutoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.PRODUTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUTO__COD_PRODUTO, oldCodProduto, codProduto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomeProduto() {
		return nomeProduto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeProduto(String newNomeProduto) {
		String oldNomeProduto = nomeProduto;
		nomeProduto = newNomeProduto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUTO__NOME_PRODUTO, oldNomeProduto, nomeProduto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrecoProduto() {
		return precoProduto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecoProduto(double newPrecoProduto) {
		double oldPrecoProduto = precoProduto;
		precoProduto = newPrecoProduto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUTO__PRECO_PRODUTO, oldPrecoProduto, precoProduto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQtdeEstoque(int newQtdeEstoque) {
		int oldQtdeEstoque = qtdeEstoque;
		qtdeEstoque = newQtdeEstoque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUTO__QTDE_ESTOQUE, oldQtdeEstoque, qtdeEstoque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Categoria> getCategoria() {
		if (categoria == null) {
			categoria = new EObjectWithInverseResolvingEList<Categoria>(Categoria.class, this, EcommercePackage.PRODUTO__CATEGORIA, EcommercePackage.CATEGORIA__PRODUTO);
		}
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pedido> getPedido() {
		if (pedido == null) {
			pedido = new EObjectWithInverseResolvingEList.ManyInverse<Pedido>(Pedido.class, this, EcommercePackage.PRODUTO__PEDIDO, EcommercePackage.PEDIDO__PRODUTO);
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
			case EcommercePackage.PRODUTO__CATEGORIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoria()).basicAdd(otherEnd, msgs);
			case EcommercePackage.PRODUTO__PEDIDO:
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
			case EcommercePackage.PRODUTO__CATEGORIA:
				return ((InternalEList<?>)getCategoria()).basicRemove(otherEnd, msgs);
			case EcommercePackage.PRODUTO__PEDIDO:
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
			case EcommercePackage.PRODUTO__COD_PRODUTO:
				return getCodProduto();
			case EcommercePackage.PRODUTO__NOME_PRODUTO:
				return getNomeProduto();
			case EcommercePackage.PRODUTO__PRECO_PRODUTO:
				return getPrecoProduto();
			case EcommercePackage.PRODUTO__QTDE_ESTOQUE:
				return getQtdeEstoque();
			case EcommercePackage.PRODUTO__CATEGORIA:
				return getCategoria();
			case EcommercePackage.PRODUTO__PEDIDO:
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
			case EcommercePackage.PRODUTO__COD_PRODUTO:
				setCodProduto((String)newValue);
				return;
			case EcommercePackage.PRODUTO__NOME_PRODUTO:
				setNomeProduto((String)newValue);
				return;
			case EcommercePackage.PRODUTO__PRECO_PRODUTO:
				setPrecoProduto((Double)newValue);
				return;
			case EcommercePackage.PRODUTO__QTDE_ESTOQUE:
				setQtdeEstoque((Integer)newValue);
				return;
			case EcommercePackage.PRODUTO__CATEGORIA:
				getCategoria().clear();
				getCategoria().addAll((Collection<? extends Categoria>)newValue);
				return;
			case EcommercePackage.PRODUTO__PEDIDO:
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
			case EcommercePackage.PRODUTO__COD_PRODUTO:
				setCodProduto(COD_PRODUTO_EDEFAULT);
				return;
			case EcommercePackage.PRODUTO__NOME_PRODUTO:
				setNomeProduto(NOME_PRODUTO_EDEFAULT);
				return;
			case EcommercePackage.PRODUTO__PRECO_PRODUTO:
				setPrecoProduto(PRECO_PRODUTO_EDEFAULT);
				return;
			case EcommercePackage.PRODUTO__QTDE_ESTOQUE:
				setQtdeEstoque(QTDE_ESTOQUE_EDEFAULT);
				return;
			case EcommercePackage.PRODUTO__CATEGORIA:
				getCategoria().clear();
				return;
			case EcommercePackage.PRODUTO__PEDIDO:
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
			case EcommercePackage.PRODUTO__COD_PRODUTO:
				return COD_PRODUTO_EDEFAULT == null ? codProduto != null : !COD_PRODUTO_EDEFAULT.equals(codProduto);
			case EcommercePackage.PRODUTO__NOME_PRODUTO:
				return NOME_PRODUTO_EDEFAULT == null ? nomeProduto != null : !NOME_PRODUTO_EDEFAULT.equals(nomeProduto);
			case EcommercePackage.PRODUTO__PRECO_PRODUTO:
				return precoProduto != PRECO_PRODUTO_EDEFAULT;
			case EcommercePackage.PRODUTO__QTDE_ESTOQUE:
				return qtdeEstoque != QTDE_ESTOQUE_EDEFAULT;
			case EcommercePackage.PRODUTO__CATEGORIA:
				return categoria != null && !categoria.isEmpty();
			case EcommercePackage.PRODUTO__PEDIDO:
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
		result.append(" (codProduto: ");
		result.append(codProduto);
		result.append(", nomeProduto: ");
		result.append(nomeProduto);
		result.append(", precoProduto: ");
		result.append(precoProduto);
		result.append(", qtdeEstoque: ");
		result.append(qtdeEstoque);
		result.append(')');
		return result.toString();
	}

} //ProdutoImpl

/**
 */
package com.example.ecommerce.model.ecommerce.ecommerce.impl;

import ecommerce.ecommerce.Cliente;
import ecommerce.ecommerce.EcommercePackage;
import ecommerce.ecommerce.Pedido;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ecommerce.ecommerce.impl.ClienteImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.ClienteImpl#getNomeCliente <em>Nome Cliente</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.ClienteImpl#getEndereco <em>Endereco</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.ClienteImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.ClienteImpl#getMunicipio <em>Municipio</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.ClienteImpl#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.ClienteImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.ClienteImpl#getSenha <em>Senha</em>}</li>
 *   <li>{@link ecommerce.ecommerce.impl.ClienteImpl#getPedido <em>Pedido</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClienteImpl extends MinimalEObjectImpl.Container implements Cliente {
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
	 * The default value of the '{@link #getNomeCliente() <em>Nome Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeCliente()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_CLIENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomeCliente() <em>Nome Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeCliente()
	 * @generated
	 * @ordered
	 */
	protected String nomeCliente = NOME_CLIENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndereco() <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDERECO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndereco() <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco()
	 * @generated
	 * @ordered
	 */
	protected String endereco = ENDERECO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMunicipio() <em>Municipio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunicipio()
	 * @generated
	 * @ordered
	 */
	protected static final String MUNICIPIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMunicipio() <em>Municipio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunicipio()
	 * @generated
	 * @ordered
	 */
	protected String municipio = MUNICIPIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefone() <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefone() <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefone()
	 * @generated
	 * @ordered
	 */
	protected String telefone = TELEFONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSenha() <em>Senha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenha()
	 * @generated
	 * @ordered
	 */
	protected static final String SENHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSenha() <em>Senha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenha()
	 * @generated
	 * @ordered
	 */
	protected String senha = SENHA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPedido() <em>Pedido</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPedido()
	 * @generated
	 * @ordered
	 */
	protected Pedido pedido;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.CLIENTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CLIENTE__CPF, oldCpf, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeCliente(String newNomeCliente) {
		String oldNomeCliente = nomeCliente;
		nomeCliente = newNomeCliente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CLIENTE__NOME_CLIENTE, oldNomeCliente, nomeCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndereco(String newEndereco) {
		String oldEndereco = endereco;
		endereco = newEndereco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CLIENTE__ENDERECO, oldEndereco, endereco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CLIENTE__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMunicipio(String newMunicipio) {
		String oldMunicipio = municipio;
		municipio = newMunicipio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CLIENTE__MUNICIPIO, oldMunicipio, municipio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefone(String newTelefone) {
		String oldTelefone = telefone;
		telefone = newTelefone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CLIENTE__TELEFONE, oldTelefone, telefone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CLIENTE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenha(String newSenha) {
		String oldSenha = senha;
		senha = newSenha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CLIENTE__SENHA, oldSenha, senha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pedido getPedido() {
		if (pedido != null && pedido.eIsProxy()) {
			InternalEObject oldPedido = (InternalEObject)pedido;
			pedido = (Pedido)eResolveProxy(oldPedido);
			if (pedido != oldPedido) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcommercePackage.CLIENTE__PEDIDO, oldPedido, pedido));
			}
		}
		return pedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pedido basicGetPedido() {
		return pedido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPedido(Pedido newPedido, NotificationChain msgs) {
		Pedido oldPedido = pedido;
		pedido = newPedido;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcommercePackage.CLIENTE__PEDIDO, oldPedido, newPedido);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPedido(Pedido newPedido) {
		if (newPedido != pedido) {
			NotificationChain msgs = null;
			if (pedido != null)
				msgs = ((InternalEObject)pedido).eInverseRemove(this, EcommercePackage.PEDIDO__CLIENTE, Pedido.class, msgs);
			if (newPedido != null)
				msgs = ((InternalEObject)newPedido).eInverseAdd(this, EcommercePackage.PEDIDO__CLIENTE, Pedido.class, msgs);
			msgs = basicSetPedido(newPedido, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CLIENTE__PEDIDO, newPedido, newPedido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcommercePackage.CLIENTE__PEDIDO:
				if (pedido != null)
					msgs = ((InternalEObject)pedido).eInverseRemove(this, EcommercePackage.PEDIDO__CLIENTE, Pedido.class, msgs);
				return basicSetPedido((Pedido)otherEnd, msgs);
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
			case EcommercePackage.CLIENTE__PEDIDO:
				return basicSetPedido(null, msgs);
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
			case EcommercePackage.CLIENTE__CPF:
				return getCpf();
			case EcommercePackage.CLIENTE__NOME_CLIENTE:
				return getNomeCliente();
			case EcommercePackage.CLIENTE__ENDERECO:
				return getEndereco();
			case EcommercePackage.CLIENTE__ESTADO:
				return getEstado();
			case EcommercePackage.CLIENTE__MUNICIPIO:
				return getMunicipio();
			case EcommercePackage.CLIENTE__TELEFONE:
				return getTelefone();
			case EcommercePackage.CLIENTE__EMAIL:
				return getEmail();
			case EcommercePackage.CLIENTE__SENHA:
				return getSenha();
			case EcommercePackage.CLIENTE__PEDIDO:
				if (resolve) return getPedido();
				return basicGetPedido();
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
			case EcommercePackage.CLIENTE__CPF:
				setCpf((String)newValue);
				return;
			case EcommercePackage.CLIENTE__NOME_CLIENTE:
				setNomeCliente((String)newValue);
				return;
			case EcommercePackage.CLIENTE__ENDERECO:
				setEndereco((String)newValue);
				return;
			case EcommercePackage.CLIENTE__ESTADO:
				setEstado((String)newValue);
				return;
			case EcommercePackage.CLIENTE__MUNICIPIO:
				setMunicipio((String)newValue);
				return;
			case EcommercePackage.CLIENTE__TELEFONE:
				setTelefone((String)newValue);
				return;
			case EcommercePackage.CLIENTE__EMAIL:
				setEmail((String)newValue);
				return;
			case EcommercePackage.CLIENTE__SENHA:
				setSenha((String)newValue);
				return;
			case EcommercePackage.CLIENTE__PEDIDO:
				setPedido((Pedido)newValue);
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
			case EcommercePackage.CLIENTE__CPF:
				setCpf(CPF_EDEFAULT);
				return;
			case EcommercePackage.CLIENTE__NOME_CLIENTE:
				setNomeCliente(NOME_CLIENTE_EDEFAULT);
				return;
			case EcommercePackage.CLIENTE__ENDERECO:
				setEndereco(ENDERECO_EDEFAULT);
				return;
			case EcommercePackage.CLIENTE__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case EcommercePackage.CLIENTE__MUNICIPIO:
				setMunicipio(MUNICIPIO_EDEFAULT);
				return;
			case EcommercePackage.CLIENTE__TELEFONE:
				setTelefone(TELEFONE_EDEFAULT);
				return;
			case EcommercePackage.CLIENTE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case EcommercePackage.CLIENTE__SENHA:
				setSenha(SENHA_EDEFAULT);
				return;
			case EcommercePackage.CLIENTE__PEDIDO:
				setPedido((Pedido)null);
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
			case EcommercePackage.CLIENTE__CPF:
				return CPF_EDEFAULT == null ? cpf != null : !CPF_EDEFAULT.equals(cpf);
			case EcommercePackage.CLIENTE__NOME_CLIENTE:
				return NOME_CLIENTE_EDEFAULT == null ? nomeCliente != null : !NOME_CLIENTE_EDEFAULT.equals(nomeCliente);
			case EcommercePackage.CLIENTE__ENDERECO:
				return ENDERECO_EDEFAULT == null ? endereco != null : !ENDERECO_EDEFAULT.equals(endereco);
			case EcommercePackage.CLIENTE__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case EcommercePackage.CLIENTE__MUNICIPIO:
				return MUNICIPIO_EDEFAULT == null ? municipio != null : !MUNICIPIO_EDEFAULT.equals(municipio);
			case EcommercePackage.CLIENTE__TELEFONE:
				return TELEFONE_EDEFAULT == null ? telefone != null : !TELEFONE_EDEFAULT.equals(telefone);
			case EcommercePackage.CLIENTE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case EcommercePackage.CLIENTE__SENHA:
				return SENHA_EDEFAULT == null ? senha != null : !SENHA_EDEFAULT.equals(senha);
			case EcommercePackage.CLIENTE__PEDIDO:
				return pedido != null;
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
		result.append(" (cpf: ");
		result.append(cpf);
		result.append(", nomeCliente: ");
		result.append(nomeCliente);
		result.append(", endereco: ");
		result.append(endereco);
		result.append(", estado: ");
		result.append(estado);
		result.append(", municipio: ");
		result.append(municipio);
		result.append(", telefone: ");
		result.append(telefone);
		result.append(", email: ");
		result.append(email);
		result.append(", senha: ");
		result.append(senha);
		result.append(')');
		return result.toString();
	}

} //ClienteImpl

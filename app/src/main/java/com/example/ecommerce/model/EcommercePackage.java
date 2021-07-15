/**
 */
package com.example.ecommerce.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see EcommerceFactory
 * @model kind="package"
 * @generated
 */
public interface EcommercePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecommerce";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ecommerce.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecommerce";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcommercePackage eINSTANCE = com.example.ecommerce.model.impl.EcommercePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.ecommerce.model.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.ecommerce.model.impl.ClienteImpl
	 * @see com.example.ecommerce.model.impl.EcommercePackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 0;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__CPF = 0;

	/**
	 * The feature id for the '<em><b>Nome Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__NOME_CLIENTE = 1;

	/**
	 * The feature id for the '<em><b>Endereco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ENDERECO = 2;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__ESTADO = 3;

	/**
	 * The feature id for the '<em><b>Municipio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__MUNICIPIO = 4;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__TELEFONE = 5;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__EMAIL = 6;

	/**
	 * The feature id for the '<em><b>Senha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__SENHA = 7;

	/**
	 * The feature id for the '<em><b>Pedido</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE__PEDIDO = 8;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.ecommerce.model.impl.PedidoImpl <em>Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.ecommerce.model.impl.PedidoImpl
	 * @see com.example.ecommerce.model.impl.EcommercePackageImpl#getPedido()
	 * @generated
	 */
	int PEDIDO = 1;

	/**
	 * The feature id for the '<em><b>Cod Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__COD_PEDIDO = 0;

	/**
	 * The feature id for the '<em><b>Data Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__DATA_PEDIDO = 1;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__CPF = 2;

	/**
	 * The feature id for the '<em><b>Produto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__PRODUTO = 3;

	/**
	 * The feature id for the '<em><b>Item Pedido</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__ITEM_PEDIDO = 4;

	/**
	 * The feature id for the '<em><b>Cliente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO__CLIENTE = 5;

	/**
	 * The number of structural features of the '<em>Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDIDO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.ecommerce.model.impl.ProdutoImpl <em>Produto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.ecommerce.model.impl.ProdutoImpl
	 * @see com.example.ecommerce.model.impl.EcommercePackageImpl#getProduto()
	 * @generated
	 */
	int PRODUTO = 2;

	/**
	 * The feature id for the '<em><b>Cod Produto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO__COD_PRODUTO = 0;

	/**
	 * The feature id for the '<em><b>Nome Produto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO__NOME_PRODUTO = 1;

	/**
	 * The feature id for the '<em><b>Preco Produto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO__PRECO_PRODUTO = 2;

	/**
	 * The feature id for the '<em><b>Qtde Estoque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO__QTDE_ESTOQUE = 3;

	/**
	 * The feature id for the '<em><b>Categoria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO__CATEGORIA = 4;

	/**
	 * The feature id for the '<em><b>Pedido</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO__PEDIDO = 5;

	/**
	 * The number of structural features of the '<em>Produto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Produto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.ecommerce.model.impl.CategoriaImpl <em>Categoria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.ecommerce.model.impl.CategoriaImpl
	 * @see com.example.ecommerce.model.impl.EcommercePackageImpl#getCategoria()
	 * @generated
	 */
	int CATEGORIA = 3;

	/**
	 * The feature id for the '<em><b>Cod Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__COD_CATEGORIA = 0;

	/**
	 * The feature id for the '<em><b>Nome Categoria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__NOME_CATEGORIA = 1;

	/**
	 * The feature id for the '<em><b>Produto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__PRODUTO = 2;

	/**
	 * The number of structural features of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.ecommerce.model.impl.ItemPedidoImpl <em>Item Pedido</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.ecommerce.model.impl.ItemPedidoImpl
	 * @see com.example.ecommerce.model.impl.EcommercePackageImpl#getItemPedido()
	 * @generated
	 */
	int ITEM_PEDIDO = 4;

	/**
	 * The feature id for the '<em><b>Cod Pedido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO__COD_PEDIDO = 0;

	/**
	 * The feature id for the '<em><b>Cod Produto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO__COD_PRODUTO = 1;

	/**
	 * The feature id for the '<em><b>Quantidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO__QUANTIDADE = 2;

	/**
	 * The feature id for the '<em><b>Pedido</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO__PEDIDO = 3;

	/**
	 * The number of structural features of the '<em>Item Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Item Pedido</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PEDIDO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the attribute '{@link Cliente#getCpf <em>Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf</em>'.
	 * @see Cliente#getCpf()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Cpf();

	/**
	 * Returns the meta object for the attribute '{@link Cliente#getNomeCliente <em>Nome Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Cliente</em>'.
	 * @see Cliente#getNomeCliente()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_NomeCliente();

	/**
	 * Returns the meta object for the attribute '{@link Cliente#getEndereco <em>Endereco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco</em>'.
	 * @see Cliente#getEndereco()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Endereco();

	/**
	 * Returns the meta object for the attribute '{@link Cliente#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see Cliente#getEstado()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Estado();

	/**
	 * Returns the meta object for the attribute '{@link Cliente#getMunicipio <em>Municipio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Municipio</em>'.
	 * @see Cliente#getMunicipio()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Municipio();

	/**
	 * Returns the meta object for the attribute '{@link Cliente#getTelefone <em>Telefone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefone</em>'.
	 * @see Cliente#getTelefone()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Telefone();

	/**
	 * Returns the meta object for the attribute '{@link Cliente#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Cliente#getEmail()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Email();

	/**
	 * Returns the meta object for the attribute '{@link Cliente#getSenha <em>Senha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Senha</em>'.
	 * @see Cliente#getSenha()
	 * @see #getCliente()
	 * @generated
	 */
	EAttribute getCliente_Senha();

	/**
	 * Returns the meta object for the reference '{@link Cliente#getPedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pedido</em>'.
	 * @see Cliente#getPedido()
	 * @see #getCliente()
	 * @generated
	 */
	EReference getCliente_Pedido();

	/**
	 * Returns the meta object for class '{@link Pedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedido</em>'.
	 * @see Pedido
	 * @generated
	 */
	EClass getPedido();

	/**
	 * Returns the meta object for the attribute '{@link Pedido#getCodPedido <em>Cod Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Pedido</em>'.
	 * @see Pedido#getCodPedido()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_CodPedido();

	/**
	 * Returns the meta object for the attribute '{@link Pedido#getDataPedido <em>Data Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Pedido</em>'.
	 * @see Pedido#getDataPedido()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_DataPedido();

	/**
	 * Returns the meta object for the attribute '{@link Pedido#getCpf <em>Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf</em>'.
	 * @see Pedido#getCpf()
	 * @see #getPedido()
	 * @generated
	 */
	EAttribute getPedido_Cpf();

	/**
	 * Returns the meta object for the reference list '{@link Pedido#getProduto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produto</em>'.
	 * @see Pedido#getProduto()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_Produto();

	/**
	 * Returns the meta object for the reference list '{@link Pedido#getItemPedido <em>Item Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item Pedido</em>'.
	 * @see Pedido#getItemPedido()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_ItemPedido();

	/**
	 * Returns the meta object for the reference list '{@link Pedido#getCliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cliente</em>'.
	 * @see Pedido#getCliente()
	 * @see #getPedido()
	 * @generated
	 */
	EReference getPedido_Cliente();

	/**
	 * Returns the meta object for class '{@link Produto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produto</em>'.
	 * @see Produto
	 * @generated
	 */
	EClass getProduto();

	/**
	 * Returns the meta object for the attribute '{@link Produto#getCodProduto <em>Cod Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Produto</em>'.
	 * @see Produto#getCodProduto()
	 * @see #getProduto()
	 * @generated
	 */
	EAttribute getProduto_CodProduto();

	/**
	 * Returns the meta object for the attribute '{@link Produto#getNomeProduto <em>Nome Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Produto</em>'.
	 * @see Produto#getNomeProduto()
	 * @see #getProduto()
	 * @generated
	 */
	EAttribute getProduto_NomeProduto();

	/**
	 * Returns the meta object for the attribute '{@link Produto#getPrecoProduto <em>Preco Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preco Produto</em>'.
	 * @see Produto#getPrecoProduto()
	 * @see #getProduto()
	 * @generated
	 */
	EAttribute getProduto_PrecoProduto();

	/**
	 * Returns the meta object for the attribute '{@link Produto#getQtdeEstoque <em>Qtde Estoque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qtde Estoque</em>'.
	 * @see Produto#getQtdeEstoque()
	 * @see #getProduto()
	 * @generated
	 */
	EAttribute getProduto_QtdeEstoque();

	/**
	 * Returns the meta object for the reference list '{@link Produto#getCategoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categoria</em>'.
	 * @see Produto#getCategoria()
	 * @see #getProduto()
	 * @generated
	 */
	EReference getProduto_Categoria();

	/**
	 * Returns the meta object for the reference list '{@link Produto#getPedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pedido</em>'.
	 * @see Produto#getPedido()
	 * @see #getProduto()
	 * @generated
	 */
	EReference getProduto_Pedido();

	/**
	 * Returns the meta object for class '{@link Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categoria</em>'.
	 * @see Categoria
	 * @generated
	 */
	EClass getCategoria();

	/**
	 * Returns the meta object for the attribute '{@link Categoria#getCodCategoria <em>Cod Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Categoria</em>'.
	 * @see Categoria#getCodCategoria()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_CodCategoria();

	/**
	 * Returns the meta object for the attribute '{@link Categoria#getNomeCategoria <em>Nome Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Categoria</em>'.
	 * @see Categoria#getNomeCategoria()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_NomeCategoria();

	/**
	 * Returns the meta object for the reference '{@link Categoria#getProduto <em>Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Produto</em>'.
	 * @see Categoria#getProduto()
	 * @see #getCategoria()
	 * @generated
	 */
	EReference getCategoria_Produto();

	/**
	 * Returns the meta object for class '{@link ItemPedido <em>Item Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Pedido</em>'.
	 * @see ItemPedido
	 * @generated
	 */
	EClass getItemPedido();

	/**
	 * Returns the meta object for the attribute '{@link ItemPedido#getCodPedido <em>Cod Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Pedido</em>'.
	 * @see ItemPedido#getCodPedido()
	 * @see #getItemPedido()
	 * @generated
	 */
	EAttribute getItemPedido_CodPedido();

	/**
	 * Returns the meta object for the attribute '{@link ItemPedido#getCodProduto <em>Cod Produto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Produto</em>'.
	 * @see ItemPedido#getCodProduto()
	 * @see #getItemPedido()
	 * @generated
	 */
	EAttribute getItemPedido_CodProduto();

	/**
	 * Returns the meta object for the attribute '{@link ItemPedido#getQuantidade <em>Quantidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantidade</em>'.
	 * @see ItemPedido#getQuantidade()
	 * @see #getItemPedido()
	 * @generated
	 */
	EAttribute getItemPedido_Quantidade();

	/**
	 * Returns the meta object for the reference list '{@link ItemPedido#getPedido <em>Pedido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pedido</em>'.
	 * @see ItemPedido#getPedido()
	 * @see #getItemPedido()
	 * @generated
	 */
	EReference getItemPedido_Pedido();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcommerceFactory getEcommerceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.example.ecommerce.model.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.ecommerce.model.impl.ClienteImpl
		 * @see com.example.ecommerce.model.impl.EcommercePackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__CPF = eINSTANCE.getCliente_Cpf();

		/**
		 * The meta object literal for the '<em><b>Nome Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__NOME_CLIENTE = eINSTANCE.getCliente_NomeCliente();

		/**
		 * The meta object literal for the '<em><b>Endereco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__ENDERECO = eINSTANCE.getCliente_Endereco();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__ESTADO = eINSTANCE.getCliente_Estado();

		/**
		 * The meta object literal for the '<em><b>Municipio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__MUNICIPIO = eINSTANCE.getCliente_Municipio();

		/**
		 * The meta object literal for the '<em><b>Telefone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__TELEFONE = eINSTANCE.getCliente_Telefone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__EMAIL = eINSTANCE.getCliente_Email();

		/**
		 * The meta object literal for the '<em><b>Senha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE__SENHA = eINSTANCE.getCliente_Senha();

		/**
		 * The meta object literal for the '<em><b>Pedido</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE__PEDIDO = eINSTANCE.getCliente_Pedido();

		/**
		 * The meta object literal for the '{@link com.example.ecommerce.model.impl.PedidoImpl <em>Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.ecommerce.model.impl.PedidoImpl
		 * @see com.example.ecommerce.model.impl.EcommercePackageImpl#getPedido()
		 * @generated
		 */
		EClass PEDIDO = eINSTANCE.getPedido();

		/**
		 * The meta object literal for the '<em><b>Cod Pedido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__COD_PEDIDO = eINSTANCE.getPedido_CodPedido();

		/**
		 * The meta object literal for the '<em><b>Data Pedido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__DATA_PEDIDO = eINSTANCE.getPedido_DataPedido();

		/**
		 * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEDIDO__CPF = eINSTANCE.getPedido_Cpf();

		/**
		 * The meta object literal for the '<em><b>Produto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__PRODUTO = eINSTANCE.getPedido_Produto();

		/**
		 * The meta object literal for the '<em><b>Item Pedido</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__ITEM_PEDIDO = eINSTANCE.getPedido_ItemPedido();

		/**
		 * The meta object literal for the '<em><b>Cliente</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEDIDO__CLIENTE = eINSTANCE.getPedido_Cliente();

		/**
		 * The meta object literal for the '{@link com.example.ecommerce.model.impl.ProdutoImpl <em>Produto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.ecommerce.model.impl.ProdutoImpl
		 * @see com.example.ecommerce.model.impl.EcommercePackageImpl#getProduto()
		 * @generated
		 */
		EClass PRODUTO = eINSTANCE.getProduto();

		/**
		 * The meta object literal for the '<em><b>Cod Produto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUTO__COD_PRODUTO = eINSTANCE.getProduto_CodProduto();

		/**
		 * The meta object literal for the '<em><b>Nome Produto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUTO__NOME_PRODUTO = eINSTANCE.getProduto_NomeProduto();

		/**
		 * The meta object literal for the '<em><b>Preco Produto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUTO__PRECO_PRODUTO = eINSTANCE.getProduto_PrecoProduto();

		/**
		 * The meta object literal for the '<em><b>Qtde Estoque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUTO__QTDE_ESTOQUE = eINSTANCE.getProduto_QtdeEstoque();

		/**
		 * The meta object literal for the '<em><b>Categoria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUTO__CATEGORIA = eINSTANCE.getProduto_Categoria();

		/**
		 * The meta object literal for the '<em><b>Pedido</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUTO__PEDIDO = eINSTANCE.getProduto_Pedido();

		/**
		 * The meta object literal for the '{@link com.example.ecommerce.model.impl.CategoriaImpl <em>Categoria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.ecommerce.model.impl.CategoriaImpl
		 * @see com.example.ecommerce.model.impl.EcommercePackageImpl#getCategoria()
		 * @generated
		 */
		EClass CATEGORIA = eINSTANCE.getCategoria();

		/**
		 * The meta object literal for the '<em><b>Cod Categoria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__COD_CATEGORIA = eINSTANCE.getCategoria_CodCategoria();

		/**
		 * The meta object literal for the '<em><b>Nome Categoria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__NOME_CATEGORIA = eINSTANCE.getCategoria_NomeCategoria();

		/**
		 * The meta object literal for the '<em><b>Produto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIA__PRODUTO = eINSTANCE.getCategoria_Produto();

		/**
		 * The meta object literal for the '{@link com.example.ecommerce.model.impl.ItemPedidoImpl <em>Item Pedido</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.ecommerce.model.impl.ItemPedidoImpl
		 * @see com.example.ecommerce.model.impl.EcommercePackageImpl#getItemPedido()
		 * @generated
		 */
		EClass ITEM_PEDIDO = eINSTANCE.getItemPedido();

		/**
		 * The meta object literal for the '<em><b>Cod Pedido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_PEDIDO__COD_PEDIDO = eINSTANCE.getItemPedido_CodPedido();

		/**
		 * The meta object literal for the '<em><b>Cod Produto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_PEDIDO__COD_PRODUTO = eINSTANCE.getItemPedido_CodProduto();

		/**
		 * The meta object literal for the '<em><b>Quantidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_PEDIDO__QUANTIDADE = eINSTANCE.getItemPedido_Quantidade();

		/**
		 * The meta object literal for the '<em><b>Pedido</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_PEDIDO__PEDIDO = eINSTANCE.getItemPedido_Pedido();

	}

} //EcommercePackage

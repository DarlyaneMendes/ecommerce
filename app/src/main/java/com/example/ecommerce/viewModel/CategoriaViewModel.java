package com.example.ecommerce.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.ecommerce.model.Categoria;

import java.util.List;

public class CategoriaViewModel extends ViewModel {

    private MutableLiveData<List<Categoria>> mutableLiveData;
    private ComandoCategoriaNovo comandoCategoriaNovo;
    private ComandoCategoriaBuscarRetrofit comandoCategoriaBuscar;
    private ComandoCategoriaSalvarRetrofit comandoCategoriaSalvar;
    private ComandoCategoriaExcluirRetrofit comandoCategoriaExcluir;
    private ComandoCategoriaAtualizarRetrofit comandoCategoriaAtualizar;
    private ComandoCategoriaListarRetrofit comandoCategoriaListar;

    public CategoriaViewModel(){

        comandoCategoriaBuscar = new ComandoCategoriaBuscarRetrofit();
        comandoCategoriaExcluir = new ComandoCategoriaExcluirRetrofit();
        comandoCategoriaNovo = new ComandoCategoriaNovo();
        comandoCategoriaSalvar = new ComandoCategoriaSalvarRetrofit();
        comandoCategoriaAtualizar = new ComandoCategoriaAtualizarRetrofit();
        comandoCategoriaListar = new ComandoCategoriaListarRetrofit();
    }

    public LiveData<List<Categoria>> getCategoria(){

        if (mutableLiveData == null){

            //mutableLiveData = comandoCategoriaListar.execute();
        }
        return mutableLiveData;
    }

    /*public Categoria criarCategoriaNovo(){

        return comandoCategoriaNovo.execute();
    }

    public Categoria excluirCategoria (String codigo_categoria){

        return comandoCategoriaExcluir.execute(codigo_categoria);
    }

    public boolean salvarCategoria (String codigo_categoria, String descricao_categoria){

        Categoria categoria = comandoCategoriaSalvar.iniciarCategoria();
        categoria.setCodCategoria(codigo_categoria);
        categoria.setNomeCategoria(descricao_categoria);

        return comandoCategoriaSalvar.execute(categoria);
    }

    public boolean atualizarCategoria(String codigo_categoria, String descricao_categoria){

        Categoria categoria = comandoCategoriaAtualizar.iniciarCategoria();
        categoria.setCodCategoria(codigo_categoria);
        categoria.setNomeCategoria(descricao_categoria);

        return comandoCategoriaAtualizar.execute(categoria);
    }*/

}

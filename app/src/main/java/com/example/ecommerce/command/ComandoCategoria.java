package com.example.ecommerce.command;

import androidx.lifecycle.MutableLiveData;

import com.example.ecommerce.model.Categoria;
import com.example.ecommerce.model.EcommerceFactory;

import java.util.List;

public abstract class ComandoCategoria {

    protected Categoria categoria;

    protected static String titiant;

    protected EcommerceFactory factory;

    public ComandoCategoria(){

        factory = EcommerceFactory.eINSTANCE;
    }

    public Categoria iniciarCategoria(){

        categoria = factory.createCategoria();

        return categoria;
    }

    public Categoria execute(){
        return null;
    }

    public Categoria execute(String codCategoria){
        return null;

    }

    public boolean execute(Categoria categoria){
        return true;

    }

    public MutableLiveData<List<Categoria>> executar(){
        return null;
    }
}

package com.example.ecommerce.command;

import com.example.ecommerce.model.Categoria;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xml.type.impl.XMLTypeFactoryImpl;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

public class ComandoSalvar extends ComandoCategoria{

    public boolean execute(Categoria categoria){

        ResourceSet resourceSet = new ResourceSetImpl();

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource
                .Factory.Registry.DEFAULT_EXTENSION, new XMLTypeFactoryImpl());

        URI fileURI = URI.createFileURI(new File(categoria.getCodCategoria() + ".xmi")
        .getAbsolutePath());

        Resource resource = resourceSet.createResource(fileURI);

        resource.getContents().add(categoria);

        try{

            resource.save(Collections.emptyMap());
            return true;
        }

        catch (IOException e){

            return false;

        }
    }
}

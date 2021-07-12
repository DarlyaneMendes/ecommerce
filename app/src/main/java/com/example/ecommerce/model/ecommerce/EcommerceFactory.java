package com.example.ecommerce.model.ecommerce;

import com.example.ecommerce.model.ecommerce.impl.EcommerceFactoryImpl;

public interface EcommerceFactory  {

    EcommerceFactory eINSTANCE = EcommerceFactoryImpl.init();

    date createdate();

    long createlong();


    EcommercePackage getEcommercePackage();

}


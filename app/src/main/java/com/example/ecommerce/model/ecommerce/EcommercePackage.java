package com.example.ecommerce.model.ecommerce;

import com.example.ecommerce.model.ecommerce.impl.EcommercePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

public interface EcommercePackage extends EPackage {

	String eNAME = "ecommerce";

	String eNS_URI = "http:///ecommerce.ecore";

	String eNS_PREFIX = "ecommerce";

	EcommercePackage eINSTANCE = EcommercePackageImpl.init();

	int DATE = 0;

	int DATE_FEATURE_COUNT = 0;

	int DATE_OPERATION_COUNT = 0;

	int LONG = 1;

	int LONG_FEATURE_COUNT = 0;

	int LONG_OPERATION_COUNT = 0;

	EClass getdate();

	EClass getlong();

	EcommerceFactory getEcommerceFactory();

	interface Literals {

		EClass DATE = eINSTANCE.getdate();

		EClass LONG = eINSTANCE.getlong();
	}
}

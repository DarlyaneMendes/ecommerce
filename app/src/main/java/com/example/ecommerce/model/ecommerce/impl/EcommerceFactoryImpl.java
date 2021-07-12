package com.example.ecommerce.model.ecommerce.impl;

import com.example.ecommerce.model.ecommerce.EcommerceFactory;
import com.example.ecommerce.model.ecommerce.EcommercePackage;
import com.example.ecommerce.model.ecommerce.date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class EcommerceFactoryImpl extends EFactoryImpl implements EcommerceFactory {

	public static EcommerceFactory init() {
		try {
			EcommerceFactory theEcommerceFactory = (EcommerceFactory)EPackage.Registry.INSTANCE.getEFactory(EcommercePackage.eNS_URI);
			if (theEcommerceFactory != null) {
				return theEcommerceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcommerceFactoryImpl();
	}

	public EcommerceFactoryImpl() {
		super();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcommercePackage.DATE: return createdate();
			case EcommercePackage.LONG: return createlong();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() +
						"' is not a valid classifier");
		}
	}

	public date createdate() {
		dateImpl date = new dateImpl();
		return date;
	}

	public long createlong() {
		longImpl long_ = new longImpl();
		return long_;
	}

	public EcommercePackage getEcommercePackage() {

		return (EcommercePackage)getEPackage();
	}

	@Deprecated
	public static EcommercePackage getPackage() {

		return EcommercePackage.eINSTANCE;
	}

}

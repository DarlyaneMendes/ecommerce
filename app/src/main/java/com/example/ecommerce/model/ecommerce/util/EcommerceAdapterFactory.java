package com.example.ecommerce.model.ecommerce.util;

import com.example.ecommerce.model.ecommerce.EcommercePackage;
import com.example.ecommerce.model.ecommerce.date;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;


public class EcommerceAdapterFactory extends AdapterFactoryImpl {

	protected static EcommercePackage modelPackage;

	public EcommerceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcommercePackage.eINSTANCE;
		}
	}

	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	protected EcommerceSwitch<Adapter> modelSwitch =
		new EcommerceSwitch<Adapter>() {
			@Override
			public Adapter casedate(date object) {

				return createdateAdapter();
			}
			@Override
			public Adapter caselong(ecommerce.long object) {

				return createlongAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {

				return createEObjectAdapter();
			}
		};

	@Override
	public Adapter createAdapter(Notifier target) {

		return modelSwitch.doSwitch((EObject)target);
	}

	public Adapter createdateAdapter() {

		return null;
	}


	public Adapter createlongAdapter() {

		return null;
	}

	public Adapter createEObjectAdapter() {

		return null;
	}

}

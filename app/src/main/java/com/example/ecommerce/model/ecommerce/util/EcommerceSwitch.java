package com.example.ecommerce.model.ecommerce.util;

import android.widget.Switch;

import com.example.ecommerce.model.ecommerce.EcommercePackage;
import com.example.ecommerce.model.ecommerce.date;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

public class EcommerceSwitch<T> extends Switch<T> {

	protected static EcommercePackage modelPackage;

	public EcommerceSwitch()
		if (modelPackage == null) {
			modelPackage = EcommercePackage.eINSTANCE;
		}
	}

	@Override
	protected boolean isSwitchFor(EPackage ePackage) {

		return ePackage == modelPackage;
	}

	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EcommercePackage.DATE: {
				date date = (date)theEObject;
				T result = casedate(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcommercePackage.LONG: {
				ecommerce.long long_ = (ecommerce.long)theEObject;
				T result = caselong(long_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	public T casedate(date object) {

		return null;
	}

	public T caselong(ecommerce.long object) {

		return null;
	}
	@Override
	public T defaultCase(EObject object) {

		return null;
	}
}

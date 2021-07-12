/**
 */
package com.example.ecommerce.model.ecommerce.impl;

import com.example.ecommerce.model.ecommerce.EcommercePackage;
import com.example.ecommerce.model.ecommerce.date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

public class dateImpl extends MinimalEObjectImpl.Container implements date {

	protected dateImpl() {
		super();
	}
	@Override
	protected EClass eStaticClass() {

		return EcommercePackage.Literals.DATE;
	}

}

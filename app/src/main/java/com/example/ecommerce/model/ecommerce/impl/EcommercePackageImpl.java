package com.example.ecommerce.model.ecommerce.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;

import com.example.ecommerce.model.ecommerce.EcommerceFactory;
import com.example.ecommerce.model.ecommerce.EcommercePackage;
import com.example.ecommerce.model.ecommerce.date;
import com.example.ecommerce.model.ecommerce.ecommerce.EcommercePackage;

import ecommerce.EcommerceFactory;
import ecommerce.EcommercePackage;
import ecommerce.date;
import ecommerce.ecommerce.EcommercePackage;

public class EcommercePackageImpl extends EPackageImpl implements EcommercePackage {

	private EClass dateEClass = null;

	private EClass longEClass = null;

	private EcommercePackageImpl() {
		super(eNS_URI, EcommerceFactory.eINSTANCE);
	}

	private static boolean isInited = false;
	public static EcommercePackage init() {
		if (isInited) return (EcommercePackage)EPackage.Registry.INSTANCE
				.getEPackage(EcommercePackage.eNS_URI);

		Object registeredEcommercePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EcommercePackageImpl theEcommercePackage = registeredEcommercePackage instanceof
				EcommercePackageImpl ? (EcommercePackageImpl)registeredEcommercePackage :
				new EcommercePackageImpl();

		isInited = true;

		TypesPackage.eINSTANCE.eClass();

		Object registeredPackage = EPackage.Registry.INSTANCE.
				getEPackage(ecommerce.ecommerce.EcommercePackage.eNS_URI);
		ecommerce.ecommerce.impl.EcommercePackageImpl theEcommercePackage_1 =
				(ecommerce.ecommerce.impl.EcommercePackageImpl)
						(registeredPackage instanceof ecommerce.ecommerce.impl.
								EcommercePackageImpl ? registeredPackage :
								ecommerce.ecommerce.EcommercePackage.eINSTANCE);

		theEcommercePackage.createPackageContents();
		theEcommercePackage_1.createPackageContents();

		theEcommercePackage.initializePackageContents();
		theEcommercePackage_1.initializePackageContents();

		theEcommercePackage.freeze();

		EPackage.Registry.INSTANCE.put(EcommercePackage.eNS_URI, theEcommercePackage);
		return theEcommercePackage;
	}

	public EClass getdate() {
		return dateEClass;
	}

	public EClass getlong() {
		return longEClass;
	}

	public EcommerceFactory getEcommerceFactory() {

		return (EcommerceFactory)getEFactoryInstance();
	}

	private boolean isCreated = false;

	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		dateEClass = createEClass(DATE);

		longEClass = createEClass(LONG);
	}

	private boolean isInitialized = false;

	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		ecommerce.ecommerce.EcommercePackage theEcommercePackage_1 = (ecommerce.ecommerce.EcommercePackage)EPackage.Registry.INSTANCE.getEPackage(ecommerce.ecommerce.EcommercePackage.eNS_URI);

		getESubpackages().add(theEcommercePackage_1);


		initEClass(dateEClass, date.class, "date", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(longEClass, ecommerce.long.class, "long", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		createResource(eNS_URI);
	}

}

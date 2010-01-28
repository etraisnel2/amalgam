/**
 * 
 *   Copyright (c)  2009 Obeo.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Obeo - initial API and implementation
 *  
 *
 * $Id: DiscoveryPackageImpl.java,v 1.3 2010/01/27 14:36:07 cbrun Exp $
 */
package org.eclipse.amalgam.discovery.impl;

import org.eclipse.amalgam.discovery.Category;
import org.eclipse.amalgam.discovery.DiscoveryDefinition;
import org.eclipse.amalgam.discovery.DiscoveryFactory;
import org.eclipse.amalgam.discovery.DiscoveryPackage;
import org.eclipse.amalgam.discovery.Group;
import org.eclipse.amalgam.discovery.InstallableComponent;
import org.eclipse.amalgam.discovery.Overview;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscoveryPackageImpl extends EPackageImpl implements DiscoveryPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass installableComponentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass overviewEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass categoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass discoveryDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass groupEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.eclipse.amalgam.discovery.DiscoveryPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DiscoveryPackageImpl() {
        super(eNS_URI, DiscoveryFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link DiscoveryPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DiscoveryPackage init() {
        if (isInited) return (DiscoveryPackage)EPackage.Registry.INSTANCE.getEPackage(DiscoveryPackage.eNS_URI);

        // Obtain or create and register package
        DiscoveryPackageImpl theDiscoveryPackage = (DiscoveryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiscoveryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiscoveryPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theDiscoveryPackage.createPackageContents();

        // Initialize created meta-data
        theDiscoveryPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDiscoveryPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DiscoveryPackage.eNS_URI, theDiscoveryPackage);
        return theDiscoveryPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInstallableComponent() {
        return installableComponentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_Name() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_Provider() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_SiteURL() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_Description() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInstallableComponent_Groups() {
        return (EReference)installableComponentEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_Image32() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_Incubation() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInstallableComponent_Overview() {
        return (EReference)installableComponentEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInstallableComponent_Category() {
        return (EReference)installableComponentEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_Id() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_License() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_Selected() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_Available() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInstallableComponent_Installed() {
        return (EAttribute)installableComponentEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOverview() {
        return overviewEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOverview_Summary() {
        return (EAttribute)overviewEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOverview_Screenshot() {
        return (EAttribute)overviewEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOverview_Url() {
        return (EAttribute)overviewEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCategory() {
        return categoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCategory_Name() {
        return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCategory_Description() {
        return (EAttribute)categoryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategory_Components() {
        return (EReference)categoryEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCategory_Relevance() {
        return (EAttribute)categoryEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategory_Overview() {
        return (EReference)categoryEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCategory_Image48() {
        return (EAttribute)categoryEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiscoveryDefinition() {
        return discoveryDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiscoveryDefinition_Categories() {
        return (EReference)discoveryDefinitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiscoveryDefinition_Filters() {
        return (EReference)discoveryDefinitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGroup() {
        return groupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_Name() {
        return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiscoveryFactory getDiscoveryFactory() {
        return (DiscoveryFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        installableComponentEClass = createEClass(INSTALLABLE_COMPONENT);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__NAME);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__PROVIDER);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__SITE_URL);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__DESCRIPTION);
        createEReference(installableComponentEClass, INSTALLABLE_COMPONENT__OVERVIEW);
        createEReference(installableComponentEClass, INSTALLABLE_COMPONENT__CATEGORY);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__ID);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__LICENSE);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__SELECTED);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__AVAILABLE);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__INSTALLED);
        createEReference(installableComponentEClass, INSTALLABLE_COMPONENT__GROUPS);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__IMAGE32);
        createEAttribute(installableComponentEClass, INSTALLABLE_COMPONENT__INCUBATION);

        overviewEClass = createEClass(OVERVIEW);
        createEAttribute(overviewEClass, OVERVIEW__SUMMARY);
        createEAttribute(overviewEClass, OVERVIEW__SCREENSHOT);
        createEAttribute(overviewEClass, OVERVIEW__URL);

        categoryEClass = createEClass(CATEGORY);
        createEAttribute(categoryEClass, CATEGORY__NAME);
        createEAttribute(categoryEClass, CATEGORY__DESCRIPTION);
        createEReference(categoryEClass, CATEGORY__COMPONENTS);
        createEAttribute(categoryEClass, CATEGORY__RELEVANCE);
        createEReference(categoryEClass, CATEGORY__OVERVIEW);
        createEAttribute(categoryEClass, CATEGORY__IMAGE48);

        discoveryDefinitionEClass = createEClass(DISCOVERY_DEFINITION);
        createEReference(discoveryDefinitionEClass, DISCOVERY_DEFINITION__CATEGORIES);
        createEReference(discoveryDefinitionEClass, DISCOVERY_DEFINITION__FILTERS);

        groupEClass = createEClass(GROUP);
        createEAttribute(groupEClass, GROUP__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass(installableComponentEClass, InstallableComponent.class, "InstallableComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInstallableComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableComponent_Provider(), ecorePackage.getEString(), "provider", null, 1, 1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableComponent_SiteURL(), ecorePackage.getEString(), "siteURL", null, 1, 1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableComponent_Description(), ecorePackage.getEString(), "description", null, 0, 1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInstallableComponent_Overview(), this.getOverview(), null, "overview", null, 0, 1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInstallableComponent_Category(), this.getCategory(), this.getCategory_Components(), "category", null, 1, 1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableComponent_Id(), ecorePackage.getEString(), "id", null, 1, -1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableComponent_License(), ecorePackage.getEString(), "license", null, 1, 1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableComponent_Selected(), ecorePackage.getEBoolean(), "selected", "false", 1, 1, InstallableComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableComponent_Available(), ecorePackage.getEBoolean(), "available", "false", 1, 1, InstallableComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableComponent_Installed(), ecorePackage.getEBoolean(), "installed", "false", 1, 1, InstallableComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInstallableComponent_Groups(), this.getGroup(), null, "groups", null, 0, -1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableComponent_Image32(), ecorePackage.getEString(), "image32", null, 0, 1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInstallableComponent_Incubation(), ecorePackage.getEBoolean(), "incubation", "false", 1, 1, InstallableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(overviewEClass, Overview.class, "Overview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOverview_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, Overview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOverview_Screenshot(), ecorePackage.getEString(), "screenshot", null, 0, 1, Overview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOverview_Url(), ecorePackage.getEString(), "url", "http://www.eclipse.org/modeling", 1, 1, Overview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCategory_Description(), ecorePackage.getEString(), "description", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCategory_Components(), this.getInstallableComponent(), this.getInstallableComponent_Category(), "components", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        getCategory_Components().getEKeys().add(this.getInstallableComponent_Name());
        initEAttribute(getCategory_Relevance(), ecorePackage.getEIntegerObject(), "relevance", "5", 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCategory_Overview(), this.getOverview(), null, "overview", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCategory_Image48(), ecorePackage.getEString(), "image48", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(discoveryDefinitionEClass, DiscoveryDefinition.class, "DiscoveryDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDiscoveryDefinition_Categories(), this.getCategory(), null, "categories", null, 0, -1, DiscoveryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        getDiscoveryDefinition_Categories().getEKeys().add(this.getCategory_Name());
        initEReference(getDiscoveryDefinition_Filters(), this.getGroup(), null, "filters", null, 0, -1, DiscoveryDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 1, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //DiscoveryPackageImpl
/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.wH.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.wh.wH.Company;
import org.xtext.example.wh.wH.WHPackage;
import org.xtext.example.wh.wH.WarehouseManagement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Warehouse Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.wh.wH.impl.WarehouseManagementImpl#getCompanies <em>Companies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WarehouseManagementImpl extends MinimalEObjectImpl.Container implements WarehouseManagement
{
  /**
   * The cached value of the '{@link #getCompanies() <em>Companies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompanies()
   * @generated
   * @ordered
   */
  protected EList<Company> companies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WarehouseManagementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WHPackage.Literals.WAREHOUSE_MANAGEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Company> getCompanies()
  {
    if (companies == null)
    {
      companies = new EObjectContainmentEList<Company>(Company.class, this, WHPackage.WAREHOUSE_MANAGEMENT__COMPANIES);
    }
    return companies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WHPackage.WAREHOUSE_MANAGEMENT__COMPANIES:
        return ((InternalEList<?>)getCompanies()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WHPackage.WAREHOUSE_MANAGEMENT__COMPANIES:
        return getCompanies();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WHPackage.WAREHOUSE_MANAGEMENT__COMPANIES:
        getCompanies().clear();
        getCompanies().addAll((Collection<? extends Company>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WHPackage.WAREHOUSE_MANAGEMENT__COMPANIES:
        getCompanies().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WHPackage.WAREHOUSE_MANAGEMENT__COMPANIES:
        return companies != null && !companies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WarehouseManagementImpl
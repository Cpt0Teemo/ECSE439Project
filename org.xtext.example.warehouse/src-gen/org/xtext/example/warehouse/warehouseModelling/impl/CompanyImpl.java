/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.warehouse.warehouseModelling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.warehouse.warehouseModelling.Company;
import org.xtext.example.warehouse.warehouseModelling.Task;
import org.xtext.example.warehouse.warehouseModelling.Team;
import org.xtext.example.warehouse.warehouseModelling.Warehouse;
import org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.impl.CompanyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.impl.CompanyImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.impl.CompanyImpl#getWarehouses <em>Warehouses</em>}</li>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.impl.CompanyImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.impl.CompanyImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanyImpl extends MinimalEObjectImpl.Container implements Company
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected String address = ADDRESS_EDEFAULT;

  /**
   * The cached value of the '{@link #getWarehouses() <em>Warehouses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarehouses()
   * @generated
   * @ordered
   */
  protected EList<Warehouse> warehouses;

  /**
   * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeams()
   * @generated
   * @ordered
   */
  protected EList<Team> teams;

  /**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> tasks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompanyImpl()
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
    return WarehouseModellingPackage.Literals.COMPANY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WarehouseModellingPackage.COMPANY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAddress()
  {
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAddress(String newAddress)
  {
    String oldAddress = address;
    address = newAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WarehouseModellingPackage.COMPANY__ADDRESS, oldAddress, address));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Warehouse> getWarehouses()
  {
    if (warehouses == null)
    {
      warehouses = new EObjectContainmentEList<Warehouse>(Warehouse.class, this, WarehouseModellingPackage.COMPANY__WAREHOUSES);
    }
    return warehouses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Team> getTeams()
  {
    if (teams == null)
    {
      teams = new EObjectContainmentEList<Team>(Team.class, this, WarehouseModellingPackage.COMPANY__TEAMS);
    }
    return teams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Task> getTasks()
  {
    if (tasks == null)
    {
      tasks = new EObjectContainmentEList<Task>(Task.class, this, WarehouseModellingPackage.COMPANY__TASKS);
    }
    return tasks;
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
      case WarehouseModellingPackage.COMPANY__WAREHOUSES:
        return ((InternalEList<?>)getWarehouses()).basicRemove(otherEnd, msgs);
      case WarehouseModellingPackage.COMPANY__TEAMS:
        return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
      case WarehouseModellingPackage.COMPANY__TASKS:
        return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
      case WarehouseModellingPackage.COMPANY__NAME:
        return getName();
      case WarehouseModellingPackage.COMPANY__ADDRESS:
        return getAddress();
      case WarehouseModellingPackage.COMPANY__WAREHOUSES:
        return getWarehouses();
      case WarehouseModellingPackage.COMPANY__TEAMS:
        return getTeams();
      case WarehouseModellingPackage.COMPANY__TASKS:
        return getTasks();
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
      case WarehouseModellingPackage.COMPANY__NAME:
        setName((String)newValue);
        return;
      case WarehouseModellingPackage.COMPANY__ADDRESS:
        setAddress((String)newValue);
        return;
      case WarehouseModellingPackage.COMPANY__WAREHOUSES:
        getWarehouses().clear();
        getWarehouses().addAll((Collection<? extends Warehouse>)newValue);
        return;
      case WarehouseModellingPackage.COMPANY__TEAMS:
        getTeams().clear();
        getTeams().addAll((Collection<? extends Team>)newValue);
        return;
      case WarehouseModellingPackage.COMPANY__TASKS:
        getTasks().clear();
        getTasks().addAll((Collection<? extends Task>)newValue);
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
      case WarehouseModellingPackage.COMPANY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WarehouseModellingPackage.COMPANY__ADDRESS:
        setAddress(ADDRESS_EDEFAULT);
        return;
      case WarehouseModellingPackage.COMPANY__WAREHOUSES:
        getWarehouses().clear();
        return;
      case WarehouseModellingPackage.COMPANY__TEAMS:
        getTeams().clear();
        return;
      case WarehouseModellingPackage.COMPANY__TASKS:
        getTasks().clear();
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
      case WarehouseModellingPackage.COMPANY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WarehouseModellingPackage.COMPANY__ADDRESS:
        return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
      case WarehouseModellingPackage.COMPANY__WAREHOUSES:
        return warehouses != null && !warehouses.isEmpty();
      case WarehouseModellingPackage.COMPANY__TEAMS:
        return teams != null && !teams.isEmpty();
      case WarehouseModellingPackage.COMPANY__TASKS:
        return tasks != null && !tasks.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", address: ");
    result.append(address);
    result.append(')');
    return result.toString();
  }

} //CompanyImpl

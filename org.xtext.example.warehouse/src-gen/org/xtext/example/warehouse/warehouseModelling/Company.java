/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.warehouse.warehouseModelling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.Company#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.Company#getAddress <em>Address</em>}</li>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.Company#getWarehouses <em>Warehouses</em>}</li>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.Company#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getCompany_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.warehouse.warehouseModelling.Company#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(String)
   * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getCompany_Address()
   * @model
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link org.xtext.example.warehouse.warehouseModelling.Company#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

  /**
   * Returns the value of the '<em><b>Warehouses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.warehouse.warehouseModelling.Warehouse}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Warehouses</em>' containment reference list.
   * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getCompany_Warehouses()
   * @model containment="true"
   * @generated
   */
  EList<Warehouse> getWarehouses();

  /**
   * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.warehouse.warehouseModelling.Team}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teams</em>' containment reference list.
   * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getCompany_Teams()
   * @model containment="true"
   * @generated
   */
  EList<Team> getTeams();

} // Company
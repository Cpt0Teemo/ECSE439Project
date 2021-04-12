/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.warehouse.warehouseModelling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warehouse Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.WarehouseManagement#getCompanies <em>Companies</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getWarehouseManagement()
 * @model
 * @generated
 */
public interface WarehouseManagement extends EObject
{
  /**
   * Returns the value of the '<em><b>Companies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.warehouse.warehouseModelling.Company}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Companies</em>' containment reference list.
   * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getWarehouseManagement_Companies()
   * @model containment="true"
   * @generated
   */
  EList<Company> getCompanies();

} // WarehouseManagement

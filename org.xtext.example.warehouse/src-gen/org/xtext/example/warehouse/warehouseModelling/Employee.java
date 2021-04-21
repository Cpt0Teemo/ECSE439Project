/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.warehouse.warehouseModelling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.Employee#getAvailabilities <em>Availabilities</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Role
{
  /**
   * Returns the value of the '<em><b>Availabilities</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.warehouse.warehouseModelling.Availability}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Availabilities</em>' containment reference list.
   * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getEmployee_Availabilities()
   * @model containment="true"
   * @generated
   */
  EList<Availability> getAvailabilities();

} // Employee

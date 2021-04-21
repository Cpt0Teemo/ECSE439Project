/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.warehouse.warehouseModelling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.warehouse.warehouseModelling.Person#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getPerson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.warehouse.warehouseModelling.Person#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.warehouse.warehouseModelling.Role}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage#getPerson_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRoles();

} // Person

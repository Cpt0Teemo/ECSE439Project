/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.wH;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.wh.wH.WHPackage
 * @generated
 */
public interface WHFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WHFactory eINSTANCE = org.xtext.example.wh.wH.impl.WHFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Warehouse Management</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Warehouse Management</em>'.
   * @generated
   */
  WarehouseManagement createWarehouseManagement();

  /**
   * Returns a new object of class '<em>Company</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Company</em>'.
   * @generated
   */
  Company createCompany();

  /**
   * Returns a new object of class '<em>Warehouse</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Warehouse</em>'.
   * @generated
   */
  Warehouse createWarehouse();

  /**
   * Returns a new object of class '<em>Team</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Team</em>'.
   * @generated
   */
  Team createTeam();

  /**
   * Returns a new object of class '<em>Person</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Person</em>'.
   * @generated
   */
  Person createPerson();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>Employee</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Employee</em>'.
   * @generated
   */
  Employee createEmployee();

  /**
   * Returns a new object of class '<em>Manager</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Manager</em>'.
   * @generated
   */
  Manager createManager();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Task Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Assignment</em>'.
   * @generated
   */
  TaskAssignment createTaskAssignment();

  /**
   * Returns a new object of class '<em>Availability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Availability</em>'.
   * @generated
   */
  Availability createAvailability();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WHPackage getWHPackage();

} //WHFactory
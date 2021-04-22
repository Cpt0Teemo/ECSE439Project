/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.wH;

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
 *   <li>{@link org.xtext.example.wh.wH.Company#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.Company#getAddress <em>Address</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.Company#getWarehouses <em>Warehouses</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.Company#getTeams <em>Teams</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.Company#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.wh.wH.WHPackage#getCompany()
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
   * @see org.xtext.example.wh.wH.WHPackage#getCompany_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.wh.wH.Company#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.example.wh.wH.WHPackage#getCompany_Address()
   * @model
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link org.xtext.example.wh.wH.Company#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

  /**
   * Returns the value of the '<em><b>Warehouses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.wh.wH.Warehouse}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Warehouses</em>' containment reference list.
   * @see org.xtext.example.wh.wH.WHPackage#getCompany_Warehouses()
   * @model containment="true"
   * @generated
   */
  EList<Warehouse> getWarehouses();

  /**
   * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.wh.wH.Team}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teams</em>' containment reference list.
   * @see org.xtext.example.wh.wH.WHPackage#getCompany_Teams()
   * @model containment="true"
   * @generated
   */
  EList<Team> getTeams();

  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.wh.wH.Task}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see org.xtext.example.wh.wH.WHPackage#getCompany_Tasks()
   * @model containment="true"
   * @generated
   */
  EList<Task> getTasks();

} // Company

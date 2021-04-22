/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.wH;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.wh.wH.Role#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.Role#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.Role#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.wh.wH.WHPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject
{
  /**
   * Returns the value of the '<em><b>Employee Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Employee Id</em>' attribute.
   * @see #setEmployeeId(String)
   * @see org.xtext.example.wh.wH.WHPackage#getRole_EmployeeId()
   * @model
   * @generated
   */
  String getEmployeeId();

  /**
   * Sets the value of the '{@link org.xtext.example.wh.wH.Role#getEmployeeId <em>Employee Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Employee Id</em>' attribute.
   * @see #getEmployeeId()
   * @generated
   */
  void setEmployeeId(String value);

  /**
   * Returns the value of the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Date</em>' attribute.
   * @see #setStartDate(String)
   * @see org.xtext.example.wh.wH.WHPackage#getRole_StartDate()
   * @model
   * @generated
   */
  String getStartDate();

  /**
   * Sets the value of the '{@link org.xtext.example.wh.wH.Role#getStartDate <em>Start Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Date</em>' attribute.
   * @see #getStartDate()
   * @generated
   */
  void setStartDate(String value);

  /**
   * Returns the value of the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Date</em>' attribute.
   * @see #setEndDate(String)
   * @see org.xtext.example.wh.wH.WHPackage#getRole_EndDate()
   * @model
   * @generated
   */
  String getEndDate();

  /**
   * Sets the value of the '{@link org.xtext.example.wh.wH.Role#getEndDate <em>End Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Date</em>' attribute.
   * @see #getEndDate()
   * @generated
   */
  void setEndDate(String value);

} // Role

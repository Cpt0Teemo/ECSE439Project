/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.wH;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.wh.wH.TaskAssignment#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.TaskAssignment#getRole <em>Role</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.TaskAssignment#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.TaskAssignment#isIsDone <em>Is Done</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.wh.wH.WHPackage#getTaskAssignment()
 * @model
 * @generated
 */
public interface TaskAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.wh.wH.WHPackage#getTaskAssignment_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.wh.wH.TaskAssignment#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(Role)
   * @see org.xtext.example.wh.wH.WHPackage#getTaskAssignment_Role()
   * @model
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link org.xtext.example.wh.wH.TaskAssignment#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

  /**
   * Returns the value of the '<em><b>Availability</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Availability</em>' reference.
   * @see #setAvailability(Availability)
   * @see org.xtext.example.wh.wH.WHPackage#getTaskAssignment_Availability()
   * @model
   * @generated
   */
  Availability getAvailability();

  /**
   * Sets the value of the '{@link org.xtext.example.wh.wH.TaskAssignment#getAvailability <em>Availability</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Availability</em>' reference.
   * @see #getAvailability()
   * @generated
   */
  void setAvailability(Availability value);

  /**
   * Returns the value of the '<em><b>Is Done</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Done</em>' attribute.
   * @see #setIsDone(boolean)
   * @see org.xtext.example.wh.wH.WHPackage#getTaskAssignment_IsDone()
   * @model
   * @generated
   */
  boolean isIsDone();

  /**
   * Sets the value of the '{@link org.xtext.example.wh.wH.TaskAssignment#isIsDone <em>Is Done</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Done</em>' attribute.
   * @see #isIsDone()
   * @generated
   */
  void setIsDone(boolean value);

} // TaskAssignment

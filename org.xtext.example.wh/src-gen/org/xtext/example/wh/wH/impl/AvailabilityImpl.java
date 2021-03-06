/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.wH.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.wh.wH.Availability;
import org.xtext.example.wh.wH.WHPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.wh.wH.impl.AvailabilityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.impl.AvailabilityImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.xtext.example.wh.wH.impl.AvailabilityImpl#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailabilityImpl extends MinimalEObjectImpl.Container implements Availability
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartTime()
   * @generated
   * @ordered
   */
  protected static final String START_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartTime()
   * @generated
   * @ordered
   */
  protected String startTime = START_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndTime()
   * @generated
   * @ordered
   */
  protected static final String END_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndTime()
   * @generated
   * @ordered
   */
  protected String endTime = END_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AvailabilityImpl()
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
    return WHPackage.Literals.AVAILABILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WHPackage.AVAILABILITY__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStartTime()
  {
    return startTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStartTime(String newStartTime)
  {
    String oldStartTime = startTime;
    startTime = newStartTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WHPackage.AVAILABILITY__START_TIME, oldStartTime, startTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEndTime()
  {
    return endTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEndTime(String newEndTime)
  {
    String oldEndTime = endTime;
    endTime = newEndTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WHPackage.AVAILABILITY__END_TIME, oldEndTime, endTime));
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
      case WHPackage.AVAILABILITY__ID:
        return getId();
      case WHPackage.AVAILABILITY__START_TIME:
        return getStartTime();
      case WHPackage.AVAILABILITY__END_TIME:
        return getEndTime();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WHPackage.AVAILABILITY__ID:
        setId((String)newValue);
        return;
      case WHPackage.AVAILABILITY__START_TIME:
        setStartTime((String)newValue);
        return;
      case WHPackage.AVAILABILITY__END_TIME:
        setEndTime((String)newValue);
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
      case WHPackage.AVAILABILITY__ID:
        setId(ID_EDEFAULT);
        return;
      case WHPackage.AVAILABILITY__START_TIME:
        setStartTime(START_TIME_EDEFAULT);
        return;
      case WHPackage.AVAILABILITY__END_TIME:
        setEndTime(END_TIME_EDEFAULT);
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
      case WHPackage.AVAILABILITY__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case WHPackage.AVAILABILITY__START_TIME:
        return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
      case WHPackage.AVAILABILITY__END_TIME:
        return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
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
    result.append(" (id: ");
    result.append(id);
    result.append(", startTime: ");
    result.append(startTime);
    result.append(", endTime: ");
    result.append(endTime);
    result.append(')');
    return result.toString();
  }

} //AvailabilityImpl

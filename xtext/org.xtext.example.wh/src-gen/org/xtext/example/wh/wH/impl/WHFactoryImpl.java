/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.wH.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.wh.wH.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WHFactoryImpl extends EFactoryImpl implements WHFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WHFactory init()
  {
    try
    {
      WHFactory theWHFactory = (WHFactory)EPackage.Registry.INSTANCE.getEFactory(WHPackage.eNS_URI);
      if (theWHFactory != null)
      {
        return theWHFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WHFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WHFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WHPackage.WAREHOUSE_MANAGEMENT: return createWarehouseManagement();
      case WHPackage.COMPANY: return createCompany();
      case WHPackage.WAREHOUSE: return createWarehouse();
      case WHPackage.TEAM: return createTeam();
      case WHPackage.PERSON: return createPerson();
      case WHPackage.ROLE: return createRole();
      case WHPackage.EMPLOYEE: return createEmployee();
      case WHPackage.MANAGER: return createManager();
      case WHPackage.TASK: return createTask();
      case WHPackage.TASK_ASSIGNMENT: return createTaskAssignment();
      case WHPackage.AVAILABILITY: return createAvailability();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WarehouseManagement createWarehouseManagement()
  {
    WarehouseManagementImpl warehouseManagement = new WarehouseManagementImpl();
    return warehouseManagement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Company createCompany()
  {
    CompanyImpl company = new CompanyImpl();
    return company;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Warehouse createWarehouse()
  {
    WarehouseImpl warehouse = new WarehouseImpl();
    return warehouse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Team createTeam()
  {
    TeamImpl team = new TeamImpl();
    return team;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Person createPerson()
  {
    PersonImpl person = new PersonImpl();
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Employee createEmployee()
  {
    EmployeeImpl employee = new EmployeeImpl();
    return employee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Manager createManager()
  {
    ManagerImpl manager = new ManagerImpl();
    return manager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TaskAssignment createTaskAssignment()
  {
    TaskAssignmentImpl taskAssignment = new TaskAssignmentImpl();
    return taskAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Availability createAvailability()
  {
    AvailabilityImpl availability = new AvailabilityImpl();
    return availability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WHPackage getWHPackage()
  {
    return (WHPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WHPackage getPackage()
  {
    return WHPackage.eINSTANCE;
  }

} //WHFactoryImpl

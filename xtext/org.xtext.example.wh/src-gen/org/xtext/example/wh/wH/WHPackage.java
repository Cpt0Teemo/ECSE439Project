/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.wH;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.wh.wH.WHFactory
 * @model kind="package"
 * @generated
 */
public interface WHPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "wH";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/wh/WH";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "wH";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WHPackage eINSTANCE = org.xtext.example.wh.wH.impl.WHPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.WarehouseManagementImpl <em>Warehouse Management</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.WarehouseManagementImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getWarehouseManagement()
   * @generated
   */
  int WAREHOUSE_MANAGEMENT = 0;

  /**
   * The feature id for the '<em><b>Companies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAREHOUSE_MANAGEMENT__COMPANIES = 0;

  /**
   * The number of structural features of the '<em>Warehouse Management</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAREHOUSE_MANAGEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.CompanyImpl <em>Company</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.CompanyImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getCompany()
   * @generated
   */
  int COMPANY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY__NAME = 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY__ADDRESS = 1;

  /**
   * The feature id for the '<em><b>Warehouses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY__WAREHOUSES = 2;

  /**
   * The feature id for the '<em><b>Teams</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY__TEAMS = 3;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY__TASKS = 4;

  /**
   * The number of structural features of the '<em>Company</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.WarehouseImpl <em>Warehouse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.WarehouseImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getWarehouse()
   * @generated
   */
  int WAREHOUSE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAREHOUSE__NAME = 0;

  /**
   * The feature id for the '<em><b>Workers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAREHOUSE__WORKERS = 1;

  /**
   * The number of structural features of the '<em>Warehouse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAREHOUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.TeamImpl <em>Team</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.TeamImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getTeam()
   * @generated
   */
  int TEAM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM__NAME = 0;

  /**
   * The number of structural features of the '<em>Team</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.PersonImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__ROLES = 1;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.RoleImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getRole()
   * @generated
   */
  int ROLE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__START_DATE = 1;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__END_DATE = 2;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.EmployeeImpl <em>Employee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.EmployeeImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getEmployee()
   * @generated
   */
  int EMPLOYEE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__NAME = ROLE__NAME;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__START_DATE = ROLE__START_DATE;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__END_DATE = ROLE__END_DATE;

  /**
   * The feature id for the '<em><b>Availabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__AVAILABILITIES = ROLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Employee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.ManagerImpl <em>Manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.ManagerImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getManager()
   * @generated
   */
  int MANAGER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGER__NAME = ROLE__NAME;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGER__START_DATE = ROLE__START_DATE;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGER__END_DATE = ROLE__END_DATE;

  /**
   * The feature id for the '<em><b>Manages</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGER__MANAGES = ROLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.TaskImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getTask()
   * @generated
   */
  int TASK = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ASSIGNMENT = 2;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.TaskAssignmentImpl <em>Task Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.TaskAssignmentImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getTaskAssignment()
   * @generated
   */
  int TASK_ASSIGNMENT = 9;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ASSIGNMENT__ROLE = 0;

  /**
   * The feature id for the '<em><b>Availability</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ASSIGNMENT__AVAILABILITY = 1;

  /**
   * The feature id for the '<em><b>Is Done</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ASSIGNMENT__IS_DONE = 2;

  /**
   * The number of structural features of the '<em>Task Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_ASSIGNMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.wh.wH.impl.AvailabilityImpl <em>Availability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wh.wH.impl.AvailabilityImpl
   * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getAvailability()
   * @generated
   */
  int AVAILABILITY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVAILABILITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Start Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVAILABILITY__START_TIME = 1;

  /**
   * The feature id for the '<em><b>End Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVAILABILITY__END_TIME = 2;

  /**
   * The number of structural features of the '<em>Availability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVAILABILITY_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.WarehouseManagement <em>Warehouse Management</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Warehouse Management</em>'.
   * @see org.xtext.example.wh.wH.WarehouseManagement
   * @generated
   */
  EClass getWarehouseManagement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wh.wH.WarehouseManagement#getCompanies <em>Companies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Companies</em>'.
   * @see org.xtext.example.wh.wH.WarehouseManagement#getCompanies()
   * @see #getWarehouseManagement()
   * @generated
   */
  EReference getWarehouseManagement_Companies();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.Company <em>Company</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Company</em>'.
   * @see org.xtext.example.wh.wH.Company
   * @generated
   */
  EClass getCompany();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Company#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wh.wH.Company#getName()
   * @see #getCompany()
   * @generated
   */
  EAttribute getCompany_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Company#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see org.xtext.example.wh.wH.Company#getAddress()
   * @see #getCompany()
   * @generated
   */
  EAttribute getCompany_Address();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wh.wH.Company#getWarehouses <em>Warehouses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Warehouses</em>'.
   * @see org.xtext.example.wh.wH.Company#getWarehouses()
   * @see #getCompany()
   * @generated
   */
  EReference getCompany_Warehouses();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wh.wH.Company#getTeams <em>Teams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Teams</em>'.
   * @see org.xtext.example.wh.wH.Company#getTeams()
   * @see #getCompany()
   * @generated
   */
  EReference getCompany_Teams();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wh.wH.Company#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see org.xtext.example.wh.wH.Company#getTasks()
   * @see #getCompany()
   * @generated
   */
  EReference getCompany_Tasks();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.Warehouse <em>Warehouse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Warehouse</em>'.
   * @see org.xtext.example.wh.wH.Warehouse
   * @generated
   */
  EClass getWarehouse();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Warehouse#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wh.wH.Warehouse#getName()
   * @see #getWarehouse()
   * @generated
   */
  EAttribute getWarehouse_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wh.wH.Warehouse#getWorkers <em>Workers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Workers</em>'.
   * @see org.xtext.example.wh.wH.Warehouse#getWorkers()
   * @see #getWarehouse()
   * @generated
   */
  EReference getWarehouse_Workers();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.Team <em>Team</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Team</em>'.
   * @see org.xtext.example.wh.wH.Team
   * @generated
   */
  EClass getTeam();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Team#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wh.wH.Team#getName()
   * @see #getTeam()
   * @generated
   */
  EAttribute getTeam_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see org.xtext.example.wh.wH.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wh.wH.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wh.wH.Person#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see org.xtext.example.wh.wH.Person#getRoles()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Roles();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see org.xtext.example.wh.wH.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Role#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wh.wH.Role#getName()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Role#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see org.xtext.example.wh.wH.Role#getStartDate()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_StartDate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Role#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see org.xtext.example.wh.wH.Role#getEndDate()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_EndDate();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.Employee <em>Employee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Employee</em>'.
   * @see org.xtext.example.wh.wH.Employee
   * @generated
   */
  EClass getEmployee();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wh.wH.Employee#getAvailabilities <em>Availabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Availabilities</em>'.
   * @see org.xtext.example.wh.wH.Employee#getAvailabilities()
   * @see #getEmployee()
   * @generated
   */
  EReference getEmployee_Availabilities();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.Manager <em>Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manager</em>'.
   * @see org.xtext.example.wh.wH.Manager
   * @generated
   */
  EClass getManager();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.wh.wH.Manager#getManages <em>Manages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Manages</em>'.
   * @see org.xtext.example.wh.wH.Manager#getManages()
   * @see #getManager()
   * @generated
   */
  EReference getManager_Manages();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.xtext.example.wh.wH.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wh.wH.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Task#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.wh.wH.Task#getDescription()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Description();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.wh.wH.Task#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment</em>'.
   * @see org.xtext.example.wh.wH.Task#getAssignment()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Assignment();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.TaskAssignment <em>Task Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Assignment</em>'.
   * @see org.xtext.example.wh.wH.TaskAssignment
   * @generated
   */
  EClass getTaskAssignment();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.wh.wH.TaskAssignment#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see org.xtext.example.wh.wH.TaskAssignment#getRole()
   * @see #getTaskAssignment()
   * @generated
   */
  EReference getTaskAssignment_Role();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.wh.wH.TaskAssignment#getAvailability <em>Availability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Availability</em>'.
   * @see org.xtext.example.wh.wH.TaskAssignment#getAvailability()
   * @see #getTaskAssignment()
   * @generated
   */
  EReference getTaskAssignment_Availability();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.TaskAssignment#isIsDone <em>Is Done</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Done</em>'.
   * @see org.xtext.example.wh.wH.TaskAssignment#isIsDone()
   * @see #getTaskAssignment()
   * @generated
   */
  EAttribute getTaskAssignment_IsDone();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wh.wH.Availability <em>Availability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Availability</em>'.
   * @see org.xtext.example.wh.wH.Availability
   * @generated
   */
  EClass getAvailability();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Availability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wh.wH.Availability#getName()
   * @see #getAvailability()
   * @generated
   */
  EAttribute getAvailability_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Availability#getStartTime <em>Start Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Time</em>'.
   * @see org.xtext.example.wh.wH.Availability#getStartTime()
   * @see #getAvailability()
   * @generated
   */
  EAttribute getAvailability_StartTime();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wh.wH.Availability#getEndTime <em>End Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Time</em>'.
   * @see org.xtext.example.wh.wH.Availability#getEndTime()
   * @see #getAvailability()
   * @generated
   */
  EAttribute getAvailability_EndTime();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WHFactory getWHFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.WarehouseManagementImpl <em>Warehouse Management</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.WarehouseManagementImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getWarehouseManagement()
     * @generated
     */
    EClass WAREHOUSE_MANAGEMENT = eINSTANCE.getWarehouseManagement();

    /**
     * The meta object literal for the '<em><b>Companies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WAREHOUSE_MANAGEMENT__COMPANIES = eINSTANCE.getWarehouseManagement_Companies();

    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.CompanyImpl <em>Company</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.CompanyImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getCompany()
     * @generated
     */
    EClass COMPANY = eINSTANCE.getCompany();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPANY__ADDRESS = eINSTANCE.getCompany_Address();

    /**
     * The meta object literal for the '<em><b>Warehouses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPANY__WAREHOUSES = eINSTANCE.getCompany_Warehouses();

    /**
     * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPANY__TEAMS = eINSTANCE.getCompany_Teams();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPANY__TASKS = eINSTANCE.getCompany_Tasks();

    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.WarehouseImpl <em>Warehouse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.WarehouseImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getWarehouse()
     * @generated
     */
    EClass WAREHOUSE = eINSTANCE.getWarehouse();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAREHOUSE__NAME = eINSTANCE.getWarehouse_Name();

    /**
     * The meta object literal for the '<em><b>Workers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WAREHOUSE__WORKERS = eINSTANCE.getWarehouse_Workers();

    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.TeamImpl <em>Team</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.TeamImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getTeam()
     * @generated
     */
    EClass TEAM = eINSTANCE.getTeam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.PersonImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__ROLES = eINSTANCE.getPerson_Roles();

    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.RoleImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

    /**
     * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__START_DATE = eINSTANCE.getRole_StartDate();

    /**
     * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__END_DATE = eINSTANCE.getRole_EndDate();

    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.EmployeeImpl <em>Employee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.EmployeeImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getEmployee()
     * @generated
     */
    EClass EMPLOYEE = eINSTANCE.getEmployee();

    /**
     * The meta object literal for the '<em><b>Availabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMPLOYEE__AVAILABILITIES = eINSTANCE.getEmployee_Availabilities();

    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.ManagerImpl <em>Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.ManagerImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getManager()
     * @generated
     */
    EClass MANAGER = eINSTANCE.getManager();

    /**
     * The meta object literal for the '<em><b>Manages</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANAGER__MANAGES = eINSTANCE.getManager_Manages();

    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.TaskImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__ASSIGNMENT = eINSTANCE.getTask_Assignment();

    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.TaskAssignmentImpl <em>Task Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.TaskAssignmentImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getTaskAssignment()
     * @generated
     */
    EClass TASK_ASSIGNMENT = eINSTANCE.getTaskAssignment();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_ASSIGNMENT__ROLE = eINSTANCE.getTaskAssignment_Role();

    /**
     * The meta object literal for the '<em><b>Availability</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_ASSIGNMENT__AVAILABILITY = eINSTANCE.getTaskAssignment_Availability();

    /**
     * The meta object literal for the '<em><b>Is Done</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK_ASSIGNMENT__IS_DONE = eINSTANCE.getTaskAssignment_IsDone();

    /**
     * The meta object literal for the '{@link org.xtext.example.wh.wH.impl.AvailabilityImpl <em>Availability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wh.wH.impl.AvailabilityImpl
     * @see org.xtext.example.wh.wH.impl.WHPackageImpl#getAvailability()
     * @generated
     */
    EClass AVAILABILITY = eINSTANCE.getAvailability();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AVAILABILITY__NAME = eINSTANCE.getAvailability_Name();

    /**
     * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AVAILABILITY__START_TIME = eINSTANCE.getAvailability_StartTime();

    /**
     * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AVAILABILITY__END_TIME = eINSTANCE.getAvailability_EndTime();

  }

} //WHPackage
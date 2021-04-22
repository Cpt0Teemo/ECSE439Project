/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.warehouse.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.warehouse.services.WarehouseModellingGrammarAccess;
import org.xtext.example.warehouse.warehouseModelling.Availability;
import org.xtext.example.warehouse.warehouseModelling.Company;
import org.xtext.example.warehouse.warehouseModelling.Employee;
import org.xtext.example.warehouse.warehouseModelling.Manager;
import org.xtext.example.warehouse.warehouseModelling.Person;
import org.xtext.example.warehouse.warehouseModelling.Task;
import org.xtext.example.warehouse.warehouseModelling.TaskAssignment;
import org.xtext.example.warehouse.warehouseModelling.Team;
import org.xtext.example.warehouse.warehouseModelling.Warehouse;
import org.xtext.example.warehouse.warehouseModelling.WarehouseManagement;
import org.xtext.example.warehouse.warehouseModelling.WarehouseModellingPackage;

@SuppressWarnings("all")
public class WarehouseModellingSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WarehouseModellingGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WarehouseModellingPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WarehouseModellingPackage.AVAILABILITY:
				sequence_Availability(context, (Availability) semanticObject); 
				return; 
			case WarehouseModellingPackage.COMPANY:
				sequence_Company(context, (Company) semanticObject); 
				return; 
			case WarehouseModellingPackage.EMPLOYEE:
				sequence_Employee(context, (Employee) semanticObject); 
				return; 
			case WarehouseModellingPackage.MANAGER:
				sequence_Manager(context, (Manager) semanticObject); 
				return; 
			case WarehouseModellingPackage.PERSON:
				sequence_Person(context, (Person) semanticObject); 
				return; 
			case WarehouseModellingPackage.TASK:
				sequence_Task(context, (Task) semanticObject); 
				return; 
			case WarehouseModellingPackage.TASK_ASSIGNMENT:
				sequence_TaskAssignment(context, (TaskAssignment) semanticObject); 
				return; 
			case WarehouseModellingPackage.TEAM:
				sequence_Team(context, (Team) semanticObject); 
				return; 
			case WarehouseModellingPackage.WAREHOUSE:
				sequence_Warehouse(context, (Warehouse) semanticObject); 
				return; 
			case WarehouseModellingPackage.WAREHOUSE_MANAGEMENT:
				sequence_WarehouseManagement(context, (WarehouseManagement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Availability returns Availability
	 *
	 * Constraint:
	 *     (id=ID startTime=STRING endTime=STRING)
	 */
	protected void sequence_Availability(ISerializationContext context, Availability semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WarehouseModellingPackage.Literals.AVAILABILITY__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WarehouseModellingPackage.Literals.AVAILABILITY__ID));
			if (transientValues.isValueTransient(semanticObject, WarehouseModellingPackage.Literals.AVAILABILITY__START_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WarehouseModellingPackage.Literals.AVAILABILITY__START_TIME));
			if (transientValues.isValueTransient(semanticObject, WarehouseModellingPackage.Literals.AVAILABILITY__END_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WarehouseModellingPackage.Literals.AVAILABILITY__END_TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAvailabilityAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getAvailabilityAccess().getStartTimeSTRINGTerminalRuleCall_3_0(), semanticObject.getStartTime());
		feeder.accept(grammarAccess.getAvailabilityAccess().getEndTimeSTRINGTerminalRuleCall_5_0(), semanticObject.getEndTime());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Company returns Company
	 *
	 * Constraint:
	 *     (name=ID address=STRING warehouses+=Warehouse* teams+=Team* tasks+=Task*)
	 */
	protected void sequence_Company(ISerializationContext context, Company semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Employee
	 *     Employee returns Employee
	 *
	 * Constraint:
	 *     (employeeId=ID startDate=STRING endDate=STRING availabilities+=Availability availabilities+=Availability*)
	 */
	protected void sequence_Employee(ISerializationContext context, Employee semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Manager
	 *     Manager returns Manager
	 *
	 * Constraint:
	 *     (employeeId=ID startDate=STRING endDate=STRING manages=[Team|ID])
	 */
	protected void sequence_Manager(ISerializationContext context, Manager semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WarehouseModellingPackage.Literals.ROLE__EMPLOYEE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WarehouseModellingPackage.Literals.ROLE__EMPLOYEE_ID));
			if (transientValues.isValueTransient(semanticObject, WarehouseModellingPackage.Literals.ROLE__START_DATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WarehouseModellingPackage.Literals.ROLE__START_DATE));
			if (transientValues.isValueTransient(semanticObject, WarehouseModellingPackage.Literals.ROLE__END_DATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WarehouseModellingPackage.Literals.ROLE__END_DATE));
			if (transientValues.isValueTransient(semanticObject, WarehouseModellingPackage.Literals.MANAGER__MANAGES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WarehouseModellingPackage.Literals.MANAGER__MANAGES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getManagerAccess().getEmployeeIdIDTerminalRuleCall_1_0(), semanticObject.getEmployeeId());
		feeder.accept(grammarAccess.getManagerAccess().getStartDateSTRINGTerminalRuleCall_2_0(), semanticObject.getStartDate());
		feeder.accept(grammarAccess.getManagerAccess().getEndDateSTRINGTerminalRuleCall_3_0(), semanticObject.getEndDate());
		feeder.accept(grammarAccess.getManagerAccess().getManagesTeamIDTerminalRuleCall_6_0_1(), semanticObject.eGet(WarehouseModellingPackage.Literals.MANAGER__MANAGES, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Person returns Person
	 *
	 * Constraint:
	 *     (name=ID roles+=Role roles+=Role*)
	 */
	protected void sequence_Person(ISerializationContext context, Person semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TaskAssignment returns TaskAssignment
	 *
	 * Constraint:
	 *     (id=ID role=[Role|ID] availability=[Availability|ID] isDone?='Completed'?)
	 */
	protected void sequence_TaskAssignment(ISerializationContext context, TaskAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Task returns Task
	 *
	 * Constraint:
	 *     (id=ID description=STRING assignment=TaskAssignment?)
	 */
	protected void sequence_Task(ISerializationContext context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Team returns Team
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Team(ISerializationContext context, Team semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WarehouseModellingPackage.Literals.TEAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WarehouseModellingPackage.Literals.TEAM__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WarehouseManagement returns WarehouseManagement
	 *
	 * Constraint:
	 *     companies+=Company+
	 */
	protected void sequence_WarehouseManagement(ISerializationContext context, WarehouseManagement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Warehouse returns Warehouse
	 *
	 * Constraint:
	 *     (name=ID workers+=Person*)
	 */
	protected void sequence_Warehouse(ISerializationContext context, Warehouse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

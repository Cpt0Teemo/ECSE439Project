/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class WHGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class WarehouseManagementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.WarehouseManagement");
		private final Assignment cCompaniesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCompaniesCompanyParserRuleCall_0 = (RuleCall)cCompaniesAssignment.eContents().get(0);
		
		//WarehouseManagement:
		//	companies+=Company*;
		@Override public ParserRule getRule() { return rule; }
		
		//companies+=Company*
		public Assignment getCompaniesAssignment() { return cCompaniesAssignment; }
		
		//Company
		public RuleCall getCompaniesCompanyParserRuleCall_0() { return cCompaniesCompanyParserRuleCall_0; }
	}
	public class CompanyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.Company");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCompanyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cAddressAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAddressSTRINGTerminalRuleCall_2_0 = (RuleCall)cAddressAssignment_2.eContents().get(0);
		private final Keyword cWarehousesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cWarehousesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cWarehousesWarehouseParserRuleCall_4_0 = (RuleCall)cWarehousesAssignment_4.eContents().get(0);
		private final Keyword cTeamsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cTeamsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTeamsTeamParserRuleCall_6_0 = (RuleCall)cTeamsAssignment_6.eContents().get(0);
		private final Keyword cTasksKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTasksAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTasksTaskParserRuleCall_8_0 = (RuleCall)cTasksAssignment_8.eContents().get(0);
		
		//Company:
		//	'Company' name=ID address=STRING
		//	'Warehouses:'
		//	warehouses+=Warehouse*
		//	'Teams:'
		//	teams+=Team*
		//	'Tasks:'
		//	tasks+=Task*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Company' name=ID address=STRING 'Warehouses:' warehouses+=Warehouse* 'Teams:' teams+=Team* 'Tasks:' tasks+=Task*
		public Group getGroup() { return cGroup; }
		
		//'Company'
		public Keyword getCompanyKeyword_0() { return cCompanyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//address=STRING
		public Assignment getAddressAssignment_2() { return cAddressAssignment_2; }
		
		//STRING
		public RuleCall getAddressSTRINGTerminalRuleCall_2_0() { return cAddressSTRINGTerminalRuleCall_2_0; }
		
		//'Warehouses:'
		public Keyword getWarehousesKeyword_3() { return cWarehousesKeyword_3; }
		
		//warehouses+=Warehouse*
		public Assignment getWarehousesAssignment_4() { return cWarehousesAssignment_4; }
		
		//Warehouse
		public RuleCall getWarehousesWarehouseParserRuleCall_4_0() { return cWarehousesWarehouseParserRuleCall_4_0; }
		
		//'Teams:'
		public Keyword getTeamsKeyword_5() { return cTeamsKeyword_5; }
		
		//teams+=Team*
		public Assignment getTeamsAssignment_6() { return cTeamsAssignment_6; }
		
		//Team
		public RuleCall getTeamsTeamParserRuleCall_6_0() { return cTeamsTeamParserRuleCall_6_0; }
		
		//'Tasks:'
		public Keyword getTasksKeyword_7() { return cTasksKeyword_7; }
		
		//tasks+=Task*
		public Assignment getTasksAssignment_8() { return cTasksAssignment_8; }
		
		//Task
		public RuleCall getTasksTaskParserRuleCall_8_0() { return cTasksTaskParserRuleCall_8_0; }
	}
	public class WarehouseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.Warehouse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWarehouseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cWorkersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWorkersPersonParserRuleCall_3_0 = (RuleCall)cWorkersAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Warehouse:
		//	'Warehouse' name=ID '{'
		//	workers+=Person*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Warehouse' name=ID '{' workers+=Person* '}'
		public Group getGroup() { return cGroup; }
		
		//'Warehouse'
		public Keyword getWarehouseKeyword_0() { return cWarehouseKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//workers+=Person*
		public Assignment getWorkersAssignment_3() { return cWorkersAssignment_3; }
		
		//Person
		public RuleCall getWorkersPersonParserRuleCall_3_0() { return cWorkersPersonParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class TeamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.Team");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTeamKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Team:
		//	'Team' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'Team' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Team'
		public Keyword getTeamKeyword_0() { return cTeamKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class PersonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.Person");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPersonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cWithKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRolesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRolesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRolesRoleParserRuleCall_5_0 = (RuleCall)cRolesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cRolesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cRolesRoleParserRuleCall_6_1_0 = (RuleCall)cRolesAssignment_6_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Person:
		//	'Person' name=ID 'with' 'roles' '[' roles+=Role (',' roles+=Role)* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'Person' name=ID 'with' 'roles' '[' roles+=Role (',' roles+=Role)* ']'
		public Group getGroup() { return cGroup; }
		
		//'Person'
		public Keyword getPersonKeyword_0() { return cPersonKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'with'
		public Keyword getWithKeyword_2() { return cWithKeyword_2; }
		
		//'roles'
		public Keyword getRolesKeyword_3() { return cRolesKeyword_3; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_4() { return cLeftSquareBracketKeyword_4; }
		
		//roles+=Role
		public Assignment getRolesAssignment_5() { return cRolesAssignment_5; }
		
		//Role
		public RuleCall getRolesRoleParserRuleCall_5_0() { return cRolesRoleParserRuleCall_5_0; }
		
		//(',' roles+=Role)*
		public Group getGroup_6() { return cGroup_6; }
		
		//','
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//roles+=Role
		public Assignment getRolesAssignment_6_1() { return cRolesAssignment_6_1; }
		
		//Role
		public RuleCall getRolesRoleParserRuleCall_6_1_0() { return cRolesRoleParserRuleCall_6_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_7() { return cRightSquareBracketKeyword_7; }
	}
	public class RoleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.Role");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEmployeeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cManagerParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Role:
		//	Employee | Manager;
		@Override public ParserRule getRule() { return rule; }
		
		//Employee | Manager
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Employee
		public RuleCall getEmployeeParserRuleCall_0() { return cEmployeeParserRuleCall_0; }
		
		//Manager
		public RuleCall getManagerParserRuleCall_1() { return cManagerParserRuleCall_1; }
	}
	public class EmployeeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.Employee");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEmployeeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEmployeeIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEmployeeIdIDTerminalRuleCall_1_0 = (RuleCall)cEmployeeIdAssignment_1.eContents().get(0);
		private final Assignment cStartDateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStartDateSTRINGTerminalRuleCall_2_0 = (RuleCall)cStartDateAssignment_2.eContents().get(0);
		private final Assignment cEndDateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEndDateSTRINGTerminalRuleCall_3_0 = (RuleCall)cEndDateAssignment_3.eContents().get(0);
		private final Keyword cAvailableKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cForKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cAvailabilitiesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAvailabilitiesAvailabilityParserRuleCall_6_0 = (RuleCall)cAvailabilitiesAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cAvailabilitiesAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cAvailabilitiesAvailabilityParserRuleCall_7_1_0 = (RuleCall)cAvailabilitiesAssignment_7_1.eContents().get(0);
		
		//Employee:
		//	'Employee' employeeId=ID startDate=STRING endDate=STRING 'available' 'for' availabilities+=Availability (','
		//	availabilities+=Availability)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Employee' employeeId=ID startDate=STRING endDate=STRING 'available' 'for' availabilities+=Availability (','
		//availabilities+=Availability)*
		public Group getGroup() { return cGroup; }
		
		//'Employee'
		public Keyword getEmployeeKeyword_0() { return cEmployeeKeyword_0; }
		
		//employeeId=ID
		public Assignment getEmployeeIdAssignment_1() { return cEmployeeIdAssignment_1; }
		
		//ID
		public RuleCall getEmployeeIdIDTerminalRuleCall_1_0() { return cEmployeeIdIDTerminalRuleCall_1_0; }
		
		//startDate=STRING
		public Assignment getStartDateAssignment_2() { return cStartDateAssignment_2; }
		
		//STRING
		public RuleCall getStartDateSTRINGTerminalRuleCall_2_0() { return cStartDateSTRINGTerminalRuleCall_2_0; }
		
		//endDate=STRING
		public Assignment getEndDateAssignment_3() { return cEndDateAssignment_3; }
		
		//STRING
		public RuleCall getEndDateSTRINGTerminalRuleCall_3_0() { return cEndDateSTRINGTerminalRuleCall_3_0; }
		
		//'available'
		public Keyword getAvailableKeyword_4() { return cAvailableKeyword_4; }
		
		//'for'
		public Keyword getForKeyword_5() { return cForKeyword_5; }
		
		//availabilities+=Availability
		public Assignment getAvailabilitiesAssignment_6() { return cAvailabilitiesAssignment_6; }
		
		//Availability
		public RuleCall getAvailabilitiesAvailabilityParserRuleCall_6_0() { return cAvailabilitiesAvailabilityParserRuleCall_6_0; }
		
		//(',' availabilities+=Availability)*
		public Group getGroup_7() { return cGroup_7; }
		
		//','
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//availabilities+=Availability
		public Assignment getAvailabilitiesAssignment_7_1() { return cAvailabilitiesAssignment_7_1; }
		
		//Availability
		public RuleCall getAvailabilitiesAvailabilityParserRuleCall_7_1_0() { return cAvailabilitiesAvailabilityParserRuleCall_7_1_0; }
	}
	public class ManagerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.Manager");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cManagerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEmployeeIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEmployeeIdIDTerminalRuleCall_1_0 = (RuleCall)cEmployeeIdAssignment_1.eContents().get(0);
		private final Assignment cStartDateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStartDateSTRINGTerminalRuleCall_2_0 = (RuleCall)cStartDateAssignment_2.eContents().get(0);
		private final Assignment cEndDateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEndDateSTRINGTerminalRuleCall_3_0 = (RuleCall)cEndDateAssignment_3.eContents().get(0);
		private final Keyword cOfKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cTeamKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cManagesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cManagesTeamCrossReference_6_0 = (CrossReference)cManagesAssignment_6.eContents().get(0);
		private final RuleCall cManagesTeamIDTerminalRuleCall_6_0_1 = (RuleCall)cManagesTeamCrossReference_6_0.eContents().get(1);
		
		//Manager:
		//	'Manager' employeeId=ID startDate=STRING endDate=STRING 'of' 'team' manages=[Team];
		@Override public ParserRule getRule() { return rule; }
		
		//'Manager' employeeId=ID startDate=STRING endDate=STRING 'of' 'team' manages=[Team]
		public Group getGroup() { return cGroup; }
		
		//'Manager'
		public Keyword getManagerKeyword_0() { return cManagerKeyword_0; }
		
		//employeeId=ID
		public Assignment getEmployeeIdAssignment_1() { return cEmployeeIdAssignment_1; }
		
		//ID
		public RuleCall getEmployeeIdIDTerminalRuleCall_1_0() { return cEmployeeIdIDTerminalRuleCall_1_0; }
		
		//startDate=STRING
		public Assignment getStartDateAssignment_2() { return cStartDateAssignment_2; }
		
		//STRING
		public RuleCall getStartDateSTRINGTerminalRuleCall_2_0() { return cStartDateSTRINGTerminalRuleCall_2_0; }
		
		//endDate=STRING
		public Assignment getEndDateAssignment_3() { return cEndDateAssignment_3; }
		
		//STRING
		public RuleCall getEndDateSTRINGTerminalRuleCall_3_0() { return cEndDateSTRINGTerminalRuleCall_3_0; }
		
		//'of'
		public Keyword getOfKeyword_4() { return cOfKeyword_4; }
		
		//'team'
		public Keyword getTeamKeyword_5() { return cTeamKeyword_5; }
		
		//manages=[Team]
		public Assignment getManagesAssignment_6() { return cManagesAssignment_6; }
		
		//[Team]
		public CrossReference getManagesTeamCrossReference_6_0() { return cManagesTeamCrossReference_6_0; }
		
		//ID
		public RuleCall getManagesTeamIDTerminalRuleCall_6_0_1() { return cManagesTeamIDTerminalRuleCall_6_0_1; }
	}
	public class TaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.Task");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Assignment cDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_2_0 = (RuleCall)cDescriptionAssignment_2.eContents().get(0);
		private final Assignment cAssignmentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAssignmentTaskAssignmentParserRuleCall_3_0 = (RuleCall)cAssignmentAssignment_3.eContents().get(0);
		
		//Task:
		//	'Task' id=ID description=STRING
		//	assignment=TaskAssignment?;
		@Override public ParserRule getRule() { return rule; }
		
		//'Task' id=ID description=STRING assignment=TaskAssignment?
		public Group getGroup() { return cGroup; }
		
		//'Task'
		public Keyword getTaskKeyword_0() { return cTaskKeyword_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_2() { return cDescriptionAssignment_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_2_0() { return cDescriptionSTRINGTerminalRuleCall_2_0; }
		
		//assignment=TaskAssignment?
		public Assignment getAssignmentAssignment_3() { return cAssignmentAssignment_3; }
		
		//TaskAssignment
		public RuleCall getAssignmentTaskAssignmentParserRuleCall_3_0() { return cAssignmentTaskAssignmentParserRuleCall_3_0; }
	}
	public class TaskAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.TaskAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssignmentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRoleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRoleRoleCrossReference_3_0 = (CrossReference)cRoleAssignment_3.eContents().get(0);
		private final RuleCall cRoleRoleIDTerminalRuleCall_3_0_1 = (RuleCall)cRoleRoleCrossReference_3_0.eContents().get(1);
		private final Keyword cDuringKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAvailabilityAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cAvailabilityAvailabilityCrossReference_5_0 = (CrossReference)cAvailabilityAssignment_5.eContents().get(0);
		private final RuleCall cAvailabilityAvailabilityIDTerminalRuleCall_5_0_1 = (RuleCall)cAvailabilityAvailabilityCrossReference_5_0.eContents().get(1);
		private final Assignment cIsDoneAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final Keyword cIsDoneCompletedKeyword_6_0 = (Keyword)cIsDoneAssignment_6.eContents().get(0);
		
		//TaskAssignment:
		//	'Assignment' id=ID 'to' role=[Role] 'during' availability=[Availability] isDone?='Completed'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'Assignment' id=ID 'to' role=[Role] 'during' availability=[Availability] isDone?='Completed'?
		public Group getGroup() { return cGroup; }
		
		//'Assignment'
		public Keyword getAssignmentKeyword_0() { return cAssignmentKeyword_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//role=[Role]
		public Assignment getRoleAssignment_3() { return cRoleAssignment_3; }
		
		//[Role]
		public CrossReference getRoleRoleCrossReference_3_0() { return cRoleRoleCrossReference_3_0; }
		
		//ID
		public RuleCall getRoleRoleIDTerminalRuleCall_3_0_1() { return cRoleRoleIDTerminalRuleCall_3_0_1; }
		
		//'during'
		public Keyword getDuringKeyword_4() { return cDuringKeyword_4; }
		
		//availability=[Availability]
		public Assignment getAvailabilityAssignment_5() { return cAvailabilityAssignment_5; }
		
		//[Availability]
		public CrossReference getAvailabilityAvailabilityCrossReference_5_0() { return cAvailabilityAvailabilityCrossReference_5_0; }
		
		//ID
		public RuleCall getAvailabilityAvailabilityIDTerminalRuleCall_5_0_1() { return cAvailabilityAvailabilityIDTerminalRuleCall_5_0_1; }
		
		//isDone?='Completed'?
		public Assignment getIsDoneAssignment_6() { return cIsDoneAssignment_6; }
		
		//'Completed'
		public Keyword getIsDoneCompletedKeyword_6_0() { return cIsDoneCompletedKeyword_6_0; }
	}
	public class AvailabilityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.wh.WH.Availability");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAvailabilityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStartTimeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStartTimeSTRINGTerminalRuleCall_3_0 = (RuleCall)cStartTimeAssignment_3.eContents().get(0);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cEndTimeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEndTimeSTRINGTerminalRuleCall_5_0 = (RuleCall)cEndTimeAssignment_5.eContents().get(0);
		
		//Availability:
		//	'Availability' id=ID 'from' startTime=STRING 'to' endTime=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'Availability' id=ID 'from' startTime=STRING 'to' endTime=STRING
		public Group getGroup() { return cGroup; }
		
		//'Availability'
		public Keyword getAvailabilityKeyword_0() { return cAvailabilityKeyword_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//startTime=STRING
		public Assignment getStartTimeAssignment_3() { return cStartTimeAssignment_3; }
		
		//STRING
		public RuleCall getStartTimeSTRINGTerminalRuleCall_3_0() { return cStartTimeSTRINGTerminalRuleCall_3_0; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//endTime=STRING
		public Assignment getEndTimeAssignment_5() { return cEndTimeAssignment_5; }
		
		//STRING
		public RuleCall getEndTimeSTRINGTerminalRuleCall_5_0() { return cEndTimeSTRINGTerminalRuleCall_5_0; }
	}
	
	
	private final WarehouseManagementElements pWarehouseManagement;
	private final CompanyElements pCompany;
	private final WarehouseElements pWarehouse;
	private final TeamElements pTeam;
	private final PersonElements pPerson;
	private final RoleElements pRole;
	private final EmployeeElements pEmployee;
	private final ManagerElements pManager;
	private final TaskElements pTask;
	private final TaskAssignmentElements pTaskAssignment;
	private final AvailabilityElements pAvailability;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public WHGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pWarehouseManagement = new WarehouseManagementElements();
		this.pCompany = new CompanyElements();
		this.pWarehouse = new WarehouseElements();
		this.pTeam = new TeamElements();
		this.pPerson = new PersonElements();
		this.pRole = new RoleElements();
		this.pEmployee = new EmployeeElements();
		this.pManager = new ManagerElements();
		this.pTask = new TaskElements();
		this.pTaskAssignment = new TaskAssignmentElements();
		this.pAvailability = new AvailabilityElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.wh.WH".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//WarehouseManagement:
	//	companies+=Company*;
	public WarehouseManagementElements getWarehouseManagementAccess() {
		return pWarehouseManagement;
	}
	
	public ParserRule getWarehouseManagementRule() {
		return getWarehouseManagementAccess().getRule();
	}
	
	//Company:
	//	'Company' name=ID address=STRING
	//	'Warehouses:'
	//	warehouses+=Warehouse*
	//	'Teams:'
	//	teams+=Team*
	//	'Tasks:'
	//	tasks+=Task*;
	public CompanyElements getCompanyAccess() {
		return pCompany;
	}
	
	public ParserRule getCompanyRule() {
		return getCompanyAccess().getRule();
	}
	
	//Warehouse:
	//	'Warehouse' name=ID '{'
	//	workers+=Person*
	//	'}';
	public WarehouseElements getWarehouseAccess() {
		return pWarehouse;
	}
	
	public ParserRule getWarehouseRule() {
		return getWarehouseAccess().getRule();
	}
	
	//Team:
	//	'Team' name=ID;
	public TeamElements getTeamAccess() {
		return pTeam;
	}
	
	public ParserRule getTeamRule() {
		return getTeamAccess().getRule();
	}
	
	//Person:
	//	'Person' name=ID 'with' 'roles' '[' roles+=Role (',' roles+=Role)* ']';
	public PersonElements getPersonAccess() {
		return pPerson;
	}
	
	public ParserRule getPersonRule() {
		return getPersonAccess().getRule();
	}
	
	//Role:
	//	Employee | Manager;
	public RoleElements getRoleAccess() {
		return pRole;
	}
	
	public ParserRule getRoleRule() {
		return getRoleAccess().getRule();
	}
	
	//Employee:
	//	'Employee' employeeId=ID startDate=STRING endDate=STRING 'available' 'for' availabilities+=Availability (','
	//	availabilities+=Availability)*;
	public EmployeeElements getEmployeeAccess() {
		return pEmployee;
	}
	
	public ParserRule getEmployeeRule() {
		return getEmployeeAccess().getRule();
	}
	
	//Manager:
	//	'Manager' employeeId=ID startDate=STRING endDate=STRING 'of' 'team' manages=[Team];
	public ManagerElements getManagerAccess() {
		return pManager;
	}
	
	public ParserRule getManagerRule() {
		return getManagerAccess().getRule();
	}
	
	//Task:
	//	'Task' id=ID description=STRING
	//	assignment=TaskAssignment?;
	public TaskElements getTaskAccess() {
		return pTask;
	}
	
	public ParserRule getTaskRule() {
		return getTaskAccess().getRule();
	}
	
	//TaskAssignment:
	//	'Assignment' id=ID 'to' role=[Role] 'during' availability=[Availability] isDone?='Completed'?;
	public TaskAssignmentElements getTaskAssignmentAccess() {
		return pTaskAssignment;
	}
	
	public ParserRule getTaskAssignmentRule() {
		return getTaskAssignmentAccess().getRule();
	}
	
	//Availability:
	//	'Availability' id=ID 'from' startTime=STRING 'to' endTime=STRING;
	public AvailabilityElements getAvailabilityAccess() {
		return pAvailability;
	}
	
	public ParserRule getAvailabilityRule() {
		return getAvailabilityAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

/*
 * generated by Xtext 2.25.0
 */
grammar InternalWarehouseModelling;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.warehouse.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.warehouse.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.warehouse.services.WarehouseModellingGrammarAccess;

}

@parser::members {

 	private WarehouseModellingGrammarAccess grammarAccess;

    public InternalWarehouseModellingParser(TokenStream input, WarehouseModellingGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "WarehouseManagement";
   	}

   	@Override
   	protected WarehouseModellingGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleWarehouseManagement
entryRuleWarehouseManagement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWarehouseManagementRule()); }
	iv_ruleWarehouseManagement=ruleWarehouseManagement
	{ $current=$iv_ruleWarehouseManagement.current; }
	EOF;

// Rule WarehouseManagement
ruleWarehouseManagement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getWarehouseManagementAccess().getCompaniesCompanyParserRuleCall_0());
			}
			lv_companies_0_0=ruleCompany
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getWarehouseManagementRule());
				}
				add(
					$current,
					"companies",
					lv_companies_0_0,
					"org.xtext.example.warehouse.WarehouseModelling.Company");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleCompany
entryRuleCompany returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompanyRule()); }
	iv_ruleCompany=ruleCompany
	{ $current=$iv_ruleCompany.current; }
	EOF;

// Rule Company
ruleCompany returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Company'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getCompanyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompanyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_address_2_0=RULE_ID
				{
					newLeafNode(lv_address_2_0, grammarAccess.getCompanyAccess().getAddressIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompanyRule());
					}
					setWithLastConsumed(
						$current,
						"address",
						lv_address_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='Warehouses:'
		{
			newLeafNode(otherlv_3, grammarAccess.getCompanyAccess().getWarehousesKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompanyAccess().getWarehousesWarehouseParserRuleCall_4_0());
				}
				lv_warehouses_4_0=ruleWarehouse
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompanyRule());
					}
					add(
						$current,
						"warehouses",
						lv_warehouses_4_0,
						"org.xtext.example.warehouse.WarehouseModelling.Warehouse");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='Teams:'
		{
			newLeafNode(otherlv_5, grammarAccess.getCompanyAccess().getTeamsKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompanyAccess().getTeamsTeamParserRuleCall_6_0());
				}
				lv_teams_6_0=ruleTeam
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompanyRule());
					}
					add(
						$current,
						"teams",
						lv_teams_6_0,
						"org.xtext.example.warehouse.WarehouseModelling.Team");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='Tasks:'
		{
			newLeafNode(otherlv_7, grammarAccess.getCompanyAccess().getTasksKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompanyAccess().getTasksTaskParserRuleCall_8_0());
				}
				lv_tasks_8_0=ruleTask
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompanyRule());
					}
					add(
						$current,
						"tasks",
						lv_tasks_8_0,
						"org.xtext.example.warehouse.WarehouseModelling.Task");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleWarehouse
entryRuleWarehouse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWarehouseRule()); }
	iv_ruleWarehouse=ruleWarehouse
	{ $current=$iv_ruleWarehouse.current; }
	EOF;

// Rule Warehouse
ruleWarehouse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Warehouse'
		{
			newLeafNode(otherlv_0, grammarAccess.getWarehouseAccess().getWarehouseKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWarehouseRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWarehouseAccess().getWorkersPersonParserRuleCall_3_0());
				}
				lv_workers_3_0=rulePerson
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWarehouseRule());
					}
					add(
						$current,
						"workers",
						lv_workers_3_0,
						"org.xtext.example.warehouse.WarehouseModelling.Person");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleTeam
entryRuleTeam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTeamRule()); }
	iv_ruleTeam=ruleTeam
	{ $current=$iv_ruleTeam.current; }
	EOF;

// Rule Team
ruleTeam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Team'
		{
			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTeamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRulePerson
entryRulePerson returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPersonRule()); }
	iv_rulePerson=rulePerson
	{ $current=$iv_rulePerson.current; }
	EOF;

// Rule Person
rulePerson returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Person'
		{
			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPersonRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='with'
		{
			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getWithKeyword_2());
		}
		otherlv_3='roles'
		{
			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getRolesKeyword_3());
		}
		otherlv_4='['
		{
			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getLeftSquareBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonAccess().getRolesRoleParserRuleCall_5_0());
				}
				lv_roles_5_0=ruleRole
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonRule());
					}
					add(
						$current,
						"roles",
						lv_roles_5_0,
						"org.xtext.example.warehouse.WarehouseModelling.Role");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPersonAccess().getRolesRoleParserRuleCall_6_1_0());
					}
					lv_roles_7_0=ruleRole
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPersonRule());
						}
						add(
							$current,
							"roles",
							lv_roles_7_0,
							"org.xtext.example.warehouse.WarehouseModelling.Role");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8=']'
		{
			newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getRightSquareBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleRole
entryRuleRole returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoleRule()); }
	iv_ruleRole=ruleRole
	{ $current=$iv_ruleRole.current; }
	EOF;

// Rule Role
ruleRole returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRoleAccess().getEmployeeParserRuleCall_0());
		}
		this_Employee_0=ruleEmployee
		{
			$current = $this_Employee_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRoleAccess().getManagerParserRuleCall_1());
		}
		this_Manager_1=ruleManager
		{
			$current = $this_Manager_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEmployee
entryRuleEmployee returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEmployeeRule()); }
	iv_ruleEmployee=ruleEmployee
	{ $current=$iv_ruleEmployee.current; }
	EOF;

// Rule Employee
ruleEmployee returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Employee'
		{
			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getEmployeeAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEmployeeRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_startDate_2_0=RULE_STRING
				{
					newLeafNode(lv_startDate_2_0, grammarAccess.getEmployeeAccess().getStartDateSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEmployeeRule());
					}
					setWithLastConsumed(
						$current,
						"startDate",
						lv_startDate_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_endDate_3_0=RULE_STRING
				{
					newLeafNode(lv_endDate_3_0, grammarAccess.getEmployeeAccess().getEndDateSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEmployeeRule());
					}
					setWithLastConsumed(
						$current,
						"endDate",
						lv_endDate_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4='available'
		{
			newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getAvailableKeyword_4());
		}
		otherlv_5='for'
		{
			newLeafNode(otherlv_5, grammarAccess.getEmployeeAccess().getForKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEmployeeAccess().getAvailabilitiesAvailabilityParserRuleCall_6_0());
				}
				lv_availabilities_6_0=ruleAvailability
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEmployeeRule());
					}
					add(
						$current,
						"availabilities",
						lv_availabilities_6_0,
						"org.xtext.example.warehouse.WarehouseModelling.Availability");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getEmployeeAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEmployeeAccess().getAvailabilitiesAvailabilityParserRuleCall_7_1_0());
					}
					lv_availabilities_8_0=ruleAvailability
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEmployeeRule());
						}
						add(
							$current,
							"availabilities",
							lv_availabilities_8_0,
							"org.xtext.example.warehouse.WarehouseModelling.Availability");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleManager
entryRuleManager returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getManagerRule()); }
	iv_ruleManager=ruleManager
	{ $current=$iv_ruleManager.current; }
	EOF;

// Rule Manager
ruleManager returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Manager'
		{
			newLeafNode(otherlv_0, grammarAccess.getManagerAccess().getManagerKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getManagerAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getManagerRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_startDate_2_0=RULE_STRING
				{
					newLeafNode(lv_startDate_2_0, grammarAccess.getManagerAccess().getStartDateSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getManagerRule());
					}
					setWithLastConsumed(
						$current,
						"startDate",
						lv_startDate_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_endDate_3_0=RULE_STRING
				{
					newLeafNode(lv_endDate_3_0, grammarAccess.getManagerAccess().getEndDateSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getManagerRule());
					}
					setWithLastConsumed(
						$current,
						"endDate",
						lv_endDate_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4='of'
		{
			newLeafNode(otherlv_4, grammarAccess.getManagerAccess().getOfKeyword_4());
		}
		otherlv_5='team'
		{
			newLeafNode(otherlv_5, grammarAccess.getManagerAccess().getTeamKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getManagerRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getManagerAccess().getManagesTeamCrossReference_6_0());
				}
			)
		)
	)
;

// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	iv_ruleTask=ruleTask
	{ $current=$iv_ruleTask.current; }
	EOF;

// Rule Task
ruleTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Task'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
		}
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getTaskAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_description_2_0=RULE_STRING
				{
					newLeafNode(lv_description_2_0, grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getAssignmentTaskAssignmentParserRuleCall_3_0());
				}
				lv_assignment_3_0=ruleTaskAssignment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					set(
						$current,
						"assignment",
						lv_assignment_3_0 != null,
						"org.xtext.example.warehouse.WarehouseModelling.TaskAssignment");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTaskAssignment
entryRuleTaskAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskAssignmentRule()); }
	iv_ruleTaskAssignment=ruleTaskAssignment
	{ $current=$iv_ruleTaskAssignment.current; }
	EOF;

// Rule TaskAssignment
ruleTaskAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TaskAssignment'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskAssignmentAccess().getTaskAssignmentKeyword_0());
		}
		otherlv_1='by'
		{
			newLeafNode(otherlv_1, grammarAccess.getTaskAssignmentAccess().getByKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskAssignmentRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTaskAssignmentAccess().getRoleRoleCrossReference_2_0());
				}
			)
		)
		otherlv_3='during'
		{
			newLeafNode(otherlv_3, grammarAccess.getTaskAssignmentAccess().getDuringKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskAssignmentRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getTaskAssignmentAccess().getAvailabilityAvailabilityCrossReference_4_0());
				}
			)
		)
		(
			(
				lv_isDone_5_0='Completed'
				{
					newLeafNode(lv_isDone_5_0, grammarAccess.getTaskAssignmentAccess().getIsDoneCompletedKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskAssignmentRule());
					}
					setWithLastConsumed($current, "isDone", lv_isDone_5_0 != null, "Completed");
				}
			)
		)
	)
;

// Entry rule entryRuleAvailability
entryRuleAvailability returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAvailabilityRule()); }
	iv_ruleAvailability=ruleAvailability
	{ $current=$iv_ruleAvailability.current; }
	EOF;

// Rule Availability
ruleAvailability returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Availability'
		{
			newLeafNode(otherlv_0, grammarAccess.getAvailabilityAccess().getAvailabilityKeyword_0());
		}
		otherlv_1='from'
		{
			newLeafNode(otherlv_1, grammarAccess.getAvailabilityAccess().getFromKeyword_1());
		}
		(
			(
				lv_startTime_2_0=RULE_ID
				{
					newLeafNode(lv_startTime_2_0, grammarAccess.getAvailabilityAccess().getStartTimeIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAvailabilityRule());
					}
					setWithLastConsumed(
						$current,
						"startTime",
						lv_startTime_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='to'
		{
			newLeafNode(otherlv_3, grammarAccess.getAvailabilityAccess().getToKeyword_3());
		}
		(
			(
				lv_endTime_4_0=RULE_ID
				{
					newLeafNode(lv_endTime_4_0, grammarAccess.getAvailabilityAccess().getEndTimeIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAvailabilityRule());
					}
					setWithLastConsumed(
						$current,
						"endTime",
						lv_endTime_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

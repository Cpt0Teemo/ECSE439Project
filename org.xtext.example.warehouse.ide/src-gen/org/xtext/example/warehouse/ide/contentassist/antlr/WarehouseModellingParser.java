/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.warehouse.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.warehouse.ide.contentassist.antlr.internal.InternalWarehouseModellingParser;
import org.xtext.example.warehouse.services.WarehouseModellingGrammarAccess;

public class WarehouseModellingParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(WarehouseModellingGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, WarehouseModellingGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getRoleAccess().getAlternatives(), "rule__Role__Alternatives");
			builder.put(grammarAccess.getCompanyAccess().getGroup(), "rule__Company__Group__0");
			builder.put(grammarAccess.getWarehouseAccess().getGroup(), "rule__Warehouse__Group__0");
			builder.put(grammarAccess.getTeamAccess().getGroup(), "rule__Team__Group__0");
			builder.put(grammarAccess.getPersonAccess().getGroup(), "rule__Person__Group__0");
			builder.put(grammarAccess.getEmployeeAccess().getGroup(), "rule__Employee__Group__0");
			builder.put(grammarAccess.getManagerAccess().getGroup(), "rule__Manager__Group__0");
			builder.put(grammarAccess.getWarehouseManagementAccess().getCompaniesAssignment(), "rule__WarehouseManagement__CompaniesAssignment");
			builder.put(grammarAccess.getCompanyAccess().getNameAssignment_1(), "rule__Company__NameAssignment_1");
			builder.put(grammarAccess.getCompanyAccess().getAddressAssignment_2(), "rule__Company__AddressAssignment_2");
			builder.put(grammarAccess.getCompanyAccess().getWarehousesAssignment_4(), "rule__Company__WarehousesAssignment_4");
			builder.put(grammarAccess.getCompanyAccess().getTeamsAssignment_6(), "rule__Company__TeamsAssignment_6");
			builder.put(grammarAccess.getWarehouseAccess().getNameAssignment_1(), "rule__Warehouse__NameAssignment_1");
			builder.put(grammarAccess.getWarehouseAccess().getWorkersAssignment_3(), "rule__Warehouse__WorkersAssignment_3");
			builder.put(grammarAccess.getTeamAccess().getIdAssignment_1(), "rule__Team__IdAssignment_1");
			builder.put(grammarAccess.getPersonAccess().getNameAssignment_1(), "rule__Person__NameAssignment_1");
			builder.put(grammarAccess.getEmployeeAccess().getStartDateAssignment_1(), "rule__Employee__StartDateAssignment_1");
			builder.put(grammarAccess.getEmployeeAccess().getEndDateAssignment_2(), "rule__Employee__EndDateAssignment_2");
			builder.put(grammarAccess.getManagerAccess().getStartDateAssignment_1(), "rule__Manager__StartDateAssignment_1");
			builder.put(grammarAccess.getManagerAccess().getEndDateAssignment_2(), "rule__Manager__EndDateAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private WarehouseModellingGrammarAccess grammarAccess;

	@Override
	protected InternalWarehouseModellingParser createParser() {
		InternalWarehouseModellingParser result = new InternalWarehouseModellingParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WarehouseModellingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WarehouseModellingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
package org.xtext.example.warehouse.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.warehouse.services.WarehouseModellingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWarehouseModellingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Company'", "'Warehouses:'", "'Teams:'", "'Tasks:'", "'Warehouse'", "'{'", "'}'", "'Team'", "'Person'", "'with'", "'roles'", "'['", "']'", "','", "'Employee'", "'available'", "'for'", "'Manager'", "'of'", "'team'", "'Task'", "'TaskAssignment'", "'by'", "'during'", "'Availability'", "'from'", "'to'", "'Completed'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWarehouseModellingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWarehouseModellingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWarehouseModellingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWarehouseModelling.g"; }


    	private WarehouseModellingGrammarAccess grammarAccess;

    	public void setGrammarAccess(WarehouseModellingGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleWarehouseManagement"
    // InternalWarehouseModelling.g:53:1: entryRuleWarehouseManagement : ruleWarehouseManagement EOF ;
    public final void entryRuleWarehouseManagement() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:54:1: ( ruleWarehouseManagement EOF )
            // InternalWarehouseModelling.g:55:1: ruleWarehouseManagement EOF
            {
             before(grammarAccess.getWarehouseManagementRule()); 
            pushFollow(FOLLOW_1);
            ruleWarehouseManagement();

            state._fsp--;

             after(grammarAccess.getWarehouseManagementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWarehouseManagement"


    // $ANTLR start "ruleWarehouseManagement"
    // InternalWarehouseModelling.g:62:1: ruleWarehouseManagement : ( ( rule__WarehouseManagement__CompaniesAssignment )* ) ;
    public final void ruleWarehouseManagement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:66:2: ( ( ( rule__WarehouseManagement__CompaniesAssignment )* ) )
            // InternalWarehouseModelling.g:67:2: ( ( rule__WarehouseManagement__CompaniesAssignment )* )
            {
            // InternalWarehouseModelling.g:67:2: ( ( rule__WarehouseManagement__CompaniesAssignment )* )
            // InternalWarehouseModelling.g:68:3: ( rule__WarehouseManagement__CompaniesAssignment )*
            {
             before(grammarAccess.getWarehouseManagementAccess().getCompaniesAssignment()); 
            // InternalWarehouseModelling.g:69:3: ( rule__WarehouseManagement__CompaniesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWarehouseModelling.g:69:4: rule__WarehouseManagement__CompaniesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__WarehouseManagement__CompaniesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getWarehouseManagementAccess().getCompaniesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWarehouseManagement"


    // $ANTLR start "entryRuleCompany"
    // InternalWarehouseModelling.g:78:1: entryRuleCompany : ruleCompany EOF ;
    public final void entryRuleCompany() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:79:1: ( ruleCompany EOF )
            // InternalWarehouseModelling.g:80:1: ruleCompany EOF
            {
             before(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            ruleCompany();

            state._fsp--;

             after(grammarAccess.getCompanyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalWarehouseModelling.g:87:1: ruleCompany : ( ( rule__Company__Group__0 ) ) ;
    public final void ruleCompany() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:91:2: ( ( ( rule__Company__Group__0 ) ) )
            // InternalWarehouseModelling.g:92:2: ( ( rule__Company__Group__0 ) )
            {
            // InternalWarehouseModelling.g:92:2: ( ( rule__Company__Group__0 ) )
            // InternalWarehouseModelling.g:93:3: ( rule__Company__Group__0 )
            {
             before(grammarAccess.getCompanyAccess().getGroup()); 
            // InternalWarehouseModelling.g:94:3: ( rule__Company__Group__0 )
            // InternalWarehouseModelling.g:94:4: rule__Company__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleWarehouse"
    // InternalWarehouseModelling.g:103:1: entryRuleWarehouse : ruleWarehouse EOF ;
    public final void entryRuleWarehouse() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:104:1: ( ruleWarehouse EOF )
            // InternalWarehouseModelling.g:105:1: ruleWarehouse EOF
            {
             before(grammarAccess.getWarehouseRule()); 
            pushFollow(FOLLOW_1);
            ruleWarehouse();

            state._fsp--;

             after(grammarAccess.getWarehouseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWarehouse"


    // $ANTLR start "ruleWarehouse"
    // InternalWarehouseModelling.g:112:1: ruleWarehouse : ( ( rule__Warehouse__Group__0 ) ) ;
    public final void ruleWarehouse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:116:2: ( ( ( rule__Warehouse__Group__0 ) ) )
            // InternalWarehouseModelling.g:117:2: ( ( rule__Warehouse__Group__0 ) )
            {
            // InternalWarehouseModelling.g:117:2: ( ( rule__Warehouse__Group__0 ) )
            // InternalWarehouseModelling.g:118:3: ( rule__Warehouse__Group__0 )
            {
             before(grammarAccess.getWarehouseAccess().getGroup()); 
            // InternalWarehouseModelling.g:119:3: ( rule__Warehouse__Group__0 )
            // InternalWarehouseModelling.g:119:4: rule__Warehouse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWarehouse"


    // $ANTLR start "entryRuleTeam"
    // InternalWarehouseModelling.g:128:1: entryRuleTeam : ruleTeam EOF ;
    public final void entryRuleTeam() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:129:1: ( ruleTeam EOF )
            // InternalWarehouseModelling.g:130:1: ruleTeam EOF
            {
             before(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalWarehouseModelling.g:137:1: ruleTeam : ( ( rule__Team__Group__0 ) ) ;
    public final void ruleTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:141:2: ( ( ( rule__Team__Group__0 ) ) )
            // InternalWarehouseModelling.g:142:2: ( ( rule__Team__Group__0 ) )
            {
            // InternalWarehouseModelling.g:142:2: ( ( rule__Team__Group__0 ) )
            // InternalWarehouseModelling.g:143:3: ( rule__Team__Group__0 )
            {
             before(grammarAccess.getTeamAccess().getGroup()); 
            // InternalWarehouseModelling.g:144:3: ( rule__Team__Group__0 )
            // InternalWarehouseModelling.g:144:4: rule__Team__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRulePerson"
    // InternalWarehouseModelling.g:153:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:154:1: ( rulePerson EOF )
            // InternalWarehouseModelling.g:155:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalWarehouseModelling.g:162:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:166:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalWarehouseModelling.g:167:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalWarehouseModelling.g:167:2: ( ( rule__Person__Group__0 ) )
            // InternalWarehouseModelling.g:168:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalWarehouseModelling.g:169:3: ( rule__Person__Group__0 )
            // InternalWarehouseModelling.g:169:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleRole"
    // InternalWarehouseModelling.g:178:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:179:1: ( ruleRole EOF )
            // InternalWarehouseModelling.g:180:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalWarehouseModelling.g:187:1: ruleRole : ( ( rule__Role__Alternatives ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:191:2: ( ( ( rule__Role__Alternatives ) ) )
            // InternalWarehouseModelling.g:192:2: ( ( rule__Role__Alternatives ) )
            {
            // InternalWarehouseModelling.g:192:2: ( ( rule__Role__Alternatives ) )
            // InternalWarehouseModelling.g:193:3: ( rule__Role__Alternatives )
            {
             before(grammarAccess.getRoleAccess().getAlternatives()); 
            // InternalWarehouseModelling.g:194:3: ( rule__Role__Alternatives )
            // InternalWarehouseModelling.g:194:4: rule__Role__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Role__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleEmployee"
    // InternalWarehouseModelling.g:203:1: entryRuleEmployee : ruleEmployee EOF ;
    public final void entryRuleEmployee() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:204:1: ( ruleEmployee EOF )
            // InternalWarehouseModelling.g:205:1: ruleEmployee EOF
            {
             before(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getEmployeeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalWarehouseModelling.g:212:1: ruleEmployee : ( ( rule__Employee__Group__0 ) ) ;
    public final void ruleEmployee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:216:2: ( ( ( rule__Employee__Group__0 ) ) )
            // InternalWarehouseModelling.g:217:2: ( ( rule__Employee__Group__0 ) )
            {
            // InternalWarehouseModelling.g:217:2: ( ( rule__Employee__Group__0 ) )
            // InternalWarehouseModelling.g:218:3: ( rule__Employee__Group__0 )
            {
             before(grammarAccess.getEmployeeAccess().getGroup()); 
            // InternalWarehouseModelling.g:219:3: ( rule__Employee__Group__0 )
            // InternalWarehouseModelling.g:219:4: rule__Employee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleManager"
    // InternalWarehouseModelling.g:228:1: entryRuleManager : ruleManager EOF ;
    public final void entryRuleManager() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:229:1: ( ruleManager EOF )
            // InternalWarehouseModelling.g:230:1: ruleManager EOF
            {
             before(grammarAccess.getManagerRule()); 
            pushFollow(FOLLOW_1);
            ruleManager();

            state._fsp--;

             after(grammarAccess.getManagerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManager"


    // $ANTLR start "ruleManager"
    // InternalWarehouseModelling.g:237:1: ruleManager : ( ( rule__Manager__Group__0 ) ) ;
    public final void ruleManager() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:241:2: ( ( ( rule__Manager__Group__0 ) ) )
            // InternalWarehouseModelling.g:242:2: ( ( rule__Manager__Group__0 ) )
            {
            // InternalWarehouseModelling.g:242:2: ( ( rule__Manager__Group__0 ) )
            // InternalWarehouseModelling.g:243:3: ( rule__Manager__Group__0 )
            {
             before(grammarAccess.getManagerAccess().getGroup()); 
            // InternalWarehouseModelling.g:244:3: ( rule__Manager__Group__0 )
            // InternalWarehouseModelling.g:244:4: rule__Manager__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Manager__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManagerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManager"


    // $ANTLR start "entryRuleTask"
    // InternalWarehouseModelling.g:253:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:254:1: ( ruleTask EOF )
            // InternalWarehouseModelling.g:255:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalWarehouseModelling.g:262:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:266:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalWarehouseModelling.g:267:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalWarehouseModelling.g:267:2: ( ( rule__Task__Group__0 ) )
            // InternalWarehouseModelling.g:268:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalWarehouseModelling.g:269:3: ( rule__Task__Group__0 )
            // InternalWarehouseModelling.g:269:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleTaskAssignment"
    // InternalWarehouseModelling.g:278:1: entryRuleTaskAssignment : ruleTaskAssignment EOF ;
    public final void entryRuleTaskAssignment() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:279:1: ( ruleTaskAssignment EOF )
            // InternalWarehouseModelling.g:280:1: ruleTaskAssignment EOF
            {
             before(grammarAccess.getTaskAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskAssignment();

            state._fsp--;

             after(grammarAccess.getTaskAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskAssignment"


    // $ANTLR start "ruleTaskAssignment"
    // InternalWarehouseModelling.g:287:1: ruleTaskAssignment : ( ( rule__TaskAssignment__Group__0 ) ) ;
    public final void ruleTaskAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:291:2: ( ( ( rule__TaskAssignment__Group__0 ) ) )
            // InternalWarehouseModelling.g:292:2: ( ( rule__TaskAssignment__Group__0 ) )
            {
            // InternalWarehouseModelling.g:292:2: ( ( rule__TaskAssignment__Group__0 ) )
            // InternalWarehouseModelling.g:293:3: ( rule__TaskAssignment__Group__0 )
            {
             before(grammarAccess.getTaskAssignmentAccess().getGroup()); 
            // InternalWarehouseModelling.g:294:3: ( rule__TaskAssignment__Group__0 )
            // InternalWarehouseModelling.g:294:4: rule__TaskAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskAssignment"


    // $ANTLR start "entryRuleAvailability"
    // InternalWarehouseModelling.g:303:1: entryRuleAvailability : ruleAvailability EOF ;
    public final void entryRuleAvailability() throws RecognitionException {
        try {
            // InternalWarehouseModelling.g:304:1: ( ruleAvailability EOF )
            // InternalWarehouseModelling.g:305:1: ruleAvailability EOF
            {
             before(grammarAccess.getAvailabilityRule()); 
            pushFollow(FOLLOW_1);
            ruleAvailability();

            state._fsp--;

             after(grammarAccess.getAvailabilityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAvailability"


    // $ANTLR start "ruleAvailability"
    // InternalWarehouseModelling.g:312:1: ruleAvailability : ( ( rule__Availability__Group__0 ) ) ;
    public final void ruleAvailability() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:316:2: ( ( ( rule__Availability__Group__0 ) ) )
            // InternalWarehouseModelling.g:317:2: ( ( rule__Availability__Group__0 ) )
            {
            // InternalWarehouseModelling.g:317:2: ( ( rule__Availability__Group__0 ) )
            // InternalWarehouseModelling.g:318:3: ( rule__Availability__Group__0 )
            {
             before(grammarAccess.getAvailabilityAccess().getGroup()); 
            // InternalWarehouseModelling.g:319:3: ( rule__Availability__Group__0 )
            // InternalWarehouseModelling.g:319:4: rule__Availability__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Availability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAvailabilityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAvailability"


    // $ANTLR start "rule__Role__Alternatives"
    // InternalWarehouseModelling.g:327:1: rule__Role__Alternatives : ( ( ruleEmployee ) | ( ruleManager ) );
    public final void rule__Role__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:331:1: ( ( ruleEmployee ) | ( ruleManager ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWarehouseModelling.g:332:2: ( ruleEmployee )
                    {
                    // InternalWarehouseModelling.g:332:2: ( ruleEmployee )
                    // InternalWarehouseModelling.g:333:3: ruleEmployee
                    {
                     before(grammarAccess.getRoleAccess().getEmployeeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEmployee();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getEmployeeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWarehouseModelling.g:338:2: ( ruleManager )
                    {
                    // InternalWarehouseModelling.g:338:2: ( ruleManager )
                    // InternalWarehouseModelling.g:339:3: ruleManager
                    {
                     before(grammarAccess.getRoleAccess().getManagerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleManager();

                    state._fsp--;

                     after(grammarAccess.getRoleAccess().getManagerParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Alternatives"


    // $ANTLR start "rule__Company__Group__0"
    // InternalWarehouseModelling.g:348:1: rule__Company__Group__0 : rule__Company__Group__0__Impl rule__Company__Group__1 ;
    public final void rule__Company__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:352:1: ( rule__Company__Group__0__Impl rule__Company__Group__1 )
            // InternalWarehouseModelling.g:353:2: rule__Company__Group__0__Impl rule__Company__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Company__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0"


    // $ANTLR start "rule__Company__Group__0__Impl"
    // InternalWarehouseModelling.g:360:1: rule__Company__Group__0__Impl : ( 'Company' ) ;
    public final void rule__Company__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:364:1: ( ( 'Company' ) )
            // InternalWarehouseModelling.g:365:1: ( 'Company' )
            {
            // InternalWarehouseModelling.g:365:1: ( 'Company' )
            // InternalWarehouseModelling.g:366:2: 'Company'
            {
             before(grammarAccess.getCompanyAccess().getCompanyKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCompanyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0__Impl"


    // $ANTLR start "rule__Company__Group__1"
    // InternalWarehouseModelling.g:375:1: rule__Company__Group__1 : rule__Company__Group__1__Impl rule__Company__Group__2 ;
    public final void rule__Company__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:379:1: ( rule__Company__Group__1__Impl rule__Company__Group__2 )
            // InternalWarehouseModelling.g:380:2: rule__Company__Group__1__Impl rule__Company__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Company__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1"


    // $ANTLR start "rule__Company__Group__1__Impl"
    // InternalWarehouseModelling.g:387:1: rule__Company__Group__1__Impl : ( ( rule__Company__NameAssignment_1 ) ) ;
    public final void rule__Company__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:391:1: ( ( ( rule__Company__NameAssignment_1 ) ) )
            // InternalWarehouseModelling.g:392:1: ( ( rule__Company__NameAssignment_1 ) )
            {
            // InternalWarehouseModelling.g:392:1: ( ( rule__Company__NameAssignment_1 ) )
            // InternalWarehouseModelling.g:393:2: ( rule__Company__NameAssignment_1 )
            {
             before(grammarAccess.getCompanyAccess().getNameAssignment_1()); 
            // InternalWarehouseModelling.g:394:2: ( rule__Company__NameAssignment_1 )
            // InternalWarehouseModelling.g:394:3: rule__Company__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1__Impl"


    // $ANTLR start "rule__Company__Group__2"
    // InternalWarehouseModelling.g:402:1: rule__Company__Group__2 : rule__Company__Group__2__Impl rule__Company__Group__3 ;
    public final void rule__Company__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:406:1: ( rule__Company__Group__2__Impl rule__Company__Group__3 )
            // InternalWarehouseModelling.g:407:2: rule__Company__Group__2__Impl rule__Company__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Company__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2"


    // $ANTLR start "rule__Company__Group__2__Impl"
    // InternalWarehouseModelling.g:414:1: rule__Company__Group__2__Impl : ( ( rule__Company__AddressAssignment_2 ) ) ;
    public final void rule__Company__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:418:1: ( ( ( rule__Company__AddressAssignment_2 ) ) )
            // InternalWarehouseModelling.g:419:1: ( ( rule__Company__AddressAssignment_2 ) )
            {
            // InternalWarehouseModelling.g:419:1: ( ( rule__Company__AddressAssignment_2 ) )
            // InternalWarehouseModelling.g:420:2: ( rule__Company__AddressAssignment_2 )
            {
             before(grammarAccess.getCompanyAccess().getAddressAssignment_2()); 
            // InternalWarehouseModelling.g:421:2: ( rule__Company__AddressAssignment_2 )
            // InternalWarehouseModelling.g:421:3: rule__Company__AddressAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Company__AddressAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getAddressAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2__Impl"


    // $ANTLR start "rule__Company__Group__3"
    // InternalWarehouseModelling.g:429:1: rule__Company__Group__3 : rule__Company__Group__3__Impl rule__Company__Group__4 ;
    public final void rule__Company__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:433:1: ( rule__Company__Group__3__Impl rule__Company__Group__4 )
            // InternalWarehouseModelling.g:434:2: rule__Company__Group__3__Impl rule__Company__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Company__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__3"


    // $ANTLR start "rule__Company__Group__3__Impl"
    // InternalWarehouseModelling.g:441:1: rule__Company__Group__3__Impl : ( 'Warehouses:' ) ;
    public final void rule__Company__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:445:1: ( ( 'Warehouses:' ) )
            // InternalWarehouseModelling.g:446:1: ( 'Warehouses:' )
            {
            // InternalWarehouseModelling.g:446:1: ( 'Warehouses:' )
            // InternalWarehouseModelling.g:447:2: 'Warehouses:'
            {
             before(grammarAccess.getCompanyAccess().getWarehousesKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getWarehousesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__3__Impl"


    // $ANTLR start "rule__Company__Group__4"
    // InternalWarehouseModelling.g:456:1: rule__Company__Group__4 : rule__Company__Group__4__Impl rule__Company__Group__5 ;
    public final void rule__Company__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:460:1: ( rule__Company__Group__4__Impl rule__Company__Group__5 )
            // InternalWarehouseModelling.g:461:2: rule__Company__Group__4__Impl rule__Company__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Company__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__4"


    // $ANTLR start "rule__Company__Group__4__Impl"
    // InternalWarehouseModelling.g:468:1: rule__Company__Group__4__Impl : ( ( rule__Company__WarehousesAssignment_4 )* ) ;
    public final void rule__Company__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:472:1: ( ( ( rule__Company__WarehousesAssignment_4 )* ) )
            // InternalWarehouseModelling.g:473:1: ( ( rule__Company__WarehousesAssignment_4 )* )
            {
            // InternalWarehouseModelling.g:473:1: ( ( rule__Company__WarehousesAssignment_4 )* )
            // InternalWarehouseModelling.g:474:2: ( rule__Company__WarehousesAssignment_4 )*
            {
             before(grammarAccess.getCompanyAccess().getWarehousesAssignment_4()); 
            // InternalWarehouseModelling.g:475:2: ( rule__Company__WarehousesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWarehouseModelling.g:475:3: rule__Company__WarehousesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Company__WarehousesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCompanyAccess().getWarehousesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__4__Impl"


    // $ANTLR start "rule__Company__Group__5"
    // InternalWarehouseModelling.g:483:1: rule__Company__Group__5 : rule__Company__Group__5__Impl rule__Company__Group__6 ;
    public final void rule__Company__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:487:1: ( rule__Company__Group__5__Impl rule__Company__Group__6 )
            // InternalWarehouseModelling.g:488:2: rule__Company__Group__5__Impl rule__Company__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Company__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__5"


    // $ANTLR start "rule__Company__Group__5__Impl"
    // InternalWarehouseModelling.g:495:1: rule__Company__Group__5__Impl : ( 'Teams:' ) ;
    public final void rule__Company__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:499:1: ( ( 'Teams:' ) )
            // InternalWarehouseModelling.g:500:1: ( 'Teams:' )
            {
            // InternalWarehouseModelling.g:500:1: ( 'Teams:' )
            // InternalWarehouseModelling.g:501:2: 'Teams:'
            {
             before(grammarAccess.getCompanyAccess().getTeamsKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getTeamsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__5__Impl"


    // $ANTLR start "rule__Company__Group__6"
    // InternalWarehouseModelling.g:510:1: rule__Company__Group__6 : rule__Company__Group__6__Impl rule__Company__Group__7 ;
    public final void rule__Company__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:514:1: ( rule__Company__Group__6__Impl rule__Company__Group__7 )
            // InternalWarehouseModelling.g:515:2: rule__Company__Group__6__Impl rule__Company__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Company__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__6"


    // $ANTLR start "rule__Company__Group__6__Impl"
    // InternalWarehouseModelling.g:522:1: rule__Company__Group__6__Impl : ( ( rule__Company__TeamsAssignment_6 )* ) ;
    public final void rule__Company__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:526:1: ( ( ( rule__Company__TeamsAssignment_6 )* ) )
            // InternalWarehouseModelling.g:527:1: ( ( rule__Company__TeamsAssignment_6 )* )
            {
            // InternalWarehouseModelling.g:527:1: ( ( rule__Company__TeamsAssignment_6 )* )
            // InternalWarehouseModelling.g:528:2: ( rule__Company__TeamsAssignment_6 )*
            {
             before(grammarAccess.getCompanyAccess().getTeamsAssignment_6()); 
            // InternalWarehouseModelling.g:529:2: ( rule__Company__TeamsAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWarehouseModelling.g:529:3: rule__Company__TeamsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Company__TeamsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCompanyAccess().getTeamsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__6__Impl"


    // $ANTLR start "rule__Company__Group__7"
    // InternalWarehouseModelling.g:537:1: rule__Company__Group__7 : rule__Company__Group__7__Impl rule__Company__Group__8 ;
    public final void rule__Company__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:541:1: ( rule__Company__Group__7__Impl rule__Company__Group__8 )
            // InternalWarehouseModelling.g:542:2: rule__Company__Group__7__Impl rule__Company__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Company__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__7"


    // $ANTLR start "rule__Company__Group__7__Impl"
    // InternalWarehouseModelling.g:549:1: rule__Company__Group__7__Impl : ( 'Tasks:' ) ;
    public final void rule__Company__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:553:1: ( ( 'Tasks:' ) )
            // InternalWarehouseModelling.g:554:1: ( 'Tasks:' )
            {
            // InternalWarehouseModelling.g:554:1: ( 'Tasks:' )
            // InternalWarehouseModelling.g:555:2: 'Tasks:'
            {
             before(grammarAccess.getCompanyAccess().getTasksKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getTasksKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__7__Impl"


    // $ANTLR start "rule__Company__Group__8"
    // InternalWarehouseModelling.g:564:1: rule__Company__Group__8 : rule__Company__Group__8__Impl ;
    public final void rule__Company__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:568:1: ( rule__Company__Group__8__Impl )
            // InternalWarehouseModelling.g:569:2: rule__Company__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__8"


    // $ANTLR start "rule__Company__Group__8__Impl"
    // InternalWarehouseModelling.g:575:1: rule__Company__Group__8__Impl : ( ( rule__Company__TasksAssignment_8 )* ) ;
    public final void rule__Company__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:579:1: ( ( ( rule__Company__TasksAssignment_8 )* ) )
            // InternalWarehouseModelling.g:580:1: ( ( rule__Company__TasksAssignment_8 )* )
            {
            // InternalWarehouseModelling.g:580:1: ( ( rule__Company__TasksAssignment_8 )* )
            // InternalWarehouseModelling.g:581:2: ( rule__Company__TasksAssignment_8 )*
            {
             before(grammarAccess.getCompanyAccess().getTasksAssignment_8()); 
            // InternalWarehouseModelling.g:582:2: ( rule__Company__TasksAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWarehouseModelling.g:582:3: rule__Company__TasksAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Company__TasksAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCompanyAccess().getTasksAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__8__Impl"


    // $ANTLR start "rule__Warehouse__Group__0"
    // InternalWarehouseModelling.g:591:1: rule__Warehouse__Group__0 : rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 ;
    public final void rule__Warehouse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:595:1: ( rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 )
            // InternalWarehouseModelling.g:596:2: rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Warehouse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__0"


    // $ANTLR start "rule__Warehouse__Group__0__Impl"
    // InternalWarehouseModelling.g:603:1: rule__Warehouse__Group__0__Impl : ( 'Warehouse' ) ;
    public final void rule__Warehouse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:607:1: ( ( 'Warehouse' ) )
            // InternalWarehouseModelling.g:608:1: ( 'Warehouse' )
            {
            // InternalWarehouseModelling.g:608:1: ( 'Warehouse' )
            // InternalWarehouseModelling.g:609:2: 'Warehouse'
            {
             before(grammarAccess.getWarehouseAccess().getWarehouseKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getWarehouseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__0__Impl"


    // $ANTLR start "rule__Warehouse__Group__1"
    // InternalWarehouseModelling.g:618:1: rule__Warehouse__Group__1 : rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 ;
    public final void rule__Warehouse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:622:1: ( rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 )
            // InternalWarehouseModelling.g:623:2: rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Warehouse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__1"


    // $ANTLR start "rule__Warehouse__Group__1__Impl"
    // InternalWarehouseModelling.g:630:1: rule__Warehouse__Group__1__Impl : ( ( rule__Warehouse__NameAssignment_1 ) ) ;
    public final void rule__Warehouse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:634:1: ( ( ( rule__Warehouse__NameAssignment_1 ) ) )
            // InternalWarehouseModelling.g:635:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            {
            // InternalWarehouseModelling.g:635:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            // InternalWarehouseModelling.g:636:2: ( rule__Warehouse__NameAssignment_1 )
            {
             before(grammarAccess.getWarehouseAccess().getNameAssignment_1()); 
            // InternalWarehouseModelling.g:637:2: ( rule__Warehouse__NameAssignment_1 )
            // InternalWarehouseModelling.g:637:3: rule__Warehouse__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__1__Impl"


    // $ANTLR start "rule__Warehouse__Group__2"
    // InternalWarehouseModelling.g:645:1: rule__Warehouse__Group__2 : rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 ;
    public final void rule__Warehouse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:649:1: ( rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 )
            // InternalWarehouseModelling.g:650:2: rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Warehouse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__2"


    // $ANTLR start "rule__Warehouse__Group__2__Impl"
    // InternalWarehouseModelling.g:657:1: rule__Warehouse__Group__2__Impl : ( '{' ) ;
    public final void rule__Warehouse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:661:1: ( ( '{' ) )
            // InternalWarehouseModelling.g:662:1: ( '{' )
            {
            // InternalWarehouseModelling.g:662:1: ( '{' )
            // InternalWarehouseModelling.g:663:2: '{'
            {
             before(grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__2__Impl"


    // $ANTLR start "rule__Warehouse__Group__3"
    // InternalWarehouseModelling.g:672:1: rule__Warehouse__Group__3 : rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 ;
    public final void rule__Warehouse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:676:1: ( rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 )
            // InternalWarehouseModelling.g:677:2: rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Warehouse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__3"


    // $ANTLR start "rule__Warehouse__Group__3__Impl"
    // InternalWarehouseModelling.g:684:1: rule__Warehouse__Group__3__Impl : ( ( rule__Warehouse__WorkersAssignment_3 )* ) ;
    public final void rule__Warehouse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:688:1: ( ( ( rule__Warehouse__WorkersAssignment_3 )* ) )
            // InternalWarehouseModelling.g:689:1: ( ( rule__Warehouse__WorkersAssignment_3 )* )
            {
            // InternalWarehouseModelling.g:689:1: ( ( rule__Warehouse__WorkersAssignment_3 )* )
            // InternalWarehouseModelling.g:690:2: ( rule__Warehouse__WorkersAssignment_3 )*
            {
             before(grammarAccess.getWarehouseAccess().getWorkersAssignment_3()); 
            // InternalWarehouseModelling.g:691:2: ( rule__Warehouse__WorkersAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWarehouseModelling.g:691:3: rule__Warehouse__WorkersAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Warehouse__WorkersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getWarehouseAccess().getWorkersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__3__Impl"


    // $ANTLR start "rule__Warehouse__Group__4"
    // InternalWarehouseModelling.g:699:1: rule__Warehouse__Group__4 : rule__Warehouse__Group__4__Impl ;
    public final void rule__Warehouse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:703:1: ( rule__Warehouse__Group__4__Impl )
            // InternalWarehouseModelling.g:704:2: rule__Warehouse__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__4"


    // $ANTLR start "rule__Warehouse__Group__4__Impl"
    // InternalWarehouseModelling.g:710:1: rule__Warehouse__Group__4__Impl : ( '}' ) ;
    public final void rule__Warehouse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:714:1: ( ( '}' ) )
            // InternalWarehouseModelling.g:715:1: ( '}' )
            {
            // InternalWarehouseModelling.g:715:1: ( '}' )
            // InternalWarehouseModelling.g:716:2: '}'
            {
             before(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__4__Impl"


    // $ANTLR start "rule__Team__Group__0"
    // InternalWarehouseModelling.g:726:1: rule__Team__Group__0 : rule__Team__Group__0__Impl rule__Team__Group__1 ;
    public final void rule__Team__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:730:1: ( rule__Team__Group__0__Impl rule__Team__Group__1 )
            // InternalWarehouseModelling.g:731:2: rule__Team__Group__0__Impl rule__Team__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Team__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__0"


    // $ANTLR start "rule__Team__Group__0__Impl"
    // InternalWarehouseModelling.g:738:1: rule__Team__Group__0__Impl : ( 'Team' ) ;
    public final void rule__Team__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:742:1: ( ( 'Team' ) )
            // InternalWarehouseModelling.g:743:1: ( 'Team' )
            {
            // InternalWarehouseModelling.g:743:1: ( 'Team' )
            // InternalWarehouseModelling.g:744:2: 'Team'
            {
             before(grammarAccess.getTeamAccess().getTeamKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getTeamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__0__Impl"


    // $ANTLR start "rule__Team__Group__1"
    // InternalWarehouseModelling.g:753:1: rule__Team__Group__1 : rule__Team__Group__1__Impl ;
    public final void rule__Team__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:757:1: ( rule__Team__Group__1__Impl )
            // InternalWarehouseModelling.g:758:2: rule__Team__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__1"


    // $ANTLR start "rule__Team__Group__1__Impl"
    // InternalWarehouseModelling.g:764:1: rule__Team__Group__1__Impl : ( ( rule__Team__NameAssignment_1 ) ) ;
    public final void rule__Team__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:768:1: ( ( ( rule__Team__NameAssignment_1 ) ) )
            // InternalWarehouseModelling.g:769:1: ( ( rule__Team__NameAssignment_1 ) )
            {
            // InternalWarehouseModelling.g:769:1: ( ( rule__Team__NameAssignment_1 ) )
            // InternalWarehouseModelling.g:770:2: ( rule__Team__NameAssignment_1 )
            {
             before(grammarAccess.getTeamAccess().getNameAssignment_1()); 
            // InternalWarehouseModelling.g:771:2: ( rule__Team__NameAssignment_1 )
            // InternalWarehouseModelling.g:771:3: rule__Team__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Team__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalWarehouseModelling.g:780:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:784:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalWarehouseModelling.g:785:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalWarehouseModelling.g:792:1: rule__Person__Group__0__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:796:1: ( ( 'Person' ) )
            // InternalWarehouseModelling.g:797:1: ( 'Person' )
            {
            // InternalWarehouseModelling.g:797:1: ( 'Person' )
            // InternalWarehouseModelling.g:798:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalWarehouseModelling.g:807:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:811:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalWarehouseModelling.g:812:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalWarehouseModelling.g:819:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:823:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalWarehouseModelling.g:824:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalWarehouseModelling.g:824:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalWarehouseModelling.g:825:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalWarehouseModelling.g:826:2: ( rule__Person__NameAssignment_1 )
            // InternalWarehouseModelling.g:826:3: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalWarehouseModelling.g:834:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:838:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalWarehouseModelling.g:839:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalWarehouseModelling.g:846:1: rule__Person__Group__2__Impl : ( 'with' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:850:1: ( ( 'with' ) )
            // InternalWarehouseModelling.g:851:1: ( 'with' )
            {
            // InternalWarehouseModelling.g:851:1: ( 'with' )
            // InternalWarehouseModelling.g:852:2: 'with'
            {
             before(grammarAccess.getPersonAccess().getWithKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalWarehouseModelling.g:861:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:865:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalWarehouseModelling.g:866:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalWarehouseModelling.g:873:1: rule__Person__Group__3__Impl : ( 'roles' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:877:1: ( ( 'roles' ) )
            // InternalWarehouseModelling.g:878:1: ( 'roles' )
            {
            // InternalWarehouseModelling.g:878:1: ( 'roles' )
            // InternalWarehouseModelling.g:879:2: 'roles'
            {
             before(grammarAccess.getPersonAccess().getRolesKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRolesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // InternalWarehouseModelling.g:888:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:892:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalWarehouseModelling.g:893:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalWarehouseModelling.g:900:1: rule__Person__Group__4__Impl : ( '[' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:904:1: ( ( '[' ) )
            // InternalWarehouseModelling.g:905:1: ( '[' )
            {
            // InternalWarehouseModelling.g:905:1: ( '[' )
            // InternalWarehouseModelling.g:906:2: '['
            {
             before(grammarAccess.getPersonAccess().getLeftSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // InternalWarehouseModelling.g:915:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:919:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalWarehouseModelling.g:920:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Person__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // InternalWarehouseModelling.g:927:1: rule__Person__Group__5__Impl : ( ( rule__Person__RolesAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:931:1: ( ( ( rule__Person__RolesAssignment_5 ) ) )
            // InternalWarehouseModelling.g:932:1: ( ( rule__Person__RolesAssignment_5 ) )
            {
            // InternalWarehouseModelling.g:932:1: ( ( rule__Person__RolesAssignment_5 ) )
            // InternalWarehouseModelling.g:933:2: ( rule__Person__RolesAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getRolesAssignment_5()); 
            // InternalWarehouseModelling.g:934:2: ( rule__Person__RolesAssignment_5 )
            // InternalWarehouseModelling.g:934:3: rule__Person__RolesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Person__RolesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getRolesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Person__Group__6"
    // InternalWarehouseModelling.g:942:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:946:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalWarehouseModelling.g:947:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Person__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6"


    // $ANTLR start "rule__Person__Group__6__Impl"
    // InternalWarehouseModelling.g:954:1: rule__Person__Group__6__Impl : ( ( rule__Person__Group_6__0 )* ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:958:1: ( ( ( rule__Person__Group_6__0 )* ) )
            // InternalWarehouseModelling.g:959:1: ( ( rule__Person__Group_6__0 )* )
            {
            // InternalWarehouseModelling.g:959:1: ( ( rule__Person__Group_6__0 )* )
            // InternalWarehouseModelling.g:960:2: ( rule__Person__Group_6__0 )*
            {
             before(grammarAccess.getPersonAccess().getGroup_6()); 
            // InternalWarehouseModelling.g:961:2: ( rule__Person__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWarehouseModelling.g:961:3: rule__Person__Group_6__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Person__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPersonAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6__Impl"


    // $ANTLR start "rule__Person__Group__7"
    // InternalWarehouseModelling.g:969:1: rule__Person__Group__7 : rule__Person__Group__7__Impl ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:973:1: ( rule__Person__Group__7__Impl )
            // InternalWarehouseModelling.g:974:2: rule__Person__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7"


    // $ANTLR start "rule__Person__Group__7__Impl"
    // InternalWarehouseModelling.g:980:1: rule__Person__Group__7__Impl : ( ']' ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:984:1: ( ( ']' ) )
            // InternalWarehouseModelling.g:985:1: ( ']' )
            {
            // InternalWarehouseModelling.g:985:1: ( ']' )
            // InternalWarehouseModelling.g:986:2: ']'
            {
             before(grammarAccess.getPersonAccess().getRightSquareBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7__Impl"


    // $ANTLR start "rule__Person__Group_6__0"
    // InternalWarehouseModelling.g:996:1: rule__Person__Group_6__0 : rule__Person__Group_6__0__Impl rule__Person__Group_6__1 ;
    public final void rule__Person__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1000:1: ( rule__Person__Group_6__0__Impl rule__Person__Group_6__1 )
            // InternalWarehouseModelling.g:1001:2: rule__Person__Group_6__0__Impl rule__Person__Group_6__1
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_6__0"


    // $ANTLR start "rule__Person__Group_6__0__Impl"
    // InternalWarehouseModelling.g:1008:1: rule__Person__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Person__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1012:1: ( ( ',' ) )
            // InternalWarehouseModelling.g:1013:1: ( ',' )
            {
            // InternalWarehouseModelling.g:1013:1: ( ',' )
            // InternalWarehouseModelling.g:1014:2: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_6__0__Impl"


    // $ANTLR start "rule__Person__Group_6__1"
    // InternalWarehouseModelling.g:1023:1: rule__Person__Group_6__1 : rule__Person__Group_6__1__Impl ;
    public final void rule__Person__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1027:1: ( rule__Person__Group_6__1__Impl )
            // InternalWarehouseModelling.g:1028:2: rule__Person__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_6__1"


    // $ANTLR start "rule__Person__Group_6__1__Impl"
    // InternalWarehouseModelling.g:1034:1: rule__Person__Group_6__1__Impl : ( ( rule__Person__RolesAssignment_6_1 ) ) ;
    public final void rule__Person__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1038:1: ( ( ( rule__Person__RolesAssignment_6_1 ) ) )
            // InternalWarehouseModelling.g:1039:1: ( ( rule__Person__RolesAssignment_6_1 ) )
            {
            // InternalWarehouseModelling.g:1039:1: ( ( rule__Person__RolesAssignment_6_1 ) )
            // InternalWarehouseModelling.g:1040:2: ( rule__Person__RolesAssignment_6_1 )
            {
             before(grammarAccess.getPersonAccess().getRolesAssignment_6_1()); 
            // InternalWarehouseModelling.g:1041:2: ( rule__Person__RolesAssignment_6_1 )
            // InternalWarehouseModelling.g:1041:3: rule__Person__RolesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__RolesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getRolesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_6__1__Impl"


    // $ANTLR start "rule__Employee__Group__0"
    // InternalWarehouseModelling.g:1050:1: rule__Employee__Group__0 : rule__Employee__Group__0__Impl rule__Employee__Group__1 ;
    public final void rule__Employee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1054:1: ( rule__Employee__Group__0__Impl rule__Employee__Group__1 )
            // InternalWarehouseModelling.g:1055:2: rule__Employee__Group__0__Impl rule__Employee__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Employee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0"


    // $ANTLR start "rule__Employee__Group__0__Impl"
    // InternalWarehouseModelling.g:1062:1: rule__Employee__Group__0__Impl : ( 'Employee' ) ;
    public final void rule__Employee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1066:1: ( ( 'Employee' ) )
            // InternalWarehouseModelling.g:1067:1: ( 'Employee' )
            {
            // InternalWarehouseModelling.g:1067:1: ( 'Employee' )
            // InternalWarehouseModelling.g:1068:2: 'Employee'
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0__Impl"


    // $ANTLR start "rule__Employee__Group__1"
    // InternalWarehouseModelling.g:1077:1: rule__Employee__Group__1 : rule__Employee__Group__1__Impl rule__Employee__Group__2 ;
    public final void rule__Employee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1081:1: ( rule__Employee__Group__1__Impl rule__Employee__Group__2 )
            // InternalWarehouseModelling.g:1082:2: rule__Employee__Group__1__Impl rule__Employee__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Employee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1"


    // $ANTLR start "rule__Employee__Group__1__Impl"
    // InternalWarehouseModelling.g:1089:1: rule__Employee__Group__1__Impl : ( ( rule__Employee__IdAssignment_1 ) ) ;
    public final void rule__Employee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1093:1: ( ( ( rule__Employee__IdAssignment_1 ) ) )
            // InternalWarehouseModelling.g:1094:1: ( ( rule__Employee__IdAssignment_1 ) )
            {
            // InternalWarehouseModelling.g:1094:1: ( ( rule__Employee__IdAssignment_1 ) )
            // InternalWarehouseModelling.g:1095:2: ( rule__Employee__IdAssignment_1 )
            {
             before(grammarAccess.getEmployeeAccess().getIdAssignment_1()); 
            // InternalWarehouseModelling.g:1096:2: ( rule__Employee__IdAssignment_1 )
            // InternalWarehouseModelling.g:1096:3: rule__Employee__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1__Impl"


    // $ANTLR start "rule__Employee__Group__2"
    // InternalWarehouseModelling.g:1104:1: rule__Employee__Group__2 : rule__Employee__Group__2__Impl rule__Employee__Group__3 ;
    public final void rule__Employee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1108:1: ( rule__Employee__Group__2__Impl rule__Employee__Group__3 )
            // InternalWarehouseModelling.g:1109:2: rule__Employee__Group__2__Impl rule__Employee__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Employee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2"


    // $ANTLR start "rule__Employee__Group__2__Impl"
    // InternalWarehouseModelling.g:1116:1: rule__Employee__Group__2__Impl : ( ( rule__Employee__StartDateAssignment_2 ) ) ;
    public final void rule__Employee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1120:1: ( ( ( rule__Employee__StartDateAssignment_2 ) ) )
            // InternalWarehouseModelling.g:1121:1: ( ( rule__Employee__StartDateAssignment_2 ) )
            {
            // InternalWarehouseModelling.g:1121:1: ( ( rule__Employee__StartDateAssignment_2 ) )
            // InternalWarehouseModelling.g:1122:2: ( rule__Employee__StartDateAssignment_2 )
            {
             before(grammarAccess.getEmployeeAccess().getStartDateAssignment_2()); 
            // InternalWarehouseModelling.g:1123:2: ( rule__Employee__StartDateAssignment_2 )
            // InternalWarehouseModelling.g:1123:3: rule__Employee__StartDateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Employee__StartDateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getStartDateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2__Impl"


    // $ANTLR start "rule__Employee__Group__3"
    // InternalWarehouseModelling.g:1131:1: rule__Employee__Group__3 : rule__Employee__Group__3__Impl rule__Employee__Group__4 ;
    public final void rule__Employee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1135:1: ( rule__Employee__Group__3__Impl rule__Employee__Group__4 )
            // InternalWarehouseModelling.g:1136:2: rule__Employee__Group__3__Impl rule__Employee__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Employee__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3"


    // $ANTLR start "rule__Employee__Group__3__Impl"
    // InternalWarehouseModelling.g:1143:1: rule__Employee__Group__3__Impl : ( ( rule__Employee__EndDateAssignment_3 ) ) ;
    public final void rule__Employee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1147:1: ( ( ( rule__Employee__EndDateAssignment_3 ) ) )
            // InternalWarehouseModelling.g:1148:1: ( ( rule__Employee__EndDateAssignment_3 ) )
            {
            // InternalWarehouseModelling.g:1148:1: ( ( rule__Employee__EndDateAssignment_3 ) )
            // InternalWarehouseModelling.g:1149:2: ( rule__Employee__EndDateAssignment_3 )
            {
             before(grammarAccess.getEmployeeAccess().getEndDateAssignment_3()); 
            // InternalWarehouseModelling.g:1150:2: ( rule__Employee__EndDateAssignment_3 )
            // InternalWarehouseModelling.g:1150:3: rule__Employee__EndDateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Employee__EndDateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getEndDateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3__Impl"


    // $ANTLR start "rule__Employee__Group__4"
    // InternalWarehouseModelling.g:1158:1: rule__Employee__Group__4 : rule__Employee__Group__4__Impl rule__Employee__Group__5 ;
    public final void rule__Employee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1162:1: ( rule__Employee__Group__4__Impl rule__Employee__Group__5 )
            // InternalWarehouseModelling.g:1163:2: rule__Employee__Group__4__Impl rule__Employee__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Employee__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__4"


    // $ANTLR start "rule__Employee__Group__4__Impl"
    // InternalWarehouseModelling.g:1170:1: rule__Employee__Group__4__Impl : ( 'available' ) ;
    public final void rule__Employee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1174:1: ( ( 'available' ) )
            // InternalWarehouseModelling.g:1175:1: ( 'available' )
            {
            // InternalWarehouseModelling.g:1175:1: ( 'available' )
            // InternalWarehouseModelling.g:1176:2: 'available'
            {
             before(grammarAccess.getEmployeeAccess().getAvailableKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getAvailableKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__4__Impl"


    // $ANTLR start "rule__Employee__Group__5"
    // InternalWarehouseModelling.g:1185:1: rule__Employee__Group__5 : rule__Employee__Group__5__Impl rule__Employee__Group__6 ;
    public final void rule__Employee__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1189:1: ( rule__Employee__Group__5__Impl rule__Employee__Group__6 )
            // InternalWarehouseModelling.g:1190:2: rule__Employee__Group__5__Impl rule__Employee__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Employee__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__5"


    // $ANTLR start "rule__Employee__Group__5__Impl"
    // InternalWarehouseModelling.g:1197:1: rule__Employee__Group__5__Impl : ( 'for' ) ;
    public final void rule__Employee__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1201:1: ( ( 'for' ) )
            // InternalWarehouseModelling.g:1202:1: ( 'for' )
            {
            // InternalWarehouseModelling.g:1202:1: ( 'for' )
            // InternalWarehouseModelling.g:1203:2: 'for'
            {
             before(grammarAccess.getEmployeeAccess().getForKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getForKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__5__Impl"


    // $ANTLR start "rule__Employee__Group__6"
    // InternalWarehouseModelling.g:1212:1: rule__Employee__Group__6 : rule__Employee__Group__6__Impl rule__Employee__Group__7 ;
    public final void rule__Employee__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1216:1: ( rule__Employee__Group__6__Impl rule__Employee__Group__7 )
            // InternalWarehouseModelling.g:1217:2: rule__Employee__Group__6__Impl rule__Employee__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Employee__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__6"


    // $ANTLR start "rule__Employee__Group__6__Impl"
    // InternalWarehouseModelling.g:1224:1: rule__Employee__Group__6__Impl : ( ( rule__Employee__AvailabilitiesAssignment_6 ) ) ;
    public final void rule__Employee__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1228:1: ( ( ( rule__Employee__AvailabilitiesAssignment_6 ) ) )
            // InternalWarehouseModelling.g:1229:1: ( ( rule__Employee__AvailabilitiesAssignment_6 ) )
            {
            // InternalWarehouseModelling.g:1229:1: ( ( rule__Employee__AvailabilitiesAssignment_6 ) )
            // InternalWarehouseModelling.g:1230:2: ( rule__Employee__AvailabilitiesAssignment_6 )
            {
             before(grammarAccess.getEmployeeAccess().getAvailabilitiesAssignment_6()); 
            // InternalWarehouseModelling.g:1231:2: ( rule__Employee__AvailabilitiesAssignment_6 )
            // InternalWarehouseModelling.g:1231:3: rule__Employee__AvailabilitiesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Employee__AvailabilitiesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getAvailabilitiesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__6__Impl"


    // $ANTLR start "rule__Employee__Group__7"
    // InternalWarehouseModelling.g:1239:1: rule__Employee__Group__7 : rule__Employee__Group__7__Impl ;
    public final void rule__Employee__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1243:1: ( rule__Employee__Group__7__Impl )
            // InternalWarehouseModelling.g:1244:2: rule__Employee__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__7"


    // $ANTLR start "rule__Employee__Group__7__Impl"
    // InternalWarehouseModelling.g:1250:1: rule__Employee__Group__7__Impl : ( ( rule__Employee__Group_7__0 )* ) ;
    public final void rule__Employee__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1254:1: ( ( ( rule__Employee__Group_7__0 )* ) )
            // InternalWarehouseModelling.g:1255:1: ( ( rule__Employee__Group_7__0 )* )
            {
            // InternalWarehouseModelling.g:1255:1: ( ( rule__Employee__Group_7__0 )* )
            // InternalWarehouseModelling.g:1256:2: ( rule__Employee__Group_7__0 )*
            {
             before(grammarAccess.getEmployeeAccess().getGroup_7()); 
            // InternalWarehouseModelling.g:1257:2: ( rule__Employee__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==35) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalWarehouseModelling.g:1257:3: rule__Employee__Group_7__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Employee__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEmployeeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__7__Impl"


    // $ANTLR start "rule__Employee__Group_7__0"
    // InternalWarehouseModelling.g:1266:1: rule__Employee__Group_7__0 : rule__Employee__Group_7__0__Impl rule__Employee__Group_7__1 ;
    public final void rule__Employee__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1270:1: ( rule__Employee__Group_7__0__Impl rule__Employee__Group_7__1 )
            // InternalWarehouseModelling.g:1271:2: rule__Employee__Group_7__0__Impl rule__Employee__Group_7__1
            {
            pushFollow(FOLLOW_24);
            rule__Employee__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_7__0"


    // $ANTLR start "rule__Employee__Group_7__0__Impl"
    // InternalWarehouseModelling.g:1278:1: rule__Employee__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Employee__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1282:1: ( ( ',' ) )
            // InternalWarehouseModelling.g:1283:1: ( ',' )
            {
            // InternalWarehouseModelling.g:1283:1: ( ',' )
            // InternalWarehouseModelling.g:1284:2: ','
            {
             before(grammarAccess.getEmployeeAccess().getCommaKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_7__0__Impl"


    // $ANTLR start "rule__Employee__Group_7__1"
    // InternalWarehouseModelling.g:1293:1: rule__Employee__Group_7__1 : rule__Employee__Group_7__1__Impl ;
    public final void rule__Employee__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1297:1: ( rule__Employee__Group_7__1__Impl )
            // InternalWarehouseModelling.g:1298:2: rule__Employee__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_7__1"


    // $ANTLR start "rule__Employee__Group_7__1__Impl"
    // InternalWarehouseModelling.g:1304:1: rule__Employee__Group_7__1__Impl : ( ( rule__Employee__AvailabilitiesAssignment_7_1 ) ) ;
    public final void rule__Employee__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1308:1: ( ( ( rule__Employee__AvailabilitiesAssignment_7_1 ) ) )
            // InternalWarehouseModelling.g:1309:1: ( ( rule__Employee__AvailabilitiesAssignment_7_1 ) )
            {
            // InternalWarehouseModelling.g:1309:1: ( ( rule__Employee__AvailabilitiesAssignment_7_1 ) )
            // InternalWarehouseModelling.g:1310:2: ( rule__Employee__AvailabilitiesAssignment_7_1 )
            {
             before(grammarAccess.getEmployeeAccess().getAvailabilitiesAssignment_7_1()); 
            // InternalWarehouseModelling.g:1311:2: ( rule__Employee__AvailabilitiesAssignment_7_1 )
            // InternalWarehouseModelling.g:1311:3: rule__Employee__AvailabilitiesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__AvailabilitiesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getAvailabilitiesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_7__1__Impl"


    // $ANTLR start "rule__Manager__Group__0"
    // InternalWarehouseModelling.g:1320:1: rule__Manager__Group__0 : rule__Manager__Group__0__Impl rule__Manager__Group__1 ;
    public final void rule__Manager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1324:1: ( rule__Manager__Group__0__Impl rule__Manager__Group__1 )
            // InternalWarehouseModelling.g:1325:2: rule__Manager__Group__0__Impl rule__Manager__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Manager__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__0"


    // $ANTLR start "rule__Manager__Group__0__Impl"
    // InternalWarehouseModelling.g:1332:1: rule__Manager__Group__0__Impl : ( 'Manager' ) ;
    public final void rule__Manager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1336:1: ( ( 'Manager' ) )
            // InternalWarehouseModelling.g:1337:1: ( 'Manager' )
            {
            // InternalWarehouseModelling.g:1337:1: ( 'Manager' )
            // InternalWarehouseModelling.g:1338:2: 'Manager'
            {
             before(grammarAccess.getManagerAccess().getManagerKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getManagerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__0__Impl"


    // $ANTLR start "rule__Manager__Group__1"
    // InternalWarehouseModelling.g:1347:1: rule__Manager__Group__1 : rule__Manager__Group__1__Impl rule__Manager__Group__2 ;
    public final void rule__Manager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1351:1: ( rule__Manager__Group__1__Impl rule__Manager__Group__2 )
            // InternalWarehouseModelling.g:1352:2: rule__Manager__Group__1__Impl rule__Manager__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Manager__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__1"


    // $ANTLR start "rule__Manager__Group__1__Impl"
    // InternalWarehouseModelling.g:1359:1: rule__Manager__Group__1__Impl : ( ( rule__Manager__IdAssignment_1 ) ) ;
    public final void rule__Manager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1363:1: ( ( ( rule__Manager__IdAssignment_1 ) ) )
            // InternalWarehouseModelling.g:1364:1: ( ( rule__Manager__IdAssignment_1 ) )
            {
            // InternalWarehouseModelling.g:1364:1: ( ( rule__Manager__IdAssignment_1 ) )
            // InternalWarehouseModelling.g:1365:2: ( rule__Manager__IdAssignment_1 )
            {
             before(grammarAccess.getManagerAccess().getIdAssignment_1()); 
            // InternalWarehouseModelling.g:1366:2: ( rule__Manager__IdAssignment_1 )
            // InternalWarehouseModelling.g:1366:3: rule__Manager__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Manager__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManagerAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__1__Impl"


    // $ANTLR start "rule__Manager__Group__2"
    // InternalWarehouseModelling.g:1374:1: rule__Manager__Group__2 : rule__Manager__Group__2__Impl rule__Manager__Group__3 ;
    public final void rule__Manager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1378:1: ( rule__Manager__Group__2__Impl rule__Manager__Group__3 )
            // InternalWarehouseModelling.g:1379:2: rule__Manager__Group__2__Impl rule__Manager__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Manager__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__2"


    // $ANTLR start "rule__Manager__Group__2__Impl"
    // InternalWarehouseModelling.g:1386:1: rule__Manager__Group__2__Impl : ( ( rule__Manager__StartDateAssignment_2 ) ) ;
    public final void rule__Manager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1390:1: ( ( ( rule__Manager__StartDateAssignment_2 ) ) )
            // InternalWarehouseModelling.g:1391:1: ( ( rule__Manager__StartDateAssignment_2 ) )
            {
            // InternalWarehouseModelling.g:1391:1: ( ( rule__Manager__StartDateAssignment_2 ) )
            // InternalWarehouseModelling.g:1392:2: ( rule__Manager__StartDateAssignment_2 )
            {
             before(grammarAccess.getManagerAccess().getStartDateAssignment_2()); 
            // InternalWarehouseModelling.g:1393:2: ( rule__Manager__StartDateAssignment_2 )
            // InternalWarehouseModelling.g:1393:3: rule__Manager__StartDateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Manager__StartDateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getManagerAccess().getStartDateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__2__Impl"


    // $ANTLR start "rule__Manager__Group__3"
    // InternalWarehouseModelling.g:1401:1: rule__Manager__Group__3 : rule__Manager__Group__3__Impl rule__Manager__Group__4 ;
    public final void rule__Manager__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1405:1: ( rule__Manager__Group__3__Impl rule__Manager__Group__4 )
            // InternalWarehouseModelling.g:1406:2: rule__Manager__Group__3__Impl rule__Manager__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Manager__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__3"


    // $ANTLR start "rule__Manager__Group__3__Impl"
    // InternalWarehouseModelling.g:1413:1: rule__Manager__Group__3__Impl : ( ( rule__Manager__EndDateAssignment_3 ) ) ;
    public final void rule__Manager__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1417:1: ( ( ( rule__Manager__EndDateAssignment_3 ) ) )
            // InternalWarehouseModelling.g:1418:1: ( ( rule__Manager__EndDateAssignment_3 ) )
            {
            // InternalWarehouseModelling.g:1418:1: ( ( rule__Manager__EndDateAssignment_3 ) )
            // InternalWarehouseModelling.g:1419:2: ( rule__Manager__EndDateAssignment_3 )
            {
             before(grammarAccess.getManagerAccess().getEndDateAssignment_3()); 
            // InternalWarehouseModelling.g:1420:2: ( rule__Manager__EndDateAssignment_3 )
            // InternalWarehouseModelling.g:1420:3: rule__Manager__EndDateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Manager__EndDateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManagerAccess().getEndDateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__3__Impl"


    // $ANTLR start "rule__Manager__Group__4"
    // InternalWarehouseModelling.g:1428:1: rule__Manager__Group__4 : rule__Manager__Group__4__Impl rule__Manager__Group__5 ;
    public final void rule__Manager__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1432:1: ( rule__Manager__Group__4__Impl rule__Manager__Group__5 )
            // InternalWarehouseModelling.g:1433:2: rule__Manager__Group__4__Impl rule__Manager__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Manager__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__4"


    // $ANTLR start "rule__Manager__Group__4__Impl"
    // InternalWarehouseModelling.g:1440:1: rule__Manager__Group__4__Impl : ( 'of' ) ;
    public final void rule__Manager__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1444:1: ( ( 'of' ) )
            // InternalWarehouseModelling.g:1445:1: ( 'of' )
            {
            // InternalWarehouseModelling.g:1445:1: ( 'of' )
            // InternalWarehouseModelling.g:1446:2: 'of'
            {
             before(grammarAccess.getManagerAccess().getOfKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__4__Impl"


    // $ANTLR start "rule__Manager__Group__5"
    // InternalWarehouseModelling.g:1455:1: rule__Manager__Group__5 : rule__Manager__Group__5__Impl rule__Manager__Group__6 ;
    public final void rule__Manager__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1459:1: ( rule__Manager__Group__5__Impl rule__Manager__Group__6 )
            // InternalWarehouseModelling.g:1460:2: rule__Manager__Group__5__Impl rule__Manager__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Manager__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manager__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__5"


    // $ANTLR start "rule__Manager__Group__5__Impl"
    // InternalWarehouseModelling.g:1467:1: rule__Manager__Group__5__Impl : ( 'team' ) ;
    public final void rule__Manager__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1471:1: ( ( 'team' ) )
            // InternalWarehouseModelling.g:1472:1: ( 'team' )
            {
            // InternalWarehouseModelling.g:1472:1: ( 'team' )
            // InternalWarehouseModelling.g:1473:2: 'team'
            {
             before(grammarAccess.getManagerAccess().getTeamKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getTeamKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__5__Impl"


    // $ANTLR start "rule__Manager__Group__6"
    // InternalWarehouseModelling.g:1482:1: rule__Manager__Group__6 : rule__Manager__Group__6__Impl ;
    public final void rule__Manager__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1486:1: ( rule__Manager__Group__6__Impl )
            // InternalWarehouseModelling.g:1487:2: rule__Manager__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manager__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__6"


    // $ANTLR start "rule__Manager__Group__6__Impl"
    // InternalWarehouseModelling.g:1493:1: rule__Manager__Group__6__Impl : ( ( rule__Manager__ManagesAssignment_6 ) ) ;
    public final void rule__Manager__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1497:1: ( ( ( rule__Manager__ManagesAssignment_6 ) ) )
            // InternalWarehouseModelling.g:1498:1: ( ( rule__Manager__ManagesAssignment_6 ) )
            {
            // InternalWarehouseModelling.g:1498:1: ( ( rule__Manager__ManagesAssignment_6 ) )
            // InternalWarehouseModelling.g:1499:2: ( rule__Manager__ManagesAssignment_6 )
            {
             before(grammarAccess.getManagerAccess().getManagesAssignment_6()); 
            // InternalWarehouseModelling.g:1500:2: ( rule__Manager__ManagesAssignment_6 )
            // InternalWarehouseModelling.g:1500:3: rule__Manager__ManagesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Manager__ManagesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getManagerAccess().getManagesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalWarehouseModelling.g:1509:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1513:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalWarehouseModelling.g:1514:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalWarehouseModelling.g:1521:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1525:1: ( ( 'Task' ) )
            // InternalWarehouseModelling.g:1526:1: ( 'Task' )
            {
            // InternalWarehouseModelling.g:1526:1: ( 'Task' )
            // InternalWarehouseModelling.g:1527:2: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalWarehouseModelling.g:1536:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1540:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalWarehouseModelling.g:1541:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalWarehouseModelling.g:1548:1: rule__Task__Group__1__Impl : ( ( rule__Task__IdAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1552:1: ( ( ( rule__Task__IdAssignment_1 ) ) )
            // InternalWarehouseModelling.g:1553:1: ( ( rule__Task__IdAssignment_1 ) )
            {
            // InternalWarehouseModelling.g:1553:1: ( ( rule__Task__IdAssignment_1 ) )
            // InternalWarehouseModelling.g:1554:2: ( rule__Task__IdAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getIdAssignment_1()); 
            // InternalWarehouseModelling.g:1555:2: ( rule__Task__IdAssignment_1 )
            // InternalWarehouseModelling.g:1555:3: rule__Task__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalWarehouseModelling.g:1563:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1567:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalWarehouseModelling.g:1568:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalWarehouseModelling.g:1575:1: rule__Task__Group__2__Impl : ( ( rule__Task__DescriptionAssignment_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1579:1: ( ( ( rule__Task__DescriptionAssignment_2 ) ) )
            // InternalWarehouseModelling.g:1580:1: ( ( rule__Task__DescriptionAssignment_2 ) )
            {
            // InternalWarehouseModelling.g:1580:1: ( ( rule__Task__DescriptionAssignment_2 ) )
            // InternalWarehouseModelling.g:1581:2: ( rule__Task__DescriptionAssignment_2 )
            {
             before(grammarAccess.getTaskAccess().getDescriptionAssignment_2()); 
            // InternalWarehouseModelling.g:1582:2: ( rule__Task__DescriptionAssignment_2 )
            // InternalWarehouseModelling.g:1582:3: rule__Task__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalWarehouseModelling.g:1590:1: rule__Task__Group__3 : rule__Task__Group__3__Impl ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1594:1: ( rule__Task__Group__3__Impl )
            // InternalWarehouseModelling.g:1595:2: rule__Task__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalWarehouseModelling.g:1601:1: rule__Task__Group__3__Impl : ( ( rule__Task__AssignmentAssignment_3 ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1605:1: ( ( ( rule__Task__AssignmentAssignment_3 ) ) )
            // InternalWarehouseModelling.g:1606:1: ( ( rule__Task__AssignmentAssignment_3 ) )
            {
            // InternalWarehouseModelling.g:1606:1: ( ( rule__Task__AssignmentAssignment_3 ) )
            // InternalWarehouseModelling.g:1607:2: ( rule__Task__AssignmentAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getAssignmentAssignment_3()); 
            // InternalWarehouseModelling.g:1608:2: ( rule__Task__AssignmentAssignment_3 )
            // InternalWarehouseModelling.g:1608:3: rule__Task__AssignmentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Task__AssignmentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAssignmentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__TaskAssignment__Group__0"
    // InternalWarehouseModelling.g:1617:1: rule__TaskAssignment__Group__0 : rule__TaskAssignment__Group__0__Impl rule__TaskAssignment__Group__1 ;
    public final void rule__TaskAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1621:1: ( rule__TaskAssignment__Group__0__Impl rule__TaskAssignment__Group__1 )
            // InternalWarehouseModelling.g:1622:2: rule__TaskAssignment__Group__0__Impl rule__TaskAssignment__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__TaskAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__0"


    // $ANTLR start "rule__TaskAssignment__Group__0__Impl"
    // InternalWarehouseModelling.g:1629:1: rule__TaskAssignment__Group__0__Impl : ( 'TaskAssignment' ) ;
    public final void rule__TaskAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1633:1: ( ( 'TaskAssignment' ) )
            // InternalWarehouseModelling.g:1634:1: ( 'TaskAssignment' )
            {
            // InternalWarehouseModelling.g:1634:1: ( 'TaskAssignment' )
            // InternalWarehouseModelling.g:1635:2: 'TaskAssignment'
            {
             before(grammarAccess.getTaskAssignmentAccess().getTaskAssignmentKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTaskAssignmentAccess().getTaskAssignmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__0__Impl"


    // $ANTLR start "rule__TaskAssignment__Group__1"
    // InternalWarehouseModelling.g:1644:1: rule__TaskAssignment__Group__1 : rule__TaskAssignment__Group__1__Impl rule__TaskAssignment__Group__2 ;
    public final void rule__TaskAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1648:1: ( rule__TaskAssignment__Group__1__Impl rule__TaskAssignment__Group__2 )
            // InternalWarehouseModelling.g:1649:2: rule__TaskAssignment__Group__1__Impl rule__TaskAssignment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TaskAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__1"


    // $ANTLR start "rule__TaskAssignment__Group__1__Impl"
    // InternalWarehouseModelling.g:1656:1: rule__TaskAssignment__Group__1__Impl : ( 'by' ) ;
    public final void rule__TaskAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1660:1: ( ( 'by' ) )
            // InternalWarehouseModelling.g:1661:1: ( 'by' )
            {
            // InternalWarehouseModelling.g:1661:1: ( 'by' )
            // InternalWarehouseModelling.g:1662:2: 'by'
            {
             before(grammarAccess.getTaskAssignmentAccess().getByKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTaskAssignmentAccess().getByKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__1__Impl"


    // $ANTLR start "rule__TaskAssignment__Group__2"
    // InternalWarehouseModelling.g:1671:1: rule__TaskAssignment__Group__2 : rule__TaskAssignment__Group__2__Impl rule__TaskAssignment__Group__3 ;
    public final void rule__TaskAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1675:1: ( rule__TaskAssignment__Group__2__Impl rule__TaskAssignment__Group__3 )
            // InternalWarehouseModelling.g:1676:2: rule__TaskAssignment__Group__2__Impl rule__TaskAssignment__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__TaskAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__2"


    // $ANTLR start "rule__TaskAssignment__Group__2__Impl"
    // InternalWarehouseModelling.g:1683:1: rule__TaskAssignment__Group__2__Impl : ( ( rule__TaskAssignment__RoleAssignment_2 ) ) ;
    public final void rule__TaskAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1687:1: ( ( ( rule__TaskAssignment__RoleAssignment_2 ) ) )
            // InternalWarehouseModelling.g:1688:1: ( ( rule__TaskAssignment__RoleAssignment_2 ) )
            {
            // InternalWarehouseModelling.g:1688:1: ( ( rule__TaskAssignment__RoleAssignment_2 ) )
            // InternalWarehouseModelling.g:1689:2: ( rule__TaskAssignment__RoleAssignment_2 )
            {
             before(grammarAccess.getTaskAssignmentAccess().getRoleAssignment_2()); 
            // InternalWarehouseModelling.g:1690:2: ( rule__TaskAssignment__RoleAssignment_2 )
            // InternalWarehouseModelling.g:1690:3: rule__TaskAssignment__RoleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TaskAssignment__RoleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAssignmentAccess().getRoleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__2__Impl"


    // $ANTLR start "rule__TaskAssignment__Group__3"
    // InternalWarehouseModelling.g:1698:1: rule__TaskAssignment__Group__3 : rule__TaskAssignment__Group__3__Impl rule__TaskAssignment__Group__4 ;
    public final void rule__TaskAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1702:1: ( rule__TaskAssignment__Group__3__Impl rule__TaskAssignment__Group__4 )
            // InternalWarehouseModelling.g:1703:2: rule__TaskAssignment__Group__3__Impl rule__TaskAssignment__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__TaskAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskAssignment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__3"


    // $ANTLR start "rule__TaskAssignment__Group__3__Impl"
    // InternalWarehouseModelling.g:1710:1: rule__TaskAssignment__Group__3__Impl : ( 'during' ) ;
    public final void rule__TaskAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1714:1: ( ( 'during' ) )
            // InternalWarehouseModelling.g:1715:1: ( 'during' )
            {
            // InternalWarehouseModelling.g:1715:1: ( 'during' )
            // InternalWarehouseModelling.g:1716:2: 'during'
            {
             before(grammarAccess.getTaskAssignmentAccess().getDuringKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTaskAssignmentAccess().getDuringKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__3__Impl"


    // $ANTLR start "rule__TaskAssignment__Group__4"
    // InternalWarehouseModelling.g:1725:1: rule__TaskAssignment__Group__4 : rule__TaskAssignment__Group__4__Impl rule__TaskAssignment__Group__5 ;
    public final void rule__TaskAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1729:1: ( rule__TaskAssignment__Group__4__Impl rule__TaskAssignment__Group__5 )
            // InternalWarehouseModelling.g:1730:2: rule__TaskAssignment__Group__4__Impl rule__TaskAssignment__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__TaskAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskAssignment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__4"


    // $ANTLR start "rule__TaskAssignment__Group__4__Impl"
    // InternalWarehouseModelling.g:1737:1: rule__TaskAssignment__Group__4__Impl : ( ( rule__TaskAssignment__AvailabilityAssignment_4 ) ) ;
    public final void rule__TaskAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1741:1: ( ( ( rule__TaskAssignment__AvailabilityAssignment_4 ) ) )
            // InternalWarehouseModelling.g:1742:1: ( ( rule__TaskAssignment__AvailabilityAssignment_4 ) )
            {
            // InternalWarehouseModelling.g:1742:1: ( ( rule__TaskAssignment__AvailabilityAssignment_4 ) )
            // InternalWarehouseModelling.g:1743:2: ( rule__TaskAssignment__AvailabilityAssignment_4 )
            {
             before(grammarAccess.getTaskAssignmentAccess().getAvailabilityAssignment_4()); 
            // InternalWarehouseModelling.g:1744:2: ( rule__TaskAssignment__AvailabilityAssignment_4 )
            // InternalWarehouseModelling.g:1744:3: rule__TaskAssignment__AvailabilityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TaskAssignment__AvailabilityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTaskAssignmentAccess().getAvailabilityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__4__Impl"


    // $ANTLR start "rule__TaskAssignment__Group__5"
    // InternalWarehouseModelling.g:1752:1: rule__TaskAssignment__Group__5 : rule__TaskAssignment__Group__5__Impl ;
    public final void rule__TaskAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1756:1: ( rule__TaskAssignment__Group__5__Impl )
            // InternalWarehouseModelling.g:1757:2: rule__TaskAssignment__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskAssignment__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__5"


    // $ANTLR start "rule__TaskAssignment__Group__5__Impl"
    // InternalWarehouseModelling.g:1763:1: rule__TaskAssignment__Group__5__Impl : ( ( rule__TaskAssignment__IsDoneAssignment_5 ) ) ;
    public final void rule__TaskAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1767:1: ( ( ( rule__TaskAssignment__IsDoneAssignment_5 ) ) )
            // InternalWarehouseModelling.g:1768:1: ( ( rule__TaskAssignment__IsDoneAssignment_5 ) )
            {
            // InternalWarehouseModelling.g:1768:1: ( ( rule__TaskAssignment__IsDoneAssignment_5 ) )
            // InternalWarehouseModelling.g:1769:2: ( rule__TaskAssignment__IsDoneAssignment_5 )
            {
             before(grammarAccess.getTaskAssignmentAccess().getIsDoneAssignment_5()); 
            // InternalWarehouseModelling.g:1770:2: ( rule__TaskAssignment__IsDoneAssignment_5 )
            // InternalWarehouseModelling.g:1770:3: rule__TaskAssignment__IsDoneAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TaskAssignment__IsDoneAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTaskAssignmentAccess().getIsDoneAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__Group__5__Impl"


    // $ANTLR start "rule__Availability__Group__0"
    // InternalWarehouseModelling.g:1779:1: rule__Availability__Group__0 : rule__Availability__Group__0__Impl rule__Availability__Group__1 ;
    public final void rule__Availability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1783:1: ( rule__Availability__Group__0__Impl rule__Availability__Group__1 )
            // InternalWarehouseModelling.g:1784:2: rule__Availability__Group__0__Impl rule__Availability__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Availability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Availability__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__Group__0"


    // $ANTLR start "rule__Availability__Group__0__Impl"
    // InternalWarehouseModelling.g:1791:1: rule__Availability__Group__0__Impl : ( 'Availability' ) ;
    public final void rule__Availability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1795:1: ( ( 'Availability' ) )
            // InternalWarehouseModelling.g:1796:1: ( 'Availability' )
            {
            // InternalWarehouseModelling.g:1796:1: ( 'Availability' )
            // InternalWarehouseModelling.g:1797:2: 'Availability'
            {
             before(grammarAccess.getAvailabilityAccess().getAvailabilityKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAvailabilityAccess().getAvailabilityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__Group__0__Impl"


    // $ANTLR start "rule__Availability__Group__1"
    // InternalWarehouseModelling.g:1806:1: rule__Availability__Group__1 : rule__Availability__Group__1__Impl rule__Availability__Group__2 ;
    public final void rule__Availability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1810:1: ( rule__Availability__Group__1__Impl rule__Availability__Group__2 )
            // InternalWarehouseModelling.g:1811:2: rule__Availability__Group__1__Impl rule__Availability__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Availability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Availability__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__Group__1"


    // $ANTLR start "rule__Availability__Group__1__Impl"
    // InternalWarehouseModelling.g:1818:1: rule__Availability__Group__1__Impl : ( 'from' ) ;
    public final void rule__Availability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1822:1: ( ( 'from' ) )
            // InternalWarehouseModelling.g:1823:1: ( 'from' )
            {
            // InternalWarehouseModelling.g:1823:1: ( 'from' )
            // InternalWarehouseModelling.g:1824:2: 'from'
            {
             before(grammarAccess.getAvailabilityAccess().getFromKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAvailabilityAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__Group__1__Impl"


    // $ANTLR start "rule__Availability__Group__2"
    // InternalWarehouseModelling.g:1833:1: rule__Availability__Group__2 : rule__Availability__Group__2__Impl rule__Availability__Group__3 ;
    public final void rule__Availability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1837:1: ( rule__Availability__Group__2__Impl rule__Availability__Group__3 )
            // InternalWarehouseModelling.g:1838:2: rule__Availability__Group__2__Impl rule__Availability__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Availability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Availability__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__Group__2"


    // $ANTLR start "rule__Availability__Group__2__Impl"
    // InternalWarehouseModelling.g:1845:1: rule__Availability__Group__2__Impl : ( ( rule__Availability__StartTimeAssignment_2 ) ) ;
    public final void rule__Availability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1849:1: ( ( ( rule__Availability__StartTimeAssignment_2 ) ) )
            // InternalWarehouseModelling.g:1850:1: ( ( rule__Availability__StartTimeAssignment_2 ) )
            {
            // InternalWarehouseModelling.g:1850:1: ( ( rule__Availability__StartTimeAssignment_2 ) )
            // InternalWarehouseModelling.g:1851:2: ( rule__Availability__StartTimeAssignment_2 )
            {
             before(grammarAccess.getAvailabilityAccess().getStartTimeAssignment_2()); 
            // InternalWarehouseModelling.g:1852:2: ( rule__Availability__StartTimeAssignment_2 )
            // InternalWarehouseModelling.g:1852:3: rule__Availability__StartTimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Availability__StartTimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAvailabilityAccess().getStartTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__Group__2__Impl"


    // $ANTLR start "rule__Availability__Group__3"
    // InternalWarehouseModelling.g:1860:1: rule__Availability__Group__3 : rule__Availability__Group__3__Impl rule__Availability__Group__4 ;
    public final void rule__Availability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1864:1: ( rule__Availability__Group__3__Impl rule__Availability__Group__4 )
            // InternalWarehouseModelling.g:1865:2: rule__Availability__Group__3__Impl rule__Availability__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Availability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Availability__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__Group__3"


    // $ANTLR start "rule__Availability__Group__3__Impl"
    // InternalWarehouseModelling.g:1872:1: rule__Availability__Group__3__Impl : ( 'to' ) ;
    public final void rule__Availability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1876:1: ( ( 'to' ) )
            // InternalWarehouseModelling.g:1877:1: ( 'to' )
            {
            // InternalWarehouseModelling.g:1877:1: ( 'to' )
            // InternalWarehouseModelling.g:1878:2: 'to'
            {
             before(grammarAccess.getAvailabilityAccess().getToKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAvailabilityAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__Group__3__Impl"


    // $ANTLR start "rule__Availability__Group__4"
    // InternalWarehouseModelling.g:1887:1: rule__Availability__Group__4 : rule__Availability__Group__4__Impl ;
    public final void rule__Availability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1891:1: ( rule__Availability__Group__4__Impl )
            // InternalWarehouseModelling.g:1892:2: rule__Availability__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Availability__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__Group__4"


    // $ANTLR start "rule__Availability__Group__4__Impl"
    // InternalWarehouseModelling.g:1898:1: rule__Availability__Group__4__Impl : ( ( rule__Availability__EndTimeAssignment_4 ) ) ;
    public final void rule__Availability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1902:1: ( ( ( rule__Availability__EndTimeAssignment_4 ) ) )
            // InternalWarehouseModelling.g:1903:1: ( ( rule__Availability__EndTimeAssignment_4 ) )
            {
            // InternalWarehouseModelling.g:1903:1: ( ( rule__Availability__EndTimeAssignment_4 ) )
            // InternalWarehouseModelling.g:1904:2: ( rule__Availability__EndTimeAssignment_4 )
            {
             before(grammarAccess.getAvailabilityAccess().getEndTimeAssignment_4()); 
            // InternalWarehouseModelling.g:1905:2: ( rule__Availability__EndTimeAssignment_4 )
            // InternalWarehouseModelling.g:1905:3: rule__Availability__EndTimeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Availability__EndTimeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAvailabilityAccess().getEndTimeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__Group__4__Impl"


    // $ANTLR start "rule__WarehouseManagement__CompaniesAssignment"
    // InternalWarehouseModelling.g:1914:1: rule__WarehouseManagement__CompaniesAssignment : ( ruleCompany ) ;
    public final void rule__WarehouseManagement__CompaniesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1918:1: ( ( ruleCompany ) )
            // InternalWarehouseModelling.g:1919:2: ( ruleCompany )
            {
            // InternalWarehouseModelling.g:1919:2: ( ruleCompany )
            // InternalWarehouseModelling.g:1920:3: ruleCompany
            {
             before(grammarAccess.getWarehouseManagementAccess().getCompaniesCompanyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCompany();

            state._fsp--;

             after(grammarAccess.getWarehouseManagementAccess().getCompaniesCompanyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WarehouseManagement__CompaniesAssignment"


    // $ANTLR start "rule__Company__NameAssignment_1"
    // InternalWarehouseModelling.g:1929:1: rule__Company__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Company__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1933:1: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:1934:2: ( RULE_ID )
            {
            // InternalWarehouseModelling.g:1934:2: ( RULE_ID )
            // InternalWarehouseModelling.g:1935:3: RULE_ID
            {
             before(grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__NameAssignment_1"


    // $ANTLR start "rule__Company__AddressAssignment_2"
    // InternalWarehouseModelling.g:1944:1: rule__Company__AddressAssignment_2 : ( RULE_ID ) ;
    public final void rule__Company__AddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1948:1: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:1949:2: ( RULE_ID )
            {
            // InternalWarehouseModelling.g:1949:2: ( RULE_ID )
            // InternalWarehouseModelling.g:1950:3: RULE_ID
            {
             before(grammarAccess.getCompanyAccess().getAddressIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getAddressIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__AddressAssignment_2"


    // $ANTLR start "rule__Company__WarehousesAssignment_4"
    // InternalWarehouseModelling.g:1959:1: rule__Company__WarehousesAssignment_4 : ( ruleWarehouse ) ;
    public final void rule__Company__WarehousesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1963:1: ( ( ruleWarehouse ) )
            // InternalWarehouseModelling.g:1964:2: ( ruleWarehouse )
            {
            // InternalWarehouseModelling.g:1964:2: ( ruleWarehouse )
            // InternalWarehouseModelling.g:1965:3: ruleWarehouse
            {
             before(grammarAccess.getCompanyAccess().getWarehousesWarehouseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWarehouse();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getWarehousesWarehouseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__WarehousesAssignment_4"


    // $ANTLR start "rule__Company__TeamsAssignment_6"
    // InternalWarehouseModelling.g:1974:1: rule__Company__TeamsAssignment_6 : ( ruleTeam ) ;
    public final void rule__Company__TeamsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1978:1: ( ( ruleTeam ) )
            // InternalWarehouseModelling.g:1979:2: ( ruleTeam )
            {
            // InternalWarehouseModelling.g:1979:2: ( ruleTeam )
            // InternalWarehouseModelling.g:1980:3: ruleTeam
            {
             before(grammarAccess.getCompanyAccess().getTeamsTeamParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getTeamsTeamParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__TeamsAssignment_6"


    // $ANTLR start "rule__Company__TasksAssignment_8"
    // InternalWarehouseModelling.g:1989:1: rule__Company__TasksAssignment_8 : ( ruleTask ) ;
    public final void rule__Company__TasksAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:1993:1: ( ( ruleTask ) )
            // InternalWarehouseModelling.g:1994:2: ( ruleTask )
            {
            // InternalWarehouseModelling.g:1994:2: ( ruleTask )
            // InternalWarehouseModelling.g:1995:3: ruleTask
            {
             before(grammarAccess.getCompanyAccess().getTasksTaskParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getTasksTaskParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__TasksAssignment_8"


    // $ANTLR start "rule__Warehouse__NameAssignment_1"
    // InternalWarehouseModelling.g:2004:1: rule__Warehouse__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Warehouse__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2008:1: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2009:2: ( RULE_ID )
            {
            // InternalWarehouseModelling.g:2009:2: ( RULE_ID )
            // InternalWarehouseModelling.g:2010:3: RULE_ID
            {
             before(grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__NameAssignment_1"


    // $ANTLR start "rule__Warehouse__WorkersAssignment_3"
    // InternalWarehouseModelling.g:2019:1: rule__Warehouse__WorkersAssignment_3 : ( rulePerson ) ;
    public final void rule__Warehouse__WorkersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2023:1: ( ( rulePerson ) )
            // InternalWarehouseModelling.g:2024:2: ( rulePerson )
            {
            // InternalWarehouseModelling.g:2024:2: ( rulePerson )
            // InternalWarehouseModelling.g:2025:3: rulePerson
            {
             before(grammarAccess.getWarehouseAccess().getWorkersPersonParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getWarehouseAccess().getWorkersPersonParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__WorkersAssignment_3"


    // $ANTLR start "rule__Team__NameAssignment_1"
    // InternalWarehouseModelling.g:2034:1: rule__Team__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Team__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2038:1: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2039:2: ( RULE_ID )
            {
            // InternalWarehouseModelling.g:2039:2: ( RULE_ID )
            // InternalWarehouseModelling.g:2040:3: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Team__NameAssignment_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalWarehouseModelling.g:2049:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2053:1: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2054:2: ( RULE_ID )
            {
            // InternalWarehouseModelling.g:2054:2: ( RULE_ID )
            // InternalWarehouseModelling.g:2055:3: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Person__RolesAssignment_5"
    // InternalWarehouseModelling.g:2064:1: rule__Person__RolesAssignment_5 : ( ruleRole ) ;
    public final void rule__Person__RolesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2068:1: ( ( ruleRole ) )
            // InternalWarehouseModelling.g:2069:2: ( ruleRole )
            {
            // InternalWarehouseModelling.g:2069:2: ( ruleRole )
            // InternalWarehouseModelling.g:2070:3: ruleRole
            {
             before(grammarAccess.getPersonAccess().getRolesRoleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getRolesRoleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__RolesAssignment_5"


    // $ANTLR start "rule__Person__RolesAssignment_6_1"
    // InternalWarehouseModelling.g:2079:1: rule__Person__RolesAssignment_6_1 : ( ruleRole ) ;
    public final void rule__Person__RolesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2083:1: ( ( ruleRole ) )
            // InternalWarehouseModelling.g:2084:2: ( ruleRole )
            {
            // InternalWarehouseModelling.g:2084:2: ( ruleRole )
            // InternalWarehouseModelling.g:2085:3: ruleRole
            {
             before(grammarAccess.getPersonAccess().getRolesRoleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getRolesRoleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__RolesAssignment_6_1"


    // $ANTLR start "rule__Employee__IdAssignment_1"
    // InternalWarehouseModelling.g:2094:1: rule__Employee__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Employee__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2098:1: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2099:2: ( RULE_ID )
            {
            // InternalWarehouseModelling.g:2099:2: ( RULE_ID )
            // InternalWarehouseModelling.g:2100:3: RULE_ID
            {
             before(grammarAccess.getEmployeeAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__IdAssignment_1"


    // $ANTLR start "rule__Employee__StartDateAssignment_2"
    // InternalWarehouseModelling.g:2109:1: rule__Employee__StartDateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Employee__StartDateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2113:1: ( ( RULE_STRING ) )
            // InternalWarehouseModelling.g:2114:2: ( RULE_STRING )
            {
            // InternalWarehouseModelling.g:2114:2: ( RULE_STRING )
            // InternalWarehouseModelling.g:2115:3: RULE_STRING
            {
             before(grammarAccess.getEmployeeAccess().getStartDateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getStartDateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__StartDateAssignment_2"


    // $ANTLR start "rule__Employee__EndDateAssignment_3"
    // InternalWarehouseModelling.g:2124:1: rule__Employee__EndDateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Employee__EndDateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2128:1: ( ( RULE_STRING ) )
            // InternalWarehouseModelling.g:2129:2: ( RULE_STRING )
            {
            // InternalWarehouseModelling.g:2129:2: ( RULE_STRING )
            // InternalWarehouseModelling.g:2130:3: RULE_STRING
            {
             before(grammarAccess.getEmployeeAccess().getEndDateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getEndDateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__EndDateAssignment_3"


    // $ANTLR start "rule__Employee__AvailabilitiesAssignment_6"
    // InternalWarehouseModelling.g:2139:1: rule__Employee__AvailabilitiesAssignment_6 : ( ruleAvailability ) ;
    public final void rule__Employee__AvailabilitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2143:1: ( ( ruleAvailability ) )
            // InternalWarehouseModelling.g:2144:2: ( ruleAvailability )
            {
            // InternalWarehouseModelling.g:2144:2: ( ruleAvailability )
            // InternalWarehouseModelling.g:2145:3: ruleAvailability
            {
             before(grammarAccess.getEmployeeAccess().getAvailabilitiesAvailabilityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAvailability();

            state._fsp--;

             after(grammarAccess.getEmployeeAccess().getAvailabilitiesAvailabilityParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__AvailabilitiesAssignment_6"


    // $ANTLR start "rule__Employee__AvailabilitiesAssignment_7_1"
    // InternalWarehouseModelling.g:2154:1: rule__Employee__AvailabilitiesAssignment_7_1 : ( ruleAvailability ) ;
    public final void rule__Employee__AvailabilitiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2158:1: ( ( ruleAvailability ) )
            // InternalWarehouseModelling.g:2159:2: ( ruleAvailability )
            {
            // InternalWarehouseModelling.g:2159:2: ( ruleAvailability )
            // InternalWarehouseModelling.g:2160:3: ruleAvailability
            {
             before(grammarAccess.getEmployeeAccess().getAvailabilitiesAvailabilityParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAvailability();

            state._fsp--;

             after(grammarAccess.getEmployeeAccess().getAvailabilitiesAvailabilityParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__AvailabilitiesAssignment_7_1"


    // $ANTLR start "rule__Manager__IdAssignment_1"
    // InternalWarehouseModelling.g:2169:1: rule__Manager__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Manager__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2173:1: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2174:2: ( RULE_ID )
            {
            // InternalWarehouseModelling.g:2174:2: ( RULE_ID )
            // InternalWarehouseModelling.g:2175:3: RULE_ID
            {
             before(grammarAccess.getManagerAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__IdAssignment_1"


    // $ANTLR start "rule__Manager__StartDateAssignment_2"
    // InternalWarehouseModelling.g:2184:1: rule__Manager__StartDateAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Manager__StartDateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2188:1: ( ( RULE_STRING ) )
            // InternalWarehouseModelling.g:2189:2: ( RULE_STRING )
            {
            // InternalWarehouseModelling.g:2189:2: ( RULE_STRING )
            // InternalWarehouseModelling.g:2190:3: RULE_STRING
            {
             before(grammarAccess.getManagerAccess().getStartDateSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getStartDateSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__StartDateAssignment_2"


    // $ANTLR start "rule__Manager__EndDateAssignment_3"
    // InternalWarehouseModelling.g:2199:1: rule__Manager__EndDateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Manager__EndDateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2203:1: ( ( RULE_STRING ) )
            // InternalWarehouseModelling.g:2204:2: ( RULE_STRING )
            {
            // InternalWarehouseModelling.g:2204:2: ( RULE_STRING )
            // InternalWarehouseModelling.g:2205:3: RULE_STRING
            {
             before(grammarAccess.getManagerAccess().getEndDateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getEndDateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__EndDateAssignment_3"


    // $ANTLR start "rule__Manager__ManagesAssignment_6"
    // InternalWarehouseModelling.g:2214:1: rule__Manager__ManagesAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Manager__ManagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2218:1: ( ( ( RULE_ID ) ) )
            // InternalWarehouseModelling.g:2219:2: ( ( RULE_ID ) )
            {
            // InternalWarehouseModelling.g:2219:2: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2220:3: ( RULE_ID )
            {
             before(grammarAccess.getManagerAccess().getManagesTeamCrossReference_6_0()); 
            // InternalWarehouseModelling.g:2221:3: ( RULE_ID )
            // InternalWarehouseModelling.g:2222:4: RULE_ID
            {
             before(grammarAccess.getManagerAccess().getManagesTeamIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getManagesTeamIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getManagerAccess().getManagesTeamCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manager__ManagesAssignment_6"


    // $ANTLR start "rule__Task__IdAssignment_1"
    // InternalWarehouseModelling.g:2233:1: rule__Task__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2237:1: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2238:2: ( RULE_ID )
            {
            // InternalWarehouseModelling.g:2238:2: ( RULE_ID )
            // InternalWarehouseModelling.g:2239:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__IdAssignment_1"


    // $ANTLR start "rule__Task__DescriptionAssignment_2"
    // InternalWarehouseModelling.g:2248:1: rule__Task__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Task__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2252:1: ( ( RULE_STRING ) )
            // InternalWarehouseModelling.g:2253:2: ( RULE_STRING )
            {
            // InternalWarehouseModelling.g:2253:2: ( RULE_STRING )
            // InternalWarehouseModelling.g:2254:3: RULE_STRING
            {
             before(grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DescriptionAssignment_2"


    // $ANTLR start "rule__Task__AssignmentAssignment_3"
    // InternalWarehouseModelling.g:2263:1: rule__Task__AssignmentAssignment_3 : ( ruleTaskAssignment ) ;
    public final void rule__Task__AssignmentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2267:1: ( ( ruleTaskAssignment ) )
            // InternalWarehouseModelling.g:2268:2: ( ruleTaskAssignment )
            {
            // InternalWarehouseModelling.g:2268:2: ( ruleTaskAssignment )
            // InternalWarehouseModelling.g:2269:3: ruleTaskAssignment
            {
             before(grammarAccess.getTaskAccess().getAssignmentTaskAssignmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskAssignment();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getAssignmentTaskAssignmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__AssignmentAssignment_3"


    // $ANTLR start "rule__TaskAssignment__RoleAssignment_2"
    // InternalWarehouseModelling.g:2278:1: rule__TaskAssignment__RoleAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TaskAssignment__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2282:1: ( ( ( RULE_ID ) ) )
            // InternalWarehouseModelling.g:2283:2: ( ( RULE_ID ) )
            {
            // InternalWarehouseModelling.g:2283:2: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2284:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAssignmentAccess().getRoleRoleCrossReference_2_0()); 
            // InternalWarehouseModelling.g:2285:3: ( RULE_ID )
            // InternalWarehouseModelling.g:2286:4: RULE_ID
            {
             before(grammarAccess.getTaskAssignmentAccess().getRoleRoleIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAssignmentAccess().getRoleRoleIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTaskAssignmentAccess().getRoleRoleCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__RoleAssignment_2"


    // $ANTLR start "rule__TaskAssignment__AvailabilityAssignment_4"
    // InternalWarehouseModelling.g:2297:1: rule__TaskAssignment__AvailabilityAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__TaskAssignment__AvailabilityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2301:1: ( ( ( RULE_ID ) ) )
            // InternalWarehouseModelling.g:2302:2: ( ( RULE_ID ) )
            {
            // InternalWarehouseModelling.g:2302:2: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2303:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAssignmentAccess().getAvailabilityAvailabilityCrossReference_4_0()); 
            // InternalWarehouseModelling.g:2304:3: ( RULE_ID )
            // InternalWarehouseModelling.g:2305:4: RULE_ID
            {
             before(grammarAccess.getTaskAssignmentAccess().getAvailabilityAvailabilityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAssignmentAccess().getAvailabilityAvailabilityIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTaskAssignmentAccess().getAvailabilityAvailabilityCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__AvailabilityAssignment_4"


    // $ANTLR start "rule__TaskAssignment__IsDoneAssignment_5"
    // InternalWarehouseModelling.g:2316:1: rule__TaskAssignment__IsDoneAssignment_5 : ( ( 'Completed' ) ) ;
    public final void rule__TaskAssignment__IsDoneAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2320:1: ( ( ( 'Completed' ) ) )
            // InternalWarehouseModelling.g:2321:2: ( ( 'Completed' ) )
            {
            // InternalWarehouseModelling.g:2321:2: ( ( 'Completed' ) )
            // InternalWarehouseModelling.g:2322:3: ( 'Completed' )
            {
             before(grammarAccess.getTaskAssignmentAccess().getIsDoneCompletedKeyword_5_0()); 
            // InternalWarehouseModelling.g:2323:3: ( 'Completed' )
            // InternalWarehouseModelling.g:2324:4: 'Completed'
            {
             before(grammarAccess.getTaskAssignmentAccess().getIsDoneCompletedKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTaskAssignmentAccess().getIsDoneCompletedKeyword_5_0()); 

            }

             after(grammarAccess.getTaskAssignmentAccess().getIsDoneCompletedKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskAssignment__IsDoneAssignment_5"


    // $ANTLR start "rule__Availability__StartTimeAssignment_2"
    // InternalWarehouseModelling.g:2335:1: rule__Availability__StartTimeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Availability__StartTimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2339:1: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2340:2: ( RULE_ID )
            {
            // InternalWarehouseModelling.g:2340:2: ( RULE_ID )
            // InternalWarehouseModelling.g:2341:3: RULE_ID
            {
             before(grammarAccess.getAvailabilityAccess().getStartTimeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAvailabilityAccess().getStartTimeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__StartTimeAssignment_2"


    // $ANTLR start "rule__Availability__EndTimeAssignment_4"
    // InternalWarehouseModelling.g:2350:1: rule__Availability__EndTimeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Availability__EndTimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWarehouseModelling.g:2354:1: ( ( RULE_ID ) )
            // InternalWarehouseModelling.g:2355:2: ( RULE_ID )
            {
            // InternalWarehouseModelling.g:2355:2: ( RULE_ID )
            // InternalWarehouseModelling.g:2356:3: RULE_ID
            {
             before(grammarAccess.getAvailabilityAccess().getEndTimeIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAvailabilityAccess().getEndTimeIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Availability__EndTimeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});

}
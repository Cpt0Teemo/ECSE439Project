package org.xtext.example.wh.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.wh.services.WHGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWHParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Company'", "'Warehouses:'", "'Teams:'", "'Tasks:'", "'Warehouse'", "'{'", "'}'", "'Team'", "'Person'", "'with'", "'roles'", "'['", "','", "']'", "'Employee'", "'available'", "'for'", "'Manager'", "'of'", "'team'", "'Task'", "'Assignment'", "'to'", "'during'", "'Completed'", "'Availability'", "'from'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
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


        public InternalWHParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWHParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWHParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWH.g"; }



     	private WHGrammarAccess grammarAccess;

        public InternalWHParser(TokenStream input, WHGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "WarehouseManagement";
       	}

       	@Override
       	protected WHGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWarehouseManagement"
    // InternalWH.g:64:1: entryRuleWarehouseManagement returns [EObject current=null] : iv_ruleWarehouseManagement= ruleWarehouseManagement EOF ;
    public final EObject entryRuleWarehouseManagement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWarehouseManagement = null;


        try {
            // InternalWH.g:64:60: (iv_ruleWarehouseManagement= ruleWarehouseManagement EOF )
            // InternalWH.g:65:2: iv_ruleWarehouseManagement= ruleWarehouseManagement EOF
            {
             newCompositeNode(grammarAccess.getWarehouseManagementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWarehouseManagement=ruleWarehouseManagement();

            state._fsp--;

             current =iv_ruleWarehouseManagement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWarehouseManagement"


    // $ANTLR start "ruleWarehouseManagement"
    // InternalWH.g:71:1: ruleWarehouseManagement returns [EObject current=null] : ( (lv_companies_0_0= ruleCompany ) )* ;
    public final EObject ruleWarehouseManagement() throws RecognitionException {
        EObject current = null;

        EObject lv_companies_0_0 = null;



        	enterRule();

        try {
            // InternalWH.g:77:2: ( ( (lv_companies_0_0= ruleCompany ) )* )
            // InternalWH.g:78:2: ( (lv_companies_0_0= ruleCompany ) )*
            {
            // InternalWH.g:78:2: ( (lv_companies_0_0= ruleCompany ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWH.g:79:3: (lv_companies_0_0= ruleCompany )
            	    {
            	    // InternalWH.g:79:3: (lv_companies_0_0= ruleCompany )
            	    // InternalWH.g:80:4: lv_companies_0_0= ruleCompany
            	    {

            	    				newCompositeNode(grammarAccess.getWarehouseManagementAccess().getCompaniesCompanyParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_companies_0_0=ruleCompany();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getWarehouseManagementRule());
            	    				}
            	    				add(
            	    					current,
            	    					"companies",
            	    					lv_companies_0_0,
            	    					"org.xtext.example.wh.WH.Company");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWarehouseManagement"


    // $ANTLR start "entryRuleCompany"
    // InternalWH.g:100:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalWH.g:100:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalWH.g:101:2: iv_ruleCompany= ruleCompany EOF
            {
             newCompositeNode(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompany=ruleCompany();

            state._fsp--;

             current =iv_ruleCompany; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalWH.g:107:1: ruleCompany returns [EObject current=null] : (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_address_2_0= RULE_STRING ) ) otherlv_3= 'Warehouses:' ( (lv_warehouses_4_0= ruleWarehouse ) )* otherlv_5= 'Teams:' ( (lv_teams_6_0= ruleTeam ) )* otherlv_7= 'Tasks:' ( (lv_tasks_8_0= ruleTask ) )* ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_address_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_warehouses_4_0 = null;

        EObject lv_teams_6_0 = null;

        EObject lv_tasks_8_0 = null;



        	enterRule();

        try {
            // InternalWH.g:113:2: ( (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_address_2_0= RULE_STRING ) ) otherlv_3= 'Warehouses:' ( (lv_warehouses_4_0= ruleWarehouse ) )* otherlv_5= 'Teams:' ( (lv_teams_6_0= ruleTeam ) )* otherlv_7= 'Tasks:' ( (lv_tasks_8_0= ruleTask ) )* ) )
            // InternalWH.g:114:2: (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_address_2_0= RULE_STRING ) ) otherlv_3= 'Warehouses:' ( (lv_warehouses_4_0= ruleWarehouse ) )* otherlv_5= 'Teams:' ( (lv_teams_6_0= ruleTeam ) )* otherlv_7= 'Tasks:' ( (lv_tasks_8_0= ruleTask ) )* )
            {
            // InternalWH.g:114:2: (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_address_2_0= RULE_STRING ) ) otherlv_3= 'Warehouses:' ( (lv_warehouses_4_0= ruleWarehouse ) )* otherlv_5= 'Teams:' ( (lv_teams_6_0= ruleTeam ) )* otherlv_7= 'Tasks:' ( (lv_tasks_8_0= ruleTask ) )* )
            // InternalWH.g:115:3: otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_address_2_0= RULE_STRING ) ) otherlv_3= 'Warehouses:' ( (lv_warehouses_4_0= ruleWarehouse ) )* otherlv_5= 'Teams:' ( (lv_teams_6_0= ruleTeam ) )* otherlv_7= 'Tasks:' ( (lv_tasks_8_0= ruleTask ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getCompanyKeyword_0());
            		
            // InternalWH.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWH.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWH.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalWH.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWH.g:137:3: ( (lv_address_2_0= RULE_STRING ) )
            // InternalWH.g:138:4: (lv_address_2_0= RULE_STRING )
            {
            // InternalWH.g:138:4: (lv_address_2_0= RULE_STRING )
            // InternalWH.g:139:5: lv_address_2_0= RULE_STRING
            {
            lv_address_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_address_2_0, grammarAccess.getCompanyAccess().getAddressSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"address",
            						lv_address_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCompanyAccess().getWarehousesKeyword_3());
            		
            // InternalWH.g:159:3: ( (lv_warehouses_4_0= ruleWarehouse ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWH.g:160:4: (lv_warehouses_4_0= ruleWarehouse )
            	    {
            	    // InternalWH.g:160:4: (lv_warehouses_4_0= ruleWarehouse )
            	    // InternalWH.g:161:5: lv_warehouses_4_0= ruleWarehouse
            	    {

            	    					newCompositeNode(grammarAccess.getCompanyAccess().getWarehousesWarehouseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_warehouses_4_0=ruleWarehouse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"warehouses",
            	    						lv_warehouses_4_0,
            	    						"org.xtext.example.wh.WH.Warehouse");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getCompanyAccess().getTeamsKeyword_5());
            		
            // InternalWH.g:182:3: ( (lv_teams_6_0= ruleTeam ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWH.g:183:4: (lv_teams_6_0= ruleTeam )
            	    {
            	    // InternalWH.g:183:4: (lv_teams_6_0= ruleTeam )
            	    // InternalWH.g:184:5: lv_teams_6_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getCompanyAccess().getTeamsTeamParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_teams_6_0=ruleTeam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"teams",
            	    						lv_teams_6_0,
            	    						"org.xtext.example.wh.WH.Team");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getCompanyAccess().getTasksKeyword_7());
            		
            // InternalWH.g:205:3: ( (lv_tasks_8_0= ruleTask ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWH.g:206:4: (lv_tasks_8_0= ruleTask )
            	    {
            	    // InternalWH.g:206:4: (lv_tasks_8_0= ruleTask )
            	    // InternalWH.g:207:5: lv_tasks_8_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getCompanyAccess().getTasksTaskParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tasks_8_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_8_0,
            	    						"org.xtext.example.wh.WH.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleWarehouse"
    // InternalWH.g:228:1: entryRuleWarehouse returns [EObject current=null] : iv_ruleWarehouse= ruleWarehouse EOF ;
    public final EObject entryRuleWarehouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWarehouse = null;


        try {
            // InternalWH.g:228:50: (iv_ruleWarehouse= ruleWarehouse EOF )
            // InternalWH.g:229:2: iv_ruleWarehouse= ruleWarehouse EOF
            {
             newCompositeNode(grammarAccess.getWarehouseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWarehouse=ruleWarehouse();

            state._fsp--;

             current =iv_ruleWarehouse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWarehouse"


    // $ANTLR start "ruleWarehouse"
    // InternalWH.g:235:1: ruleWarehouse returns [EObject current=null] : (otherlv_0= 'Warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workers_3_0= rulePerson ) )* otherlv_4= '}' ) ;
    public final EObject ruleWarehouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_workers_3_0 = null;



        	enterRule();

        try {
            // InternalWH.g:241:2: ( (otherlv_0= 'Warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workers_3_0= rulePerson ) )* otherlv_4= '}' ) )
            // InternalWH.g:242:2: (otherlv_0= 'Warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workers_3_0= rulePerson ) )* otherlv_4= '}' )
            {
            // InternalWH.g:242:2: (otherlv_0= 'Warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workers_3_0= rulePerson ) )* otherlv_4= '}' )
            // InternalWH.g:243:3: otherlv_0= 'Warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workers_3_0= rulePerson ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWarehouseAccess().getWarehouseKeyword_0());
            		
            // InternalWH.g:247:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWH.g:248:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWH.g:248:4: (lv_name_1_0= RULE_ID )
            // InternalWH.g:249:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWarehouseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWH.g:269:3: ( (lv_workers_3_0= rulePerson ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWH.g:270:4: (lv_workers_3_0= rulePerson )
            	    {
            	    // InternalWH.g:270:4: (lv_workers_3_0= rulePerson )
            	    // InternalWH.g:271:5: lv_workers_3_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getWarehouseAccess().getWorkersPersonParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_workers_3_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWarehouseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"workers",
            	    						lv_workers_3_0,
            	    						"org.xtext.example.wh.WH.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWarehouse"


    // $ANTLR start "entryRuleTeam"
    // InternalWH.g:296:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalWH.g:296:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalWH.g:297:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalWH.g:303:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWH.g:309:2: ( (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWH.g:310:2: (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWH.g:310:2: (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWH.g:311:3: otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalWH.g:315:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWH.g:316:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWH.g:316:4: (lv_name_1_0= RULE_ID )
            // InternalWH.g:317:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRulePerson"
    // InternalWH.g:337:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalWH.g:337:47: (iv_rulePerson= rulePerson EOF )
            // InternalWH.g:338:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalWH.g:344:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'roles' otherlv_4= '[' ( (lv_roles_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_roles_7_0= ruleRole ) ) )* otherlv_8= ']' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_roles_5_0 = null;

        EObject lv_roles_7_0 = null;



        	enterRule();

        try {
            // InternalWH.g:350:2: ( (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'roles' otherlv_4= '[' ( (lv_roles_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_roles_7_0= ruleRole ) ) )* otherlv_8= ']' ) )
            // InternalWH.g:351:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'roles' otherlv_4= '[' ( (lv_roles_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_roles_7_0= ruleRole ) ) )* otherlv_8= ']' )
            {
            // InternalWH.g:351:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'roles' otherlv_4= '[' ( (lv_roles_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_roles_7_0= ruleRole ) ) )* otherlv_8= ']' )
            // InternalWH.g:352:3: otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'roles' otherlv_4= '[' ( (lv_roles_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_roles_7_0= ruleRole ) ) )* otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalWH.g:356:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWH.g:357:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWH.g:357:4: (lv_name_1_0= RULE_ID )
            // InternalWH.g:358:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getRolesKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalWH.g:386:3: ( (lv_roles_5_0= ruleRole ) )
            // InternalWH.g:387:4: (lv_roles_5_0= ruleRole )
            {
            // InternalWH.g:387:4: (lv_roles_5_0= ruleRole )
            // InternalWH.g:388:5: lv_roles_5_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getRolesRoleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_roles_5_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_5_0,
            						"org.xtext.example.wh.WH.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWH.g:405:3: (otherlv_6= ',' ( (lv_roles_7_0= ruleRole ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWH.g:406:4: otherlv_6= ',' ( (lv_roles_7_0= ruleRole ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FOLLOW_15); 

            	    				newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalWH.g:410:4: ( (lv_roles_7_0= ruleRole ) )
            	    // InternalWH.g:411:5: (lv_roles_7_0= ruleRole )
            	    {
            	    // InternalWH.g:411:5: (lv_roles_7_0= ruleRole )
            	    // InternalWH.g:412:6: lv_roles_7_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getPersonAccess().getRolesRoleParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_roles_7_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPersonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"roles",
            	    							lv_roles_7_0,
            	    							"org.xtext.example.wh.WH.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getRightSquareBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleRole"
    // InternalWH.g:438:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalWH.g:438:45: (iv_ruleRole= ruleRole EOF )
            // InternalWH.g:439:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalWH.g:445:1: ruleRole returns [EObject current=null] : (this_Employee_0= ruleEmployee | this_Manager_1= ruleManager ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_Employee_0 = null;

        EObject this_Manager_1 = null;



        	enterRule();

        try {
            // InternalWH.g:451:2: ( (this_Employee_0= ruleEmployee | this_Manager_1= ruleManager ) )
            // InternalWH.g:452:2: (this_Employee_0= ruleEmployee | this_Manager_1= ruleManager )
            {
            // InternalWH.g:452:2: (this_Employee_0= ruleEmployee | this_Manager_1= ruleManager )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalWH.g:453:3: this_Employee_0= ruleEmployee
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getEmployeeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Employee_0=ruleEmployee();

                    state._fsp--;


                    			current = this_Employee_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWH.g:462:3: this_Manager_1= ruleManager
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getManagerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Manager_1=ruleManager();

                    state._fsp--;


                    			current = this_Manager_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleEmployee"
    // InternalWH.g:474:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalWH.g:474:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalWH.g:475:2: iv_ruleEmployee= ruleEmployee EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployee=ruleEmployee();

            state._fsp--;

             current =iv_ruleEmployee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalWH.g:481:1: ruleEmployee returns [EObject current=null] : (otherlv_0= 'Employee' ( (lv_employeeId_1_0= RULE_ID ) ) ( (lv_startDate_2_0= RULE_STRING ) ) ( (lv_endDate_3_0= RULE_STRING ) ) otherlv_4= 'available' otherlv_5= 'for' ( (lv_availabilities_6_0= ruleAvailability ) ) (otherlv_7= ',' ( (lv_availabilities_8_0= ruleAvailability ) ) )* ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_employeeId_1_0=null;
        Token lv_startDate_2_0=null;
        Token lv_endDate_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_availabilities_6_0 = null;

        EObject lv_availabilities_8_0 = null;



        	enterRule();

        try {
            // InternalWH.g:487:2: ( (otherlv_0= 'Employee' ( (lv_employeeId_1_0= RULE_ID ) ) ( (lv_startDate_2_0= RULE_STRING ) ) ( (lv_endDate_3_0= RULE_STRING ) ) otherlv_4= 'available' otherlv_5= 'for' ( (lv_availabilities_6_0= ruleAvailability ) ) (otherlv_7= ',' ( (lv_availabilities_8_0= ruleAvailability ) ) )* ) )
            // InternalWH.g:488:2: (otherlv_0= 'Employee' ( (lv_employeeId_1_0= RULE_ID ) ) ( (lv_startDate_2_0= RULE_STRING ) ) ( (lv_endDate_3_0= RULE_STRING ) ) otherlv_4= 'available' otherlv_5= 'for' ( (lv_availabilities_6_0= ruleAvailability ) ) (otherlv_7= ',' ( (lv_availabilities_8_0= ruleAvailability ) ) )* )
            {
            // InternalWH.g:488:2: (otherlv_0= 'Employee' ( (lv_employeeId_1_0= RULE_ID ) ) ( (lv_startDate_2_0= RULE_STRING ) ) ( (lv_endDate_3_0= RULE_STRING ) ) otherlv_4= 'available' otherlv_5= 'for' ( (lv_availabilities_6_0= ruleAvailability ) ) (otherlv_7= ',' ( (lv_availabilities_8_0= ruleAvailability ) ) )* )
            // InternalWH.g:489:3: otherlv_0= 'Employee' ( (lv_employeeId_1_0= RULE_ID ) ) ( (lv_startDate_2_0= RULE_STRING ) ) ( (lv_endDate_3_0= RULE_STRING ) ) otherlv_4= 'available' otherlv_5= 'for' ( (lv_availabilities_6_0= ruleAvailability ) ) (otherlv_7= ',' ( (lv_availabilities_8_0= ruleAvailability ) ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
            		
            // InternalWH.g:493:3: ( (lv_employeeId_1_0= RULE_ID ) )
            // InternalWH.g:494:4: (lv_employeeId_1_0= RULE_ID )
            {
            // InternalWH.g:494:4: (lv_employeeId_1_0= RULE_ID )
            // InternalWH.g:495:5: lv_employeeId_1_0= RULE_ID
            {
            lv_employeeId_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_employeeId_1_0, grammarAccess.getEmployeeAccess().getEmployeeIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"employeeId",
            						lv_employeeId_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWH.g:511:3: ( (lv_startDate_2_0= RULE_STRING ) )
            // InternalWH.g:512:4: (lv_startDate_2_0= RULE_STRING )
            {
            // InternalWH.g:512:4: (lv_startDate_2_0= RULE_STRING )
            // InternalWH.g:513:5: lv_startDate_2_0= RULE_STRING
            {
            lv_startDate_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_startDate_2_0, grammarAccess.getEmployeeAccess().getStartDateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalWH.g:529:3: ( (lv_endDate_3_0= RULE_STRING ) )
            // InternalWH.g:530:4: (lv_endDate_3_0= RULE_STRING )
            {
            // InternalWH.g:530:4: (lv_endDate_3_0= RULE_STRING )
            // InternalWH.g:531:5: lv_endDate_3_0= RULE_STRING
            {
            lv_endDate_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_endDate_3_0, grammarAccess.getEmployeeAccess().getEndDateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endDate",
            						lv_endDate_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getAvailableKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getEmployeeAccess().getForKeyword_5());
            		
            // InternalWH.g:555:3: ( (lv_availabilities_6_0= ruleAvailability ) )
            // InternalWH.g:556:4: (lv_availabilities_6_0= ruleAvailability )
            {
            // InternalWH.g:556:4: (lv_availabilities_6_0= ruleAvailability )
            // InternalWH.g:557:5: lv_availabilities_6_0= ruleAvailability
            {

            					newCompositeNode(grammarAccess.getEmployeeAccess().getAvailabilitiesAvailabilityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_availabilities_6_0=ruleAvailability();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmployeeRule());
            					}
            					add(
            						current,
            						"availabilities",
            						lv_availabilities_6_0,
            						"org.xtext.example.wh.WH.Availability");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWH.g:574:3: (otherlv_7= ',' ( (lv_availabilities_8_0= ruleAvailability ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==36) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalWH.g:575:4: otherlv_7= ',' ( (lv_availabilities_8_0= ruleAvailability ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_19); 

            	    				newLeafNode(otherlv_7, grammarAccess.getEmployeeAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalWH.g:579:4: ( (lv_availabilities_8_0= ruleAvailability ) )
            	    // InternalWH.g:580:5: (lv_availabilities_8_0= ruleAvailability )
            	    {
            	    // InternalWH.g:580:5: (lv_availabilities_8_0= ruleAvailability )
            	    // InternalWH.g:581:6: lv_availabilities_8_0= ruleAvailability
            	    {

            	    						newCompositeNode(grammarAccess.getEmployeeAccess().getAvailabilitiesAvailabilityParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_availabilities_8_0=ruleAvailability();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEmployeeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"availabilities",
            	    							lv_availabilities_8_0,
            	    							"org.xtext.example.wh.WH.Availability");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleManager"
    // InternalWH.g:603:1: entryRuleManager returns [EObject current=null] : iv_ruleManager= ruleManager EOF ;
    public final EObject entryRuleManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManager = null;


        try {
            // InternalWH.g:603:48: (iv_ruleManager= ruleManager EOF )
            // InternalWH.g:604:2: iv_ruleManager= ruleManager EOF
            {
             newCompositeNode(grammarAccess.getManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManager=ruleManager();

            state._fsp--;

             current =iv_ruleManager; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManager"


    // $ANTLR start "ruleManager"
    // InternalWH.g:610:1: ruleManager returns [EObject current=null] : (otherlv_0= 'Manager' ( (lv_employeeId_1_0= RULE_ID ) ) ( (lv_startDate_2_0= RULE_STRING ) ) ( (lv_endDate_3_0= RULE_STRING ) ) otherlv_4= 'of' otherlv_5= 'team' ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_employeeId_1_0=null;
        Token lv_startDate_2_0=null;
        Token lv_endDate_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalWH.g:616:2: ( (otherlv_0= 'Manager' ( (lv_employeeId_1_0= RULE_ID ) ) ( (lv_startDate_2_0= RULE_STRING ) ) ( (lv_endDate_3_0= RULE_STRING ) ) otherlv_4= 'of' otherlv_5= 'team' ( (otherlv_6= RULE_ID ) ) ) )
            // InternalWH.g:617:2: (otherlv_0= 'Manager' ( (lv_employeeId_1_0= RULE_ID ) ) ( (lv_startDate_2_0= RULE_STRING ) ) ( (lv_endDate_3_0= RULE_STRING ) ) otherlv_4= 'of' otherlv_5= 'team' ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalWH.g:617:2: (otherlv_0= 'Manager' ( (lv_employeeId_1_0= RULE_ID ) ) ( (lv_startDate_2_0= RULE_STRING ) ) ( (lv_endDate_3_0= RULE_STRING ) ) otherlv_4= 'of' otherlv_5= 'team' ( (otherlv_6= RULE_ID ) ) )
            // InternalWH.g:618:3: otherlv_0= 'Manager' ( (lv_employeeId_1_0= RULE_ID ) ) ( (lv_startDate_2_0= RULE_STRING ) ) ( (lv_endDate_3_0= RULE_STRING ) ) otherlv_4= 'of' otherlv_5= 'team' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getManagerAccess().getManagerKeyword_0());
            		
            // InternalWH.g:622:3: ( (lv_employeeId_1_0= RULE_ID ) )
            // InternalWH.g:623:4: (lv_employeeId_1_0= RULE_ID )
            {
            // InternalWH.g:623:4: (lv_employeeId_1_0= RULE_ID )
            // InternalWH.g:624:5: lv_employeeId_1_0= RULE_ID
            {
            lv_employeeId_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_employeeId_1_0, grammarAccess.getManagerAccess().getEmployeeIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManagerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"employeeId",
            						lv_employeeId_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWH.g:640:3: ( (lv_startDate_2_0= RULE_STRING ) )
            // InternalWH.g:641:4: (lv_startDate_2_0= RULE_STRING )
            {
            // InternalWH.g:641:4: (lv_startDate_2_0= RULE_STRING )
            // InternalWH.g:642:5: lv_startDate_2_0= RULE_STRING
            {
            lv_startDate_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_startDate_2_0, grammarAccess.getManagerAccess().getStartDateSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManagerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalWH.g:658:3: ( (lv_endDate_3_0= RULE_STRING ) )
            // InternalWH.g:659:4: (lv_endDate_3_0= RULE_STRING )
            {
            // InternalWH.g:659:4: (lv_endDate_3_0= RULE_STRING )
            // InternalWH.g:660:5: lv_endDate_3_0= RULE_STRING
            {
            lv_endDate_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_endDate_3_0, grammarAccess.getManagerAccess().getEndDateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManagerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endDate",
            						lv_endDate_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getManagerAccess().getOfKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getManagerAccess().getTeamKeyword_5());
            		
            // InternalWH.g:684:3: ( (otherlv_6= RULE_ID ) )
            // InternalWH.g:685:4: (otherlv_6= RULE_ID )
            {
            // InternalWH.g:685:4: (otherlv_6= RULE_ID )
            // InternalWH.g:686:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManagerRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getManagerAccess().getManagesTeamCrossReference_6_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManager"


    // $ANTLR start "entryRuleTask"
    // InternalWH.g:701:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalWH.g:701:45: (iv_ruleTask= ruleTask EOF )
            // InternalWH.g:702:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalWH.g:708:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_id_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (lv_assignment_3_0= ruleTaskAssignment ) )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_description_2_0=null;
        EObject lv_assignment_3_0 = null;



        	enterRule();

        try {
            // InternalWH.g:714:2: ( (otherlv_0= 'Task' ( (lv_id_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (lv_assignment_3_0= ruleTaskAssignment ) )? ) )
            // InternalWH.g:715:2: (otherlv_0= 'Task' ( (lv_id_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (lv_assignment_3_0= ruleTaskAssignment ) )? )
            {
            // InternalWH.g:715:2: (otherlv_0= 'Task' ( (lv_id_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (lv_assignment_3_0= ruleTaskAssignment ) )? )
            // InternalWH.g:716:3: otherlv_0= 'Task' ( (lv_id_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) ( (lv_assignment_3_0= ruleTaskAssignment ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalWH.g:720:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalWH.g:721:4: (lv_id_1_0= RULE_ID )
            {
            // InternalWH.g:721:4: (lv_id_1_0= RULE_ID )
            // InternalWH.g:722:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_id_1_0, grammarAccess.getTaskAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWH.g:738:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalWH.g:739:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalWH.g:739:4: (lv_description_2_0= RULE_STRING )
            // InternalWH.g:740:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_description_2_0, grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalWH.g:756:3: ( (lv_assignment_3_0= ruleTaskAssignment ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalWH.g:757:4: (lv_assignment_3_0= ruleTaskAssignment )
                    {
                    // InternalWH.g:757:4: (lv_assignment_3_0= ruleTaskAssignment )
                    // InternalWH.g:758:5: lv_assignment_3_0= ruleTaskAssignment
                    {

                    					newCompositeNode(grammarAccess.getTaskAccess().getAssignmentTaskAssignmentParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assignment_3_0=ruleTaskAssignment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskRule());
                    					}
                    					set(
                    						current,
                    						"assignment",
                    						lv_assignment_3_0,
                    						"org.xtext.example.wh.WH.TaskAssignment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleTaskAssignment"
    // InternalWH.g:779:1: entryRuleTaskAssignment returns [EObject current=null] : iv_ruleTaskAssignment= ruleTaskAssignment EOF ;
    public final EObject entryRuleTaskAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAssignment = null;


        try {
            // InternalWH.g:779:55: (iv_ruleTaskAssignment= ruleTaskAssignment EOF )
            // InternalWH.g:780:2: iv_ruleTaskAssignment= ruleTaskAssignment EOF
            {
             newCompositeNode(grammarAccess.getTaskAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskAssignment=ruleTaskAssignment();

            state._fsp--;

             current =iv_ruleTaskAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskAssignment"


    // $ANTLR start "ruleTaskAssignment"
    // InternalWH.g:786:1: ruleTaskAssignment returns [EObject current=null] : (otherlv_0= 'Assignment' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'during' ( (otherlv_5= RULE_ID ) ) ( (lv_isDone_6_0= 'Completed' ) )? ) ;
    public final EObject ruleTaskAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_isDone_6_0=null;


        	enterRule();

        try {
            // InternalWH.g:792:2: ( (otherlv_0= 'Assignment' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'during' ( (otherlv_5= RULE_ID ) ) ( (lv_isDone_6_0= 'Completed' ) )? ) )
            // InternalWH.g:793:2: (otherlv_0= 'Assignment' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'during' ( (otherlv_5= RULE_ID ) ) ( (lv_isDone_6_0= 'Completed' ) )? )
            {
            // InternalWH.g:793:2: (otherlv_0= 'Assignment' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'during' ( (otherlv_5= RULE_ID ) ) ( (lv_isDone_6_0= 'Completed' ) )? )
            // InternalWH.g:794:3: otherlv_0= 'Assignment' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'during' ( (otherlv_5= RULE_ID ) ) ( (lv_isDone_6_0= 'Completed' ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAssignmentAccess().getAssignmentKeyword_0());
            		
            // InternalWH.g:798:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalWH.g:799:4: (lv_id_1_0= RULE_ID )
            {
            // InternalWH.g:799:4: (lv_id_1_0= RULE_ID )
            // InternalWH.g:800:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_id_1_0, grammarAccess.getTaskAssignmentAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAssignmentAccess().getToKeyword_2());
            		
            // InternalWH.g:820:3: ( (otherlv_3= RULE_ID ) )
            // InternalWH.g:821:4: (otherlv_3= RULE_ID )
            {
            // InternalWH.g:821:4: (otherlv_3= RULE_ID )
            // InternalWH.g:822:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskAssignmentRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_3, grammarAccess.getTaskAssignmentAccess().getRoleRoleCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAssignmentAccess().getDuringKeyword_4());
            		
            // InternalWH.g:837:3: ( (otherlv_5= RULE_ID ) )
            // InternalWH.g:838:4: (otherlv_5= RULE_ID )
            {
            // InternalWH.g:838:4: (otherlv_5= RULE_ID )
            // InternalWH.g:839:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskAssignmentRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_5, grammarAccess.getTaskAssignmentAccess().getAvailabilityAvailabilityCrossReference_5_0());
            				

            }


            }

            // InternalWH.g:850:3: ( (lv_isDone_6_0= 'Completed' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWH.g:851:4: (lv_isDone_6_0= 'Completed' )
                    {
                    // InternalWH.g:851:4: (lv_isDone_6_0= 'Completed' )
                    // InternalWH.g:852:5: lv_isDone_6_0= 'Completed'
                    {
                    lv_isDone_6_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_isDone_6_0, grammarAccess.getTaskAssignmentAccess().getIsDoneCompletedKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskAssignmentRule());
                    					}
                    					setWithLastConsumed(current, "isDone", lv_isDone_6_0 != null, "Completed");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskAssignment"


    // $ANTLR start "entryRuleAvailability"
    // InternalWH.g:868:1: entryRuleAvailability returns [EObject current=null] : iv_ruleAvailability= ruleAvailability EOF ;
    public final EObject entryRuleAvailability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvailability = null;


        try {
            // InternalWH.g:868:53: (iv_ruleAvailability= ruleAvailability EOF )
            // InternalWH.g:869:2: iv_ruleAvailability= ruleAvailability EOF
            {
             newCompositeNode(grammarAccess.getAvailabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAvailability=ruleAvailability();

            state._fsp--;

             current =iv_ruleAvailability; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvailability"


    // $ANTLR start "ruleAvailability"
    // InternalWH.g:875:1: ruleAvailability returns [EObject current=null] : (otherlv_0= 'Availability' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleAvailability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_startTime_3_0=null;
        Token otherlv_4=null;
        Token lv_endTime_5_0=null;


        	enterRule();

        try {
            // InternalWH.g:881:2: ( (otherlv_0= 'Availability' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) ) )
            // InternalWH.g:882:2: (otherlv_0= 'Availability' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) )
            {
            // InternalWH.g:882:2: (otherlv_0= 'Availability' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) ) )
            // InternalWH.g:883:3: otherlv_0= 'Availability' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_startTime_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_endTime_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAvailabilityAccess().getAvailabilityKeyword_0());
            		
            // InternalWH.g:887:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalWH.g:888:4: (lv_id_1_0= RULE_ID )
            {
            // InternalWH.g:888:4: (lv_id_1_0= RULE_ID )
            // InternalWH.g:889:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_id_1_0, grammarAccess.getAvailabilityAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAvailabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAvailabilityAccess().getFromKeyword_2());
            		
            // InternalWH.g:909:3: ( (lv_startTime_3_0= RULE_STRING ) )
            // InternalWH.g:910:4: (lv_startTime_3_0= RULE_STRING )
            {
            // InternalWH.g:910:4: (lv_startTime_3_0= RULE_STRING )
            // InternalWH.g:911:5: lv_startTime_3_0= RULE_STRING
            {
            lv_startTime_3_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_startTime_3_0, grammarAccess.getAvailabilityAccess().getStartTimeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAvailabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startTime",
            						lv_startTime_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getAvailabilityAccess().getToKeyword_4());
            		
            // InternalWH.g:931:3: ( (lv_endTime_5_0= RULE_STRING ) )
            // InternalWH.g:932:4: (lv_endTime_5_0= RULE_STRING )
            {
            // InternalWH.g:932:4: (lv_endTime_5_0= RULE_STRING )
            // InternalWH.g:933:5: lv_endTime_5_0= RULE_STRING
            {
            lv_endTime_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_endTime_5_0, grammarAccess.getAvailabilityAccess().getEndTimeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAvailabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endTime",
            						lv_endTime_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvailability"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});

}
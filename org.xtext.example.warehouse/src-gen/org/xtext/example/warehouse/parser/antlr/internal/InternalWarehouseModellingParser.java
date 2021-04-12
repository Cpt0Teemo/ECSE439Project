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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWarehouseModellingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Company'", "'Warehouses:'", "'Teams:'", "'Warehouse'", "'{'", "'}'", "'Team'", "'Person'", "'Employee'", "'Manager'", "'of'", "'team'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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




    // $ANTLR start "entryRuleWarehouseManagement"
    // InternalWarehouseModelling.g:64:1: entryRuleWarehouseManagement returns [EObject current=null] : iv_ruleWarehouseManagement= ruleWarehouseManagement EOF ;
    public final EObject entryRuleWarehouseManagement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWarehouseManagement = null;


        try {
            // InternalWarehouseModelling.g:64:60: (iv_ruleWarehouseManagement= ruleWarehouseManagement EOF )
            // InternalWarehouseModelling.g:65:2: iv_ruleWarehouseManagement= ruleWarehouseManagement EOF
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
    // InternalWarehouseModelling.g:71:1: ruleWarehouseManagement returns [EObject current=null] : ( (lv_companies_0_0= ruleCompany ) )* ;
    public final EObject ruleWarehouseManagement() throws RecognitionException {
        EObject current = null;

        EObject lv_companies_0_0 = null;



        	enterRule();

        try {
            // InternalWarehouseModelling.g:77:2: ( ( (lv_companies_0_0= ruleCompany ) )* )
            // InternalWarehouseModelling.g:78:2: ( (lv_companies_0_0= ruleCompany ) )*
            {
            // InternalWarehouseModelling.g:78:2: ( (lv_companies_0_0= ruleCompany ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWarehouseModelling.g:79:3: (lv_companies_0_0= ruleCompany )
            	    {
            	    // InternalWarehouseModelling.g:79:3: (lv_companies_0_0= ruleCompany )
            	    // InternalWarehouseModelling.g:80:4: lv_companies_0_0= ruleCompany
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
            	    					"org.xtext.example.warehouse.WarehouseModelling.Company");
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
    // InternalWarehouseModelling.g:100:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalWarehouseModelling.g:100:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalWarehouseModelling.g:101:2: iv_ruleCompany= ruleCompany EOF
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
    // InternalWarehouseModelling.g:107:1: ruleCompany returns [EObject current=null] : (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_address_2_0= RULE_ID ) ) otherlv_3= 'Warehouses:' ( (lv_warehouses_4_0= ruleWarehouse ) )* otherlv_5= 'Teams:' ( (lv_teams_6_0= ruleTeam ) )* ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_address_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_warehouses_4_0 = null;

        EObject lv_teams_6_0 = null;



        	enterRule();

        try {
            // InternalWarehouseModelling.g:113:2: ( (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_address_2_0= RULE_ID ) ) otherlv_3= 'Warehouses:' ( (lv_warehouses_4_0= ruleWarehouse ) )* otherlv_5= 'Teams:' ( (lv_teams_6_0= ruleTeam ) )* ) )
            // InternalWarehouseModelling.g:114:2: (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_address_2_0= RULE_ID ) ) otherlv_3= 'Warehouses:' ( (lv_warehouses_4_0= ruleWarehouse ) )* otherlv_5= 'Teams:' ( (lv_teams_6_0= ruleTeam ) )* )
            {
            // InternalWarehouseModelling.g:114:2: (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_address_2_0= RULE_ID ) ) otherlv_3= 'Warehouses:' ( (lv_warehouses_4_0= ruleWarehouse ) )* otherlv_5= 'Teams:' ( (lv_teams_6_0= ruleTeam ) )* )
            // InternalWarehouseModelling.g:115:3: otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) ( (lv_address_2_0= RULE_ID ) ) otherlv_3= 'Warehouses:' ( (lv_warehouses_4_0= ruleWarehouse ) )* otherlv_5= 'Teams:' ( (lv_teams_6_0= ruleTeam ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getCompanyKeyword_0());
            		
            // InternalWarehouseModelling.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWarehouseModelling.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWarehouseModelling.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalWarehouseModelling.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            // InternalWarehouseModelling.g:137:3: ( (lv_address_2_0= RULE_ID ) )
            // InternalWarehouseModelling.g:138:4: (lv_address_2_0= RULE_ID )
            {
            // InternalWarehouseModelling.g:138:4: (lv_address_2_0= RULE_ID )
            // InternalWarehouseModelling.g:139:5: lv_address_2_0= RULE_ID
            {
            lv_address_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_address_2_0, grammarAccess.getCompanyAccess().getAddressIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"address",
            						lv_address_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCompanyAccess().getWarehousesKeyword_3());
            		
            // InternalWarehouseModelling.g:159:3: ( (lv_warehouses_4_0= ruleWarehouse ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWarehouseModelling.g:160:4: (lv_warehouses_4_0= ruleWarehouse )
            	    {
            	    // InternalWarehouseModelling.g:160:4: (lv_warehouses_4_0= ruleWarehouse )
            	    // InternalWarehouseModelling.g:161:5: lv_warehouses_4_0= ruleWarehouse
            	    {

            	    					newCompositeNode(grammarAccess.getCompanyAccess().getWarehousesWarehouseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_warehouses_4_0=ruleWarehouse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"warehouses",
            	    						lv_warehouses_4_0,
            	    						"org.xtext.example.warehouse.WarehouseModelling.Warehouse");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCompanyAccess().getTeamsKeyword_5());
            		
            // InternalWarehouseModelling.g:182:3: ( (lv_teams_6_0= ruleTeam ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWarehouseModelling.g:183:4: (lv_teams_6_0= ruleTeam )
            	    {
            	    // InternalWarehouseModelling.g:183:4: (lv_teams_6_0= ruleTeam )
            	    // InternalWarehouseModelling.g:184:5: lv_teams_6_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getCompanyAccess().getTeamsTeamParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_teams_6_0=ruleTeam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"teams",
            	    						lv_teams_6_0,
            	    						"org.xtext.example.warehouse.WarehouseModelling.Team");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalWarehouseModelling.g:205:1: entryRuleWarehouse returns [EObject current=null] : iv_ruleWarehouse= ruleWarehouse EOF ;
    public final EObject entryRuleWarehouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWarehouse = null;


        try {
            // InternalWarehouseModelling.g:205:50: (iv_ruleWarehouse= ruleWarehouse EOF )
            // InternalWarehouseModelling.g:206:2: iv_ruleWarehouse= ruleWarehouse EOF
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
    // InternalWarehouseModelling.g:212:1: ruleWarehouse returns [EObject current=null] : (otherlv_0= 'Warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workers_3_0= rulePerson ) )* otherlv_4= '}' ) ;
    public final EObject ruleWarehouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_workers_3_0 = null;



        	enterRule();

        try {
            // InternalWarehouseModelling.g:218:2: ( (otherlv_0= 'Warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workers_3_0= rulePerson ) )* otherlv_4= '}' ) )
            // InternalWarehouseModelling.g:219:2: (otherlv_0= 'Warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workers_3_0= rulePerson ) )* otherlv_4= '}' )
            {
            // InternalWarehouseModelling.g:219:2: (otherlv_0= 'Warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workers_3_0= rulePerson ) )* otherlv_4= '}' )
            // InternalWarehouseModelling.g:220:3: otherlv_0= 'Warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workers_3_0= rulePerson ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWarehouseAccess().getWarehouseKeyword_0());
            		
            // InternalWarehouseModelling.g:224:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWarehouseModelling.g:225:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWarehouseModelling.g:225:4: (lv_name_1_0= RULE_ID )
            // InternalWarehouseModelling.g:226:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWarehouseModelling.g:246:3: ( (lv_workers_3_0= rulePerson ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWarehouseModelling.g:247:4: (lv_workers_3_0= rulePerson )
            	    {
            	    // InternalWarehouseModelling.g:247:4: (lv_workers_3_0= rulePerson )
            	    // InternalWarehouseModelling.g:248:5: lv_workers_3_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getWarehouseAccess().getWorkersPersonParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_workers_3_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWarehouseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"workers",
            	    						lv_workers_3_0,
            	    						"org.xtext.example.warehouse.WarehouseModelling.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalWarehouseModelling.g:273:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalWarehouseModelling.g:273:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalWarehouseModelling.g:274:2: iv_ruleTeam= ruleTeam EOF
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
    // InternalWarehouseModelling.g:280:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'Team' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalWarehouseModelling.g:286:2: ( (otherlv_0= 'Team' ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalWarehouseModelling.g:287:2: (otherlv_0= 'Team' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalWarehouseModelling.g:287:2: (otherlv_0= 'Team' ( (lv_id_1_0= RULE_ID ) ) )
            // InternalWarehouseModelling.g:288:3: otherlv_0= 'Team' ( (lv_id_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalWarehouseModelling.g:292:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalWarehouseModelling.g:293:4: (lv_id_1_0= RULE_ID )
            {
            // InternalWarehouseModelling.g:293:4: (lv_id_1_0= RULE_ID )
            // InternalWarehouseModelling.g:294:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_1_0, grammarAccess.getTeamAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
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
    // InternalWarehouseModelling.g:314:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalWarehouseModelling.g:314:47: (iv_rulePerson= rulePerson EOF )
            // InternalWarehouseModelling.g:315:2: iv_rulePerson= rulePerson EOF
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
    // InternalWarehouseModelling.g:321:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWarehouseModelling.g:327:2: ( (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalWarehouseModelling.g:328:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalWarehouseModelling.g:328:2: (otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalWarehouseModelling.g:329:3: otherlv_0= 'Person' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalWarehouseModelling.g:333:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalWarehouseModelling.g:334:4: (lv_name_1_0= RULE_ID )
            {
            // InternalWarehouseModelling.g:334:4: (lv_name_1_0= RULE_ID )
            // InternalWarehouseModelling.g:335:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEmployee"
    // InternalWarehouseModelling.g:355:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalWarehouseModelling.g:355:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalWarehouseModelling.g:356:2: iv_ruleEmployee= ruleEmployee EOF
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
    // InternalWarehouseModelling.g:362:1: ruleEmployee returns [EObject current=null] : (otherlv_0= 'Employee' ( (lv_startDate_1_0= RULE_ID ) ) ( (lv_endDate_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_startDate_1_0=null;
        Token lv_endDate_2_0=null;


        	enterRule();

        try {
            // InternalWarehouseModelling.g:368:2: ( (otherlv_0= 'Employee' ( (lv_startDate_1_0= RULE_ID ) ) ( (lv_endDate_2_0= RULE_ID ) ) ) )
            // InternalWarehouseModelling.g:369:2: (otherlv_0= 'Employee' ( (lv_startDate_1_0= RULE_ID ) ) ( (lv_endDate_2_0= RULE_ID ) ) )
            {
            // InternalWarehouseModelling.g:369:2: (otherlv_0= 'Employee' ( (lv_startDate_1_0= RULE_ID ) ) ( (lv_endDate_2_0= RULE_ID ) ) )
            // InternalWarehouseModelling.g:370:3: otherlv_0= 'Employee' ( (lv_startDate_1_0= RULE_ID ) ) ( (lv_endDate_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
            		
            // InternalWarehouseModelling.g:374:3: ( (lv_startDate_1_0= RULE_ID ) )
            // InternalWarehouseModelling.g:375:4: (lv_startDate_1_0= RULE_ID )
            {
            // InternalWarehouseModelling.g:375:4: (lv_startDate_1_0= RULE_ID )
            // InternalWarehouseModelling.g:376:5: lv_startDate_1_0= RULE_ID
            {
            lv_startDate_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_startDate_1_0, grammarAccess.getEmployeeAccess().getStartDateIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWarehouseModelling.g:392:3: ( (lv_endDate_2_0= RULE_ID ) )
            // InternalWarehouseModelling.g:393:4: (lv_endDate_2_0= RULE_ID )
            {
            // InternalWarehouseModelling.g:393:4: (lv_endDate_2_0= RULE_ID )
            // InternalWarehouseModelling.g:394:5: lv_endDate_2_0= RULE_ID
            {
            lv_endDate_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_endDate_2_0, grammarAccess.getEmployeeAccess().getEndDateIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endDate",
            						lv_endDate_2_0,
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
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleManager"
    // InternalWarehouseModelling.g:414:1: entryRuleManager returns [EObject current=null] : iv_ruleManager= ruleManager EOF ;
    public final EObject entryRuleManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManager = null;


        try {
            // InternalWarehouseModelling.g:414:48: (iv_ruleManager= ruleManager EOF )
            // InternalWarehouseModelling.g:415:2: iv_ruleManager= ruleManager EOF
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
    // InternalWarehouseModelling.g:421:1: ruleManager returns [EObject current=null] : (otherlv_0= 'Manager' ( (lv_startDate_1_0= RULE_ID ) ) ( (lv_endDate_2_0= RULE_ID ) ) otherlv_3= 'of' otherlv_4= 'team' ) ;
    public final EObject ruleManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_startDate_1_0=null;
        Token lv_endDate_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalWarehouseModelling.g:427:2: ( (otherlv_0= 'Manager' ( (lv_startDate_1_0= RULE_ID ) ) ( (lv_endDate_2_0= RULE_ID ) ) otherlv_3= 'of' otherlv_4= 'team' ) )
            // InternalWarehouseModelling.g:428:2: (otherlv_0= 'Manager' ( (lv_startDate_1_0= RULE_ID ) ) ( (lv_endDate_2_0= RULE_ID ) ) otherlv_3= 'of' otherlv_4= 'team' )
            {
            // InternalWarehouseModelling.g:428:2: (otherlv_0= 'Manager' ( (lv_startDate_1_0= RULE_ID ) ) ( (lv_endDate_2_0= RULE_ID ) ) otherlv_3= 'of' otherlv_4= 'team' )
            // InternalWarehouseModelling.g:429:3: otherlv_0= 'Manager' ( (lv_startDate_1_0= RULE_ID ) ) ( (lv_endDate_2_0= RULE_ID ) ) otherlv_3= 'of' otherlv_4= 'team'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getManagerAccess().getManagerKeyword_0());
            		
            // InternalWarehouseModelling.g:433:3: ( (lv_startDate_1_0= RULE_ID ) )
            // InternalWarehouseModelling.g:434:4: (lv_startDate_1_0= RULE_ID )
            {
            // InternalWarehouseModelling.g:434:4: (lv_startDate_1_0= RULE_ID )
            // InternalWarehouseModelling.g:435:5: lv_startDate_1_0= RULE_ID
            {
            lv_startDate_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_startDate_1_0, grammarAccess.getManagerAccess().getStartDateIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManagerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalWarehouseModelling.g:451:3: ( (lv_endDate_2_0= RULE_ID ) )
            // InternalWarehouseModelling.g:452:4: (lv_endDate_2_0= RULE_ID )
            {
            // InternalWarehouseModelling.g:452:4: (lv_endDate_2_0= RULE_ID )
            // InternalWarehouseModelling.g:453:5: lv_endDate_2_0= RULE_ID
            {
            lv_endDate_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_endDate_2_0, grammarAccess.getManagerAccess().getEndDateIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManagerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"endDate",
            						lv_endDate_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getManagerAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getManagerAccess().getTeamKeyword_4());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});

}
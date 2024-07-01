package org.xtext.docker.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.docker.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Compose'", "'{'", "'version'", "'service'", "','", "'}'", "'Service'", "'command'", "'depends_on'", "'('", "')'", "'image'", "'port'", "'volume'", "'network'", "'environment'", "'Image'", "'tag'", "'Port'", "'number'", "'protocol'", "'Volume'", "'source'", "'target'", "'Network'", "'driver'", "'Environment'", "'value'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int RULE_ID=5;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Compose";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompose"
    // InternalMyDsl.g:64:1: entryRuleCompose returns [EObject current=null] : iv_ruleCompose= ruleCompose EOF ;
    public final EObject entryRuleCompose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompose = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleCompose= ruleCompose EOF )
            // InternalMyDsl.g:65:2: iv_ruleCompose= ruleCompose EOF
            {
             newCompositeNode(grammarAccess.getComposeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompose=ruleCompose();

            state._fsp--;

             current =iv_ruleCompose; 
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
    // $ANTLR end "entryRuleCompose"


    // $ANTLR start "ruleCompose"
    // InternalMyDsl.g:71:1: ruleCompose returns [EObject current=null] : ( () otherlv_1= 'Compose' otherlv_2= '{' (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )? (otherlv_5= 'service' otherlv_6= '{' ( (lv_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_service_9_0= ruleService ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleCompose() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_4_0 = null;

        EObject lv_service_7_0 = null;

        EObject lv_service_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'Compose' otherlv_2= '{' (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )? (otherlv_5= 'service' otherlv_6= '{' ( (lv_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_service_9_0= ruleService ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Compose' otherlv_2= '{' (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )? (otherlv_5= 'service' otherlv_6= '{' ( (lv_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_service_9_0= ruleService ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Compose' otherlv_2= '{' (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )? (otherlv_5= 'service' otherlv_6= '{' ( (lv_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_service_9_0= ruleService ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'Compose' otherlv_2= '{' (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )? (otherlv_5= 'service' otherlv_6= '{' ( (lv_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_service_9_0= ruleService ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComposeAccess().getComposeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComposeAccess().getComposeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getComposeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:94:3: (otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:95:4: otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getComposeAccess().getVersionKeyword_3_0());
                    			
                    // InternalMyDsl.g:99:4: ( (lv_version_4_0= ruleEString ) )
                    // InternalMyDsl.g:100:5: (lv_version_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:100:5: (lv_version_4_0= ruleEString )
                    // InternalMyDsl.g:101:6: lv_version_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComposeAccess().getVersionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_version_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComposeRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_4_0,
                    							"org.xtext.docker.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:119:3: (otherlv_5= 'service' otherlv_6= '{' ( (lv_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_service_9_0= ruleService ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:120:4: otherlv_5= 'service' otherlv_6= '{' ( (lv_service_7_0= ruleService ) ) (otherlv_8= ',' ( (lv_service_9_0= ruleService ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getComposeAccess().getServiceKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getComposeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:128:4: ( (lv_service_7_0= ruleService ) )
                    // InternalMyDsl.g:129:5: (lv_service_7_0= ruleService )
                    {
                    // InternalMyDsl.g:129:5: (lv_service_7_0= ruleService )
                    // InternalMyDsl.g:130:6: lv_service_7_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getComposeAccess().getServiceServiceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_service_7_0=ruleService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComposeRule());
                    						}
                    						add(
                    							current,
                    							"service",
                    							lv_service_7_0,
                    							"org.xtext.docker.mydsl.MyDsl.Service");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:147:4: (otherlv_8= ',' ( (lv_service_9_0= ruleService ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:148:5: otherlv_8= ',' ( (lv_service_9_0= ruleService ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getComposeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:152:5: ( (lv_service_9_0= ruleService ) )
                    	    // InternalMyDsl.g:153:6: (lv_service_9_0= ruleService )
                    	    {
                    	    // InternalMyDsl.g:153:6: (lv_service_9_0= ruleService )
                    	    // InternalMyDsl.g:154:7: lv_service_9_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getComposeAccess().getServiceServiceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_service_9_0=ruleService();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComposeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"service",
                    	    								lv_service_9_0,
                    	    								"org.xtext.docker.mydsl.MyDsl.Service");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getComposeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getComposeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCompose"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:185:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:185:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:186:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:192:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:198:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:199:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:199:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:200:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:208:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleService"
    // InternalMyDsl.g:219:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalMyDsl.g:219:48: (iv_ruleService= ruleService EOF )
            // InternalMyDsl.g:220:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMyDsl.g:226:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'command' ( (lv_command_4_0= ruleEString ) ) )? (otherlv_5= 'depends_on' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'image' ( (lv_image_12_0= ruleImage ) ) (otherlv_13= 'port' otherlv_14= '{' ( (lv_port_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_port_17_0= rulePort ) ) )* otherlv_18= '}' )? (otherlv_19= 'volume' otherlv_20= '{' ( (lv_volume_21_0= ruleVolume ) ) (otherlv_22= ',' ( (lv_volume_23_0= ruleVolume ) ) )* otherlv_24= '}' )? (otherlv_25= 'network' otherlv_26= '{' ( (lv_network_27_0= ruleNetwork ) ) (otherlv_28= ',' ( (lv_network_29_0= ruleNetwork ) ) )* otherlv_30= '}' )? (otherlv_31= 'environment' otherlv_32= '{' ( (lv_environment_33_0= ruleEnvironment ) ) (otherlv_34= ',' ( (lv_environment_35_0= ruleEnvironment ) ) )* otherlv_36= '}' )? otherlv_37= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_command_4_0 = null;

        EObject lv_image_12_0 = null;

        EObject lv_port_15_0 = null;

        EObject lv_port_17_0 = null;

        EObject lv_volume_21_0 = null;

        EObject lv_volume_23_0 = null;

        EObject lv_network_27_0 = null;

        EObject lv_network_29_0 = null;

        EObject lv_environment_33_0 = null;

        EObject lv_environment_35_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:232:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'command' ( (lv_command_4_0= ruleEString ) ) )? (otherlv_5= 'depends_on' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'image' ( (lv_image_12_0= ruleImage ) ) (otherlv_13= 'port' otherlv_14= '{' ( (lv_port_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_port_17_0= rulePort ) ) )* otherlv_18= '}' )? (otherlv_19= 'volume' otherlv_20= '{' ( (lv_volume_21_0= ruleVolume ) ) (otherlv_22= ',' ( (lv_volume_23_0= ruleVolume ) ) )* otherlv_24= '}' )? (otherlv_25= 'network' otherlv_26= '{' ( (lv_network_27_0= ruleNetwork ) ) (otherlv_28= ',' ( (lv_network_29_0= ruleNetwork ) ) )* otherlv_30= '}' )? (otherlv_31= 'environment' otherlv_32= '{' ( (lv_environment_33_0= ruleEnvironment ) ) (otherlv_34= ',' ( (lv_environment_35_0= ruleEnvironment ) ) )* otherlv_36= '}' )? otherlv_37= '}' ) )
            // InternalMyDsl.g:233:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'command' ( (lv_command_4_0= ruleEString ) ) )? (otherlv_5= 'depends_on' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'image' ( (lv_image_12_0= ruleImage ) ) (otherlv_13= 'port' otherlv_14= '{' ( (lv_port_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_port_17_0= rulePort ) ) )* otherlv_18= '}' )? (otherlv_19= 'volume' otherlv_20= '{' ( (lv_volume_21_0= ruleVolume ) ) (otherlv_22= ',' ( (lv_volume_23_0= ruleVolume ) ) )* otherlv_24= '}' )? (otherlv_25= 'network' otherlv_26= '{' ( (lv_network_27_0= ruleNetwork ) ) (otherlv_28= ',' ( (lv_network_29_0= ruleNetwork ) ) )* otherlv_30= '}' )? (otherlv_31= 'environment' otherlv_32= '{' ( (lv_environment_33_0= ruleEnvironment ) ) (otherlv_34= ',' ( (lv_environment_35_0= ruleEnvironment ) ) )* otherlv_36= '}' )? otherlv_37= '}' )
            {
            // InternalMyDsl.g:233:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'command' ( (lv_command_4_0= ruleEString ) ) )? (otherlv_5= 'depends_on' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'image' ( (lv_image_12_0= ruleImage ) ) (otherlv_13= 'port' otherlv_14= '{' ( (lv_port_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_port_17_0= rulePort ) ) )* otherlv_18= '}' )? (otherlv_19= 'volume' otherlv_20= '{' ( (lv_volume_21_0= ruleVolume ) ) (otherlv_22= ',' ( (lv_volume_23_0= ruleVolume ) ) )* otherlv_24= '}' )? (otherlv_25= 'network' otherlv_26= '{' ( (lv_network_27_0= ruleNetwork ) ) (otherlv_28= ',' ( (lv_network_29_0= ruleNetwork ) ) )* otherlv_30= '}' )? (otherlv_31= 'environment' otherlv_32= '{' ( (lv_environment_33_0= ruleEnvironment ) ) (otherlv_34= ',' ( (lv_environment_35_0= ruleEnvironment ) ) )* otherlv_36= '}' )? otherlv_37= '}' )
            // InternalMyDsl.g:234:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'command' ( (lv_command_4_0= ruleEString ) ) )? (otherlv_5= 'depends_on' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'image' ( (lv_image_12_0= ruleImage ) ) (otherlv_13= 'port' otherlv_14= '{' ( (lv_port_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_port_17_0= rulePort ) ) )* otherlv_18= '}' )? (otherlv_19= 'volume' otherlv_20= '{' ( (lv_volume_21_0= ruleVolume ) ) (otherlv_22= ',' ( (lv_volume_23_0= ruleVolume ) ) )* otherlv_24= '}' )? (otherlv_25= 'network' otherlv_26= '{' ( (lv_network_27_0= ruleNetwork ) ) (otherlv_28= ',' ( (lv_network_29_0= ruleNetwork ) ) )* otherlv_30= '}' )? (otherlv_31= 'environment' otherlv_32= '{' ( (lv_environment_33_0= ruleEnvironment ) ) (otherlv_34= ',' ( (lv_environment_35_0= ruleEnvironment ) ) )* otherlv_36= '}' )? otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalMyDsl.g:238:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:239:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:239:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:240:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.docker.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:261:3: (otherlv_3= 'command' ( (lv_command_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:262:4: otherlv_3= 'command' ( (lv_command_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getCommandKeyword_3_0());
                    			
                    // InternalMyDsl.g:266:4: ( (lv_command_4_0= ruleEString ) )
                    // InternalMyDsl.g:267:5: (lv_command_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:267:5: (lv_command_4_0= ruleEString )
                    // InternalMyDsl.g:268:6: lv_command_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_command_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						set(
                    							current,
                    							"command",
                    							lv_command_4_0,
                    							"org.xtext.docker.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:286:3: (otherlv_5= 'depends_on' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:287:4: otherlv_5= 'depends_on' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getDepends_onKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMyDsl.g:295:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:296:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:296:5: ( ruleEString )
                    // InternalMyDsl.g:297:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceAccess().getDepends_onServiceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:311:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:312:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:316:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:317:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:317:6: ( ruleEString )
                    	    // InternalMyDsl.g:318:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServiceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getDepends_onServiceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getImageKeyword_5());
            		
            // InternalMyDsl.g:342:3: ( (lv_image_12_0= ruleImage ) )
            // InternalMyDsl.g:343:4: (lv_image_12_0= ruleImage )
            {
            // InternalMyDsl.g:343:4: (lv_image_12_0= ruleImage )
            // InternalMyDsl.g:344:5: lv_image_12_0= ruleImage
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getImageImageParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_image_12_0=ruleImage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"image",
            						lv_image_12_0,
            						"org.xtext.docker.mydsl.MyDsl.Image");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:361:3: (otherlv_13= 'port' otherlv_14= '{' ( (lv_port_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_port_17_0= rulePort ) ) )* otherlv_18= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:362:4: otherlv_13= 'port' otherlv_14= '{' ( (lv_port_15_0= rulePort ) ) (otherlv_16= ',' ( (lv_port_17_0= rulePort ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getPortKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:370:4: ( (lv_port_15_0= rulePort ) )
                    // InternalMyDsl.g:371:5: (lv_port_15_0= rulePort )
                    {
                    // InternalMyDsl.g:371:5: (lv_port_15_0= rulePort )
                    // InternalMyDsl.g:372:6: lv_port_15_0= rulePort
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getPortPortParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_port_15_0=rulePort();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"port",
                    							lv_port_15_0,
                    							"org.xtext.docker.mydsl.MyDsl.Port");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:389:4: (otherlv_16= ',' ( (lv_port_17_0= rulePort ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:390:5: otherlv_16= ',' ( (lv_port_17_0= rulePort ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_17); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:394:5: ( (lv_port_17_0= rulePort ) )
                    	    // InternalMyDsl.g:395:6: (lv_port_17_0= rulePort )
                    	    {
                    	    // InternalMyDsl.g:395:6: (lv_port_17_0= rulePort )
                    	    // InternalMyDsl.g:396:7: lv_port_17_0= rulePort
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getPortPortParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_port_17_0=rulePort();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"port",
                    	    								lv_port_17_0,
                    	    								"org.xtext.docker.mydsl.MyDsl.Port");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:419:3: (otherlv_19= 'volume' otherlv_20= '{' ( (lv_volume_21_0= ruleVolume ) ) (otherlv_22= ',' ( (lv_volume_23_0= ruleVolume ) ) )* otherlv_24= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:420:4: otherlv_19= 'volume' otherlv_20= '{' ( (lv_volume_21_0= ruleVolume ) ) (otherlv_22= ',' ( (lv_volume_23_0= ruleVolume ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getServiceAccess().getVolumeKeyword_8_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyDsl.g:428:4: ( (lv_volume_21_0= ruleVolume ) )
                    // InternalMyDsl.g:429:5: (lv_volume_21_0= ruleVolume )
                    {
                    // InternalMyDsl.g:429:5: (lv_volume_21_0= ruleVolume )
                    // InternalMyDsl.g:430:6: lv_volume_21_0= ruleVolume
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getVolumeVolumeParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_volume_21_0=ruleVolume();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"volume",
                    							lv_volume_21_0,
                    							"org.xtext.docker.mydsl.MyDsl.Volume");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:447:4: (otherlv_22= ',' ( (lv_volume_23_0= ruleVolume ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:448:5: otherlv_22= ',' ( (lv_volume_23_0= ruleVolume ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FOLLOW_19); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getServiceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyDsl.g:452:5: ( (lv_volume_23_0= ruleVolume ) )
                    	    // InternalMyDsl.g:453:6: (lv_volume_23_0= ruleVolume )
                    	    {
                    	    // InternalMyDsl.g:453:6: (lv_volume_23_0= ruleVolume )
                    	    // InternalMyDsl.g:454:7: lv_volume_23_0= ruleVolume
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getVolumeVolumeParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_volume_23_0=ruleVolume();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"volume",
                    	    								lv_volume_23_0,
                    	    								"org.xtext.docker.mydsl.MyDsl.Volume");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_24, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:477:3: (otherlv_25= 'network' otherlv_26= '{' ( (lv_network_27_0= ruleNetwork ) ) (otherlv_28= ',' ( (lv_network_29_0= ruleNetwork ) ) )* otherlv_30= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:478:4: otherlv_25= 'network' otherlv_26= '{' ( (lv_network_27_0= ruleNetwork ) ) (otherlv_28= ',' ( (lv_network_29_0= ruleNetwork ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getServiceAccess().getNetworkKeyword_9_0());
                    			
                    otherlv_26=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_26, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:486:4: ( (lv_network_27_0= ruleNetwork ) )
                    // InternalMyDsl.g:487:5: (lv_network_27_0= ruleNetwork )
                    {
                    // InternalMyDsl.g:487:5: (lv_network_27_0= ruleNetwork )
                    // InternalMyDsl.g:488:6: lv_network_27_0= ruleNetwork
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getNetworkNetworkParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_network_27_0=ruleNetwork();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"network",
                    							lv_network_27_0,
                    							"org.xtext.docker.mydsl.MyDsl.Network");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:505:4: (otherlv_28= ',' ( (lv_network_29_0= ruleNetwork ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:506:5: otherlv_28= ',' ( (lv_network_29_0= ruleNetwork ) )
                    	    {
                    	    otherlv_28=(Token)match(input,15,FOLLOW_21); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getServiceAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:510:5: ( (lv_network_29_0= ruleNetwork ) )
                    	    // InternalMyDsl.g:511:6: (lv_network_29_0= ruleNetwork )
                    	    {
                    	    // InternalMyDsl.g:511:6: (lv_network_29_0= ruleNetwork )
                    	    // InternalMyDsl.g:512:7: lv_network_29_0= ruleNetwork
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getNetworkNetworkParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_network_29_0=ruleNetwork();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"network",
                    	    								lv_network_29_0,
                    	    								"org.xtext.docker.mydsl.MyDsl.Network");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,16,FOLLOW_22); 

                    				newLeafNode(otherlv_30, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:535:3: (otherlv_31= 'environment' otherlv_32= '{' ( (lv_environment_33_0= ruleEnvironment ) ) (otherlv_34= ',' ( (lv_environment_35_0= ruleEnvironment ) ) )* otherlv_36= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:536:4: otherlv_31= 'environment' otherlv_32= '{' ( (lv_environment_33_0= ruleEnvironment ) ) (otherlv_34= ',' ( (lv_environment_35_0= ruleEnvironment ) ) )* otherlv_36= '}'
                    {
                    otherlv_31=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_31, grammarAccess.getServiceAccess().getEnvironmentKeyword_10_0());
                    			
                    otherlv_32=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_32, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalMyDsl.g:544:4: ( (lv_environment_33_0= ruleEnvironment ) )
                    // InternalMyDsl.g:545:5: (lv_environment_33_0= ruleEnvironment )
                    {
                    // InternalMyDsl.g:545:5: (lv_environment_33_0= ruleEnvironment )
                    // InternalMyDsl.g:546:6: lv_environment_33_0= ruleEnvironment
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getEnvironmentEnvironmentParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_environment_33_0=ruleEnvironment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						add(
                    							current,
                    							"environment",
                    							lv_environment_33_0,
                    							"org.xtext.docker.mydsl.MyDsl.Environment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:563:4: (otherlv_34= ',' ( (lv_environment_35_0= ruleEnvironment ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:564:5: otherlv_34= ',' ( (lv_environment_35_0= ruleEnvironment ) )
                    	    {
                    	    otherlv_34=(Token)match(input,15,FOLLOW_23); 

                    	    					newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalMyDsl.g:568:5: ( (lv_environment_35_0= ruleEnvironment ) )
                    	    // InternalMyDsl.g:569:6: (lv_environment_35_0= ruleEnvironment )
                    	    {
                    	    // InternalMyDsl.g:569:6: (lv_environment_35_0= ruleEnvironment )
                    	    // InternalMyDsl.g:570:7: lv_environment_35_0= ruleEnvironment
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceAccess().getEnvironmentEnvironmentParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_environment_35_0=ruleEnvironment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"environment",
                    	    								lv_environment_35_0,
                    	    								"org.xtext.docker.mydsl.MyDsl.Environment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_36, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_37=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleImage"
    // InternalMyDsl.g:601:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalMyDsl.g:601:46: (iv_ruleImage= ruleImage EOF )
            // InternalMyDsl.g:602:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalMyDsl.g:608:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tag' ( (lv_tag_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_tag_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:614:2: ( ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tag' ( (lv_tag_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:615:2: ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tag' ( (lv_tag_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:615:2: ( () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tag' ( (lv_tag_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:616:3: () otherlv_1= 'Image' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tag' ( (lv_tag_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:616:3: ()
            // InternalMyDsl.g:617:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImageAccess().getImageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getImageAccess().getImageKeyword_1());
            		
            // InternalMyDsl.g:627:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:628:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:628:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:629:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getImageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.docker.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:650:3: (otherlv_4= 'tag' ( (lv_tag_5_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:651:4: otherlv_4= 'tag' ( (lv_tag_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getImageAccess().getTagKeyword_4_0());
                    			
                    // InternalMyDsl.g:655:4: ( (lv_tag_5_0= ruleEString ) )
                    // InternalMyDsl.g:656:5: (lv_tag_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:656:5: (lv_tag_5_0= ruleEString )
                    // InternalMyDsl.g:657:6: lv_tag_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getTagEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_tag_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"tag",
                    							lv_tag_5_0,
                    							"org.xtext.docker.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRulePort"
    // InternalMyDsl.g:683:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalMyDsl.g:683:45: (iv_rulePort= rulePort EOF )
            // InternalMyDsl.g:684:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalMyDsl.g:690:1: rulePort returns [EObject current=null] : ( () otherlv_1= 'Port' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'protocol' ( (lv_protocol_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_number_4_0 = null;

        AntlrDatatypeRuleToken lv_protocol_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:696:2: ( ( () otherlv_1= 'Port' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'protocol' ( (lv_protocol_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:697:2: ( () otherlv_1= 'Port' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'protocol' ( (lv_protocol_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:697:2: ( () otherlv_1= 'Port' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'protocol' ( (lv_protocol_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:698:3: () otherlv_1= 'Port' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'protocol' ( (lv_protocol_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:698:3: ()
            // InternalMyDsl.g:699:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortAccess().getPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:713:3: (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:714:4: otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getPortAccess().getNumberKeyword_3_0());
                    			
                    // InternalMyDsl.g:718:4: ( (lv_number_4_0= ruleEInt ) )
                    // InternalMyDsl.g:719:5: (lv_number_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:719:5: (lv_number_4_0= ruleEInt )
                    // InternalMyDsl.g:720:6: lv_number_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPortAccess().getNumberEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_number_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPortRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_4_0,
                    							"org.xtext.docker.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:738:3: (otherlv_5= 'protocol' ( (lv_protocol_6_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:739:4: otherlv_5= 'protocol' ( (lv_protocol_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPortAccess().getProtocolKeyword_4_0());
                    			
                    // InternalMyDsl.g:743:4: ( (lv_protocol_6_0= ruleEString ) )
                    // InternalMyDsl.g:744:5: (lv_protocol_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:744:5: (lv_protocol_6_0= ruleEString )
                    // InternalMyDsl.g:745:6: lv_protocol_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPortAccess().getProtocolEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_protocol_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPortRule());
                    						}
                    						set(
                    							current,
                    							"protocol",
                    							lv_protocol_6_0,
                    							"org.xtext.docker.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPortAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleVolume"
    // InternalMyDsl.g:771:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalMyDsl.g:771:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalMyDsl.g:772:2: iv_ruleVolume= ruleVolume EOF
            {
             newCompositeNode(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolume=ruleVolume();

            state._fsp--;

             current =iv_ruleVolume; 
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
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalMyDsl.g:778:1: ruleVolume returns [EObject current=null] : ( () otherlv_1= 'Volume' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'target' ( (lv_target_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_source_4_0 = null;

        AntlrDatatypeRuleToken lv_target_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:784:2: ( ( () otherlv_1= 'Volume' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'target' ( (lv_target_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:785:2: ( () otherlv_1= 'Volume' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'target' ( (lv_target_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:785:2: ( () otherlv_1= 'Volume' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'target' ( (lv_target_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:786:3: () otherlv_1= 'Volume' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'target' ( (lv_target_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:786:3: ()
            // InternalMyDsl.g:787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeAccess().getVolumeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVolumeAccess().getVolumeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:801:3: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:802:4: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getVolumeAccess().getSourceKeyword_3_0());
                    			
                    // InternalMyDsl.g:806:4: ( (lv_source_4_0= ruleEString ) )
                    // InternalMyDsl.g:807:5: (lv_source_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:807:5: (lv_source_4_0= ruleEString )
                    // InternalMyDsl.g:808:6: lv_source_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVolumeAccess().getSourceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_source_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVolumeRule());
                    						}
                    						set(
                    							current,
                    							"source",
                    							lv_source_4_0,
                    							"org.xtext.docker.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:826:3: (otherlv_5= 'target' ( (lv_target_6_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:827:4: otherlv_5= 'target' ( (lv_target_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getVolumeAccess().getTargetKeyword_4_0());
                    			
                    // InternalMyDsl.g:831:4: ( (lv_target_6_0= ruleEString ) )
                    // InternalMyDsl.g:832:5: (lv_target_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:832:5: (lv_target_6_0= ruleEString )
                    // InternalMyDsl.g:833:6: lv_target_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVolumeAccess().getTargetEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_target_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVolumeRule());
                    						}
                    						set(
                    							current,
                    							"target",
                    							lv_target_6_0,
                    							"org.xtext.docker.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVolumeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleNetwork"
    // InternalMyDsl.g:859:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalMyDsl.g:859:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalMyDsl.g:860:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalMyDsl.g:866:1: ruleNetwork returns [EObject current=null] : ( () otherlv_1= 'Network' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driver' ( (lv_driver_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_driver_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:872:2: ( ( () otherlv_1= 'Network' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driver' ( (lv_driver_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:873:2: ( () otherlv_1= 'Network' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driver' ( (lv_driver_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:873:2: ( () otherlv_1= 'Network' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driver' ( (lv_driver_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:874:3: () otherlv_1= 'Network' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'driver' ( (lv_driver_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:874:3: ()
            // InternalMyDsl.g:875:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkAccess().getNetworkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAccess().getNetworkKeyword_1());
            		
            // InternalMyDsl.g:885:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:886:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:886:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:887:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.docker.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:908:3: (otherlv_4= 'driver' ( (lv_driver_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:909:4: otherlv_4= 'driver' ( (lv_driver_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getDriverKeyword_4_0());
                    			
                    // InternalMyDsl.g:913:4: ( (lv_driver_5_0= ruleEString ) )
                    // InternalMyDsl.g:914:5: (lv_driver_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:914:5: (lv_driver_5_0= ruleEString )
                    // InternalMyDsl.g:915:6: lv_driver_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNetworkAccess().getDriverEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_driver_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworkRule());
                    						}
                    						set(
                    							current,
                    							"driver",
                    							lv_driver_5_0,
                    							"org.xtext.docker.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMyDsl.g:941:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDsl.g:941:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDsl.g:942:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalMyDsl.g:948:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:954:2: ( ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:955:2: ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:955:2: ( () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:956:3: () otherlv_1= 'Environment' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:956:3: ()
            // InternalMyDsl.g:957:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            // InternalMyDsl.g:967:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:968:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:968:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:969:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.docker.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:990:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:991:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getValueKeyword_4_0());
                    			
                    // InternalMyDsl.g:995:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalMyDsl.g:996:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:996:5: (lv_value_5_0= ruleEString )
                    // InternalMyDsl.g:997:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.docker.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1023:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1023:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1024:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1030:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1036:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1037:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1037:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1038:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1038:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1039:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000004C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007810000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});

}
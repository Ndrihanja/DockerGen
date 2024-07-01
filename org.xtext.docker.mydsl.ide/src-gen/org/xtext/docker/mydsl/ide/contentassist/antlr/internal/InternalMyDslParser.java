package org.xtext.docker.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.docker.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Compose'", "'{'", "'}'", "'version'", "'service'", "','", "'Service'", "'image'", "'command'", "'depends_on'", "'('", "')'", "'port'", "'volume'", "'network'", "'environment'", "'Image'", "'tag'", "'Port'", "'number'", "'protocol'", "'Volume'", "'source'", "'target'", "'Network'", "'driver'", "'Environment'", "'value'", "'-'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCompose"
    // InternalMyDsl.g:53:1: entryRuleCompose : ruleCompose EOF ;
    public final void entryRuleCompose() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleCompose EOF )
            // InternalMyDsl.g:55:1: ruleCompose EOF
            {
             before(grammarAccess.getComposeRule()); 
            pushFollow(FOLLOW_1);
            ruleCompose();

            state._fsp--;

             after(grammarAccess.getComposeRule()); 
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
    // $ANTLR end "entryRuleCompose"


    // $ANTLR start "ruleCompose"
    // InternalMyDsl.g:62:1: ruleCompose : ( ( rule__Compose__Group__0 ) ) ;
    public final void ruleCompose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Compose__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Compose__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Compose__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Compose__Group__0 )
            {
             before(grammarAccess.getComposeAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Compose__Group__0 )
            // InternalMyDsl.g:69:4: rule__Compose__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compose__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComposeAccess().getGroup()); 

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
    // $ANTLR end "ruleCompose"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleService"
    // InternalMyDsl.g:103:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleService EOF )
            // InternalMyDsl.g:105:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMyDsl.g:112:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Service__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Service__Group__0 )
            // InternalMyDsl.g:119:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleImage"
    // InternalMyDsl.g:128:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleImage EOF )
            // InternalMyDsl.g:130:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalMyDsl.g:137:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Image__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Image__Group__0 )
            // InternalMyDsl.g:144:4: rule__Image__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRulePort"
    // InternalMyDsl.g:153:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulePort EOF )
            // InternalMyDsl.g:155:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalMyDsl.g:162:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Port__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Port__Group__0 )
            // InternalMyDsl.g:169:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleVolume"
    // InternalMyDsl.g:178:1: entryRuleVolume : ruleVolume EOF ;
    public final void entryRuleVolume() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleVolume EOF )
            // InternalMyDsl.g:180:1: ruleVolume EOF
            {
             before(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            ruleVolume();

            state._fsp--;

             after(grammarAccess.getVolumeRule()); 
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
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalMyDsl.g:187:1: ruleVolume : ( ( rule__Volume__Group__0 ) ) ;
    public final void ruleVolume() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Volume__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Volume__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Volume__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Volume__Group__0 )
            {
             before(grammarAccess.getVolumeAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Volume__Group__0 )
            // InternalMyDsl.g:194:4: rule__Volume__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getGroup()); 

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
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleNetwork"
    // InternalMyDsl.g:203:1: entryRuleNetwork : ruleNetwork EOF ;
    public final void entryRuleNetwork() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleNetwork EOF )
            // InternalMyDsl.g:205:1: ruleNetwork EOF
            {
             before(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getNetworkRule()); 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalMyDsl.g:212:1: ruleNetwork : ( ( rule__Network__Group__0 ) ) ;
    public final void ruleNetwork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Network__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Network__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Network__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Network__Group__0 )
            {
             before(grammarAccess.getNetworkAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Network__Group__0 )
            // InternalMyDsl.g:219:4: rule__Network__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getGroup()); 

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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMyDsl.g:228:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleEnvironment EOF )
            // InternalMyDsl.g:230:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalMyDsl.g:237:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Environment__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Environment__Group__0 )
            // InternalMyDsl.g:244:4: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEInt EOF )
            // InternalMyDsl.g:255:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:269:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:277:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:282:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:282:2: ( RULE_STRING )
                    // InternalMyDsl.g:283:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:288:2: ( RULE_ID )
                    // InternalMyDsl.g:289:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Compose__Group__0"
    // InternalMyDsl.g:298:1: rule__Compose__Group__0 : rule__Compose__Group__0__Impl rule__Compose__Group__1 ;
    public final void rule__Compose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:302:1: ( rule__Compose__Group__0__Impl rule__Compose__Group__1 )
            // InternalMyDsl.g:303:2: rule__Compose__Group__0__Impl rule__Compose__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Compose__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group__1();

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
    // $ANTLR end "rule__Compose__Group__0"


    // $ANTLR start "rule__Compose__Group__0__Impl"
    // InternalMyDsl.g:310:1: rule__Compose__Group__0__Impl : ( () ) ;
    public final void rule__Compose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( ( () ) )
            // InternalMyDsl.g:315:1: ( () )
            {
            // InternalMyDsl.g:315:1: ( () )
            // InternalMyDsl.g:316:2: ()
            {
             before(grammarAccess.getComposeAccess().getComposeAction_0()); 
            // InternalMyDsl.g:317:2: ()
            // InternalMyDsl.g:317:3: 
            {
            }

             after(grammarAccess.getComposeAccess().getComposeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compose__Group__0__Impl"


    // $ANTLR start "rule__Compose__Group__1"
    // InternalMyDsl.g:325:1: rule__Compose__Group__1 : rule__Compose__Group__1__Impl rule__Compose__Group__2 ;
    public final void rule__Compose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:329:1: ( rule__Compose__Group__1__Impl rule__Compose__Group__2 )
            // InternalMyDsl.g:330:2: rule__Compose__Group__1__Impl rule__Compose__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Compose__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group__2();

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
    // $ANTLR end "rule__Compose__Group__1"


    // $ANTLR start "rule__Compose__Group__1__Impl"
    // InternalMyDsl.g:337:1: rule__Compose__Group__1__Impl : ( 'Compose' ) ;
    public final void rule__Compose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( ( 'Compose' ) )
            // InternalMyDsl.g:342:1: ( 'Compose' )
            {
            // InternalMyDsl.g:342:1: ( 'Compose' )
            // InternalMyDsl.g:343:2: 'Compose'
            {
             before(grammarAccess.getComposeAccess().getComposeKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getComposeAccess().getComposeKeyword_1()); 

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
    // $ANTLR end "rule__Compose__Group__1__Impl"


    // $ANTLR start "rule__Compose__Group__2"
    // InternalMyDsl.g:352:1: rule__Compose__Group__2 : rule__Compose__Group__2__Impl rule__Compose__Group__3 ;
    public final void rule__Compose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( rule__Compose__Group__2__Impl rule__Compose__Group__3 )
            // InternalMyDsl.g:357:2: rule__Compose__Group__2__Impl rule__Compose__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Compose__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group__3();

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
    // $ANTLR end "rule__Compose__Group__2"


    // $ANTLR start "rule__Compose__Group__2__Impl"
    // InternalMyDsl.g:364:1: rule__Compose__Group__2__Impl : ( '{' ) ;
    public final void rule__Compose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( ( '{' ) )
            // InternalMyDsl.g:369:1: ( '{' )
            {
            // InternalMyDsl.g:369:1: ( '{' )
            // InternalMyDsl.g:370:2: '{'
            {
             before(grammarAccess.getComposeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComposeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Compose__Group__2__Impl"


    // $ANTLR start "rule__Compose__Group__3"
    // InternalMyDsl.g:379:1: rule__Compose__Group__3 : rule__Compose__Group__3__Impl rule__Compose__Group__4 ;
    public final void rule__Compose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( rule__Compose__Group__3__Impl rule__Compose__Group__4 )
            // InternalMyDsl.g:384:2: rule__Compose__Group__3__Impl rule__Compose__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Compose__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group__4();

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
    // $ANTLR end "rule__Compose__Group__3"


    // $ANTLR start "rule__Compose__Group__3__Impl"
    // InternalMyDsl.g:391:1: rule__Compose__Group__3__Impl : ( ( rule__Compose__Group_3__0 )? ) ;
    public final void rule__Compose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( ( ( rule__Compose__Group_3__0 )? ) )
            // InternalMyDsl.g:396:1: ( ( rule__Compose__Group_3__0 )? )
            {
            // InternalMyDsl.g:396:1: ( ( rule__Compose__Group_3__0 )? )
            // InternalMyDsl.g:397:2: ( rule__Compose__Group_3__0 )?
            {
             before(grammarAccess.getComposeAccess().getGroup_3()); 
            // InternalMyDsl.g:398:2: ( rule__Compose__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:398:3: rule__Compose__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compose__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComposeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Compose__Group__3__Impl"


    // $ANTLR start "rule__Compose__Group__4"
    // InternalMyDsl.g:406:1: rule__Compose__Group__4 : rule__Compose__Group__4__Impl rule__Compose__Group__5 ;
    public final void rule__Compose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:410:1: ( rule__Compose__Group__4__Impl rule__Compose__Group__5 )
            // InternalMyDsl.g:411:2: rule__Compose__Group__4__Impl rule__Compose__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Compose__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group__5();

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
    // $ANTLR end "rule__Compose__Group__4"


    // $ANTLR start "rule__Compose__Group__4__Impl"
    // InternalMyDsl.g:418:1: rule__Compose__Group__4__Impl : ( ( rule__Compose__Group_4__0 )? ) ;
    public final void rule__Compose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( ( ( rule__Compose__Group_4__0 )? ) )
            // InternalMyDsl.g:423:1: ( ( rule__Compose__Group_4__0 )? )
            {
            // InternalMyDsl.g:423:1: ( ( rule__Compose__Group_4__0 )? )
            // InternalMyDsl.g:424:2: ( rule__Compose__Group_4__0 )?
            {
             before(grammarAccess.getComposeAccess().getGroup_4()); 
            // InternalMyDsl.g:425:2: ( rule__Compose__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:425:3: rule__Compose__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compose__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComposeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Compose__Group__4__Impl"


    // $ANTLR start "rule__Compose__Group__5"
    // InternalMyDsl.g:433:1: rule__Compose__Group__5 : rule__Compose__Group__5__Impl ;
    public final void rule__Compose__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:437:1: ( rule__Compose__Group__5__Impl )
            // InternalMyDsl.g:438:2: rule__Compose__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compose__Group__5__Impl();

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
    // $ANTLR end "rule__Compose__Group__5"


    // $ANTLR start "rule__Compose__Group__5__Impl"
    // InternalMyDsl.g:444:1: rule__Compose__Group__5__Impl : ( '}' ) ;
    public final void rule__Compose__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( ( '}' ) )
            // InternalMyDsl.g:449:1: ( '}' )
            {
            // InternalMyDsl.g:449:1: ( '}' )
            // InternalMyDsl.g:450:2: '}'
            {
             before(grammarAccess.getComposeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComposeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Compose__Group__5__Impl"


    // $ANTLR start "rule__Compose__Group_3__0"
    // InternalMyDsl.g:460:1: rule__Compose__Group_3__0 : rule__Compose__Group_3__0__Impl rule__Compose__Group_3__1 ;
    public final void rule__Compose__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:464:1: ( rule__Compose__Group_3__0__Impl rule__Compose__Group_3__1 )
            // InternalMyDsl.g:465:2: rule__Compose__Group_3__0__Impl rule__Compose__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Compose__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group_3__1();

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
    // $ANTLR end "rule__Compose__Group_3__0"


    // $ANTLR start "rule__Compose__Group_3__0__Impl"
    // InternalMyDsl.g:472:1: rule__Compose__Group_3__0__Impl : ( 'version' ) ;
    public final void rule__Compose__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( ( 'version' ) )
            // InternalMyDsl.g:477:1: ( 'version' )
            {
            // InternalMyDsl.g:477:1: ( 'version' )
            // InternalMyDsl.g:478:2: 'version'
            {
             before(grammarAccess.getComposeAccess().getVersionKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComposeAccess().getVersionKeyword_3_0()); 

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
    // $ANTLR end "rule__Compose__Group_3__0__Impl"


    // $ANTLR start "rule__Compose__Group_3__1"
    // InternalMyDsl.g:487:1: rule__Compose__Group_3__1 : rule__Compose__Group_3__1__Impl ;
    public final void rule__Compose__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:1: ( rule__Compose__Group_3__1__Impl )
            // InternalMyDsl.g:492:2: rule__Compose__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compose__Group_3__1__Impl();

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
    // $ANTLR end "rule__Compose__Group_3__1"


    // $ANTLR start "rule__Compose__Group_3__1__Impl"
    // InternalMyDsl.g:498:1: rule__Compose__Group_3__1__Impl : ( ( rule__Compose__VersionAssignment_3_1 ) ) ;
    public final void rule__Compose__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( ( ( rule__Compose__VersionAssignment_3_1 ) ) )
            // InternalMyDsl.g:503:1: ( ( rule__Compose__VersionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:503:1: ( ( rule__Compose__VersionAssignment_3_1 ) )
            // InternalMyDsl.g:504:2: ( rule__Compose__VersionAssignment_3_1 )
            {
             before(grammarAccess.getComposeAccess().getVersionAssignment_3_1()); 
            // InternalMyDsl.g:505:2: ( rule__Compose__VersionAssignment_3_1 )
            // InternalMyDsl.g:505:3: rule__Compose__VersionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Compose__VersionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComposeAccess().getVersionAssignment_3_1()); 

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
    // $ANTLR end "rule__Compose__Group_3__1__Impl"


    // $ANTLR start "rule__Compose__Group_4__0"
    // InternalMyDsl.g:514:1: rule__Compose__Group_4__0 : rule__Compose__Group_4__0__Impl rule__Compose__Group_4__1 ;
    public final void rule__Compose__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( rule__Compose__Group_4__0__Impl rule__Compose__Group_4__1 )
            // InternalMyDsl.g:519:2: rule__Compose__Group_4__0__Impl rule__Compose__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Compose__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group_4__1();

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
    // $ANTLR end "rule__Compose__Group_4__0"


    // $ANTLR start "rule__Compose__Group_4__0__Impl"
    // InternalMyDsl.g:526:1: rule__Compose__Group_4__0__Impl : ( 'service' ) ;
    public final void rule__Compose__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( ( 'service' ) )
            // InternalMyDsl.g:531:1: ( 'service' )
            {
            // InternalMyDsl.g:531:1: ( 'service' )
            // InternalMyDsl.g:532:2: 'service'
            {
             before(grammarAccess.getComposeAccess().getServiceKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComposeAccess().getServiceKeyword_4_0()); 

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
    // $ANTLR end "rule__Compose__Group_4__0__Impl"


    // $ANTLR start "rule__Compose__Group_4__1"
    // InternalMyDsl.g:541:1: rule__Compose__Group_4__1 : rule__Compose__Group_4__1__Impl rule__Compose__Group_4__2 ;
    public final void rule__Compose__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( rule__Compose__Group_4__1__Impl rule__Compose__Group_4__2 )
            // InternalMyDsl.g:546:2: rule__Compose__Group_4__1__Impl rule__Compose__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Compose__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group_4__2();

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
    // $ANTLR end "rule__Compose__Group_4__1"


    // $ANTLR start "rule__Compose__Group_4__1__Impl"
    // InternalMyDsl.g:553:1: rule__Compose__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Compose__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( ( '{' ) )
            // InternalMyDsl.g:558:1: ( '{' )
            {
            // InternalMyDsl.g:558:1: ( '{' )
            // InternalMyDsl.g:559:2: '{'
            {
             before(grammarAccess.getComposeAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComposeAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Compose__Group_4__1__Impl"


    // $ANTLR start "rule__Compose__Group_4__2"
    // InternalMyDsl.g:568:1: rule__Compose__Group_4__2 : rule__Compose__Group_4__2__Impl rule__Compose__Group_4__3 ;
    public final void rule__Compose__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( rule__Compose__Group_4__2__Impl rule__Compose__Group_4__3 )
            // InternalMyDsl.g:573:2: rule__Compose__Group_4__2__Impl rule__Compose__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Compose__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group_4__3();

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
    // $ANTLR end "rule__Compose__Group_4__2"


    // $ANTLR start "rule__Compose__Group_4__2__Impl"
    // InternalMyDsl.g:580:1: rule__Compose__Group_4__2__Impl : ( ( rule__Compose__ServiceAssignment_4_2 ) ) ;
    public final void rule__Compose__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( ( ( rule__Compose__ServiceAssignment_4_2 ) ) )
            // InternalMyDsl.g:585:1: ( ( rule__Compose__ServiceAssignment_4_2 ) )
            {
            // InternalMyDsl.g:585:1: ( ( rule__Compose__ServiceAssignment_4_2 ) )
            // InternalMyDsl.g:586:2: ( rule__Compose__ServiceAssignment_4_2 )
            {
             before(grammarAccess.getComposeAccess().getServiceAssignment_4_2()); 
            // InternalMyDsl.g:587:2: ( rule__Compose__ServiceAssignment_4_2 )
            // InternalMyDsl.g:587:3: rule__Compose__ServiceAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Compose__ServiceAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComposeAccess().getServiceAssignment_4_2()); 

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
    // $ANTLR end "rule__Compose__Group_4__2__Impl"


    // $ANTLR start "rule__Compose__Group_4__3"
    // InternalMyDsl.g:595:1: rule__Compose__Group_4__3 : rule__Compose__Group_4__3__Impl rule__Compose__Group_4__4 ;
    public final void rule__Compose__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( rule__Compose__Group_4__3__Impl rule__Compose__Group_4__4 )
            // InternalMyDsl.g:600:2: rule__Compose__Group_4__3__Impl rule__Compose__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Compose__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group_4__4();

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
    // $ANTLR end "rule__Compose__Group_4__3"


    // $ANTLR start "rule__Compose__Group_4__3__Impl"
    // InternalMyDsl.g:607:1: rule__Compose__Group_4__3__Impl : ( ( rule__Compose__Group_4_3__0 )* ) ;
    public final void rule__Compose__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( ( ( rule__Compose__Group_4_3__0 )* ) )
            // InternalMyDsl.g:612:1: ( ( rule__Compose__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:612:1: ( ( rule__Compose__Group_4_3__0 )* )
            // InternalMyDsl.g:613:2: ( rule__Compose__Group_4_3__0 )*
            {
             before(grammarAccess.getComposeAccess().getGroup_4_3()); 
            // InternalMyDsl.g:614:2: ( rule__Compose__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:614:3: rule__Compose__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Compose__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getComposeAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Compose__Group_4__3__Impl"


    // $ANTLR start "rule__Compose__Group_4__4"
    // InternalMyDsl.g:622:1: rule__Compose__Group_4__4 : rule__Compose__Group_4__4__Impl ;
    public final void rule__Compose__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( rule__Compose__Group_4__4__Impl )
            // InternalMyDsl.g:627:2: rule__Compose__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compose__Group_4__4__Impl();

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
    // $ANTLR end "rule__Compose__Group_4__4"


    // $ANTLR start "rule__Compose__Group_4__4__Impl"
    // InternalMyDsl.g:633:1: rule__Compose__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Compose__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( ( '}' ) )
            // InternalMyDsl.g:638:1: ( '}' )
            {
            // InternalMyDsl.g:638:1: ( '}' )
            // InternalMyDsl.g:639:2: '}'
            {
             before(grammarAccess.getComposeAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComposeAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Compose__Group_4__4__Impl"


    // $ANTLR start "rule__Compose__Group_4_3__0"
    // InternalMyDsl.g:649:1: rule__Compose__Group_4_3__0 : rule__Compose__Group_4_3__0__Impl rule__Compose__Group_4_3__1 ;
    public final void rule__Compose__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( rule__Compose__Group_4_3__0__Impl rule__Compose__Group_4_3__1 )
            // InternalMyDsl.g:654:2: rule__Compose__Group_4_3__0__Impl rule__Compose__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Compose__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compose__Group_4_3__1();

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
    // $ANTLR end "rule__Compose__Group_4_3__0"


    // $ANTLR start "rule__Compose__Group_4_3__0__Impl"
    // InternalMyDsl.g:661:1: rule__Compose__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Compose__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( ( ',' ) )
            // InternalMyDsl.g:666:1: ( ',' )
            {
            // InternalMyDsl.g:666:1: ( ',' )
            // InternalMyDsl.g:667:2: ','
            {
             before(grammarAccess.getComposeAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComposeAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Compose__Group_4_3__0__Impl"


    // $ANTLR start "rule__Compose__Group_4_3__1"
    // InternalMyDsl.g:676:1: rule__Compose__Group_4_3__1 : rule__Compose__Group_4_3__1__Impl ;
    public final void rule__Compose__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( rule__Compose__Group_4_3__1__Impl )
            // InternalMyDsl.g:681:2: rule__Compose__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compose__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Compose__Group_4_3__1"


    // $ANTLR start "rule__Compose__Group_4_3__1__Impl"
    // InternalMyDsl.g:687:1: rule__Compose__Group_4_3__1__Impl : ( ( rule__Compose__ServiceAssignment_4_3_1 ) ) ;
    public final void rule__Compose__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( ( ( rule__Compose__ServiceAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:692:1: ( ( rule__Compose__ServiceAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:692:1: ( ( rule__Compose__ServiceAssignment_4_3_1 ) )
            // InternalMyDsl.g:693:2: ( rule__Compose__ServiceAssignment_4_3_1 )
            {
             before(grammarAccess.getComposeAccess().getServiceAssignment_4_3_1()); 
            // InternalMyDsl.g:694:2: ( rule__Compose__ServiceAssignment_4_3_1 )
            // InternalMyDsl.g:694:3: rule__Compose__ServiceAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Compose__ServiceAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComposeAccess().getServiceAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Compose__Group_4_3__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalMyDsl.g:703:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalMyDsl.g:708:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalMyDsl.g:715:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( 'Service' ) )
            // InternalMyDsl.g:720:1: ( 'Service' )
            {
            // InternalMyDsl.g:720:1: ( 'Service' )
            // InternalMyDsl.g:721:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalMyDsl.g:730:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalMyDsl.g:735:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalMyDsl.g:742:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalMyDsl.g:747:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:747:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalMyDsl.g:748:2: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:749:2: ( rule__Service__NameAssignment_1 )
            // InternalMyDsl.g:749:3: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalMyDsl.g:757:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalMyDsl.g:762:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalMyDsl.g:769:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( ( '{' ) )
            // InternalMyDsl.g:774:1: ( '{' )
            {
            // InternalMyDsl.g:774:1: ( '{' )
            // InternalMyDsl.g:775:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalMyDsl.g:784:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalMyDsl.g:789:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalMyDsl.g:796:1: rule__Service__Group__3__Impl : ( ( rule__Service__Group_3__0 )? ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( ( ( rule__Service__Group_3__0 )? ) )
            // InternalMyDsl.g:801:1: ( ( rule__Service__Group_3__0 )? )
            {
            // InternalMyDsl.g:801:1: ( ( rule__Service__Group_3__0 )? )
            // InternalMyDsl.g:802:2: ( rule__Service__Group_3__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_3()); 
            // InternalMyDsl.g:803:2: ( rule__Service__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:803:3: rule__Service__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalMyDsl.g:811:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalMyDsl.g:816:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalMyDsl.g:823:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )? ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( ( rule__Service__Group_4__0 )? ) )
            // InternalMyDsl.g:828:1: ( ( rule__Service__Group_4__0 )? )
            {
            // InternalMyDsl.g:828:1: ( ( rule__Service__Group_4__0 )? )
            // InternalMyDsl.g:829:2: ( rule__Service__Group_4__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_4()); 
            // InternalMyDsl.g:830:2: ( rule__Service__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:830:3: rule__Service__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalMyDsl.g:838:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalMyDsl.g:843:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

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
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalMyDsl.g:850:1: rule__Service__Group__5__Impl : ( 'image' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( 'image' ) )
            // InternalMyDsl.g:855:1: ( 'image' )
            {
            // InternalMyDsl.g:855:1: ( 'image' )
            // InternalMyDsl.g:856:2: 'image'
            {
             before(grammarAccess.getServiceAccess().getImageKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getImageKeyword_5()); 

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
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalMyDsl.g:865:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalMyDsl.g:870:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

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
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalMyDsl.g:877:1: rule__Service__Group__6__Impl : ( ( rule__Service__ImageAssignment_6 ) ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( ( ( rule__Service__ImageAssignment_6 ) ) )
            // InternalMyDsl.g:882:1: ( ( rule__Service__ImageAssignment_6 ) )
            {
            // InternalMyDsl.g:882:1: ( ( rule__Service__ImageAssignment_6 ) )
            // InternalMyDsl.g:883:2: ( rule__Service__ImageAssignment_6 )
            {
             before(grammarAccess.getServiceAccess().getImageAssignment_6()); 
            // InternalMyDsl.g:884:2: ( rule__Service__ImageAssignment_6 )
            // InternalMyDsl.g:884:3: rule__Service__ImageAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Service__ImageAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getImageAssignment_6()); 

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
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalMyDsl.g:892:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:896:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalMyDsl.g:897:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

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
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalMyDsl.g:904:1: rule__Service__Group__7__Impl : ( ( rule__Service__Group_7__0 )? ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( ( ( rule__Service__Group_7__0 )? ) )
            // InternalMyDsl.g:909:1: ( ( rule__Service__Group_7__0 )? )
            {
            // InternalMyDsl.g:909:1: ( ( rule__Service__Group_7__0 )? )
            // InternalMyDsl.g:910:2: ( rule__Service__Group_7__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_7()); 
            // InternalMyDsl.g:911:2: ( rule__Service__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:911:3: rule__Service__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalMyDsl.g:919:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // InternalMyDsl.g:924:2: rule__Service__Group__8__Impl rule__Service__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__9();

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
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalMyDsl.g:931:1: rule__Service__Group__8__Impl : ( ( rule__Service__Group_8__0 )? ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( ( ( rule__Service__Group_8__0 )? ) )
            // InternalMyDsl.g:936:1: ( ( rule__Service__Group_8__0 )? )
            {
            // InternalMyDsl.g:936:1: ( ( rule__Service__Group_8__0 )? )
            // InternalMyDsl.g:937:2: ( rule__Service__Group_8__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_8()); 
            // InternalMyDsl.g:938:2: ( rule__Service__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:938:3: rule__Service__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group__9"
    // InternalMyDsl.g:946:1: rule__Service__Group__9 : rule__Service__Group__9__Impl rule__Service__Group__10 ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( rule__Service__Group__9__Impl rule__Service__Group__10 )
            // InternalMyDsl.g:951:2: rule__Service__Group__9__Impl rule__Service__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__10();

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
    // $ANTLR end "rule__Service__Group__9"


    // $ANTLR start "rule__Service__Group__9__Impl"
    // InternalMyDsl.g:958:1: rule__Service__Group__9__Impl : ( ( rule__Service__Group_9__0 )? ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( ( ( rule__Service__Group_9__0 )? ) )
            // InternalMyDsl.g:963:1: ( ( rule__Service__Group_9__0 )? )
            {
            // InternalMyDsl.g:963:1: ( ( rule__Service__Group_9__0 )? )
            // InternalMyDsl.g:964:2: ( rule__Service__Group_9__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_9()); 
            // InternalMyDsl.g:965:2: ( rule__Service__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:965:3: rule__Service__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Service__Group__9__Impl"


    // $ANTLR start "rule__Service__Group__10"
    // InternalMyDsl.g:973:1: rule__Service__Group__10 : rule__Service__Group__10__Impl rule__Service__Group__11 ;
    public final void rule__Service__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( rule__Service__Group__10__Impl rule__Service__Group__11 )
            // InternalMyDsl.g:978:2: rule__Service__Group__10__Impl rule__Service__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__11();

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
    // $ANTLR end "rule__Service__Group__10"


    // $ANTLR start "rule__Service__Group__10__Impl"
    // InternalMyDsl.g:985:1: rule__Service__Group__10__Impl : ( ( rule__Service__Group_10__0 )? ) ;
    public final void rule__Service__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( ( ( rule__Service__Group_10__0 )? ) )
            // InternalMyDsl.g:990:1: ( ( rule__Service__Group_10__0 )? )
            {
            // InternalMyDsl.g:990:1: ( ( rule__Service__Group_10__0 )? )
            // InternalMyDsl.g:991:2: ( rule__Service__Group_10__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_10()); 
            // InternalMyDsl.g:992:2: ( rule__Service__Group_10__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:992:3: rule__Service__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Service__Group__10__Impl"


    // $ANTLR start "rule__Service__Group__11"
    // InternalMyDsl.g:1000:1: rule__Service__Group__11 : rule__Service__Group__11__Impl ;
    public final void rule__Service__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( rule__Service__Group__11__Impl )
            // InternalMyDsl.g:1005:2: rule__Service__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__11__Impl();

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
    // $ANTLR end "rule__Service__Group__11"


    // $ANTLR start "rule__Service__Group__11__Impl"
    // InternalMyDsl.g:1011:1: rule__Service__Group__11__Impl : ( '}' ) ;
    public final void rule__Service__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( ( '}' ) )
            // InternalMyDsl.g:1016:1: ( '}' )
            {
            // InternalMyDsl.g:1016:1: ( '}' )
            // InternalMyDsl.g:1017:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Service__Group__11__Impl"


    // $ANTLR start "rule__Service__Group_3__0"
    // InternalMyDsl.g:1027:1: rule__Service__Group_3__0 : rule__Service__Group_3__0__Impl rule__Service__Group_3__1 ;
    public final void rule__Service__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( rule__Service__Group_3__0__Impl rule__Service__Group_3__1 )
            // InternalMyDsl.g:1032:2: rule__Service__Group_3__0__Impl rule__Service__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_3__1();

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
    // $ANTLR end "rule__Service__Group_3__0"


    // $ANTLR start "rule__Service__Group_3__0__Impl"
    // InternalMyDsl.g:1039:1: rule__Service__Group_3__0__Impl : ( 'command' ) ;
    public final void rule__Service__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( ( 'command' ) )
            // InternalMyDsl.g:1044:1: ( 'command' )
            {
            // InternalMyDsl.g:1044:1: ( 'command' )
            // InternalMyDsl.g:1045:2: 'command'
            {
             before(grammarAccess.getServiceAccess().getCommandKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommandKeyword_3_0()); 

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
    // $ANTLR end "rule__Service__Group_3__0__Impl"


    // $ANTLR start "rule__Service__Group_3__1"
    // InternalMyDsl.g:1054:1: rule__Service__Group_3__1 : rule__Service__Group_3__1__Impl ;
    public final void rule__Service__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( rule__Service__Group_3__1__Impl )
            // InternalMyDsl.g:1059:2: rule__Service__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_3__1__Impl();

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
    // $ANTLR end "rule__Service__Group_3__1"


    // $ANTLR start "rule__Service__Group_3__1__Impl"
    // InternalMyDsl.g:1065:1: rule__Service__Group_3__1__Impl : ( ( rule__Service__CommandAssignment_3_1 ) ) ;
    public final void rule__Service__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( ( ( rule__Service__CommandAssignment_3_1 ) ) )
            // InternalMyDsl.g:1070:1: ( ( rule__Service__CommandAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1070:1: ( ( rule__Service__CommandAssignment_3_1 ) )
            // InternalMyDsl.g:1071:2: ( rule__Service__CommandAssignment_3_1 )
            {
             before(grammarAccess.getServiceAccess().getCommandAssignment_3_1()); 
            // InternalMyDsl.g:1072:2: ( rule__Service__CommandAssignment_3_1 )
            // InternalMyDsl.g:1072:3: rule__Service__CommandAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__CommandAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCommandAssignment_3_1()); 

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
    // $ANTLR end "rule__Service__Group_3__1__Impl"


    // $ANTLR start "rule__Service__Group_4__0"
    // InternalMyDsl.g:1081:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // InternalMyDsl.g:1086:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Service__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__1();

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
    // $ANTLR end "rule__Service__Group_4__0"


    // $ANTLR start "rule__Service__Group_4__0__Impl"
    // InternalMyDsl.g:1093:1: rule__Service__Group_4__0__Impl : ( 'depends_on' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( ( 'depends_on' ) )
            // InternalMyDsl.g:1098:1: ( 'depends_on' )
            {
            // InternalMyDsl.g:1098:1: ( 'depends_on' )
            // InternalMyDsl.g:1099:2: 'depends_on'
            {
             before(grammarAccess.getServiceAccess().getDepends_onKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getDepends_onKeyword_4_0()); 

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
    // $ANTLR end "rule__Service__Group_4__0__Impl"


    // $ANTLR start "rule__Service__Group_4__1"
    // InternalMyDsl.g:1108:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl rule__Service__Group_4__2 ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( rule__Service__Group_4__1__Impl rule__Service__Group_4__2 )
            // InternalMyDsl.g:1113:2: rule__Service__Group_4__1__Impl rule__Service__Group_4__2
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__2();

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
    // $ANTLR end "rule__Service__Group_4__1"


    // $ANTLR start "rule__Service__Group_4__1__Impl"
    // InternalMyDsl.g:1120:1: rule__Service__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( '(' ) )
            // InternalMyDsl.g:1125:1: ( '(' )
            {
            // InternalMyDsl.g:1125:1: ( '(' )
            // InternalMyDsl.g:1126:2: '('
            {
             before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__Service__Group_4__1__Impl"


    // $ANTLR start "rule__Service__Group_4__2"
    // InternalMyDsl.g:1135:1: rule__Service__Group_4__2 : rule__Service__Group_4__2__Impl rule__Service__Group_4__3 ;
    public final void rule__Service__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__Service__Group_4__2__Impl rule__Service__Group_4__3 )
            // InternalMyDsl.g:1140:2: rule__Service__Group_4__2__Impl rule__Service__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__Service__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__3();

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
    // $ANTLR end "rule__Service__Group_4__2"


    // $ANTLR start "rule__Service__Group_4__2__Impl"
    // InternalMyDsl.g:1147:1: rule__Service__Group_4__2__Impl : ( ( rule__Service__Depends_onAssignment_4_2 ) ) ;
    public final void rule__Service__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( ( ( rule__Service__Depends_onAssignment_4_2 ) ) )
            // InternalMyDsl.g:1152:1: ( ( rule__Service__Depends_onAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1152:1: ( ( rule__Service__Depends_onAssignment_4_2 ) )
            // InternalMyDsl.g:1153:2: ( rule__Service__Depends_onAssignment_4_2 )
            {
             before(grammarAccess.getServiceAccess().getDepends_onAssignment_4_2()); 
            // InternalMyDsl.g:1154:2: ( rule__Service__Depends_onAssignment_4_2 )
            // InternalMyDsl.g:1154:3: rule__Service__Depends_onAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__Depends_onAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getDepends_onAssignment_4_2()); 

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
    // $ANTLR end "rule__Service__Group_4__2__Impl"


    // $ANTLR start "rule__Service__Group_4__3"
    // InternalMyDsl.g:1162:1: rule__Service__Group_4__3 : rule__Service__Group_4__3__Impl rule__Service__Group_4__4 ;
    public final void rule__Service__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__Service__Group_4__3__Impl rule__Service__Group_4__4 )
            // InternalMyDsl.g:1167:2: rule__Service__Group_4__3__Impl rule__Service__Group_4__4
            {
            pushFollow(FOLLOW_14);
            rule__Service__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4__4();

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
    // $ANTLR end "rule__Service__Group_4__3"


    // $ANTLR start "rule__Service__Group_4__3__Impl"
    // InternalMyDsl.g:1174:1: rule__Service__Group_4__3__Impl : ( ( rule__Service__Group_4_3__0 )* ) ;
    public final void rule__Service__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( ( rule__Service__Group_4_3__0 )* ) )
            // InternalMyDsl.g:1179:1: ( ( rule__Service__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:1179:1: ( ( rule__Service__Group_4_3__0 )* )
            // InternalMyDsl.g:1180:2: ( rule__Service__Group_4_3__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_4_3()); 
            // InternalMyDsl.g:1181:2: ( rule__Service__Group_4_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1181:3: rule__Service__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Service__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Service__Group_4__3__Impl"


    // $ANTLR start "rule__Service__Group_4__4"
    // InternalMyDsl.g:1189:1: rule__Service__Group_4__4 : rule__Service__Group_4__4__Impl ;
    public final void rule__Service__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__Service__Group_4__4__Impl )
            // InternalMyDsl.g:1194:2: rule__Service__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_4__4__Impl();

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
    // $ANTLR end "rule__Service__Group_4__4"


    // $ANTLR start "rule__Service__Group_4__4__Impl"
    // InternalMyDsl.g:1200:1: rule__Service__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Service__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( ')' ) )
            // InternalMyDsl.g:1205:1: ( ')' )
            {
            // InternalMyDsl.g:1205:1: ( ')' )
            // InternalMyDsl.g:1206:2: ')'
            {
             before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_4_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__Service__Group_4__4__Impl"


    // $ANTLR start "rule__Service__Group_4_3__0"
    // InternalMyDsl.g:1216:1: rule__Service__Group_4_3__0 : rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1 ;
    public final void rule__Service__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1 )
            // InternalMyDsl.g:1221:2: rule__Service__Group_4_3__0__Impl rule__Service__Group_4_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_4_3__1();

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
    // $ANTLR end "rule__Service__Group_4_3__0"


    // $ANTLR start "rule__Service__Group_4_3__0__Impl"
    // InternalMyDsl.g:1228:1: rule__Service__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( ',' ) )
            // InternalMyDsl.g:1233:1: ( ',' )
            {
            // InternalMyDsl.g:1233:1: ( ',' )
            // InternalMyDsl.g:1234:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Service__Group_4_3__0__Impl"


    // $ANTLR start "rule__Service__Group_4_3__1"
    // InternalMyDsl.g:1243:1: rule__Service__Group_4_3__1 : rule__Service__Group_4_3__1__Impl ;
    public final void rule__Service__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( rule__Service__Group_4_3__1__Impl )
            // InternalMyDsl.g:1248:2: rule__Service__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Service__Group_4_3__1"


    // $ANTLR start "rule__Service__Group_4_3__1__Impl"
    // InternalMyDsl.g:1254:1: rule__Service__Group_4_3__1__Impl : ( ( rule__Service__Depends_onAssignment_4_3_1 ) ) ;
    public final void rule__Service__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( ( rule__Service__Depends_onAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:1259:1: ( ( rule__Service__Depends_onAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:1259:1: ( ( rule__Service__Depends_onAssignment_4_3_1 ) )
            // InternalMyDsl.g:1260:2: ( rule__Service__Depends_onAssignment_4_3_1 )
            {
             before(grammarAccess.getServiceAccess().getDepends_onAssignment_4_3_1()); 
            // InternalMyDsl.g:1261:2: ( rule__Service__Depends_onAssignment_4_3_1 )
            // InternalMyDsl.g:1261:3: rule__Service__Depends_onAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__Depends_onAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getDepends_onAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Service__Group_4_3__1__Impl"


    // $ANTLR start "rule__Service__Group_7__0"
    // InternalMyDsl.g:1270:1: rule__Service__Group_7__0 : rule__Service__Group_7__0__Impl rule__Service__Group_7__1 ;
    public final void rule__Service__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( rule__Service__Group_7__0__Impl rule__Service__Group_7__1 )
            // InternalMyDsl.g:1275:2: rule__Service__Group_7__0__Impl rule__Service__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_7__1();

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
    // $ANTLR end "rule__Service__Group_7__0"


    // $ANTLR start "rule__Service__Group_7__0__Impl"
    // InternalMyDsl.g:1282:1: rule__Service__Group_7__0__Impl : ( 'port' ) ;
    public final void rule__Service__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( ( 'port' ) )
            // InternalMyDsl.g:1287:1: ( 'port' )
            {
            // InternalMyDsl.g:1287:1: ( 'port' )
            // InternalMyDsl.g:1288:2: 'port'
            {
             before(grammarAccess.getServiceAccess().getPortKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPortKeyword_7_0()); 

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
    // $ANTLR end "rule__Service__Group_7__0__Impl"


    // $ANTLR start "rule__Service__Group_7__1"
    // InternalMyDsl.g:1297:1: rule__Service__Group_7__1 : rule__Service__Group_7__1__Impl rule__Service__Group_7__2 ;
    public final void rule__Service__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( rule__Service__Group_7__1__Impl rule__Service__Group_7__2 )
            // InternalMyDsl.g:1302:2: rule__Service__Group_7__1__Impl rule__Service__Group_7__2
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_7__2();

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
    // $ANTLR end "rule__Service__Group_7__1"


    // $ANTLR start "rule__Service__Group_7__1__Impl"
    // InternalMyDsl.g:1309:1: rule__Service__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Service__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( '{' ) )
            // InternalMyDsl.g:1314:1: ( '{' )
            {
            // InternalMyDsl.g:1314:1: ( '{' )
            // InternalMyDsl.g:1315:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__Service__Group_7__1__Impl"


    // $ANTLR start "rule__Service__Group_7__2"
    // InternalMyDsl.g:1324:1: rule__Service__Group_7__2 : rule__Service__Group_7__2__Impl rule__Service__Group_7__3 ;
    public final void rule__Service__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__Service__Group_7__2__Impl rule__Service__Group_7__3 )
            // InternalMyDsl.g:1329:2: rule__Service__Group_7__2__Impl rule__Service__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_7__3();

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
    // $ANTLR end "rule__Service__Group_7__2"


    // $ANTLR start "rule__Service__Group_7__2__Impl"
    // InternalMyDsl.g:1336:1: rule__Service__Group_7__2__Impl : ( ( rule__Service__PortAssignment_7_2 ) ) ;
    public final void rule__Service__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( ( ( rule__Service__PortAssignment_7_2 ) ) )
            // InternalMyDsl.g:1341:1: ( ( rule__Service__PortAssignment_7_2 ) )
            {
            // InternalMyDsl.g:1341:1: ( ( rule__Service__PortAssignment_7_2 ) )
            // InternalMyDsl.g:1342:2: ( rule__Service__PortAssignment_7_2 )
            {
             before(grammarAccess.getServiceAccess().getPortAssignment_7_2()); 
            // InternalMyDsl.g:1343:2: ( rule__Service__PortAssignment_7_2 )
            // InternalMyDsl.g:1343:3: rule__Service__PortAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__PortAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getPortAssignment_7_2()); 

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
    // $ANTLR end "rule__Service__Group_7__2__Impl"


    // $ANTLR start "rule__Service__Group_7__3"
    // InternalMyDsl.g:1351:1: rule__Service__Group_7__3 : rule__Service__Group_7__3__Impl rule__Service__Group_7__4 ;
    public final void rule__Service__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( rule__Service__Group_7__3__Impl rule__Service__Group_7__4 )
            // InternalMyDsl.g:1356:2: rule__Service__Group_7__3__Impl rule__Service__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_7__4();

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
    // $ANTLR end "rule__Service__Group_7__3"


    // $ANTLR start "rule__Service__Group_7__3__Impl"
    // InternalMyDsl.g:1363:1: rule__Service__Group_7__3__Impl : ( ( rule__Service__Group_7_3__0 )* ) ;
    public final void rule__Service__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( ( rule__Service__Group_7_3__0 )* ) )
            // InternalMyDsl.g:1368:1: ( ( rule__Service__Group_7_3__0 )* )
            {
            // InternalMyDsl.g:1368:1: ( ( rule__Service__Group_7_3__0 )* )
            // InternalMyDsl.g:1369:2: ( rule__Service__Group_7_3__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_7_3()); 
            // InternalMyDsl.g:1370:2: ( rule__Service__Group_7_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1370:3: rule__Service__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Service__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__Service__Group_7__3__Impl"


    // $ANTLR start "rule__Service__Group_7__4"
    // InternalMyDsl.g:1378:1: rule__Service__Group_7__4 : rule__Service__Group_7__4__Impl ;
    public final void rule__Service__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( rule__Service__Group_7__4__Impl )
            // InternalMyDsl.g:1383:2: rule__Service__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_7__4__Impl();

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
    // $ANTLR end "rule__Service__Group_7__4"


    // $ANTLR start "rule__Service__Group_7__4__Impl"
    // InternalMyDsl.g:1389:1: rule__Service__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Service__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( '}' ) )
            // InternalMyDsl.g:1394:1: ( '}' )
            {
            // InternalMyDsl.g:1394:1: ( '}' )
            // InternalMyDsl.g:1395:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__Service__Group_7__4__Impl"


    // $ANTLR start "rule__Service__Group_7_3__0"
    // InternalMyDsl.g:1405:1: rule__Service__Group_7_3__0 : rule__Service__Group_7_3__0__Impl rule__Service__Group_7_3__1 ;
    public final void rule__Service__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( rule__Service__Group_7_3__0__Impl rule__Service__Group_7_3__1 )
            // InternalMyDsl.g:1410:2: rule__Service__Group_7_3__0__Impl rule__Service__Group_7_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Service__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_7_3__1();

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
    // $ANTLR end "rule__Service__Group_7_3__0"


    // $ANTLR start "rule__Service__Group_7_3__0__Impl"
    // InternalMyDsl.g:1417:1: rule__Service__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( ( ',' ) )
            // InternalMyDsl.g:1422:1: ( ',' )
            {
            // InternalMyDsl.g:1422:1: ( ',' )
            // InternalMyDsl.g:1423:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_7_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__Service__Group_7_3__0__Impl"


    // $ANTLR start "rule__Service__Group_7_3__1"
    // InternalMyDsl.g:1432:1: rule__Service__Group_7_3__1 : rule__Service__Group_7_3__1__Impl ;
    public final void rule__Service__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( rule__Service__Group_7_3__1__Impl )
            // InternalMyDsl.g:1437:2: rule__Service__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Service__Group_7_3__1"


    // $ANTLR start "rule__Service__Group_7_3__1__Impl"
    // InternalMyDsl.g:1443:1: rule__Service__Group_7_3__1__Impl : ( ( rule__Service__PortAssignment_7_3_1 ) ) ;
    public final void rule__Service__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( ( ( rule__Service__PortAssignment_7_3_1 ) ) )
            // InternalMyDsl.g:1448:1: ( ( rule__Service__PortAssignment_7_3_1 ) )
            {
            // InternalMyDsl.g:1448:1: ( ( rule__Service__PortAssignment_7_3_1 ) )
            // InternalMyDsl.g:1449:2: ( rule__Service__PortAssignment_7_3_1 )
            {
             before(grammarAccess.getServiceAccess().getPortAssignment_7_3_1()); 
            // InternalMyDsl.g:1450:2: ( rule__Service__PortAssignment_7_3_1 )
            // InternalMyDsl.g:1450:3: rule__Service__PortAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__PortAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getPortAssignment_7_3_1()); 

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
    // $ANTLR end "rule__Service__Group_7_3__1__Impl"


    // $ANTLR start "rule__Service__Group_8__0"
    // InternalMyDsl.g:1459:1: rule__Service__Group_8__0 : rule__Service__Group_8__0__Impl rule__Service__Group_8__1 ;
    public final void rule__Service__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( rule__Service__Group_8__0__Impl rule__Service__Group_8__1 )
            // InternalMyDsl.g:1464:2: rule__Service__Group_8__0__Impl rule__Service__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_8__1();

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
    // $ANTLR end "rule__Service__Group_8__0"


    // $ANTLR start "rule__Service__Group_8__0__Impl"
    // InternalMyDsl.g:1471:1: rule__Service__Group_8__0__Impl : ( 'volume' ) ;
    public final void rule__Service__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( ( 'volume' ) )
            // InternalMyDsl.g:1476:1: ( 'volume' )
            {
            // InternalMyDsl.g:1476:1: ( 'volume' )
            // InternalMyDsl.g:1477:2: 'volume'
            {
             before(grammarAccess.getServiceAccess().getVolumeKeyword_8_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getVolumeKeyword_8_0()); 

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
    // $ANTLR end "rule__Service__Group_8__0__Impl"


    // $ANTLR start "rule__Service__Group_8__1"
    // InternalMyDsl.g:1486:1: rule__Service__Group_8__1 : rule__Service__Group_8__1__Impl rule__Service__Group_8__2 ;
    public final void rule__Service__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( rule__Service__Group_8__1__Impl rule__Service__Group_8__2 )
            // InternalMyDsl.g:1491:2: rule__Service__Group_8__1__Impl rule__Service__Group_8__2
            {
            pushFollow(FOLLOW_16);
            rule__Service__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_8__2();

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
    // $ANTLR end "rule__Service__Group_8__1"


    // $ANTLR start "rule__Service__Group_8__1__Impl"
    // InternalMyDsl.g:1498:1: rule__Service__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Service__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( ( '{' ) )
            // InternalMyDsl.g:1503:1: ( '{' )
            {
            // InternalMyDsl.g:1503:1: ( '{' )
            // InternalMyDsl.g:1504:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__Service__Group_8__1__Impl"


    // $ANTLR start "rule__Service__Group_8__2"
    // InternalMyDsl.g:1513:1: rule__Service__Group_8__2 : rule__Service__Group_8__2__Impl rule__Service__Group_8__3 ;
    public final void rule__Service__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( rule__Service__Group_8__2__Impl rule__Service__Group_8__3 )
            // InternalMyDsl.g:1518:2: rule__Service__Group_8__2__Impl rule__Service__Group_8__3
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_8__3();

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
    // $ANTLR end "rule__Service__Group_8__2"


    // $ANTLR start "rule__Service__Group_8__2__Impl"
    // InternalMyDsl.g:1525:1: rule__Service__Group_8__2__Impl : ( ( rule__Service__VolumeAssignment_8_2 ) ) ;
    public final void rule__Service__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( ( rule__Service__VolumeAssignment_8_2 ) ) )
            // InternalMyDsl.g:1530:1: ( ( rule__Service__VolumeAssignment_8_2 ) )
            {
            // InternalMyDsl.g:1530:1: ( ( rule__Service__VolumeAssignment_8_2 ) )
            // InternalMyDsl.g:1531:2: ( rule__Service__VolumeAssignment_8_2 )
            {
             before(grammarAccess.getServiceAccess().getVolumeAssignment_8_2()); 
            // InternalMyDsl.g:1532:2: ( rule__Service__VolumeAssignment_8_2 )
            // InternalMyDsl.g:1532:3: rule__Service__VolumeAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__VolumeAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getVolumeAssignment_8_2()); 

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
    // $ANTLR end "rule__Service__Group_8__2__Impl"


    // $ANTLR start "rule__Service__Group_8__3"
    // InternalMyDsl.g:1540:1: rule__Service__Group_8__3 : rule__Service__Group_8__3__Impl rule__Service__Group_8__4 ;
    public final void rule__Service__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( rule__Service__Group_8__3__Impl rule__Service__Group_8__4 )
            // InternalMyDsl.g:1545:2: rule__Service__Group_8__3__Impl rule__Service__Group_8__4
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_8__4();

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
    // $ANTLR end "rule__Service__Group_8__3"


    // $ANTLR start "rule__Service__Group_8__3__Impl"
    // InternalMyDsl.g:1552:1: rule__Service__Group_8__3__Impl : ( ( rule__Service__Group_8_3__0 )* ) ;
    public final void rule__Service__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( ( ( rule__Service__Group_8_3__0 )* ) )
            // InternalMyDsl.g:1557:1: ( ( rule__Service__Group_8_3__0 )* )
            {
            // InternalMyDsl.g:1557:1: ( ( rule__Service__Group_8_3__0 )* )
            // InternalMyDsl.g:1558:2: ( rule__Service__Group_8_3__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_8_3()); 
            // InternalMyDsl.g:1559:2: ( rule__Service__Group_8_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1559:3: rule__Service__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Service__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_8_3()); 

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
    // $ANTLR end "rule__Service__Group_8__3__Impl"


    // $ANTLR start "rule__Service__Group_8__4"
    // InternalMyDsl.g:1567:1: rule__Service__Group_8__4 : rule__Service__Group_8__4__Impl ;
    public final void rule__Service__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( rule__Service__Group_8__4__Impl )
            // InternalMyDsl.g:1572:2: rule__Service__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_8__4__Impl();

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
    // $ANTLR end "rule__Service__Group_8__4"


    // $ANTLR start "rule__Service__Group_8__4__Impl"
    // InternalMyDsl.g:1578:1: rule__Service__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Service__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1582:1: ( ( '}' ) )
            // InternalMyDsl.g:1583:1: ( '}' )
            {
            // InternalMyDsl.g:1583:1: ( '}' )
            // InternalMyDsl.g:1584:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__Service__Group_8__4__Impl"


    // $ANTLR start "rule__Service__Group_8_3__0"
    // InternalMyDsl.g:1594:1: rule__Service__Group_8_3__0 : rule__Service__Group_8_3__0__Impl rule__Service__Group_8_3__1 ;
    public final void rule__Service__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( rule__Service__Group_8_3__0__Impl rule__Service__Group_8_3__1 )
            // InternalMyDsl.g:1599:2: rule__Service__Group_8_3__0__Impl rule__Service__Group_8_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Service__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_8_3__1();

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
    // $ANTLR end "rule__Service__Group_8_3__0"


    // $ANTLR start "rule__Service__Group_8_3__0__Impl"
    // InternalMyDsl.g:1606:1: rule__Service__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( ( ',' ) )
            // InternalMyDsl.g:1611:1: ( ',' )
            {
            // InternalMyDsl.g:1611:1: ( ',' )
            // InternalMyDsl.g:1612:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_8_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__Service__Group_8_3__0__Impl"


    // $ANTLR start "rule__Service__Group_8_3__1"
    // InternalMyDsl.g:1621:1: rule__Service__Group_8_3__1 : rule__Service__Group_8_3__1__Impl ;
    public final void rule__Service__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( rule__Service__Group_8_3__1__Impl )
            // InternalMyDsl.g:1626:2: rule__Service__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__Service__Group_8_3__1"


    // $ANTLR start "rule__Service__Group_8_3__1__Impl"
    // InternalMyDsl.g:1632:1: rule__Service__Group_8_3__1__Impl : ( ( rule__Service__VolumeAssignment_8_3_1 ) ) ;
    public final void rule__Service__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( ( ( rule__Service__VolumeAssignment_8_3_1 ) ) )
            // InternalMyDsl.g:1637:1: ( ( rule__Service__VolumeAssignment_8_3_1 ) )
            {
            // InternalMyDsl.g:1637:1: ( ( rule__Service__VolumeAssignment_8_3_1 ) )
            // InternalMyDsl.g:1638:2: ( rule__Service__VolumeAssignment_8_3_1 )
            {
             before(grammarAccess.getServiceAccess().getVolumeAssignment_8_3_1()); 
            // InternalMyDsl.g:1639:2: ( rule__Service__VolumeAssignment_8_3_1 )
            // InternalMyDsl.g:1639:3: rule__Service__VolumeAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__VolumeAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getVolumeAssignment_8_3_1()); 

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
    // $ANTLR end "rule__Service__Group_8_3__1__Impl"


    // $ANTLR start "rule__Service__Group_9__0"
    // InternalMyDsl.g:1648:1: rule__Service__Group_9__0 : rule__Service__Group_9__0__Impl rule__Service__Group_9__1 ;
    public final void rule__Service__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__Service__Group_9__0__Impl rule__Service__Group_9__1 )
            // InternalMyDsl.g:1653:2: rule__Service__Group_9__0__Impl rule__Service__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_9__1();

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
    // $ANTLR end "rule__Service__Group_9__0"


    // $ANTLR start "rule__Service__Group_9__0__Impl"
    // InternalMyDsl.g:1660:1: rule__Service__Group_9__0__Impl : ( 'network' ) ;
    public final void rule__Service__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( ( 'network' ) )
            // InternalMyDsl.g:1665:1: ( 'network' )
            {
            // InternalMyDsl.g:1665:1: ( 'network' )
            // InternalMyDsl.g:1666:2: 'network'
            {
             before(grammarAccess.getServiceAccess().getNetworkKeyword_9_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getNetworkKeyword_9_0()); 

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
    // $ANTLR end "rule__Service__Group_9__0__Impl"


    // $ANTLR start "rule__Service__Group_9__1"
    // InternalMyDsl.g:1675:1: rule__Service__Group_9__1 : rule__Service__Group_9__1__Impl rule__Service__Group_9__2 ;
    public final void rule__Service__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__Service__Group_9__1__Impl rule__Service__Group_9__2 )
            // InternalMyDsl.g:1680:2: rule__Service__Group_9__1__Impl rule__Service__Group_9__2
            {
            pushFollow(FOLLOW_17);
            rule__Service__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_9__2();

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
    // $ANTLR end "rule__Service__Group_9__1"


    // $ANTLR start "rule__Service__Group_9__1__Impl"
    // InternalMyDsl.g:1687:1: rule__Service__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Service__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( ( '{' ) )
            // InternalMyDsl.g:1692:1: ( '{' )
            {
            // InternalMyDsl.g:1692:1: ( '{' )
            // InternalMyDsl.g:1693:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_9_1()); 

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
    // $ANTLR end "rule__Service__Group_9__1__Impl"


    // $ANTLR start "rule__Service__Group_9__2"
    // InternalMyDsl.g:1702:1: rule__Service__Group_9__2 : rule__Service__Group_9__2__Impl rule__Service__Group_9__3 ;
    public final void rule__Service__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__Service__Group_9__2__Impl rule__Service__Group_9__3 )
            // InternalMyDsl.g:1707:2: rule__Service__Group_9__2__Impl rule__Service__Group_9__3
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_9__3();

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
    // $ANTLR end "rule__Service__Group_9__2"


    // $ANTLR start "rule__Service__Group_9__2__Impl"
    // InternalMyDsl.g:1714:1: rule__Service__Group_9__2__Impl : ( ( rule__Service__NetworkAssignment_9_2 ) ) ;
    public final void rule__Service__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( ( rule__Service__NetworkAssignment_9_2 ) ) )
            // InternalMyDsl.g:1719:1: ( ( rule__Service__NetworkAssignment_9_2 ) )
            {
            // InternalMyDsl.g:1719:1: ( ( rule__Service__NetworkAssignment_9_2 ) )
            // InternalMyDsl.g:1720:2: ( rule__Service__NetworkAssignment_9_2 )
            {
             before(grammarAccess.getServiceAccess().getNetworkAssignment_9_2()); 
            // InternalMyDsl.g:1721:2: ( rule__Service__NetworkAssignment_9_2 )
            // InternalMyDsl.g:1721:3: rule__Service__NetworkAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__NetworkAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNetworkAssignment_9_2()); 

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
    // $ANTLR end "rule__Service__Group_9__2__Impl"


    // $ANTLR start "rule__Service__Group_9__3"
    // InternalMyDsl.g:1729:1: rule__Service__Group_9__3 : rule__Service__Group_9__3__Impl rule__Service__Group_9__4 ;
    public final void rule__Service__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__Service__Group_9__3__Impl rule__Service__Group_9__4 )
            // InternalMyDsl.g:1734:2: rule__Service__Group_9__3__Impl rule__Service__Group_9__4
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_9__4();

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
    // $ANTLR end "rule__Service__Group_9__3"


    // $ANTLR start "rule__Service__Group_9__3__Impl"
    // InternalMyDsl.g:1741:1: rule__Service__Group_9__3__Impl : ( ( rule__Service__Group_9_3__0 )* ) ;
    public final void rule__Service__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( ( rule__Service__Group_9_3__0 )* ) )
            // InternalMyDsl.g:1746:1: ( ( rule__Service__Group_9_3__0 )* )
            {
            // InternalMyDsl.g:1746:1: ( ( rule__Service__Group_9_3__0 )* )
            // InternalMyDsl.g:1747:2: ( rule__Service__Group_9_3__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_9_3()); 
            // InternalMyDsl.g:1748:2: ( rule__Service__Group_9_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1748:3: rule__Service__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Service__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__Service__Group_9__3__Impl"


    // $ANTLR start "rule__Service__Group_9__4"
    // InternalMyDsl.g:1756:1: rule__Service__Group_9__4 : rule__Service__Group_9__4__Impl ;
    public final void rule__Service__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__Service__Group_9__4__Impl )
            // InternalMyDsl.g:1761:2: rule__Service__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_9__4__Impl();

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
    // $ANTLR end "rule__Service__Group_9__4"


    // $ANTLR start "rule__Service__Group_9__4__Impl"
    // InternalMyDsl.g:1767:1: rule__Service__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Service__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( ( '}' ) )
            // InternalMyDsl.g:1772:1: ( '}' )
            {
            // InternalMyDsl.g:1772:1: ( '}' )
            // InternalMyDsl.g:1773:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_9_4()); 

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
    // $ANTLR end "rule__Service__Group_9__4__Impl"


    // $ANTLR start "rule__Service__Group_9_3__0"
    // InternalMyDsl.g:1783:1: rule__Service__Group_9_3__0 : rule__Service__Group_9_3__0__Impl rule__Service__Group_9_3__1 ;
    public final void rule__Service__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__Service__Group_9_3__0__Impl rule__Service__Group_9_3__1 )
            // InternalMyDsl.g:1788:2: rule__Service__Group_9_3__0__Impl rule__Service__Group_9_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Service__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_9_3__1();

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
    // $ANTLR end "rule__Service__Group_9_3__0"


    // $ANTLR start "rule__Service__Group_9_3__0__Impl"
    // InternalMyDsl.g:1795:1: rule__Service__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( ( ',' ) )
            // InternalMyDsl.g:1800:1: ( ',' )
            {
            // InternalMyDsl.g:1800:1: ( ',' )
            // InternalMyDsl.g:1801:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_9_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__Service__Group_9_3__0__Impl"


    // $ANTLR start "rule__Service__Group_9_3__1"
    // InternalMyDsl.g:1810:1: rule__Service__Group_9_3__1 : rule__Service__Group_9_3__1__Impl ;
    public final void rule__Service__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__Service__Group_9_3__1__Impl )
            // InternalMyDsl.g:1815:2: rule__Service__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__Service__Group_9_3__1"


    // $ANTLR start "rule__Service__Group_9_3__1__Impl"
    // InternalMyDsl.g:1821:1: rule__Service__Group_9_3__1__Impl : ( ( rule__Service__NetworkAssignment_9_3_1 ) ) ;
    public final void rule__Service__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( ( ( rule__Service__NetworkAssignment_9_3_1 ) ) )
            // InternalMyDsl.g:1826:1: ( ( rule__Service__NetworkAssignment_9_3_1 ) )
            {
            // InternalMyDsl.g:1826:1: ( ( rule__Service__NetworkAssignment_9_3_1 ) )
            // InternalMyDsl.g:1827:2: ( rule__Service__NetworkAssignment_9_3_1 )
            {
             before(grammarAccess.getServiceAccess().getNetworkAssignment_9_3_1()); 
            // InternalMyDsl.g:1828:2: ( rule__Service__NetworkAssignment_9_3_1 )
            // InternalMyDsl.g:1828:3: rule__Service__NetworkAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NetworkAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNetworkAssignment_9_3_1()); 

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
    // $ANTLR end "rule__Service__Group_9_3__1__Impl"


    // $ANTLR start "rule__Service__Group_10__0"
    // InternalMyDsl.g:1837:1: rule__Service__Group_10__0 : rule__Service__Group_10__0__Impl rule__Service__Group_10__1 ;
    public final void rule__Service__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__Service__Group_10__0__Impl rule__Service__Group_10__1 )
            // InternalMyDsl.g:1842:2: rule__Service__Group_10__0__Impl rule__Service__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_10__1();

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
    // $ANTLR end "rule__Service__Group_10__0"


    // $ANTLR start "rule__Service__Group_10__0__Impl"
    // InternalMyDsl.g:1849:1: rule__Service__Group_10__0__Impl : ( 'environment' ) ;
    public final void rule__Service__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( ( 'environment' ) )
            // InternalMyDsl.g:1854:1: ( 'environment' )
            {
            // InternalMyDsl.g:1854:1: ( 'environment' )
            // InternalMyDsl.g:1855:2: 'environment'
            {
             before(grammarAccess.getServiceAccess().getEnvironmentKeyword_10_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getEnvironmentKeyword_10_0()); 

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
    // $ANTLR end "rule__Service__Group_10__0__Impl"


    // $ANTLR start "rule__Service__Group_10__1"
    // InternalMyDsl.g:1864:1: rule__Service__Group_10__1 : rule__Service__Group_10__1__Impl rule__Service__Group_10__2 ;
    public final void rule__Service__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__Service__Group_10__1__Impl rule__Service__Group_10__2 )
            // InternalMyDsl.g:1869:2: rule__Service__Group_10__1__Impl rule__Service__Group_10__2
            {
            pushFollow(FOLLOW_18);
            rule__Service__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_10__2();

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
    // $ANTLR end "rule__Service__Group_10__1"


    // $ANTLR start "rule__Service__Group_10__1__Impl"
    // InternalMyDsl.g:1876:1: rule__Service__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Service__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( ( '{' ) )
            // InternalMyDsl.g:1881:1: ( '{' )
            {
            // InternalMyDsl.g:1881:1: ( '{' )
            // InternalMyDsl.g:1882:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__Service__Group_10__1__Impl"


    // $ANTLR start "rule__Service__Group_10__2"
    // InternalMyDsl.g:1891:1: rule__Service__Group_10__2 : rule__Service__Group_10__2__Impl rule__Service__Group_10__3 ;
    public final void rule__Service__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( rule__Service__Group_10__2__Impl rule__Service__Group_10__3 )
            // InternalMyDsl.g:1896:2: rule__Service__Group_10__2__Impl rule__Service__Group_10__3
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_10__3();

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
    // $ANTLR end "rule__Service__Group_10__2"


    // $ANTLR start "rule__Service__Group_10__2__Impl"
    // InternalMyDsl.g:1903:1: rule__Service__Group_10__2__Impl : ( ( rule__Service__EnvironmentAssignment_10_2 ) ) ;
    public final void rule__Service__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( ( rule__Service__EnvironmentAssignment_10_2 ) ) )
            // InternalMyDsl.g:1908:1: ( ( rule__Service__EnvironmentAssignment_10_2 ) )
            {
            // InternalMyDsl.g:1908:1: ( ( rule__Service__EnvironmentAssignment_10_2 ) )
            // InternalMyDsl.g:1909:2: ( rule__Service__EnvironmentAssignment_10_2 )
            {
             before(grammarAccess.getServiceAccess().getEnvironmentAssignment_10_2()); 
            // InternalMyDsl.g:1910:2: ( rule__Service__EnvironmentAssignment_10_2 )
            // InternalMyDsl.g:1910:3: rule__Service__EnvironmentAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Service__EnvironmentAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getEnvironmentAssignment_10_2()); 

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
    // $ANTLR end "rule__Service__Group_10__2__Impl"


    // $ANTLR start "rule__Service__Group_10__3"
    // InternalMyDsl.g:1918:1: rule__Service__Group_10__3 : rule__Service__Group_10__3__Impl rule__Service__Group_10__4 ;
    public final void rule__Service__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( rule__Service__Group_10__3__Impl rule__Service__Group_10__4 )
            // InternalMyDsl.g:1923:2: rule__Service__Group_10__3__Impl rule__Service__Group_10__4
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_10__4();

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
    // $ANTLR end "rule__Service__Group_10__3"


    // $ANTLR start "rule__Service__Group_10__3__Impl"
    // InternalMyDsl.g:1930:1: rule__Service__Group_10__3__Impl : ( ( rule__Service__Group_10_3__0 )* ) ;
    public final void rule__Service__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( ( ( rule__Service__Group_10_3__0 )* ) )
            // InternalMyDsl.g:1935:1: ( ( rule__Service__Group_10_3__0 )* )
            {
            // InternalMyDsl.g:1935:1: ( ( rule__Service__Group_10_3__0 )* )
            // InternalMyDsl.g:1936:2: ( rule__Service__Group_10_3__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_10_3()); 
            // InternalMyDsl.g:1937:2: ( rule__Service__Group_10_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1937:3: rule__Service__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Service__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__Service__Group_10__3__Impl"


    // $ANTLR start "rule__Service__Group_10__4"
    // InternalMyDsl.g:1945:1: rule__Service__Group_10__4 : rule__Service__Group_10__4__Impl ;
    public final void rule__Service__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( rule__Service__Group_10__4__Impl )
            // InternalMyDsl.g:1950:2: rule__Service__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_10__4__Impl();

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
    // $ANTLR end "rule__Service__Group_10__4"


    // $ANTLR start "rule__Service__Group_10__4__Impl"
    // InternalMyDsl.g:1956:1: rule__Service__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Service__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( ( '}' ) )
            // InternalMyDsl.g:1961:1: ( '}' )
            {
            // InternalMyDsl.g:1961:1: ( '}' )
            // InternalMyDsl.g:1962:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__Service__Group_10__4__Impl"


    // $ANTLR start "rule__Service__Group_10_3__0"
    // InternalMyDsl.g:1972:1: rule__Service__Group_10_3__0 : rule__Service__Group_10_3__0__Impl rule__Service__Group_10_3__1 ;
    public final void rule__Service__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( rule__Service__Group_10_3__0__Impl rule__Service__Group_10_3__1 )
            // InternalMyDsl.g:1977:2: rule__Service__Group_10_3__0__Impl rule__Service__Group_10_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Service__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_10_3__1();

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
    // $ANTLR end "rule__Service__Group_10_3__0"


    // $ANTLR start "rule__Service__Group_10_3__0__Impl"
    // InternalMyDsl.g:1984:1: rule__Service__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( ',' ) )
            // InternalMyDsl.g:1989:1: ( ',' )
            {
            // InternalMyDsl.g:1989:1: ( ',' )
            // InternalMyDsl.g:1990:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_10_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__Service__Group_10_3__0__Impl"


    // $ANTLR start "rule__Service__Group_10_3__1"
    // InternalMyDsl.g:1999:1: rule__Service__Group_10_3__1 : rule__Service__Group_10_3__1__Impl ;
    public final void rule__Service__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( rule__Service__Group_10_3__1__Impl )
            // InternalMyDsl.g:2004:2: rule__Service__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__Service__Group_10_3__1"


    // $ANTLR start "rule__Service__Group_10_3__1__Impl"
    // InternalMyDsl.g:2010:1: rule__Service__Group_10_3__1__Impl : ( ( rule__Service__EnvironmentAssignment_10_3_1 ) ) ;
    public final void rule__Service__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( ( ( rule__Service__EnvironmentAssignment_10_3_1 ) ) )
            // InternalMyDsl.g:2015:1: ( ( rule__Service__EnvironmentAssignment_10_3_1 ) )
            {
            // InternalMyDsl.g:2015:1: ( ( rule__Service__EnvironmentAssignment_10_3_1 ) )
            // InternalMyDsl.g:2016:2: ( rule__Service__EnvironmentAssignment_10_3_1 )
            {
             before(grammarAccess.getServiceAccess().getEnvironmentAssignment_10_3_1()); 
            // InternalMyDsl.g:2017:2: ( rule__Service__EnvironmentAssignment_10_3_1 )
            // InternalMyDsl.g:2017:3: rule__Service__EnvironmentAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__EnvironmentAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getEnvironmentAssignment_10_3_1()); 

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
    // $ANTLR end "rule__Service__Group_10_3__1__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // InternalMyDsl.g:2026:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalMyDsl.g:2031:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__1();

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
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // InternalMyDsl.g:2038:1: rule__Image__Group__0__Impl : ( () ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( ( () ) )
            // InternalMyDsl.g:2043:1: ( () )
            {
            // InternalMyDsl.g:2043:1: ( () )
            // InternalMyDsl.g:2044:2: ()
            {
             before(grammarAccess.getImageAccess().getImageAction_0()); 
            // InternalMyDsl.g:2045:2: ()
            // InternalMyDsl.g:2045:3: 
            {
            }

             after(grammarAccess.getImageAccess().getImageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // InternalMyDsl.g:2053:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalMyDsl.g:2058:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__2();

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
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // InternalMyDsl.g:2065:1: rule__Image__Group__1__Impl : ( 'Image' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2069:1: ( ( 'Image' ) )
            // InternalMyDsl.g:2070:1: ( 'Image' )
            {
            // InternalMyDsl.g:2070:1: ( 'Image' )
            // InternalMyDsl.g:2071:2: 'Image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getImageKeyword_1()); 

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
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__2"
    // InternalMyDsl.g:2080:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalMyDsl.g:2085:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__3();

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
    // $ANTLR end "rule__Image__Group__2"


    // $ANTLR start "rule__Image__Group__2__Impl"
    // InternalMyDsl.g:2092:1: rule__Image__Group__2__Impl : ( ( rule__Image__NameAssignment_2 ) ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( ( ( rule__Image__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2097:1: ( ( rule__Image__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2097:1: ( ( rule__Image__NameAssignment_2 ) )
            // InternalMyDsl.g:2098:2: ( rule__Image__NameAssignment_2 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2099:2: ( rule__Image__NameAssignment_2 )
            // InternalMyDsl.g:2099:3: rule__Image__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Image__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Image__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__3"
    // InternalMyDsl.g:2107:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalMyDsl.g:2112:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Image__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__4();

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
    // $ANTLR end "rule__Image__Group__3"


    // $ANTLR start "rule__Image__Group__3__Impl"
    // InternalMyDsl.g:2119:1: rule__Image__Group__3__Impl : ( '{' ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( ( '{' ) )
            // InternalMyDsl.g:2124:1: ( '{' )
            {
            // InternalMyDsl.g:2124:1: ( '{' )
            // InternalMyDsl.g:2125:2: '{'
            {
             before(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Image__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__4"
    // InternalMyDsl.g:2134:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // InternalMyDsl.g:2139:2: rule__Image__Group__4__Impl rule__Image__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Image__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__5();

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
    // $ANTLR end "rule__Image__Group__4"


    // $ANTLR start "rule__Image__Group__4__Impl"
    // InternalMyDsl.g:2146:1: rule__Image__Group__4__Impl : ( ( rule__Image__Group_4__0 )? ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( ( ( rule__Image__Group_4__0 )? ) )
            // InternalMyDsl.g:2151:1: ( ( rule__Image__Group_4__0 )? )
            {
            // InternalMyDsl.g:2151:1: ( ( rule__Image__Group_4__0 )? )
            // InternalMyDsl.g:2152:2: ( rule__Image__Group_4__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_4()); 
            // InternalMyDsl.g:2153:2: ( rule__Image__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2153:3: rule__Image__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Image__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Image__Group__4__Impl"


    // $ANTLR start "rule__Image__Group__5"
    // InternalMyDsl.g:2161:1: rule__Image__Group__5 : rule__Image__Group__5__Impl ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( rule__Image__Group__5__Impl )
            // InternalMyDsl.g:2166:2: rule__Image__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__5__Impl();

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
    // $ANTLR end "rule__Image__Group__5"


    // $ANTLR start "rule__Image__Group__5__Impl"
    // InternalMyDsl.g:2172:1: rule__Image__Group__5__Impl : ( '}' ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( ( '}' ) )
            // InternalMyDsl.g:2177:1: ( '}' )
            {
            // InternalMyDsl.g:2177:1: ( '}' )
            // InternalMyDsl.g:2178:2: '}'
            {
             before(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Image__Group__5__Impl"


    // $ANTLR start "rule__Image__Group_4__0"
    // InternalMyDsl.g:2188:1: rule__Image__Group_4__0 : rule__Image__Group_4__0__Impl rule__Image__Group_4__1 ;
    public final void rule__Image__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( rule__Image__Group_4__0__Impl rule__Image__Group_4__1 )
            // InternalMyDsl.g:2193:2: rule__Image__Group_4__0__Impl rule__Image__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Image__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group_4__1();

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
    // $ANTLR end "rule__Image__Group_4__0"


    // $ANTLR start "rule__Image__Group_4__0__Impl"
    // InternalMyDsl.g:2200:1: rule__Image__Group_4__0__Impl : ( 'tag' ) ;
    public final void rule__Image__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( ( 'tag' ) )
            // InternalMyDsl.g:2205:1: ( 'tag' )
            {
            // InternalMyDsl.g:2205:1: ( 'tag' )
            // InternalMyDsl.g:2206:2: 'tag'
            {
             before(grammarAccess.getImageAccess().getTagKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getTagKeyword_4_0()); 

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
    // $ANTLR end "rule__Image__Group_4__0__Impl"


    // $ANTLR start "rule__Image__Group_4__1"
    // InternalMyDsl.g:2215:1: rule__Image__Group_4__1 : rule__Image__Group_4__1__Impl ;
    public final void rule__Image__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( rule__Image__Group_4__1__Impl )
            // InternalMyDsl.g:2220:2: rule__Image__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group_4__1__Impl();

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
    // $ANTLR end "rule__Image__Group_4__1"


    // $ANTLR start "rule__Image__Group_4__1__Impl"
    // InternalMyDsl.g:2226:1: rule__Image__Group_4__1__Impl : ( ( rule__Image__TagAssignment_4_1 ) ) ;
    public final void rule__Image__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( ( rule__Image__TagAssignment_4_1 ) ) )
            // InternalMyDsl.g:2231:1: ( ( rule__Image__TagAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2231:1: ( ( rule__Image__TagAssignment_4_1 ) )
            // InternalMyDsl.g:2232:2: ( rule__Image__TagAssignment_4_1 )
            {
             before(grammarAccess.getImageAccess().getTagAssignment_4_1()); 
            // InternalMyDsl.g:2233:2: ( rule__Image__TagAssignment_4_1 )
            // InternalMyDsl.g:2233:3: rule__Image__TagAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Image__TagAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getTagAssignment_4_1()); 

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
    // $ANTLR end "rule__Image__Group_4__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalMyDsl.g:2242:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalMyDsl.g:2247:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__1();

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
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalMyDsl.g:2254:1: rule__Port__Group__0__Impl : ( () ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( ( () ) )
            // InternalMyDsl.g:2259:1: ( () )
            {
            // InternalMyDsl.g:2259:1: ( () )
            // InternalMyDsl.g:2260:2: ()
            {
             before(grammarAccess.getPortAccess().getPortAction_0()); 
            // InternalMyDsl.g:2261:2: ()
            // InternalMyDsl.g:2261:3: 
            {
            }

             after(grammarAccess.getPortAccess().getPortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalMyDsl.g:2269:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalMyDsl.g:2274:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__2();

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
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalMyDsl.g:2281:1: rule__Port__Group__1__Impl : ( 'Port' ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( 'Port' ) )
            // InternalMyDsl.g:2286:1: ( 'Port' )
            {
            // InternalMyDsl.g:2286:1: ( 'Port' )
            // InternalMyDsl.g:2287:2: 'Port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getPortKeyword_1()); 

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
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // InternalMyDsl.g:2296:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalMyDsl.g:2301:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Port__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__3();

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
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // InternalMyDsl.g:2308:1: rule__Port__Group__2__Impl : ( '{' ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( ( '{' ) )
            // InternalMyDsl.g:2313:1: ( '{' )
            {
            // InternalMyDsl.g:2313:1: ( '{' )
            // InternalMyDsl.g:2314:2: '{'
            {
             before(grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__3"
    // InternalMyDsl.g:2323:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // InternalMyDsl.g:2328:2: rule__Port__Group__3__Impl rule__Port__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Port__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__4();

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
    // $ANTLR end "rule__Port__Group__3"


    // $ANTLR start "rule__Port__Group__3__Impl"
    // InternalMyDsl.g:2335:1: rule__Port__Group__3__Impl : ( ( rule__Port__Group_3__0 )? ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( ( ( rule__Port__Group_3__0 )? ) )
            // InternalMyDsl.g:2340:1: ( ( rule__Port__Group_3__0 )? )
            {
            // InternalMyDsl.g:2340:1: ( ( rule__Port__Group_3__0 )? )
            // InternalMyDsl.g:2341:2: ( rule__Port__Group_3__0 )?
            {
             before(grammarAccess.getPortAccess().getGroup_3()); 
            // InternalMyDsl.g:2342:2: ( rule__Port__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2342:3: rule__Port__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Port__Group__3__Impl"


    // $ANTLR start "rule__Port__Group__4"
    // InternalMyDsl.g:2350:1: rule__Port__Group__4 : rule__Port__Group__4__Impl rule__Port__Group__5 ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( rule__Port__Group__4__Impl rule__Port__Group__5 )
            // InternalMyDsl.g:2355:2: rule__Port__Group__4__Impl rule__Port__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Port__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__5();

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
    // $ANTLR end "rule__Port__Group__4"


    // $ANTLR start "rule__Port__Group__4__Impl"
    // InternalMyDsl.g:2362:1: rule__Port__Group__4__Impl : ( ( rule__Port__Group_4__0 )? ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( ( ( rule__Port__Group_4__0 )? ) )
            // InternalMyDsl.g:2367:1: ( ( rule__Port__Group_4__0 )? )
            {
            // InternalMyDsl.g:2367:1: ( ( rule__Port__Group_4__0 )? )
            // InternalMyDsl.g:2368:2: ( rule__Port__Group_4__0 )?
            {
             before(grammarAccess.getPortAccess().getGroup_4()); 
            // InternalMyDsl.g:2369:2: ( rule__Port__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2369:3: rule__Port__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Port__Group__4__Impl"


    // $ANTLR start "rule__Port__Group__5"
    // InternalMyDsl.g:2377:1: rule__Port__Group__5 : rule__Port__Group__5__Impl ;
    public final void rule__Port__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( rule__Port__Group__5__Impl )
            // InternalMyDsl.g:2382:2: rule__Port__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__5__Impl();

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
    // $ANTLR end "rule__Port__Group__5"


    // $ANTLR start "rule__Port__Group__5__Impl"
    // InternalMyDsl.g:2388:1: rule__Port__Group__5__Impl : ( '}' ) ;
    public final void rule__Port__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( ( '}' ) )
            // InternalMyDsl.g:2393:1: ( '}' )
            {
            // InternalMyDsl.g:2393:1: ( '}' )
            // InternalMyDsl.g:2394:2: '}'
            {
             before(grammarAccess.getPortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Port__Group__5__Impl"


    // $ANTLR start "rule__Port__Group_3__0"
    // InternalMyDsl.g:2404:1: rule__Port__Group_3__0 : rule__Port__Group_3__0__Impl rule__Port__Group_3__1 ;
    public final void rule__Port__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2408:1: ( rule__Port__Group_3__0__Impl rule__Port__Group_3__1 )
            // InternalMyDsl.g:2409:2: rule__Port__Group_3__0__Impl rule__Port__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Port__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group_3__1();

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
    // $ANTLR end "rule__Port__Group_3__0"


    // $ANTLR start "rule__Port__Group_3__0__Impl"
    // InternalMyDsl.g:2416:1: rule__Port__Group_3__0__Impl : ( 'number' ) ;
    public final void rule__Port__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( ( 'number' ) )
            // InternalMyDsl.g:2421:1: ( 'number' )
            {
            // InternalMyDsl.g:2421:1: ( 'number' )
            // InternalMyDsl.g:2422:2: 'number'
            {
             before(grammarAccess.getPortAccess().getNumberKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getNumberKeyword_3_0()); 

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
    // $ANTLR end "rule__Port__Group_3__0__Impl"


    // $ANTLR start "rule__Port__Group_3__1"
    // InternalMyDsl.g:2431:1: rule__Port__Group_3__1 : rule__Port__Group_3__1__Impl ;
    public final void rule__Port__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( rule__Port__Group_3__1__Impl )
            // InternalMyDsl.g:2436:2: rule__Port__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group_3__1__Impl();

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
    // $ANTLR end "rule__Port__Group_3__1"


    // $ANTLR start "rule__Port__Group_3__1__Impl"
    // InternalMyDsl.g:2442:1: rule__Port__Group_3__1__Impl : ( ( rule__Port__NumberAssignment_3_1 ) ) ;
    public final void rule__Port__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( ( rule__Port__NumberAssignment_3_1 ) ) )
            // InternalMyDsl.g:2447:1: ( ( rule__Port__NumberAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2447:1: ( ( rule__Port__NumberAssignment_3_1 ) )
            // InternalMyDsl.g:2448:2: ( rule__Port__NumberAssignment_3_1 )
            {
             before(grammarAccess.getPortAccess().getNumberAssignment_3_1()); 
            // InternalMyDsl.g:2449:2: ( rule__Port__NumberAssignment_3_1 )
            // InternalMyDsl.g:2449:3: rule__Port__NumberAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__NumberAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNumberAssignment_3_1()); 

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
    // $ANTLR end "rule__Port__Group_3__1__Impl"


    // $ANTLR start "rule__Port__Group_4__0"
    // InternalMyDsl.g:2458:1: rule__Port__Group_4__0 : rule__Port__Group_4__0__Impl rule__Port__Group_4__1 ;
    public final void rule__Port__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2462:1: ( rule__Port__Group_4__0__Impl rule__Port__Group_4__1 )
            // InternalMyDsl.g:2463:2: rule__Port__Group_4__0__Impl rule__Port__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Port__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group_4__1();

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
    // $ANTLR end "rule__Port__Group_4__0"


    // $ANTLR start "rule__Port__Group_4__0__Impl"
    // InternalMyDsl.g:2470:1: rule__Port__Group_4__0__Impl : ( 'protocol' ) ;
    public final void rule__Port__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:2475:1: ( 'protocol' )
            {
            // InternalMyDsl.g:2475:1: ( 'protocol' )
            // InternalMyDsl.g:2476:2: 'protocol'
            {
             before(grammarAccess.getPortAccess().getProtocolKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getProtocolKeyword_4_0()); 

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
    // $ANTLR end "rule__Port__Group_4__0__Impl"


    // $ANTLR start "rule__Port__Group_4__1"
    // InternalMyDsl.g:2485:1: rule__Port__Group_4__1 : rule__Port__Group_4__1__Impl ;
    public final void rule__Port__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( rule__Port__Group_4__1__Impl )
            // InternalMyDsl.g:2490:2: rule__Port__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group_4__1__Impl();

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
    // $ANTLR end "rule__Port__Group_4__1"


    // $ANTLR start "rule__Port__Group_4__1__Impl"
    // InternalMyDsl.g:2496:1: rule__Port__Group_4__1__Impl : ( ( rule__Port__ProtocolAssignment_4_1 ) ) ;
    public final void rule__Port__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2500:1: ( ( ( rule__Port__ProtocolAssignment_4_1 ) ) )
            // InternalMyDsl.g:2501:1: ( ( rule__Port__ProtocolAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2501:1: ( ( rule__Port__ProtocolAssignment_4_1 ) )
            // InternalMyDsl.g:2502:2: ( rule__Port__ProtocolAssignment_4_1 )
            {
             before(grammarAccess.getPortAccess().getProtocolAssignment_4_1()); 
            // InternalMyDsl.g:2503:2: ( rule__Port__ProtocolAssignment_4_1 )
            // InternalMyDsl.g:2503:3: rule__Port__ProtocolAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__ProtocolAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getProtocolAssignment_4_1()); 

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
    // $ANTLR end "rule__Port__Group_4__1__Impl"


    // $ANTLR start "rule__Volume__Group__0"
    // InternalMyDsl.g:2512:1: rule__Volume__Group__0 : rule__Volume__Group__0__Impl rule__Volume__Group__1 ;
    public final void rule__Volume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2516:1: ( rule__Volume__Group__0__Impl rule__Volume__Group__1 )
            // InternalMyDsl.g:2517:2: rule__Volume__Group__0__Impl rule__Volume__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Volume__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__1();

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
    // $ANTLR end "rule__Volume__Group__0"


    // $ANTLR start "rule__Volume__Group__0__Impl"
    // InternalMyDsl.g:2524:1: rule__Volume__Group__0__Impl : ( () ) ;
    public final void rule__Volume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2528:1: ( ( () ) )
            // InternalMyDsl.g:2529:1: ( () )
            {
            // InternalMyDsl.g:2529:1: ( () )
            // InternalMyDsl.g:2530:2: ()
            {
             before(grammarAccess.getVolumeAccess().getVolumeAction_0()); 
            // InternalMyDsl.g:2531:2: ()
            // InternalMyDsl.g:2531:3: 
            {
            }

             after(grammarAccess.getVolumeAccess().getVolumeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__0__Impl"


    // $ANTLR start "rule__Volume__Group__1"
    // InternalMyDsl.g:2539:1: rule__Volume__Group__1 : rule__Volume__Group__1__Impl rule__Volume__Group__2 ;
    public final void rule__Volume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( rule__Volume__Group__1__Impl rule__Volume__Group__2 )
            // InternalMyDsl.g:2544:2: rule__Volume__Group__1__Impl rule__Volume__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Volume__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__2();

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
    // $ANTLR end "rule__Volume__Group__1"


    // $ANTLR start "rule__Volume__Group__1__Impl"
    // InternalMyDsl.g:2551:1: rule__Volume__Group__1__Impl : ( 'Volume' ) ;
    public final void rule__Volume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( ( 'Volume' ) )
            // InternalMyDsl.g:2556:1: ( 'Volume' )
            {
            // InternalMyDsl.g:2556:1: ( 'Volume' )
            // InternalMyDsl.g:2557:2: 'Volume'
            {
             before(grammarAccess.getVolumeAccess().getVolumeKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getVolumeKeyword_1()); 

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
    // $ANTLR end "rule__Volume__Group__1__Impl"


    // $ANTLR start "rule__Volume__Group__2"
    // InternalMyDsl.g:2566:1: rule__Volume__Group__2 : rule__Volume__Group__2__Impl rule__Volume__Group__3 ;
    public final void rule__Volume__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2570:1: ( rule__Volume__Group__2__Impl rule__Volume__Group__3 )
            // InternalMyDsl.g:2571:2: rule__Volume__Group__2__Impl rule__Volume__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Volume__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__3();

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
    // $ANTLR end "rule__Volume__Group__2"


    // $ANTLR start "rule__Volume__Group__2__Impl"
    // InternalMyDsl.g:2578:1: rule__Volume__Group__2__Impl : ( '{' ) ;
    public final void rule__Volume__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( ( '{' ) )
            // InternalMyDsl.g:2583:1: ( '{' )
            {
            // InternalMyDsl.g:2583:1: ( '{' )
            // InternalMyDsl.g:2584:2: '{'
            {
             before(grammarAccess.getVolumeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Volume__Group__2__Impl"


    // $ANTLR start "rule__Volume__Group__3"
    // InternalMyDsl.g:2593:1: rule__Volume__Group__3 : rule__Volume__Group__3__Impl rule__Volume__Group__4 ;
    public final void rule__Volume__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2597:1: ( rule__Volume__Group__3__Impl rule__Volume__Group__4 )
            // InternalMyDsl.g:2598:2: rule__Volume__Group__3__Impl rule__Volume__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Volume__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__4();

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
    // $ANTLR end "rule__Volume__Group__3"


    // $ANTLR start "rule__Volume__Group__3__Impl"
    // InternalMyDsl.g:2605:1: rule__Volume__Group__3__Impl : ( ( rule__Volume__Group_3__0 )? ) ;
    public final void rule__Volume__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( ( ( rule__Volume__Group_3__0 )? ) )
            // InternalMyDsl.g:2610:1: ( ( rule__Volume__Group_3__0 )? )
            {
            // InternalMyDsl.g:2610:1: ( ( rule__Volume__Group_3__0 )? )
            // InternalMyDsl.g:2611:2: ( rule__Volume__Group_3__0 )?
            {
             before(grammarAccess.getVolumeAccess().getGroup_3()); 
            // InternalMyDsl.g:2612:2: ( rule__Volume__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2612:3: rule__Volume__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Volume__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVolumeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Volume__Group__3__Impl"


    // $ANTLR start "rule__Volume__Group__4"
    // InternalMyDsl.g:2620:1: rule__Volume__Group__4 : rule__Volume__Group__4__Impl rule__Volume__Group__5 ;
    public final void rule__Volume__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2624:1: ( rule__Volume__Group__4__Impl rule__Volume__Group__5 )
            // InternalMyDsl.g:2625:2: rule__Volume__Group__4__Impl rule__Volume__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Volume__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__5();

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
    // $ANTLR end "rule__Volume__Group__4"


    // $ANTLR start "rule__Volume__Group__4__Impl"
    // InternalMyDsl.g:2632:1: rule__Volume__Group__4__Impl : ( ( rule__Volume__Group_4__0 )? ) ;
    public final void rule__Volume__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( ( ( rule__Volume__Group_4__0 )? ) )
            // InternalMyDsl.g:2637:1: ( ( rule__Volume__Group_4__0 )? )
            {
            // InternalMyDsl.g:2637:1: ( ( rule__Volume__Group_4__0 )? )
            // InternalMyDsl.g:2638:2: ( rule__Volume__Group_4__0 )?
            {
             before(grammarAccess.getVolumeAccess().getGroup_4()); 
            // InternalMyDsl.g:2639:2: ( rule__Volume__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2639:3: rule__Volume__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Volume__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVolumeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Volume__Group__4__Impl"


    // $ANTLR start "rule__Volume__Group__5"
    // InternalMyDsl.g:2647:1: rule__Volume__Group__5 : rule__Volume__Group__5__Impl ;
    public final void rule__Volume__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( rule__Volume__Group__5__Impl )
            // InternalMyDsl.g:2652:2: rule__Volume__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__5__Impl();

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
    // $ANTLR end "rule__Volume__Group__5"


    // $ANTLR start "rule__Volume__Group__5__Impl"
    // InternalMyDsl.g:2658:1: rule__Volume__Group__5__Impl : ( '}' ) ;
    public final void rule__Volume__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2662:1: ( ( '}' ) )
            // InternalMyDsl.g:2663:1: ( '}' )
            {
            // InternalMyDsl.g:2663:1: ( '}' )
            // InternalMyDsl.g:2664:2: '}'
            {
             before(grammarAccess.getVolumeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Volume__Group__5__Impl"


    // $ANTLR start "rule__Volume__Group_3__0"
    // InternalMyDsl.g:2674:1: rule__Volume__Group_3__0 : rule__Volume__Group_3__0__Impl rule__Volume__Group_3__1 ;
    public final void rule__Volume__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2678:1: ( rule__Volume__Group_3__0__Impl rule__Volume__Group_3__1 )
            // InternalMyDsl.g:2679:2: rule__Volume__Group_3__0__Impl rule__Volume__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Volume__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group_3__1();

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
    // $ANTLR end "rule__Volume__Group_3__0"


    // $ANTLR start "rule__Volume__Group_3__0__Impl"
    // InternalMyDsl.g:2686:1: rule__Volume__Group_3__0__Impl : ( 'source' ) ;
    public final void rule__Volume__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( ( 'source' ) )
            // InternalMyDsl.g:2691:1: ( 'source' )
            {
            // InternalMyDsl.g:2691:1: ( 'source' )
            // InternalMyDsl.g:2692:2: 'source'
            {
             before(grammarAccess.getVolumeAccess().getSourceKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getSourceKeyword_3_0()); 

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
    // $ANTLR end "rule__Volume__Group_3__0__Impl"


    // $ANTLR start "rule__Volume__Group_3__1"
    // InternalMyDsl.g:2701:1: rule__Volume__Group_3__1 : rule__Volume__Group_3__1__Impl ;
    public final void rule__Volume__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2705:1: ( rule__Volume__Group_3__1__Impl )
            // InternalMyDsl.g:2706:2: rule__Volume__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group_3__1__Impl();

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
    // $ANTLR end "rule__Volume__Group_3__1"


    // $ANTLR start "rule__Volume__Group_3__1__Impl"
    // InternalMyDsl.g:2712:1: rule__Volume__Group_3__1__Impl : ( ( rule__Volume__SourceAssignment_3_1 ) ) ;
    public final void rule__Volume__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( ( ( rule__Volume__SourceAssignment_3_1 ) ) )
            // InternalMyDsl.g:2717:1: ( ( rule__Volume__SourceAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2717:1: ( ( rule__Volume__SourceAssignment_3_1 ) )
            // InternalMyDsl.g:2718:2: ( rule__Volume__SourceAssignment_3_1 )
            {
             before(grammarAccess.getVolumeAccess().getSourceAssignment_3_1()); 
            // InternalMyDsl.g:2719:2: ( rule__Volume__SourceAssignment_3_1 )
            // InternalMyDsl.g:2719:3: rule__Volume__SourceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Volume__SourceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getSourceAssignment_3_1()); 

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
    // $ANTLR end "rule__Volume__Group_3__1__Impl"


    // $ANTLR start "rule__Volume__Group_4__0"
    // InternalMyDsl.g:2728:1: rule__Volume__Group_4__0 : rule__Volume__Group_4__0__Impl rule__Volume__Group_4__1 ;
    public final void rule__Volume__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2732:1: ( rule__Volume__Group_4__0__Impl rule__Volume__Group_4__1 )
            // InternalMyDsl.g:2733:2: rule__Volume__Group_4__0__Impl rule__Volume__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Volume__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group_4__1();

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
    // $ANTLR end "rule__Volume__Group_4__0"


    // $ANTLR start "rule__Volume__Group_4__0__Impl"
    // InternalMyDsl.g:2740:1: rule__Volume__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__Volume__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2744:1: ( ( 'target' ) )
            // InternalMyDsl.g:2745:1: ( 'target' )
            {
            // InternalMyDsl.g:2745:1: ( 'target' )
            // InternalMyDsl.g:2746:2: 'target'
            {
             before(grammarAccess.getVolumeAccess().getTargetKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getTargetKeyword_4_0()); 

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
    // $ANTLR end "rule__Volume__Group_4__0__Impl"


    // $ANTLR start "rule__Volume__Group_4__1"
    // InternalMyDsl.g:2755:1: rule__Volume__Group_4__1 : rule__Volume__Group_4__1__Impl ;
    public final void rule__Volume__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2759:1: ( rule__Volume__Group_4__1__Impl )
            // InternalMyDsl.g:2760:2: rule__Volume__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group_4__1__Impl();

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
    // $ANTLR end "rule__Volume__Group_4__1"


    // $ANTLR start "rule__Volume__Group_4__1__Impl"
    // InternalMyDsl.g:2766:1: rule__Volume__Group_4__1__Impl : ( ( rule__Volume__TargetAssignment_4_1 ) ) ;
    public final void rule__Volume__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2770:1: ( ( ( rule__Volume__TargetAssignment_4_1 ) ) )
            // InternalMyDsl.g:2771:1: ( ( rule__Volume__TargetAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2771:1: ( ( rule__Volume__TargetAssignment_4_1 ) )
            // InternalMyDsl.g:2772:2: ( rule__Volume__TargetAssignment_4_1 )
            {
             before(grammarAccess.getVolumeAccess().getTargetAssignment_4_1()); 
            // InternalMyDsl.g:2773:2: ( rule__Volume__TargetAssignment_4_1 )
            // InternalMyDsl.g:2773:3: rule__Volume__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Volume__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getTargetAssignment_4_1()); 

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
    // $ANTLR end "rule__Volume__Group_4__1__Impl"


    // $ANTLR start "rule__Network__Group__0"
    // InternalMyDsl.g:2782:1: rule__Network__Group__0 : rule__Network__Group__0__Impl rule__Network__Group__1 ;
    public final void rule__Network__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2786:1: ( rule__Network__Group__0__Impl rule__Network__Group__1 )
            // InternalMyDsl.g:2787:2: rule__Network__Group__0__Impl rule__Network__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Network__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__1();

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
    // $ANTLR end "rule__Network__Group__0"


    // $ANTLR start "rule__Network__Group__0__Impl"
    // InternalMyDsl.g:2794:1: rule__Network__Group__0__Impl : ( () ) ;
    public final void rule__Network__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( ( () ) )
            // InternalMyDsl.g:2799:1: ( () )
            {
            // InternalMyDsl.g:2799:1: ( () )
            // InternalMyDsl.g:2800:2: ()
            {
             before(grammarAccess.getNetworkAccess().getNetworkAction_0()); 
            // InternalMyDsl.g:2801:2: ()
            // InternalMyDsl.g:2801:3: 
            {
            }

             after(grammarAccess.getNetworkAccess().getNetworkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__0__Impl"


    // $ANTLR start "rule__Network__Group__1"
    // InternalMyDsl.g:2809:1: rule__Network__Group__1 : rule__Network__Group__1__Impl rule__Network__Group__2 ;
    public final void rule__Network__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2813:1: ( rule__Network__Group__1__Impl rule__Network__Group__2 )
            // InternalMyDsl.g:2814:2: rule__Network__Group__1__Impl rule__Network__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Network__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__2();

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
    // $ANTLR end "rule__Network__Group__1"


    // $ANTLR start "rule__Network__Group__1__Impl"
    // InternalMyDsl.g:2821:1: rule__Network__Group__1__Impl : ( 'Network' ) ;
    public final void rule__Network__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2825:1: ( ( 'Network' ) )
            // InternalMyDsl.g:2826:1: ( 'Network' )
            {
            // InternalMyDsl.g:2826:1: ( 'Network' )
            // InternalMyDsl.g:2827:2: 'Network'
            {
             before(grammarAccess.getNetworkAccess().getNetworkKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getNetworkKeyword_1()); 

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
    // $ANTLR end "rule__Network__Group__1__Impl"


    // $ANTLR start "rule__Network__Group__2"
    // InternalMyDsl.g:2836:1: rule__Network__Group__2 : rule__Network__Group__2__Impl rule__Network__Group__3 ;
    public final void rule__Network__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2840:1: ( rule__Network__Group__2__Impl rule__Network__Group__3 )
            // InternalMyDsl.g:2841:2: rule__Network__Group__2__Impl rule__Network__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Network__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__3();

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
    // $ANTLR end "rule__Network__Group__2"


    // $ANTLR start "rule__Network__Group__2__Impl"
    // InternalMyDsl.g:2848:1: rule__Network__Group__2__Impl : ( ( rule__Network__NameAssignment_2 ) ) ;
    public final void rule__Network__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2852:1: ( ( ( rule__Network__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2853:1: ( ( rule__Network__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2853:1: ( ( rule__Network__NameAssignment_2 ) )
            // InternalMyDsl.g:2854:2: ( rule__Network__NameAssignment_2 )
            {
             before(grammarAccess.getNetworkAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2855:2: ( rule__Network__NameAssignment_2 )
            // InternalMyDsl.g:2855:3: rule__Network__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Network__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Network__Group__2__Impl"


    // $ANTLR start "rule__Network__Group__3"
    // InternalMyDsl.g:2863:1: rule__Network__Group__3 : rule__Network__Group__3__Impl rule__Network__Group__4 ;
    public final void rule__Network__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2867:1: ( rule__Network__Group__3__Impl rule__Network__Group__4 )
            // InternalMyDsl.g:2868:2: rule__Network__Group__3__Impl rule__Network__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Network__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__4();

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
    // $ANTLR end "rule__Network__Group__3"


    // $ANTLR start "rule__Network__Group__3__Impl"
    // InternalMyDsl.g:2875:1: rule__Network__Group__3__Impl : ( '{' ) ;
    public final void rule__Network__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2879:1: ( ( '{' ) )
            // InternalMyDsl.g:2880:1: ( '{' )
            {
            // InternalMyDsl.g:2880:1: ( '{' )
            // InternalMyDsl.g:2881:2: '{'
            {
             before(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Network__Group__3__Impl"


    // $ANTLR start "rule__Network__Group__4"
    // InternalMyDsl.g:2890:1: rule__Network__Group__4 : rule__Network__Group__4__Impl rule__Network__Group__5 ;
    public final void rule__Network__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2894:1: ( rule__Network__Group__4__Impl rule__Network__Group__5 )
            // InternalMyDsl.g:2895:2: rule__Network__Group__4__Impl rule__Network__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Network__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__5();

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
    // $ANTLR end "rule__Network__Group__4"


    // $ANTLR start "rule__Network__Group__4__Impl"
    // InternalMyDsl.g:2902:1: rule__Network__Group__4__Impl : ( ( rule__Network__Group_4__0 )? ) ;
    public final void rule__Network__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2906:1: ( ( ( rule__Network__Group_4__0 )? ) )
            // InternalMyDsl.g:2907:1: ( ( rule__Network__Group_4__0 )? )
            {
            // InternalMyDsl.g:2907:1: ( ( rule__Network__Group_4__0 )? )
            // InternalMyDsl.g:2908:2: ( rule__Network__Group_4__0 )?
            {
             before(grammarAccess.getNetworkAccess().getGroup_4()); 
            // InternalMyDsl.g:2909:2: ( rule__Network__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2909:3: rule__Network__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Network__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNetworkAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Network__Group__4__Impl"


    // $ANTLR start "rule__Network__Group__5"
    // InternalMyDsl.g:2917:1: rule__Network__Group__5 : rule__Network__Group__5__Impl ;
    public final void rule__Network__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2921:1: ( rule__Network__Group__5__Impl )
            // InternalMyDsl.g:2922:2: rule__Network__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group__5__Impl();

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
    // $ANTLR end "rule__Network__Group__5"


    // $ANTLR start "rule__Network__Group__5__Impl"
    // InternalMyDsl.g:2928:1: rule__Network__Group__5__Impl : ( '}' ) ;
    public final void rule__Network__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2932:1: ( ( '}' ) )
            // InternalMyDsl.g:2933:1: ( '}' )
            {
            // InternalMyDsl.g:2933:1: ( '}' )
            // InternalMyDsl.g:2934:2: '}'
            {
             before(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Network__Group__5__Impl"


    // $ANTLR start "rule__Network__Group_4__0"
    // InternalMyDsl.g:2944:1: rule__Network__Group_4__0 : rule__Network__Group_4__0__Impl rule__Network__Group_4__1 ;
    public final void rule__Network__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2948:1: ( rule__Network__Group_4__0__Impl rule__Network__Group_4__1 )
            // InternalMyDsl.g:2949:2: rule__Network__Group_4__0__Impl rule__Network__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Network__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_4__1();

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
    // $ANTLR end "rule__Network__Group_4__0"


    // $ANTLR start "rule__Network__Group_4__0__Impl"
    // InternalMyDsl.g:2956:1: rule__Network__Group_4__0__Impl : ( 'driver' ) ;
    public final void rule__Network__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2960:1: ( ( 'driver' ) )
            // InternalMyDsl.g:2961:1: ( 'driver' )
            {
            // InternalMyDsl.g:2961:1: ( 'driver' )
            // InternalMyDsl.g:2962:2: 'driver'
            {
             before(grammarAccess.getNetworkAccess().getDriverKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getDriverKeyword_4_0()); 

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
    // $ANTLR end "rule__Network__Group_4__0__Impl"


    // $ANTLR start "rule__Network__Group_4__1"
    // InternalMyDsl.g:2971:1: rule__Network__Group_4__1 : rule__Network__Group_4__1__Impl ;
    public final void rule__Network__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2975:1: ( rule__Network__Group_4__1__Impl )
            // InternalMyDsl.g:2976:2: rule__Network__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_4__1__Impl();

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
    // $ANTLR end "rule__Network__Group_4__1"


    // $ANTLR start "rule__Network__Group_4__1__Impl"
    // InternalMyDsl.g:2982:1: rule__Network__Group_4__1__Impl : ( ( rule__Network__DriverAssignment_4_1 ) ) ;
    public final void rule__Network__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( ( ( rule__Network__DriverAssignment_4_1 ) ) )
            // InternalMyDsl.g:2987:1: ( ( rule__Network__DriverAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2987:1: ( ( rule__Network__DriverAssignment_4_1 ) )
            // InternalMyDsl.g:2988:2: ( rule__Network__DriverAssignment_4_1 )
            {
             before(grammarAccess.getNetworkAccess().getDriverAssignment_4_1()); 
            // InternalMyDsl.g:2989:2: ( rule__Network__DriverAssignment_4_1 )
            // InternalMyDsl.g:2989:3: rule__Network__DriverAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Network__DriverAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getDriverAssignment_4_1()); 

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
    // $ANTLR end "rule__Network__Group_4__1__Impl"


    // $ANTLR start "rule__Environment__Group__0"
    // InternalMyDsl.g:2998:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3002:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalMyDsl.g:3003:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__1();

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
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // InternalMyDsl.g:3010:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3014:1: ( ( () ) )
            // InternalMyDsl.g:3015:1: ( () )
            {
            // InternalMyDsl.g:3015:1: ( () )
            // InternalMyDsl.g:3016:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalMyDsl.g:3017:2: ()
            // InternalMyDsl.g:3017:3: 
            {
            }

             after(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // InternalMyDsl.g:3025:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3029:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalMyDsl.g:3030:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__2();

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
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // InternalMyDsl.g:3037:1: rule__Environment__Group__1__Impl : ( 'Environment' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3041:1: ( ( 'Environment' ) )
            // InternalMyDsl.g:3042:1: ( 'Environment' )
            {
            // InternalMyDsl.g:3042:1: ( 'Environment' )
            // InternalMyDsl.g:3043:2: 'Environment'
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1()); 

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
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // InternalMyDsl.g:3052:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3056:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalMyDsl.g:3057:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__3();

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
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // InternalMyDsl.g:3064:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__NameAssignment_2 ) ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3068:1: ( ( ( rule__Environment__NameAssignment_2 ) ) )
            // InternalMyDsl.g:3069:1: ( ( rule__Environment__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:3069:1: ( ( rule__Environment__NameAssignment_2 ) )
            // InternalMyDsl.g:3070:2: ( rule__Environment__NameAssignment_2 )
            {
             before(grammarAccess.getEnvironmentAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3071:2: ( rule__Environment__NameAssignment_2 )
            // InternalMyDsl.g:3071:3: rule__Environment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Environment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // InternalMyDsl.g:3079:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3083:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // InternalMyDsl.g:3084:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Environment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__4();

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
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // InternalMyDsl.g:3091:1: rule__Environment__Group__3__Impl : ( '{' ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3095:1: ( ( '{' ) )
            // InternalMyDsl.g:3096:1: ( '{' )
            {
            // InternalMyDsl.g:3096:1: ( '{' )
            // InternalMyDsl.g:3097:2: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group__4"
    // InternalMyDsl.g:3106:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl rule__Environment__Group__5 ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3110:1: ( rule__Environment__Group__4__Impl rule__Environment__Group__5 )
            // InternalMyDsl.g:3111:2: rule__Environment__Group__4__Impl rule__Environment__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Environment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__5();

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
    // $ANTLR end "rule__Environment__Group__4"


    // $ANTLR start "rule__Environment__Group__4__Impl"
    // InternalMyDsl.g:3118:1: rule__Environment__Group__4__Impl : ( ( rule__Environment__Group_4__0 )? ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3122:1: ( ( ( rule__Environment__Group_4__0 )? ) )
            // InternalMyDsl.g:3123:1: ( ( rule__Environment__Group_4__0 )? )
            {
            // InternalMyDsl.g:3123:1: ( ( rule__Environment__Group_4__0 )? )
            // InternalMyDsl.g:3124:2: ( rule__Environment__Group_4__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_4()); 
            // InternalMyDsl.g:3125:2: ( rule__Environment__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:3125:3: rule__Environment__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Environment__Group__4__Impl"


    // $ANTLR start "rule__Environment__Group__5"
    // InternalMyDsl.g:3133:1: rule__Environment__Group__5 : rule__Environment__Group__5__Impl ;
    public final void rule__Environment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3137:1: ( rule__Environment__Group__5__Impl )
            // InternalMyDsl.g:3138:2: rule__Environment__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__5__Impl();

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
    // $ANTLR end "rule__Environment__Group__5"


    // $ANTLR start "rule__Environment__Group__5__Impl"
    // InternalMyDsl.g:3144:1: rule__Environment__Group__5__Impl : ( '}' ) ;
    public final void rule__Environment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3148:1: ( ( '}' ) )
            // InternalMyDsl.g:3149:1: ( '}' )
            {
            // InternalMyDsl.g:3149:1: ( '}' )
            // InternalMyDsl.g:3150:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Environment__Group__5__Impl"


    // $ANTLR start "rule__Environment__Group_4__0"
    // InternalMyDsl.g:3160:1: rule__Environment__Group_4__0 : rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1 ;
    public final void rule__Environment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3164:1: ( rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1 )
            // InternalMyDsl.g:3165:2: rule__Environment__Group_4__0__Impl rule__Environment__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__1();

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
    // $ANTLR end "rule__Environment__Group_4__0"


    // $ANTLR start "rule__Environment__Group_4__0__Impl"
    // InternalMyDsl.g:3172:1: rule__Environment__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Environment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3176:1: ( ( 'value' ) )
            // InternalMyDsl.g:3177:1: ( 'value' )
            {
            // InternalMyDsl.g:3177:1: ( 'value' )
            // InternalMyDsl.g:3178:2: 'value'
            {
             before(grammarAccess.getEnvironmentAccess().getValueKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getValueKeyword_4_0()); 

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
    // $ANTLR end "rule__Environment__Group_4__0__Impl"


    // $ANTLR start "rule__Environment__Group_4__1"
    // InternalMyDsl.g:3187:1: rule__Environment__Group_4__1 : rule__Environment__Group_4__1__Impl ;
    public final void rule__Environment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3191:1: ( rule__Environment__Group_4__1__Impl )
            // InternalMyDsl.g:3192:2: rule__Environment__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_4__1__Impl();

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
    // $ANTLR end "rule__Environment__Group_4__1"


    // $ANTLR start "rule__Environment__Group_4__1__Impl"
    // InternalMyDsl.g:3198:1: rule__Environment__Group_4__1__Impl : ( ( rule__Environment__ValueAssignment_4_1 ) ) ;
    public final void rule__Environment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3202:1: ( ( ( rule__Environment__ValueAssignment_4_1 ) ) )
            // InternalMyDsl.g:3203:1: ( ( rule__Environment__ValueAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3203:1: ( ( rule__Environment__ValueAssignment_4_1 ) )
            // InternalMyDsl.g:3204:2: ( rule__Environment__ValueAssignment_4_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getValueAssignment_4_1()); 
            // InternalMyDsl.g:3205:2: ( rule__Environment__ValueAssignment_4_1 )
            // InternalMyDsl.g:3205:3: rule__Environment__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Environment__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getValueAssignment_4_1()); 

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
    // $ANTLR end "rule__Environment__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:3214:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3218:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:3219:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:3226:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3230:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:3231:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:3231:1: ( ( '-' )? )
            // InternalMyDsl.g:3232:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:3233:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:3233:3: '-'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:3241:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3245:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:3246:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:3252:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3256:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3257:1: ( RULE_INT )
            {
            // InternalMyDsl.g:3257:1: ( RULE_INT )
            // InternalMyDsl.g:3258:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Compose__VersionAssignment_3_1"
    // InternalMyDsl.g:3268:1: rule__Compose__VersionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Compose__VersionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3272:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3273:2: ( ruleEString )
            {
            // InternalMyDsl.g:3273:2: ( ruleEString )
            // InternalMyDsl.g:3274:3: ruleEString
            {
             before(grammarAccess.getComposeAccess().getVersionEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComposeAccess().getVersionEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Compose__VersionAssignment_3_1"


    // $ANTLR start "rule__Compose__ServiceAssignment_4_2"
    // InternalMyDsl.g:3283:1: rule__Compose__ServiceAssignment_4_2 : ( ruleService ) ;
    public final void rule__Compose__ServiceAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3287:1: ( ( ruleService ) )
            // InternalMyDsl.g:3288:2: ( ruleService )
            {
            // InternalMyDsl.g:3288:2: ( ruleService )
            // InternalMyDsl.g:3289:3: ruleService
            {
             before(grammarAccess.getComposeAccess().getServiceServiceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComposeAccess().getServiceServiceParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Compose__ServiceAssignment_4_2"


    // $ANTLR start "rule__Compose__ServiceAssignment_4_3_1"
    // InternalMyDsl.g:3298:1: rule__Compose__ServiceAssignment_4_3_1 : ( ruleService ) ;
    public final void rule__Compose__ServiceAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3302:1: ( ( ruleService ) )
            // InternalMyDsl.g:3303:2: ( ruleService )
            {
            // InternalMyDsl.g:3303:2: ( ruleService )
            // InternalMyDsl.g:3304:3: ruleService
            {
             before(grammarAccess.getComposeAccess().getServiceServiceParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComposeAccess().getServiceServiceParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Compose__ServiceAssignment_4_3_1"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalMyDsl.g:3313:1: rule__Service__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3318:2: ( ruleEString )
            {
            // InternalMyDsl.g:3318:2: ( ruleEString )
            // InternalMyDsl.g:3319:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__CommandAssignment_3_1"
    // InternalMyDsl.g:3328:1: rule__Service__CommandAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Service__CommandAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3332:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3333:2: ( ruleEString )
            {
            // InternalMyDsl.g:3333:2: ( ruleEString )
            // InternalMyDsl.g:3334:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Service__CommandAssignment_3_1"


    // $ANTLR start "rule__Service__Depends_onAssignment_4_2"
    // InternalMyDsl.g:3343:1: rule__Service__Depends_onAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Service__Depends_onAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3347:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3348:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3348:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3349:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getDepends_onServiceCrossReference_4_2_0()); 
            // InternalMyDsl.g:3350:3: ( ruleEString )
            // InternalMyDsl.g:3351:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getDepends_onServiceEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getDepends_onServiceEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getDepends_onServiceCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__Service__Depends_onAssignment_4_2"


    // $ANTLR start "rule__Service__Depends_onAssignment_4_3_1"
    // InternalMyDsl.g:3362:1: rule__Service__Depends_onAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Service__Depends_onAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3366:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3367:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3367:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3368:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getDepends_onServiceCrossReference_4_3_1_0()); 
            // InternalMyDsl.g:3369:3: ( ruleEString )
            // InternalMyDsl.g:3370:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getDepends_onServiceEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getDepends_onServiceEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getDepends_onServiceCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__Service__Depends_onAssignment_4_3_1"


    // $ANTLR start "rule__Service__ImageAssignment_6"
    // InternalMyDsl.g:3381:1: rule__Service__ImageAssignment_6 : ( ruleImage ) ;
    public final void rule__Service__ImageAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3385:1: ( ( ruleImage ) )
            // InternalMyDsl.g:3386:2: ( ruleImage )
            {
            // InternalMyDsl.g:3386:2: ( ruleImage )
            // InternalMyDsl.g:3387:3: ruleImage
            {
             before(grammarAccess.getServiceAccess().getImageImageParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getImageImageParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Service__ImageAssignment_6"


    // $ANTLR start "rule__Service__PortAssignment_7_2"
    // InternalMyDsl.g:3396:1: rule__Service__PortAssignment_7_2 : ( rulePort ) ;
    public final void rule__Service__PortAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3400:1: ( ( rulePort ) )
            // InternalMyDsl.g:3401:2: ( rulePort )
            {
            // InternalMyDsl.g:3401:2: ( rulePort )
            // InternalMyDsl.g:3402:3: rulePort
            {
             before(grammarAccess.getServiceAccess().getPortPortParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getPortPortParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Service__PortAssignment_7_2"


    // $ANTLR start "rule__Service__PortAssignment_7_3_1"
    // InternalMyDsl.g:3411:1: rule__Service__PortAssignment_7_3_1 : ( rulePort ) ;
    public final void rule__Service__PortAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3415:1: ( ( rulePort ) )
            // InternalMyDsl.g:3416:2: ( rulePort )
            {
            // InternalMyDsl.g:3416:2: ( rulePort )
            // InternalMyDsl.g:3417:3: rulePort
            {
             before(grammarAccess.getServiceAccess().getPortPortParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getPortPortParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__Service__PortAssignment_7_3_1"


    // $ANTLR start "rule__Service__VolumeAssignment_8_2"
    // InternalMyDsl.g:3426:1: rule__Service__VolumeAssignment_8_2 : ( ruleVolume ) ;
    public final void rule__Service__VolumeAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3430:1: ( ( ruleVolume ) )
            // InternalMyDsl.g:3431:2: ( ruleVolume )
            {
            // InternalMyDsl.g:3431:2: ( ruleVolume )
            // InternalMyDsl.g:3432:3: ruleVolume
            {
             before(grammarAccess.getServiceAccess().getVolumeVolumeParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVolume();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getVolumeVolumeParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Service__VolumeAssignment_8_2"


    // $ANTLR start "rule__Service__VolumeAssignment_8_3_1"
    // InternalMyDsl.g:3441:1: rule__Service__VolumeAssignment_8_3_1 : ( ruleVolume ) ;
    public final void rule__Service__VolumeAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3445:1: ( ( ruleVolume ) )
            // InternalMyDsl.g:3446:2: ( ruleVolume )
            {
            // InternalMyDsl.g:3446:2: ( ruleVolume )
            // InternalMyDsl.g:3447:3: ruleVolume
            {
             before(grammarAccess.getServiceAccess().getVolumeVolumeParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVolume();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getVolumeVolumeParserRuleCall_8_3_1_0()); 

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
    // $ANTLR end "rule__Service__VolumeAssignment_8_3_1"


    // $ANTLR start "rule__Service__NetworkAssignment_9_2"
    // InternalMyDsl.g:3456:1: rule__Service__NetworkAssignment_9_2 : ( ruleNetwork ) ;
    public final void rule__Service__NetworkAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3460:1: ( ( ruleNetwork ) )
            // InternalMyDsl.g:3461:2: ( ruleNetwork )
            {
            // InternalMyDsl.g:3461:2: ( ruleNetwork )
            // InternalMyDsl.g:3462:3: ruleNetwork
            {
             before(grammarAccess.getServiceAccess().getNetworkNetworkParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNetworkNetworkParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Service__NetworkAssignment_9_2"


    // $ANTLR start "rule__Service__NetworkAssignment_9_3_1"
    // InternalMyDsl.g:3471:1: rule__Service__NetworkAssignment_9_3_1 : ( ruleNetwork ) ;
    public final void rule__Service__NetworkAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3475:1: ( ( ruleNetwork ) )
            // InternalMyDsl.g:3476:2: ( ruleNetwork )
            {
            // InternalMyDsl.g:3476:2: ( ruleNetwork )
            // InternalMyDsl.g:3477:3: ruleNetwork
            {
             before(grammarAccess.getServiceAccess().getNetworkNetworkParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNetworkNetworkParserRuleCall_9_3_1_0()); 

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
    // $ANTLR end "rule__Service__NetworkAssignment_9_3_1"


    // $ANTLR start "rule__Service__EnvironmentAssignment_10_2"
    // InternalMyDsl.g:3486:1: rule__Service__EnvironmentAssignment_10_2 : ( ruleEnvironment ) ;
    public final void rule__Service__EnvironmentAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3490:1: ( ( ruleEnvironment ) )
            // InternalMyDsl.g:3491:2: ( ruleEnvironment )
            {
            // InternalMyDsl.g:3491:2: ( ruleEnvironment )
            // InternalMyDsl.g:3492:3: ruleEnvironment
            {
             before(grammarAccess.getServiceAccess().getEnvironmentEnvironmentParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getEnvironmentEnvironmentParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__Service__EnvironmentAssignment_10_2"


    // $ANTLR start "rule__Service__EnvironmentAssignment_10_3_1"
    // InternalMyDsl.g:3501:1: rule__Service__EnvironmentAssignment_10_3_1 : ( ruleEnvironment ) ;
    public final void rule__Service__EnvironmentAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3505:1: ( ( ruleEnvironment ) )
            // InternalMyDsl.g:3506:2: ( ruleEnvironment )
            {
            // InternalMyDsl.g:3506:2: ( ruleEnvironment )
            // InternalMyDsl.g:3507:3: ruleEnvironment
            {
             before(grammarAccess.getServiceAccess().getEnvironmentEnvironmentParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getEnvironmentEnvironmentParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__Service__EnvironmentAssignment_10_3_1"


    // $ANTLR start "rule__Image__NameAssignment_2"
    // InternalMyDsl.g:3516:1: rule__Image__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Image__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3520:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3521:2: ( ruleEString )
            {
            // InternalMyDsl.g:3521:2: ( ruleEString )
            // InternalMyDsl.g:3522:3: ruleEString
            {
             before(grammarAccess.getImageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getImageAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Image__NameAssignment_2"


    // $ANTLR start "rule__Image__TagAssignment_4_1"
    // InternalMyDsl.g:3531:1: rule__Image__TagAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Image__TagAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3536:2: ( ruleEString )
            {
            // InternalMyDsl.g:3536:2: ( ruleEString )
            // InternalMyDsl.g:3537:3: ruleEString
            {
             before(grammarAccess.getImageAccess().getTagEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getImageAccess().getTagEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Image__TagAssignment_4_1"


    // $ANTLR start "rule__Port__NumberAssignment_3_1"
    // InternalMyDsl.g:3546:1: rule__Port__NumberAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Port__NumberAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3550:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3551:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3551:2: ( ruleEInt )
            // InternalMyDsl.g:3552:3: ruleEInt
            {
             before(grammarAccess.getPortAccess().getNumberEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPortAccess().getNumberEIntParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Port__NumberAssignment_3_1"


    // $ANTLR start "rule__Port__ProtocolAssignment_4_1"
    // InternalMyDsl.g:3561:1: rule__Port__ProtocolAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Port__ProtocolAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3565:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3566:2: ( ruleEString )
            {
            // InternalMyDsl.g:3566:2: ( ruleEString )
            // InternalMyDsl.g:3567:3: ruleEString
            {
             before(grammarAccess.getPortAccess().getProtocolEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPortAccess().getProtocolEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Port__ProtocolAssignment_4_1"


    // $ANTLR start "rule__Volume__SourceAssignment_3_1"
    // InternalMyDsl.g:3576:1: rule__Volume__SourceAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Volume__SourceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3580:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3581:2: ( ruleEString )
            {
            // InternalMyDsl.g:3581:2: ( ruleEString )
            // InternalMyDsl.g:3582:3: ruleEString
            {
             before(grammarAccess.getVolumeAccess().getSourceEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVolumeAccess().getSourceEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Volume__SourceAssignment_3_1"


    // $ANTLR start "rule__Volume__TargetAssignment_4_1"
    // InternalMyDsl.g:3591:1: rule__Volume__TargetAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Volume__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3595:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3596:2: ( ruleEString )
            {
            // InternalMyDsl.g:3596:2: ( ruleEString )
            // InternalMyDsl.g:3597:3: ruleEString
            {
             before(grammarAccess.getVolumeAccess().getTargetEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVolumeAccess().getTargetEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Volume__TargetAssignment_4_1"


    // $ANTLR start "rule__Network__NameAssignment_2"
    // InternalMyDsl.g:3606:1: rule__Network__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Network__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3610:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3611:2: ( ruleEString )
            {
            // InternalMyDsl.g:3611:2: ( ruleEString )
            // InternalMyDsl.g:3612:3: ruleEString
            {
             before(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Network__NameAssignment_2"


    // $ANTLR start "rule__Network__DriverAssignment_4_1"
    // InternalMyDsl.g:3621:1: rule__Network__DriverAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Network__DriverAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3625:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3626:2: ( ruleEString )
            {
            // InternalMyDsl.g:3626:2: ( ruleEString )
            // InternalMyDsl.g:3627:3: ruleEString
            {
             before(grammarAccess.getNetworkAccess().getDriverEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getDriverEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Network__DriverAssignment_4_1"


    // $ANTLR start "rule__Environment__NameAssignment_2"
    // InternalMyDsl.g:3636:1: rule__Environment__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Environment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3641:2: ( ruleEString )
            {
            // InternalMyDsl.g:3641:2: ( ruleEString )
            // InternalMyDsl.g:3642:3: ruleEString
            {
             before(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Environment__NameAssignment_2"


    // $ANTLR start "rule__Environment__ValueAssignment_4_1"
    // InternalMyDsl.g:3651:1: rule__Environment__ValueAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Environment__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3656:2: ( ruleEString )
            {
            // InternalMyDsl.g:3656:2: ( ruleEString )
            // InternalMyDsl.g:3657:3: ruleEString
            {
             before(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getValueEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Environment__ValueAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007802000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000C0002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000002000L});

}
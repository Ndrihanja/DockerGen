/*
 * generated by Xtext 2.35.0
 */
package org.xtext.docker.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.docker.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.docker.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getComposeAccess().getGroup(), "rule__Compose__Group__0");
			builder.put(grammarAccess.getComposeAccess().getGroup_3(), "rule__Compose__Group_3__0");
			builder.put(grammarAccess.getComposeAccess().getGroup_4(), "rule__Compose__Group_4__0");
			builder.put(grammarAccess.getComposeAccess().getGroup_4_3(), "rule__Compose__Group_4_3__0");
			builder.put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_3(), "rule__Service__Group_3__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_4(), "rule__Service__Group_4__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_4_3(), "rule__Service__Group_4_3__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_7(), "rule__Service__Group_7__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_7_3(), "rule__Service__Group_7_3__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_8(), "rule__Service__Group_8__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_8_3(), "rule__Service__Group_8_3__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_9(), "rule__Service__Group_9__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_9_3(), "rule__Service__Group_9_3__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_10(), "rule__Service__Group_10__0");
			builder.put(grammarAccess.getServiceAccess().getGroup_10_3(), "rule__Service__Group_10_3__0");
			builder.put(grammarAccess.getImageAccess().getGroup(), "rule__Image__Group__0");
			builder.put(grammarAccess.getImageAccess().getGroup_4(), "rule__Image__Group_4__0");
			builder.put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
			builder.put(grammarAccess.getPortAccess().getGroup_3(), "rule__Port__Group_3__0");
			builder.put(grammarAccess.getPortAccess().getGroup_4(), "rule__Port__Group_4__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup(), "rule__Volume__Group__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_3(), "rule__Volume__Group_3__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_4(), "rule__Volume__Group_4__0");
			builder.put(grammarAccess.getNetworkAccess().getGroup(), "rule__Network__Group__0");
			builder.put(grammarAccess.getNetworkAccess().getGroup_4(), "rule__Network__Group_4__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup(), "rule__Environment__Group__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup_4(), "rule__Environment__Group_4__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getComposeAccess().getVersionAssignment_3_1(), "rule__Compose__VersionAssignment_3_1");
			builder.put(grammarAccess.getComposeAccess().getServiceAssignment_4_2(), "rule__Compose__ServiceAssignment_4_2");
			builder.put(grammarAccess.getComposeAccess().getServiceAssignment_4_3_1(), "rule__Compose__ServiceAssignment_4_3_1");
			builder.put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
			builder.put(grammarAccess.getServiceAccess().getCommandAssignment_3_1(), "rule__Service__CommandAssignment_3_1");
			builder.put(grammarAccess.getServiceAccess().getDepends_onAssignment_4_2(), "rule__Service__Depends_onAssignment_4_2");
			builder.put(grammarAccess.getServiceAccess().getDepends_onAssignment_4_3_1(), "rule__Service__Depends_onAssignment_4_3_1");
			builder.put(grammarAccess.getServiceAccess().getImageAssignment_6(), "rule__Service__ImageAssignment_6");
			builder.put(grammarAccess.getServiceAccess().getPortAssignment_7_2(), "rule__Service__PortAssignment_7_2");
			builder.put(grammarAccess.getServiceAccess().getPortAssignment_7_3_1(), "rule__Service__PortAssignment_7_3_1");
			builder.put(grammarAccess.getServiceAccess().getVolumeAssignment_8_2(), "rule__Service__VolumeAssignment_8_2");
			builder.put(grammarAccess.getServiceAccess().getVolumeAssignment_8_3_1(), "rule__Service__VolumeAssignment_8_3_1");
			builder.put(grammarAccess.getServiceAccess().getNetworkAssignment_9_2(), "rule__Service__NetworkAssignment_9_2");
			builder.put(grammarAccess.getServiceAccess().getNetworkAssignment_9_3_1(), "rule__Service__NetworkAssignment_9_3_1");
			builder.put(grammarAccess.getServiceAccess().getEnvironmentAssignment_10_2(), "rule__Service__EnvironmentAssignment_10_2");
			builder.put(grammarAccess.getServiceAccess().getEnvironmentAssignment_10_3_1(), "rule__Service__EnvironmentAssignment_10_3_1");
			builder.put(grammarAccess.getImageAccess().getNameAssignment_2(), "rule__Image__NameAssignment_2");
			builder.put(grammarAccess.getImageAccess().getTagAssignment_4_1(), "rule__Image__TagAssignment_4_1");
			builder.put(grammarAccess.getPortAccess().getNumberAssignment_3_1(), "rule__Port__NumberAssignment_3_1");
			builder.put(grammarAccess.getPortAccess().getProtocolAssignment_4_1(), "rule__Port__ProtocolAssignment_4_1");
			builder.put(grammarAccess.getVolumeAccess().getSourceAssignment_3_1(), "rule__Volume__SourceAssignment_3_1");
			builder.put(grammarAccess.getVolumeAccess().getTargetAssignment_4_1(), "rule__Volume__TargetAssignment_4_1");
			builder.put(grammarAccess.getNetworkAccess().getNameAssignment_2(), "rule__Network__NameAssignment_2");
			builder.put(grammarAccess.getNetworkAccess().getDriverAssignment_4_1(), "rule__Network__DriverAssignment_4_1");
			builder.put(grammarAccess.getEnvironmentAccess().getNameAssignment_2(), "rule__Environment__NameAssignment_2");
			builder.put(grammarAccess.getEnvironmentAccess().getValueAssignment_4_1(), "rule__Environment__ValueAssignment_4_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
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

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

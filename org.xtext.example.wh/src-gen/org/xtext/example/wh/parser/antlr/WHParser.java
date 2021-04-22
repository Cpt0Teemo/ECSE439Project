/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.wh.parser.antlr.internal.InternalWHParser;
import org.xtext.example.wh.services.WHGrammarAccess;

public class WHParser extends AbstractAntlrParser {

	@Inject
	private WHGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalWHParser createParser(XtextTokenStream stream) {
		return new InternalWHParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "WarehouseManagement";
	}

	public WHGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WHGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

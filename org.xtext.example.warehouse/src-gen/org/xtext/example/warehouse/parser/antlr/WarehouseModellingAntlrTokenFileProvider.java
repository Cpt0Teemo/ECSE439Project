/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.warehouse.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class WarehouseModellingAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/warehouse/parser/antlr/internal/InternalWarehouseModelling.tokens");
	}
}
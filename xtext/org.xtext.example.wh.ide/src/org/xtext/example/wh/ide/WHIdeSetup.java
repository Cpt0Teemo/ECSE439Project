/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.wh.WHRuntimeModule;
import org.xtext.example.wh.WHStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class WHIdeSetup extends WHStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new WHRuntimeModule(), new WHIdeModule()));
	}
	
}

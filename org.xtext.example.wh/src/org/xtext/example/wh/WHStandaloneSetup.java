/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.wh;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class WHStandaloneSetup extends WHStandaloneSetupGenerated {

	public static void doSetup() {
		new WHStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
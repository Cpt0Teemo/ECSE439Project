package org.xtext.example.warehouse;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class Main {

	public static void main(String[] args) {
		exportXMI("/Users/jamieli/runtime-EclipseXtext/model");

	}
	
	private static void exportXMI(String absuloteTargetFolderPath) {
	    // change MyLanguage with your language name
	    Injector injector = new ()
	            .createInjectorAndDoEMFRegistration();
	    XtextResourceSet resourceSet = injector
	            .getInstance(XtextResourceSet.class);

	    // .ext ist the extension of the model file
	    String inputURI = "file:///" + absuloteTargetFolderPath + "/model.wh";
	    String outputURI = "file:///" + absuloteTargetFolderPath + "/output.xmi";
	    URI uri = URI.createURI(inputURI);	
	    Resource xtextResource = resourceSet.getResource(uri, true);

	    EcoreUtil.resolveAll(xtextResource);

	    Resource xmiResource = resourceSet
	            .createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}

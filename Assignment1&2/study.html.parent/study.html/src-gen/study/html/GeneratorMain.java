package study.html;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import eMF.EMFPackage;
import eMF.Institute;
import eMF.util.EMFResourceFactoryImpl;


public class GeneratorMain {
	
	public static void main(String[] args) throws IOException {
		Institute ins = getInstitute();
		String studyplan = new Generator().generateHtml(ins);
		String workingDir = System.getProperty("user.dir");
		URI html = URI.createURI(workingDir + "/src-gen/study/html/index.html");
		try (PrintStream ps = new PrintStream(ins.eResource().getResourceSet().getURIConverter().createOutputStream(html))) {
			ps.print(studyplan);
			ps.close();
		}
		System.out.println(studyplan);
	}
	
	public static Institute getInstitute() throws IOException {
		
		ResourceSet rs = new ResourceSetImpl();
		// relate the RaPackage identifier used in XMI files to the RaPackage instance (EPackage meta-object) 
		rs.getPackageRegistry().put(EMFPackage.eNS_URI, EMFPackage.eINSTANCE);
		// relate the XMI parser to the 'xmi' file extension
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new EMFResourceFactoryImpl());

		Resource resource = rs.getResource(URI.createURI(GeneratorMain.class.getResource("Institute.xmi").toString()), true);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Institute) {
				return (Institute) eObject;
			}
		}
		return null;
	}


}

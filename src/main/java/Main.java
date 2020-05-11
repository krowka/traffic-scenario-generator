import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

import java.io.File;

public class Main {

    public static void main(String[] args) throws OWLOntologyCreationException {
        String fileName = "traffic_ontology.owl";
        String directoryPath = System.getProperty("user.dir") + "/src/main/resources/";

        File ontologyFile = new File(directoryPath + fileName);

        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(ontologyFile);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
		
		// use scenario generators
    }

}

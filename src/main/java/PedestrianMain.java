import org.apache.commons.io.IOUtils;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class PedestrianMain {

    public static void main(String[] args) throws OWLOntologyCreationException, FileNotFoundException, OWLOntologyStorageException {
        String fileName = "traffic_ontology.owl";
        String directoryPath = System.getProperty("user.dir") + "\\src\\main\\resources\\";

        File ontologyFile = new File(directoryPath + fileName);
        if (!ontologyFile.exists())
            throw new FileNotFoundException("File: " + ontologyFile.getAbsolutePath() + " not found");

        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(ontologyFile);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
        OWLReasonerFactory owlReasonerFactory = new StructuralReasonerFactory();
        OWLReasoner reasoner = owlReasonerFactory.createReasoner(ontology);
        String baseIRI = "http://webprotege.stanford.edu/";
        Configuration configuration = new Configuration(manager, ontology, dataFactory, reasoner, baseIRI);

        PedestrianScenarioGenerator g = new PedestrianScenarioGenerator(configuration);
        g.generate();

        OutputStream outputFile = new FileOutputStream(directoryPath + "pedestrian_changed_" + fileName);
        try {
            manager.saveOntology(ontology, outputFile);
            System.out.println("All changes saved in original file: pedestrian_changed_" + fileName);
        } finally {
            IOUtils.closeQuietly(outputFile);
        }
    }


}

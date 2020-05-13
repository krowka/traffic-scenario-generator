import org.apache.commons.io.IOUtils;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private void generate() throws FileNotFoundException, OWLOntologyCreationException, OWLOntologyStorageException {
        // right hand driving
        // OWLClass rhdClass = dataFactory.getOWLClass(IRI.create(baseIRI + "overtaking"));
        // OWLObjectProperty has_lawsOP = dataFactory.getOWLObjectProperty(IRI.create(baseIRI + "has_vehicle"));

        // OWLObjectPropertyAssertionAxiom assertion3 = dataFactory.getOWLObjectPropertyAssertionAxiom(has_lawsOP, overtakingIndividual, rhdClass);
        // AddAxiom addAxiomChange3 = new AddAxiom(ontology, assertion3);
        // manager.applyChange(addAxiomChange3);
    }


    public static void main(String[] args) throws OWLOntologyCreationException, FileNotFoundException, OWLOntologyStorageException {
        String fileName = "traffic_ontology.owl";
        String directoryPath = System.getProperty("user.dir") + "\\src\\main\\resources\\";

        File ontologyFile = new File(directoryPath + fileName);
        if(!ontologyFile.exists())
            throw new FileNotFoundException("File: " + ontologyFile.getAbsolutePath() + " not found");

        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(ontologyFile);
        OWLDataFactory dataFactory = manager.getOWLDataFactory();

        String baseIRI = "http://webprotege.stanford.edu/";

        OvertakingScenarioGenerator g = new OvertakingScenarioGenerator(manager, ontology, dataFactory, baseIRI);
        g.generate();

        OutputStream outputFile = new FileOutputStream(directoryPath + "changed_" + fileName);
        try {
            manager.saveOntology(ontology, outputFile);
            System.out.println("All changes saved in original file: changed_" + fileName);
        }
        finally {
            IOUtils.closeQuietly(outputFile);
        }
    }

}

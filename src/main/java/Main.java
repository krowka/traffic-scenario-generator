import org.apache.commons.io.IOUtils;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import project.MyFactory;
import project.Scenario;
import project.Time;
import project.Vehicle;
import project.Weather;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {


    public static void main(String[] args) throws FileNotFoundException, OWLOntologyCreationException, OWLOntologyStorageException {
        String fileName = "traffic_ontology.owl";
        String directoryPath = System.getProperty("user.dir") + "\\src\\main\\resources\\";

        File ontologyFile = new File(directoryPath + fileName);
        if (!ontologyFile.exists())
            throw new FileNotFoundException("File: " + ontologyFile.getAbsolutePath() + " not found");

        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(ontologyFile);
        MyFactory factory = new MyFactory(ontology);

        Scenario s = factory.createScenario("A");
        Time t = factory.createTime("T");

        Vehicle v = factory.createVehicleSubclass("X");

        System.out.println(v.getClass());

        factory.saveOwlOntology();
    }
}

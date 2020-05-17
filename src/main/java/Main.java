import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;
import project.MyFactory;
import project.Scenario;
import project.Time;
import project.Vehicle;

import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    private static String baseIRI = "http://webprotege.stanford.edu/";


    public static void main(String[] args) throws FileNotFoundException, OWLOntologyCreationException, OWLOntologyStorageException {
        String fileName = "traffic_ontology.owl";
        String directoryPath = System.getProperty("user.dir") + "\\src\\main\\resources\\";

        File ontologyFile = new File(directoryPath + fileName);
        if (!ontologyFile.exists())
            throw new FileNotFoundException("File: " + ontologyFile.getAbsolutePath() + " not found");

        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(ontologyFile);
        compareSolutions(ontology, manager);
        MyFactory factory = new MyFactory(ontology);
        Scenario s = factory.createScenario("A");
        Time t = factory.createTime("T");
        Vehicle v = factory.createVehicleSubclass(baseIRI + "RandomVehicleSubclass");
        System.out.println(v.getClass());
        factory.saveOwlOntology();
    }

    private static void compareSolutions(OWLOntology ontology, OWLOntologyManager manager) throws OWLOntologyStorageException {
        long startTime = System.nanoTime();
        OWLDataFactory dataFactory = manager.getOWLDataFactory();
        OWLReasonerFactory owlReasonerFactory = new StructuralReasonerFactory();
        OWLReasoner reasoner = owlReasonerFactory.createReasoner(ontology);
        OWLIndividual individual = getIndividual(baseIRI, dataFactory, manager, ontology, "scenario", "scenarioOWL");
        ontology.saveOntology();
        System.out.println("OWLAPI TIME: " + (System.nanoTime() - startTime) / 1000000);

        startTime = System.nanoTime();
        MyFactory factory = new MyFactory(ontology);
        Scenario s = factory.createScenario("scenarioJAVA");
        factory.saveOwlOntology();
        System.out.println("JAVA TIME: " + (System.nanoTime() - startTime) / 1000000);
    }

    private static OWLIndividual getIndividual(String baseIRI, OWLDataFactory dataFactory, OWLOntologyManager manager, OWLOntology ontology, String entityName, String name) {
        String iriName = baseIRI + entityName;
        OWLClass iClass = dataFactory.getOWLClass(IRI.create(iriName));
        OWLIndividual individual = dataFactory.getOWLNamedIndividual(IRI.create(baseIRI + name));
        OWLClassAssertionAxiom ax = dataFactory.getOWLClassAssertionAxiom(iClass, individual);
        manager.addAxiom(ontology, ax);
        return individual;
    }
}

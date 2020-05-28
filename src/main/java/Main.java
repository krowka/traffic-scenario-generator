import generator.AnimalOnRoadSG;
import generator.CarApproachingSG;
import generator.CarOvertakingSG;
import generator.ObstacleOnRoadSG;
import generator.PedestrianIllegallyCrossingSG;
import generator.PedestrianOnCrosswalkSG;
import generator.ScenarioGenerator;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import project.MyFactory;
import project.Passenger;
import project.Scenario;
import project.Vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

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

        ScenarioGenerator generator;
        generator = new AnimalOnRoadSG(factory);
//        generator = new CarApproachingSG(factory);
//        generator = new CarOvertakingSG(factory);
        generator = new ObstacleOnRoadSG(factory);
//        generator = new PedestrianIllegallyCrossingSG(factory);
//        generator = new PedestrianOnCrosswalkSG(factory);
        generator.generate(5, 1);
//        generator.generate();
        factory.saveOwlOntology();
    }


}

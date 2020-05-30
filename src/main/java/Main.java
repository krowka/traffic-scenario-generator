import generator.AnimalOnRoadSG;
import generator.ObstacleOnRoadSG;
import generator.BaseScenarioGenerator;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import project.MyFactory;

import java.io.File;
import java.io.FileNotFoundException;

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
        String baseIRI = "http://webprotege.stanford.edu/";

        BaseScenarioGenerator generator;
        generator = new AnimalOnRoadSG(factory);
//        generator = new CarApproachingSG(factory);
//        generator = new CarOvertakingSG(factory);
        generator = new ObstacleOnRoadSG(factory);
//        generator = new PedestrianIllegallyCrossingSG(factory);
//        generator = new PedestrianOnCrosswalkSG(factory);
        generator.generate(5, 1);
        factory.saveOwlOntology();
    }


}

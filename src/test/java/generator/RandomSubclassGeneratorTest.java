package generator;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import project.MyFactory;
import project.Vehicle;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class RandomSubclassGeneratorTest {
    private RandomSubclassGenerator randomSubclassGenerator;

    @Before
    public void setUpClass() throws Exception {
        String fileName = "traffic_ontology.owl";
        String directoryPath = System.getProperty("user.dir") + "\\src\\main\\resources\\";
        File ontologyFile = new File(directoryPath + fileName);
//        if (!ontologyFile.exists())
//            throw new FileNotFoundException("File: " + ontologyFile.getAbsolutePath() + " not found");
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(ontologyFile);
        MyFactory factory = new MyFactory(ontology);
        this.randomSubclassGenerator = new RandomSubclassGenerator(ontology, factory);
    }


    @Test
    public void generateVehicleSubclass() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Vehicle vehicle = randomSubclassGenerator.generateVehicleSubclass();
        assertTrue(Vehicle.class.isAssignableFrom(vehicle.getClass()));
        assertNotEquals(Vehicle.class, vehicle.getClass());
    }

    @Test
    public void testGenerateVehicleSubclass() {
    }

    @Test
    public void generateWeatherSubclass() {
    }

    @Test
    public void testGenerateWeatherSubclass() {
    }

    @Test
    public void generateAnimalSubclass() {
    }

    @Test
    public void testGenerateAnimalSubclass() {
    }

    @Test
    public void generateTimeSubclass() {
    }

    @Test
    public void testGenerateTimeSubclass() {
    }

    @Test
    public void generateRoadTypeSubclass() {
    }

    @Test
    public void testGenerateRoadTypeSubclass() {
    }

    @Test
    public void generateSurroundingSubclass() {
    }

    @Test
    public void testGenerateSurroundingSubclass() {
    }

    @Test
    public void generatePassengerSubclass() {
    }

    @Test
    public void testGeneratePassengerSubclass() {
    }
}
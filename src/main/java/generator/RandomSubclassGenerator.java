package generator;

import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;
import project.*;
import project.impl.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomSubclassGenerator {
    private final String iriPrefix = "http://webprotege.stanford.edu/";
    private MyFactory factory;
    private OWLOntology ontology;
    private OWLOntologyManager manager;
    private OWLReasoner reasoner;
    private OWLDataFactory dataFactory;
    private Random random;

    public RandomSubclassGenerator(OWLOntology ontology, MyFactory factory, OWLReasoner reasoner) {
        this.ontology = ontology;
        this.factory = factory;
        this.reasoner = reasoner;
        manager = ontology.getOWLOntologyManager();
        dataFactory = manager.getOWLDataFactory();
        random = new Random();
    }

    public RandomSubclassGenerator(OWLOntology ontology, MyFactory factory) {
        this(ontology, factory, new StructuralReasonerFactory().createReasoner(ontology));
    }

    // default method for basic IRI
    public Vehicle generateVehicleSubclass() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateVehicleSubclass("vehicle");
    }

    // method for customized IRI
    public Vehicle generateVehicleSubclass(String iriName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateSubclass(DefaultVehicle.class, iriName);
    }

    public Weather generateWeatherSubclass() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateWeatherSubclass("weather");
    }

    public Weather generateWeatherSubclass(String iriName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateSubclass(DefaultWeather.class, iriName);
    }

    public Animal generateAnimalSubclass() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateAnimalSubclass("animal");
    }

    public Animal generateAnimalSubclass(String iriName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateSubclass(DefaultAnimal.class, iriName);
    }

    public Time generateTimeSubclass() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateTimeSubclass("time");
    }

    public Time generateTimeSubclass(String iriName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateSubclass(DefaultTime.class, iriName);
    }

    public Road_type generateRoadTypeSubclass() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateRoadTypeSubclass("road_type");
    }

    public Road_type generateRoadTypeSubclass(String iriName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateSubclass(DefaultRoad_type.class, iriName);
    }

    public Surrounding generateSurroundingSubclass() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateSurroundingSubclass("surrounding");
    }

    public Surrounding generateSurroundingSubclass(String iriName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateSubclass(DefaultSurrounding.class, iriName);
    }

    public Passenger generatePassengerSubclass() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generatePassengerSubclass("passenger");
    }

    public Passenger generatePassengerSubclass(String iriName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return generateSubclass(DefaultPassenger.class, iriName);
    }


    private <T extends WrappedIndividualImpl> T generateSubclass(Class<T> clazz, String iriName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String iriString = iriPrefix + iriName;
        OWLClass type = dataFactory.getOWLClass(IRI.create(iriString));
        List<String> classNames = getSubclassesNames(type);
        System.out.println(classNames);
        String randomSubclassName = classNames.get(random.nextInt(classNames.size()));
        Method method = factory.getClass().getDeclaredMethod("create" + randomSubclassName, String.class);
        System.out.println(method);
        // TODO change created instances name
        @SuppressWarnings("unchecked")
        T subclassInstance = (T) method.invoke(factory, "reflect_" + randomSubclassName);
        System.out.println(subclassInstance.getOwlIndividual());
        System.out.println(subclassInstance);
        return subclassInstance;
    }

    private List<String> getSubclassesNames(OWLClass baseClass) {
        Function<String, String> toCapitalLetter = s -> s.substring(0, 1).toUpperCase() + s.substring(1);
        Function<String, String> extractSimpleName = fullName -> fullName
                .substring(fullName.lastIndexOf("/") + 1, fullName.length() - 1);

        List<OWLClass> subClassList = new ArrayList<>(reasoner.getSubClasses(baseClass, true).getFlattened());
        System.out.println(subClassList);
        return subClassList.stream()
                .map(OWLClass::toString)
                .map(extractSimpleName)
                .map(toCapitalLetter)
                .collect(Collectors.toList());
    }
}

package generator;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import project.MyFactory;
import project.Vehicle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomSubclassGenerator {
    private MyFactory factory;
    private final OWLReasoner reasoner;
    private final OWLDataFactory dataFactory;

    public RandomSubclassGenerator(OWLReasoner reasoner, MyFactory factory, OWLDataFactory dataFactory) {
        this.reasoner = reasoner;
        this.factory = factory;
        this.dataFactory = dataFactory;
    }

    public Vehicle generateVehicleSubclass() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Function<String, String> toCapitalLetter = s -> s.substring(0, 1).toUpperCase() + s.substring(1);
        OWLClass type = dataFactory.getOWLClass(IRI.create("http://webprotege.stanford.edu/vehicle"));
        List<OWLClass> subClassList = new ArrayList<>(reasoner.getSubClasses(type, true).getFlattened());
        System.out.println(subClassList);
        List<String> classNames = subClassList.stream()
                .map(OWLObject::toString)
                .map(s -> s.substring(s.lastIndexOf("/") + 1, s.length() - 1))
                .map(toCapitalLetter)
                .collect(Collectors.toList());
        System.out.println(classNames);
        String randomSubclassName = classNames.get(new Random().nextInt(subClassList.size()));
        Method method = factory.getClass().getDeclaredMethod("create" + randomSubclassName, String.class);
        System.out.println(method);
        Vehicle vehicle = (Vehicle) method.invoke(factory, "reflect_Vehicle");
        System.out.println(vehicle.getOwlIndividual());
        System.out.println(vehicle);
        return vehicle;
    }
}

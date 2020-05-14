import org.semanticweb.owlapi.model.OWLIndividual;

public class PedestrianScenarioGenerator extends ScenarioGenerator {

    public PedestrianScenarioGenerator(Configuration configuration) {
        super(configuration);
    }


    public void generate() {
        OWLIndividual crosswalkingIndividual = getIndividual("crosswalking");
        OWLIndividual vehicleIndividual = getIndividual("vehicle");
        OWLIndividual pedestrian = getIndividual("pedestrian");
        OWLIndividual roadTypeIndividual = getIndividual("provincial_road");
        OWLIndividual weatherIndividual = getIndividual("fog");
        OWLIndividual timeIndividual = getIndividual("morning");
        OWLIndividual pedestrianLocationIndividual = getIndividual("legal_pedestrian_crossings");


        addObjectPropertyAssertion("has_vehicle", crosswalkingIndividual, vehicleIndividual);
        addObjectPropertyAssertion("pedestrian_has_location", crosswalkingIndividual, pedestrianLocationIndividual);
        addObjectPropertyAssertion("has_weather", crosswalkingIndividual, weatherIndividual);
        addObjectPropertyAssertion("has_time", crosswalkingIndividual, timeIndividual);

    }
}

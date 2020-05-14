import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

import java.util.Set;


public class OvertakingScenarioGenerator extends ScenarioGenerator{

    public OvertakingScenarioGenerator(Configuration configuration) {
        super(configuration);
    }


    public void generate() {
        OWLIndividual overtakingI = getScenario();
        OWLIndividual vehicleI_1 = getVehicle();
        OWLIndividual vehicleI_2 = getVehicle();
        OWLIndividual weatherI = getWeather();
        OWLIndividual driver = getIndividual("driver");


        addObjectPropertyAssertion("has_vehicle", overtakingI, vehicleI_1);
        addObjectPropertyAssertion("has_vehicle", overtakingI, vehicleI_2);
        addObjectPropertyAssertion("has_weather", overtakingI, weatherI);

        addDataPropertyAssertion("vehicle_has_speed_kmph", vehicleI_1, 60);
        addDataPropertyAssertion("vehicle_has_speed_kmph", vehicleI_2, 70);
    }

    private OWLIndividual getScenario() {
        return getIndividual("overtaking");
    }

    private OWLIndividual getVehicle() {
        // TODO change to any vehicle
        return getIndividual("vehicle");
    }

    private OWLIndividual getWeather() {
        // TODO change to any weather
        return getIndividual("sunny");
    }

    private OWLIndividual getPerson() {
        // TODO change to any weather
        return getIndividual("driver");
    }

}

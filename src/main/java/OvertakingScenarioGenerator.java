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


    public void generate(int num) {
        for(int i = 0; i < num; i++) {
            setup();

            OWLIndividual overtakingI = getIndividual("overtaking");

            OWLIndividual vehicleI_1 = getSubclassIndividual("vehicle");
            OWLIndividual vehicleI_2 = getSubclassIndividual("vehicle");

            OWLIndividual weatherI = getSubclassIndividual("weather");

            OWLIndividual locationI =  getSubclassIndividual("road_type");

            OWLIndividual driverI_1 = getIndividual("driver");
            OWLIndividual driverI_2 = getIndividual("driver");

            OWLIndividual passengerI =  getIndividual("passenger");

            addObjectPropertyAssertion("has_vehicle", overtakingI, vehicleI_1);
            addObjectPropertyAssertion("has_vehicle", overtakingI, vehicleI_2);
            addObjectPropertyAssertion("has_weather", overtakingI, weatherI);
            addObjectPropertyAssertion("vehicle_has_driver", vehicleI_1, driverI_1);
            addObjectPropertyAssertion("vehicle_has_driver", vehicleI_2, driverI_2);
            addObjectPropertyAssertion("vehicle_has_location", vehicleI_1, locationI);
            addObjectPropertyAssertion("vehicle_has_passenger", vehicleI_1, passengerI);

            addDataPropertyAssertion("vehicle_has_speed_kmph", vehicleI_1, 60);
            addDataPropertyAssertion("vehicle_has_speed_kmph", vehicleI_2, 80);
            addDataPropertyAssertion("has_speed_limit_kmph", locationI, 60);
            addDataPropertyAssertion("has_lanes", locationI, 2);
        }
    }

    // TODO pack generating into functions
}

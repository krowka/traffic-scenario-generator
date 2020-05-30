package generator;

import project.MyFactory;
import project.Pedestrian;
import project.Scenario;
import project.Street_crossing;

public class PedestrianOnCrosswalkSG extends BaseScenarioGenerator {

    public PedestrianOnCrosswalkSG(MyFactory factory) {
        super(factory);
    }

    Pedestrian pedestrian;
    Street_crossing pedestrianLocation;

    @Override
    public Scenario generate(int scenarioId) {
        scenario = super.generate(scenarioId);

        pedestrian = factory.createPedestrian(getUniqueName("pedestrian", scenarioId));

        pedestrianLocation = factory.createStreet_crossing(getUniqueName("street_crossing", scenarioId));

        scenario.addHas_pedestrian(pedestrian);

        pedestrian.addPedestrian_has_location(pedestrianLocation);

        return scenario;
    }
}

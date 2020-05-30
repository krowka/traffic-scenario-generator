package generator;

import project.Illegal_pedestrian_crossings;
import project.MyFactory;
import project.Pedestrian;
import project.Scenario;

public class PedestrianIllegallyCrossingSG extends BaseScenarioGenerator {

    public PedestrianIllegallyCrossingSG(MyFactory factory) {
        super(factory);
    }

    Pedestrian pedestrian;
    Illegal_pedestrian_crossings pedestrianLocation;

    @Override
    public Scenario generate(int scenarioId) {
        scenario = super.generate(scenarioId);

        pedestrian = factory.createPedestrian(getUniqueName("pedestrian", scenarioId));

        pedestrianLocation = factory.createIllegal_pedestrian_crossings(getUniqueName("illegal_pedestrian_crossing", scenarioId));

        scenario.addHas_pedestrian(pedestrian);

        pedestrian.addPedestrian_has_location(pedestrianLocation);

        return scenario;
    }
}

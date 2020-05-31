package generator;

import project.MyFactory;
import project.Pedestrian;
import project.Scenario;
import project.Street_crossing;

public class PedestrianOnCrosswalkSG extends BaseScenarioGenerator {

    public PedestrianOnCrosswalkSG(MyFactory factory, String baseIRI) {
        super(factory, baseIRI);
    }

    @Override
    public PedestrianOnCrosswalkModel generate(int scenarioId) {
        PedestrianOnCrosswalkModel model = new PedestrianOnCrosswalkModel(super.generate(scenarioId));

        Pedestrian pedestrian = factory.createPedestrian(getUniqueName("pedestrian", scenarioId));

        Street_crossing pedestrianLocation = factory.createStreet_crossing(getUniqueName("street_crossing", scenarioId));

        model.getScenario().addHas_pedestrian(pedestrian);

        pedestrian.addPedestrian_has_location(pedestrianLocation);

        model.setPedestrian(pedestrian);
        model.setPedestrianLocation(pedestrianLocation);

        return model;
    }
}

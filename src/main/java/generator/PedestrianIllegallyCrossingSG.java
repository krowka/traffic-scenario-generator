package generator;

import project.Illegal_pedestrian_crossings;
import project.MyFactory;
import project.Pedestrian;
import project.Scenario;

public class PedestrianIllegallyCrossingSG extends BaseScenarioGenerator {

    public PedestrianIllegallyCrossingSG(MyFactory factory, String baseIRI) {
        super(factory, baseIRI);
    }

    Pedestrian pedestrian;
    Illegal_pedestrian_crossings pedestrianLocation;

    @Override
    public PedestrianIllegallyCrossingModel generate(int scenarioId) {
        PedestrianIllegallyCrossingModel model = new PedestrianIllegallyCrossingModel(super.generate(scenarioId));

        pedestrian = factory.createPedestrian(getUniqueName("pedestrian", scenarioId));

        pedestrianLocation = factory.createIllegal_pedestrian_crossings(getUniqueName("illegal_pedestrian_crossing", scenarioId));

        model.getScenario().addHas_pedestrian(pedestrian);

        pedestrian.addPedestrian_has_location(pedestrianLocation);

        model.setPedestrian(pedestrian);
        model.setPedestrianLocation(pedestrianLocation);

        return model;
    }

}

package generator;

import project.Illegal_pedestrian_crossings;
import project.MyFactory;
import project.Pedestrian;

public class PedestrianIllegallyCrossingSG extends BaseScenarioGenerator {

    public PedestrianIllegallyCrossingSG(MyFactory factory, String baseIRI) {
        super(factory, baseIRI);
    }

    Pedestrian pedestrian;
    Illegal_pedestrian_crossings pedestrianLocation;

    @Override
    public Model generate(int scenarioId) {
        Model model = super.generate(scenarioId);

        pedestrian = factory.createPedestrian(getUniqueName("pedestrian", scenarioId));

        pedestrianLocation = factory.createIllegal_pedestrian_crossings(getUniqueName("illegal_pedestrian_crossing", scenarioId));

        model.getScenario().addHas_pedestrian(pedestrian);

        pedestrian.addPedestrian_has_location(pedestrianLocation);

        return model;
    }

}

package generator;

import project.Animal;
import project.Driver;
import project.Human;
import project.Illegal_pedestrian_crossings;
import project.MyFactory;
import project.Passenger;
import project.Pedestrian;
import project.Road_type;
import project.Scenario;
import project.Surrounding;
import project.Time;
import project.Vehicle;
import project.Weather;

public class PedestrianIllegallyCrossingSG extends ScenarioGenerator  {

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

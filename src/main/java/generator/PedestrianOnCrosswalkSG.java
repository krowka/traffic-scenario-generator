package generator;

import project.Driver;
import project.Illegal_pedestrian_crossings;
import project.MyFactory;
import project.Passenger;
import project.Pedestrian;
import project.Road_type;
import project.Scenario;
import project.Street_crossing;
import project.Surrounding;
import project.Time;
import project.Vehicle;
import project.Weather;

public class PedestrianOnCrosswalkSG extends ScenarioGenerator  {

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

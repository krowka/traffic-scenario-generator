package generator;

import project.Driver;
import project.Entity;
import project.MyFactory;
import project.Scenario;
import project.Vehicle;

public class CarApproachingSG extends BaseScenarioGenerator {

    public CarApproachingSG(MyFactory factory) {
        super(factory);
    }

    Vehicle vehicle2;
    Driver driver2;

    @Override
    public Scenario generate(int scenarioId) {
        scenario = super.generate(scenarioId);

        vehicle2 = factory.createVehicle(getUniqueName("vehicle", scenarioId));

        driver2 = factory.createDriver(getUniqueName("driver", scenarioId));

        vehicle.addHas_at_the_back(vehicle2);

        vehicle2.addVehicle_has_driver(driver2);
        vehicle2.addVehicle_has_location(roadType);
        vehicle2.addVehicle_has_speed_kmph(80);
        vehicle2.addHas_on_the_right((Entity) surrounding.get("RIGHT"));
        vehicle2.addHas_on_the_left((Entity) surrounding.get("LEFT"));
        vehicle2.addHas_in_the_front(vehicle);

        return scenario;
    }
}

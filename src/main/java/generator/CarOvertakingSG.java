package generator;

import project.Driver;
import project.Entity;
import project.MyFactory;
import project.Passenger;
import project.Road_type;
import project.Scenario;
import project.Surrounding;
import project.Time;
import project.Vehicle;
import project.Weather;

import java.util.ArrayList;

public class CarOvertakingSG extends ScenarioGenerator {

    public CarOvertakingSG(MyFactory factory) {
        super(factory);
    }

    Vehicle vehicle2;
    Driver driver2;

    @Override
    public Scenario generate(int scenarioId) {
        scenario = super.generate(scenarioId);

        vehicle2 = factory.createVehicle(getUniqueName("vehicle", scenarioId));

        driver2 = factory.createDriver(getUniqueName("driver", scenarioId));

        scenario.addHas_vehicle(vehicle2);

        vehicle.addHas_on_the_left(vehicle);

        vehicle2.addVehicle_has_driver(driver);
        vehicle2.addVehicle_has_location(roadType);
        vehicle2.addVehicle_has_speed_kmph(80);
        vehicle2.addHas_on_the_right((Entity) surrounding.get("RIGHT"));
        vehicle2.addHas_on_the_left((Entity) surrounding.get("LEFT"));

        return scenario;
    }


}

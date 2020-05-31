package generator;

import project.Driver;
import project.Entity;
import project.MyFactory;
import project.Scenario;
import project.Vehicle;

public class CarOvertakingSG extends BaseScenarioGenerator {

    public CarOvertakingSG(MyFactory factory, String baseIRI) {
        super(factory, baseIRI);
    }

    @Override
    public CarOvertakingModel generate(int scenarioId) {
        CarOvertakingModel model = new CarOvertakingModel(super.generate(scenarioId));

        Vehicle vehicle = factory.createVehicle(getUniqueName("vehicle", scenarioId));

        Driver driver = factory.createDriver(getUniqueName("driver", scenarioId));

        vehicle.addHas_on_the_left(vehicle);

        vehicle.addVehicle_has_driver(driver);
        vehicle.addVehicle_has_location(model.getRoadType());
        vehicle.addVehicle_has_speed_kmph(80);
        vehicle.addHas_on_the_right(model.getSurrounding().get("RIGHT"));
        vehicle.addHas_on_the_left(model.getSurrounding().get("LEFT"));

        model.setVehice2(vehicle);
        model.setDriver2(driver);

        return model;
    }


}

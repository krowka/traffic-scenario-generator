package generator;

import project.Driver;
import project.MyFactory;
import project.Vehicle;

public class CarOvertakingSG extends BaseScenarioGenerator {

    public CarOvertakingSG(MyFactory factory, String baseIRI) {
        super(factory, baseIRI);
    }

    @Override
    public Model generate(int scenarioId) {
        Model model = super.generate(scenarioId);

        Vehicle vehicle = factory.createVehicle(getUniqueName("vehicle", scenarioId));

        Driver driver = factory.createDriver(getUniqueName("driver", scenarioId));

        vehicle.addHas_on_the_left(vehicle);

        vehicle.addVehicle_has_driver(driver);
        vehicle.addVehicle_has_location(model.getRoadType());
        vehicle.addVehicle_has_speed_kmph(80);
        vehicle.addHas_on_the_right(model.getSurrounding().get("RIGHT"));
        vehicle.addHas_on_the_left(model.getSurrounding().get("LEFT"));

        return model;
    }


}

package generator;

import project.Driver;
import project.MyFactory;
import project.Passenger;
import project.Road_type;
import project.Scenario;
import project.Vehicle;
import project.Weather;

public class CarOvertakingSG extends ScenarioGenerator {

    public CarOvertakingSG(MyFactory factory) {
        super(factory);
    }

    @Override
    public Scenario generate() {
        Scenario scenario = factory.createScenario(getUniqueName("scenario"));

        Vehicle vehicle1 = factory.createVehicle(getUniqueName("vehicle"));
        Vehicle vehicle2 = factory.createVehicle(getUniqueName("vehicle"));

        Weather weather = factory.createWeather(getUniqueName("weather"));

        Road_type roadType = factory.createRoad_type(getUniqueName("road_type"));

        Driver driver1 = factory.createDriver(getUniqueName("driver"));
        Driver driver2 = factory.createDriver(getUniqueName("driver"));

        Passenger passenger = factory.createPassenger(getUniqueName("passenger"));

        scenario.addHas_vehicle(vehicle1);
        scenario.addHas_vehicle(vehicle2);
        scenario.addHas_weather(weather);

        vehicle1.addVehicle_has_driver(driver1);
        vehicle1.addVehicle_has_passenger(passenger);
        vehicle1.addVehicle_has_location(roadType);
        vehicle1.addVehicle_has_speed_kmph(60);

        vehicle2.addVehicle_has_driver(driver2);
        vehicle2.addVehicle_has_location(roadType);
        vehicle2.addVehicle_has_speed_kmph(80);

        roadType.addHas_speed_limit_kmph(70);
        roadType.addHas_lanes(2);

        return scenario;
    }


}

package generator;

import project.Driver;
import project.MyFactory;
import project.Passenger;
import project.Road_type;
import project.Scenario;
import project.Surrounding;
import project.Time;
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

        Weather weather = factory.createWeatherSubclass(getUniqueName("weather"));

        Time time = factory.createTimeSubclass(getUniqueName("time"));

        Road_type roadType = factory.createRoad_typeSubclass(getUniqueName("road_type"));

        Driver driver1 = factory.createDriver(getUniqueName("driver"));
        Driver driver2 = factory.createDriver(getUniqueName("driver"));

        Surrounding surrounding1 = factory.createSurroundingSubclass(getUniqueName("surrounding"));
        Surrounding surrounding2 = factory.createSurroundingSubclass(getUniqueName("surrounding"));

        Passenger passenger = factory.createPassenger(getUniqueName("passenger"));

        scenario.addHas_vehicle(vehicle1);
        scenario.addHas_vehicle(vehicle2);
        scenario.addHas_weather(weather);
        scenario.addHas_time(time);

        vehicle1.addVehicle_has_driver(driver1);
        vehicle1.addVehicle_has_passenger(passenger);
        vehicle1.addVehicle_has_location(roadType);
        vehicle1.addVehicle_has_speed_kmph(60);
        vehicle1.addHas_on_the_left(vehicle2);
        vehicle1.addHas_on_the_right(surrounding1);

        vehicle2.addVehicle_has_driver(driver2);
        vehicle2.addVehicle_has_location(roadType);
        vehicle2.addVehicle_has_speed_kmph(80);
        vehicle2.addHas_on_the_left(surrounding2);
        vehicle2.addHas_on_the_right(vehicle1);

        roadType.addHas_speed_limit_kmph(70);
        roadType.addHas_lanes(2);

        return scenario;
    }


}

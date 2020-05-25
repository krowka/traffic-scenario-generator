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

    @Override
    public Scenario generate() {
        Scenario scenario = factory.createScenario(getUniqueName("scenario"));

        Vehicle vehicle = factory.createVehicle(getUniqueName("vehicle"));

        Pedestrian pedestrian = factory.createPedestrian(getUniqueName("pedestrian"));

        Illegal_pedestrian_crossings pedestrianLocation = factory.createIllegal_pedestrian_crossings(getUniqueName("illegal_pedestrian_crossing"));

        Weather weather = factory.createWeatherSubclass(getUniqueName("weather"));

        Time time = factory.createTimeSubclass(getUniqueName("time"));

        Road_type roadType = factory.createRoad_typeSubclass(getUniqueName("road_type"));

        Driver driver = factory.createDriver(getUniqueName("driver"));

        Surrounding surrounding1 = factory.createSurroundingSubclass(getUniqueName("surrounding"));
        Surrounding surrounding2 = factory.createSurroundingSubclass(getUniqueName("surrounding"));

        Passenger passenger = factory.createPassenger(getUniqueName("passenger"));

        scenario.addHas_vehicle(vehicle);
        scenario.addHas_weather(weather);
        scenario.addHas_time(time);

        vehicle.addVehicle_has_driver(driver);
        vehicle.addVehicle_has_passenger(passenger);
        vehicle.addVehicle_has_location(roadType);
        vehicle.addVehicle_has_speed_kmph(70);
        vehicle.addHas_in_the_front(pedestrian);
        vehicle.addHas_on_the_right(surrounding1);
        vehicle.addHas_on_the_left(surrounding2);

        roadType.addHas_speed_limit_kmph(70);
        roadType.addHas_lanes(2);

        pedestrian.addPedestrian_has_location(pedestrianLocation);

        return scenario;
    }
}

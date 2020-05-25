package generator;

import project.Animal;
import project.Driver;
import project.MyFactory;
import project.Passenger;
import project.Road_type;
import project.Scenario;
import project.Surrounding;
import project.Time;
import project.Vehicle;
import project.Weather;

import java.util.Random;

public class ObstacleOnRoadSG extends ScenarioGenerator  {

    public ObstacleOnRoadSG(MyFactory factory) {
        super(factory);
    }

    @Override
    public Scenario generate() {
        Scenario scenario = factory.createScenario(getUniqueName("scenario"));

        Vehicle vehicle = factory.createVehicle(getUniqueName("vehicle"));

        Surrounding obstacle = getObstacle();

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
        vehicle.addHas_in_the_front(obstacle);
        vehicle.addHas_on_the_right(surrounding1);
        vehicle.addHas_on_the_left(surrounding2);

        roadType.addHas_speed_limit_kmph(70);
        roadType.addHas_lanes(2);

        return scenario;
    }

    private Surrounding getObstacle() {
        Random rand = new Random();
        Surrounding obstacle;
        if(rand.nextInt(2) == 0)
            obstacle = factory.createRock(getUniqueName("obstacle"));
        else
            obstacle = factory.createTree(getUniqueName("obstacle"));
        return obstacle;
    }
}

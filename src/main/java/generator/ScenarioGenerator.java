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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ScenarioGenerator<T> {
    MyFactory factory;
    Random rand = new Random();

    String baseIRI = "http://webprotege.stanford.edu/";
    Map<String, Integer> idMap = new HashMap<>();


    public ScenarioGenerator(MyFactory factory) {
        this.factory = factory;
    }


    protected String getUniqueName(String name) {
        return getUniqueName(name, 0);
    }

    protected String getUniqueName(String name, int scenarioNr) {
        if(scenarioNr != 0)
            name = name + "_" + scenarioNr;
        int id = idMap.getOrDefault(name, 0) + 1;
        idMap.put(name, id);
        return name + "_" + id;
    }

    Scenario scenario;
    Weather weather;
    Time time;
    Road_type roadType;
    Driver driver;
    Vehicle vehicle;
    ArrayList<Passenger> passengers;
    Map<String, Surrounding> surrounding;

    // generate basic scenario
    public Scenario generate(){
        return generate(0);
    }

    // generate basic scenario with id
    public Scenario generate(int scenarioId) {
        scenario = factory.createScenario(getUniqueName("scenario", scenarioId));

        weather = factory.createWeatherSubclass(getUniqueName("weather", scenarioId));

        time = factory.createTimeSubclass(getUniqueName("time", scenarioId));

        roadType = factory.createRoad_typeSubclass(getUniqueName("road_type", scenarioId));

        driver = factory.createDriver(getUniqueName("driver", scenarioId));

        surrounding = new HashMap<>();
        surrounding.put("LEFT", factory.createSurroundingSubclass(getUniqueName("surrounding", scenarioId)));
        surrounding.put("RIGHT", factory.createSurroundingSubclass(getUniqueName("surrounding", scenarioId)));

        vehicle = factory.createVehicle(getUniqueName("vehicle", scenarioId));

        passengers = new ArrayList<>();
        for(int i = 0; i < rand.nextInt(5); i++)
            passengers.add(factory.createPassengerSubclass(getUniqueName("passenger", scenarioId)));

        scenario.addHas_vehicle(vehicle);
        scenario.addHas_weather(weather);
        scenario.addHas_time(time);

        vehicle.addVehicle_has_driver(driver);
        vehicle.addVehicle_has_location(roadType);
        vehicle.addVehicle_has_speed_kmph(70);
        vehicle.addHas_on_the_right(surrounding.get("RIGHT"));
        vehicle.addHas_on_the_left(surrounding.get("LEFT"));
        for(Passenger passenger : passengers)
            vehicle.addVehicle_has_passenger(passenger);

        roadType.addHas_speed_limit_kmph(70);
        roadType.addHas_lanes(2);

        return scenario;
    }

    // generate many scenarios
    public ArrayList<Scenario> generate(int numOfScenarios, int startingId) {
        ArrayList<Scenario> scenarios = new ArrayList<>();

        for(int i = 0; i < numOfScenarios; i++)
            scenarios.add(generate(startingId + i));

        return scenarios;
    }
}

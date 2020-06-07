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
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BaseScenarioGenerator {
    String baseIRI;
    MyFactory factory;
    Random rand = new Random();

    Map<String, Integer> idMap = new HashMap<>();


    public BaseScenarioGenerator(MyFactory factory, String baseIRI) {
        this.baseIRI = baseIRI;
        this.factory = factory;
    }

    /**
     * If two variables created by factory will have the same name, they will be merged into one
     * so using this method to create variable names is highly advisable
     * @param name name of a variable
     * @return string name_id, where id is unique number
     */
    protected String getUniqueName(String name) {
        int id = idMap.getOrDefault(name, 0);
        idMap.put(name, id + 1);
        if(id == 0)
            return name;
        else
            return name + "_" + id;
    }

    /**
     * This method should be used, if we want to create many scenarios
     * @param name name of a variable
     * @param scenarioNr number of scenario
     * @return string scenarioNr_name_id, where id is unique number
     */
    protected String getUniqueName(String name, int scenarioNr) {
        return getUniqueName(scenarioNr + "_" + name);
    }

    /**
     * generate one basic scenario
     */
    public Model generate(){
        return generate(0);
    }

    /**
     * ancillary method to create many scenarios
     */
    // generate basic scenario with id
    protected Model generate(int scenarioId) {
        // get new individuals
        Scenario scenario = factory.createScenario(getUniqueName("scenario", scenarioId));

        Weather weather = factory.createWeatherSubclass(getUniqueName("weather", scenarioId));

        Time time = factory.createTimeSubclass(getUniqueName("time", scenarioId));

        Road_type roadType = factory.createRoad_typeSubclass(getUniqueName("road_type", scenarioId));

        Driver driver = factory.createDriver(getUniqueName("driver", scenarioId));

        Map<String, Surrounding> surrounding = new HashMap<>();
        surrounding.put("LEFT", factory.createSurroundingSubclass(getUniqueName("surrounding", scenarioId)));
        surrounding.put("RIGHT", factory.createSurroundingSubclass(getUniqueName("surrounding", scenarioId)));

        Vehicle vehicle = factory.createVehicleSubclass(getUniqueName("vehicle", scenarioId));

        ArrayList<Passenger> passengers = new ArrayList<>();
        for(int i = 0; i < rand.nextInt(5); i++)
            passengers.add(factory.createPassengerSubclass(getUniqueName("passenger", scenarioId)));

        // set object properties
        scenario.addHas_vehicle(vehicle);
        scenario.addHas_weather(weather);
        scenario.addHas_time(time);

        vehicle.addVehicle_has_driver(driver);
        vehicle.addVehicle_has_location(roadType);
        vehicle.addHas_on_the_right(surrounding.get("RIGHT"));
        vehicle.addHas_on_the_left(surrounding.get("LEFT"));
        for(Passenger passenger : passengers)
            vehicle.addVehicle_has_passenger(passenger);

        // set data properties
        vehicle.addVehicle_has_speed_kmph(70);

        roadType.addHas_speed_limit_kmph(70);
        roadType.addHas_lanes(2);

        // save in a model
        Model model = new Model();

        model.setScenario(scenario) ;
        model.setWeather(weather);
        model.setTime(time);
        model.setRoadType(roadType);
        model.setDriver(driver);
        model.setSurrounding(surrounding);
        model.setVehicle(vehicle);
        model.setPassengers(passengers);

        return model;
    }

    /**
     * generate numOfScenarios basic scenario, with IDs starting from startingId
     */
    public ArrayList<Model> generate(int numOfScenarios, int startingId) {
        ArrayList<Model> models = new ArrayList<>();

        for(int i = 0; i < numOfScenarios; i++)
            models.add(generate(startingId + i));

        return models;
    }
}

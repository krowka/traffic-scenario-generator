package generator;

import project.Driver;
import project.Passenger;
import project.Road_type;
import project.Scenario;
import project.Surrounding;
import project.Time;
import project.Vehicle;
import project.Weather;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseScenarioModel {
    private Scenario scenario;
    private Weather weather;
    private Time time;
    private Road_type roadType;
    private  Driver driver;
    private Vehicle vehicle;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private Map<String, Surrounding> surrounding = new HashMap<>();

    public Scenario getScenario() {
        return scenario;
    }

    public Weather getWeather() {
        return weather;
    }

    public Time getTime() {
        return time;
    }

    public Road_type getRoadType() {
        return roadType;
    }

    public Driver getDriver() {
        return driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Map<String, Surrounding> getSurrounding() {
        return surrounding;
    }

    protected void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    protected void setWeather(Weather weather) {
        this.weather = weather;
    }

    protected void setTime(Time time) {
        this.time = time;
    }

    protected void setRoadType(Road_type roadType) {
        this.roadType = roadType;
    }

    protected void setDriver(Driver driver) {
        this.driver = driver;
    }

    protected void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    protected void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    protected void setSurrounding(Map<String, Surrounding> surrounding) {
        this.surrounding = surrounding;
    }

    public BaseScenarioModel() {};

    /**
     * Copy construction, used to create subclass objects from superclass object
     * Uses reflection
     */
    public BaseScenarioModel(BaseScenarioModel originalObj) {
        try {
            Field fields[];
            Class  currentClass = originalObj.getClass();

            if (!currentClass.isAssignableFrom(this.getClass()))
                throw new IllegalArgumentException("New object must be the same class or a subclass of original");

            // Spin through all fields of the class & all its superclasses
            do
            {
                fields = currentClass.getDeclaredFields();

                for (int i = 0; i < fields.length; i++)
                {
                    fields[i].set(this, fields[i].get(originalObj));
                }
                currentClass = currentClass.getSuperclass();
            } while (currentClass != null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

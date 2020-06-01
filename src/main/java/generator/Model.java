package generator;

import project.Driver;
import project.Entity;
import project.Passenger;
import project.Road_type;
import project.Scenario;
import project.Surrounding;
import project.Time;
import project.Vehicle;
import project.Weather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model {
    private Scenario scenario;
    private Weather weather;
    private Time time;
    private Road_type roadType;
    private Driver driver;
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
}

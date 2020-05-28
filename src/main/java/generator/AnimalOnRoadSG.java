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

public class AnimalOnRoadSG extends ScenarioGenerator  {

    public AnimalOnRoadSG(MyFactory factory) {
        super(factory);
    }

    Animal animal;

    @Override
    public Scenario generate(int scenarioId) {
        scenario = super.generate(scenarioId);

        animal = factory.createAnimalSubclass(getUniqueName("animal", scenarioId));

        vehicle.addHas_in_the_front(animal);

        return scenario;
    }
}

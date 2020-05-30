package generator;

import project.Animal;
import project.MyFactory;
import project.Scenario;

public class AnimalOnRoadSG extends BaseScenarioGenerator {

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

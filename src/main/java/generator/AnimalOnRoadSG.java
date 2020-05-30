package generator;

import project.Animal;
import project.MyFactory;
import project.Scenario;

public class AnimalOnRoadSG extends BaseScenarioGenerator {

    public AnimalOnRoadSG(MyFactory factory, String baseIRI) {
        super(factory, baseIRI);
    }

    @Override
    public AnimalOnRoadModel generate(int scenarioId) {
        AnimalOnRoadModel model = (AnimalOnRoadModel) super.generate(scenarioId);

        Animal animal = factory.createAnimalSubclass(getUniqueName("animal", scenarioId));

        model.getVehicle().addHas_in_the_front(animal);

        model.setAnimal(animal);

        return model;
    }
}
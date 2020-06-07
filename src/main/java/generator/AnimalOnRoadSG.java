package generator;

import project.Animal;
import project.MyFactory;

public class AnimalOnRoadSG extends BaseScenarioGenerator {

    public AnimalOnRoadSG(MyFactory factory, String baseIRI) {
        super(factory, baseIRI);
    }

    @Override
    public Model generate(int scenarioId) {
        Model model = super.generate(scenarioId);

        Animal animal = factory.createAnimalSubclass(getUniqueName("animal", scenarioId));

        model.getVehicle().addHas_in_the_front(animal);

        return model;
    }
}
package generator;

import project.Animal;

public class AnimalOnRoadModel extends BaseScenarioModel {
    private Animal animal;

    public AnimalOnRoadModel(BaseScenarioModel model) {
        super(model);
    }

    public Animal getAnimal() {
        return animal;
    }

    protected void setAnimal(Animal animal) {
        this.animal = animal;
    }
}

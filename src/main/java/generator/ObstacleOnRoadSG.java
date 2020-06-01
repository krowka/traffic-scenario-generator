package generator;

import model.ObstacleOnRoadModel;
import project.MyFactory;
import project.Surrounding;

import java.util.Random;

public class ObstacleOnRoadSG extends BaseScenarioGenerator {

    public ObstacleOnRoadSG(MyFactory factory, String baseIRI) {
        super(factory, baseIRI);
    }

    @Override
    public Model generate(int scenarioId) {
        Model model = super.generate(scenarioId);

        Surrounding obstacle = getObstacle(scenarioId);

        model.getVehicle().addHas_in_the_front(obstacle);

        return model;
    }

    private Surrounding getObstacle(int scenarioId) {
        Random rand = new Random();
        Surrounding obstacle;
        if(rand.nextInt(2) == 0)
            obstacle = factory.createRock(getUniqueName("obstacle", scenarioId));
        else
            obstacle = factory.createTree(getUniqueName("obstacle", scenarioId));
        return obstacle;
    }

}

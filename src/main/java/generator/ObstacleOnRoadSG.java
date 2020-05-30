package generator;

import project.MyFactory;
import project.Scenario;
import project.Surrounding;

import java.util.Random;

public class ObstacleOnRoadSG extends BaseScenarioGenerator {

    public ObstacleOnRoadSG(MyFactory factory, String baseIRI) {
        super(factory, baseIRI);
    }
    /*
    Surrounding obstacle;

    @Override
    public Scenario generate(int scenarioId) {
        scenario = super.generate(scenarioId);

        obstacle = getObstacle(scenarioId);

        vehicle.addHas_in_the_front(obstacle);

        return scenario;
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
    */
}

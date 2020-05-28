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

import java.util.Random;

public class ObstacleOnRoadSG extends ScenarioGenerator  {

    public ObstacleOnRoadSG(MyFactory factory) {
        super(factory);
    }

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
}

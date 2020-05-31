package generator;

import project.Surrounding;

public class ObstacleOnRoadModel extends BaseScenarioModel {
    private Surrounding obstacle;

    public ObstacleOnRoadModel(BaseScenarioModel model) {
        super(model);
    }

    public Surrounding getObstacle() {
        return obstacle;
    }

    protected void setObstacle(Surrounding obstacle) {
        this.obstacle = obstacle;
    }
}

package generator;

import project.Illegal_pedestrian_crossings;
import project.Pedestrian;

public class PedestrianIllegallyCrossingModel extends BaseScenarioModel {
    private Pedestrian pedestrian;
    private Illegal_pedestrian_crossings pedestrianLocation;

    public PedestrianIllegallyCrossingModel(BaseScenarioModel model) {
        super(model);
    }

    public Pedestrian getPedestrian() {
        return pedestrian;
    }

    protected void setPedestrian(Pedestrian pedestrian) {
        this.pedestrian = pedestrian;
    }

    public Illegal_pedestrian_crossings getPedestrianLocation() {
        return pedestrianLocation;
    }

    protected void setPedestrianLocation(Illegal_pedestrian_crossings pedestrianLocation) {
        this.pedestrianLocation = pedestrianLocation;
    }
}

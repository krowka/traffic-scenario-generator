package generator;

import project.Pedestrian;
import project.Street_crossing;

public class PedestrianOnCrosswalkModel extends BaseScenarioModel {
    private Pedestrian pedestrian;
    private Street_crossing pedestrianLocation;

    public PedestrianOnCrosswalkModel(BaseScenarioModel model) {
        super(model);
    }

    public Pedestrian getPedestrian() {
        return pedestrian;
    }

    protected void setPedestrian(Pedestrian pedestrian) {
        this.pedestrian = pedestrian;
    }

    public Street_crossing getPedestrianLocation() {
        return pedestrianLocation;
    }

    protected void setPedestrianLocation(Street_crossing pedestrianLocation) {
        this.pedestrianLocation = pedestrianLocation;
    }
}

package model;

import project.Driver;
import project.Vehicle;

public class CarOvertakingModel extends BaseScenarioModel {
    private Vehicle vehice2;
    private Driver driver2;

    public CarOvertakingModel(BaseScenarioModel model) {
        super(model);
    }

    public Vehicle getVehice2() {
        return vehice2;
    }

    public void setVehice2(Vehicle vehice2) {
        this.vehice2 = vehice2;
    }

    protected Driver getDriver2() {
        return driver2;
    }

    protected void setDriver2(Driver driver2) {
        this.driver2 = driver2;
    }
}

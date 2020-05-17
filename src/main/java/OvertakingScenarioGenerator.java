import project.MyFactory;
import project.Scenario;
import project.Vehicle;

public class OvertakingScenarioGenerator extends ScenarioGenerator {

    public OvertakingScenarioGenerator(MyFactory factory) {
        super(factory);
    }

    public void generate() {
        Scenario scenario = factory.createScenario("scenario");

        Vehicle vehicle1 = factory.createVehicle(getUniqueName("vehicle"));
    }

}

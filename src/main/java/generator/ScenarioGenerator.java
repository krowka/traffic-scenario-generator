package generator;

import project.MyFactory;
import project.Scenario;

import java.util.HashMap;
import java.util.Map;

public abstract class ScenarioGenerator {
    MyFactory factory;

    String baseIRI = "http://webprotege.stanford.edu/";
    Map<String, Integer> idMap = new HashMap<>();

    public ScenarioGenerator(MyFactory factory) {
        this.factory = factory;
    }

    public abstract Scenario generate();

    protected String getUniqueName(String name) {
        int id = idMap.getOrDefault(name, 0) + 1;
        idMap.put(name, id);
        return name + "_" + id;
    }
}

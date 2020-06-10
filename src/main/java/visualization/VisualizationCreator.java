package visualization;

import generator.Model;

public interface VisualizationCreator {

    /**
     * Create the visualization of given model and save it to file.
     *
     * @param model the model representing traffic scenario, for which visualization will be created
     * @param path  filepath, where created visualization will be saved
     */
    void createVisualization(Model model, String path);
}

package project;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Car_car <br>
 * @version generated on Sun May 17 23:43:01 CEST 2020 by kamsz
 */

public interface Car_car extends Scenario {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_pedestrian
     */
     
    /**
     * Gets all property values for the has_pedestrian property.<p>
     * 
     * @returns a collection of values for the has_pedestrian property.
     */
    Collection<? extends Pedestrian> getHas_pedestrian();

    /**
     * Checks if the class has a has_pedestrian property value.<p>
     * 
     * @return true if there is a has_pedestrian property value.
     */
    boolean hasHas_pedestrian();

    /**
     * Adds a has_pedestrian property value.<p>
     * 
     * @param newHas_pedestrian the has_pedestrian property value to be added
     */
    void addHas_pedestrian(Pedestrian newHas_pedestrian);

    /**
     * Removes a has_pedestrian property value.<p>
     * 
     * @param oldHas_pedestrian the has_pedestrian property value to be removed.
     */
    void removeHas_pedestrian(Pedestrian oldHas_pedestrian);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_time
     */
     
    /**
     * Gets all property values for the has_time property.<p>
     * 
     * @returns a collection of values for the has_time property.
     */
    Collection<? extends Time> getHas_time();

    /**
     * Checks if the class has a has_time property value.<p>
     * 
     * @return true if there is a has_time property value.
     */
    boolean hasHas_time();

    /**
     * Adds a has_time property value.<p>
     * 
     * @param newHas_time the has_time property value to be added
     */
    void addHas_time(Time newHas_time);

    /**
     * Removes a has_time property value.<p>
     * 
     * @param oldHas_time the has_time property value to be removed.
     */
    void removeHas_time(Time oldHas_time);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_vehicle
     */
     
    /**
     * Gets all property values for the has_vehicle property.<p>
     * 
     * @returns a collection of values for the has_vehicle property.
     */
    Collection<? extends Vehicle> getHas_vehicle();

    /**
     * Checks if the class has a has_vehicle property value.<p>
     * 
     * @return true if there is a has_vehicle property value.
     */
    boolean hasHas_vehicle();

    /**
     * Adds a has_vehicle property value.<p>
     * 
     * @param newHas_vehicle the has_vehicle property value to be added
     */
    void addHas_vehicle(Vehicle newHas_vehicle);

    /**
     * Removes a has_vehicle property value.<p>
     * 
     * @param oldHas_vehicle the has_vehicle property value to be removed.
     */
    void removeHas_vehicle(Vehicle oldHas_vehicle);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_weather
     */
     
    /**
     * Gets all property values for the has_weather property.<p>
     * 
     * @returns a collection of values for the has_weather property.
     */
    Collection<? extends Weather> getHas_weather();

    /**
     * Checks if the class has a has_weather property value.<p>
     * 
     * @return true if there is a has_weather property value.
     */
    boolean hasHas_weather();

    /**
     * Adds a has_weather property value.<p>
     * 
     * @param newHas_weather the has_weather property value to be added
     */
    void addHas_weather(Weather newHas_weather);

    /**
     * Removes a has_weather property value.<p>
     * 
     * @param oldHas_weather the has_weather property value to be removed.
     */
    void removeHas_weather(Weather oldHas_weather);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_decision
     */
     
    /**
     * Gets all property values for the has_decision property.<p>
     * 
     * @returns a collection of values for the has_decision property.
     */
    Collection<? extends Decision> getHas_decision();

    /**
     * Checks if the class has a has_decision property value.<p>
     * 
     * @return true if there is a has_decision property value.
     */
    boolean hasHas_decision();

    /**
     * Adds a has_decision property value.<p>
     * 
     * @param newHas_decision the has_decision property value to be added
     */
    void addHas_decision(Decision newHas_decision);

    /**
     * Removes a has_decision property value.<p>
     * 
     * @param oldHas_decision the has_decision property value to be removed.
     */
    void removeHas_decision(Decision oldHas_decision);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}

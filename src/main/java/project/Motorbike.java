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
 * Source Class: Motorbike <br>
 * @version generated on Sun May 17 12:58:32 CEST 2020 by kamsz
 */

public interface Motorbike extends Vehicle {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_at_the_back
     */
     
    /**
     * Gets all property values for the has_at_the_back property.<p>
     * 
     * @returns a collection of values for the has_at_the_back property.
     */
    Collection<? extends Living_entity> getHas_at_the_back();

    /**
     * Checks if the class has a has_at_the_back property value.<p>
     * 
     * @return true if there is a has_at_the_back property value.
     */
    boolean hasHas_at_the_back();

    /**
     * Adds a has_at_the_back property value.<p>
     * 
     * @param newHas_at_the_back the has_at_the_back property value to be added
     */
    void addHas_at_the_back(Living_entity newHas_at_the_back);

    /**
     * Removes a has_at_the_back property value.<p>
     * 
     * @param oldHas_at_the_back the has_at_the_back property value to be removed.
     */
    void removeHas_at_the_back(Living_entity oldHas_at_the_back);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_in_the_front
     */
     
    /**
     * Gets all property values for the has_in_the_front property.<p>
     * 
     * @returns a collection of values for the has_in_the_front property.
     */
    Collection<? extends Living_entity> getHas_in_the_front();

    /**
     * Checks if the class has a has_in_the_front property value.<p>
     * 
     * @return true if there is a has_in_the_front property value.
     */
    boolean hasHas_in_the_front();

    /**
     * Adds a has_in_the_front property value.<p>
     * 
     * @param newHas_in_the_front the has_in_the_front property value to be added
     */
    void addHas_in_the_front(Living_entity newHas_in_the_front);

    /**
     * Removes a has_in_the_front property value.<p>
     * 
     * @param oldHas_in_the_front the has_in_the_front property value to be removed.
     */
    void removeHas_in_the_front(Living_entity oldHas_in_the_front);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_on_the_left
     */
     
    /**
     * Gets all property values for the has_on_the_left property.<p>
     * 
     * @returns a collection of values for the has_on_the_left property.
     */
    Collection<? extends Non_living_entity> getHas_on_the_left();

    /**
     * Checks if the class has a has_on_the_left property value.<p>
     * 
     * @return true if there is a has_on_the_left property value.
     */
    boolean hasHas_on_the_left();

    /**
     * Adds a has_on_the_left property value.<p>
     * 
     * @param newHas_on_the_left the has_on_the_left property value to be added
     */
    void addHas_on_the_left(Non_living_entity newHas_on_the_left);

    /**
     * Removes a has_on_the_left property value.<p>
     * 
     * @param oldHas_on_the_left the has_on_the_left property value to be removed.
     */
    void removeHas_on_the_left(Non_living_entity oldHas_on_the_left);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_on_the_right
     */
     
    /**
     * Gets all property values for the has_on_the_right property.<p>
     * 
     * @returns a collection of values for the has_on_the_right property.
     */
    Collection<? extends Non_living_entity> getHas_on_the_right();

    /**
     * Checks if the class has a has_on_the_right property value.<p>
     * 
     * @return true if there is a has_on_the_right property value.
     */
    boolean hasHas_on_the_right();

    /**
     * Adds a has_on_the_right property value.<p>
     * 
     * @param newHas_on_the_right the has_on_the_right property value to be added
     */
    void addHas_on_the_right(Non_living_entity newHas_on_the_right);

    /**
     * Removes a has_on_the_right property value.<p>
     * 
     * @param oldHas_on_the_right the has_on_the_right property value to be removed.
     */
    void removeHas_on_the_right(Non_living_entity oldHas_on_the_right);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_within_close_distance
     */
     
    /**
     * Gets all property values for the has_within_close_distance property.<p>
     * 
     * @returns a collection of values for the has_within_close_distance property.
     */
    Collection<? extends Living_entity> getHas_within_close_distance();

    /**
     * Checks if the class has a has_within_close_distance property value.<p>
     * 
     * @return true if there is a has_within_close_distance property value.
     */
    boolean hasHas_within_close_distance();

    /**
     * Adds a has_within_close_distance property value.<p>
     * 
     * @param newHas_within_close_distance the has_within_close_distance property value to be added
     */
    void addHas_within_close_distance(Living_entity newHas_within_close_distance);

    /**
     * Removes a has_within_close_distance property value.<p>
     * 
     * @param oldHas_within_close_distance the has_within_close_distance property value to be removed.
     */
    void removeHas_within_close_distance(Living_entity oldHas_within_close_distance);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_within_far_distance
     */
     
    /**
     * Gets all property values for the has_within_far_distance property.<p>
     * 
     * @returns a collection of values for the has_within_far_distance property.
     */
    Collection<? extends Living_entity> getHas_within_far_distance();

    /**
     * Checks if the class has a has_within_far_distance property value.<p>
     * 
     * @return true if there is a has_within_far_distance property value.
     */
    boolean hasHas_within_far_distance();

    /**
     * Adds a has_within_far_distance property value.<p>
     * 
     * @param newHas_within_far_distance the has_within_far_distance property value to be added
     */
    void addHas_within_far_distance(Living_entity newHas_within_far_distance);

    /**
     * Removes a has_within_far_distance property value.<p>
     * 
     * @param oldHas_within_far_distance the has_within_far_distance property value to be removed.
     */
    void removeHas_within_far_distance(Living_entity oldHas_within_far_distance);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_within_very_close_distance
     */
     
    /**
     * Gets all property values for the has_within_very_close_distance property.<p>
     * 
     * @returns a collection of values for the has_within_very_close_distance property.
     */
    Collection<? extends Non_living_entity> getHas_within_very_close_distance();

    /**
     * Checks if the class has a has_within_very_close_distance property value.<p>
     * 
     * @return true if there is a has_within_very_close_distance property value.
     */
    boolean hasHas_within_very_close_distance();

    /**
     * Adds a has_within_very_close_distance property value.<p>
     * 
     * @param newHas_within_very_close_distance the has_within_very_close_distance property value to be added
     */
    void addHas_within_very_close_distance(Non_living_entity newHas_within_very_close_distance);

    /**
     * Removes a has_within_very_close_distance property value.<p>
     * 
     * @param oldHas_within_very_close_distance the has_within_very_close_distance property value to be removed.
     */
    void removeHas_within_very_close_distance(Non_living_entity oldHas_within_very_close_distance);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/vehicle_autonomy
     */
     
    /**
     * Gets all property values for the vehicle_autonomy property.<p>
     * 
     * @returns a collection of values for the vehicle_autonomy property.
     */
    Collection<? extends WrappedIndividual> getVehicle_autonomy();

    /**
     * Checks if the class has a vehicle_autonomy property value.<p>
     * 
     * @return true if there is a vehicle_autonomy property value.
     */
    boolean hasVehicle_autonomy();

    /**
     * Adds a vehicle_autonomy property value.<p>
     * 
     * @param newVehicle_autonomy the vehicle_autonomy property value to be added
     */
    void addVehicle_autonomy(WrappedIndividual newVehicle_autonomy);

    /**
     * Removes a vehicle_autonomy property value.<p>
     * 
     * @param oldVehicle_autonomy the vehicle_autonomy property value to be removed.
     */
    void removeVehicle_autonomy(WrappedIndividual oldVehicle_autonomy);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/vehicle_has_driver
     */
     
    /**
     * Gets all property values for the vehicle_has_driver property.<p>
     * 
     * @returns a collection of values for the vehicle_has_driver property.
     */
    Collection<? extends Driver> getVehicle_has_driver();

    /**
     * Checks if the class has a vehicle_has_driver property value.<p>
     * 
     * @return true if there is a vehicle_has_driver property value.
     */
    boolean hasVehicle_has_driver();

    /**
     * Adds a vehicle_has_driver property value.<p>
     * 
     * @param newVehicle_has_driver the vehicle_has_driver property value to be added
     */
    void addVehicle_has_driver(Driver newVehicle_has_driver);

    /**
     * Removes a vehicle_has_driver property value.<p>
     * 
     * @param oldVehicle_has_driver the vehicle_has_driver property value to be removed.
     */
    void removeVehicle_has_driver(Driver oldVehicle_has_driver);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/vehicle_has_location
     */
     
    /**
     * Gets all property values for the vehicle_has_location property.<p>
     * 
     * @returns a collection of values for the vehicle_has_location property.
     */
    Collection<? extends Road_segment> getVehicle_has_location();

    /**
     * Checks if the class has a vehicle_has_location property value.<p>
     * 
     * @return true if there is a vehicle_has_location property value.
     */
    boolean hasVehicle_has_location();

    /**
     * Adds a vehicle_has_location property value.<p>
     * 
     * @param newVehicle_has_location the vehicle_has_location property value to be added
     */
    void addVehicle_has_location(Road_segment newVehicle_has_location);

    /**
     * Removes a vehicle_has_location property value.<p>
     * 
     * @param oldVehicle_has_location the vehicle_has_location property value to be removed.
     */
    void removeVehicle_has_location(Road_segment oldVehicle_has_location);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/vehicle_has_passenger
     */
     
    /**
     * Gets all property values for the vehicle_has_passenger property.<p>
     * 
     * @returns a collection of values for the vehicle_has_passenger property.
     */
    Collection<? extends Passenger> getVehicle_has_passenger();

    /**
     * Checks if the class has a vehicle_has_passenger property value.<p>
     * 
     * @return true if there is a vehicle_has_passenger property value.
     */
    boolean hasVehicle_has_passenger();

    /**
     * Adds a vehicle_has_passenger property value.<p>
     * 
     * @param newVehicle_has_passenger the vehicle_has_passenger property value to be added
     */
    void addVehicle_has_passenger(Passenger newVehicle_has_passenger);

    /**
     * Removes a vehicle_has_passenger property value.<p>
     * 
     * @param oldVehicle_has_passenger the vehicle_has_passenger property value to be removed.
     */
    void removeVehicle_has_passenger(Passenger oldVehicle_has_passenger);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/vehicle_has_type
     */
     
    /**
     * Gets all property values for the vehicle_has_type property.<p>
     * 
     * @returns a collection of values for the vehicle_has_type property.
     */
    Collection<? extends Van> getVehicle_has_type();

    /**
     * Checks if the class has a vehicle_has_type property value.<p>
     * 
     * @return true if there is a vehicle_has_type property value.
     */
    boolean hasVehicle_has_type();

    /**
     * Adds a vehicle_has_type property value.<p>
     * 
     * @param newVehicle_has_type the vehicle_has_type property value to be added
     */
    void addVehicle_has_type(Van newVehicle_has_type);

    /**
     * Removes a vehicle_has_type property value.<p>
     * 
     * @param oldVehicle_has_type the vehicle_has_type property value to be removed.
     */
    void removeVehicle_has_type(Van oldVehicle_has_type);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/autonomy_level
     */
     
    /**
     * Gets all property values for the autonomy_level property.<p>
     * 
     * @returns a collection of values for the autonomy_level property.
     */
    Collection<? extends Integer> getAutonomy_level();

    /**
     * Checks if the class has a autonomy_level property value.<p>
     * 
     * @return true if there is a autonomy_level property value.
     */
    boolean hasAutonomy_level();

    /**
     * Adds a autonomy_level property value.<p>
     * 
     * @param newAutonomy_level the autonomy_level property value to be added
     */
    void addAutonomy_level(Integer newAutonomy_level);

    /**
     * Removes a autonomy_level property value.<p>
     * 
     * @param oldAutonomy_level the autonomy_level property value to be removed.
     */
    void removeAutonomy_level(Integer oldAutonomy_level);



    /* ***************************************************
     * Property http://webprotege.stanford.edu/vehicle_has_speed_km/h
     */
     
    /**
     * Gets all property values for the vehicle_has_speed_kmph property.<p>
     * 
     * @returns a collection of values for the vehicle_has_speed_kmph property.
     */
    Collection<? extends Integer> getVehicle_has_speed_kmph();

    /**
     * Checks if the class has a vehicle_has_speed_kmph property value.<p>
     * 
     * @return true if there is a vehicle_has_speed_kmph property value.
     */
    boolean hasVehicle_has_speed_kmph();

    /**
     * Adds a vehicle_has_speed_kmph property value.<p>
     * 
     * @param newVehicle_has_speed_kmph the vehicle_has_speed_kmph property value to be added
     */
    void addVehicle_has_speed_kmph(Integer newVehicle_has_speed_kmph);

    /**
     * Removes a vehicle_has_speed_kmph property value.<p>
     * 
     * @param oldVehicle_has_speed_kmph the vehicle_has_speed_kmph property value to be removed.
     */
    void removeVehicle_has_speed_kmph(Integer oldVehicle_has_speed_kmph);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}

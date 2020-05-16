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
 * Source Class: Pedestrian <br>
 * @version generated on Sat May 16 15:18:50 CEST 2020 by kamsz
 */

public interface Pedestrian extends Wild, Stock, Human, Pet {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/age
     */
     
    /**
     * Gets all property values for the age property.<p>
     * 
     * @returns a collection of values for the age property.
     */
    Collection<? extends WrappedIndividual> getAge();

    /**
     * Checks if the class has a age property value.<p>
     * 
     * @return true if there is a age property value.
     */
    boolean hasAge();

    /**
     * Adds a age property value.<p>
     * 
     * @param newAge the age property value to be added
     */
    void addAge(WrappedIndividual newAge);

    /**
     * Removes a age property value.<p>
     * 
     * @param oldAge the age property value to be removed.
     */
    void removeAge(WrappedIndividual oldAge);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/animal_has_spieces
     */
     
    /**
     * Gets all property values for the animal_has_spieces property.<p>
     * 
     * @returns a collection of values for the animal_has_spieces property.
     */
    Collection<? extends WrappedIndividual> getAnimal_has_spieces();

    /**
     * Checks if the class has a animal_has_spieces property value.<p>
     * 
     * @return true if there is a animal_has_spieces property value.
     */
    boolean hasAnimal_has_spieces();

    /**
     * Adds a animal_has_spieces property value.<p>
     * 
     * @param newAnimal_has_spieces the animal_has_spieces property value to be added
     */
    void addAnimal_has_spieces(WrappedIndividual newAnimal_has_spieces);

    /**
     * Removes a animal_has_spieces property value.<p>
     * 
     * @param oldAnimal_has_spieces the animal_has_spieces property value to be removed.
     */
    void removeAnimal_has_spieces(WrappedIndividual oldAnimal_has_spieces);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/criminal_record
     */
     
    /**
     * Gets all property values for the criminal_record property.<p>
     * 
     * @returns a collection of values for the criminal_record property.
     */
    Collection<? extends Criminal_record> getCriminal_record();

    /**
     * Checks if the class has a criminal_record property value.<p>
     * 
     * @return true if there is a criminal_record property value.
     */
    boolean hasCriminal_record();

    /**
     * Adds a criminal_record property value.<p>
     * 
     * @param newCriminal_record the criminal_record property value to be added
     */
    void addCriminal_record(Criminal_record newCriminal_record);

    /**
     * Removes a criminal_record property value.<p>
     * 
     * @param oldCriminal_record the criminal_record property value to be removed.
     */
    void removeCriminal_record(Criminal_record oldCriminal_record);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/gender
     */
     
    /**
     * Gets all property values for the gender property.<p>
     * 
     * @returns a collection of values for the gender property.
     */
    Collection<? extends WrappedIndividual> getGender();

    /**
     * Checks if the class has a gender property value.<p>
     * 
     * @return true if there is a gender property value.
     */
    boolean hasGender();

    /**
     * Adds a gender property value.<p>
     * 
     * @param newGender the gender property value to be added
     */
    void addGender(WrappedIndividual newGender);

    /**
     * Removes a gender property value.<p>
     * 
     * @param oldGender the gender property value to be removed.
     */
    void removeGender(WrappedIndividual oldGender);


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
     * Property http://webprotege.stanford.edu/human_makes_decision
     */
     
    /**
     * Gets all property values for the human_makes_decision property.<p>
     * 
     * @returns a collection of values for the human_makes_decision property.
     */
    Collection<? extends Decision> getHuman_makes_decision();

    /**
     * Checks if the class has a human_makes_decision property value.<p>
     * 
     * @return true if there is a human_makes_decision property value.
     */
    boolean hasHuman_makes_decision();

    /**
     * Adds a human_makes_decision property value.<p>
     * 
     * @param newHuman_makes_decision the human_makes_decision property value to be added
     */
    void addHuman_makes_decision(Decision newHuman_makes_decision);

    /**
     * Removes a human_makes_decision property value.<p>
     * 
     * @param oldHuman_makes_decision the human_makes_decision property value to be removed.
     */
    void removeHuman_makes_decision(Decision oldHuman_makes_decision);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/human_profession
     */
     
    /**
     * Gets all property values for the human_profession property.<p>
     * 
     * @returns a collection of values for the human_profession property.
     */
    Collection<? extends Human_profession> getHuman_profession();

    /**
     * Checks if the class has a human_profession property value.<p>
     * 
     * @return true if there is a human_profession property value.
     */
    boolean hasHuman_profession();

    /**
     * Adds a human_profession property value.<p>
     * 
     * @param newHuman_profession the human_profession property value to be added
     */
    void addHuman_profession(Human_profession newHuman_profession);

    /**
     * Removes a human_profession property value.<p>
     * 
     * @param oldHuman_profession the human_profession property value to be removed.
     */
    void removeHuman_profession(Human_profession oldHuman_profession);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/human_properties
     */
     
    /**
     * Gets all property values for the human_properties property.<p>
     * 
     * @returns a collection of values for the human_properties property.
     */
    Collection<? extends WrappedIndividual> getHuman_properties();

    /**
     * Checks if the class has a human_properties property value.<p>
     * 
     * @return true if there is a human_properties property value.
     */
    boolean hasHuman_properties();

    /**
     * Adds a human_properties property value.<p>
     * 
     * @param newHuman_properties the human_properties property value to be added
     */
    void addHuman_properties(WrappedIndividual newHuman_properties);

    /**
     * Removes a human_properties property value.<p>
     * 
     * @param oldHuman_properties the human_properties property value to be removed.
     */
    void removeHuman_properties(WrappedIndividual oldHuman_properties);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/move_forward
     */
     
    /**
     * Gets all property values for the move_forward property.<p>
     * 
     * @returns a collection of values for the move_forward property.
     */
    Collection<? extends WrappedIndividual> getMove_forward();

    /**
     * Checks if the class has a move_forward property value.<p>
     * 
     * @return true if there is a move_forward property value.
     */
    boolean hasMove_forward();

    /**
     * Adds a move_forward property value.<p>
     * 
     * @param newMove_forward the move_forward property value to be added
     */
    void addMove_forward(WrappedIndividual newMove_forward);

    /**
     * Removes a move_forward property value.<p>
     * 
     * @param oldMove_forward the move_forward property value to be removed.
     */
    void removeMove_forward(WrappedIndividual oldMove_forward);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/pedestrian_has_location
     */
     
    /**
     * Gets all property values for the pedestrian_has_location property.<p>
     * 
     * @returns a collection of values for the pedestrian_has_location property.
     */
    Collection<? extends Legal_pedestrian_crossings> getPedestrian_has_location();

    /**
     * Checks if the class has a pedestrian_has_location property value.<p>
     * 
     * @return true if there is a pedestrian_has_location property value.
     */
    boolean hasPedestrian_has_location();

    /**
     * Adds a pedestrian_has_location property value.<p>
     * 
     * @param newPedestrian_has_location the pedestrian_has_location property value to be added
     */
    void addPedestrian_has_location(Legal_pedestrian_crossings newPedestrian_has_location);

    /**
     * Removes a pedestrian_has_location property value.<p>
     * 
     * @param oldPedestrian_has_location the pedestrian_has_location property value to be removed.
     */
    void removePedestrian_has_location(Legal_pedestrian_crossings oldPedestrian_has_location);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/pedestrian_makes_action
     */
     
    /**
     * Gets all property values for the pedestrian_makes_action property.<p>
     * 
     * @returns a collection of values for the pedestrian_makes_action property.
     */
    Collection<? extends Pedestrian_action> getPedestrian_makes_action();

    /**
     * Checks if the class has a pedestrian_makes_action property value.<p>
     * 
     * @return true if there is a pedestrian_makes_action property value.
     */
    boolean hasPedestrian_makes_action();

    /**
     * Adds a pedestrian_makes_action property value.<p>
     * 
     * @param newPedestrian_makes_action the pedestrian_makes_action property value to be added
     */
    void addPedestrian_makes_action(Pedestrian_action newPedestrian_makes_action);

    /**
     * Removes a pedestrian_makes_action property value.<p>
     * 
     * @param oldPedestrian_makes_action the pedestrian_makes_action property value to be removed.
     */
    void removePedestrian_makes_action(Pedestrian_action oldPedestrian_makes_action);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/profession
     */
     
    /**
     * Gets all property values for the profession property.<p>
     * 
     * @returns a collection of values for the profession property.
     */
    Collection<? extends WrappedIndividual> getProfession();

    /**
     * Checks if the class has a profession property value.<p>
     * 
     * @return true if there is a profession property value.
     */
    boolean hasProfession();

    /**
     * Adds a profession property value.<p>
     * 
     * @param newProfession the profession property value to be added
     */
    void addProfession(WrappedIndividual newProfession);

    /**
     * Removes a profession property value.<p>
     * 
     * @param oldProfession the profession property value to be removed.
     */
    void removeProfession(WrappedIndividual oldProfession);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/stop
     */
     
    /**
     * Gets all property values for the stop property.<p>
     * 
     * @returns a collection of values for the stop property.
     */
    Collection<? extends WrappedIndividual> getStop();

    /**
     * Checks if the class has a stop property value.<p>
     * 
     * @return true if there is a stop property value.
     */
    boolean hasStop();

    /**
     * Adds a stop property value.<p>
     * 
     * @param newStop the stop property value to be added
     */
    void addStop(WrappedIndividual newStop);

    /**
     * Removes a stop property value.<p>
     * 
     * @param oldStop the stop property value to be removed.
     */
    void removeStop(WrappedIndividual oldStop);


    /* ***************************************************
     * Property http://webprotege.stanford.edu/animal_has_species
     */
     
    /**
     * Gets all property values for the animal_has_species property.<p>
     * 
     * @returns a collection of values for the animal_has_species property.
     */
    Collection<? extends String> getAnimal_has_species();

    /**
     * Checks if the class has a animal_has_species property value.<p>
     * 
     * @return true if there is a animal_has_species property value.
     */
    boolean hasAnimal_has_species();

    /**
     * Adds a animal_has_species property value.<p>
     * 
     * @param newAnimal_has_species the animal_has_species property value to be added
     */
    void addAnimal_has_species(String newAnimal_has_species);

    /**
     * Removes a animal_has_species property value.<p>
     * 
     * @param oldAnimal_has_species the animal_has_species property value to be removed.
     */
    void removeAnimal_has_species(String oldAnimal_has_species);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}

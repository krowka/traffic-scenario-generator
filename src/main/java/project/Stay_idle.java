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
 * Source Class: Stay_idle <br>
 * @version generated on Sat May 16 15:18:50 CEST 2020 by kamsz
 */

public interface Stay_idle extends Decision {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_consequence
     */
     
    /**
     * Gets all property values for the has_consequence property.<p>
     * 
     * @returns a collection of values for the has_consequence property.
     */
    Collection<? extends Consequence> getHas_consequence();

    /**
     * Checks if the class has a has_consequence property value.<p>
     * 
     * @return true if there is a has_consequence property value.
     */
    boolean hasHas_consequence();

    /**
     * Adds a has_consequence property value.<p>
     * 
     * @param newHas_consequence the has_consequence property value to be added
     */
    void addHas_consequence(Consequence newHas_consequence);

    /**
     * Removes a has_consequence property value.<p>
     * 
     * @param oldHas_consequence the has_consequence property value to be removed.
     */
    void removeHas_consequence(Consequence oldHas_consequence);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}

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
 * Source Class: Law_consequence <br>
 * @version generated on Sun May 17 23:43:02 CEST 2020 by kamsz
 */

public interface Law_consequence extends Consequence {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_broken_law
     */
     
    /**
     * Gets all property values for the has_broken_law property.<p>
     * 
     * @returns a collection of values for the has_broken_law property.
     */
    Collection<? extends Laws> getHas_broken_law();

    /**
     * Checks if the class has a has_broken_law property value.<p>
     * 
     * @return true if there is a has_broken_law property value.
     */
    boolean hasHas_broken_law();

    /**
     * Adds a has_broken_law property value.<p>
     * 
     * @param newHas_broken_law the has_broken_law property value to be added
     */
    void addHas_broken_law(Laws newHas_broken_law);

    /**
     * Removes a has_broken_law property value.<p>
     * 
     * @param oldHas_broken_law the has_broken_law property value to be removed.
     */
    void removeHas_broken_law(Laws oldHas_broken_law);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}

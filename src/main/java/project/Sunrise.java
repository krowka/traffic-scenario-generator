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
 * Source Class: Sunrise <br>
 * @version generated on Sun May 17 23:43:01 CEST 2020 by kamsz
 */

public interface Sunrise extends Time {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/time_is
     */
     
    /**
     * Gets all property values for the time_is property.<p>
     * 
     * @returns a collection of values for the time_is property.
     */
    Collection<? extends Daytime> getTime_is();

    /**
     * Checks if the class has a time_is property value.<p>
     * 
     * @return true if there is a time_is property value.
     */
    boolean hasTime_is();

    /**
     * Adds a time_is property value.<p>
     * 
     * @param newTime_is the time_is property value to be added
     */
    void addTime_is(Daytime newTime_is);

    /**
     * Removes a time_is property value.<p>
     * 
     * @param oldTime_is the time_is property value to be removed.
     */
    void removeTime_is(Daytime oldTime_is);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}

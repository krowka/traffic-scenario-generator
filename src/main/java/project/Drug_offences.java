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
 * Source Class: Drug_offences <br>
 * @version generated on Sat May 16 15:18:49 CEST 2020 by kamsz
 */

public interface Drug_offences extends Type_of_crime {

    /* ***************************************************
     * Property http://webprotege.stanford.edu/has_type_of_crime
     */
     
    /**
     * Gets all property values for the has_type_of_crime property.<p>
     * 
     * @returns a collection of values for the has_type_of_crime property.
     */
    Collection<? extends WrappedIndividual> getHas_type_of_crime();

    /**
     * Checks if the class has a has_type_of_crime property value.<p>
     * 
     * @return true if there is a has_type_of_crime property value.
     */
    boolean hasHas_type_of_crime();

    /**
     * Adds a has_type_of_crime property value.<p>
     * 
     * @param newHas_type_of_crime the has_type_of_crime property value to be added
     */
    void addHas_type_of_crime(WrappedIndividual newHas_type_of_crime);

    /**
     * Removes a has_type_of_crime property value.<p>
     * 
     * @param oldHas_type_of_crime the has_type_of_crime property value to be removed.
     */
    void removeHas_type_of_crime(WrappedIndividual oldHas_type_of_crime);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}

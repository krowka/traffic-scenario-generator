package project.impl;

import project.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultDecision <br>
 * @version generated on Sat May 16 15:18:49 CEST 2020 by kamsz
 */
public class DefaultDecision extends WrappedIndividualImpl implements Decision {

    public DefaultDecision(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_consequence
     */
     
    public Collection<? extends Consequence> getHas_consequence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_CONSEQUENCE,
                                               DefaultConsequence.class);
    }

    public boolean hasHas_consequence() {
	   return !getHas_consequence().isEmpty();
    }

    public void addHas_consequence(Consequence newHas_consequence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_CONSEQUENCE,
                                       newHas_consequence);
    }

    public void removeHas_consequence(Consequence oldHas_consequence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_CONSEQUENCE,
                                          oldHas_consequence);
    }


}

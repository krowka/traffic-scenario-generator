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
 * Source Class: DefaultWeather <br>
 * @version generated on Sun May 17 12:58:33 CEST 2020 by kamsz
 */
public class DefaultWeather extends WrappedIndividualImpl implements Weather {

    public DefaultWeather(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/weather_is
     */
     
    public Collection<? extends Shower> getWeather_is() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_WEATHER_IS,
                                               DefaultShower.class);
    }

    public boolean hasWeather_is() {
	   return !getWeather_is().isEmpty();
    }

    public void addWeather_is(Shower newWeather_is) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_WEATHER_IS,
                                       newWeather_is);
    }

    public void removeWeather_is(Shower oldWeather_is) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_WEATHER_IS,
                                          oldWeather_is);
    }


}

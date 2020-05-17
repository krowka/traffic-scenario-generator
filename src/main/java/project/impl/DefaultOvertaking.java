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
 * Source Class: DefaultOvertaking <br>
 * @version generated on Sun May 17 12:58:33 CEST 2020 by kamsz
 */
public class DefaultOvertaking extends WrappedIndividualImpl implements Overtaking {

    public DefaultOvertaking(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_time
     */
     
    public Collection<? extends Time> getHas_time() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_TIME,
                                               DefaultTime.class);
    }

    public boolean hasHas_time() {
	   return !getHas_time().isEmpty();
    }

    public void addHas_time(Time newHas_time) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_TIME,
                                       newHas_time);
    }

    public void removeHas_time(Time oldHas_time) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_TIME,
                                          oldHas_time);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_vehicle
     */
     
    public Collection<? extends Vehicle> getHas_vehicle() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_VEHICLE,
                                               DefaultVehicle.class);
    }

    public boolean hasHas_vehicle() {
	   return !getHas_vehicle().isEmpty();
    }

    public void addHas_vehicle(Vehicle newHas_vehicle) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_VEHICLE,
                                       newHas_vehicle);
    }

    public void removeHas_vehicle(Vehicle oldHas_vehicle) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_VEHICLE,
                                          oldHas_vehicle);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_weather
     */
     
    public Collection<? extends Weather> getHas_weather() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_WEATHER,
                                               DefaultWeather.class);
    }

    public boolean hasHas_weather() {
	   return !getHas_weather().isEmpty();
    }

    public void addHas_weather(Weather newHas_weather) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_WEATHER,
                                       newHas_weather);
    }

    public void removeHas_weather(Weather oldHas_weather) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_WEATHER,
                                          oldHas_weather);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_decision
     */
     
    public Collection<? extends Decision> getHas_decision() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_DECISION,
                                               DefaultDecision.class);
    }

    public boolean hasHas_decision() {
	   return !getHas_decision().isEmpty();
    }

    public void addHas_decision(Decision newHas_decision) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_DECISION,
                                       newHas_decision);
    }

    public void removeHas_decision(Decision oldHas_decision) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_DECISION,
                                          oldHas_decision);
    }


}

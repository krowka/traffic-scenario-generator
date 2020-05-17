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
 * Source Class: DefaultPet <br>
 * @version generated on Sun May 17 12:58:33 CEST 2020 by kamsz
 */
public class DefaultPet extends WrappedIndividualImpl implements Pet {

    public DefaultPet(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/animal_has_spieces
     */
     
    public Collection<? extends WrappedIndividual> getAnimal_has_spieces() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ANIMAL_HAS_SPIECES,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasAnimal_has_spieces() {
	   return !getAnimal_has_spieces().isEmpty();
    }

    public void addAnimal_has_spieces(WrappedIndividual newAnimal_has_spieces) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ANIMAL_HAS_SPIECES,
                                       newAnimal_has_spieces);
    }

    public void removeAnimal_has_spieces(WrappedIndividual oldAnimal_has_spieces) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ANIMAL_HAS_SPIECES,
                                          oldAnimal_has_spieces);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_at_the_back
     */
     
    public Collection<? extends Living_entity> getHas_at_the_back() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_AT_THE_BACK,
                                               DefaultLiving_entity.class);
    }

    public boolean hasHas_at_the_back() {
	   return !getHas_at_the_back().isEmpty();
    }

    public void addHas_at_the_back(Living_entity newHas_at_the_back) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_AT_THE_BACK,
                                       newHas_at_the_back);
    }

    public void removeHas_at_the_back(Living_entity oldHas_at_the_back) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_AT_THE_BACK,
                                          oldHas_at_the_back);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_in_the_front
     */
     
    public Collection<? extends Living_entity> getHas_in_the_front() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_IN_THE_FRONT,
                                               DefaultLiving_entity.class);
    }

    public boolean hasHas_in_the_front() {
	   return !getHas_in_the_front().isEmpty();
    }

    public void addHas_in_the_front(Living_entity newHas_in_the_front) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_IN_THE_FRONT,
                                       newHas_in_the_front);
    }

    public void removeHas_in_the_front(Living_entity oldHas_in_the_front) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_IN_THE_FRONT,
                                          oldHas_in_the_front);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_on_the_left
     */
     
    public Collection<? extends Non_living_entity> getHas_on_the_left() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_LEFT,
                                               DefaultNon_living_entity.class);
    }

    public boolean hasHas_on_the_left() {
	   return !getHas_on_the_left().isEmpty();
    }

    public void addHas_on_the_left(Non_living_entity newHas_on_the_left) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_LEFT,
                                       newHas_on_the_left);
    }

    public void removeHas_on_the_left(Non_living_entity oldHas_on_the_left) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_LEFT,
                                          oldHas_on_the_left);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_on_the_right
     */
     
    public Collection<? extends Non_living_entity> getHas_on_the_right() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_RIGHT,
                                               DefaultNon_living_entity.class);
    }

    public boolean hasHas_on_the_right() {
	   return !getHas_on_the_right().isEmpty();
    }

    public void addHas_on_the_right(Non_living_entity newHas_on_the_right) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_RIGHT,
                                       newHas_on_the_right);
    }

    public void removeHas_on_the_right(Non_living_entity oldHas_on_the_right) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_ON_THE_RIGHT,
                                          oldHas_on_the_right);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_within_close_distance
     */
     
    public Collection<? extends Living_entity> getHas_within_close_distance() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_CLOSE_DISTANCE,
                                               DefaultLiving_entity.class);
    }

    public boolean hasHas_within_close_distance() {
	   return !getHas_within_close_distance().isEmpty();
    }

    public void addHas_within_close_distance(Living_entity newHas_within_close_distance) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_CLOSE_DISTANCE,
                                       newHas_within_close_distance);
    }

    public void removeHas_within_close_distance(Living_entity oldHas_within_close_distance) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_CLOSE_DISTANCE,
                                          oldHas_within_close_distance);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_within_far_distance
     */
     
    public Collection<? extends Living_entity> getHas_within_far_distance() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_FAR_DISTANCE,
                                               DefaultLiving_entity.class);
    }

    public boolean hasHas_within_far_distance() {
	   return !getHas_within_far_distance().isEmpty();
    }

    public void addHas_within_far_distance(Living_entity newHas_within_far_distance) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_FAR_DISTANCE,
                                       newHas_within_far_distance);
    }

    public void removeHas_within_far_distance(Living_entity oldHas_within_far_distance) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_FAR_DISTANCE,
                                          oldHas_within_far_distance);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/has_within_very_close_distance
     */
     
    public Collection<? extends Non_living_entity> getHas_within_very_close_distance() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_VERY_CLOSE_DISTANCE,
                                               DefaultNon_living_entity.class);
    }

    public boolean hasHas_within_very_close_distance() {
	   return !getHas_within_very_close_distance().isEmpty();
    }

    public void addHas_within_very_close_distance(Non_living_entity newHas_within_very_close_distance) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_VERY_CLOSE_DISTANCE,
                                       newHas_within_very_close_distance);
    }

    public void removeHas_within_very_close_distance(Non_living_entity oldHas_within_very_close_distance) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_WITHIN_VERY_CLOSE_DISTANCE,
                                          oldHas_within_very_close_distance);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/animal_has_species
     */
     
    public Collection<? extends String> getAnimal_has_species() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ANIMAL_HAS_SPECIES, String.class);
    }

    public boolean hasAnimal_has_species() {
		return !getAnimal_has_species().isEmpty();
    }

    public void addAnimal_has_species(String newAnimal_has_species) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ANIMAL_HAS_SPECIES, newAnimal_has_species);
    }

    public void removeAnimal_has_species(String oldAnimal_has_species) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ANIMAL_HAS_SPECIES, oldAnimal_has_species);
    }


}

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public abstract class ScenarioGenerator {
    OWLOntologyManager manager;
    OWLOntology ontology;
    OWLDataFactory dataFactory;
    OWLReasoner reasoner;
    String baseIRI;

    String scenarioNr = "1";
    Map<String, Integer> idMap = new HashMap<>();

    public ScenarioGenerator(OWLOntologyManager manager, OWLOntology ontology, OWLDataFactory dataFactory, OWLReasoner reasoner,  String baseIRI) {
        this.manager = manager;
        this.ontology = ontology;
        this.dataFactory = dataFactory;
        this.baseIRI = baseIRI;
        this.reasoner = reasoner;
    }

    public abstract void generate();

    protected OWLIndividual getIndividual(String name) {
        OWLClass iClass = dataFactory.getOWLClass(IRI.create(baseIRI + name));
        OWLIndividual individual = dataFactory.getOWLNamedIndividual(getUniqueIRI(name));

        // sets individual's type as iClass
        OWLClassAssertionAxiom ax = dataFactory.getOWLClassAssertionAxiom(iClass, individual);
        manager.addAxiom(ontology, ax);

        return individual;
    }

    protected void addObjectPropertyAssertion(String objectProperty, OWLIndividual individual_1, OWLIndividual individual_2) {
        OWLObjectProperty owlObjectProperty = dataFactory.getOWLObjectProperty(IRI.create(baseIRI +  objectProperty));
        OWLObjectPropertyAssertionAxiom ax = dataFactory.getOWLObjectPropertyAssertionAxiom(owlObjectProperty, individual_1, individual_2);
        manager.addAxiom(ontology, ax);
    }

    protected void addDataPropertyAssertion(String dataProperty, OWLIndividual individual, int value) {
        OWLDataProperty owlDataProperty = dataFactory.getOWLDataProperty(IRI.create(baseIRI +  dataProperty));
        OWLDataPropertyAssertionAxiom ax = dataFactory.getOWLDataPropertyAssertionAxiom(owlDataProperty, individual, value);
        manager.addAxiom(ontology, ax);
    }


    protected IRI getUniqueIRI(String name) {
        int id = idMap.getOrDefault(name, 0) + 1;
        idMap.put(name, id);
        return IRI.create(baseIRI + name + "_" + scenarioNr + "_" + id);
    }

    protected OWLClass getRandomSubclass(String owlClass) {
        OWLClass vehicle = dataFactory.getOWLClass(IRI.create(baseIRI + "vehicle"));
        Set<OWLClass> subclasses = reasoner.getSubClasses(vehicle, true).getFlattened();
        List<OWLClass> subclassesList = new ArrayList<>(subclasses);
        Random rand = new Random();
        int index = rand.nextInt(subclassesList.size());
        return subclassesList.get(index);
    }
}

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
    Configuration cfg;
    Random rand = new Random();

    int scenarioNr = 0;
    Map<String, Integer> idMap = new HashMap<>();

    public ScenarioGenerator(Configuration configuration) {
        this.cfg = configuration;
    }

    public abstract void generate(int num);

    protected void setup() {
        scenarioNr++;
        idMap.clear();
    }

    protected OWLIndividual getIndividual(String name) {
        String iriName = cfg.getBaseIRI() + name;
        OWLDataFactory dataFactory = cfg.getDataFactory();

        OWLClass iClass = dataFactory.getOWLClass(IRI.create(iriName));
        OWLIndividual individual = dataFactory.getOWLNamedIndividual(getUniqueIRI(name));

        // sets individual's type as iClass
        OWLClassAssertionAxiom ax = dataFactory.getOWLClassAssertionAxiom(iClass, individual);
        cfg.getManager().addAxiom(cfg.getOntology(), ax);

        return individual;
    }

    protected OWLIndividual getSubclassIndividual(String name) {
        String iriName = cfg.getBaseIRI() + name;
        OWLDataFactory dataFactory = cfg.getDataFactory();

        OWLClass iClass = dataFactory.getOWLClass(IRI.create(iriName));
        List<OWLClass> subclassesList = new ArrayList<>(cfg.getReasoner().getSubClasses(iClass, true).getFlattened());

        OWLIndividual individual = dataFactory.getOWLNamedIndividual(getUniqueIRI(name));

        OWLClass chosenClass = subclassesList.get(rand.nextInt(subclassesList.size()));

        // sets individual's type as iClass
        OWLClassAssertionAxiom ax = dataFactory.getOWLClassAssertionAxiom(chosenClass, individual);
        cfg.getManager().addAxiom(cfg.getOntology(), ax);

        return individual;
    }

    protected void addObjectPropertyAssertion(String objectProperty, OWLIndividual individual_1, OWLIndividual individual_2) {
        String iriName = cfg.getBaseIRI() + objectProperty;
        OWLDataFactory dataFactory = cfg.getDataFactory();
        OWLObjectProperty owlObjectProperty = dataFactory.getOWLObjectProperty(IRI.create(iriName));
        OWLObjectPropertyAssertionAxiom ax = dataFactory.getOWLObjectPropertyAssertionAxiom(owlObjectProperty, individual_1, individual_2);
        cfg.getManager().addAxiom(cfg.getOntology(), ax);
    }

    protected void addDataPropertyAssertion(String dataProperty, OWLIndividual individual, int value) {
        String iriName = cfg.getBaseIRI() + dataProperty;
        OWLDataFactory dataFactory = cfg.getDataFactory();
        OWLDataProperty owlDataProperty = dataFactory.getOWLDataProperty(IRI.create(iriName));
        OWLDataPropertyAssertionAxiom ax = dataFactory.getOWLDataPropertyAssertionAxiom(owlDataProperty, individual, value);
        cfg.getManager().addAxiom(cfg.getOntology(), ax);
    }

    protected IRI getUniqueIRI(String name) {
        int id = idMap.getOrDefault(name, 0) + 1;
        idMap.put(name, id);
        return IRI.create(cfg.getBaseIRI() + name + "_" + scenarioNr + "_" + id);
    }
}

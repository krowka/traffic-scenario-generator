import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

public class Configuration {
    private OWLOntologyManager manager;
    private OWLOntology ontology;
    private OWLDataFactory dataFactory;
    private OWLReasoner reasoner;
    private String baseIRI;

    public Configuration(OWLOntologyManager manager, OWLOntology ontology, OWLDataFactory dataFactory, OWLReasoner reasoner, String baseIRI) {
        this.manager = manager;
        this.ontology = ontology;
        this.dataFactory = dataFactory;
        this.reasoner = reasoner;
        this.baseIRI = baseIRI;
    }

    public OWLOntologyManager getManager() {
        return manager;
    }

    public void setManager(OWLOntologyManager manager) {
        this.manager = manager;
    }

    public OWLOntology getOntology() {
        return ontology;
    }

    public void setOntology(OWLOntology ontology) {
        this.ontology = ontology;
    }

    public OWLDataFactory getDataFactory() {
        return dataFactory;
    }

    public void setDataFactory(OWLDataFactory dataFactory) {
        this.dataFactory = dataFactory;
    }

    public OWLReasoner getReasoner() {
        return reasoner;
    }

    public void setReasoner(OWLReasoner reasoner) {
        this.reasoner = reasoner;
    }

    public String getBaseIRI() {
        return baseIRI;
    }

    public void setBaseIRI(String baseIRI) {
        this.baseIRI = baseIRI;
    }
}

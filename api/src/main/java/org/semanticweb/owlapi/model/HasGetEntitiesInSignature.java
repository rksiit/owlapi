package org.semanticweb.owlapi.model;

import java.util.Set;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group Date: 18/02/2014
 */
public interface HasGetEntitiesInSignature {

    Set<OWLEntity> getEntitiesInSignature(IRI entityIRI);
}

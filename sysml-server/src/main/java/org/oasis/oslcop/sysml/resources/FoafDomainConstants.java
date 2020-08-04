// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *     Michael Fiedler      - Bugzilla adpater implementations
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 * 
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.oasis.oslcop.sysml.resources;

import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.oasis.oslcop.sysml.resources.FoafVocabularyConstants;

// Start of user code imports
// End of user code

public interface FoafDomainConstants
{
    // Start of user code user constants
    // End of user code

    public static String FOAF_DOMAIN = "http://xmlns.com/foaf/0.1/#";
    public static String FOAF_NAMSPACE = "http://xmlns.com/foaf/0.1/#";
    public static String FOAF_NAMSPACE_PREFIX = "foaf";

    public static String AGENT_PATH = "agent";
    public static String AGENT_NAMESPACE = FoafVocabularyConstants.FOAF_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String AGENT_LOCALNAME = "Agent"; //localName of the rdfs:class the resource describes
    public static String AGENT_TYPE = AGENT_NAMESPACE + AGENT_LOCALNAME; //fullname of the rdfs:class the resource describes
    public static String PERSON_PATH = "person";
    public static String PERSON_NAMESPACE = FoafVocabularyConstants.FOAF_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String PERSON_LOCALNAME = "Person"; //localName of the rdfs:class the resource describes
    public static String PERSON_TYPE = PERSON_NAMESPACE + PERSON_LOCALNAME; //fullname of the rdfs:class the resource describes
}
